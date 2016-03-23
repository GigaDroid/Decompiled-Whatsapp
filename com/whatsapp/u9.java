package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class u9 implements OnItemClickListener {
    final BroadcastDetails a;

    u9(BroadcastDetails broadcastDetails) {
        this.a = broadcastDetails;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        l5 l5Var = (l5) view.getTag();
        if (l5Var != null) {
            BroadcastDetails.a(this.a, l5Var);
            this.a.showDialog(3);
        }
    }
}
