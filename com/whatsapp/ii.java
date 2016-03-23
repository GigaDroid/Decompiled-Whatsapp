package com.whatsapp;

import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class ii implements OnClickListener {
    private static final String z;
    final CallRatingActivity a;

    static {
        char[] toCharArray = "Ih[\u00133K}^\u0011&KjC\u00167C}NP1XfU\u0013$Gz\u0017".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 9;
                    break;
                case at.i /*2*/:
                    i2 = 55;
                    break;
                case at.o /*3*/:
                    i2 = 127;
                    break;
                default:
                    i2 = 65;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ii(CallRatingActivity callRatingActivity) {
        this.a = callRatingActivity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r6) {
        /*
        r5 = this;
        r4 = 1;
        r6 = (android.widget.CheckBox) r6;
        r0 = r6.getTag();
        r0 = (java.lang.Integer) r0;
        if (r0 == 0) goto L_0x004b;
    L_0x000b:
        r1 = r6.isChecked();
        if (r1 == 0) goto L_0x002f;
    L_0x0011:
        r1 = r5.a;
        r2 = r5.a;
        r2 = com.whatsapp.CallRatingActivity.b(r2);
        r2 = r2.intValue();
        r3 = r0.intValue();
        r3 = r4 << r3;
        r2 = r2 | r3;
        r2 = java.lang.Integer.valueOf(r2);
        com.whatsapp.CallRatingActivity.a(r1, r2);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x004b;
    L_0x002f:
        r1 = r5.a;
        r2 = r5.a;
        r2 = com.whatsapp.CallRatingActivity.b(r2);
        r2 = r2.intValue();
        r0 = r0.intValue();
        r0 = r4 << r0;
        r0 = r0 ^ -1;
        r0 = r0 & r2;
        r0 = java.lang.Integer.valueOf(r0);
        com.whatsapp.CallRatingActivity.a(r1, r0);
    L_0x004b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r0 = r0.append(r1);
        r1 = r5.a;
        r1 = com.whatsapp.CallRatingActivity.b(r1);
        r1 = r1.intValue();
        r1 = java.lang.Integer.toBinaryString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ii.onClick(android.view.View):void");
    }
}
