package com.example.tmdbarhitect.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tmdbarhitect.R
import com.example.tmdbarhitect.databinding.ActivityMainBinding
import com.example.tmdbarhitect.presentation.movie.MovieActivity
import com.example.tmdbarhitect.presentation.people.PeopleActivity
import com.example.tmdbarhitect.presentation.tv.TvActivity

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    binding.movieBtn.setOnClickListener {
       val intent = Intent(this, MovieActivity::class.java)
       startActivity(intent)
    }
      binding.tvBtn.setOnClickListener {
       val intent = Intent(this, TvActivity::class.java)
       startActivity(intent)
    }
      binding.peopleBtn.setOnClickListener {
       val intent = Intent(this, PeopleActivity::class.java)
       startActivity(intent)
    }
   }
}