package com.whatsapp.gdrive;

import android.widget.TextView;

class d7 implements Runnable {
    final String a;
    final d3 b;

    d7(d3 d3Var, String str) {
        this.b = d3Var;
        this.a = str;
    }

    public void run() {
        ((TextView) this.b.b.findViewById(2131755212)).setText(this.b.b.getString(2131231401, new Object[]{null, this.b.a, this.a}));
    }
}
