package com.intDesign.homeHub.infrastructure.graphql;

import com.apollographql.apollo.ApolloClient;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class GraphQlClient {
    private static final String serverUrl = "http://husovschi.go.ro:5000/graphql";

    public static ApolloClient getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
        return ApolloClient.builder()
                .serverUrl(serverUrl)
                .okHttpClient(okHttpClient)
                .build();
    }
}
