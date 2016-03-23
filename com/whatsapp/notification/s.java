package com.whatsapp.notification;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.arj;
import com.whatsapp.aup;

class s implements OnClickListener {
    final PopupNotification a;

    s(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        aup.a(this.a, false, PopupNotification.a(this.a).p);
        this.a.removeDialog(arj.Theme_ratingBarStyle);
    }
}
