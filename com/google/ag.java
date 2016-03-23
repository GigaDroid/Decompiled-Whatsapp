package com.google;

import java.util.Calendar;
import org.v;
import org.whispersystems.at;

final class ag extends aX {
    private static final String[] z;

    static {
        int i;
        String[] strArr = new String[6];
        char[] toCharArray = "\u000batx\u0011\u0005J`s".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 99;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0010kbe0\u0007".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 99;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "\u000eao~6".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 99;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "\u001ak`x".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 99;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u000ego\u007f*\u0006".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 99;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "\u0007oxE8.ao~6".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 99;
                    break;
                case at.g /*1*/:
                    i2 = 14;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 94;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[5] = new String(cArr).intern();
        z = strArr;
    }

    ag() {
    }

    public void a(eE eEVar, Object obj) {
        a(eEVar, (Calendar) obj);
    }

    public void a(eE eEVar, Calendar calendar) {
        if (calendar == null) {
            eEVar.b();
            return;
        }
        eEVar.a();
        eEVar.c(z[3]);
        eEVar.a((long) calendar.get(1));
        eEVar.c(z[2]);
        eEVar.a((long) calendar.get(2));
        eEVar.c(z[5]);
        eEVar.a((long) calendar.get(5));
        eEVar.c(z[0]);
        eEVar.a((long) calendar.get(11));
        eEVar.c(z[4]);
        eEVar.a((long) calendar.get(12));
        eEVar.c(z[1]);
        eEVar.a((long) calendar.get(13));
        eEVar.g();
    }
}
