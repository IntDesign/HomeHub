package com.intDesign.homeHub.presentation.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.intDesign.homeHub.R;
import com.intDesign.homeHub.core.models.LoginResponse;
import com.intDesign.homeHub.presentation.ui.login.tasks.LoginTask;
import com.intDesign.homeHub.presentation.ui.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity {
    private LoginResponse loginResponse = new LoginResponse();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Button loginButton = findViewById(R.id.loginButtonId);
        Button registerButton = findViewById(R.id.register_button);

        loginButton.setOnClickListener(v -> {
            TextView account = findViewById(R.id.usernameTextBoxId);
            TextView password = findViewById(R.id.passwordTextBoxId);
            LoginTask loginTask = new LoginTask(this, account.getText().toString(), password.getText().toString());
            runOnUiThread(loginTask::execute);
        });


        registerButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}
