package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.whatsapp.protocol.cx;

class ath implements OnItemClickListener {
    final aox a;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = true;
        cx cxVar = (cx) this.a.j.get(i);
        if (!(this.a.i.size() == 1 && this.a.i.get(0) == cxVar)) {
            z = false;
        }
        this.a.i.clear();
        this.a.i.add(this.a.j.get(i));
        aox.d(this.a).notifyDataSetChanged();
        this.a.a(cxVar, z);
    }

    ath(aox com_whatsapp_aox) {
        this.a = com_whatsapp_aox;
    }
}
