package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;

class yu extends ap {
    final ContactsFragment b;

    yu(ContactsFragment contactsFragment) {
        this.b = contactsFragment;
    }

    public void a(View view) {
        App.c(this.b.getActivity());
    }
}
