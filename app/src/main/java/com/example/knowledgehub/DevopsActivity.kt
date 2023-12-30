package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DevopsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_devops)
        val dev=findViewById<Button>(R.id.btndevo)

        dev.setOnClickListener {
            val intent= Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("9045322104")
            startActivity(intent)
        }
    }
}