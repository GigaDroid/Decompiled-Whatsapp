package com.whatsapp;

import android.provider.ContactsContract.Contacts;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class _y implements Runnable {
    private static final String z;
    final rp a;

    static {
        char[] toCharArray = "gAny\u0000~Fo<\u0010i@v<\u001df".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 8;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = 29;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void run() {
        Log.i(z);
        App.z().getContentResolver().registerContentObserver(Contacts.CONTENT_URI, true, this.a);
    }

    _y(rp rpVar) {
        this.a = rpVar;
    }
}
