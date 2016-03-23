package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import java.util.HashMap;

class wx implements OnItemLongClickListener {
    final cg a;
    final ListView b;

    wx(cg cgVar, ListView listView) {
        this.a = cgVar;
        this.b = listView;
    }

    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        auz a = ContactPicker.a(this.a.a, this.b);
        int a2 = ContactPicker.a(this.a.a, this.b, i);
        if (a2 < ContactPicker.h(this.a.a).getCount()) {
            l5 a3 = a.a(a2);
            if (aup.a(a3.p)) {
                return false;
            }
            ContactPicker.a(this.a.a, new HashMap());
            ContactPicker.n(this.a.a).put(a3.p, a3);
            this.a.a.l();
            ContactPicker.k(this.a.a);
        }
        return true;
    }
}
