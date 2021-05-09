package com.example.example

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            button.setOnClickListener {
                val intent= Intent(this@MainActivity,SubActivity::class.java)
                intent.putExtra("from1","Hello Bundle")
                intent.putExtra("from2",222)
                startActivityForResult(intent,99)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        setContentView(binding.root)
        with(binding) {
            if (resultCode == Activity.RESULT_OK) {
                when (requestCode) {
                    99 -> {
                        val msg = data?.getStringExtra("returnValue")
                        textViewMain.text= msg.toString()
                    }
                }
            }
        }
    }
}