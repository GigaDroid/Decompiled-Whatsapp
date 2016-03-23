package com.whatsapp;

import com.whatsapp.contact.i;
import com.whatsapp.contact.j;
import com.whatsapp.contact.o;

class vb implements Runnable {
    final ContactPicker a;
    final boolean b;

    public void run() {
        if (App.am >= 1) {
            ContactPicker.b(this.a);
        }
        j b = i.b(this.a.getApplicationContext(), this.b ? o.INTERACTIVE_FULL : o.INTERACTIVE_DELTA);
        if (App.am >= 1) {
            ContactPicker.b(this.a);
        }
        ContactPicker.q(this.a).post(new lq(this, b));
    }

    vb(ContactPicker contactPicker, boolean z) {
        this.a = contactPicker;
        this.b = z;
    }
}
