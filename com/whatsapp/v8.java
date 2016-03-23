package com.whatsapp;

import android.widget.AdapterView.OnItemLongClickListener;

class v8 implements OnItemLongClickListener {
    final DocumentPickerActivity a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onItemLongClick(android.widget.AdapterView r4, android.view.View r5, int r6, long r7) {
        /*
        r3 = this;
        r0 = r3.a;
        r0 = r0.a();
        r0 = r0.getHeaderViewsCount();
        r0 = r6 - r0;
        if (r0 < 0) goto L_0x0057;
    L_0x000e:
        r1 = r3.a;
        r1 = com.whatsapp.DocumentPickerActivity.g(r1);
        r0 = r1.get(r0);
        r0 = (java.io.File) r0;
        r1 = r3.a;
        r1 = com.whatsapp.DocumentPickerActivity.c(r1);
        if (r1 == 0) goto L_0x002b;
    L_0x0022:
        r1 = r3.a;
        com.whatsapp.DocumentPickerActivity.a(r1, r0);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0057;
    L_0x002b:
        r1 = r3.a;
        r1 = com.whatsapp.DocumentPickerActivity.k(r1);
        r1.clear();
        r1 = r3.a;
        r1 = com.whatsapp.DocumentPickerActivity.k(r1);
        r1.add(r0);
        r0 = r3.a;
        r1 = r3.a;
        r2 = r3.a;
        r2 = com.whatsapp.DocumentPickerActivity.i(r2);
        r1 = r1.startSupportActionMode(r2);
        com.whatsapp.DocumentPickerActivity.a(r0, r1);
        r0 = r3.a;
        r0 = com.whatsapp.DocumentPickerActivity.l(r0);
        r0.notifyDataSetChanged();
    L_0x0057:
        r0 = 1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.v8.onItemLongClick(android.widget.AdapterView, android.view.View, int, long):boolean");
    }

    v8(DocumentPickerActivity documentPickerActivity) {
        this.a = documentPickerActivity;
    }
}
