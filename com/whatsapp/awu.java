package com.whatsapp;

import com.whatsapp.fieldstats.a;
import com.whatsapp.fieldstats.ac;
import com.whatsapp.fieldstats.i;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

class awu implements Runnable {
    private static final String z;
    final String a;
    final Vector b;
    final String c;
    final NewGroup d;

    static {
        char[] toCharArray = "=4\n<<\u0007*\u0011'+,".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 78;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    awu(NewGroup newGroup, String str, String str2, Vector vector) {
        this.d = newGroup;
        this.c = str;
        this.a = str2;
        this.b = vector;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.b(new a3n(this, this.c, this.a, this.b, 14));
            i.a(App.z(), a.GROUP_CREATE_C, Integer.valueOf(1));
            av acVar = new ac();
            acVar.a = Double.valueOf((double) this.d.getIntent().getIntExtra(z, 0));
            i.a(App.z(), acVar);
        } catch (InterruptedException e) {
        }
    }
}
