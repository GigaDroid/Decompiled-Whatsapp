package com.google.android.gms.wearable;

public interface MessageApi {

    public interface MessageListener {
        void onMessageReceived(MessageEvent messageEvent);
    }
}
