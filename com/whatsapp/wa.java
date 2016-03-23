package com.whatsapp;

import com.whatsapp.protocol.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.v;
import org.whispersystems.at;

class wa implements Runnable {
    private static final String z;
    final String a;
    final kd b;
    final String c;
    final c2 d;
    final int e;

    static {
        char[] toCharArray = "\u0002F\u001b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 117;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 121;
                    break;
                case at.o /*3*/:
                    i2 = 13;
                    break;
                default:
                    i2 = 122;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    wa(kd kdVar, int i, c2 c2Var, String str, String str2) {
        this.b = kdVar;
        this.e = i;
        this.d = c2Var;
        this.c = str;
        this.a = str2;
    }

    public void run() {
        int i;
        List list;
        boolean z = DialogToastActivity.f;
        int i2 = this.e;
        if (wn.f) {
            i2 = 15;
            if (!z) {
                i = 15;
                list = null;
                App.a(this.c, list, i);
                App.c(this.c, this.a, z);
            }
        }
        i = i2;
        List arrayList = new ArrayList(this.d.q.size());
        Iterator it = this.d.q.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Integer num = (Integer) wn.l.get(str);
            if (num != null && num.intValue() > 0) {
                c2 c2Var = new c2();
                c2Var.i = str;
                c2Var.c = num.intValue();
                arrayList.add(c2Var);
                continue;
            }
            if (z) {
                break;
            }
        }
        list = arrayList;
        App.a(this.c, list, i);
        App.c(this.c, this.a, z);
    }
}
