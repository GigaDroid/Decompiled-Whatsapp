package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.co;

class j0 implements OnClickListener {
    final cg a;

    j0(cg cgVar) {
        this.a = cgVar;
    }

    public void onClick(View view) {
        NewGroup.a(this.a.a, co.CONTACTS, null);
    }
}
