package com.whatsapp;

import com.whatsapp.protocol.b5;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class ain implements b5 {
    private static final String z;
    final boolean a;

    static {
        char[] toCharArray = ";3\u001b\u001c_50\u001eCO;7\u000e\u001cJ9 \u000eC_z&\u0019AD(~".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 90;
                    break;
                case at.g /*1*/:
                    i2 = 67;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 51;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ain(boolean z) {
        this.a = z;
    }

    public void a(int i) {
        Log.i(z + i + " " + this.a);
    }
}
