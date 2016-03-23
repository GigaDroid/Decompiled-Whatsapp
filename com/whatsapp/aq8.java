package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class aq8 implements OnClickListener {
    final GroupChatInfo a;

    aq8(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(6);
        GroupChatInfo.b(this.a, GroupChatInfo.y(this.a).p);
    }
}
