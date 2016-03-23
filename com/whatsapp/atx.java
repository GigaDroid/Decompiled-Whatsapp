package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class atx implements OnGlobalLayoutListener {
    final GroupChatLiveLocationsActivity2 a;

    public void onGlobalLayout() {
        GroupChatLiveLocationsActivity2.h(this.a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (GroupChatLiveLocationsActivity2.h(this.a).getWidth() > 0 && GroupChatLiveLocationsActivity2.h(this.a).getHeight() > 0) {
            GroupChatLiveLocationsActivity2.b(this.a, false);
        }
    }

    atx(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.a = groupChatLiveLocationsActivity2;
    }
}
