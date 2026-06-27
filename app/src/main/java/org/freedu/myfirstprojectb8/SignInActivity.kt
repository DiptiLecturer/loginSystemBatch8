package org.freedu.myfirstprojectb8

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    private lateinit var myVariable: Button
    private lateinit var myET: EditText
    private lateinit var myPass: EditText
    private lateinit var navToSignUpBtn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)

        myVariable = findViewById(R.id.signInBTN)
        myET = findViewById(R.id.emailET)
        myPass = findViewById(R.id.passET)
        navToSignUpBtn = findViewById(R.id.navToSignUpBtn)

        myVariable.setOnClickListener {
            Toast.makeText(this, "Sign in Successful", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this@SignInActivity, HomeScreenActivity::class.java))
            finish()
        }

        navToSignUpBtn.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }


    }
}