package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PrintStarActivity extends AppCompatActivity {

    private TextView star=null;
    private EditText input = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);
        getSupportActionBar().setTitle("별찍기");

        input = findViewById(R.id.et_input);
        star = findViewById(R.id.tv_star);
    }

    public void st_btn(View v){

        try {
            int star_nm = Integer.parseInt(input.getText().toString());
            String s = "";

            for(int i=0; i<star_nm; i++){
                for(int j=0; j<=i; j++){
                    s += "*";
                }
                s += "\n";
            }
            star.setText(s);
        }catch (Exception e){
            star.setText("숫자를 입력해주세요. 제발~~");
        }
    }
}
