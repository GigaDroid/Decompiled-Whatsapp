package com.whatsapp;

import android.widget.AdapterView.OnItemClickListener;

class awd implements OnItemClickListener {
    final MultipleContactPicker a;

    awd(MultipleContactPicker multipleContactPicker) {
        this.a = multipleContactPicker;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView r10, android.view.View r11, int r12, long r13) {
        /*
        r9 = this;
        r3 = 1;
        r2 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = 2131755791; // 0x7f10030f float:1.9142471E38 double:1.0532273017E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r1 = r0.getTag();
        r1 = (com.whatsapp.l5) r1;
        r5 = r1.p;
        r5 = com.whatsapp.aup.a(r5);
        if (r5 == 0) goto L_0x001c;
    L_0x001b:
        return;
    L_0x001c:
        r5 = r1.e;
        if (r5 == 0) goto L_0x0027;
    L_0x0020:
        r0.setChecked(r2);
        r1.e = r2;
        if (r4 == 0) goto L_0x0066;
    L_0x0027:
        r5 = r9.a;
        r5 = com.whatsapp.MultipleContactPicker.d(r5);
        r5 = r5.size();
        r6 = r9.a;
        r6 = com.whatsapp.MultipleContactPicker.h(r6);
        if (r5 != r6) goto L_0x0061;
    L_0x0039:
        r5 = r9.a;
        r6 = r9.a;
        r7 = r9.a;
        r7 = com.whatsapp.MultipleContactPicker.k(r7);
        r6 = r6.getString(r7);
        r7 = new java.lang.Object[r3];
        r8 = r9.a;
        r8 = com.whatsapp.MultipleContactPicker.h(r8);
        r8 = java.lang.Integer.valueOf(r8);
        r7[r2] = r8;
        r6 = java.lang.String.format(r6, r7);
        r5.f(r6);
        r0.setChecked(r2);
        if (r4 == 0) goto L_0x0066;
    L_0x0061:
        r0.setChecked(r3);
        r1.e = r3;
    L_0x0066:
        r0 = r1.e;
        if (r0 == 0) goto L_0x0077;
    L_0x006a:
        r0 = r9.a;
        r0 = com.whatsapp.MultipleContactPicker.d(r0);
        r5 = r1.p;
        r0.add(r5);
        if (r4 == 0) goto L_0x0082;
    L_0x0077:
        r0 = r9.a;
        r0 = com.whatsapp.MultipleContactPicker.d(r0);
        r5 = r1.p;
        r0.remove(r5);
    L_0x0082:
        r0 = r9.a;
        r5 = r9.a;
        r5 = com.whatsapp.MultipleContactPicker.d(r5);
        r5 = r5.size();
        com.whatsapp.MultipleContactPicker.a(r0, r5);
        r0 = r9.a;
        r0 = com.whatsapp.MultipleContactPicker.i(r0);
        r5 = r0.iterator();
    L_0x009b:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x00cb;
    L_0x00a1:
        r0 = r5.next();
        r0 = (com.whatsapp.l5) r0;
        if (r0 == r1) goto L_0x00c9;
    L_0x00a9:
        r6 = r1.p;
        r7 = r0.p;
        r6 = r6.equals(r7);
        if (r6 == 0) goto L_0x00c9;
    L_0x00b3:
        r2 = r1.e;
        r0.e = r2;
        r0 = r3;
    L_0x00b8:
        if (r4 == 0) goto L_0x00c7;
    L_0x00ba:
        if (r0 == 0) goto L_0x001b;
    L_0x00bc:
        r0 = r9.a;
        r0 = com.whatsapp.MultipleContactPicker.a(r0);
        r0.notifyDataSetChanged();
        goto L_0x001b;
    L_0x00c7:
        r2 = r0;
        goto L_0x009b;
    L_0x00c9:
        r0 = r2;
        goto L_0x00b8;
    L_0x00cb:
        r0 = r2;
        goto L_0x00ba;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.awd.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
