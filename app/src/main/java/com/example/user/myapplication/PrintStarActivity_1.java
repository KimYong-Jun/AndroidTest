package com.example.user.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrintStarActivity_1 extends AppCompatActivity {

    private TextView star=null;
    private Button st_btn=null;
    private EditText input = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);
        getSupportActionBar().setTitle("별찍기");

        innit();

    }

    private int checkInteger(String v){
        int result = 0;
        try{
            result = Integer.parseInt(v);
        }catch (Exception e){
            star.setText("숫자를 입력해주세요.");
        }
        return result;
    }

    public void innit(){

        input =(EditText) findViewById(R.id.et_input);
        star =(TextView) findViewById(R.id.tv_star);
        st_btn = (Button) findViewById(R.id.st_btn);
            st_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String result = "";
                    String value = input.getText().toString();
                    int no = checkInteger(value);

                   if(no > 0){

                       for(int i=0; i<no; i++){
                           for(int j=0; j<=i; j++){
                               result += "*";
                           }
                           result += "\n";
                       }

                   }
                    star.setText(result);
                }

            });
    }
}
