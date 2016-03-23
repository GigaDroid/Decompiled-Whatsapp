package com.whatsapp;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

class ke implements OnCheckedChangeListener {
    final ContactInfo a;

    ke(ContactInfo contactInfo) {
        this.a = contactInfo;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            MuteDialogFragment.a(ContactInfo.h(this.a).p).show(this.a.getSupportFragmentManager(), null);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        a3b.a(this.a.getBaseContext()).a(ContactInfo.h(this.a).p);
    }
}
