package org.whispersystems.jobqueue;

import java.io.Serializable;
import java.util.List;

public class s implements Serializable {
    private final int a;
    private final String b;
    private transient j c;
    private final List d;
    private final long e;
    private final boolean f;
    private final boolean g;

    public String g() {
        return this.b;
    }

    private s(List list, boolean z, String str, j jVar, int i, boolean z2, long j) {
        this.d = list;
        this.g = z;
        this.b = str;
        this.c = jVar;
        this.a = i;
        this.f = z2;
        this.e = j;
    }

    s(List list, boolean z, String str, j jVar, int i, boolean z2, long j, p pVar) {
        this(list, z, str, jVar, i, z2, j);
    }

    public List b() {
        return this.d;
    }

    public int e() {
        return this.a;
    }

    public boolean c() {
        return this.f;
    }

    public static m f() {
        return new m();
    }

    public long h() {
        return this.e;
    }

    public j d() {
        return this.c;
    }

    public boolean a() {
        return this.g;
    }

    public void a(j jVar) {
        this.c = jVar;
    }
}
