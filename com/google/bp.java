package com.google;

final class bp extends bq {
    private final boolean b;
    private final String c;
    private final int d;

    bp(int i, String str, int i2) {
        super(i);
        this.b = true;
        this.d = i2;
        this.c = str;
    }

    bp(int i, String str) {
        super(i);
        this.c = str;
        this.b = false;
        this.d = 0;
    }

    boolean a() {
        return this.b;
    }

    int c() {
        return this.d;
    }

    String b() {
        return this.c;
    }
}
