package com.mx.aboutpage

import android.net.Uri

import android.content.Intent

import android.app.Activity

import android.widget.Toast

import android.content.ActivityNotFoundException
import androidx.core.content.ContextCompat.startActivity

import android.util.Log
import android.R

import android.os.Build

import android.text.TextUtils


fun getOpenFacebookIntent(context: Activity,config: AboutConfig) {
    try {
        context.packageManager.getPackageInfo("com.facebook.katana", 0)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/${config.facebookUserPageId}"))
        context.startActivity(intent)
    } catch (e: Exception) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/${config.facebookUserName}"))
            context.startActivity(intent)
        } catch (e1: Exception) {
            Toast.makeText(context, "Cant Open ", Toast.LENGTH_SHORT).show()
        }
    }
}

fun startTwitter(context: Activity, config: AboutConfig) {
    try {
        context.packageManager.getPackageInfo("com.twitter.android", 0)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=${config.twitterUserName}"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    } catch (e: Exception) {
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/${config.twitterUserName}"))
            context.startActivity(intent)
        } catch (e1: Exception) {
            Toast.makeText(context, "Cant Open ", Toast.LENGTH_SHORT).show()
        }
    }
}

fun openApp(context: Activity, config: AboutConfig) {
    var appURI: String? = null
    var webURI: String? = null

    appURI = "market://details?id=${config.packageName}"
    webURI = "https://play.google.com/store/apps/details?id=${config.packageName}"


    openApplication(context, appURI, webURI)
}

fun openPublisher(
        context: Activity,
        config: AboutConfig
) {
    var appURI: String? = null
    var webURI: String? = null

    appURI = "market://search?q=pub:${config.appPublisher}"
    webURI = "https://play.google.com/store/apps/developer?id=${config.appPublisher}"

    openApplication(context, appURI, webURI)
}

fun openApplication(context: Activity, appURI: String?, webURI: String?) {
    try {
        context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(appURI)))
    } catch (e1: ActivityNotFoundException) {
        try {
            openHTMLPage(context, webURI)
        } catch (e2: ActivityNotFoundException) {
            Toast.makeText(context, "Cant Open", Toast.LENGTH_SHORT).show()
        }
    }
}

fun openHTMLPage(context: Activity, htmlPath: String?) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(htmlPath))
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    intent.setPackage("com.android.chrome")
    try {
        Log.d("TAG", "onClick: inTryBrowser")
        context.startActivity(intent)
    } catch (ex: ActivityNotFoundException) {
        Log.e("TAG", "onClick: in inCatchBrowser", ex)
        intent.setPackage(null)
        context.startActivity(Intent.createChooser(intent, "Select Browser"))
    }
//    context.startActivity(
//        Intent(
//            Intent.ACTION_VIEW,
//            Uri.parse("googlechrome://navigate?url=" + htmlPath)
//        )
//    )
}

fun sendEmail(context: Activity, config: AboutConfig) {
    val mailto = Uri.fromParts("mailto", config.emailAddress, null)

    var emailBody: String

    var deviceInfo = """
 App version: ${config.version}
 Android version: ${Build.VERSION.RELEASE} (${Build.VERSION.SDK_INT})  
 Device: ${Build.MODEL} (${Build.PRODUCT})
 Platform: Android"""
    emailBody = "\n\n\n\n\n" + "---------------------------" + deviceInfo


    try {
        val emailIntent = Intent(Intent.ACTION_SENDTO, mailto)
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, config.emailSubject)
        emailIntent.putExtra(Intent.EXTRA_TEXT, emailBody)
        context.startActivity(Intent.createChooser(emailIntent, "Send email..."))
    } catch (e: Exception) {
        Log.d("Tag", "Exception While Sending EMail")
    }
}