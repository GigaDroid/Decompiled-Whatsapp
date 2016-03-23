package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import org.v;
import org.whispersystems.at;

class DrawableUtils {
    public static final Rect INSETS_NONE;
    private static Class sInsetsClazz;
    private static final String[] z;

    static {
        String[] strArr = new String[7];
        String str = "*\u001e5T`";
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
                        i3 = 88;
                        break;
                    case at.g /*1*/:
                        i3 = 119;
                        break;
                    case at.i /*2*/:
                        i3 = 82;
                        break;
                    case at.o /*3*/:
                        i3 = 60;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ",\u0018\"";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "?\u0012&sd,\u001e1]x\u0011\u0019!Y`+";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001c\u00053Ku:\u001b7i`1\u001b!";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ":\u0018&H{5";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "4\u00124H";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    INSETS_NONE = new Rect();
                    if (VERSION.SDK_INT >= 18) {
                        try {
                            char[] toCharArray2 = "9\u00196N{1\u0013|[f9\u0007:Uw+Y\u001bRg=\u0003!".toCharArray();
                            int length2 = toCharArray2.length;
                            char[] cArr2 = toCharArray2;
                            for (int i4 = 0; length2 > i4; i4++) {
                                int i5;
                                char c2 = cArr2[i4];
                                switch (i4 % 5) {
                                    case v.m /*0*/:
                                        i5 = 88;
                                        break;
                                    case at.g /*1*/:
                                        i5 = 119;
                                        break;
                                    case at.i /*2*/:
                                        i5 = 82;
                                        break;
                                    case at.o /*3*/:
                                        i5 = 60;
                                        break;
                                    default:
                                        i5 = 20;
                                        break;
                                }
                                cArr2[i4] = (char) (i5 ^ c2);
                            }
                            sInsetsClazz = Class.forName(new String(cArr2).intern());
                            return;
                        } catch (ClassNotFoundException e) {
                            return;
                        }
                    }
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001b\u0018'Pp6P&\u001c{:\u00033Uzx\u0003:Y47\u0007&Uw9\u001brUz+\u0012&O:x>5R{*\u001e<[:";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect getOpticalBounds(android.graphics.drawable.Drawable r15) {
        /*
        r3 = 3;
        r4 = 2;
        r5 = 1;
        r2 = 0;
        r7 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = sInsetsClazz;
        if (r0 == 0) goto L_0x0092;
    L_0x000a:
        r0 = android.support.v4.graphics.drawable.DrawableCompat.unwrap(r15);	 Catch:{ Exception -> 0x0085 }
        r1 = r0.getClass();	 Catch:{ Exception -> 0x0085 }
        r6 = z;	 Catch:{ Exception -> 0x0085 }
        r8 = 3;
        r6 = r6[r8];	 Catch:{ Exception -> 0x0085 }
        r8 = 0;
        r8 = new java.lang.Class[r8];	 Catch:{ Exception -> 0x0085 }
        r1 = r1.getMethod(r6, r8);	 Catch:{ Exception -> 0x0085 }
        r6 = 0;
        r6 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x0085 }
        r8 = r1.invoke(r0, r6);	 Catch:{ Exception -> 0x0085 }
        if (r8 == 0) goto L_0x0092;
    L_0x0027:
        r0 = new android.graphics.Rect;	 Catch:{ Exception -> 0x0085 }
        r0.<init>();	 Catch:{ Exception -> 0x0085 }
        r1 = sInsetsClazz;	 Catch:{ Exception -> 0x0085 }
        r9 = r1.getFields();	 Catch:{ Exception -> 0x0085 }
        r10 = r9.length;	 Catch:{ Exception -> 0x0085 }
        r6 = r2;
    L_0x0034:
        if (r6 >= r10) goto L_0x004b;
    L_0x0036:
        r11 = r9[r6];	 Catch:{ Exception -> 0x0085 }
        r12 = r11.getName();	 Catch:{ Exception -> 0x0085 }
        r1 = -1;
        r13 = r12.hashCode();	 Catch:{ Exception -> 0x0083 }
        switch(r13) {
            case -1383228885: goto L_0x0076;
            case 115029: goto L_0x005a;
            case 3317767: goto L_0x004c;
            case 108511772: goto L_0x0068;
            default: goto L_0x0044;
        };	 Catch:{ Exception -> 0x0083 }
    L_0x0044:
        switch(r1) {
            case 0: goto L_0x009b;
            case 1: goto L_0x00a3;
            case 2: goto L_0x00ab;
            case 3: goto L_0x00b3;
            default: goto L_0x0047;
        };	 Catch:{ Exception -> 0x0083 }
    L_0x0047:
        r1 = r6 + 1;
        if (r7 == 0) goto L_0x00c2;
    L_0x004b:
        return r0;
    L_0x004c:
        r13 = z;	 Catch:{ Exception -> 0x0083 }
        r14 = 6;
        r13 = r13[r14];	 Catch:{ Exception -> 0x0083 }
        r13 = r12.equals(r13);	 Catch:{ Exception -> 0x0083 }
        if (r13 == 0) goto L_0x0044;
    L_0x0057:
        if (r7 == 0) goto L_0x00cb;
    L_0x0059:
        r1 = r2;
    L_0x005a:
        r13 = z;	 Catch:{ Exception -> 0x0095 }
        r14 = 2;
        r13 = r13[r14];	 Catch:{ Exception -> 0x0095 }
        r13 = r12.equals(r13);	 Catch:{ Exception -> 0x0095 }
        if (r13 == 0) goto L_0x0044;
    L_0x0065:
        if (r7 == 0) goto L_0x00c8;
    L_0x0067:
        r1 = r5;
    L_0x0068:
        r13 = z;	 Catch:{ Exception -> 0x0097 }
        r14 = 0;
        r13 = r13[r14];	 Catch:{ Exception -> 0x0097 }
        r13 = r12.equals(r13);	 Catch:{ Exception -> 0x0097 }
        if (r13 == 0) goto L_0x0044;
    L_0x0073:
        if (r7 == 0) goto L_0x00c5;
    L_0x0075:
        r1 = r4;
    L_0x0076:
        r13 = z;	 Catch:{ Exception -> 0x0099 }
        r14 = 5;
        r13 = r13[r14];	 Catch:{ Exception -> 0x0099 }
        r12 = r12.equals(r13);	 Catch:{ Exception -> 0x0099 }
        if (r12 == 0) goto L_0x0044;
    L_0x0081:
        r1 = r3;
        goto L_0x0044;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        r1 = z;
        r1 = r1[r5];
        android.util.Log.e(r0, r1);
    L_0x0092:
        r0 = INSETS_NONE;
        goto L_0x004b;
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0085 }
    L_0x0097:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0085 }
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0085 }
    L_0x009b:
        r1 = r11.getInt(r8);	 Catch:{ Exception -> 0x00bc }
        r0.left = r1;	 Catch:{ Exception -> 0x00bc }
        if (r7 == 0) goto L_0x0047;
    L_0x00a3:
        r1 = r11.getInt(r8);	 Catch:{ Exception -> 0x00be }
        r0.top = r1;	 Catch:{ Exception -> 0x00be }
        if (r7 == 0) goto L_0x0047;
    L_0x00ab:
        r1 = r11.getInt(r8);	 Catch:{ Exception -> 0x00c0 }
        r0.right = r1;	 Catch:{ Exception -> 0x00c0 }
        if (r7 == 0) goto L_0x0047;
    L_0x00b3:
        r1 = r11.getInt(r8);	 Catch:{ Exception -> 0x00ba }
        r0.bottom = r1;	 Catch:{ Exception -> 0x00ba }
        goto L_0x0047;
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0085 }
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00ba }
    L_0x00c2:
        r6 = r1;
        goto L_0x0034;
    L_0x00c5:
        r1 = r4;
        goto L_0x0044;
    L_0x00c8:
        r1 = r5;
        goto L_0x0044;
    L_0x00cb:
        r1 = r2;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.DrawableUtils.getOpticalBounds(android.graphics.drawable.Drawable):android.graphics.Rect");
    }
}
