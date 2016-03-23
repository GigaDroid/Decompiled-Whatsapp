package org;

import java.util.EventObject;

public class E extends EventObject {
    private static final long serialVersionUID = 403743538418947240L;
    private final String a;
    private final String b;
    private final int c;
    private final boolean d;

    public int c() {
        return this.c;
    }

    public String b() {
        return this.a;
    }

    public E(Object obj, String str, String str2) {
        super(obj);
        this.c = 0;
        this.a = str2;
        this.d = true;
        this.b = str;
    }

    public boolean e() {
        return this.d;
    }

    public boolean d() {
        return !e();
    }

    public E(Object obj, int i, String str) {
        boolean z = false;
        boolean z2 = B.f;
        super(obj);
        this.c = i;
        this.a = str;
        this.d = false;
        this.b = null;
        if (K.b != 0) {
            if (!z2) {
                z = true;
            }
            B.f = z;
        }
    }

    public String a() {
        return this.b;
    }
}
