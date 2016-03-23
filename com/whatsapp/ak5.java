package com.whatsapp;

import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.view.View.OnClickListener;

class ak5 implements OnClickListener {
    final Conversation a;

    ak5(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(View view) {
        boolean z = DialogToastActivity.f;
        ActivityOptionsCompat makeSceneTransitionAnimation = ActivityOptionsCompat.makeSceneTransitionAnimation(this.a, this.a.findViewById(2131755492), this.a.getString(2131232335));
        if (Conversation.g(this.a)) {
            GroupChatInfo.a(this.a.aI, this.a, makeSceneTransitionAnimation);
            if (!z) {
                return;
            }
        }
        if (Conversation.ay(this.a)) {
            ListChatInfo.a(this.a.aI, this.a, makeSceneTransitionAnimation);
            if (!z) {
                return;
            }
        }
        ContactInfo.a(this.a.aI, this.a, makeSceneTransitionAnimation);
    }
}
