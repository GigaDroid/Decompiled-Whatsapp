package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;

class ak implements OnClickListener {
    final PopupNotification a;

    ak(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void onClick(View view) {
        PopupNotification.m(this.a);
    }
}
