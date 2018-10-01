package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonAlignActivity extends AppCompatActivity {

    private TextView tv_btn_nm = null;
    private TextView btn_1 = null, btn_2 = null, btn_3 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_align);
        tv_btn_nm = findViewById(R.id.tv_btn_nm);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
    }

    public void clkBtn(View v){

        Button btn = (Button)v;

        tv_btn_nm.setText(btn.getText());

        if(v.getId() == R.id.btn_1){

            btn_2.setText("0");
            btn_3.setText("0");
            btn_1.setText("1");

        }else if(v.getId() == R.id.btn_2){

            btn_1.setText("0");
            btn_3.setText("0");
            btn_2.setText("2");

        }else if(v.getId() == R.id.btn_3){

            btn_1.setText("0");
            btn_2.setText("0");
            btn_3.setText("3");

        }else if(v.getId() == R.id.btn_4){

        }else if(v.getId() == R.id.btn_5){

        }else if(v.getId() == R.id.btn_6){

        }else if(v.getId() == R.id.btn_7){

        }else if(v.getId() == R.id.btn_8){

        }else if(v.getId() == R.id.btn_9){

        }else if(v.getId() == R.id.btn_10){

        }else if(v.getId() == R.id.btn_11){

        }
    }
}
