package com.hanbit.memberapp.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.R;

public class FindActivity extends AppCompatActivity implements View.OnClickListener{

    EditText etSword ;
    Button btSearch, btScancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        etSword = (EditText) findViewById(R.id.etSword);
        btSearch = (Button) findViewById(R.id.btSearch);
        btScancel = (Button) findViewById(R.id.btScancel);

        etSword.setOnClickListener(this);
        btSearch.setOnClickListener(this);
        btScancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        String etSwordv = etSword.getText().toString();

        switch (id){
            case R.id.etSword :
                break;
            case  R.id.btSearch :
                break;
            case  R.id.btScancel :
                etSwordv = null;
                break;
        }
    }
}
