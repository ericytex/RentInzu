package com.example.eric.rentinzu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {
    private Button nDriver, nCustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nDriver = (Button) findViewById(R.id.driver);
        nCustomer = (Button) findViewById(R.id.customer);

        nDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, DriverLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        nCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, CustomerLoginAactivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });


    }
}
