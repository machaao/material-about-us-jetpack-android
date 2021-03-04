package com.mx.aboutpage


class AboutConfig {

    //    general info
    var appName: String? = null
    var appIcon :Int ? = null
    var version: String? = null
    var aboutLabelTitle: String? = null
    var facebookUserPageId: String? = null
    var facebookUserName: String? = null
    var twitterUserName: String? = null
    var webHomePage: String? = null
    var appPublisher: String? = null
    var companyHtmlPath: String? = null
    var privacyHtmlPath: String? = null
    var acknowledgmentHtmlPath: String? = null
    var packageName: String? = null

    //  For email
    var emailAddress: String? = null
    var emailSubject: String? = null
    //Not using Currently
    var emailBody: String? = null

    var shareMessage: String? = null


    object SingletonHolder {
        val HOLDER_INSTANCE = AboutConfig()
    }

    fun getInstance(): AboutConfig {
        return SingletonHolder.HOLDER_INSTANCE
    }

}