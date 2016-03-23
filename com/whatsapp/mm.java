package com.whatsapp;

import com.whatsapp.util.m;
import org.v;
import org.whispersystems.at;

class mm implements m {
    private static final String[] z;
    final boolean a;
    final String b;
    final Conversation c;
    final boolean d;

    static {
        String[] strArr = new String[2];
        String str = "JXp!h[D\u007f#dFY18cJE{6yLTq9{\u0006^q2\u007f[Xlw";
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
                        i3 = 41;
                        break;
                    case at.g /*1*/:
                        i3 = 55;
                        break;
                    case at.i /*2*/:
                        i3 = 30;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "gX>$}HT{";
                    obj = null;
            }
        }
    }

    mm(Conversation conversation, boolean z, boolean z2, String str) {
        this.c = conversation;
        this.a = z;
        this.d = z2;
        this.b = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.io.File r11) {
        /*
        r10 = this;
        r9 = 0;
        r8 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.a;	 Catch:{ IOException -> 0x0071 }
        if (r0 == 0) goto L_0x001e;
    L_0x0007:
        r0 = r10.d;	 Catch:{ IOException -> 0x0071 }
        if (r0 == 0) goto L_0x0070;
    L_0x000b:
        r0 = r10.c;	 Catch:{ IOException -> 0x0073 }
        r1 = r10.c;	 Catch:{ IOException -> 0x0073 }
        r2 = r10.c;	 Catch:{ IOException -> 0x0073 }
        r2 = r2.ae;	 Catch:{ IOException -> 0x0073 }
        r4 = 3;
        r5 = 0;
        r6 = 1;
        r7 = r10.b;	 Catch:{ IOException -> 0x0073 }
        r3 = r11;
        com.whatsapp.util.ag.a(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x0073 }
        if (r8 == 0) goto L_0x0070;
    L_0x001e:
        r0 = r10.c;	 Catch:{ IOException -> 0x0075 }
        r0 = r0.aI;	 Catch:{ IOException -> 0x0075 }
        r0 = r0.p;	 Catch:{ IOException -> 0x0075 }
        r1 = 3;
        r0 = com.whatsapp.util.ag.a(r0, r1, r11);	 Catch:{ IOException -> 0x0075 }
        if (r0 == 0) goto L_0x004a;
    L_0x002b:
        r0 = 3;
        r0 = com.whatsapp.util.ag.a(r0, r11);	 Catch:{ IOException -> 0x0077 }
        if (r0 == 0) goto L_0x003d;
    L_0x0032:
        r0 = r10.c;	 Catch:{ IOException -> 0x0079 }
        r1 = r10.c;	 Catch:{ IOException -> 0x0079 }
        r1 = r1.aI;	 Catch:{ IOException -> 0x0079 }
        com.whatsapp.VideoPreviewActivity.a(r0, r1, r11);	 Catch:{ IOException -> 0x0079 }
        if (r8 == 0) goto L_0x0070;
    L_0x003d:
        r0 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x007b }
        r1 = 2131232023; // 0x7f080517 float:1.8080144E38 double:1.052968526E-314;
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ IOException -> 0x007b }
        if (r8 == 0) goto L_0x0070;
    L_0x004a:
        r0 = com.whatsapp.akr.c(r11);	 Catch:{ IOException -> 0x007d }
        if (r0 == 0) goto L_0x005b;
    L_0x0050:
        r0 = r10.c;	 Catch:{ IOException -> 0x007f }
        r1 = r10.c;	 Catch:{ IOException -> 0x007f }
        r1 = r1.aI;	 Catch:{ IOException -> 0x007f }
        com.whatsapp.VideoPreviewActivity.a(r0, r1, r11);	 Catch:{ IOException -> 0x007f }
        if (r8 == 0) goto L_0x0070;
    L_0x005b:
        r0 = r10.d;	 Catch:{ IOException -> 0x0081 }
        if (r0 == 0) goto L_0x0070;
    L_0x005f:
        r0 = r10.c;	 Catch:{ IOException -> 0x0083 }
        r1 = r10.c;	 Catch:{ IOException -> 0x0083 }
        r2 = r10.c;	 Catch:{ IOException -> 0x0083 }
        r2 = r2.ae;	 Catch:{ IOException -> 0x0083 }
        r4 = 3;
        r5 = 0;
        r6 = 1;
        r7 = r10.b;	 Catch:{ IOException -> 0x0083 }
        r3 = r11;
        com.whatsapp.util.ag.a(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x0083 }
    L_0x0070:
        return;
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x00d7 }
        if (r1 == 0) goto L_0x00ad;
    L_0x008c:
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x00d9 }
        r2 = z;	 Catch:{ IOException -> 0x00d9 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00d9 }
        r1 = r1.contains(r2);	 Catch:{ IOException -> 0x00d9 }
        if (r1 == 0) goto L_0x00ad;
    L_0x009b:
        r1 = r10.c;	 Catch:{ IOException -> 0x00db }
        r2 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x00db }
        r3 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r2 = r2.getString(r3);	 Catch:{ IOException -> 0x00db }
        com.whatsapp.App.a(r1, r2);	 Catch:{ IOException -> 0x00db }
        if (r8 == 0) goto L_0x00ba;
    L_0x00ad:
        r1 = r10.c;	 Catch:{ IOException -> 0x00db }
        r1 = r1.getBaseContext();	 Catch:{ IOException -> 0x00db }
        r2 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ IOException -> 0x00db }
    L_0x00ba:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r9];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0070;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d9 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00db }
    L_0x00db:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mm.a(java.io.File):void");
    }
}
