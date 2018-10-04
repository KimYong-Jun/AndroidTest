package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FrontViewActivity extends AppCompatActivity {

    private Button bt_calc, bt_player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_view);
        getSupportActionBar().setTitle(R.string.menuTitle);

        init();
    }

    public void init(){
        bt_calc = findViewById(R.id.bt_calc);
        bt_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FrontViewActivity.this, "계산기", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FrontViewActivity.this, CalcActivity.class);
                startActivity(intent);
            }
        });
        bt_player = findViewById(R.id.bt_player);
        bt_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FrontViewActivity.this, "플레이어", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(FrontViewActivity.this, PlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}

