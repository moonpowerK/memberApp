package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hanbit.memberapp.R;

public class UpdateActivity extends AppCompatActivity implements View.OnClickListener{

    Button btSubmitu, btCancelu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        btSubmitu = (Button) findViewById(R.id.btSubmitu);
        btCancelu = (Button) findViewById(R.id.btCancelu);

        btSubmitu.setOnClickListener(this);
        btCancelu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btSubmitu :
                Toast.makeText(UpdateActivity.this, "success!", Toast.LENGTH_LONG).show();
                this.startActivity(new Intent(UpdateActivity.this, DetailActivity.class));
                break;
            case R.id.btCancelu :
                Toast.makeText(UpdateActivity.this, "cancel!", Toast.LENGTH_LONG).show();
                this.startActivity(new Intent(UpdateActivity.this, DetailActivity.class));
                break;
        }
    }
}
