package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etLoingId, etLoinPass;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLoingId = (EditText) findViewById(R.id.etLoingId);
        etLoinPass = (EditText) findViewById(R.id.etLoinPass);
        btLogin = (Button) findViewById(R.id.btLogin);

        etLoingId.setOnClickListener(this);
        etLoinPass.setOnClickListener(this);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        String btLoginV = btLogin.getText().toString();
        String etLoinPassV = etLoinPass.getText().toString();

        switch (id){
            case R.id.btLogin :
                startActivity(new Intent(LoginActivity.this, ListActivity.class));
                break;
        }
    }
}
