# This doc is currently for version 1.0.1 

Demo Project available at : [this repo](https://github.com/amanv8060/Aboutpagelibdemo)

<details><summary># For Using on alpha channel of Jetpack Compose </summary>
Follow these Steps On Android Studio Canary Build 

1. Create a Empty Compose Activity in new java project First

2 . In Your project build.gradle  include 

```
buildscript {
    ext {
        compose_version = '1.0.0-alpha08'
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

Note if compose version mentioned is different change that to this 


```

dependencies {
        classpath "com.android.tools.build:gradle:7.0.0-alpha09"

        //Make Sure below line version is same 
        classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.21'
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
        kotlinCompilerVersion '1.4.21'
    }
}
```

and add following dependencies 

```
dependencies {

    implementation 'com.github.amanv8060:aboutpagelib:1.0.1'
    implementation 'androidx.core:core-ktx:1.3.2'
    implementation 'androidx.appcompat:appcompat:1.2.0'
    implementation 'com.google.android.material:material:1.3.0'
    implementation "androidx.compose.ui:ui:$compose_version"
    implementation "androidx.compose.material:material:$compose_version"
    implementation "androidx.compose.ui:ui-tooling:$compose_version"
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.3.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.2'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
}

```

4.clean Project 

5. Use package normally as mentioned  [here](https://github.com/amanv8060/aboutpagelib#setup-aboutbox)


</details>

<details><summary># For Using on beta channel of Jetpack Compose </summary>
Follow these Steps On Android Studio Canary Build 

1. Create a Empty Compose Activity in new java project First

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

   implementation 'com.github.amanv8060:aboutpagelib:2.0.0'
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

4.clean Project 

5. Use package normally as mentioned  [here](https://github.com/amanv8060/aboutpagelib#setup-aboutbox)


</details>
