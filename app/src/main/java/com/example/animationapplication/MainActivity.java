package com.example.animationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img_p;
  Button btn_fade,btn_move,btn_clockwise,btn_blink,btn_slide,btn_zoom;

  Animation anim_fadein,anim_move,anim_clockwise,anim_blink,anim_slide,anim_zoom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_p = findViewById(R.id.img_p);
        btn_fade = findViewById(R.id.btn_fade_in);
        btn_move = findViewById(R.id.btn_move);
        btn_clockwise = findViewById(R.id.btn_clock);
        btn_blink = findViewById(R.id.btn_blink);
        btn_slide = findViewById(R.id.btn_slide);
        btn_fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim_fadein=AnimationUtils.loadAnimation(MainActivity.this,R.anim.fadein);
                img_p.startAnimation(anim_fadein);
            }
        });
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim_move=AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
                img_p.startAnimation(anim_move);
            }
        });
        btn_clockwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim_clockwise=AnimationUtils.loadAnimation(MainActivity.this,R.anim.clockwise);
                img_p.startAnimation(anim_clockwise);
            }
        });
        btn_blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim_blink=AnimationUtils.loadAnimation(MainActivity.this,R.anim.blink);
                img_p.startAnimation(anim_blink);
            }
        });
        btn_slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim_slide=AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide);
                img_p.startAnimation(anim_slide);
            }
        });
       btn_zoom= findViewById(R.id.btn_zoom);

       btn_zoom.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               anim_zoom = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom);
               img_p.startAnimation(anim_zoom);
           }
       });


    }
}