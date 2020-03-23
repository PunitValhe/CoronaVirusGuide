package com.coronavirus.com;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    // MyPref myPref;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getWindow().setFormat(1);
    }


    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView((int) R.layout.activity_splashscreen);
        //   this.myPref = new MyPref(getApplicationContext());
        StartAnimations();
        NextScreen();
    }

    private void StartAnimations() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.rotated);
        loadAnimation.reset();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.lin_lay);
        linearLayout.clearAnimation();
        linearLayout.startAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.newanimation);
        loadAnimation2.reset();
        ImageView imageView = (ImageView) findViewById(R.id.logo);
        imageView.clearAnimation();
        imageView.startAnimation(loadAnimation2);
    }

    private void NextScreen() {
        new Handler().postDelayed(new Runnable() {
            public void run() {

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 5000);
    }
}
