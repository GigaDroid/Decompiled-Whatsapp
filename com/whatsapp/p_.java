package com.whatsapp;

import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

class p_ implements OnItemClickListener {
    final ListView a;
    final cg b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView r10, android.view.View r11, int r12, long r13) {
        /*
        r9 = this;
        r8 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r9.b;
        r1 = r1.a;
        r2 = r9.a;
        r1 = com.whatsapp.ContactPicker.a(r1, r2);
        r2 = r9.b;
        r2 = r2.a;
        r3 = r9.a;
        r2 = com.whatsapp.ContactPicker.a(r2, r3, r12);
        r3 = r1.getCount();
        if (r2 >= r3) goto L_0x00ad;
    L_0x001d:
        r3 = r9.b;
        r3 = r3.a;
        r3 = com.whatsapp.ContactPicker.n(r3);
        if (r3 != 0) goto L_0x0034;
    L_0x0027:
        r3 = r9.b;
        r3 = r3.a;
        r4 = r1.a(r2);
        com.whatsapp.ContactPicker.a(r3, r4);
        if (r0 == 0) goto L_0x00d2;
    L_0x0034:
        r3 = r1.a(r2);
        r4 = r9.b;
        r4 = r4.a;
        r4 = com.whatsapp.ContactPicker.n(r4);
        r5 = r3.p;
        r4 = r4.containsKey(r5);
        if (r4 == 0) goto L_0x005a;
    L_0x0048:
        r4 = r9.b;
        r4 = r4.a;
        r4 = com.whatsapp.ContactPicker.n(r4);
        r5 = r3.p;
        r4.remove(r5);
        r11.setBackgroundResource(r8);
        if (r0 == 0) goto L_0x00a4;
    L_0x005a:
        r4 = com.whatsapp.a59.j;
        if (r4 <= 0) goto L_0x0091;
    L_0x005e:
        r4 = r9.b;
        r4 = r4.a;
        r4 = com.whatsapp.ContactPicker.n(r4);
        r4 = r4.size();
        r5 = com.whatsapp.a59.j;
        if (r4 < r5) goto L_0x0091;
    L_0x006e:
        r4 = r9.b;
        r4 = r4.a;
        r5 = r9.b;
        r5 = r5.a;
        r6 = 2131230852; // 0x7f080084 float:1.8077768E38 double:1.0529679473E-314;
        r5 = r5.getString(r6);
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r7 = com.whatsapp.a59.j;
        r7 = java.lang.Integer.valueOf(r7);
        r6[r8] = r7;
        r5 = java.lang.String.format(r5, r6);
        r4.f(r5);
        if (r0 == 0) goto L_0x00a4;
    L_0x0091:
        r4 = r9.b;
        r4 = r4.a;
        r4 = com.whatsapp.ContactPicker.n(r4);
        r5 = r3.p;
        r4.put(r5, r3);
        r3 = 2130837744; // 0x7f0200f0 float:1.728045E38 double:1.052773726E-314;
        r11.setBackgroundResource(r3);
    L_0x00a4:
        r3 = r9.b;
        r3 = r3.a;
        com.whatsapp.ContactPicker.k(r3);
        if (r0 == 0) goto L_0x00d2;
    L_0x00ad:
        r3 = r1.getCount();
        if (r2 != r3) goto L_0x00c3;
    L_0x00b3:
        r3 = com.whatsapp.fieldstats.k.TELL_A_FRIEND;
        r4 = com.whatsapp.fieldstats.c.CONTACTPICKER_LIST;
        com.whatsapp.nf.a(r3, r4);
        r3 = r9.b;
        r3 = r3.a;
        com.whatsapp.App.b(r3);
        if (r0 == 0) goto L_0x00d2;
    L_0x00c3:
        r0 = r1.getCount();
        r0 = r0 + 1;
        if (r2 != r0) goto L_0x00d2;
    L_0x00cb:
        r0 = r9.b;
        r0 = r0.a;
        com.whatsapp.ContactPicker.i(r0);
    L_0x00d2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.p_.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    p_(cg cgVar, ListView listView) {
        this.b = cgVar;
        this.a = listView;
    }
}
