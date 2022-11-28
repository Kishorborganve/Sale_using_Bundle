package com.sale.saleusingbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Amount_details extends AppCompatActivity {

    TextView tvDisplay;
    EditText etAmount;
    Button btnPay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount_details);

        tvDisplay= findViewById(R.id.tvDisplay);
        etAmount = findViewById(R.id.etAmount);
        btnPay=findViewById(R.id.btnPay);

        Bundle bundle = getIntent().getExtras();
        tvDisplay.setText(bundle.getString("title"));

        btnPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value =  etAmount.getText().toString().trim();
                Intent intent= new Intent(Amount_details.this,Card_Activity.class);
                Bundle bundle = new Bundle();
                bundle.putString("Amount",value);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
