package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;

class g implements OnClickListener {
    final PopupNotification a;

    g(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void onClick(View view) {
        PopupNotification.j(this.a);
    }
}
