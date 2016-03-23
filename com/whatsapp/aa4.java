package com.whatsapp;

import com.whatsapp.protocol.br;
import com.whatsapp.protocol.c2;
import com.whatsapp.protocol.c3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

class aa4 implements Runnable {
    private static final String z;
    final String a;
    final c2 b;
    final int c;
    final String d;
    final kd e;

    static {
        char[] toCharArray = "Y\u0013\u0019".toCharArray();
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
                    i2 = 118;
                    break;
                case at.i /*2*/:
                    i2 = 123;
                    break;
                case at.o /*3*/:
                    i2 = 125;
                    break;
                default:
                    i2 = 83;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        List arrayList = new ArrayList();
        Iterator it = this.b.q.iterator();
        while (it.hasNext()) {
            long j;
            Object obj;
            c2 c2Var = (c2) it.next();
            kd.a(this.e);
            Map c = App.aK.c(new c3(c2Var.n, c2Var.o, c2Var.a));
            Vector vector = new Vector(c.size());
            long j2 = 0;
            for (Entry entry : c.entrySet()) {
                Object obj2;
                c3 c3Var = (c3) entry.getKey();
                String str = c3Var.b;
                boolean z2 = c3Var.a;
                x4 x4Var = (x4) entry.getValue();
                j = 0;
                br brVar;
                if (x4Var.c > c2Var.m) {
                    brVar = new br(str, z2, 4);
                    j = x4Var.c;
                    obj2 = brVar;
                } else {
                    br brVar2;
                    if (x4Var.a > c2Var.m) {
                        brVar = new br(str, z2, 3);
                        j = x4Var.a;
                        brVar2 = brVar;
                    } else {
                        if (x4Var.d > c2Var.m) {
                            brVar = new br(str, z2, 2);
                            j = x4Var.d;
                            brVar2 = brVar;
                        } else {
                            if (x4Var.b > c2Var.m) {
                                brVar = new br(str, z2, 1);
                                j = x4Var.b;
                                brVar2 = brVar;
                            } else {
                                obj2 = null;
                            }
                        }
                    }
                }
                if (obj2 != null) {
                    vector.add(obj2);
                    if (j > j2) {
                        j2 = j;
                    }
                    j = j2;
                } else {
                    j = j2;
                }
                if (z) {
                    break;
                }
                j2 = j;
            }
            j = j2;
            if (vector.size() > 0) {
                c2 c2Var2 = new c2();
                c2Var2.n = c2Var.n;
                c2Var2.m = j;
                c2Var2.q = vector;
                obj = c2Var2;
            } else {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
                continue;
            }
            if (z) {
                break;
            }
        }
        App.a(this.d, arrayList, this.c);
        App.c(this.d, this.a, z);
    }

    aa4(kd kdVar, c2 c2Var, String str, int i, String str2) {
        this.e = kdVar;
        this.b = c2Var;
        this.d = str;
        this.c = i;
        this.a = str2;
    }
}
