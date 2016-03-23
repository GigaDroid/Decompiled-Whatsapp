package com.whatsapp.gallerypicker;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class bx implements Runnable {
    private static final String z;
    final bs a;
    final int b;
    final ArrayList c;

    static {
        char[] toCharArray = "sn&\u001c\u0005yj.\u0019\u0001lr$\u0007\u0005yf'\u001b\u0010|j1\u0010Kln2\u001a\u0016j+.\u0014\u0017j+ \u0000\u0007un6U".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = 11;
                    break;
                case at.i /*2*/:
                    i2 = 66;
                    break;
                case at.o /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = 100;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (!(this.a.isCancelled() || this.c.isEmpty())) {
            Log.i(z + this.a.b + " " + this.c.size());
            this.a.d.p = this.b;
            if (this.a.b == 0) {
                MediaGalleryFragmentBase.e(this.a.d).clear();
            }
            MediaGalleryFragmentBase.e(this.a.d).addAll(this.c);
            this.a.d.k.notifyDataSetChanged();
        }
        if (!this.a.c) {
            this.a.d.a(false);
        }
    }

    bx(bs bsVar, ArrayList arrayList, int i) {
        this.a = bsVar;
        this.c = arrayList;
        this.b = i;
    }
}
