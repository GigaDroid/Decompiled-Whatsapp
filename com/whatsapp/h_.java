package com.whatsapp;

import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class h_ implements OnClickListener {
    private static final String z;
    final LocationPicker a;

    static {
        char[] toCharArray = "\u0011\"\u000f\u001d \u0014\"\u0002".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = 77;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.o /*3*/:
                    i2 = 124;
                    break;
                default:
                    i2 = 84;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    h_(LocationPicker locationPicker) {
        this.a = locationPicker;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r4) {
        /*
        r3 = this;
        r0 = r3.a;
        r0 = com.whatsapp.LocationPicker.f(r0);
        r0 = r0.getLastFix();
        if (r0 == 0) goto L_0x0017;
    L_0x000c:
        r1 = r0.getAccuracy();
        r2 = 1128792064; // 0x43480000 float:200.0 double:5.5769738E-315;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 <= 0) goto L_0x0017;
    L_0x0016:
        r0 = 0;
    L_0x0017:
        r1 = r3.a;
        r1 = com.whatsapp.LocationPicker.k(r1);
        if (r1 == 0) goto L_0x002e;
    L_0x001f:
        r1 = r3.a;
        r2 = r3.a;
        r2 = com.whatsapp.LocationPicker.k(r2);
        com.whatsapp.App.a(r1, r2, r0);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x003e;
    L_0x002e:
        r1 = new android.content.Intent;
        r1.<init>();
        r2 = z;
        r1.putExtra(r2, r0);
        r0 = r3.a;
        r2 = -1;
        r0.setResult(r2, r1);
    L_0x003e:
        r0 = r3.a;
        r1 = com.whatsapp.fieldstats.a5.CURRENT_LOCATION;
        com.whatsapp.LocationPicker.a(r0, r1);
        r0 = r3.a;
        r0.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.h_.onClick(android.view.View):void");
    }
}
