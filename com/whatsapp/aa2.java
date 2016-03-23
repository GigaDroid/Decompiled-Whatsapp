package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class aa2 implements Runnable {
    private static final String z;
    final ArrayList a;
    final xw b;

    static {
        char[] toCharArray = "{@1&UzA& _~C>6JfI 2_rJ<'\u0017mJ\"<Jk\u000f>2Kk\u000f0&[tJ&s".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 31;
                    break;
                case at.g /*1*/:
                    i2 = 47;
                    break;
                case at.i /*2*/:
                    i2 = 82;
                    break;
                case at.o /*3*/:
                    i2 = 83;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aa2(xw xwVar, ArrayList arrayList) {
        this.b = xwVar;
        this.a = arrayList;
    }

    public void run() {
        if (!this.b.isCancelled() && !this.a.isEmpty()) {
            Log.i(z + xw.a(this.b) + " " + this.a.size());
            if (xw.a(this.b) == 0) {
                DocumentsGalleryFragment.d(this.b.d).clear();
            }
            DocumentsGalleryFragment.d(this.b.d).addAll(this.a);
            DocumentsGalleryFragment.c(this.b.d).notifyDataSetChanged();
        }
    }
}
