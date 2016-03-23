package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class os implements OnClickListener {
    final GroupChatRecentLocationsActivity a;

    os(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }

    public void onClick(View view) {
        GroupChatRecentLocationsActivity.d(this.a);
        if (GroupChatRecentLocationsActivity.i(this.a) < -1) {
            GroupChatRecentLocationsActivity.a(this.a, GroupChatRecentLocationsActivity.f(this.a).size() - 1);
        }
        GroupChatRecentLocationsActivity.e(this.a);
    }
}
