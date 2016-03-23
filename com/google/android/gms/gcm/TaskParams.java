package com.google.android.gms.gcm;

import android.os.Bundle;

public class TaskParams {
    private final Bundle extras;
    private final String tag;

    public TaskParams(String str, Bundle bundle) {
        this.tag = str;
        this.extras = bundle;
    }
}
