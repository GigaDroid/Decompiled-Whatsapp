package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import java.util.HashMap;

class j4 implements OnItemLongClickListener {
    final ContactsFragment a;

    j4(ContactsFragment contactsFragment) {
        this.a = contactsFragment;
    }

    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = i - 1;
        if (i2 < ContactsFragment.f(this.a).getCount()) {
            l5 a = ContactsFragment.f(this.a).a(i2);
            if (a.m) {
                if (aup.a(a.p)) {
                    return false;
                }
                ContactsFragment.a(this.a, new HashMap());
                ContactsFragment.c(this.a).put(a.p, a);
                this.a.d();
                ContactsFragment.h(this.a);
            }
        }
        return true;
    }
}
