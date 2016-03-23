package com.whatsapp.gallerypicker;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class b9 implements Runnable {
    private static final String z;
    final bs a;
    final ArrayList b;
    final int c;

    static {
        char[] toCharArray = "\u0011\u001c^X\u0012\u001b\u0018V]\u0016\u000e\u0000\\C\u0012\u001b\u0014__\u0007\u001e\u0018IT\\\u000e\u001cJ^\u0001\bYXD\u0010\u0017\u001cN\u0011".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 124;
                    break;
                case at.g /*1*/:
                    i2 = 121;
                    break;
                case at.i /*2*/:
                    i2 = 58;
                    break;
                case at.o /*3*/:
                    i2 = 49;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    b9(bs bsVar, int i, ArrayList arrayList) {
        this.a = bsVar;
        this.c = i;
        this.b = arrayList;
    }

    public void run() {
        if (!this.a.isCancelled()) {
            this.a.d.p = this.c;
            Log.i(z + this.a.b + " " + this.b.size());
            if (this.a.b == 0) {
                MediaGalleryFragmentBase.e(this.a.d).clear();
            }
            bs bsVar = this.a;
            bsVar.b += this.b.size();
            MediaGalleryFragmentBase.e(this.a.d).addAll(this.b);
            this.a.d.k.notifyDataSetChanged();
        }
        if (!this.a.c) {
            this.a.d.a(false);
        }
    }
}
