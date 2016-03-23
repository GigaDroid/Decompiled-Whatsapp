package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class e5 implements OnCheckedChangeListener {
    final GroupChatInfo a;

    e5(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            MuteDialogFragment.a(GroupChatInfo.q(this.a)).show(this.a.getSupportFragmentManager(), null);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        a3b.a(this.a.getBaseContext()).a(GroupChatInfo.q(this.a));
    }
}
