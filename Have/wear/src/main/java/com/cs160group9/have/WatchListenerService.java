package com.cs160group9.have;

import com.google.android.gms.wearable.MessageEvent;
import com.google.android.gms.wearable.WearableListenerService;

public class WatchListenerService extends WearableListenerService {

    private static String TAG = "WatchListenerService";

    @Override
    public void onMessageReceived(MessageEvent messageEvent) {
        if (messageEvent.getPath().equalsIgnoreCase("yyyyy")) {

        } else {
            super.onMessageReceived(messageEvent);
        }
    }
}
