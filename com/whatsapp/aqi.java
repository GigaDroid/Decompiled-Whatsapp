package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bq;

class aqi implements OnClickListener {
    final GroupChatInfo a;

    aqi(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(View view) {
        if (qm.h(GroupChatInfo.q(this.a))) {
            this.a.f(2131231813);
            bq.a(new ks(this), new Object[0]);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.showDialog(1);
    }
}
