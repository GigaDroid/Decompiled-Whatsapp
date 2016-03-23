package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import org.v;
import org.whispersystems.at;

final class ax2 extends Thread {
    private static final String z;
    final a2_ a;

    static {
        char[] toCharArray = "\u00156H\"z5-v>t\"6U\u0002s$<G2".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 86;
                    break;
                case at.g /*1*/:
                    i2 = 89;
                    break;
                case at.i /*2*/:
                    i2 = 38;
                    break;
                case at.o /*3*/:
                    i2 = 86;
                    break;
                default:
                    i2 = 27;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        do {
            try {
                if (axv.a(a2_.b(this.a)).size() == 0) {
                    synchronized (axv.a(a2_.b(this.a))) {
                        axv.a(a2_.b(this.a)).wait();
                    }
                }
                if (axv.a(a2_.b(this.a)).size() != 0) {
                    at9 com_whatsapp_at9;
                    synchronized (axv.a(a2_.b(this.a))) {
                        com_whatsapp_at9 = (at9) axv.a(a2_.b(this.a)).pop();
                    }
                    Bitmap a = com_whatsapp_at9.a.a(a2_.c(this.a), a2_.a(this.a), true);
                    if (com_whatsapp_at9.b.getTag().equals(com_whatsapp_at9.a.b(a2_.c(this.a), a2_.a(this.a)))) {
                        ((Activity) com_whatsapp_at9.b.getContext()).runOnUiThread(new _7(this.a, a, com_whatsapp_at9.b, com_whatsapp_at9.a));
                    }
                }
            } catch (InterruptedException e) {
                return;
            }
        } while (!Thread.interrupted());
    }

    ax2(a2_ com_whatsapp_a2_) {
        this.a = com_whatsapp_a2_;
        super(z);
    }
}
