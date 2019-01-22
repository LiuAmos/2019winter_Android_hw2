package com.example.amos.hw2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    EditText text_h;
    EditText text_w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //指定XML的ID給變數
        btn1=findViewById(R.id.button1);
        text_h=findViewById(R.id.height);
        text_w=findViewById(R.id.weight);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Main2Activity.class);

                Bundle bundle = new Bundle();
                bundle.putString("key1",text_h.getText().toString());//key1是activity2要取得時要用的
                bundle.putString("key2",text_w.getText().toString());

                intent.putExtras(bundle);

                startActivity(intent);


            }
        });

    }
}
