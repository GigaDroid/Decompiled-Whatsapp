package com.whatsapp.gallerypicker;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class a2 implements Runnable {
    private static final String z;
    final int a;
    final bs b;
    final a7 c;
    final ArrayList d;

    static {
        char[] toCharArray = "-\u0015,*\u0001'\u0011$/\u00052\t.1\u0001'\u001d--\u0014\"\u0011;&O2\u00158,\u00124P.*\u00123\u0004h!\u0015#\u001b-7H3Yh&\u00012\u001c1c".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 64;
                    break;
                case at.g /*1*/:
                    i2 = 112;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 67;
                    break;
                default:
                    i2 = 96;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a2(bs bsVar, int i, ArrayList arrayList, a7 a7Var) {
        this.b = bsVar;
        this.a = i;
        this.d = arrayList;
        this.c = a7Var;
    }

    public void run() {
        if (!this.b.isCancelled()) {
            this.b.d.p = this.a;
            if (this.b.b == 0) {
                Log.i(z + this.d.size() + " " + this.c.b);
                MediaGalleryFragmentBase.e(this.b.d).addAll(this.d);
                MediaGalleryFragmentBase.e(this.b.d).add(this.c);
                this.b.d.k.notifyDataSetChanged();
            }
        }
        if (!this.b.c) {
            this.b.d.a(false);
        }
    }
}
