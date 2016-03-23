package org.whispersystems;

public class C {
    private final Object a;
    private final Object b;

    public int hashCode() {
        return a().hashCode() ^ b().hashCode();
    }

    public Object b() {
        return this.a;
    }

    public C(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    private boolean a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public Object a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C) && a(((C) obj).a(), a()) && a(((C) obj).b(), b());
    }
}
