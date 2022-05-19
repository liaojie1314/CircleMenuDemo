package io.liaojie1314.circlemenudemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import io.liaojie1314.circlemenudemo.databinding.ActivityBottomBarMenuBinding
import kotlin.reflect.KClass

class BottomBarMenuActivity : AppCompatActivity() {
    private val bottomBarMenuBinding: ActivityBottomBarMenuBinding by lazy {
        ActivityBottomBarMenuBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bottomBarMenuBinding.root)
    }
}