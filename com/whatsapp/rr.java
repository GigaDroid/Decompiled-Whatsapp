package com.whatsapp;

import org.v;
import org.whispersystems.aL;
import org.whispersystems.at;

public final class rr implements aL {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u0015T\f";
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
                        i3 = 60;
                        break;
                    case at.g /*1*/:
                        i3 = 110;
                        break;
                    case at.i /*2*/:
                        i3 = 44;
                        break;
                    case at.o /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 38;
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
                    str = "I\u0000^\u0018ES\tB\u0014\\Y\n\f\rTU\u0001^\u0014REN\u0004";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "}\u0016C\u0011IH\u0002`\u0012A[\u000b^]\u000e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r5, java.lang.String r6, java.lang.String r7) {
        /*
        r4 = this;
        r0 = com.whatsapp.awc.g;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r7);
        r1 = r1.toString();
        switch(r5) {
            case 2: goto L_0x0062;
            case 3: goto L_0x0060;
            case 4: goto L_0x005b;
            case 5: goto L_0x0056;
            case 6: goto L_0x0051;
            case 7: goto L_0x004c;
            default: goto L_0x0028;
        };
    L_0x0028:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004a }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004a }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x004a }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x004a }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x004a }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004a }
        r1 = r1.append(r5);	 Catch:{ IllegalArgumentException -> 0x004a }
        r2 = 41;
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004a }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x004a }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x004a }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        com.whatsapp.util.Log.a(r1);	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r0 == 0) goto L_0x0064;
    L_0x0051:
        com.whatsapp.util.Log.e(r1);	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r0 == 0) goto L_0x0064;
    L_0x0056:
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalArgumentException -> 0x0069 }
        if (r0 == 0) goto L_0x0064;
    L_0x005b:
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalArgumentException -> 0x006b }
        if (r0 == 0) goto L_0x0064;
    L_0x0060:
        if (r0 == 0) goto L_0x0064;
    L_0x0062:
        if (r0 != 0) goto L_0x0028;
    L_0x0064:
        return;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004a }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.rr.a(int, java.lang.String, java.lang.String):void");
    }
}
