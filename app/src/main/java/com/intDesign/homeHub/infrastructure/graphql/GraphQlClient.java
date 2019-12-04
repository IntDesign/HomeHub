package com.intDesign.homeHub.infrastructure.graphql;

import com.apollographql.apollo.ApolloClient;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

public class GraphQlClient {
    private static final String serverUrl = "http://192.168.1.104:5000/graphql";

    private static ApolloClient client;

    public static ApolloClient getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();
        client = ApolloClient.builder()
                .serverUrl(serverUrl)
                .okHttpClient(okHttpClient)
                .build();
        return client;
    }
}
