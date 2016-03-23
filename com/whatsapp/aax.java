package com.whatsapp;

import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

abstract class aax implements dk {
    private static final String z;
    protected final l5 a;

    static {
        char[] toCharArray = "8\u0011y\u0019);\u0011y\u0002h:\u0000~\u00173*\u0013u\u00183.\u0013nY.!\u0006{\u001a.+".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 79;
                    break;
                case at.g /*1*/:
                    i2 = 112;
                    break;
                case at.i /*2*/:
                    i2 = 26;
                    break;
                case at.o /*3*/:
                    i2 = 118;
                    break;
                default:
                    i2 = 71;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected abstract boolean b(l5 l5Var);

    public final boolean a(l5 l5Var) {
        if (l5Var == this.a) {
            return true;
        }
        if (this.a.p == null) {
            Log.e(z);
            return false;
        } else if (this.a.p.equals(l5Var.p) && b(l5Var)) {
            return true;
        } else {
            return false;
        }
    }

    public aax(l5 l5Var) {
        this.a = l5Var;
    }
}
