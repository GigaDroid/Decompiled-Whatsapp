package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class atr implements OnClickListener {
    final GroupChatInfo a;

    atr(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(View view) {
        if (qm.h(GroupChatInfo.q(this.a))) {
            this.a.showDialog(50);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.f(this.a.getString(2131232085));
    }
}
