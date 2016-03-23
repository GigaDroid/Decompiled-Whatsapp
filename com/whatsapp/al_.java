package com.whatsapp;

import android.widget.AdapterView.OnItemClickListener;
import org.v;
import org.whispersystems.at;

class al_ implements OnItemClickListener {
    private static final String z;
    final LocationPicker2 a;

    static {
        char[] toCharArray = "o*5\u0003s".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 31;
                    break;
                case at.g /*1*/:
                    i2 = 70;
                    break;
                case at.i /*2*/:
                    i2 = 84;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 22;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView r4, android.view.View r5, int r6, long r7) {
        /*
        r3 = this;
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.r(r0);
        if (r0 == 0) goto L_0x0014;
    L_0x0008:
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.r(r0);
        r0 = r0.o();
        if (r6 < r0) goto L_0x0015;
    L_0x0014:
        return;
    L_0x0015:
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker2.s(r0);
        if (r0 == 0) goto L_0x0036;
    L_0x001d:
        r0 = r3.a;
        r1 = r3.a;
        r1 = com.whatsapp.LocationPicker2.s(r1);
        r2 = r3.a;
        r2 = com.whatsapp.LocationPicker2.r(r2);
        r2 = r2.b(r6);
        com.whatsapp.App.a(r0, r1, r2);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0050;
    L_0x0036:
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = z;
        r2 = r3.a;
        r2 = com.whatsapp.LocationPicker2.r(r2);
        r2 = r2.b(r6);
        r0.putExtra(r1, r2);
        r1 = r3.a;
        r2 = -1;
        r1.setResult(r2, r0);
    L_0x0050:
        r0 = r3.a;
        r1 = com.whatsapp.fieldstats.a5.PLACE;
        com.whatsapp.LocationPicker2.a(r0, r1, r6);
        r0 = r3.a;
        r0.finish();
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.al_.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }

    al_(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
