package com.angopapo.datooapp.app;


public class Config {


    // Parse Server
    public static final String SERVER_URL = "https://parseapi.back4app.com/";
    public static final String LIVE_QUERY_URL = "wss://appname.back4app.io/";
    static final String SERVER_APP_ID = "frWIod1OzfEP1djfjjfFMQSqseeI3bK"; // ApplicationID
    static final String SERVER_CLIENT_KEY = "2GT2QwemIPDo3Mzukfkd7ULlAy0TCai4dL"; // ClientKey

    // Push notifications
    public static final String CHANNEL = "global";

    // Agora API
    public static final String AGORA_APP_ID = "33c7a4jdjnsnnsd6578a34bedb";

    // Instagram API
    public static final String INSTAGRAM_APP_ID = "72707783379";
    public static final String INSTAGRAM_APP_SECRET = "lrj9HGkh3499nndolrj9HGkh348fMSNv";
    public static final String INSTAGRAM_REDIRECT_URI = "https://www.angopapo.com/";

    // Google Admob
    static final String HOME_BANNER_ADS = "ca-app-pub-6063947675651593/4281466809";
    static final String REWARDED_ADS= "ca-app-pub-6063947675651593/5672771222";
    static final String NEARBY_NATIVE_ADS = "ca-app-pub-6063947675651593/7837568432";
    static final String ENCOUNTERS_NATIVE_ADS = "ca-app-pub-6063947675651593/7837568432";

    // Credits needed to activate features
    public static int TYPE_RISE_UP = 50;
    public static int TYPE_GET_MORE_VISITS = 100;
    public static int TYPE_ADD_EXTRA_SHOWS = 100;
    public static int TYPE_SHOW_IM_ONLINE = 100;
    public static int TYPE_3X_POPULAR = 200;

    // Amount of days to activate features
    public static int DAYS_TO_ACTIVATE_FEATURES = 7;

    // Google Play In-app Purchases IDs
    public static final String CREDIT_550 = "datoo.550.credits";
    public static final String CREDIT_100 = "datoo.100.credits";
    public static final String CREDIT_1250 = "datoo.1250.credits";
    public static final String CREDIT_2750 = "datoo.2750.credits";

    public static final String PAY_LIFETIME = "datoo.pay.lifetime";

    //Google Play In-app Subscription IDs
    public static final String SUBS_3_MONTHS = "datoo.3.months";
    public static final String SUBS_1_WEEK = "datoo.1.week";
    public static final String SUBS_1_MONTH = "datoo.1.month";
    public static final String SUBS_6_MONTHS = "datoo.6.months";

    // Web links for help, privacy policy and terms of use.
    public static final String HELP_CENTER = "https://datoo.angopapo.com/help.html";
    public static final String PRIVACY_POLICY = "https://datoo.angopapo.com/privacy.html";
    public static final String TERMS_OF_USE = "https://datoo.angopapo.com/terms.html";
    public static final String TERMS_OF_USE_IN_APP = "https://datoo.angopapo.com/terms.html";

    // Enable or Disable Ads and Premium.
    public static final boolean isAdsActivated = true;
    public static final boolean isPremiumEnabled = true;
    public static final boolean isNearByNativeAdsActivated = false;
    public static final boolean isEncountersNativeAdsActivated = true;

    // Application setup
    public static final String bio = "Hey! i'm using datoo!";
    public static final int WelcomeCredit = 10;
    public static final int MinimumAgeToRegister = 18;
    public static final int MaximumAgeToRegister = 80;
    public static final int MaxUsersNearToShow = 100;
    public static final int DistanceForRealBadge = 1;
    public static final int DistanceForRealKm = 20;
    public static final int MinDistanceBetweenUsers = 2;
    public static final int MaxDistanceBetweenUsers = 1000;
    public static final double DistanceBetweenUsersLive = 1000;
    public static final boolean ShowBlockedUsersOnQuery = true;
    public static final boolean isVideoCallEnabled = true;
    public static final boolean isVoiceCallEnabled = true;
    public static final int ShowNearbyNativeAdsAfter = 9;
    public static final int ShowEncountersNativeAdsAfter = 2;

    // Enable or Disable paid messages.
    public static final boolean isPaidMessagesActivated = false;
    public static final int freeMessagesInTotal = 10;
    public static final int freeMessagesPerDay = 5;

    // Enable or Disable Fake messages.
    public static final boolean isFakeMessagesActivated = false;
    public static final String defaultFakeMessage = "Hello, how are you ?";
}