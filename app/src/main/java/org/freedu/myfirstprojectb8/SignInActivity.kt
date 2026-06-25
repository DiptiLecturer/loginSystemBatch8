package org.freedu.myfirstprojectb8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignInActivity : AppCompatActivity() {

    private lateinit var myVariable: Button
    private lateinit var myET: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)

        myVariable = findViewById(R.id.signInBTN)
        myET = findViewById(R.id.emailET)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        myVariable.setOnClickListener {
            Toast.makeText(this, "Sign in Successful", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@SignInActivity, HomeScreenActivity::class.java))
        }
    }
}