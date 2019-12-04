package com.intDesign.homeHub.presentation.ui.register;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.intDesign.homeHub.R;
import com.intDesign.homeHub.presentation.ui.register.tasks.RegisterTask;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        Button registerButton = findViewById(R.id.register_add_user_button);
        EditText username = findViewById(R.id.register_username);
        EditText password = findViewById(R.id.register_password);
        EditText email = findViewById(R.id.register_email);
        EditText confirmPassword = findViewById(R.id.register_confirm_password);
        TextView backLabel = findViewById(R.id.register_back_to_login);

        registerButton.setOnClickListener(v -> {
            String passwordValue = password.getText().toString();
            String confirmValue = confirmPassword.getText().toString();
            String emailValue = email.getText().toString();
            String usernameValue = username.getText().toString();

            if (!passwordValue.equals(confirmValue)) {
                Toast.makeText(this, "Password does not match with Confirm Password", Toast.LENGTH_LONG).show();
            } else if (passwordValue.isEmpty() || confirmValue.isEmpty() || emailValue.isEmpty() || usernameValue.isEmpty()) {
                Toast.makeText(this, "Make sure you completed all the fields", Toast.LENGTH_LONG).show();
            } else
                runOnUiThread(() -> new RegisterTask(this, passwordValue, emailValue, usernameValue).execute());

        });

    }

}
