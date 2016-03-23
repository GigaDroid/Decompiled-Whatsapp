package com.whatsapp.util;

import android.app.Activity;
import android.view.LayoutInflater.Factory;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

final class c3 implements Factory {
    private static final String[] z;
    final Activity a;

    static {
        String[] strArr = new String[5];
        String str = "\u0003pkD\t\u0016vwE\u0004\"vwF\u0019WdwD\u000e:gp_>\u0005wpI\u000b\u0003kqD\u0019WkpL\u0006\u0016v{\n\u000f\u000fa{Z\u001e\u001emp";
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
                        i3 = 119;
                        break;
                    case at.g /*1*/:
                        i3 = 2;
                        break;
                    case at.i /*2*/:
                        i3 = 30;
                        break;
                    case at.o /*3*/:
                        i3 = 42;
                        break;
                    default:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0014ms\u0004\u000b\u0019flE\u0003\u0013,wD\u001e\u0012ppK\u0006YtwO\u001dYo{D\u001fYK}E\u0004:gp_#\u0003gs|\u0003\u0012u";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0014ms\u0004\u000b\u0019flE\u0003\u0013,wD\u001e\u0012ppK\u0006YtwO\u001dYo{D\u001fYC}^\u0003\u0018lSO\u0004\u0002KjO\u0007!k{]";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0014ms\u0004\u000b\u0019flE\u0003\u0013,wD\u001e\u0012ppK\u0006YuwN\r\u0012v0n\u0003\u0016nqM>\u001evrO";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "#gf^<\u001egi";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    c3(Activity activity) {
        this.a = activity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(java.lang.String r6, android.content.Context r7, android.util.AttributeSet r8) {
        /*
        r5 = this;
        r0 = 0;
        r1 = z;	 Catch:{ InflateException -> 0x0053 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ InflateException -> 0x0053 }
        r1 = r6.equalsIgnoreCase(r1);	 Catch:{ InflateException -> 0x0053 }
        if (r1 != 0) goto L_0x002d;
    L_0x000c:
        r1 = z;	 Catch:{ InflateException -> 0x0053 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ InflateException -> 0x0053 }
        r1 = r6.endsWith(r1);	 Catch:{ InflateException -> 0x0053 }
        if (r1 != 0) goto L_0x002d;
    L_0x0017:
        r1 = z;	 Catch:{ InflateException -> 0x0055 }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ InflateException -> 0x0055 }
        r1 = r6.equalsIgnoreCase(r1);	 Catch:{ InflateException -> 0x0055 }
        if (r1 != 0) goto L_0x002d;
    L_0x0022:
        r1 = z;	 Catch:{ InflateException -> 0x0057 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ InflateException -> 0x0057 }
        r1 = r6.equalsIgnoreCase(r1);	 Catch:{ InflateException -> 0x0057 }
        if (r1 == 0) goto L_0x0052;
    L_0x002d:
        r1 = r5.a;	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        r1 = r1.getLayoutInflater();	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        r2 = 1;
        r2 = new android.view.View[r2];	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        r3 = 0;
        r4 = 0;
        r4 = r1.createView(r6, r4, r8);	 Catch:{ InflateException -> 0x0059, ClassNotFoundException -> 0x0068 }
        r2[r3] = r4;	 Catch:{ InflateException -> 0x0059, ClassNotFoundException -> 0x0068 }
    L_0x003e:
        r1 = new android.os.Handler;	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        r3 = android.os.Looper.getMainLooper();	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        r1.<init>(r3);	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        r3 = new com.whatsapp.util.cc;	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        r3.<init>(r5, r2, r6);	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        r1.post(r3);	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        r1 = 0;
        r0 = r2[r1];	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
    L_0x0052:
        return r0;
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ InflateException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r3 = move-exception;
        r3 = z;	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        com.whatsapp.util.u.b(r6, r8, r1, r2);	 Catch:{ InflateException -> 0x0066, ClassNotFoundException -> 0x0068 }
        goto L_0x003e;
    L_0x0066:
        r1 = move-exception;
        goto L_0x0052;
    L_0x0068:
        r1 = move-exception;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.c3.onCreateView(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }
}
