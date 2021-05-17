package com.example.th2_phangiathong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.th2_phangiathong.model.PTB1;

public class GiaoDienPTB1 extends AppCompatActivity {
    EditText hsa, hsb, x;
    Button btngiai, btnlamlai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_giaodienb1);
        hsa=(EditText)findViewById(R.id.txta);
        hsb=(EditText)findViewById(R.id.txtb);
        x=(EditText)findViewById(R.id.txtx);
        btngiai=(Button)findViewById(R.id.btngiai);
        btnlamlai=(Button)findViewById(R.id.btnlamlai);
        //Chặn người dụng nhập
        x.setEnabled(false);
        //Bắt sự kiện
        btngiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hsa.getText().toString().trim().equalsIgnoreCase("")) {
                    hsa.setError("Hệ số a không được để trống !");
                }else if(hsb.getText().toString().trim().equalsIgnoreCase("")) {
                    hsb.setError("Hệ số b không được để trống !");
                }else {
                    //Lấy giá trị người dùng nhập
                    float a = Float.parseFloat(hsa.getText().toString());
                    float b= Float.parseFloat(hsb.getText().toString());
                    //Gọi contructer
                    PTB1 pt = new PTB1(a,b);
                    //Giải phương trình
                    x.setText(pt.giaiPT());
                }

            }
        });

        btnlamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hsa.setText("");
                hsb.setText("");
                x.setText("");
                hsa.requestFocus();
            }
        });
    }
}