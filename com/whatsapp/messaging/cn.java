package com.whatsapp.messaging;

import com.whatsapp.protocol.b5;
import com.whatsapp.qm;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class cn implements b5 {
    private static final String z;
    final bt a;

    static {
        char[] toCharArray = ";\u0013z+\u00144\fc/^1Qm)T6\u000eC5R78k2W&\u001a".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 67;
                    break;
                case at.g /*1*/:
                    i2 = 126;
                    break;
                case at.i /*2*/:
                    i2 = 10;
                    break;
                case at.o /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(int i) {
        Log.e(z);
        qm.b();
    }

    cn(bt btVar) {
        this.a = btVar;
    }
}
