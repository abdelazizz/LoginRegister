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

public class add extends AppCompatActivity implements View.OnClickListener {
    DatabaseHelper myDb;
    Button bAdd;
    EditText JobName, CompanyName, Category, Adress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        JobName = (EditText) findViewById(R.id.JobName);
        CompanyName = (EditText) findViewById(R.id.CompanyName);
        Category = (EditText) findViewById(R.id.Category);
        Adress = (EditText) findViewById(R.id.Adress);
        bAdd = (Button) findViewById(R.id.bAdd);

        bAdd.setOnClickListener(this);
        myDb = new DatabaseHelper(this);
        AddData();
    }
    public  void AddData() {
        bAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(JobName.getText().toString(),

                                CompanyName.getText().toString(),
                                Category.getText().toString(),
                                Adress.getText().toString() );
                        if(isInserted =true)
                            Toast.makeText(add.this, "Data Inserted", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(add.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }



    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.bAdd:

                break;
        }
    }
}
