package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class dk implements Runnable {
    private static final String z;
    final el a;

    static {
        char[] toCharArray = "k\u001a\u0002q?iS\u0011{=e\b\u0019l0!\u0011\u0012k,~\b\u0015jfa\r\u0017k=c\f\u00155-c\t\u001et&m\u001a]k=m\f\u0004".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 12;
                    break;
                case at.g /*1*/:
                    i2 = 126;
                    break;
                case at.i /*2*/:
                    i2 = 112;
                    break;
                case at.o /*3*/:
                    i2 = 24;
                    break;
                default:
                    i2 = 73;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        if (GoogleDriveActivity.c(this.a.b) != null) {
            GoogleDriveActivity.c(this.a.b).setIndeterminate(false);
        }
        Log.i(z);
    }

    dk(el elVar) {
        this.a = elVar;
    }
}
