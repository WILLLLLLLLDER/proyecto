package com.example.diagnosticomedico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class medigripe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medigripe);
    }

    public void natugripe(View view) {
        Intent intent = new Intent(getApplicationContext(), natugripe.class);
        startActivity(intent);
    }

    public void volver(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
