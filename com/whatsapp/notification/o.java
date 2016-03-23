package com.whatsapp.notification;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.arj;

class o implements OnClickListener {
    final PopupNotification a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(arj.Theme_ratingBarStyle);
    }

    o(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
