package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.cd;

class asq implements OnClickListener {
    final ContactInfo a;

    asq(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void onClick(View view) {
        App.a(ContactInfo.h(this.a), this.a, cd.CONTACT_INFO, true);
    }
}
