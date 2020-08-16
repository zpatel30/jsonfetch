package com.example.volley;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button Parse;
    public static TextView data;

    private String path = "http://jservice.io/api/clues";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse = (Button) findViewById(R.id.btn);
        data = (TextView) findViewById(R.id.list);

        Parse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               fetchData process = new fetchData();
               process.execute();
            }
        });

    }

}
