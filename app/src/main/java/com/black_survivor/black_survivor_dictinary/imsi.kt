package com.black_survivor.black_survivor_dictinary
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class imsi : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imsi)

        val im: ImageView = findViewById(R.id.imaging)
        val im1: ImageView = findViewById(R.id.imaging2)
        val i = Item()

    }
}