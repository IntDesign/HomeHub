package com.intDesign.homeHub.infrastructure.repositories;

import androidx.lifecycle.MutableLiveData;

import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.api.Response;
import com.apollographql.apollo.exception.ApolloException;
import com.intDesign.homeHub.core.models.LoginResponse;
import com.intDesign.homeHub.infrastructure.graphql.GraphQlClient;
import com.intDesign.homeHub.infrastructure.graphql.mutations.LoginRequestMutation;
import com.intDesign.homeHub.infrastructure.graphql.types.LoginCreateViewModel;

import org.jetbrains.annotations.NotNull;

public class LoginRepository {
    private LoginResponse temporaryData;

    private LoginRepository() {
        temporaryData = new LoginResponse();
    }

    private static final LoginRepository instance = new LoginRepository();

    public static LoginRepository getInstance() {
        return instance;
    }

    public MutableLiveData<LoginResponse> getResponse() {
        MutableLiveData<LoginResponse> data = new MutableLiveData<>();
        data.setValue(temporaryData);
        return data;
    }

    public void sendLoginRequest(String username, String password){
        GraphQlClient.getClient().mutate(LoginRequestMutation.builder()
                .request(
                        LoginCreateViewModel.builder().account(username).password(password).build())
                .build()).enqueue(new ApolloCall.Callback<LoginRequestMutation.Data>() {
            @Override
            public void onResponse(@NotNull Response<LoginRequestMutation.Data> response) {
                temporaryData.setError(response.data().login().sendLogin().error());
                temporaryData.setUserId(response.data().login().sendLogin().userId());
                temporaryData.setSuccessful(response.data().login().sendLogin().isSuccessful());
            }

            @Override
            public void onFailure(@NotNull ApolloException e) {

            }
        });
    }
}
