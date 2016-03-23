package com.whatsapp.util;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.App;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class a6 {
    private static cd a;
    private static final cd b;
    private static final String z;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized com.whatsapp.util.cd c() {
        /*
        r1 = com.whatsapp.util.a6.class;
        monitor-enter(r1);
        r0 = a;	 Catch:{ all -> 0x0027 }
        if (r0 != 0) goto L_0x0023;
    L_0x0007:
        r0 = z;	 Catch:{ all -> 0x0027 }
        r2 = com.whatsapp.aqu.g();	 Catch:{ all -> 0x0027 }
        r0 = r0.equals(r2);	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x001f;
    L_0x0013:
        r0 = new com.whatsapp.util.ad;	 Catch:{ all -> 0x0027 }
        r2 = 0;
        r0.<init>(r2);	 Catch:{ all -> 0x0027 }
        a = r0;	 Catch:{ all -> 0x0027 }
        r0 = com.whatsapp.util.Log.h;	 Catch:{ all -> 0x0027 }
        if (r0 == 0) goto L_0x0023;
    L_0x001f:
        r0 = b;	 Catch:{ all -> 0x0027 }
        a = r0;	 Catch:{ all -> 0x0027 }
    L_0x0023:
        r0 = a;	 Catch:{ all -> 0x0027 }
        monitor-exit(r1);
        return r0;
    L_0x0027:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.a6.c():com.whatsapp.util.cd");
    }

    public static double a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        return c().a(str);
    }

    public static String a(Context context, String str, int i, Object[] objArr) {
        if (!b() || str == null) {
            return context.getResources().getString(i, objArr);
        }
        return String.format(context.getResources().getConfiguration().locale, c().a(App.aK.w(str), context.getResources().getString(i)), objArr);
    }

    static {
        char[] toCharArray = "\u0006L".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 57;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                default:
                    i2 = 61;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        b = new o(null);
    }

    public static boolean b() {
        return c() != b;
    }

    public static synchronized void a() {
        synchronized (a6.class) {
            a = null;
        }
    }
}
