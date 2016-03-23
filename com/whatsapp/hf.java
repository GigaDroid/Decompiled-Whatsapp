package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

class hf implements OnPreDrawListener {
    final View a;
    final GroupChatInfo b;

    public boolean onPreDraw() {
        GroupChatInfo.j(this.b).d();
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }

    hf(GroupChatInfo groupChatInfo, View view) {
        this.b = groupChatInfo;
        this.a = view;
    }
}
