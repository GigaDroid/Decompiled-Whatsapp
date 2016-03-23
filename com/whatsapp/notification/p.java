package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;

class p implements OnClickListener {
    final PopupNotification a;

    public void onClick(View view) {
        App.g.stop();
        PopupNotification.g(this.a);
        this.a.finish();
    }

    p(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
