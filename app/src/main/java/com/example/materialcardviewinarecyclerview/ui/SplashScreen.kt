package com.example.materialcardviewinarecyclerview.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.materialcardviewinarecyclerview.MainActivity
import com.example.materialcardviewinarecyclerview.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    private val splashTimeOut: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)

        findViewById<ImageView>(R.id.splashImage).startAnimation(animation)

        CoroutineScope(Dispatchers.Main).launch {
            delay(splashTimeOut)
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }
    }
}