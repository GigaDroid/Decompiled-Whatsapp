package com.whatsapp.util;

import android.net.Uri;
import android.os.AsyncTask;
import com.whatsapp.arj;
import com.whatsapp.by;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

final class ba extends AsyncTask {
    private static final String[] z;
    final m a;
    final Uri b;
    final by c;

    static {
        String[] strArr = new String[2];
        String str = "{\u0006\u0019\u0010xT\n\\";
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
                        i3 = 53;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 57;
                        break;
                    case at.o /*3*/:
                        i3 = 99;
                        break;
                    default:
                        i3 = 8;
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
                    str = "X\f]\niS\u0000U\u0006}A\u0000U\u0010'R\fM\u0005aY\f_\u0011gX\u0004\\\u0007aT\u001aM\fzP\bJ\u001afVFP\fmG\u001bV\u0011(";
                    obj = null;
            }
        }
    }

    ba(Uri uri, by byVar, m mVar) {
        this.b = uri;
        this.c = byVar;
        this.a = mVar;
    }

    protected Object a(Void[] voidArr) {
        Object d;
        try {
            d = ag.d(this.b);
        } catch (IOException e) {
            d = e;
        }
        return d;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onPostExecute(java.lang.Object r7) {
        /*
        r6 = this;
        r5 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r4 = 0;
        r1 = com.whatsapp.util.Log.h;
        r0 = r6.c;
        r0.e();
        r0 = r7 instanceof java.io.File;
        if (r0 == 0) goto L_0x0019;
    L_0x000f:
        r2 = r6.a;
        r0 = r7;
        r0 = (java.io.File) r0;
        r2.a(r0);
        if (r1 == 0) goto L_0x0072;
    L_0x0019:
        r0 = r7 instanceof java.io.IOException;
        if (r0 == 0) goto L_0x006b;
    L_0x001d:
        r7 = (java.io.IOException) r7;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r7.toString();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r7.getMessage();
        if (r0 == 0) goto L_0x0062;
    L_0x0042:
        r0 = r7.getMessage();
        r2 = z;
        r2 = r2[r4];
        r0 = r0.contains(r2);
        if (r0 == 0) goto L_0x0062;
    L_0x0050:
        r0 = r6.c;
        r2 = com.whatsapp.App.z();
        r3 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r2 = r2.getString(r3);
        com.whatsapp.App.a(r0, r2);
        if (r1 == 0) goto L_0x0069;
    L_0x0062:
        r0 = com.whatsapp.App.z();
        com.whatsapp.App.a(r0, r5, r4);
    L_0x0069:
        if (r1 == 0) goto L_0x0072;
    L_0x006b:
        r0 = com.whatsapp.App.z();
        com.whatsapp.App.a(r0, r5, r4);
    L_0x0072:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ba.onPostExecute(java.lang.Object):void");
    }
}
