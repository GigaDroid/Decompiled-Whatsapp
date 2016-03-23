package com.whatsapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;

class uf extends Filter {
    final auz a;

    uf(auz com_whatsapp_auz, am_ com_whatsapp_am_) {
        this(com_whatsapp_auz);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void publishResults(java.lang.CharSequence r4, android.widget.Filter.FilterResults r5) {
        /*
        r3 = this;
        r1 = 0;
        r0 = r3.a;
        r2 = r0.b;
        if (r4 != 0) goto L_0x0046;
    L_0x0007:
        r0 = r1;
    L_0x0008:
        com.whatsapp.ContactPicker.a(r2, r0);
        r0 = r3.a;
        r0 = r0.b;
        r2 = r3.a;
        r2 = r2.b;
        r2 = com.whatsapp.ContactPicker.w(r2);
        r2 = com.whatsapp.ael.h(r2);
        com.whatsapp.ContactPicker.b(r0, r2);
        if (r4 == 0) goto L_0x0026;
    L_0x0020:
        r0 = r4.length();
        if (r0 != 0) goto L_0x0031;
    L_0x0026:
        r0 = r3.a;
        r0 = r0.b;
        com.whatsapp.ContactPicker.a(r0, r1);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0040;
    L_0x0031:
        r0 = r3.a;
        r0 = r0.b;
        r1 = r3.a;
        r1 = r1.b;
        r1 = com.whatsapp.ContactPicker.u(r1);
        com.whatsapp.ContactPicker.a(r0, r1);
    L_0x0040:
        r0 = r3.a;
        r0.notifyDataSetChanged();
        return;
    L_0x0046:
        r0 = r4.toString();
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.uf.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        return new FilterResults();
    }

    private uf(auz com_whatsapp_auz) {
        this.a = com_whatsapp_auz;
    }
}
