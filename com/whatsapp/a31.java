package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class a31 implements OnClickListener {
    final aol a;
    final l_ b;

    a31(l_ l_Var, aol com_whatsapp_aol) {
        this.b = l_Var;
        this.a = com_whatsapp_aol;
    }

    public void onClick(View view) {
        l_.a(this.b, ((Integer) view.getTag()).intValue());
    }
}
