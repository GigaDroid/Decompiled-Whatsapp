package com.google.android.gms.wearable;

public interface CapabilityApi {

    public interface CapabilityListener {
        void onCapabilityChanged(CapabilityInfo capabilityInfo);
    }
}
