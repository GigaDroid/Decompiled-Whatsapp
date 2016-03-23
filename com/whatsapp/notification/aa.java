package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;

class aa implements OnClickListener {
    final PopupNotification a;

    public void onClick(View view) {
        App.a_();
        if (PopupNotification.h(this.a) != null) {
            PopupNotification.s(this.a).add(PopupNotification.h(this.a).k);
        }
        if (PopupNotification.a(this.a) != null) {
            PopupNotification.l(this.a).add(PopupNotification.a(this.a).p);
        }
    }

    aa(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
