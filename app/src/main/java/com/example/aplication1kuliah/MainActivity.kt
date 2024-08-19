package com.example.aplication1kuliah

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.aplication1kuliah.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnToast.setOnClickListener {
                var username = binding.editTextUsername.text.toString()
//                var password = binding.editTextPassword.text.toString()
//                var message = "Username: $username\nPassword: $password"
                Toast.makeText(
                    this@MainActivity, "Username : $username", Toast.LENGTH_SHORT

                ).show()
            }
        }
    }
}