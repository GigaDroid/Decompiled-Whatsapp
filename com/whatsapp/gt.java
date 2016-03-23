package com.whatsapp;

import android.view.View.OnTouchListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class gt implements OnTouchListener {
    private static final String[] z;
    private float a;
    private float b;
    private float c;
    private float d;

    static {
        String[] strArr = new String[10];
        String str = "\\\t\to_\u0007\t\bo^\u0004AE";
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
                        i3 = 112;
                        break;
                    case at.g /*1*/:
                        i3 = 41;
                        break;
                    case at.i /*2*/:
                        i3 = 127;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 58;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\"L\u001bsY\u0015M>t_\u0011f\u0011RU\u0005J\u0017JS\u0003]\u001ah_\u0002\u0006\u0010hn\u001f\\\u001cn\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\"L\u001bsY\u0015M>t_\u0011f\u0011RU\u0005J\u0017JS\u0003]\u001ah_\u0002\u0006\u0016aT\u001f[\u001a&N\u0018@\f&N\u001f\\\u001cn\u001a\u0015_\u001ahN";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\\\t\to_\u0007\t\u0017cS\u0017A\u000b<";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\\\t\u001diN\u0004F\u0012<\u001a";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "\u0019G\tgV\u0019M_oT\u0000\\\u000b&J\u0011[\u001ek_\u0004L\ru";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "\"L\u001bsY\u0015M>t_\u0011f\u0011RU\u0005J\u0017JS\u0003]\u001ah_\u0002\u0006\u0016aT\u001f[\u001abe\u0002H\u000boUP\u0004R&V\u0015O\u000b<\u001a";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\\\t\ro]\u0018]E&";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\\\t\u000biJJ\t";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\\\t\u000fiS\u001e]\u001at\u001a\u0013F\nhNJ\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
        r8 = this;
        r1 = 0;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = 1;
        r2 = r9.getWidth();
        r3 = r9.getHeight();
        r4 = r10.getAction();	 Catch:{ RuntimeException -> 0x009f }
        if (r4 == 0) goto L_0x0018;
    L_0x0012:
        r4 = r10.getAction();	 Catch:{ RuntimeException -> 0x00a1 }
        if (r4 != r0) goto L_0x005c;
    L_0x0018:
        r4 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x00a1 }
        r4.<init>();	 Catch:{ RuntimeException -> 0x00a1 }
        r5 = z;	 Catch:{ RuntimeException -> 0x00a1 }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x00a1 }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x00a1 }
        r4 = r4.append(r10);	 Catch:{ RuntimeException -> 0x00a1 }
        r5 = z;	 Catch:{ RuntimeException -> 0x00a1 }
        r6 = 0;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x00a1 }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x00a1 }
        r4 = r4.append(r2);	 Catch:{ RuntimeException -> 0x00a1 }
        r5 = z;	 Catch:{ RuntimeException -> 0x00a1 }
        r6 = 4;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x00a1 }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x00a1 }
        r4 = r4.append(r3);	 Catch:{ RuntimeException -> 0x00a1 }
        r5 = z;	 Catch:{ RuntimeException -> 0x00a1 }
        r6 = 1;
        r5 = r5[r6];	 Catch:{ RuntimeException -> 0x00a1 }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x00a1 }
        r5 = r10.getPointerCount();	 Catch:{ RuntimeException -> 0x00a1 }
        r4 = r4.append(r5);	 Catch:{ RuntimeException -> 0x00a1 }
        r4 = r4.toString();	 Catch:{ RuntimeException -> 0x00a1 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ RuntimeException -> 0x00a1 }
    L_0x005c:
        r4 = r10.getAction();	 Catch:{ RuntimeException -> 0x00a3 }
        if (r4 != 0) goto L_0x00ad;
    L_0x0062:
        r4 = r10.getX();	 Catch:{ RuntimeException -> 0x00a5 }
        r5 = r8.b;	 Catch:{ RuntimeException -> 0x00a5 }
        r6 = (float) r2;
        r5 = r5 * r6;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 < 0) goto L_0x0096;
    L_0x006e:
        r4 = r10.getY();	 Catch:{ RuntimeException -> 0x00a7 }
        r5 = r8.d;	 Catch:{ RuntimeException -> 0x00a7 }
        r6 = (float) r3;
        r5 = r5 * r6;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 < 0) goto L_0x0096;
    L_0x007a:
        r4 = r10.getX();	 Catch:{ RuntimeException -> 0x00a9 }
        r5 = r8.c;	 Catch:{ RuntimeException -> 0x00a9 }
        r5 = r7 - r5;
        r2 = (float) r2;
        r2 = r2 * r5;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 > 0) goto L_0x0096;
    L_0x0088:
        r2 = r10.getY();	 Catch:{ RuntimeException -> 0x00ab }
        r4 = r8.a;	 Catch:{ RuntimeException -> 0x00ab }
        r4 = r7 - r4;
        r3 = (float) r3;	 Catch:{ RuntimeException -> 0x00ab }
        r3 = r3 * r4;
        r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r2 <= 0) goto L_0x00ad;
    L_0x0096:
        r1 = z;	 Catch:{ RuntimeException -> 0x00ab }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x00ab }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x00ab }
    L_0x009e:
        return r0;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = r1;
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gt.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public gt(float f, float f2, float f3, float f4) {
        Log.i(z[7] + f + z[8] + f3 + z[9] + f2 + z[5] + f4);
        if (f < 0.0f || f > 1.0f || f3 < 0.0f || f3 > 1.0f || f2 < 0.0f || f2 > 1.0f || f4 < 0.0f || f4 > 1.0f) {
            try {
                throw new RuntimeException(z[6]);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        this.b = f;
        this.c = f3;
        this.d = f2;
        this.a = f4;
    }
}
