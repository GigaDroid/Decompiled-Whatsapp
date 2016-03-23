package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ej implements Runnable {
    private static final String z;
    final dn a;

    static {
        char[] toCharArray = "GymMcE0~GaIkvPl\u000f|jP}\rozU`Enk\u0004`N|}Hp\u0000ip\u0004tC~zWf\u0000".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 32;
                    break;
                case at.g /*1*/:
                    i2 = 29;
                    break;
                case at.i /*2*/:
                    i2 = 31;
                    break;
                case at.o /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ej(dn dnVar) {
        this.a = dnVar;
    }

    public void run() {
        Log.e(z + this.a.a);
        this.a.b.a(2131231964);
    }
}
