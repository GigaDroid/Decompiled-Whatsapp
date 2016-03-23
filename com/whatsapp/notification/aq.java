package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;

class aq implements OnClickListener {
    final PopupNotification a;

    aq(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void onClick(View view) {
        PopupNotification.p(this.a);
    }
}
