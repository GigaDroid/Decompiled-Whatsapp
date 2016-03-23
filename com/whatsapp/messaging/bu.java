package com.whatsapp.messaging;

import android.content.Context;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import org.v;
import org.whispersystems.at;

public final class bu {
    private static boolean a;
    private static String b;
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "R4Z\u0007\u001bbzO\nWu?H\n\u001bq?\u001b\u0001\u0012e/\\E\u001fh)O";
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
                        i3 = 7;
                        break;
                    case at.g /*1*/:
                        i3 = 90;
                        break;
                    case at.i /*2*/:
                        i3 = 59;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    default:
                        i3 = 119;
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
                    str = "c?Y\u0010\u0010X9S\u0004\u0003X2T\u0016\u0003";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "C?Y\u0010\u0010'2T\u0016\u0003'7Z\u001cWe?\u001b,'ql\u0015E#o3HE\u001etzU\n\u0003'?C\u0015\u001bn9R\u0011\u001b~zH\u0010\u0007w5I\u0011\u0012czZ\u0011Ws2R\u0016Ws3V\u0000Y";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static synchronized String a(File file) {
        String str;
        Throwable e;
        synchronized (bu.class) {
            try {
                if (a) {
                    str = b;
                } else {
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
                        Object readObject = objectInputStream.readObject();
                        objectInputStream.close();
                        b = (String) readObject;
                        a = true;
                        str = b;
                    } catch (FileNotFoundException e2) {
                        str = null;
                        return str;
                    } catch (IOException e3) {
                        e = e3;
                        Log.c(e);
                        str = null;
                        return str;
                    } catch (ClassNotFoundException e4) {
                        e = e4;
                        Log.c(e);
                        str = null;
                        return str;
                    } catch (ClassCastException e5) {
                        e = e5;
                        Log.c(e);
                        str = null;
                        return str;
                    }
                }
            } catch (FileNotFoundException e6) {
                throw e6;
            }
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.net.InetSocketAddress a(android.content.Context r7) {
        /*
        r4 = -1;
        r6 = 0;
        r0 = 0;
        r1 = com.whatsapp.App.am;	 Catch:{ NumberFormatException -> 0x0009 }
        r2 = 3;
        if (r1 >= r2) goto L_0x000b;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r2 = 5222; // 0x1466 float:7.318E-42 double:2.58E-320;
        r1 = b(r7);
        r1 = a(r1);
        if (r1 == 0) goto L_0x0008;
    L_0x0017:
        r3 = 58;
        r3 = r1.indexOf(r3);
        if (r3 == r4) goto L_0x003f;
    L_0x001f:
        r3 = ":";
        r3 = r1.split(r3, r4);
        r4 = r3.length;	 Catch:{ NumberFormatException -> 0x0054 }
        r5 = 2;
        if (r4 == r5) goto L_0x0036;
    L_0x002a:
        r4 = z;	 Catch:{ NumberFormatException -> 0x0054 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0054 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ NumberFormatException -> 0x0054 }
        r4 = com.whatsapp.messaging.co.a;	 Catch:{ NumberFormatException -> 0x0054 }
        if (r4 == 0) goto L_0x003f;
    L_0x0036:
        r1 = r3[r6];
        r2 = 1;
        r2 = r3[r2];	 Catch:{ NumberFormatException -> 0x0056 }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ NumberFormatException -> 0x0056 }
    L_0x003f:
        r3 = com.whatsapp.util.dns.i.a();	 Catch:{ UnknownHostException -> 0x005b }
        r0 = r3.d(r1);	 Catch:{ UnknownHostException -> 0x005b }
        r0 = r0.get(r6);
        r0 = (java.net.InetAddress) r0;
        r1 = new java.net.InetSocketAddress;
        r1.<init>(r0, r2);
        r0 = r1;
        goto L_0x0008;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r1 = move-exception;
        com.whatsapp.util.Log.c(r1);
        goto L_0x0008;
    L_0x005b:
        r1 = move-exception;
        r2 = z;
        r2 = r2[r6];
        com.whatsapp.util.Log.c(r2, r1);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.bu.a(android.content.Context):java.net.InetSocketAddress");
    }

    private static File b(Context context) {
        return new File(context.getFilesDir(), z[2]);
    }
}
