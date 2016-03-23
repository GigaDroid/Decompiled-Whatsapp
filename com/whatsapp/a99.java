package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class a99 implements OnCheckedChangeListener {
    final GroupChatInfo a;

    a99(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.findViewById(2131755194).setEnabled(false);
        GroupChatInfo.i(this.a).setVisibility(4);
        this.a.findViewById(2131755196).setVisibility(0);
        if (z) {
            App.a(new a_y(this, GroupChatInfo.q(this.a), 0));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.a(new a_h(this, GroupChatInfo.q(this.a)));
    }
}
