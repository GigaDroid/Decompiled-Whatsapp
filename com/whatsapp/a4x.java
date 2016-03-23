package com.whatsapp;

import android.view.ViewTreeObserver.OnPreDrawListener;

class a4x implements OnPreDrawListener {
    final GroupChatLiveLocationsActivity a;

    a4x(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
    }

    public boolean onPreDraw() {
        GroupChatLiveLocationsActivity.g(this.a).getViewTreeObserver().removeOnPreDrawListener(this);
        GroupChatLiveLocationsActivity.d(this.a);
        return true;
    }
}
