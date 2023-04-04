package edu.miu.mdp_background_changer

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import edu.miu.mdp_background_changer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bgBtn.setOnClickListener{
            binding.layout.setBackgroundColor(Color.parseColor("#138030"))
            binding.txtView.setTextColor(Color.WHITE)
        }

        binding.logoBtn.setOnClickListener {
            binding.logoBtn.setBackgroundColor(Color.parseColor("#125270"))
        }

    }
}