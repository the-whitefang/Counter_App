package com.example.counter_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.counter_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btn1.setOnClickListener {
            var value1 = binding.value1.text.toString()
            var value2 = binding.value2.text.toString()
            if (value1.isEmpty() && value2.isEmpty()){
                Toast.makeText(this,"Please enter any value to perform the Addition"
                ,Toast.LENGTH_SHORT).show()
            }
            else{
                var num1 = value1.toInt()
                var num2 = value2.toInt()
                binding.result.text = (num1+num2).toString()
            }
        }




    }
}