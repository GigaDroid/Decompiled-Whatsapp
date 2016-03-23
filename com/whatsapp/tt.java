package com.whatsapp;

import android.support.v7.widget.SearchView.OnQueryTextListener;

class tt implements OnQueryTextListener {
    final Conversations a;

    tt(Conversations conversations) {
        this.a = conversations;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }

    public boolean onQueryTextChange(String str) {
        Conversations.a(this.a).a(str);
        return false;
    }
}
