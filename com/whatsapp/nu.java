package com.whatsapp;

import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.view.MenuItem;

class nu implements OnMenuItemClickListener {
    final GroupChatRecentLocationsActivity a;

    public boolean onMenuItemClick(MenuItem menuItem) {
        return this.a.onOptionsItemSelected(menuItem);
    }

    nu(GroupChatRecentLocationsActivity groupChatRecentLocationsActivity) {
        this.a = groupChatRecentLocationsActivity;
    }
}
