package com.koloman212.pwrsimpletasks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toolbar
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLayout: Button = findViewById(R.id.buttonTask2)

        buttonLayout.setOnClickListener {
            setContentView(R.layout.layout_layout)
            val button50:Button = findViewById(R.id.button50)
            val button30:Button = findViewById(R.id.button30)
            val button20:Button = findViewById(R.id.button20)

            val animation:Animation = AnimationUtils.loadAnimation(this, R.anim.layoutanim)

            button50.startAnimation(animation)
            button30.startAnimation(animation)
            button20.startAnimation(animation)
        }



    }
}