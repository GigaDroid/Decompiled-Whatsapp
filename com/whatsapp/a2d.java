package com.whatsapp;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.whatsapp.protocol.co;

class a2d implements OnLongClickListener {
    final GroupChatRecentLocationsActivity a;

    public boolean onLongClick(View view) {
        GroupChatRecentLocationsActivity.a(this.a, null);
        Object tag = view.getTag();
        if (tag != null) {
            co a = GroupChatRecentLocationsActivity.a(this.a, tag.toString());
            if (a != null) {
                GroupChatRecentLocationsActivity.a(this.a, App.as.b(a.t));
                this.a.removeDialog(0);
                this.a.showDialog(0);
            }
        }
        return true;
    }

    a2d(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }
}
