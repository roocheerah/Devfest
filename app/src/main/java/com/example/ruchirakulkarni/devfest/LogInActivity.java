package com.example.ruchirakulkarni.devfest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {
    public final static String USERNAME = "com.example.ruchirakulkarni.devfest.USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        Button joinButton = (Button) findViewById(R.id.joinButton);
        joinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this, MainActivity.class);
                EditText editText = (EditText) findViewById(R.id.editTextName);
                String username = editText.getText().toString();
                intent.putExtra(USERNAME, username);
                startActivity(intent);
            }

        });
    }
}
