package com.whatsapp;

import com.whatsapp.contact.i;
import com.whatsapp.contact.o;

class ar implements Runnable {
    final boolean a;
    final ContactsFragment b;

    public void run() {
        ContactsFragment.e(this.b).post(new mh(this, i.b(this.b.getContext(), this.a ? o.INTERACTIVE_FULL : o.INTERACTIVE_DELTA)));
    }

    ar(ContactsFragment contactsFragment, boolean z) {
        this.b = contactsFragment;
        this.a = z;
    }
}
