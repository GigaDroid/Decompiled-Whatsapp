package com.google;

import com.whatsapp.arj;
import java.util.Iterator;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

class cz implements Iterator {
    private static final String z;
    private int a;
    final h4 b;
    private boolean c;
    private Iterator d;

    static {
        char[] toCharArray = "W6X&\u0013@{\u001ci\u0012D \u0015*\u0004I?P-EG6S&\u0017@s[,\u001dQ{\u001c".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 37;
                    break;
                case at.g /*1*/:
                    i2 = 83;
                    break;
                case at.i /*2*/:
                    i2 = 53;
                    break;
                case at.o /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    cz(h4 h4Var, hm hmVar) {
        this(h4Var);
    }

    public void remove() {
        try {
            if (this.c) {
                try {
                    this.c = false;
                    h4.c(this.b);
                    if (this.a < h4.b(this.b).size()) {
                        h4 h4Var = this.b;
                        int i = this.a;
                        this.a = i - 1;
                        h4.a(h4Var, i);
                        if (!bA.b) {
                            return;
                        }
                    }
                    a().remove();
                    return;
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            throw new IllegalStateException(z);
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public boolean hasNext() {
        try {
            if (this.a + 1 >= h4.b(this.b).size()) {
                if (!a().hasNext()) {
                    return false;
                }
            }
            return true;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private Iterator a() {
        try {
            if (this.d == null) {
                this.d = h4.a(this.b).entrySet().iterator();
            }
            return this.d;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public Entry b() {
        try {
            this.c = true;
            int i = this.a + 1;
            this.a = i;
            return i < h4.b(this.b).size() ? (Entry) h4.b(this.b).get(this.a) : (Entry) a().next();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private cz(h4 h4Var) {
        this.b = h4Var;
        this.a = -1;
    }

    public Object next() {
        return b();
    }
}
