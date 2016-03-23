package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class un implements Runnable {
    private static final String z;
    final xw a;
    final ArrayList b;

    static {
        char[] toCharArray = "0u\\-\f1tK+\u00065vS=\u0013-|M9\u00069\u007fQ,N&\u007fO7\u0013 :]-\u0002?\u007fKx".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 84;
                    break;
                case at.g /*1*/:
                    i2 = 26;
                    break;
                case at.i /*2*/:
                    i2 = 63;
                    break;
                case at.o /*3*/:
                    i2 = 88;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (!this.a.isCancelled()) {
            Log.i(z + xw.a(this.a) + " " + this.b.size());
            if (xw.a(this.a) == 0) {
                DocumentsGalleryFragment.d(this.a.d).clear();
            }
            xw.a(this.a, xw.a(this.a) + this.b.size());
            DocumentsGalleryFragment.d(this.a.d).addAll(this.b);
            DocumentsGalleryFragment.c(this.a.d).notifyDataSetChanged();
        }
    }

    un(xw xwVar, ArrayList arrayList) {
        this.a = xwVar;
        this.b = arrayList;
    }
}
