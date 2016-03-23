package com.whatsapp.notification;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.App;
import com.whatsapp.Conversation;
import com.whatsapp.qa;

class a implements OnClickListener {
    final PopupNotification a;

    public void onClick(View view) {
        App.g.stop();
        String trim = PopupNotification.c(this.a).getText().toString().trim();
        if (PopupNotification.a(this.a) != null && trim.length() > 0) {
            Conversation.U.put(PopupNotification.a(this.a).p, trim);
        }
        this.a.startActivity(Conversation.a(qa.d(PopupNotification.h(this.a).k.c)));
        PopupNotification.g(this.a);
        this.a.finish();
    }

    a(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
