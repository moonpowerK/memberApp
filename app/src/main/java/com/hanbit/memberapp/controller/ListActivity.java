package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hanbit.memberapp.R;

public class ListActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnJoin, btGosearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        btnJoin = (Button) findViewById(R.id.btnJoin);
        btGosearch = (Button) findViewById(R.id.btGosearch);

        btnJoin.setOnClickListener(this);
        btGosearch.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnJoin :
                startActivity(new Intent(ListActivity.this, DetailActivity.class));
            break;
            case R.id.btGosearch :
                startActivity(new Intent(ListActivity.this, FindActivity.class));
                break;

        }
    }
}
