package com.google;

public final class e4 {
    private final fI[] a;
    private final int b;
    private final int[] c;

    public int hashCode() {
        return this.b;
    }

    public fI[] a() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public e4(int i, int[] iArr, int i2, int i3, int i4) {
        this.b = i;
        this.c = iArr;
        this.a = new fI[]{new fI((float) i2, (float) i4), new fI((float) i3, (float) i4)};
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e4)) {
            return false;
        }
        if (this.b == ((e4) obj).b) {
            return true;
        }
        return false;
    }

    public int[] b() {
        return this.c;
    }
}
