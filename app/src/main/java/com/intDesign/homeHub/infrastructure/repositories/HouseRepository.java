package com.intDesign.homeHub.infrastructure.repositories;


import androidx.lifecycle.MutableLiveData;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;
import com.intDesign.homeHub.core.models.House;
import com.intDesign.homeHub.infrastructure.graphql.GraphQlClient;
import com.intDesign.homeHub.infrastructure.graphql.queries.SearchHousesQuery;
import com.intDesign.homeHub.infrastructure.graphql.types.OrderType;
import com.intDesign.homeHub.infrastructure.graphql.types.OrderedRequestType;
import com.intDesign.homeHub.infrastructure.graphql.types.PagedRequestType;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HouseRepository {
    private ArrayList<House> temporaryData;

    private HouseRepository() {
        temporaryData = new ArrayList<>();
    }

    private static final HouseRepository instance = new HouseRepository();

    public static HouseRepository getInstance() {
        return instance;
    }

    public MutableLiveData<ArrayList<House>> searchHouses() {
        MutableLiveData<ArrayList<House>> data = new MutableLiveData<>();
        data.setValue(temporaryData);
        return data;
    }

    public void fetchData(int take, int offset, String orderBy, OrderType orderType) {
        temporaryData = sendSearchHouseRequest(take, offset, orderBy, orderType);
    }

    private ArrayList<House> sendSearchHouseRequest(int take, int offset, String orderBy, OrderType orderType) {
        final ArrayList<House> houses = new ArrayList<>();
        GraphQlClient.getClient().query(SearchHousesQuery.builder()
                .pagination(PagedRequestType.builder().take(take).offset(offset).build())
                .ordering(OrderedRequestType.builder().orderBy(orderBy).orderDirection(orderType).build())
                .build())
                .enqueue(new ApolloCall.Callback<SearchHousesQuery.Data>() {
                    @Override
                    public void onResponse(@NotNull final Response<SearchHousesQuery.Data> response) {
                        try {
                            List<SearchHousesQuery.Item> items = response.data().house().search().items();
                            for (SearchHousesQuery.Item item : items) {
                                House house = new House();
                                house.setId(UUID.fromString(item.id()));
                                house.setHouseAddress(item.houseAddress());
                                house.setOwnerEmail(item.ownerEmail());
                                house.setOwnerName(item.ownerName());
                                house.setOwnerPhone(item.ownerPhone());
                                houses.add(house);
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }

                    @Override
                    public void onFailure(@NotNull ApolloException e) {

                    }
                });
        return houses;
    }
}
