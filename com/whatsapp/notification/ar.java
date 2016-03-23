package com.whatsapp.notification;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class ar implements OnEditorActionListener {
    final PopupNotification a;

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        PopupNotification.j(this.a);
        return true;
    }

    ar(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
