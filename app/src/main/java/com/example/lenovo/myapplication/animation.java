package com.example.lenovo.myapplication;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class animation extends AppCompatActivity {

    AnimationDrawable ad;
    boolean mystate=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        ImageView iv=(ImageView) findViewById(R.id.imageView);
        iv.setBackgroundResource(R.drawable.ani);
        ad=(AnimationDrawable) iv.getBackground();

        Button btn =(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener(){


          @Override
            public void onClick(View v){
              if(mystate) {
                  ad.stop();
                  mystate=true;
              }
              else {
                  Toast.makeText(animation.this, "click", Toast.LENGTH_SHORT).show();
                  ad.start();
                  mystate=false;
                  ImageView spaceshipImage=(ImageView) findViewById(R.id.imageView2);
                  Animation hyperspaceJumpAnimation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                  spaceshipImage.startAnimation(hyperspaceJumpAnimation);
              }
          }
        });
    }
}
