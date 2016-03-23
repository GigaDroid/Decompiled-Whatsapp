package org.whispersystems.jobqueue;

import android.content.Context;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.v;
import org.whispersystems.at;
import org.whispersystems.jobqueue.requirements.a;

public class q {
    private static final String z;
    private o a;
    private String b;
    private final Context c;
    private List d;
    private t e;
    private int f;

    static {
        char[] toCharArray = "\u0017CB$\u001e;_C$\u0000>ITm\u00157\fV$\u001d/AR%".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 78;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 55;
                    break;
                case at.o /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public q a(int i) {
        this.f = i;
        return this;
    }

    public h a() {
        boolean z = h.c;
        try {
            if (this.b == null) {
                throw new IllegalArgumentException(z);
            }
            try {
                if (this.d == null) {
                    this.d = new LinkedList();
                }
                try {
                    h hVar = new h(this.c, this.b, this.d, this.a, this.e, this.f, null);
                    if (v.d != 0) {
                        boolean z2;
                        if (z) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        h.c = z2;
                    }
                    return hVar;
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    public q a(t tVar) {
        this.e = tVar;
        return this;
    }

    q(Context context) {
        this.c = context;
        this.f = 5;
    }

    public q a(a[] aVarArr) {
        this.d = Arrays.asList(aVarArr);
        return this;
    }

    public q a(o oVar) {
        this.a = oVar;
        return this;
    }

    public q a(String str) {
        this.b = str;
        return this;
    }
}
