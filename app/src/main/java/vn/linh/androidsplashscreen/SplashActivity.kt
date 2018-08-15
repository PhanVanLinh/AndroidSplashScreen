package vn.linh.androidsplashscreen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        window.decorView.apply {
//            systemUiVisibility =  View.SYSTEM_UI_FLAG_FULLSCREEN
//        }
        setContentView(R.layout.activity_splash)
    }
}