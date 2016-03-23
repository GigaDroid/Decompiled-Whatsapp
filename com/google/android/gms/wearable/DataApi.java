package com.google.android.gms.wearable;

public interface DataApi {

    public interface DataListener {
        void onDataChanged(DataEventBuffer dataEventBuffer);
    }
}
