package com.intDesign.homeHub.presentation.ui.login.tasks;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.intDesign.homeHub.core.models.LoginResponse;
import com.intDesign.homeHub.infrastructure.repositories.LoginRepository;
import com.intDesign.homeHub.presentation.MainActivity;

public class LoginTask extends AsyncTask<Void, Void, Void> {
    private String user;
    private String password;
    private LoginResponse response;
    @SuppressLint("StaticFieldLeak")
    private AppCompatActivity context;

    public LoginTask(AppCompatActivity context, String user, String password) {
        this.user = user;
        this.password = password;
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        response = new LoginResponse();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        LoginRepository.getInstance().sendLoginRequest(user, password);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        response = LoginRepository.getInstance().getResponse().getValue();
        context.runOnUiThread(() -> {
            if (response.isSuccessful()) {
                Intent intent = new Intent(context, MainActivity.class);
                intent.putExtra("userId", response.getUserId());
                context.startActivity(intent);
            } else {
                Toast.makeText(context, response.getError(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
