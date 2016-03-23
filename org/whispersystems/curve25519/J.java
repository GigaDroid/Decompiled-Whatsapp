package org.whispersystems.curve25519;

public class J {
    public static int c;
    public int[] a;
    public int[] b;
    public int[] d;

    public J(int[] iArr, int[] iArr2, int[] iArr3) {
        this.d = iArr;
        this.a = iArr2;
        this.b = iArr3;
    }

    public J() {
        this.d = new int[10];
        this.a = new int[10];
        this.b = new int[10];
    }
}
