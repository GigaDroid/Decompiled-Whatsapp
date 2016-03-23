package com.google;

import com.whatsapp.arj;
import java.io.IOException;
import org.v;
import org.whispersystems.at;

public class hq extends IOException {
    private static final long serialVersionUID = -6947486886997889499L;
    private static final String z;

    static {
        char[] toCharArray = "q\u0004_Z#}\u001eOO2F8OM\"S\u0006\u001bH&AKLM.F\u0002UXgF\u0004\u001b^gT\u0007ZKgP\u0012OZgS\u0019I^>\u0012\nU[g@\nU\u001f(G\u001f\u001bP!\u0012\u0018K^$WE".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 50;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 59;
                    break;
                case at.o /*3*/:
                    i2 = 63;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    hq() {
        super(z);
    }
}
