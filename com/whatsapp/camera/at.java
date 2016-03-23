package com.whatsapp.camera;

import android.net.Uri;
import android.os.AsyncTask;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.util.c_;
import java.io.IOException;
import org.v;

class at extends AsyncTask {
    private static final String z;
    final s a;
    final Uri b;

    static {
        char[] toCharArray = "3#\u0000J61#\u000e[-&+\u0019Vk50\u001f@6jb".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 80;
                    break;
                case org.whispersystems.at.g /*1*/:
                    i2 = 66;
                    break;
                case org.whispersystems.at.i /*2*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case org.whispersystems.at.o /*3*/:
                    i2 = 47;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Throwable a(Void[] voidArr) {
        Throwable e;
        try {
            ag.a(this.a.b, CameraActivity.e(this.a.b).p, this.b);
            return null;
        } catch (OutOfMemoryError e2) {
            e = e2;
            Log.e(z + e.getMessage());
            return e;
        } catch (IOException e3) {
            e = e3;
            Log.e(z + e.getMessage());
            return e;
        } catch (c_ e4) {
            e = e4;
            Log.e(z + e.getMessage());
            return e;
        } catch (SecurityException e5) {
            e = e5;
            Log.e(z + e.getMessage());
            return e;
        }
    }

    protected void onPostExecute(Object obj) {
        a((Throwable) obj);
    }

    at(s sVar, Uri uri) {
        this.a = sVar;
        this.b = uri;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.lang.Throwable r5) {
        /*
        r4 = this;
        r0 = com.whatsapp.camera.CameraActivity.I;
        r1 = r4.a;	 Catch:{ SecurityException -> 0x006d }
        r1 = r1.b;	 Catch:{ SecurityException -> 0x006d }
        r2 = 2131755410; // 0x7f100192 float:1.9141698E38 double:1.0532271134E-314;
        r1 = r1.findViewById(r2);	 Catch:{ SecurityException -> 0x006d }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ SecurityException -> 0x006d }
        r1 = r5 instanceof java.io.FileNotFoundException;	 Catch:{ SecurityException -> 0x006d }
        if (r1 == 0) goto L_0x0023;
    L_0x0016:
        r1 = r4.a;	 Catch:{ SecurityException -> 0x006f }
        r1 = r1.b;	 Catch:{ SecurityException -> 0x006f }
        r2 = 2131230876; // 0x7f08009c float:1.8077817E38 double:1.052967959E-314;
        r3 = 1;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ SecurityException -> 0x006f }
        if (r0 == 0) goto L_0x0065;
    L_0x0023:
        r1 = r5 instanceof java.lang.OutOfMemoryError;	 Catch:{ SecurityException -> 0x0071 }
        if (r1 == 0) goto L_0x0034;
    L_0x0027:
        r1 = r4.a;	 Catch:{ SecurityException -> 0x0073 }
        r1 = r1.b;	 Catch:{ SecurityException -> 0x0073 }
        r2 = 2131230876; // 0x7f08009c float:1.8077817E38 double:1.052967959E-314;
        r3 = 1;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ SecurityException -> 0x0073 }
        if (r0 == 0) goto L_0x0065;
    L_0x0034:
        r1 = r5 instanceof java.io.IOException;	 Catch:{ SecurityException -> 0x0075 }
        if (r1 == 0) goto L_0x0045;
    L_0x0038:
        r1 = r4.a;	 Catch:{ SecurityException -> 0x0077 }
        r1 = r1.b;	 Catch:{ SecurityException -> 0x0077 }
        r2 = 2131230876; // 0x7f08009c float:1.8077817E38 double:1.052967959E-314;
        r3 = 1;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ SecurityException -> 0x0077 }
        if (r0 == 0) goto L_0x0065;
    L_0x0045:
        r1 = r5 instanceof com.whatsapp.util.c_;	 Catch:{ SecurityException -> 0x0079 }
        if (r1 == 0) goto L_0x0056;
    L_0x0049:
        r1 = r4.a;	 Catch:{ SecurityException -> 0x007b }
        r1 = r1.b;	 Catch:{ SecurityException -> 0x007b }
        r2 = 2131230876; // 0x7f08009c float:1.8077817E38 double:1.052967959E-314;
        r3 = 1;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ SecurityException -> 0x007b }
        if (r0 == 0) goto L_0x0065;
    L_0x0056:
        r0 = r5 instanceof java.lang.SecurityException;	 Catch:{ SecurityException -> 0x007d }
        if (r0 == 0) goto L_0x0065;
    L_0x005a:
        r0 = r4.a;	 Catch:{ SecurityException -> 0x007d }
        r0 = r0.b;	 Catch:{ SecurityException -> 0x007d }
        r1 = 2131231550; // 0x7f08033e float:1.8079184E38 double:1.052968292E-314;
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ SecurityException -> 0x007d }
    L_0x0065:
        r0 = r4.a;
        r0 = r0.b;
        r0.finish();
        return;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0071 }
    L_0x0071:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0075 }
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x007d }
    L_0x007d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.at.a(java.lang.Throwable):void");
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
