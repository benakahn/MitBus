package com.example.mitbus;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private static int Splash=3000;
    Animation animation,tanimation,manimation;
    ImageView i1,i2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        ActionBar a = getSupportActionBar();
        Drawable d = getResources().getDrawable(R.color.colorAccent);
        a.setBackgroundDrawable(d);

       /* tanimation= AnimationUtils.loadAnimation(this,R.anim.tanimation);
        manimation=AnimationUtils.loadAnimation(this,R.anim.manimation);
        i1=findViewById(R.id.splash1);
        t=findViewById(R.id.t);
        i1.setAnimation(tanimation);
        t.setAnimation(manimation); */
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run(){
                Intent i =new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
            }

        },Splash);
    }
}