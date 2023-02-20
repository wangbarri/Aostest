package com.example.buillld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView(); // 리소스 위를 얻음

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int random1 = random.nextInt(45) + 1; //1이상 ~ 46 미만
                int random2 = random.nextInt(45) + 1; //1이상 ~ 46 미만
                int random3 = random.nextInt(45) + 1; //1이상 ~ 46 미만
                int random4 = random.nextInt(45) + 1; //1이상 ~ 46 미만
                int random5 = random.nextInt(45) + 1; //1이상 ~ 46 미만
                int random6 = random.nextInt(45) + 1; //1이상 ~ 46 미만


                tv1.setText("" + random1);
                tv2.setText("" + random2);
                tv3.setText("" + random3);
                tv4.setText("" + random4);
                tv5.setText("" + random5);
                tv6.setText("" + random6);



            }
        });
    }

    private void initView(){
        button = findViewById(R.id.button);
        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);
        tv6 = findViewById(R.id.textView6);
    }
}