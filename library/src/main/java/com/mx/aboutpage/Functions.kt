package com.mx.aboutpage

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import android.content.Intent
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.core.content.ContextCompat.startActivity
import com.mx.aboutpage.R.drawable.*
import com.mx.aboutpage.ui.theme.typography

///This Function returns all the social cards that are currently being shown in the ui
@Composable
fun socialCards(activity: Activity, config: AboutConfig) {

    val fbicon = painterResource(ic_facebook)
    val twittericon = painterResource(id = ic_twitter)
    val webIcon = painterResource(ic_web)
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    )
    {
        Column() {
            if (config.facebookUserName != null && config.facebookUserPageId != null) Row(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable(
                        onClick = {
                            getOpenFacebookIntent(activity, config)
                        }
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(

                    contentDescription = "Fb Icon",
                    alignment = Alignment.Center,
                    painter = fbicon,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxHeight(),
                    contentScale = ContentScale.FillBounds

                )
                Column() {
                    Text(
                        text = "Facebook",
                        modifier = Modifier.padding(8.dp, top = 8.dp, bottom = 0.dp),
                        style = typography.subtitle1

                    )
                    Text(
                        text = "MessengerX",
                        modifier = Modifier.padding(8.dp, top = 0.dp, bottom = 8.dp),
                        style = typography.body2

                    )
                }

            }
            if (config.twitterUserName != null) Row(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable(
                        onClick = {
                            startTwitter(activity, config)
                        }
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    contentDescription ="Twitter Icon",
                    alignment = Alignment.Center,
                    painter = twittericon,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxHeight(),
                    contentScale = ContentScale.FillBounds

                )
                Column() {
                    Text(
                        text = "Twitter",
                        modifier = Modifier.padding(8.dp, top = 8.dp, bottom = 0.dp),
                        style = typography.subtitle1

                    )
                    Text(
                        text = "MessengerX",
                        modifier = Modifier.padding(8.dp, top = 0.dp, bottom = 8.dp),
                        style = typography.body2

                    )
                }
            }
            if (config.companyHtmlPath != null) Row(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable(
                        onClick = {
                            openHTMLPage(
                                activity, config.companyHtmlPath
                            )
                        }
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    contentDescription ="Website Icon" ,
                    alignment = Alignment.Center,
                    painter = webIcon,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxHeight(),
                    contentScale = ContentScale.FillBounds

                )
                Column() {
                    Text(
                        text = "Website",
                        modifier = Modifier.padding(8.dp, top = 8.dp, bottom = 0.dp),
                        style = typography.subtitle1

                    )
                    Text(
                        text = "MessengerX.io",
                        modifier = Modifier.padding(8.dp, top = 0.dp, bottom = 8.dp),
                        style = typography.body2

                    )
                }
            }

        }
    }
}


@Composable
fun privacyCards(activity: Activity, config: AboutConfig) {
    val privacyIcon = painterResource(ic_privacy)
    val acknowledgementIcon = painterResource(ic_acknowledgement)

    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    )
    {
        Column() {
            if (config.privacyHtmlPath != null) Row(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable(
                        onClick = {
                            openHTMLPage(
                                activity, config.privacyHtmlPath
                            )
                        }
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    contentDescription = "Privacy Icon " ,
                    alignment = Alignment.Center,
                    painter = privacyIcon,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxHeight(),
                    contentScale = ContentScale.FillBounds

                )
                Text(
                    text = "Privacy Policy ",
                    modifier = Modifier.padding(8.dp)
                )
            }
            if (config.acknowledgmentHtmlPath != null) Row(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable(
                        onClick = {
                            openHTMLPage(
                                activity, config.acknowledgmentHtmlPath
                            )
                        }
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    contentDescription = " Acknowledgement Icon",
                    alignment = Alignment.Center,
                    painter = acknowledgementIcon,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxHeight(),
                    contentScale = ContentScale.FillBounds

                )
                Text(
                    text = "Acknowledgement",
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
fun tryOtherApp(activity: Activity, config: AboutConfig) {

    val tryOtherIcon = painterResource(ic_try_other_apps)
    val aboutIcon = painterResource(ic_about)
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    )
    {
        Column() {
            if (config.appPublisher != null) Row(

                modifier = Modifier
                    .fillMaxSize()
                    .clickable(
                        onClick = {
                            openPublisher(
                                activity,
                                config
                            )
                        }
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    contentDescription = " Try other apps Icon" ,
                    alignment = Alignment.Center,
                    painter = tryOtherIcon,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxHeight(),
                    contentScale = ContentScale.FillBounds

                )
                Text(
                    text = "Try Other Apps",
                    modifier = Modifier.padding(8.dp)
                )
            }
            if (config.webHomePage != null) Row(

                modifier = Modifier
                    .fillMaxSize()
                    .clickable(
                        onClick = {
                            openHTMLPage(
                                activity,
                                config.webHomePage
                            )
                        }
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    contentDescription = " About ICon" ,
                    alignment = Alignment.Center,
                    painter = aboutIcon,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxHeight(),
                    contentScale = ContentScale.FillBounds

                )
                Text(
                    text = "About MessengerX Beta",
                    modifier = Modifier.padding(8.dp)
                )
            }

        }
    }
}

@Composable
fun reviewCards(activity: Activity, config: AboutConfig) {

    val reviewIcon = painterResource(ic_review)
    val shareIcon = painterResource(ic_share)
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    )
    {
        Column() {
            if (config.packageName != null) Row(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable(
                        onClick = {
                            openApp(
                                activity,
                                config
                            )
                        }
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    contentDescription = "Review Icon",

                    alignment = Alignment.Center,
                    painter = reviewIcon,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxHeight(),
                    contentScale = ContentScale.FillBounds

                )
                Text(
                    text = "Leave Review",
                    modifier = Modifier.padding(8.dp)
                )
            }
            if (config.packageName != null && config.shareMessage != null) Row(

                modifier = Modifier
                    .fillMaxSize()
                    .clickable(
                        onClick = {
                            share(activity = activity, config = config)
                        }
                    ),
                verticalAlignment = Alignment.CenterVertically,


                ) {
                Image(
                    contentDescription = "Share Icon",
                    alignment = Alignment.Center,
                    painter = shareIcon,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxHeight(),
                    contentScale = ContentScale.FillBounds

                )
                Text(
                    text = "Share",
                    modifier = Modifier.padding(8.dp)
                )
            }

        }

    }
}

@Composable
fun supportCard(activity: Activity, config: AboutConfig) {
    val supportIcon = painterResource(ic_email)
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    )
    {
        if (config.emailAddress != null) Row(

            modifier = Modifier
                .fillMaxSize()
                .clickable(
                    onClick = {
                        sendEmail(
                            activity, config = config
                        )
                    }
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                contentDescription = "Support Icon" ,
                alignment = Alignment.Center,
                painter = supportIcon,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxHeight(),
                contentScale = ContentScale.FillBounds

            )
            Text(
                text = "Contact Support",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Composable
fun topCards(config: AboutConfig) {
    var supportIcon: Painter = painterResource(ic_web)
    if (config.appIcon != null) {
        supportIcon = painterResource(config.appIcon!!.toInt())
    }
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        elevation = 4.dp
    )
    {
        if (config.appName != null && config.version != null) Row(

            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (config.appIcon != null) Image(
                contentDescription = "Support Icon" ,
                alignment = Alignment.Center,
                painter = supportIcon,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxHeight(),
                contentScale = ContentScale.FillBounds

            )
            Column() {
                Text(
                    text = "${config.appName}",
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = "Version",
                    style = typography.subtitle2,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    text = "${config.version}",
                    style = typography.body2,
                    modifier = Modifier.padding(
                        start = 8.dp,
                        end = 8.dp,
                        top = 0.dp,
                        bottom = 8.dp
                    )
                )
            }
        }
    }
}


// property (data member)
fun share(activity: Activity, config: AboutConfig) {
    val intent2 = Intent();
    intent2.setAction(Intent.ACTION_SEND);
    intent2.setType("text/plain");
    var shareMessage = config.shareMessage;



    shareMessage =
        shareMessage + "https://play.google.com/store/apps/details?id=" + config.packageName;


    intent2.putExtra(Intent.EXTRA_TEXT, shareMessage);

    activity.startActivity(Intent.createChooser(intent2, "Hey"));
}

