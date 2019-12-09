package com.example.diagnosticomedico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class FiebreTifoidea extends AppCompatActivity {

    private CheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11;
    public TextView tv1;
    public double b=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiebre_tifoidea);

        ch1=(CheckBox)findViewById(R.id.c1);
        ch2=(CheckBox)findViewById(R.id.c2);
        ch3=(CheckBox)findViewById(R.id.c3);
        ch4=(CheckBox)findViewById(R.id.c4);
        ch5=(CheckBox)findViewById(R.id.c5);
        ch6=(CheckBox)findViewById(R.id.c6);
        ch7=(CheckBox)findViewById(R.id.c7);
        ch8=(CheckBox)findViewById(R.id.c8);
        ch9=(CheckBox)findViewById(R.id.c9);
        ch10=(CheckBox)findViewById(R.id.c10);
        ch11=(CheckBox)findViewById(R.id.c11);

        tv1=(TextView)findViewById(R.id.tv);
    }
    public void calcu(View view){
        if (ch1.isChecked()){
            b=b+20;
        }else{
            b=b-20;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }
    public void calcu2(View view){
        if (ch2.isChecked()){
            b=b+2;
        }else{
            b=b-2;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }
    public void calcu3(View view){
        if (ch3.isChecked()){
            b=b+3;
        }else{
            b=b-3;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }
    public void calcu4(View view){
        if (ch4.isChecked()){
            b=b+3;
        }else{
            b=b-3;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }
    public void calcu5(View view){
        if (ch5.isChecked()){
            b=b+10;
        }else{
            b=b-10;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }
    public void calcu6(View view){
        if (ch6.isChecked()){
            b=b+2;
        }else{
            b=b-2;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }
    public void calcu7(View view){
        if (ch7.isChecked()){
            b=b+10;
        }else{
            b=b-10;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }
    public void calcu8(View view){
        if (ch8.isChecked()){
            b=b+15;
        }else{
            b=b-15;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }
    public void calcu9(View view){
        if (ch9.isChecked()){
            b=b+5;
        }else{
            b=b-5;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }
    public void calcu10(View view){
        if (ch10.isChecked()){
            b=b+20;
        }else{
            b=b-20;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }
    public void calcu11(View view){
        if (ch11.isChecked()){
            b=b+10;
        }else{
            b=b-10;
        }
        tv1.setText("Usted tiene una probabilidad de "+String.valueOf(b)+"% de tener Fiebre Tifoidea");
    }

    public void volver(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void natutifo(View view) {
        Intent intent = new Intent(getApplicationContext(), natutifo.class);
        startActivity(intent);
    }
    public void meditifo(View view) {
        Intent intent = new Intent(getApplicationContext(), meditifo.class);
        startActivity(intent);
    }
}