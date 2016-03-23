package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.TextView;

class awo implements Runnable {
    final GroupChatInfo a;

    public void run() {
        TextView textView = (TextView) this.a.findViewById(2131755194);
        this.a.findViewById(2131755196).setVisibility(4);
        GroupChatInfo.i(this.a).setVisibility(0);
        if (j2.a.a(GroupChatInfo.q(this.a))) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            textView.setEnabled(true);
            ((CompoundButton) GroupChatInfo.i(this.a)).setOnCheckedChangeListener(null);
            ((CompoundButton) GroupChatInfo.i(this.a)).setChecked(true);
            ((CompoundButton) GroupChatInfo.i(this.a)).setOnCheckedChangeListener(GroupChatInfo.p(this.a));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        textView.setPaintFlags(textView.getPaintFlags() & -9);
        textView.setEnabled(false);
        ((CompoundButton) GroupChatInfo.i(this.a)).setOnCheckedChangeListener(null);
        ((CompoundButton) GroupChatInfo.i(this.a)).setChecked(false);
        ((CompoundButton) GroupChatInfo.i(this.a)).setOnCheckedChangeListener(GroupChatInfo.p(this.a));
    }

    awo(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
