package com.whatsapp;

class a_9 implements w_ {
    int[] a;
    int b;

    public a_9(int[] iArr) {
        this.a = iArr;
    }

    public int a() {
        int i = this.b < this.a.length ? this.a[this.b] : 0;
        this.b++;
        return i;
    }
}
