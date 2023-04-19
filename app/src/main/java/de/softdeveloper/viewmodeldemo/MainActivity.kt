package de.softdeveloper.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import de.softdeveloper.viewmodeldemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var model: Data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        model = ViewModelProvider(this)[Data::class.java]
        binding.tvOutput.text = model.content.value

        binding.btnSenden.setOnClickListener {
            model.content.value = binding.etInput.text.toString()
            binding.tvOutput.text = model.content.value
        }
    }
}