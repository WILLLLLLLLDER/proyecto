package com.example.diagnosticomedico;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int v1, v2, v3, v4, v5;
    private TextView tv1;
    Dialog MyDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDialog=new Dialog(this);
    }

    public void pre1(View view){
        TextView txtclose;
        Button follow;
        MyDialog.setContentView(R.layout.pre1);
        txtclose=(TextView)MyDialog.findViewById(R.id.txtclose);
        follow=(Button)MyDialog.findViewById(R.id.btn);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog.dismiss();
            }
        });
        MyDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        MyDialog.show();

    }
    public void gripe(View view) {
        Intent intent = new Intent(getApplicationContext(), Gripe.class);
        startActivity(intent);
    }

    public void pre2(View view){
        TextView txtclose;
        Button follow;
        MyDialog.setContentView(R.layout.pre2);
        txtclose=(TextView)MyDialog.findViewById(R.id.txtclose);
        follow=(Button)MyDialog.findViewById(R.id.btn);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog.dismiss();
            }
        });
        MyDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        MyDialog.show();

    }
    public void diarrea(View view) {
        Intent intent = new Intent(getApplicationContext(), Diarrea.class);
        startActivity(intent);
    }

    public void pre3(View view){
        TextView txtclose;
        Button follow;
        MyDialog.setContentView(R.layout.pre3);
        txtclose=(TextView)MyDialog.findViewById(R.id.txtclose);
        follow=(Button)MyDialog.findViewById(R.id.btn);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog.dismiss();
            }
        });
        MyDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        MyDialog.show();

    }
    public void tuberculosis(View view) {
        Intent intent = new Intent(getApplicationContext(), Tuberculosis.class);
        startActivity(intent);
    }

    public void pre4(View view){
        TextView txtclose;
        Button follow;
        MyDialog.setContentView(R.layout.pre4);
        txtclose=(TextView)MyDialog.findViewById(R.id.txtclose);
        follow=(Button)MyDialog.findViewById(R.id.btn);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog.dismiss();
            }
        });
        MyDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        MyDialog.show();

    }
    public void gastritis(View view) {
        Intent intent = new Intent(getApplicationContext(), Gastritis.class);
        startActivity(intent);
    }

    public void pre5(View view){
        TextView txtclose;
        Button follow;
        MyDialog.setContentView(R.layout.pre5);
        txtclose=(TextView)MyDialog.findViewById(R.id.txtclose);
        follow=(Button)MyDialog.findViewById(R.id.btn);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog.dismiss();
            }
        });
        MyDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        MyDialog.show();

    }
    public void FiebreTifoidea(View view) {
        Intent intent = new Intent(getApplicationContext(), FiebreTifoidea.class);
        startActivity(intent);
    }

    public void noenfermo(View view){
        TextView txtclose;
        Button follow;
        MyDialog.setContentView(R.layout.noenfermo);
        txtclose=(TextView)MyDialog.findViewById(R.id.txtclose);
        follow=(Button)MyDialog.findViewById(R.id.btn);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog.dismiss();
            }
        });
        MyDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        MyDialog.show();

    }
    public void volver(View view){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }



}