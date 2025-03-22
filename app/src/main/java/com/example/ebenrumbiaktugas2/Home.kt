package com.example.ebenrumbiaktugas2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnShare = findViewById<Button>(R.id.btnShare)
        val editMessage = findViewById<EditText>(R.id.editMessage)

        btnShare.setOnClickListener {
            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, editMessage.text.toString()) // Pesan yang akan dibagikan
                type = "text/plain" // Jenis data yang akan dibagikan
            }
            startActivity(Intent.createChooser(shareIntent, "Bagikan melalui")) // Menampilkan aplikasi-aplikasi berbagi pesan
        }

        val editText: EditText = findViewById(R.id.editMessage)
        editText.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                editText.setText("") // Hapus teks saat fokus
            }
        }




    }
}