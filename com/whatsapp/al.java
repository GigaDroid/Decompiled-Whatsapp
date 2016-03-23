package com.whatsapp;

import com.whatsapp.protocol.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.v;
import org.whispersystems.at;

class al implements Runnable {
    private static final String z;
    final String a;
    final String b;
    final kd c;
    final c2 d;

    static {
        char[] toCharArray = "su5".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 16;
                    break;
                case at.i /*2*/:
                    i2 = 87;
                    break;
                case at.o /*3*/:
                    i2 = 43;
                    break;
                default:
                    i2 = 51;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    al(kd kdVar, c2 c2Var, String str, String str2) {
        this.c = kdVar;
        this.d = c2Var;
        this.a = str;
        this.b = str2;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        kd.a(this.c);
        ArrayList a = App.aK.a(this.d.u, Integer.MAX_VALUE, 100);
        List arrayList = new ArrayList(a.size());
        Iterator it = a.iterator();
        while (it.hasNext()) {
            q7 q7Var = (q7) it.next();
            if (!(q7Var == null || q7Var.b == null)) {
                arrayList.add(q7Var.b);
                continue;
            }
            if (z) {
                break;
            }
        }
        kd.a(this.c);
        App.b(this.a, arrayList, 19);
        kd.a(this.c);
        App.c(this.a, this.b, z);
    }
}
