package com.tonikamitv.loginregister;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity implements View.OnClickListener {
    DatabaseHelper myDb;
    Button bRegister;
    EditText etName, etAge, etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etName = (EditText) findViewById(R.id.etName);
        etAge = (EditText) findViewById(R.id.etAge);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(this);
        myDb = new DatabaseHelper(this);
        AddData();
    }
    public  void AddData() {
        bRegister.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(etName.getText().toString(),

                                 etAge.getText().toString(),
                                etUsername.getText().toString(),
                                etPassword.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(Register.this, "Data Inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Register.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }



    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.bRegister:

                break;
        }
    }
}
