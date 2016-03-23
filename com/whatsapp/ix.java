package com.whatsapp;

import android.widget.AdapterView.OnItemClickListener;

class ix implements OnItemClickListener {
    final MultipleContactsSelector a;

    ix(MultipleContactsSelector multipleContactsSelector) {
        this.a = multipleContactsSelector;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView r6, android.view.View r7, int r8, long r9) {
        /*
        r5 = this;
        if (r7 != 0) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r5.a;
        r0 = r0.e();
        if (r0 <= 0) goto L_0x0044;
    L_0x000b:
        r0 = r5.a;
        r0 = r0.w;
        r0 = r0.size();
        r1 = r5.a;
        r1 = r1.e();
        if (r0 < r1) goto L_0x0044;
    L_0x001b:
        r0 = r5.a;
        r1 = r5.a;
        r2 = r5.a;
        r2 = r2.k();
        r1 = r1.getString(r2);
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r5.a;
        r4 = r4.e();
        r4 = java.lang.Integer.valueOf(r4);
        r2[r3] = r4;
        r1 = java.lang.String.format(r1, r2);
        r0.f(r1);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0051;
    L_0x0044:
        r0 = r5.a;
        r1 = r0.w;
        r0 = r7.getTag();
        r0 = (com.whatsapp.l5) r0;
        r1.add(r0);
    L_0x0051:
        r0 = r5.a;
        r0 = r0.p;
        r1 = "";
        r0.setText(r1);
        r0 = r5.a;
        r0 = com.whatsapp.MultipleContactsSelector.d(r0);
        r0.notifyDataSetChanged();
        r0 = r5.a;
        r0.i();
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ix.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
