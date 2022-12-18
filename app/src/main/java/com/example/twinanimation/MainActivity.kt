package com.example.twinanimation

import android.icu.number.Scale
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(){

    lateinit var tv : TextView
    lateinit var btn : Button
    lateinit var tv2 : TextView
    lateinit var scale : Button
    lateinit var tv3 : TextView
    lateinit var trans : Button
    lateinit var tv4 : TextView
    lateinit var alpha : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv=findViewById(R.id.tv)
        btn=findViewById(R.id.btn)
        tv2=findViewById(R.id.tv2)
        scale=findViewById(R.id.scale)
        tv3=findViewById(R.id.tv3)
        trans=findViewById(R.id.trans)
        tv4=findViewById(R.id.tv4)
        alpha=findViewById(R.id.alpha)

        btn.setOnClickListener {
            var an=AnimationUtils.loadAnimation(this,R.anim.rotateanimation)
//            an.setAnimationListener(this)

            tv.startAnimation(an)
        }

        scale.setOnClickListener {
            var an=AnimationUtils.loadAnimation(this,R.anim.scaleanimation)
            tv2.startAnimation(an)
        }

        trans.setOnClickListener {
            var an=AnimationUtils.loadAnimation(this,R.anim.translateanimation)
            tv3.startAnimation(an)
        }

        alpha.setOnClickListener {
            var an=AnimationUtils.loadAnimation(this,R.anim.alphaanimation)
            tv4.startAnimation(an)
        }

    }

//    override fun onAnimationStart(animation: Animation?) {
//
//    }
//
//    override fun onAnimationEnd(animation: Animation?) {
//
//    }
//
//    override fun onAnimationRepeat(animation: Animation?) {
//
//    }
}