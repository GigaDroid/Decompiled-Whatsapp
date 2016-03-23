package org.whispersystems;

import com.google.bJ;
import com.google.fn;
import com.google.hh;
import com.whatsapp.arj;

public final class v {
    private static bJ a;
    private static bJ b;
    private static fn c;
    private static fn d;
    public static int e;
    private static hh f;

    static {
        String[] strArr = new String[1];
        char[] toCharArray = "^\u0000/\u001b43|\u001b\u0002(=w\u001d\"(;m\u0006\u0011587\u0019\u00005 v{x.1a\u001d\u0001?7l\u001b\u0017xl\u0013f43:~\f\u0000*&p\u0007\u0006\u001e5m\b`K^\u0010\u0019\u000788p\n9?-\u0001hR[|\u0015{`P^p\r\u00174 p\u000f\u001b?&\u0001kR[|\u0015K\u00e7[^\n*\u001d76p\u0007\u0017>\u0012p\u0007\u0015?&i\u001b\u001b4 \u000bfx]\"|\u001b\u00013;wqszU1d`o^\t\u0005\u001d95u/\u001b43|\u001b\u0002(=w\u001djXt\u0018AyhO7\u001d\u0017\" j\f\u0011/&|G43:~\f\u0000*&p\u0007\u0006\u001e5m\b`l^\b\u001b\u00177;m\f43:~\f\u0000*&p\u0007\u0006BW9hZQf\u0002G\u0006?,m\u001a\u00179!k\f\\\u001c=w\u000e\u0017($k\u0000\u001c.\u0010x\u001d\u0013\u0018j\u0013@\u001d(37\u001e\u001a3'i\f\u0000)-j\u001d\u00177'7\u0005\u001b85a\u0006\u001e5 uG\u00143:~\f\u0000*&p\u0007\u0006\u0018E_\u0000\u001c=1k\u0019\u00003:m9\u00005 v\u001a".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case org.v.m /*0*/:
                    i2 = 84;
                    break;
                case at.g /*1*/:
                    i2 = 25;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.o /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 90;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        hh.a(strArr, new hh[0], new a6());
    }

    static bJ b(bJ bJVar) {
        b = bJVar;
        return bJVar;
    }

    public static hh a() {
        return f;
    }

    static bJ a(bJ bJVar) {
        a = bJVar;
        return bJVar;
    }

    static fn d() {
        return c;
    }

    static bJ b() {
        return b;
    }

    static fn c() {
        return d;
    }

    static fn b(fn fnVar) {
        d = fnVar;
        return fnVar;
    }

    static bJ e() {
        return a;
    }

    static hh a(hh hhVar) {
        f = hhVar;
        return hhVar;
    }

    static fn a(fn fnVar) {
        c = fnVar;
        return fnVar;
    }
}
