package com.google;

import java.util.List;

public final class am {
    private Integer a;
    private final String b;
    private Object c;
    private Integer d;
    private final String e;
    private final List f;
    private final int g;
    private final byte[] h;
    private final int i;

    public am(byte[] bArr, String str, List list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public int a() {
        return this.i;
    }

    public boolean h() {
        return this.g >= 0 && this.i >= 0;
    }

    public am(byte[] bArr, String str, List list, String str2, int i, int i2) {
        this.h = bArr;
        this.b = str;
        this.f = list;
        this.e = str2;
        this.g = i2;
        this.i = i;
    }

    public String e() {
        return this.e;
    }

    public String f() {
        return this.b;
    }

    public List g() {
        return this.f;
    }

    public Object d() {
        return this.c;
    }

    public byte[] b() {
        return this.h;
    }

    public int c() {
        return this.g;
    }

    public void b(Integer num) {
        this.a = num;
    }

    public void a(Object obj) {
        this.c = obj;
    }

    public void a(Integer num) {
        this.d = num;
    }
}
