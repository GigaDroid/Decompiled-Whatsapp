package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

class j6 implements OnItemClickListener {
    final DialogToastListActivity a;

    j6(DialogToastListActivity dialogToastListActivity) {
        this.a = dialogToastListActivity;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.a((ListView) adapterView, view, i, j);
    }
}
