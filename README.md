# About Box
A modern About Box for an Android App built on the [daniel-stoneuk/material-about-library](https://github.com/daniel-stoneuk/material-about-library).

### Easily display the common items of an About Box in a modern Android friendly way

## About

Android About Box is configured with a set of (mostly) strings for the company name, twitter and Facebook accounts, website, and filenames to html files for help files, privacy policy etc.

When triggered from a menu item, it will display the app name, icon and version, provide links to contact support, leave a review, share the app, go to other apps by the same company in the app store -- as well as links to Facebook etc.

You can omit most features if they don't apply (e.g. like website), by not setting the values.


A Example is available in the repo 

## Installation Instructions
Add MavenCentral As a repository in project build.gradle file
```
repositories {
        google()
        jcenter()
        mavenCentral()//NEW
    }
```

In app build.gradle dependencies add 

```
implementation 'com.github.amanv8060:aboutpagelib:1.0.1'
```

and you are good to go 

## Setup AboutBox

Add AboutBox configuration to your Application class

```java
        AboutConfig aboutConfig = AboutConfig.getInstance();
        aboutConfig.appName = APP_NAME;
        aboutConfig.appIcon = R.mipmap.ic_launcher;

        aboutConfig.version = "1.0.0";
        aboutConfig.aboutLabelTitle = "About App";
        aboutConfig.packageName = getApplicationContext.getPackageName;

        aboutConfig.facebookUserName = FACEBOOK_USER_NAME;
        aboutConfig.twitterUserName = TWITTER_USER_NAME;
        aboutConfig.webHomePage = WEB_HOME_PAGE;
        aboutConfig.appPublisher = APP_PUBLISHER;
        aboutConfig.companyHtmlPath = COMPANY_HTML_PATH;
        aboutConfig.privacyHtmlPath = PRIVACY_HTML_PATH;
        aboutConfig.acknowledgmentHtmlPath = ACKNOWLEDGMENT_HTML_PATH;
        aboutConfig.emailAddress = EMAIL_ADDRESS;
        aboutConfig.emailSubject = EMAIL_SUBJECT;
        aboutConfig.emailBody = EMAIL_BODY;


```

## Open the About Box from your app by writing the following line in setcontent

```kotlin
         setContent {
            //Launches the about Page
            AboutActivity().launch(this)
        }
```


## Theme
I will add a funtion that will let you input the theme also

## Screenshot
To add
