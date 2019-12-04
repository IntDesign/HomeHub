package com.intDesign.homeHub.presentation.ui.register.tasks;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.intDesign.homeHub.infrastructure.repositories.UserRepository;
import com.intDesign.homeHub.presentation.ui.login.LoginActivity;

public class RegisterTask extends AsyncTask<Void, Void, Void> {
    private String passwordValue;
    private String emailValue;
    private String usernameValue;
    @SuppressLint("StaticFieldLeak")
    private AppCompatActivity context;

    public RegisterTask(AppCompatActivity context, String password, String email, String username) {
        this.context = context;
        passwordValue = password;
        emailValue = email;
        usernameValue = username;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        UserRepository.getInstance().addUser(usernameValue, emailValue, passwordValue);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    protected void onPostExecute(Void aVoid) {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (UserRepository.getInstance().getRegisterResponse().getValue()) {
            context.runOnUiThread(() -> {
                Intent intent = new Intent(context, LoginActivity.class);
                context.startActivity(intent);
            });
        } else {
            Toast.makeText(context, "Could not create user with your data. " +
                    "Somebody might be already using the email or username", Toast.LENGTH_LONG).show();
        }
    }
}
