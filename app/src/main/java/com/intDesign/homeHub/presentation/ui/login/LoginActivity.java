package com.intDesign.homeHub.presentation.ui.login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.intDesign.homeHub.R;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        Button loginButton = findViewById(R.id.loginButtonId);
        Button registerButton = findViewById(R.id.registerButtonId);

        loginButton.setOnClickListener(v -> {
            TextView account = findViewById(R.id.usernameTextBoxId);
            TextView password = findViewById(R.id.passwordTextBoxId);

        });

        registerButton.setOnClickListener(v -> {

        });
    }
}
