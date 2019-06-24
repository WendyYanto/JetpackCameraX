package com.wendy.jetpackcamerax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class ResultActivity : AppCompatActivity() {

    private lateinit var resultImageView: ImageView
    private var imagePath: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        imagePath = intent.getStringExtra(MainActivity.CAMERA_CAPTURED_CODE)
        setContentView(R.layout.activity_result)
        resultImageView = findViewById(R.id.iv_result)
        imagePath?.let {
            Glide.with(baseContext).load(imagePath).into(resultImageView)
        }
    }
}
