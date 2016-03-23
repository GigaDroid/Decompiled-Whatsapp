package com.google;

public class fx {
    public static int a;
    private final int b;
    private final int c;

    public final int a() {
        return this.c;
    }

    public fx(int i, int i2) {
        this.c = i;
        this.b = i2;
    }

    public final int hashCode() {
        return this.c ^ this.b;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        return this.c + "(" + this.b + ')';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fx)) {
            return false;
        }
        fx fxVar = (fx) obj;
        if (this.c == fxVar.c && this.b == fxVar.b) {
            return true;
        }
        return false;
    }
}
