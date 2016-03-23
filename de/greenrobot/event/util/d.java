package de.greenrobot.event.util;

import android.content.res.Resources;
import android.util.Log;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

public class d {
    private static final String z;
    h a;
    final a b;
    final int c;
    Class d;
    int e;
    final int f;
    boolean g;
    String h;
    final Resources i;

    static {
        char[] toCharArray = "W\u0012\u0006e |\u001eOp9z]Ks#j\u001cAspk\u0018Ue?l\u000fEspP9\u0006p?l\u0013B66v\u000f\u0006".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 25;
                    break;
                case at.g /*1*/:
                    i2 = 125;
                    break;
                case at.i /*2*/:
                    i2 = 38;
                    break;
                case at.o /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 80;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    h b() {
        return this.a != null ? this.a : h.b();
    }

    public void a() {
        this.g = false;
    }

    public void a(String str) {
        this.h = str;
    }

    public void a(int i) {
        this.e = i;
    }

    public void a(h hVar) {
        this.a = hVar;
    }

    public int a(Throwable th) {
        Integer a = this.b.a(th);
        if (a != null) {
            return a.intValue();
        }
        Log.d(h.q, z + th);
        return this.f;
    }

    public void a(Class cls) {
        this.d = cls;
    }

    public d(Resources resources, int i, int i2) {
        this.g = true;
        this.i = resources;
        this.c = i;
        this.f = i2;
        this.b = new a();
    }

    public d a(Class cls, int i) {
        this.b.a(cls, i);
        return this;
    }
}
