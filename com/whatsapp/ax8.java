package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

class ax8 implements Runnable {
    private static final String z;
    final o8 a;

    static {
        char[] toCharArray = "!T\u001ag0%^\u0010k'3^\u0001e 3R\u001cv04T\u0001`".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 87;
                    break;
                case at.g /*1*/:
                    i2 = 59;
                    break;
                case at.i /*2*/:
                    i2 = 115;
                    break;
                case at.o /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ax8(o8 o8Var) {
        this.a = o8Var;
    }

    public void run() {
        Throwable e;
        o8.a(this.a, true);
        try {
            o8.a(this.a);
        } catch (IOException e2) {
            e = e2;
            Log.b(z, e);
            o8.a(this.a, false);
        } catch (IllegalStateException e3) {
            e = e3;
            Log.b(z, e);
            o8.a(this.a, false);
        }
        o8.a(this.a, false);
    }
}
