package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

final class b8 extends aX {
    private static final String z;

    static {
        char[] toCharArray = "\u0002{?\u0007".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 83;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    b8() {
    }

    public void a(eE eEVar, Object obj) {
        a(eEVar, (Boolean) obj);
    }

    public void a(eE eEVar, Boolean bool) {
        eEVar.b(bool == null ? z : bool.toString());
    }
}
