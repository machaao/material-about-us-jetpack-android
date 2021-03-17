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
implementation 'com.github.amanv8060:aboutpagelib:2.0.1'
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


## If You want to use your own theme
```kotlin
         YourThemeName(){
         setContent {
            //Launches the about Page
             AboutActivity().launchWithoutDefaultTheme(activity = this)
        }
       }
```
 

## Screenshot
<img src="Screenshot_1615223933.png?raw=true" height=400 width =200>

## Use in Existing Java app 
<details><summary> See How </summary>
Follow these Steps On Android Studio Canary Build 

1. Create a Empty Compose Activity in java project First

2 . In Your project build.gradle  include 

```
buildscript {
    ext {
        compose_version = '1.0.0-beta01'
    }
    repositories {
        google()
        mavenCentral()  //Add this line 
    }
    dependencies {
        classpath "com.android.tools.build:gradle:7.0.0-alpha09" 

          //Note Match the version in this line
        classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21'

    }
}
```


3. In Your App build.gradle include 

```
androd {

//rest of the content 
kotlinOptions {
        jvmTarget = '1.8'
        useIR = true
    }
    buildFeatures {
        compose true
    }
    composeOptions {
        kotlinCompilerExtensionVersion compose_version
        kotlinCompilerVersion '1.4.30'
    }
}
```

and add following dependencies 

```
dependencies {

   implementation 'com.github.amanv8060:aboutpagelib:2.0.1'
    implementation 'androidx.appcompat:appcompat:1.2.0'

    implementation 'androidx.activity:activity-ktx:1.2.0'
    implementation 'androidx.core:core-ktx:1.5.0-beta01'
    implementation "androidx.activity:activity-compose:1.3.0-alpha03"
    implementation 'com.google.android.material:material:1.3.0'

    implementation "androidx.compose.runtime:runtime:$compose_version"
    implementation "androidx.compose.ui:ui:$compose_version"
    implementation "androidx.compose.foundation:foundation-layout:$compose_version"
    implementation "androidx.compose.material:material:$compose_version"
    implementation "androidx.compose.material:material-icons-extended:$compose_version"
    implementation "androidx.compose.foundation:foundation:$compose_version"
    implementation "androidx.compose.animation:animation:$compose_version"
    implementation "androidx.compose.ui:ui-tooling:$compose_version"
    implementation "androidx.compose.runtime:runtime-livedata:$compose_version"

    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.3.0'
    implementation 'android.library:file:1.0.1'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
}

```

Android Studio will automatically add some of the above mentioned dependencies   , so keep an eye for duplicates

4.clean Project 

5. Use package normally as mentioned  [here](https://github.com/amanv8060/aboutpagelib#setup-aboutbox)


</details>
