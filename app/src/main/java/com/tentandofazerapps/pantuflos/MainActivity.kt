package com.tentandofazerapps.pantuflos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        colorbutton.setOnClickListener{
            val intent = Intent(this,ActualColorActivity::class.java)
            startActivity(intent)
        }
        colormotif.setOnClickListener{
            val intent = Intent(this,ActualColorActivity::class.java)
            startActivity(intent)
        }

        configbutton.setOnClickListener{
            val intent = Intent(this,ColorsActivity::class.java)
            startActivity(intent)
        }
        configmotif.setOnClickListener{
            val intent = Intent(this,ColorsActivity::class.java)
            startActivity(intent)
        }

    }
}

