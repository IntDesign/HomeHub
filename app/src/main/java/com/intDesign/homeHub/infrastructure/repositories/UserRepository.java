package com.intDesign.homeHub.infrastructure.repositories;

import androidx.lifecycle.MutableLiveData;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;
import com.intDesign.homeHub.infrastructure.graphql.GraphQlClient;
import com.intDesign.homeHub.infrastructure.graphql.mutations.AddUserMutation;
import com.intDesign.homeHub.infrastructure.graphql.types.UserCreateViewModel;

import org.jetbrains.annotations.NotNull;

public class UserRepository {
    private static final UserRepository instance = new UserRepository();
    private boolean isSuccesfull = false;

    public static UserRepository getInstance() {
        return instance;
    }

    public MutableLiveData<Boolean> getRegisterResponse() {
        MutableLiveData<Boolean> data = new MutableLiveData<>();
        data.setValue(isSuccesfull);
        return data;
    }

    public void addUser(String username, String email, String password) {
        GraphQlClient.getClient().mutate(AddUserMutation.builder()
                .user(
                        UserCreateViewModel.builder().username(username).email(email).password(password).build())
                .build())
                .enqueue(new ApolloCall.Callback<AddUserMutation.Data>() {
                    @Override
                    public void onResponse(@NotNull Response<AddUserMutation.Data> response) {
                        isSuccesfull = true;
                    }

                    @Override
                    public void onFailure(@NotNull ApolloException e) {
                        isSuccesfull = false;
                    }
                });
    }
}
