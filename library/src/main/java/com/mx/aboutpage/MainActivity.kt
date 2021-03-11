package com.mx.aboutpage

import android.os.Bundle

import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

import com.mx.aboutpage.ui.theme.ExampleTheme

class MainActivity : AppCompatActivity() {

    val aboutConfig : AboutConfig = AboutConfig().getInstance();
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExampleTheme {
                AboutActivity().launch(activity = this )
            }
        }
    }
}






