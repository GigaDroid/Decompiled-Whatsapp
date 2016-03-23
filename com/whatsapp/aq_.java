package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class aq_ implements OnClickListener {
    final GroupChatRecentLocationsActivity a;

    aq_(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }

    public void onClick(View view) {
        GroupChatRecentLocationsActivity.j(this.a);
        if (GroupChatRecentLocationsActivity.i(this.a) >= GroupChatRecentLocationsActivity.f(this.a).size()) {
            GroupChatRecentLocationsActivity.a(this.a, -1);
        }
        GroupChatRecentLocationsActivity.e(this.a);
    }
}
