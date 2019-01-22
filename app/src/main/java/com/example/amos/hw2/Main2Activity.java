package com.example.amos.hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {

    TextView BMI;
    float h;
    float h2;
    float w;
    float bmi;
    private String str_bmi;
    private String message="標準";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BMI=findViewById(R.id.result);

        Bundle bundle = getIntent().getExtras();

        String temp_h = bundle.getString("key1");
        String temp_w = bundle.getString("key2");

        h=Float.parseFloat(temp_h);
        w=Float.parseFloat(temp_w);
        h2=h/100;

        bmi=w/(h2*h2);
        str_bmi=Float.toString(bmi);

        BMI.setText("你的BMI是"+str_bmi);

        if(bmi<18.5){
            message="過輕";
        }

        if(bmi>25){
            message="過重";
        }

        Toast.makeText(Main2Activity.this,message,Toast.LENGTH_LONG).show();

    }
}
