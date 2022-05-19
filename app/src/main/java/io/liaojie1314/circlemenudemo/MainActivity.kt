package io.liaojie1314.circlemenudemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import io.liaojie1314.circlemenudemo.databinding.ActivityMainBinding
import kotlin.reflect.KClass

class MainActivity : AppCompatActivity() {

    private val mainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)

        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)

        mainBinding.simpleMenu.setOnClickListener {
            openScreen(SimpleMenuActivity::class)
        }
        mainBinding.bottomBarMenu.setOnClickListener {
            openScreen(BottomBarMenuActivity::class)
        }
        mainBinding.fabMenu.setOnClickListener {
            openScreen(FabMenuActivity::class)
        }
    }

    private fun openScreen(activity: KClass<out Activity>) {
        startActivity(Intent(this, activity.java))
    }
}