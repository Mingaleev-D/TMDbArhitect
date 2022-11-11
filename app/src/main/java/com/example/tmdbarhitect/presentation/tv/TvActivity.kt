package com.example.tmdbarhitect.presentation.tv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tmdbarhitect.R
import com.example.tmdbarhitect.databinding.ActivityTvBinding

class TvActivity : AppCompatActivity() {
   private lateinit var binding: ActivityTvBinding
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      binding = DataBindingUtil.setContentView(this, R.layout.activity_tv)
   }
}