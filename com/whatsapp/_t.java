package com.whatsapp;

import android.location.Address;
import android.widget.TextView;

class _t implements Runnable {
    final anu a;
    final TextView b;
    final StringBuilder c;
    final Address d;

    public void run() {
        if (this.d.getMaxAddressLineIndex() > 0) {
            LocationPicker2.d(this.a.b).name = this.d.getAddressLine(0);
        }
        LocationPicker2.d(this.a.b).address = this.c.toString();
        this.b.setText(this.c.toString());
    }

    _t(anu com_whatsapp_anu, Address address, StringBuilder stringBuilder, TextView textView) {
        this.a = com_whatsapp_anu;
        this.d = address;
        this.c = stringBuilder;
        this.b = textView;
    }
}
