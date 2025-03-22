package com.example.ebenrumbiaktugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class register : AppCompatActivity() {  // Perbaiki nama class agar mengikuti konvensi PascalCase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etName = findViewById<EditText>(R.id.et_name)
        val etEmail = findViewById<EditText>(R.id.et_email)
        val etPassword = findViewById<EditText>(R.id.et_password)
        val etConfirmPassword = findViewById<EditText>(R.id.et_confirm_password)
        val btnRegister = findViewById<Button>(R.id.btn_register)

        btnRegister.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val confirmPassword = etConfirmPassword.text.toString().trim()

            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else if (password != confirmPassword) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show()

                // Berpindah ke halaman Login setelah registrasi berhasil
                val intent = Intent(this, login::class.java) // Sesuaikan dengan nama class Login yang benar
                startActivity(intent)
                finish() // Menutup halaman register agar tidak bisa kembali dengan tombol back
            }
        }
    }
}
