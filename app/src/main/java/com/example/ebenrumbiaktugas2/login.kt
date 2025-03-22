package com.example.ebenrumbiaktugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() { // Perbaikan nama class mengikuti PascalCase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<EditText>(R.id.et_email)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val btnSignIn = findViewById<Button>(R.id.btn_sign_in)
        val btnForgotPassword = findViewById<Button>(R.id.btn_forgot)

        btnSignIn.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                // TODO: Tambahkan logika autentikasi di sini
            } else {
                Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            }

        }

        btnSignIn.setOnClickListener {
            val intent = Intent(this, Home::class.java) // Sesuaikan dengan nama class Forgot yang benar
            startActivity(intent) }


        btnForgotPassword.setOnClickListener {
            val intent = Intent(this, Forgot::class.java) // Sesuaikan dengan nama class Forgot yang benar
            startActivity(intent)
        }


    }
}
