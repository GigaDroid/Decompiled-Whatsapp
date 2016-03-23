package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.i8;

class av implements OnClickListener {
    final PopupNotification a;
    final i8 b;

    av(PopupNotification popupNotification, i8 i8Var) {
        this.a = popupNotification;
        this.b = i8Var;
    }

    public void onClick(View view) {
        this.b.d();
    }
}
