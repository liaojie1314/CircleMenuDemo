package io.liaojie1314.circlemenudemo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import io.liaojie1314.circlemenudemo.databinding.ActivitySimpleMenuBinding

class SimpleMenuActivity : AppCompatActivity() {
    private val simpleMenuBinding: ActivitySimpleMenuBinding by lazy {
        ActivitySimpleMenuBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(simpleMenuBinding.root)

        val titles = arrayListOf("Favorite", "Search", "Alert", "Place", "Edit")
        simpleMenuBinding.fab.setOnItemClickListener { buttonIndex ->
            Snackbar.make(simpleMenuBinding.snackbarContainer, titles[buttonIndex], Snackbar.LENGTH_LONG).show()
        }

        simpleMenuBinding.fab.onMenuOpenAnimationStart {
            Log.d("CircleMenuStatus", "onMenuOpenAnimationStart")
        }

        simpleMenuBinding.fab.onMenuOpenAnimationEnd {
            Log.d("CircleMenuStatus", "onMenuOpenAnimationEnd")
        }

        simpleMenuBinding.fab.onMenuCloseAnimationStart {
            Log.d("CircleMenuStatus", "onMenuCloseAnimationStart")
        }

        simpleMenuBinding.fab.onMenuCloseAnimationEnd {
            Log.d("CircleMenuStatus", "onMenuCloseAnimationEnd")
        }

        simpleMenuBinding.fab.onButtonClickAnimationStart { buttonIndex ->
            Log.d("CircleMenuStatus", "onButtonClickAnimationStart: $buttonIndex")
        }

        simpleMenuBinding.fab.onButtonClickAnimationEnd { buttonIndex ->
            Log.d("CircleMenuStatus", "onButtonClickAnimationEnd: $buttonIndex")
        }
    }
}