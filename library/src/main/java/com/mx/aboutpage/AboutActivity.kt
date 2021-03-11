package com.mx.aboutpage

import android.app.Activity
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import android.content.Intent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.remember
import com.mx.aboutpage.ui.theme.ExampleTheme


class AboutActivity {
    var aboutConfig: AboutConfig = AboutConfig().getInstance()


    @Composable
    fun launch(activity: Activity) {
        ExampleTheme() {
            // A surface container using the 'background' color from the theme
            Scaffold(
                topBar = { TopAppBar(title = { Text(text = "About") }) }
            ) {
                mainListItems(activity = activity, config = aboutConfig)
            }
        }
    }

    @Composable
    fun mainListItems(activity: Activity, config: AboutConfig) {

        Column(

            Modifier
                .padding(
                    8.dp
                )
                .verticalScroll(rememberScrollState() ,enabled = true)
        ) {
            topCards(config)
            supportCard(activity, config)
            reviewCards(activity, config)
            tryOtherApp(activity, config)
            socialCards(activity, config)
            privacyCards(activity, config)
        }
    }
}