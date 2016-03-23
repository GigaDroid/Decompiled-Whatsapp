package com.whatsapp.protocol;

import java.io.Writer;

public final class bm implements bc {
    private final Writer a;
    private final bl b;
    private final bc c;
    private final bc d;
    private final String e;

    public bm(bc bcVar, bc bcVar2, Writer writer, String str) {
        this.d = bcVar;
        this.c = bcVar2;
        this.a = writer;
        this.b = new bj(this.a);
        this.e = str;
    }

    public cw a(byte[] bArr) {
        cw a = this.c.a(bArr);
        try {
            this.a.write(this.e);
            this.b.a(a);
        } catch (Throwable th) {
        }
        return a;
    }

    public cw a() {
        cw a = this.d.a();
        try {
            this.a.write(this.e);
            this.b.a(a);
        } catch (Throwable th) {
        }
        return a;
    }

    public String b() {
        return this.d.b();
    }
}
