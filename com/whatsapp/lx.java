package com.whatsapp;

import org.v;
import org.whispersystems.at;

public enum lx {
    ;
    
    public static final lx ITEM_TYPE;
    private static final lx[] a;
    private static final String z;

    static {
        char[] toCharArray = "]%e*A@(p\"".toCharArray();
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
                    i2 = 113;
                    break;
                case at.i /*2*/:
                    i2 = 32;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        ITEM_TYPE = new lx(z, 0);
        a = new lx[]{ITEM_TYPE};
    }
}
