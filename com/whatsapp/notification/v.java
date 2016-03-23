package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;

class v implements OnClickListener {
    final PopupNotification a;

    v(PopupNotification popupNotification) {
        this.a = popupNotification;
    }

    public void onClick(View view) {
        App.a_();
        PopupNotification.o(this.a).a(this.a.findViewById(2131755843));
    }
}
