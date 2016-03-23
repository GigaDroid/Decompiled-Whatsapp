package com.google.android.gms.common.api;

public interface PendingResult {

    public interface BatchCallback {
        void onComplete(Status status);
    }

    Result await();
}
