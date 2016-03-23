package com.whatsapp.util;

import android.net.Uri;
import android.os.AsyncTask;
import com.whatsapp.by;
import org.v;
import org.whispersystems.at;

final class c7 extends AsyncTask {
    private static final String[] z;
    final Uri a;
    final String b;
    final String c;
    final by d;

    static {
        String[] strArr = new String[2];
        String str = "%}vV=.q~Z)<q~Ls;}|[8'{gR9&lsL%&{=V3-j`P.h";
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
                        i3 = 72;
                        break;
                    case at.g /*1*/:
                        i3 = 24;
                        break;
                    case at.i /*2*/:
                        i3 = 18;
                        break;
                    case at.o /*3*/:
                        i3 = 63;
                        break;
                    default:
                        i3 = 92;
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
                    str = "\u0006w2L,){w";
                    obj = null;
            }
        }
    }

    c7(String str, Uri uri, String str2, by byVar) {
        this.c = str;
        this.a = uri;
        this.b = str2;
        this.d = byVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onPostExecute(java.lang.Object r6) {
        /*
        r5 = this;
        r4 = 0;
        r1 = com.whatsapp.util.Log.h;
        r0 = r5.d;
        r0.e();
        r0 = r6 instanceof com.whatsapp.util.aw;
        if (r0 == 0) goto L_0x001e;
    L_0x000c:
        r0 = r5.d;
        r2 = com.whatsapp.App.z();
        r3 = 2131231104; // 0x7f080180 float:1.807828E38 double:1.052968072E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2);
        if (r1 == 0) goto L_0x007d;
    L_0x001e:
        r0 = r6 instanceof java.io.IOException;
        if (r0 == 0) goto L_0x0074;
    L_0x0022:
        r0 = r6;
        r0 = (java.io.IOException) r0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r0.toString();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r2 = r0.getMessage();
        if (r2 == 0) goto L_0x0068;
    L_0x0047:
        r0 = r0.getMessage();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r0 = r0.contains(r2);
        if (r0 == 0) goto L_0x0068;
    L_0x0056:
        r0 = r5.d;
        r2 = com.whatsapp.App.z();
        r3 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2);
        if (r1 == 0) goto L_0x0072;
    L_0x0068:
        r0 = com.whatsapp.App.z();
        r2 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        com.whatsapp.App.a(r0, r2, r4);
    L_0x0072:
        if (r1 == 0) goto L_0x007d;
    L_0x0074:
        r0 = r6 instanceof com.whatsapp.protocol.co;
        if (r0 == 0) goto L_0x007d;
    L_0x0078:
        r6 = (com.whatsapp.protocol.co) r6;
        com.whatsapp.App.q(r6);
    L_0x007d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.c7.onPostExecute(java.lang.Object):void");
    }

    protected Object a(Void[] voidArr) {
        Object a;
        try {
            a = cb.a(this.c, this.a, this.b);
        } catch (Exception e) {
            a = e;
        }
        return a;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
