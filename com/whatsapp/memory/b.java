package com.whatsapp.memory;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import org.v;
import org.whispersystems.at;

class b implements Runnable {
    private static final String z;
    private final WeakReference a;

    static {
        char[] toCharArray = "#)?_\u001c\u00064;Fu?#*Q4\u001b%?Xz\u0003)?_z\t#+Z>".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 111;
                    break;
                case at.g /*1*/:
                    i2 = 76;
                    break;
                case at.i /*2*/:
                    i2 = 94;
                    break;
                case at.o /*3*/:
                    i2 = 52;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Activity activity = (Activity) this.a.get();
        if (activity != null) {
            Log.i(z);
            if (e.a()) {
                e.a(activity);
            }
        }
    }

    public b(Activity activity) {
        this.a = new WeakReference(activity);
    }
}
