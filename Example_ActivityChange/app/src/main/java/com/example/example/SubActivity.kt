package com.example.example

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.example.databinding.ActivityMainBinding
import com.example.example.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySubBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            valueString.text=intent.getStringExtra("from1")
            valueInt.text= intent.getIntExtra("from2",0).toString()
            button2.setOnClickListener {
                val returnIntent=Intent()
                val message=editText.text.toString()
                returnIntent.putExtra("returnValue",message)
                setResult(Activity.RESULT_OK,returnIntent)
                finish()
            }
        }
    }
}