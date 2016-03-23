package com.whatsapp.notification;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class PopupNotificationLocked extends PopupNotification {
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(-16777216));
    }
}
