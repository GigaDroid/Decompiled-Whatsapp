package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class d0 implements Runnable {
    private static final String z;
    final boolean a;
    final el b;

    static {
        char[] toCharArray = "\u00062Pen\u0004{Col\b KxaL9@\u007f}\u0013 G~7\f%E\u007fl\u000e$G!|\u000e!L`w\u00002\u000fjq\u000f?Qd}\u0005yCol\b KxaL7N~}\u00002[!}\u0019?Vi|".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 97;
                    break;
                case at.g /*1*/:
                    i2 = 86;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 12;
                    break;
                default:
                    i2 = 24;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (!fn.a(this.b.b)) {
            GoogleDriveActivity.c(this.b.b).setProgress(100);
            GoogleDriveActivity.c(this.b.b).setIndeterminate(true);
            GoogleDriveActivity.s(this.b.b).setText(2131231935);
            GoogleDriveActivity.a(this.b.b, this.a);
            if (!GoogleDriveService.c) {
                return;
            }
        }
        Log.i(z);
    }

    d0(el elVar, boolean z) {
        this.b = elVar;
        this.a = z;
    }
}
