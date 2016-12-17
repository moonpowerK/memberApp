package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hanbit.memberapp.R;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener{

    Button btList, btDelete, btUpdate, btMessage, btMap, btCall;
    TextView tvAddr, tvTel, tvName, tvPass, tvID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btList = (Button) findViewById(R.id.btList);
        btDelete = (Button) findViewById(R.id.btDelete);
        btUpdate = (Button) findViewById(R.id.btUpdate);
        btMessage = (Button) findViewById(R.id.btMessage);
        btMap = (Button) findViewById(R.id.btMap);
        btCall = (Button) findViewById(R.id.btCall);
        tvAddr = (TextView) findViewById(R.id.tvAddr);
        tvTel = (TextView) findViewById(R.id.tvTel);
        tvName = (TextView) findViewById(R.id.tvName);
        tvPass = (TextView) findViewById(R.id.tvPass);
        tvID = (TextView) findViewById(R.id.tvID);

        btList.setOnClickListener(this);
        btDelete.setOnClickListener(this);
        btUpdate.setOnClickListener(this);
        btMessage.setOnClickListener(this);
        btMap.setOnClickListener(this);
        btCall.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        String tvAddrv = tvAddr.getText().toString();
        String tvTelv = tvTel.getText().toString();
        String tvNamev = tvName.getText().toString();
        String tvPassv = tvPass.getText().toString();
        String tvIDv = tvID.getText().toString();

        switch (id){
            case R.id.btList :
                this.startActivity(new Intent(DetailActivity.this,ListActivity.class));
                break;
            case R.id.btDelete :
                break;
            case R.id.btUpdate :
                this. startActivity(new Intent(DetailActivity.this, UpdateActivity.class));
                break;
            case R.id.btMessage :
                break;
            case R.id.btMap :
                break;
            case R.id.btCall :
                break;
        }

    }
}
