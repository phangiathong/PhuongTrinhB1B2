package com.example.th2_phangiathong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class GiaoDienChinh extends AppCompatActivity {
    TextView click_ptb1, click_ptb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_giaodienchinh);
        Log.d("onCreate", "Thứ 1");
        click_ptb1 = (TextView)findViewById(R.id.click_ptb1);
        click_ptb2 = (TextView)findViewById(R.id.click_ptb2);

        click_ptb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent để show màn hình được chỉ định.
                Intent in=new Intent(getApplicationContext(), GiaoDienPTB1.class);
                startActivity(in); //Lệnh này để thực hiện.
            }
        });
        click_ptb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent để show màn hình được chỉ định.
                Intent in=new Intent(getApplicationContext(), GiaoDienPTB2.class);
                startActivity(in); //Lệnh này để thực hiện.
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onCreate", "Thứ 2");
        click_ptb1.setText("ax + b = 0");
    }
}