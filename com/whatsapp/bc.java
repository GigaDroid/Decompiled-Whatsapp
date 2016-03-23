package com.whatsapp;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class bc implements Runnable {
    private static final String z;
    final avi a;
    final ArrayList b;

    static {
        char[] toCharArray = "xVjl\u000es^hk\u0018fFbu\u001csRai\t;Maw\u0012fK$e\bwTas]".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 20;
                    break;
                case at.g /*1*/:
                    i2 = 63;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = 7;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (!this.a.isCancelled()) {
            Log.i(z + avi.a(this.a) + " " + this.b.size());
            if (avi.a(this.a) == 0) {
                LinksGalleryFragment.a(this.a.c).clear();
            }
            avi.a(this.a, avi.a(this.a) + this.b.size());
            LinksGalleryFragment.a(this.a.c).addAll(this.b);
            LinksGalleryFragment.d(this.a.c).notifyDataSetChanged();
        }
    }

    bc(avi com_whatsapp_avi, ArrayList arrayList) {
        this.a = com_whatsapp_avi;
        this.b = arrayList;
    }
}
