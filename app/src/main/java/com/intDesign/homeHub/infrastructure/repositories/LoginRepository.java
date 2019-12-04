package com.intDesign.homeHub.infrastructure.repositories;

import com.intDesign.homeHub.core.models.User;

import java.util.ArrayList;

public class LoginRepository {
    private User temporaryData;

    private LoginRepository() {
        temporaryData = new User();
    }

    private static final LoginRepository instance = new LoginRepository();

    public static final LoginRepository getInstance() {
        return instance;
    }

    public void sendLoginRequest(String username, String password){

    }
}
