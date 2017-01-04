package com.nisira.view.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import com.nisira.gcalderon.policesecurity.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SplashScreen_Activity extends AppCompatActivity {
    /*VARIABLES DE VISTA*/
    @Bind(R.id.pgBar)
    ProgressBar pgBar;
    /*VARIABLES DE CLASE*/
    public static final int seconds=8;
    public static final int miliseconds_total=seconds*1000;
    public static final int delay=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);
        pgBar.setMax(max_progress());
        initAnimation();
    }
    public void initAnimation(){
        new CountDownTimer(miliseconds_total,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                pgBar.setProgress(progress(millisUntilFinished));
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(SplashScreen_Activity.this, NavigationPolice_Activity.class));
                finish();
            }
        }.start();
    }
    public int progress(long miliseconds){
        return (int)((miliseconds_total-miliseconds)/1000);
    }
    public int max_progress(){
        return seconds-delay;
    }
}
