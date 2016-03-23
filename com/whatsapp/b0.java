package com.whatsapp;

import com.whatsapp.protocol.bd;
import com.whatsapp.protocol.be;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

public class b0 implements bd {
    private static final String[] z;
    public String a;
    public byte[] b;
    public String c;
    public String d;
    final sx e;
    @Deprecated
    public long f;
    public String g;

    static {
        String[] strArr = new String[4];
        String str = "gq\"O\u0000\u007fd*I\u0000n;)H\u0014zx)G\u0005*";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 10;
                        break;
                    case at.g /*1*/:
                        i3 = 20;
                        break;
                    case at.i /*2*/:
                        i3 = 70;
                        break;
                    case at.o /*3*/:
                        i3 = 38;
                        break;
                    default:
                        i3 = 97;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "gq\"O\u0000\u007fd*I\u0000n;)H\u0005\u007fd*O\u0002k`#\u0006";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "gq\"O\u0000\u007fd*I\u0000n;)H\u0004xf)TA";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Gq\"O\u0000*u2R\u0013cv3R\u0004y4'T\u0004*z3J\r";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private boolean b() {
        try {
            return this.b != null;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public b0(sx sxVar) {
        this.e = sxVar;
    }

    private void a(String str) {
        try {
            if (b()) {
                bq.a(new r3(this, str));
                return;
            }
            throw new AssertionError();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a(String str, String str2, int i) {
        Log.i(z[0] + ag.g(str) + ' ' + str2 + ' ' + i + ' ' + this.e.p.k);
        sx.a(this.e).cancel();
        String g = App.g(str);
        try {
            sx.c(this.e).uploadUrl = g;
            if (!sx.b(this.e)) {
                App.aK.c(this.e.p);
            }
            try {
                if (b()) {
                    a(g);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                a(new l(this.e, g, b(), i));
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void a(be beVar) {
        if (beVar != null) {
            try {
                Log.i(z[2] + ag.g(beVar.a) + ' ' + beVar.e + ' ' + beVar.d + ' ' + this.e.p.k);
                if (!DialogToastActivity.f) {
                    sx.a(this.e).cancel();
                    this.e.f = beVar;
                    sx.a(this.e, true);
                    this.e.e = true;
                    a(null);
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException(z[1]);
    }

    static void a(b0 b0Var, l lVar) {
        b0Var.a(lVar);
    }

    private void a(l lVar) {
        App.p.M().post(new a4_(this, lVar));
    }

    static boolean a(b0 b0Var) {
        return b0Var.b();
    }

    private void a() {
        App.p.M().post(new aof(this));
    }

    public void a(int i) {
        Log.w(z[3] + i + " " + this.e.p.k);
        sx.a(this.e).cancel();
        a();
    }
}
