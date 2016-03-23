package com.whatsapp;

import com.whatsapp.util.m;
import org.v;
import org.whispersystems.at;

class a9b implements m {
    private static final String[] z;
    final Conversation a;

    static {
        String[] strArr = new String[2];
        String str = ",j~z9\u0003f;";
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
                        i3 = 98;
                        break;
                    case at.g /*1*/:
                        i3 = 5;
                        break;
                    case at.i /*2*/:
                        i3 = 94;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 73;
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
                    str = "\u0001j0\u007f,\u0010v?} \rkqf'\u0001w;h=\u0007f1g?Ml1l;\u0010j,)";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.io.File r10) {
        /*
        r9 = this;
        r8 = 1;
        r0 = r9.a;	 Catch:{ IOException -> 0x0012 }
        r1 = r9.a;	 Catch:{ IOException -> 0x0012 }
        r2 = r9.a;	 Catch:{ IOException -> 0x0012 }
        r2 = r2.ae;	 Catch:{ IOException -> 0x0012 }
        r4 = 2;
        r5 = 0;
        r6 = 1;
        r7 = 0;
        r3 = r10;
        com.whatsapp.util.ag.a(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x0012 }
    L_0x0011:
        return;
    L_0x0012:
        r0 = move-exception;
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x0066 }
        if (r1 == 0) goto L_0x003c;
    L_0x0019:
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x0068 }
        r2 = z;	 Catch:{ IOException -> 0x0068 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0068 }
        r1 = r1.contains(r2);	 Catch:{ IOException -> 0x0068 }
        if (r1 == 0) goto L_0x003c;
    L_0x0028:
        r1 = r9.a;	 Catch:{ IOException -> 0x006a }
        r2 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x006a }
        r3 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r2 = r2.getString(r3);	 Catch:{ IOException -> 0x006a }
        com.whatsapp.App.a(r1, r2);	 Catch:{ IOException -> 0x006a }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IOException -> 0x006a }
        if (r1 == 0) goto L_0x0049;
    L_0x003c:
        r1 = r9.a;	 Catch:{ IOException -> 0x006a }
        r1 = r1.getBaseContext();	 Catch:{ IOException -> 0x006a }
        r2 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ IOException -> 0x006a }
    L_0x0049:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r8];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0011;
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a9b.a(java.io.File):void");
    }

    a9b(Conversation conversation) {
        this.a = conversation;
    }
}
