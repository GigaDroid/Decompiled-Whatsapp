package com.whatsapp.util;

import android.view.View;
import android.view.ViewParent;
import org.v;
import org.whispersystems.at;

class cc implements Runnable {
    private static final String[] z;
    final String a;
    final c3 b;
    final View[] c;

    static {
        String[] strArr = new String[7];
        String str = "\u0001\u0001~)\"\u0014\u0007b(/ \u0007b+2U\u0007n?5OS";
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
                        i3 = 117;
                        break;
                    case at.g /*1*/:
                        i3 = 115;
                        break;
                    case at.i /*2*/:
                        i3 = 11;
                        break;
                    case at.o /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 65;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "4\u0010\u007f..\u001b1j5\u0002\u001a\u001d\u007f\"9\u0001%b\"6";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0001\u0001~)\"\u0014\u0007b(/ \u0007b+2Z\u0015b)%8\u0016e2\u0015\u0007\u0006e$ \u0001\u001ad)2U\u0007c\"3\u0010Sb4a\u0001\u0016s3{U";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "9\u001ax3\f\u0010\u001d~\u000e5\u0010\u001e";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0001\u0001~)\"\u0014\u0007b(/ \u0007b+2Z\u0015b)%8\u0016e2\u0015\u0007\u0006e$ \u0001\u001ad)2U\u0000`.1\u0005\u0016og5\u0010\u000b\u007f}a";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0001\u0001~)\"\u0014\u0007b(/ \u0007b+2Z\u0015b)%8\u0016e2\u0015\u0007\u0006e$ \u0001\u001ad)2U\u0007c\"3\u0010Sb4a\u001b\u001c+3$\r\u00071g";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "!\u0016s3\u0017\u001c\u0016|";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7 = this;
        r4 = 1;
        r6 = 0;
        r0 = r7.c;
        r1 = r0[r6];
        r0 = r1 instanceof android.widget.TextView;
        if (r0 == 0) goto L_0x0078;
    L_0x000a:
        r0 = r1;
        r0 = (android.widget.TextView) r0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r3 = r0.getText();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r1 = r1.getRootView();
        r2 = r7.a;
        r3 = z;
        r3 = r3[r4];
        r2 = r2.equalsIgnoreCase(r3);
        if (r2 == 0) goto L_0x0079;
    L_0x0039:
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r2 = r7.a(r0, r2);
        if (r2 != 0) goto L_0x0079;
    L_0x0044:
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r2 = r7.a(r0, r2);
        if (r2 != 0) goto L_0x0079;
    L_0x004f:
        r2 = com.whatsapp.util.u.a();
        r2 = r2.contains(r1);
        if (r2 != 0) goto L_0x0079;
    L_0x0059:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.getText();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.util.u.n = r4;
    L_0x0078:
        return;
    L_0x0079:
        r2 = r0.getText();
        r2 = r2.toString();
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 == 0) goto L_0x00a4;
    L_0x0087:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 6;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r2);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = com.whatsapp.util.Log.h;
        if (r3 == 0) goto L_0x00bf;
    L_0x00a4:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        com.whatsapp.util.u.n = r6;
    L_0x00bf:
        r2 = com.whatsapp.util.u.a();
        r2.add(r1);
        r2 = r0.getViewTreeObserver();
        r3 = new com.whatsapp.util.bx;
        r3.<init>(r7, r1, r0);
        r2.addOnGlobalLayoutListener(r3);
        goto L_0x0078;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cc.run():void");
    }

    private boolean a(View view, String str) {
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return false;
            }
            if (parent.getClass().toString().contains(str)) {
                return true;
            }
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
        return false;
    }

    cc(c3 c3Var, View[] viewArr, String str) {
        this.b = c3Var;
        this.c = viewArr;
        this.a = str;
    }
}
