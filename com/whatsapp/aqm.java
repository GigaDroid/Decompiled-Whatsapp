package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class aqm implements OnItemClickListener {
    final BlockList a;

    aqm(BlockList blockList) {
        this.a = blockList;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.openContextMenu(view);
    }
}
