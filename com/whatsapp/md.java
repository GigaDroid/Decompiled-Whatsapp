package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import org.v;
import org.whispersystems.at;

final class md extends AsyncTask {
    private static final String z;

    static {
        char[] toCharArray = "xR\u0014\u0012%fPZ\u0013~m\u0017\t\u0013?{^\u0015\u0018lkX\u000f\u00188(Q\u0015\u0004lzR\t\u0013\"l\rZ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 8;
                    break;
                case at.g /*1*/:
                    i2 = 55;
                    break;
                case at.i /*2*/:
                    i2 = 122;
                    break;
                case at.o /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected Void a(Void[] voidArr) {
        ArrayList C = App.aK.C();
        if (!(isCancelled() || C.isEmpty())) {
            App.p.M().post(new wq(this, C));
        }
        C = App.aK.G();
        if (!(isCancelled() || C.isEmpty())) {
            App.p.M().post(new rt(this, C));
        }
        Collection K = App.aK.K();
        if (!(isCancelled() || K.isEmpty())) {
            a25.a(K);
        }
        K = App.aK.i();
        if (!(isCancelled() || K.isEmpty())) {
            Log.i(z + K.size());
            App.p.M().post(new v7(this, K));
        }
        return null;
    }

    md() {
    }
}
