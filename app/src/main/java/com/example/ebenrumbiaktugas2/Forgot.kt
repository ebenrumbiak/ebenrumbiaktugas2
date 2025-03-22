package com.example.ebenrumbiaktugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Pastikan nama layout benar

        // 🔹 Inisialisasi elemen UI
        val ivLogo = findViewById<ImageView>(R.id.iv_logo)
        val tvWelcome = findViewById<TextView>(R.id.tv_welcome)
        val tvDescription = findViewById<TextView>(R.id.tv_description)
        val btnLogin = findViewById<Button>(R.id.btn_login)
        val btnRegister = findViewById<Button>(R.id.btn_register)

        // 🔹 Event klik tombol Login
        btnLogin.setOnClickListener {
            val intent = Intent(this, login::class.java) // Nama class yang benar
            startActivity(intent)
            finish() // Menutup MainActivity agar tidak bisa kembali dengan tombol Back
        }

        // 🔹 Event klik tombol Register
        btnRegister.setOnClickListener {
            val intent = Intent(this, register::class.java) // Nama class yang benar
            startActivity(intent)
        }
    }
}
