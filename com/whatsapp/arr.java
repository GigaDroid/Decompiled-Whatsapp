package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class arr implements Runnable {
    private static final String z;
    final avi a;
    final ArrayList b;

    static {
        char[] toCharArray = "\u001d\u0016z:i\u0016\u001ex=\u007f\u0003\u0006r#{\u0016\u0012q?n^\rq!u\u0003\u000b4={\u0002\u000b43o\u0012\u0014q%:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 113;
                    break;
                case at.g /*1*/:
                    i2 = 127;
                    break;
                case at.i /*2*/:
                    i2 = 20;
                    break;
                case at.o /*3*/:
                    i2 = 81;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    arr(avi com_whatsapp_avi, ArrayList arrayList) {
        this.a = com_whatsapp_avi;
        this.b = arrayList;
    }

    public void run() {
        if (!this.a.isCancelled() && !this.b.isEmpty()) {
            Log.i(z + avi.a(this.a) + " " + this.b.size());
            if (avi.a(this.a) == 0) {
                LinksGalleryFragment.a(this.a.c).clear();
            }
            LinksGalleryFragment.a(this.a.c).addAll(this.b);
            LinksGalleryFragment.d(this.a.c).notifyDataSetChanged();
        }
    }
}
