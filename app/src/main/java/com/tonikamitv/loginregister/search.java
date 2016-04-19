package com.tonikamitv.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SearchView;
import android.widget.TextView;

public class search extends AppCompatActivity implements View.OnClickListener{
    Button button3;
    RadioButton radioButton, radioButton2, radioButton3, radioButton4;
    SearchView searchView;
    TextView category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

    button3 = (Button) findViewById(R.id.button3);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
    button3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button3:

                break;

        }
    }
}
