package com.example.a4chilaboratoriyauniversitet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.a4chilaboratoriyauniversitet.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        binding.threeID.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))


        }

        binding.oneID.setOnClickListener {

            startActivity(Intent(this, SaharlikActivity::class.java))


        }


        binding.twoID.setOnClickListener {

            startActivity(Intent(this, IftorlikActivity::class.java))


        }

    }
}