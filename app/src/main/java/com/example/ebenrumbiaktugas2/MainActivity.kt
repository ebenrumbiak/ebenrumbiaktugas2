package com.example.ebenrumbiaktugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi tombol
        val btnLogin = findViewById<Button>(R.id.btn_login)
        val btnRegister = findViewById<Button>(R.id.btn_register)

        // Aksi ketika tombol Login ditekan
        btnLogin.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }

        // Aksi ketika tombol Register ditekan
        btnRegister.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
    }
}