package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class ah implements OnItemClickListener {
    final SetStatus a;

    ah(SetStatus setStatus) {
        this.a = setStatus;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.e((String) SetStatus.v.get(i));
    }
}
