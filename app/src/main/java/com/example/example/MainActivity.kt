package com.example.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import com.mx.aboutpage.AboutActivity
import com.mx.aboutpage.AboutConfig


class MainActivity : AppCompatActivity() {

    var aboutConfig: AboutConfig = AboutConfig().getInstance()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        aboutConfig.appName = "Messengerx"
        aboutConfig.appIcon=R.drawable.ic_green
        aboutConfig.version = "1.0.0"
        aboutConfig.aboutLabelTitle = "About App"
        aboutConfig.packageName = applicationContext.packageName
        aboutConfig.shareMessage="Download this Awsome APP"
        aboutConfig.facebookUserName = "ButWhoCares"
        aboutConfig.twitterUserName = "amanv8060"
        aboutConfig.facebookUserPageId = "108972223791354"
        aboutConfig.webHomePage = "https://messengerx.io"
        aboutConfig.appPublisher = "Ophilia"
        aboutConfig.companyHtmlPath = "https://messengerx.io"
        aboutConfig.privacyHtmlPath = "https://messengerx.io"
        aboutConfig.acknowledgmentHtmlPath = "https://messengerx.io"
        aboutConfig.emailAddress = "verma1090aman@gmail.com"

        setContent {
            //Launches the about Page
            AboutActivity().launch(this)
        }
    }
}
