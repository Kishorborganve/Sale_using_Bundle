package com.sale.saleusingbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Pin_Activity extends AppCompatActivity {

    TextView txtCardname;
    TextView txtExpname;
    TextView txtPin;
    EditText etPwd;
    Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        txtCardname = findViewById(R.id.txtCardname);
        txtExpname = findViewById(R.id.txtExpname);
        txtPin = findViewById(R.id.txtPin);
        etPwd = findViewById(R.id.etPwd);
        btnSend = findViewById(R.id.btnSend);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String value1 = bundle.getString("CardNo");
            txtCardname.setText(value1);
            if (bundle!=null){
                String value2 = bundle.getString("Expno");
                txtExpname.setText(value2);
            }

        }


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Pin_Activity.this,Progres_Activity.class);
                startActivity(intent);
            }
        });


    }
}