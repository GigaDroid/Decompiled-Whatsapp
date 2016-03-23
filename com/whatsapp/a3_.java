package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a3_ implements a34 {
    private static final String z;
    final CallsFragment a;

    static {
        char[] toCharArray = "TM \u0019u\u0018C\"6g[@\u0000\u001aasI \u0010rRH".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 55;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 76;
                    break;
                case at.o /*3*/:
                    i2 = 117;
                    break;
                default:
                    i2 = 6;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    a3_(CallsFragment callsFragment) {
        this.a = callsFragment;
    }

    public void a() {
        Log.i(z);
        CallsFragment.i(this.a);
    }
}
