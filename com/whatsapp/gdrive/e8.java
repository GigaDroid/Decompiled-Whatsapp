package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import com.whatsapp.util.ab;
import java.util.concurrent.BlockingQueue;
import org.v;
import org.whispersystems.at;

class e8 implements Runnable {
    private static final String z;
    final boolean a;
    final b6 b;
    final BlockingQueue c;
    final fu d;

    static {
        char[] toCharArray = "I\u0005B@XKLQJZG\u0017Y]W\u0001\u0005_^@B\u000eQM\u0003]\bJL\u0003M\u0000\\J".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 46;
                    break;
                case at.g /*1*/:
                    i2 = 97;
                    break;
                case at.i /*2*/:
                    i2 = 48;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 46;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    e8(fu fuVar, b6 b6Var, boolean z, BlockingQueue blockingQueue) {
        this.d = fuVar;
        this.b = b6Var;
        this.a = z;
        this.c = blockingQueue;
    }

    public void run() {
        ab abVar = new ab(z);
        try {
            long b;
            long a = this.b.a(this.a, this.b.j(), this.c, GoogleDriveActivity.e(this.d.a), GoogleDriveActivity.l(this.d.a));
            if (this.a) {
                b = a - this.b.b();
            } else {
                b = a;
            }
            GoogleDriveActivity.a(this.d.a, a, b);
        } catch (eo e) {
            throw e;
        } catch (Throwable e2) {
            Log.a(e2);
        }
        abVar.b();
    }
}
