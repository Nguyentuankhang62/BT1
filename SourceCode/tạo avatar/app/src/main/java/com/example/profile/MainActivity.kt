package com.example.profile

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        val btnEdit = findViewById<TextView>(R.id.btnEdit)

        // Nút quay lại
        btnBack.setOnClickListener {
            finish()
        }

        // Nút chỉnh sửa
        btnEdit.setOnClickListener {
            Toast.makeText(
                this,
                "Chức năng chỉnh sửa",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}