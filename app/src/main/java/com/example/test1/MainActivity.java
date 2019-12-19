package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "InitiateApp";

    String name,email;
    int favouriteNumber;

    EditText nameInput;
    EditText emailInput;
    EditText favouriteNumberInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        favouriteNumberInput = (EditText) findViewById(R.id.FavoutiteNumerInput);
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                favouriteNumber = Integer.valueOf(favouriteNumberInput.getText().toString());
                showToast(name);
                showToast(email);
                showToast(String.valueOf(favouriteNumber));
            }
        });

        // 1. get the button
        Button btn = (Button) findViewById(R.id.button);
        // 2. what happens when user clicks
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "This is a new log message!");
                Toast.makeText(getApplicationContext(), "new Message!", Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void showToast(String text) {
        Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
    }
}
