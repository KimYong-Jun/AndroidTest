package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {

    private EditText et_no1 = null, et_no2 = null;
    private TextView tv_sig = null, tv_res = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        getSupportActionBar().setTitle(R.string.calcTitle);

        _init();
    }

    public void _init() {
        et_no1 = findViewById(R.id.et_no1);
        et_no1.setShowSoftInputOnFocus(false);

        et_no2 = findViewById(R.id.et_no2);
        et_no2.setShowSoftInputOnFocus(false);

        tv_sig = findViewById(R.id.tv_sig);
        tv_res = findViewById(R.id.tv_res);

    }

    private int inParesFromString(String s){
        int result = -1;
        try{
            result = Integer.parseInt(s);
        }catch (Exception e){}

        return result;
    }

    private String doCalc(String v1, String v2, String calcSig){
        String result = "";
        int intV1 = inParesFromString(v1);
        int intV2 = inParesFromString(v2);

        int intResult = 0;
        switch (calcSig){
            case "+" :
                result = Integer.toString(intV1 + intV2);
                break;
            case "-" :
                result = Integer.toString(intV1 - intV2);
                break;
            case "/" :
                if(intV2 == 0){
                    result = "div 0";
                }else {
                    result = Double.toString((double)intV1 / intV2);
                }
                break;
            case "*" :
                result = Integer.toString(intV1 * intV2);
                break;
        }
        return result;
    }

    public void bt_sig(View v) {
        if (v instanceof Button) {
            Button b = (Button) v;
            String sig = b.getText().toString();

            if (sig.equals("c")) {
                et_no1.setText("");
                et_no2.setText("");
                tv_sig.setText("");
                tv_res.setText("");
            } else {
                tv_sig.setText(sig);
            }
        }
    }

    public void bt_no(View v) {

        //Log.i("test","이벤트 연결 성공");
        String calcSig = tv_sig.getText().toString();

        if(v.getId() == R.id.bt_equ){
            String val_1 = et_no1.getText().toString();
            String val_2 = et_no2.getText().toString();

            if(calcSig.equals("") || val_1.equals("") || val_2.equals("")){
                tv_res.setText("imcomplete");
            } else {
                String result = doCalc(val_1, val_2, calcSig);
                tv_res.setText(result);
            }
        } else {
            EditText target = null;

            if(calcSig.equals("")){
                target = et_no1;
            }else {
                target = et_no2;
            }

            if(target != null){
                if(v instanceof Button){
                    //누른 버튼의 텍스트 값
                    Button b = (Button)v;
                    String pressNo = b.getText().toString();

                    //기존에 있던 텍스트 값 + 누른 버튼의 텍스트 값
                    String existValue = target.getText().toString();
                    existValue += pressNo;

                    //합친 텍스트 값을 다시 타겟에 입력
                    target.setText(existValue);
                }
            }
        }
    }
}