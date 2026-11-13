package com.amit.glassapp;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnLogin).setOnClickListener(v -> {
            Toast.makeText(this, "Glass UI is Ready!", Toast.LENGTH_SHORT).show();
        });
    }
}
