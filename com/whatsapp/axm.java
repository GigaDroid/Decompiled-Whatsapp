package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class axm implements OnClickListener {
    final GroupChatRecentLocationsActivity a;

    public void onClick(View view) {
        GroupChatRecentLocationsActivity.a(this.a, -1);
        GroupChatRecentLocationsActivity.c(this.a).runOnFirstFix(new sz(this));
    }

    axm(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }
}
