package com.example.solidpriciples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.Toast
import com.example.solidpriciples.databinding.ActivityMainBinding


class InterfaceSegregationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.editText.onTextChanged {
            showToast(it)
        }
    }

    private fun showToast(str: String){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show()
    }

}
