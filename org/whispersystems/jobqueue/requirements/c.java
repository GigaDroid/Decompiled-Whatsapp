package org.whispersystems.jobqueue.requirements;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import org.v;
import org.whispersystems.at;
import org.whispersystems.jobqueue.g;

public class c implements d, g {
    private static final String z;
    private transient Context a;

    static {
        char[] toCharArray = "_t\u0012cv_o\u0015{zHb".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 60;
                    break;
                case at.g /*1*/:
                    i2 = 27;
                    break;
                case at.i /*2*/:
                    i2 = 124;
                    break;
                case at.o /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 19;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean a() {
        int i = e.c;
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService(z)).getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        if (i != 0) {
            org.whispersystems.jobqueue.v.d++;
        }
        return z;
    }

    public c(Context context) {
        int i = e.c;
        this.a = context;
        if (org.whispersystems.jobqueue.v.d != 0) {
            e.c = i + 1;
        }
    }

    public void a(Context context) {
        this.a = context;
    }
}
