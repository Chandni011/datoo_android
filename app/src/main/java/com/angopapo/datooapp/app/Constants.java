package com.angopapo.datooapp.app;


import com.angopapo.datooapp.BuildConfig;
import com.angopapo.datooapp.R;

import io.agora.rtc.video.VideoEncoderConfiguration;

public class Constants {

    public static final String LOG_TAG = Application.getInstance().getCurrentActivity().getString(R.string.app_name);

    private static final boolean DEBUGGING_MODE = BuildConfig.DEBUG;

    // Online/offline track
    public static long TIME_TO_SOON = 60 * 1000;
    public static long TIME_TO_OFFLINE = 2 * 60 * 1000;

    public static final String INSTAGRAM_URL = "https://graph.instagram.com/";

    // Shared preferences
    public static final String IS_NEARBY_NEW = "IS_NEARBY_NEW";
    public static final String IS_NEARBY_SHOWCASE_SHOWED = "IS_NEARBY_SHOWCASE_SHOWED";
    public static final String IS_ENCOUNTERS_SHOWCASE_SHOWED = "IS_ENCOUNTERS_SHOWCASE_SHOWED";
    public static final String CONNECTION_COUNTER_MESSAGES = "COUNTER_MESSAGES";
    public static final String CONNECTION_COUNTER_FAVORITES = "COUNTER_FAVORITES";

    private static final String HOME_BANNER_ADS_TEST = "ca-app-pub-3940256099942544/6300978111";
    private static final String REWARDED_ADS_TEST = "ca-app-pub-3940256099942544/5224354917";
    private static final String NATIVE_ADS_TEST = "ca-app-pub-3940256099942544/2247696110";

    public static String getRewardedAdsId(){

        if (Constants.DEBUGGING_MODE){
            return REWARDED_ADS_TEST;
        } else {
            return Config.REWARDED_ADS;
        }
    }

    public static String getHomeBannerAdsId(){

        if (Constants.DEBUGGING_MODE){
            return HOME_BANNER_ADS_TEST;
        } else {
            return Config.HOME_BANNER_ADS;
        }
    }

    public static String getNearByNativeAdsId(){

        if (Constants.DEBUGGING_MODE){
            return NATIVE_ADS_TEST;
        } else {
            return Config.NEARBY_NATIVE_ADS;
        }
    }

    public static String getEncountersNativeAdsId(){

        if (Constants.DEBUGGING_MODE){
            return NATIVE_ADS_TEST;
        } else {
            return Config.ENCOUNTERS_NATIVE_ADS;
        }
    }

    public static VideoEncoderConfiguration.VideoDimensions[] VIDEO_DIMENSIONS = new VideoEncoderConfiguration.VideoDimensions[] {
            VideoEncoderConfiguration.VD_320x240,
            VideoEncoderConfiguration.VD_480x360,
            VideoEncoderConfiguration.VD_640x360,
            VideoEncoderConfiguration.VD_640x480,
            new VideoEncoderConfiguration.VideoDimensions(960, 540),
            VideoEncoderConfiguration.VD_1280x720
    };

}
