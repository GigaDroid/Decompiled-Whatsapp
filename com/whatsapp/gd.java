package com.whatsapp;

import android.support.v7.widget.SearchView.OnQueryTextListener;

class gd implements OnQueryTextListener {
    final HomeActivity a;

    gd(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }

    public boolean onQueryTextChange(String str) {
        o3 a = HomeActivity.a(this.a, HomeActivity.h(this.a));
        if (a != null) {
            a.a(str);
        }
        return false;
    }
}
