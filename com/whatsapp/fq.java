package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class fq implements OnItemClickListener {
    final WebSessionsActivity a;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        i6 a = WebSessionsActivity.c(this.a).a(i - 1);
        if (a.l == 0.0d && a.e == 0.0d && a.a == 0.0d) {
            App.a(this.a, 2131231408, 0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        ConversationRowLocation.a(this.a, a.l, a.e, null);
    }

    fq(WebSessionsActivity webSessionsActivity) {
        this.a = webSessionsActivity;
    }
}
