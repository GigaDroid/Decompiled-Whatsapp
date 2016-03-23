package com.whatsapp;

import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.view.MenuItem;

class v3 implements OnMenuItemClickListener {
    final GroupChatLiveLocationsActivity a;

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.a.onOptionsItemSelected(menuItem);
    }

    v3(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
    }
}
