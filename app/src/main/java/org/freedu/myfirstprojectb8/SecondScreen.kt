package org.freedu.myfirstprojectb8

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import org.freedu.myfirstprojectb8.databinding.ActivitySecondScreenBinding

class SecondScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySecondScreenBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)
        val savedName = sharedPreferences.getString("username","No name")
        val intentName = intent.getStringExtra("name")
        binding.tvName.text = intentName
        binding.tvName.text = "welcome $savedName"

        binding.btnLogout.setOnClickListener {

            val editor = sharedPreferences.edit()
            editor.clear()
            editor.apply()
            startActivity(Intent(this@SecondScreen, FirstScreen::class.java))
            finish()

        }


    }
}