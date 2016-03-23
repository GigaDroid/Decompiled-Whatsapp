package com.whatsapp;

import org.v;
import org.whispersystems.at;

public class aea {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u0016\u001b\u001e9W\u001d\u0015\u0007dA\u0005\u0004,gR\u0010\u0012\u0016eE\u001b\u0017\u0016d";
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
                        i3 = 116;
                        break;
                    case at.i /*2*/:
                        i3 = 115;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 32;
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
                    str = "\u0005\u0006\u0016q\u007f\u0011\u0011\u001frT\u0010+\u001erD\u001c\u0015";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0011\u001d\u0012{O\u0012[\u0017rL\u0010\u0000\u00167N\u001aT\u001erS\u0006\u0015\u0014rS";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.app.Dialog a(android.app.Activity r11, java.util.Collection r12, java.lang.String r13, int r14, com.whatsapp.be r15) {
        /*
        r10 = 2;
        r2 = 0;
        r4 = 0;
        r5 = 1;
        r7 = com.whatsapp.DialogToastActivity.f;
        if (r12 == 0) goto L_0x000e;
    L_0x0008:
        r0 = r12.isEmpty();
        if (r0 == 0) goto L_0x0016;
    L_0x000e:
        r0 = z;
        r0 = r0[r5];
        com.whatsapp.util.Log.e(r0);
    L_0x0015:
        return r2;
    L_0x0016:
        if (r13 == 0) goto L_0x0172;
    L_0x0018:
        r0 = com.whatsapp.App.as;
        r0 = r0.b(r13);
        r1 = r0;
    L_0x001f:
        r0 = r12.size();
        if (r0 != r5) goto L_0x007a;
    L_0x0025:
        r0 = r12.iterator();
        r0 = r0.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r3 = r0.k;
        r3 = r3.a;
        if (r3 != 0) goto L_0x0037;
    L_0x0035:
        if (r1 != 0) goto L_0x0044;
    L_0x0037:
        r3 = r11.getResources();
        r6 = 2131231053; // 0x7f08014d float:1.8078176E38 double:1.0529680466E-314;
        r3 = r3.getString(r6);
        if (r7 == 0) goto L_0x016f;
    L_0x0044:
        r3 = "";
        r6 = r1.c();
        if (r6 == 0) goto L_0x016c;
    L_0x004d:
        r6 = r0.t;
        if (r6 == 0) goto L_0x0169;
    L_0x0051:
        r3 = com.whatsapp.App.as;
        r0 = r0.t;
        r0 = r3.b(r0);
        r0 = r0.a(r11);
        if (r7 == 0) goto L_0x0069;
    L_0x005f:
        r3 = r1.a(r11);
        if (r3 == 0) goto L_0x0069;
    L_0x0065:
        r0 = r1.a(r11);
    L_0x0069:
        r1 = r11.getResources();
        r3 = 2131231052; // 0x7f08014c float:1.8078174E38 double:1.052968046E-314;
        r6 = new java.lang.Object[r5];
        r6[r4] = r0;
        r0 = r1.getString(r3, r6);
    L_0x0078:
        if (r7 == 0) goto L_0x0166;
    L_0x007a:
        r0 = com.whatsapp.App.az;
        r1 = 2131296271; // 0x7f09000f float:1.8210454E38 double:1.0530002686E-314;
        r3 = r12.size();
        r0 = r0.a(r1, r3);
        r1 = new java.lang.Object[r5];
        r3 = r12.size();
        r3 = java.lang.Integer.valueOf(r3);
        r1[r4] = r3;
        r0 = java.lang.String.format(r0, r1);
        r3 = r0;
    L_0x0098:
        r6 = r12.iterator();
        r1 = r4;
    L_0x009d:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0163;
    L_0x00a3:
        r0 = r6.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r8 = r0.c;
        if (r8 == r5) goto L_0x00c0;
    L_0x00ad:
        r8 = r0.c;
        r9 = 3;
        if (r8 == r9) goto L_0x00c0;
    L_0x00b2:
        r8 = r0.c;
        r9 = 9;
        if (r8 == r9) goto L_0x00c0;
    L_0x00b8:
        r8 = r0.c;
        if (r8 != r10) goto L_0x0160;
    L_0x00bc:
        r8 = r0.r;
        if (r8 == r5) goto L_0x0160;
    L_0x00c0:
        r8 = r0.Q;
        if (r8 == 0) goto L_0x0160;
    L_0x00c4:
        r0 = r0.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r8 = r0.file;
        if (r8 == 0) goto L_0x0160;
    L_0x00cc:
        r0 = r0.file;
        r0 = r0.exists();
        if (r0 == 0) goto L_0x0160;
    L_0x00d4:
        if (r7 == 0) goto L_0x015d;
    L_0x00d6:
        r0 = r5;
    L_0x00d7:
        if (r7 == 0) goto L_0x015a;
    L_0x00d9:
        r8 = new android.support.v7.app.AlertDialog$Builder;
        r8.<init>(r11);
        if (r0 == 0) goto L_0x011c;
    L_0x00e0:
        r0 = android.view.LayoutInflater.from(r11);
        r1 = 2130903157; // 0x7f030075 float:1.7413124E38 double:1.0528060445E-314;
        r9 = com.whatsapp.aam.a(r0, r1, r2, r4);
        r0 = 2131755607; // 0x7f100257 float:1.9142098E38 double:1.0532272107E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r1 = com.whatsapp.App.z();
        r6 = z;
        r6 = r6[r4];
        r1 = r1.getSharedPreferences(r6, r4);
        r6 = z;
        r6 = r6[r10];
        r6 = r1.getBoolean(r6, r5);
        r0.setChecked(r6);
        r1 = 2131755606; // 0x7f100256 float:1.9142096E38 double:1.0532272103E-314;
        r1 = r9.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r1.setText(r3);
        r8.setView(r9);
        if (r7 == 0) goto L_0x0157;
    L_0x011c:
        r0 = r11.getBaseContext();
        r0 = com.whatsapp.a28.b(r3, r0);
        r8.setMessage(r0);
        r3 = r2;
    L_0x0128:
        r7 = r8.setCancelable(r5);
        r8 = 2131231020; // 0x7f08012c float:1.807811E38 double:1.0529680303E-314;
        r0 = new com.whatsapp.a4k;
        r1 = r11;
        r2 = r14;
        r5 = r12;
        r6 = r15;
        r0.<init>(r1, r2, r3, r4, r5, r6);
        r0 = r7.setPositiveButton(r8, r0);
        r1 = 2131230884; // 0x7f0800a4 float:1.8077833E38 double:1.052967963E-314;
        r2 = new com.whatsapp.bg;
        r2.<init>(r11, r14);
        r0 = r0.setNegativeButton(r1, r2);
        r1 = new com.whatsapp.a3f;
        r1.<init>(r11, r14);
        r0 = r0.setOnCancelListener(r1);
        r2 = r0.create();
        goto L_0x0015;
    L_0x0157:
        r4 = r6;
        r3 = r0;
        goto L_0x0128;
    L_0x015a:
        r1 = r0;
        goto L_0x009d;
    L_0x015d:
        r0 = r5;
        goto L_0x00d9;
    L_0x0160:
        r0 = r1;
        goto L_0x00d7;
    L_0x0163:
        r0 = r1;
        goto L_0x00d9;
    L_0x0166:
        r3 = r0;
        goto L_0x0098;
    L_0x0169:
        r0 = r3;
        goto L_0x0069;
    L_0x016c:
        r0 = r3;
        goto L_0x005f;
    L_0x016f:
        r0 = r3;
        goto L_0x0078;
    L_0x0172:
        r1 = r2;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aea.a(android.app.Activity, java.util.Collection, java.lang.String, int, com.whatsapp.be):android.app.Dialog");
    }
}
