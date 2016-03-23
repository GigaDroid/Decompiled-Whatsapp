package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a5y implements OnClickListener {
    final l5 a;
    final pr b;

    public void onClick(View view) {
        this.b.a.w.remove(this.a);
        this.b.notifyDataSetChanged();
        this.b.a.i();
    }

    a5y(pr prVar, l5 l5Var) {
        this.b = prVar;
        this.a = l5Var;
    }
}
