package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CyberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cyber)

        val cyber=findViewById<Button>(R.id.btncyber)

        cyber.setOnClickListener {
            val intent= Intent(Intent.ACTION_CALL)
            intent.data= Uri.parse("9045322104")
            startActivity(intent)
        }
    }
}