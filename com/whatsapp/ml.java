package com.whatsapp;

import com.whatsapp.protocol.c2;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

class ml implements Runnable {
    private static final String[] z;
    final String a;
    final String b;
    final c2 c;
    final kd d;
    final int e;

    static {
        String[] strArr = new String[2];
        String str = "rQV)\u0007~QV)\rvBP)\bvCyw\nvS_)\u0018aNSv_";
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
                        i3 = 19;
                        break;
                    case at.g /*1*/:
                        i3 = 33;
                        break;
                    case at.i /*2*/:
                        i3 = 38;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 127;
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
                    str = "dDD";
                    obj = null;
            }
        }
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        c2 c2Var = new c2();
        l5 f = App.as.f(this.c.n);
        if (f != null) {
            try {
                if (f.c()) {
                    c2Var.n = f.a();
                    try {
                        c2Var.m = Long.parseLong(f.j);
                    } catch (NumberFormatException e) {
                        Log.e(z[0] + f.j + " " + e);
                    }
                    Collection<adl> c = qm.c(f.p).c();
                    c2Var.q = new Vector(c.size());
                    for (adl com_whatsapp_adl : c) {
                        c2 c2Var2 = new c2();
                        c2Var2.n = com_whatsapp_adl.e;
                        c2Var2.o = com_whatsapp_adl.d;
                        c2Var.q.add(c2Var2);
                        if (z) {
                            break;
                        }
                    }
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        App.a(this.b, c2Var, this.e);
        App.c(this.b, this.a, z[1]);
    }

    ml(kd kdVar, c2 c2Var, String str, int i, String str2) {
        this.d = kdVar;
        this.c = c2Var;
        this.b = str;
        this.e = i;
        this.a = str2;
    }
}
