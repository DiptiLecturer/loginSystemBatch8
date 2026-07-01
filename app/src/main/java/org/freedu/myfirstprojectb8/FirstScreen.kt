package org.freedu.myfirstprojectb8

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import org.freedu.myfirstprojectb8.databinding.ActivityFirstScreeenBinding

class FirstScreen : AppCompatActivity() {

    private lateinit var binding: ActivityFirstScreeenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFirstScreeenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {

            val name = binding.etName.text.toString()

            if(name.isEmpty()){
                Toast.makeText(this@FirstScreen, "Name is required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                val intent =Intent(this@FirstScreen, SecondScreen::class.java)
                intent.putExtra("name",name)
                startActivity(intent)
            }





        }



    }
}