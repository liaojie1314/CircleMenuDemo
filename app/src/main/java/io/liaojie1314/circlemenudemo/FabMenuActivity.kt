package io.liaojie1314.circlemenudemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.liaojie1314.circlemenudemo.databinding.ActivityFabMenuBinding

class FabMenuActivity:AppCompatActivity() {
    private val fabMenuBinding:ActivityFabMenuBinding by lazy{
        ActivityFabMenuBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(fabMenuBinding.root)
    }
}