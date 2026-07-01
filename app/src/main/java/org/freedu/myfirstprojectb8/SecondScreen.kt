package org.freedu.myfirstprojectb8

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import org.freedu.myfirstprojectb8.databinding.ActivitySecondScreenBinding

class SecondScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySecondScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val name =intent.getStringExtra("name")
        binding.tvName.text = name



    }
}