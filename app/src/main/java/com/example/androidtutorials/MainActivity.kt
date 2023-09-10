package com.example.androidtutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.androidtutorials.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view  = binding.root
        setContentView(view)
        binding.btnApply.setOnClickListener {
            printResult(it)
        }
    }
    fun printResult(view: View){
        when (view.id){
            R.id.btnApply ->{
                val firstName = binding.etFirstName.text.toString()
                val lastName = binding.etLastName.text.toString()
                val birthDate = binding.etBirthDate.text.toString()
                val country = binding.etCountry.text.toString()

                binding.tvSummary.text = "First Name: $firstName\n" +
                        "Last Name: $lastName\n" +
                        "Birth Date: $birthDate\n" +
                        "Country: $country\n" +
                "Clicked: " + count++
            }
        }
    }
}
