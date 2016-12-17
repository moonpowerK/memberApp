package com.hanbit.memberapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hanbit.memberapp.controller.JoinActivity;
import com.hanbit.memberapp.controller.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnJoin, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnJoin = (Button) findViewById(R.id.btnJoin);

        btnJoin.setOnClickListener(this);
        btnLogin.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.btnJoin :
                Toast.makeText(MainActivity.this, "Do Join", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, JoinActivity.class));

                break;
            case R.id.btnLogin :
                Toast.makeText(MainActivity.this, "Do Login", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
                break;
        }
    }
}
