package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class UpdatedOurAppReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        UpdatedAnyAppReceiver.a();
    }
}
