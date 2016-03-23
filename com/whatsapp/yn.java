package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.c;
import com.whatsapp.fieldstats.k;
import com.whatsapp.util.ap;

class yn extends ap {
    final ContactsFragment b;

    public void a(View view) {
        nf.a(k.TELL_A_FRIEND, c.EMPTY_CONTACTS);
        App.b(this.b.getActivity());
    }

    yn(ContactsFragment contactsFragment) {
        this.b = contactsFragment;
    }
}
