package com.example.diagnosticomedico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Gripe extends AppCompatActivity {

    private CheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7;
    public TextView tv1;
    public double b=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gripe);

        ch1=(CheckBox)findViewById(R.id.c1);
        ch2=(CheckBox)findViewById(R.id.c2);
        ch3=(CheckBox)findViewById(R.id.c3);
        ch4=(CheckBox)findViewById(R.id.c4);
        ch5=(CheckBox)findViewById(R.id.c5);
        ch6=(CheckBox)findViewById(R.id.c6);
        ch7=(CheckBox)findViewById(R.id.c7);

        tv1=(TextView)findViewById(R.id.tv);
    }
    public void calcu(View view){
        if (ch1.isChecked()){
            b=b+20;
        }else{
            b=b-20;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Gripe");
    }
    public void calcu2(View view){
        if (ch2.isChecked()){
            b=b+5;
        }else{
            b=b-5;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Gripe");
    }
    public void calcu3(View view){
        if (ch3.isChecked()){
            b=b+15;
        }else{
            b=b-15;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Gripe");
    }
    public void calcu4(View view){
        if (ch4.isChecked()){
            b=b+5;
        }else{
            b=b-5;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Gripe");
    }
    public void calcu5(View view){
        if (ch5.isChecked()){
            b=b+5;
        }else{
            b=b-5;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Gripe");
    }
    public void calcu6(View view){
        if (ch6.isChecked()){
            b=b+30;
        }else{
            b=b-30;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Gripe");
    }
    public void calcu7(View view){
        if (ch7.isChecked()){
            b=b+20;
        }else{
            b=b-20;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Gripe");
    }


    public void volver(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }


    public void natugripe(View view) {
        Intent intent = new Intent(getApplicationContext(), natugripe.class);
        startActivity(intent);
    }
    public void medigripe(View view) {
        Intent intent = new Intent(getApplicationContext(), medigripe.class);
        startActivity(intent);
    }

}
