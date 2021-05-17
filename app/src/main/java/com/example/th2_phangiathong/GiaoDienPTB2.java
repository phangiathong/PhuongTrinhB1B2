package com.example.th2_phangiathong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.th2_phangiathong.model.PTB2;

public class GiaoDienPTB2 extends AppCompatActivity {
    TextView hsa, hsb, hsc, x;
    Button btngiai, btnlamlai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_giaodienb2);
        hsa = (EditText)findViewById(R.id.txthsa);
        hsb = (EditText)findViewById(R.id.txthsb);
        hsc = (EditText)findViewById(R.id.txthsc);
        x = (EditText)findViewById(R.id.txthesox);
        btngiai = (Button)findViewById(R.id.btn_giaib2);
        btnlamlai = (Button)findViewById(R.id.btn_lamlai);
        x.setEnabled(false);

        btngiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hsa.getText().toString().trim().equalsIgnoreCase("")) {
                    hsa.setError("Hệ số a không để trống !");
                } else if (hsb.getText().toString().trim().equalsIgnoreCase("")) {
                    hsb.setError("Hệ số b không để trống !");
                } else if (hsc.getText().toString().trim().equalsIgnoreCase("")) {
                    hsc.setError("Hệ số c không để trống !");
                } else {
                    float a = Float.parseFloat(hsa.getText().toString());
                    float b = Float.parseFloat(hsb.getText().toString());
                    float c = Float.parseFloat(hsc.getText().toString());
                    PTB2 b2 = new PTB2(a, b, c);
                    x.setText(b2.giaiPTB2());
                }
            }
        });
        btnlamlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hsa.setText("");
                hsb.setText("");
                hsc.setText("");
                x.setText("");
                hsa.requestFocus();
            }
        });
    }
}