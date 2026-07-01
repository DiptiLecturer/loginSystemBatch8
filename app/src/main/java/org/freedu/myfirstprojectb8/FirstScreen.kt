package org.freedu.myfirstprojectb8

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import org.freedu.myfirstprojectb8.databinding.ActivityFirstScreeenBinding

class FirstScreen : AppCompatActivity() {

    private lateinit var binding: ActivityFirstScreeenBinding

    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFirstScreeenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE)

        val savedName = sharedPreferences.getString("username", null)

        if(savedName!=null){
            Toast.makeText(this, "Data exist", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@FirstScreen, SecondScreen::class.java))
            finish()
        }

        binding.btnSubmit.setOnClickListener {

            val name = binding.etName.text.toString()

            if (name.isEmpty()) {
                Toast.makeText(this@FirstScreen, "Name is required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val editor =sharedPreferences.edit()
            editor.putString("username",name)
            editor.apply()
            val intent = Intent(this@FirstScreen, SecondScreen::class.java)
            intent.putExtra("name", name)
            startActivity(intent)


        }


    }
}