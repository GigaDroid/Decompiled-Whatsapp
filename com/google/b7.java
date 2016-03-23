package com.google;

import java.util.Arrays;
import java.util.List;

public final class b7 {
    private static final b7 c;
    private List a;
    private List b;
    private List d;
    private List e;
    private List f;

    static List c(b7 b7Var) {
        return b7Var.f;
    }

    private b7() {
    }

    static List e(b7 b7Var) {
        return b7Var.d;
    }

    private Object[] a() {
        return new Object[]{this.b, this.f, this.e, this.a, this.d};
    }

    static List b(b7 b7Var) {
        return b7Var.b;
    }

    static List e(b7 b7Var, List list) {
        b7Var.f = list;
        return list;
    }

    static {
        c = c().c();
    }

    static List a(b7 b7Var) {
        return b7Var.a;
    }

    public int a(int i) {
        boolean z = bA.b;
        int i2 = 0;
        for (hx a : this.a) {
            int a2 = eb.a(i, a) + i2;
            if (z) {
                return a2;
            }
            i2 = a2;
        }
        return i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b7) {
            return Arrays.equals(a(), ((b7) obj).a());
        }
        return false;
    }

    public int b(int i) {
        int f;
        boolean z = bA.b;
        int i2 = 0;
        for (Long longValue : this.b) {
            f = eb.f(i, longValue.longValue()) + i2;
            if (z) {
                break;
            }
            i2 = f;
        }
        f = i2;
        i2 = f;
        for (Integer intValue : this.f) {
            f = eb.g(i, intValue.intValue()) + i2;
            if (z) {
                break;
            }
            i2 = f;
        }
        f = i2;
        i2 = f;
        for (Long longValue2 : this.e) {
            f = eb.e(i, longValue2.longValue()) + i2;
            if (z) {
                break;
            }
            i2 = f;
        }
        f = i2;
        i2 = f;
        for (hx c : this.a) {
            f = eb.c(i, c) + i2;
            if (z) {
                break;
            }
            i2 = f;
        }
        f = i2;
        i2 = f;
        for (fO a : this.d) {
            f = eb.a(i, a) + i2;
            if (z) {
                return f;
            }
            i2 = f;
        }
        return i2;
    }

    public List f() {
        return this.f;
    }

    static List c(b7 b7Var, List list) {
        b7Var.d = list;
        return list;
    }

    public void a(int i, eb ebVar) {
        boolean z = bA.b;
        for (Long longValue : this.b) {
            ebVar.d(i, longValue.longValue());
            if (z) {
                break;
            }
        }
        for (Integer intValue : this.f) {
            ebVar.d(i, intValue.intValue());
            if (z) {
                break;
            }
        }
        for (Long longValue2 : this.e) {
            ebVar.a(i, longValue2.longValue());
            if (z) {
                break;
            }
        }
        for (hx d : this.a) {
            ebVar.d(i, d);
            if (z) {
                break;
            }
        }
        for (fO c : this.d) {
            ebVar.c(i, c);
            if (z) {
                return;
            }
        }
    }

    static List d(b7 b7Var) {
        return b7Var.e;
    }

    static List b(b7 b7Var, List list) {
        b7Var.a = list;
        return list;
    }

    public List b() {
        return this.a;
    }

    b7(fC fCVar) {
        this();
    }

    public List e() {
        return this.b;
    }

    static List d(b7 b7Var, List list) {
        b7Var.e = list;
        return list;
    }

    public void b(int i, eb ebVar) {
        boolean z = bA.b;
        for (hx b : this.a) {
            ebVar.b(i, b);
            if (z) {
                return;
            }
        }
    }

    public int hashCode() {
        return Arrays.hashCode(a());
    }

    public List d() {
        return this.d;
    }

    public List g() {
        return this.e;
    }

    static List a(b7 b7Var, List list) {
        b7Var.b = list;
        return list;
    }

    public static hp c() {
        return hp.b();
    }
}
