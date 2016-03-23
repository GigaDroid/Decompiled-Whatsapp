package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;

public abstract class a9 implements f {
    protected Uri a;
    protected ContentResolver b;
    private int c;
    protected String d;
    protected final int e;
    private int f;
    protected h g;
    protected long h;
    private String i;
    private final long j;
    protected String k;

    protected a9(h hVar, ContentResolver contentResolver, long j, int i, Uri uri, String str, String str2, long j2, String str3) {
        this.f = -1;
        this.c = -1;
        this.g = hVar;
        this.b = contentResolver;
        this.h = j;
        this.e = i;
        this.a = uri;
        this.k = str;
        this.d = str2;
        this.j = j2;
        this.i = str3;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String b() {
        return this.k;
    }

    public boolean equals(Object obj) {
        return (obj == null || !(obj instanceof a9)) ? false : this.a.equals(((a9) obj).a);
    }

    public Bitmap a(int i, int i2) {
        Uri a = this.g.a(this.h);
        if (a == null) {
            return null;
        }
        Bitmap a2 = ad.a(i, i2, a, this.b);
        if (a2 != null) {
            return ad.a(a2, a());
        }
        return a2;
    }

    public int a() {
        return 0;
    }

    public String toString() {
        return this.a.toString();
    }

    public Uri c() {
        return this.a;
    }

    public long e() {
        return this.j;
    }

    public long m731a() {
        return 0;
    }

    public String d() {
        return this.d;
    }
}
