package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ady implements OnClickListener {
    final VerifySms a;

    public void onClick(View view) {
        VerifySms.d(this.a, true);
    }

    ady(VerifySms verifySms) {
        this.a = verifySms;
    }
}
