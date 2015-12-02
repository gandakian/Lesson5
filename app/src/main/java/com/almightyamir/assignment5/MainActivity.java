package com.almightyamir.assignment5;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button clickBtn;
    TextView result;
    EditText input1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        clickBtn = (Button) findViewById(R.id.btnClick);
        result = (TextView) findViewById(R.id.result);
        input1 = (EditText) findViewById(R.id.input1);

        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String cupsString = input1.getText().toString();

                if(!cupsString.matches("")){
                    Double cupsDouble = Double.parseDouble(cupsString);

                    Double tablespoons = 16 * cupsDouble;
                    String res = String.valueOf(tablespoons);

                    result.setText(res + " TableSpoons");
                }
                else{
                    result.setText("Please enter the value for cups !!!");
                }

            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    }