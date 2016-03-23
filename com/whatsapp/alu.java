package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.notification.aw;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class alu extends AsyncTask {
    private static final String[] z;
    final App a;

    static {
        String[] strArr = new String[2];
        String str = "i\u007flj\"xk}12f`h,1'jn78z/";
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
                        i3 = 8;
                        break;
                    case at.g /*1*/:
                        i3 = 15;
                        break;
                    case at.i /*2*/:
                        i3 = 28;
                        break;
                    case at.o /*3*/:
                        i3 = 69;
                        break;
                    default:
                        i3 = 87;
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
                    str = "i\u007flj\"xk}12f`h,1q n 1zjo-xm}n*%";
                    obj = null;
            }
        }
    }

    protected Void a(Void[] voidArr) {
        try {
            App.as.a(qa.g());
            aw.a().a(App.z(), true);
        } catch (Exception e) {
            Log.w(z[0] + e.toString());
        }
        return null;
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Void voidR) {
        try {
            App.b(true, true, true, false);
        } catch (Throwable e) {
            Log.c(z[1], e);
        }
    }

    alu(App app) {
        this.a = app;
    }
}
