package com.whatsapp.notification;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class a9 implements OnTouchListener {
    final PopupNotification a;

    a9(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        return PopupNotification.k(this.a).a(PopupNotification.n(this.a), motionEvent);
    }
}
