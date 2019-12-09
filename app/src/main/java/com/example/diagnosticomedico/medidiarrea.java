package com.example.diagnosticomedico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class medidiarrea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medidiarrea);
    }
    public void natudiarrea(View view) {
        Intent intent = new Intent(getApplicationContext(), natudiarrea.class);
        startActivity(intent);
    }

    public void volver(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
