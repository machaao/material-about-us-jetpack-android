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
import androidx.core.content.ContextCompat.startActivity
import com.mx.aboutpage.ui.theme.typography

///This Function returns all the social cards that are currently being shown in the ui
@Composable
fun socialCards(activity: Activity, config: AboutConfig) {

    val fbicon = vectorResource(R.drawable.ic_facebook)
    val twittericon = vectorResource(R.drawable.ic_twitter)
    val webIcon = vectorResource(R.drawable.ic_web)
    Card(
            modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
            elevation = 4.dp
    )
    {
        Column() {
            if(config.facebookUserName!=null&&config.facebookUserPageId!=null)  Row(
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
                        alignment = Alignment.Center,
                        imageVector = fbicon,
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
            if(config.twitterUserName!=null) Row(
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
                        alignment = Alignment.Center,
                        imageVector = twittericon,
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
          if(config.companyHtmlPath!=null)  Row(
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
                        alignment = Alignment.Center,
                        imageVector = webIcon,
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
    val privacyIcon = vectorResource(R.drawable.ic_privacy)
    val acknowledgementIcon = vectorResource(R.drawable.ic_acknowledgement)

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
                        alignment = Alignment.Center,
                        imageVector = privacyIcon,
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
                        alignment = Alignment.Center,
                        imageVector = acknowledgementIcon,
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

    val tryOtherIcon = vectorResource(R.drawable.ic_try_other_apps)
    val aboutIcon = vectorResource(R.drawable.ic_about)
    Card(
            modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
            elevation = 4.dp
    )
    {
        Column() {
          if(config.appPublisher!=null)  Row(

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
                        alignment = Alignment.Center,
                        imageVector = tryOtherIcon,
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
           if(config.webHomePage!=null) Row(

                    modifier = Modifier.fillMaxSize() .clickable(
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
                        alignment = Alignment.Center,
                        imageVector = aboutIcon,
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

    val reviewIcon = vectorResource(R.drawable.ic_review)
    val shareIcon = vectorResource(R.drawable.ic_share)
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
                        alignment = Alignment.Center,
                        imageVector = reviewIcon,
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
                        alignment = Alignment.Center,
                        imageVector = shareIcon,
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
    val supportIcon = vectorResource(R.drawable.ic_email)
    Card(
            modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
            elevation = 4.dp
    )
    {
        if(config.emailAddress!=null)Row(

                modifier = Modifier
                        .fillMaxSize()
                        .clickable(
                                onClick = {
                                    sendEmail(
                                            activity, config = config)
                                }
                        ),
                verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                    alignment = Alignment.Center,
                    imageVector = supportIcon,
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

    val supportIcon = vectorResource(R.drawable.ic_green)
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
            Image(
                    alignment = Alignment.Center,
                    imageVector = supportIcon,
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

