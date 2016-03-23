package com.whatsapp.protocol;

public class bf {
    public long a;
    public int b;
    public boolean c;
    public String d;
    public long e;
    public int f;
    public long g;
    public c3[] h;
    public c3 i;

    public bf(String str, int i, int i2, long j, long j2, c3 c3Var) {
        this.d = str;
        this.b = i;
        this.e = j;
        this.f = i2;
        this.i = c3Var;
        this.a = j2;
    }

    public bf(String str, int i, long j) {
        this(str, i, j, 0);
    }

    public bf(String str, int i, c3 c3Var, c3[] c3VarArr, boolean z) {
        this(str, i, 0, 0, 0, c3Var);
        this.h = c3VarArr;
        this.c = z;
    }

    public bf(String str, int i, int i2) {
        this(str, i, i2, 0, 0, null);
    }

    public bf(String str, int i, long j, long j2) {
        this(str, i, 0, j, j2, null);
    }

    public bf(String str, int i, c3 c3Var) {
        this(str, i, 0, 0, 0, c3Var);
    }
}
