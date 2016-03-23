package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a4o implements OnClickListener {
    final GroupChatInfo a;

    a4o(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(View view) {
        MuteDialogFragment.a(GroupChatInfo.q(this.a)).show(this.a.getSupportFragmentManager(), null);
    }
}
