package com.example.knowledgehub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn_android=findViewById<CardView>(R.id.android)
        val btn_web=findViewById<CardView>(R.id.webd)
        val btn_devops=findViewById<CardView>(R.id.devops)
        val btn_cybersec=findViewById<CardView>(R.id.cybersec)
        val btn_blockchain=findViewById<CardView>(R.id.blockchain)
        val btn_arvr=findViewById<CardView>(R.id.Arvr)

        btn_arvr.setOnClickListener{
            intent= Intent(applicationContext,ArvrActivity::class.java)
            startActivity(intent)
        }

        btn_android.setOnClickListener{
            intent=Intent(applicationContext,AndroidActivity::class.java)
            startActivity(intent)
        }

        btn_blockchain.setOnClickListener{
            intent= Intent(applicationContext,BlockchainActivity::class.java)
            startActivity(intent)
        }

        btn_web.setOnClickListener{
            intent=Intent(applicationContext,WebdActivity::class.java)
            startActivity(intent)
        }

        btn_cybersec.setOnClickListener{
            intent= Intent(applicationContext,CyberActivity::class.java)
            startActivity(intent)
        }

        btn_devops.setOnClickListener{
            intent=Intent(applicationContext,DevopsActivity::class.java)
            startActivity(intent)
        }


    }
}