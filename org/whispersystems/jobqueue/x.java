package org.whispersystems.jobqueue;

import android.util.Log;
import com.whatsapp.arj;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

class x implements Runnable {
    private static final String z;
    final h a;
    final v b;

    static {
        char[] toCharArray = "P>\t\u001f+t0\f78".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 26;
                    break;
                case at.g /*1*/:
                    i2 = 81;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 82;
                    break;
                default:
                    i2 = 74;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    x(h hVar, v vVar) {
        this.a = hVar;
        this.b = vVar;
    }

    public void run() {
        try {
            if (this.b.d()) {
                h.d(this.a).a(this.b);
            }
            h.a(this.a).a(h.b(this.a), this.b);
            this.b.n();
            h.c(this.a).a(this.b);
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            Log.w(z, e2);
            this.b.b();
        }
    }
}
