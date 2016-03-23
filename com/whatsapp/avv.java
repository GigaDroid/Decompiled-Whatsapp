package com.whatsapp;

import android.support.v7.widget.SearchView.OnQueryTextListener;

class avv implements OnQueryTextListener {
    final ContactPicker a;

    avv(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onQueryTextChange(java.lang.String r3) {
        /*
        r2 = this;
        r0 = r2.a;
        com.whatsapp.ContactPicker.a(r0, r3);
        r0 = r2.a;
        r1 = com.whatsapp.ael.h(r3);
        com.whatsapp.ContactPicker.b(r0, r1);
        r0 = r2.a;
        r0 = com.whatsapp.ContactPicker.u(r0);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0029;
    L_0x001a:
        r0 = r2.a;
        r1 = r2.a;
        r1 = com.whatsapp.ContactPicker.u(r1);
        com.whatsapp.ContactPicker.a(r0, r1);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0034;
    L_0x0029:
        r0 = r2.a;
        r1 = 0;
        com.whatsapp.ContactPicker.b(r0, r1);
        r0 = r2.a;
        com.whatsapp.ContactPicker.d(r0);
    L_0x0034:
        r0 = r2.a;
        com.whatsapp.ContactPicker.a(r0);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.avv.onQueryTextChange(java.lang.String):boolean");
    }

    public boolean onQueryTextSubmit(String str) {
        return false;
    }
}
