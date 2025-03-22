package com.example.ebenrumbiaktugas2

    import android.os.Bundle
    import android.widget.Button
    import android.widget.EditText
    import android.widget.Toast
    import androidx.appcompat.app.AppCompatActivity

    class Forgot : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_forgot)
            val etEmail = findViewById<EditText>(R.id.et_email)
            val btnSignIn = findViewById<Button>(R.id.btn_sign_in)

            btnSignIn.setOnClickListener {
                val email = etEmail.text.toString().trim()

                if (email.isEmpty()) {
                    Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Password reset instructions sent to $email", Toast.LENGTH_SHORT).show()
                    // TODO: Implement actual password reset logic
                }
            }
        }
    }
