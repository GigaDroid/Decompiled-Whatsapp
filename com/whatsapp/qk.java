package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class qk implements OnClickListener {
    final kt a;

    qk(kt ktVar) {
        this.a = ktVar;
    }

    public void onClick(View view) {
        this.a.a.showDialog(50);
    }
}
