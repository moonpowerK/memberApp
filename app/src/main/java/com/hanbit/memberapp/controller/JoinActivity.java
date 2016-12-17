package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.MainActivity;
import com.hanbit.memberapp.R;

public class JoinActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etName, etID, etPass, etTel, etAddr;
    Button btSubmit, btCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        etName = (EditText) findViewById(R.id.etName);
        etID = (EditText) findViewById(R.id.etID);
        etPass = (EditText) findViewById(R.id.etPass);
        etTel = (EditText) findViewById(R.id.etTel);
        etAddr = (EditText) findViewById(R.id.etAddr);

        btSubmit = (Button) findViewById(R.id.btSubmit);
        btCancel = (Button) findViewById(R.id.btCancel);

        etName.setOnClickListener(this);
        etID.setOnClickListener(this);
        etPass.setOnClickListener(this);
        etTel.setOnClickListener(this);
        etAddr.setOnClickListener(this);
        btSubmit.setOnClickListener(this);
        btCancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        String etNameV = etName.getText().toString();
        String etIDV = etID.getText().toString();
        String etPassV = etPass.getText().toString();
        String etTelV = etTel.getText().toString();
        String etAddrV = etAddr.getText().toString();

        switch (id){
            case R.id.btSubmit :
                startActivity(new Intent(JoinActivity.this, ListActivity.class));
                break;
            case R.id.btCancel :
                startActivity(new Intent(JoinActivity.this, MainActivity.class));
                break;

        }

    }
}
