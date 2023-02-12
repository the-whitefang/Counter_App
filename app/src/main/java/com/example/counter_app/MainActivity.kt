package com.example.counter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            var value1 = binding.value1.text.toString()
            var value2 = binding.value2.text.toString()
            if(value1.isNotEmpty() && value2.isNotEmpty()){
                var A = value1.toInt()
                var B = value2.toInt()
                binding.result.text = (A+B).toString()
            }
            else{
                Toast.makeText(this,"Please enter any to Add.",Toast.LENGTH_SHORT).show()
            }
        }


    }
}