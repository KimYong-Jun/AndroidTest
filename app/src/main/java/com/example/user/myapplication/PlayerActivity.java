package com.example.user.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PlayerActivity extends AppCompatActivity {

    private MediaPlayer mp = null;
    private Button bt_pause = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        setTitle(R.string.playerTitle);

    }

    public void playerBtn(View v){
        Log.i("test", "playerBtn :" +v.getId());
        switch (v.getId()){
            case R.id.bt_music1:
                _doStop();
                mp = MediaPlayer.create(PlayerActivity.this, R.raw.music1);
                mp.start();
                break;
            case R.id.bt_music2:
                _doStop();
                mp = MediaPlayer.create(PlayerActivity.this, R.raw.music2);
                mp.start();
                break;
            case R.id.bt_pause:
                if(mp == null){
                    return;
                }

                Button btn = (Button)v;
                String txt =  btn.getText().toString();

                if(txt.equals(getString(R.string.pause))){ //음악 재생 중
                    btn.setText(R.string.play);
                    mp.pause();
                }else { // 음악 일시정지 중
                    btn.setText(R.string.pause);
                    mp.start();
                }
                break;
            case R.id.bt_stop:
                _doStop();

                break;
        }
    }

    private void _doStop(){
        if(mp != null){
            mp.stop();
            mp.release();;
            mp = null;
            bt_pause = findViewById(R.id.bt_pause);
            bt_pause.setText(R.string.pause);
        }
    }
}

