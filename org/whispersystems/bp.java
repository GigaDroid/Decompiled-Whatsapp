package org.whispersystems;

public class bp {
    private final E a;

    public bp(E e) {
        this.a = e;
    }

    public byte[] b() {
        return this.a.a();
    }

    public E a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof bp)) {
            return this.a.equals(((bp) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public bp(byte[] bArr, int i) {
        this.a = bx.a(bArr, i);
    }
}
