package com.sale.saleusingbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Card_Activity extends AppCompatActivity {

    TextView txtView;
    EditText cardNo;
    EditText expNo;
    Button subButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        txtView=findViewById(R.id.txtView);
        cardNo=findViewById(R.id.cardNo);
        expNo=findViewById(R.id.expNo);
        subButton = findViewById(R.id.subButton);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String value = bundle.getString("Amount");
            txtView.setText(value);
        }

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 =  cardNo.getText().toString().trim();
                String value2 =  expNo.getText().toString().trim();
                Intent intent = new Intent(Card_Activity.this,Pin_Activity.class);
                Bundle bundle = new Bundle();
                bundle.putString("CardNo",value1);
                bundle.putString("Expno",value2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
