package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class nq implements OnClickListener {
    final ContactInfo a;

    public void onClick(View view) {
        MuteDialogFragment.a(ContactInfo.h(this.a).p).show(this.a.getSupportFragmentManager(), null);
    }

    nq(ContactInfo contactInfo) {
        this.a = contactInfo;
    }
}
