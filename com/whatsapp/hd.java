package com.whatsapp;

import android.content.Context;
import org.v;
import org.whispersystems.at;

final class hd implements Runnable {
    private static final String[] z;
    final String a;
    final Context b;

    static {
        String[] strArr = new String[3];
        String str = "\u0018\u0000\n\u0015R\u0013\u000e\u0013HD\u000b\u001f8KW\u001e\t\u0002I@\u0015\f\u0002H";
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
                        i3 = 123;
                        break;
                    case at.g /*1*/:
                        i3 = 111;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 37;
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
                    str = "\u000e\u0001\u0006YI\u001eO\u0013T\u0005\t\n\u0013IL\u001e\u0019\u0002\u001bW\u001e\u0002\bO@[\u0019\u0002IV\u0012\u0000\t";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0017\u000e\u0014Oz\u000e\u001f\u0000ID\u001f\n8XM\u001e\f\f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    hd(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r8 = this;
        r5 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = com.whatsapp.auc.c();
        r2 = r1.length();
        if (r2 <= 0) goto L_0x0043;
    L_0x000d:
        r2 = r8.a;
        r2 = com.whatsapp.a2q.a(r2);
        if (r2 != 0) goto L_0x0016;
    L_0x0015:
        return;
    L_0x0016:
        r1 = com.whatsapp.a2q.a(r1);
        if (r1 == 0) goto L_0x0015;
    L_0x001c:
        r3 = r8.b;
        r4 = z;
        r4 = r4[r5];
        r3 = r3.getSharedPreferences(r4, r5);
        r3 = r3.edit();
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r6 = java.lang.System.currentTimeMillis();
        r3 = r3.putLong(r4, r6);
        r3.commit();
        r1 = r2.a(r1);
        switch(r1) {
            case -1: goto L_0x004c;
            case 0: goto L_0x0051;
            case 1: goto L_0x0051;
            default: goto L_0x0041;
        };
    L_0x0041:
        if (r0 == 0) goto L_0x0015;
    L_0x0043:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        goto L_0x0015;
    L_0x004c:
        com.whatsapp.auc.j();
        if (r0 == 0) goto L_0x0041;
    L_0x0051:
        com.whatsapp.auc.h();
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.hd.run():void");
    }
}
