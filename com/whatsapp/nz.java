package com.whatsapp;

import android.view.View.OnLongClickListener;
import org.v;
import org.whispersystems.at;

class nz implements OnLongClickListener {
    private static final String[] z;
    final LocationPicker a;

    static {
        String[] strArr = new String[3];
        String str = "E?\u0012\b,~-\u001f\\;yh=\u0013:d;\n\t.d-";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 22;
                        break;
                    case at.g /*1*/:
                        i3 = 72;
                        break;
                    case at.i /*2*/:
                        i3 = 123;
                        break;
                    case at.o /*3*/:
                        i3 = 124;
                        break;
                    default:
                        i3 = 79;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "E?\u0012\b,~-\u001f\\;yh<\u0013 q$\u001e";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "E?\u0012\b,~-\u001f\\;yh=\u001d,s*\u0014\u0013$";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    nz(LocationPicker locationPicker) {
        this.a = locationPicker;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLongClick(android.view.View r7) {
        /*
        r6 = this;
        r5 = 1;
        r4 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        com.whatsapp.k1.i();
        com.whatsapp.k1.r();
        r1 = com.whatsapp.k1.j();
        switch(r1) {
            case 1: goto L_0x0058;
            case 2: goto L_0x0031;
            case 3: goto L_0x0045;
            default: goto L_0x0011;
        };
    L_0x0011:
        r0 = r6.a;
        com.whatsapp.LocationPicker.a(r0, r4);
        r0 = r6.a;
        r1 = r6.a;
        r1 = com.whatsapp.LocationPicker.o(r1);
        r1 = r1.b();
        r2 = r6.a;
        r2 = com.whatsapp.LocationPicker.o(r2);
        r2 = r2.c();
        r3 = 0;
        com.whatsapp.LocationPicker.a(r0, r1, r2, r3, r4);
        return r4;
    L_0x0031:
        r1 = r6.a;
        r1 = r1.getApplicationContext();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = android.widget.Toast.makeText(r1, r2, r5);
        r1.show();
        if (r0 == 0) goto L_0x0011;
    L_0x0045:
        r1 = r6.a;
        r1 = r1.getApplicationContext();
        r2 = z;
        r2 = r2[r4];
        r1 = android.widget.Toast.makeText(r1, r2, r5);
        r1.show();
        if (r0 == 0) goto L_0x0011;
    L_0x0058:
        r0 = r6.a;
        r0 = r0.getApplicationContext();
        r1 = z;
        r1 = r1[r5];
        r0 = android.widget.Toast.makeText(r0, r1, r5);
        r0.show();
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.nz.onLongClick(android.view.View):boolean");
    }
}
