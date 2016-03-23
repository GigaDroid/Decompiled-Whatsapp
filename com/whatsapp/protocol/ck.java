package com.whatsapp.protocol;

import java.io.Writer;

public final class ck implements bl {
    private final String a;
    private final Writer b;
    private final bl c;
    private final bl d;
    private final bl e;

    public byte[] b(cw cwVar) {
        try {
            this.b.write(this.a);
            this.e.a(cwVar);
        } catch (Throwable th) {
        }
        return this.d.b(cwVar);
    }

    public void a() {
        this.c.a();
        this.b.write(this.a);
        this.e.a();
    }

    public void a(cw cwVar) {
        this.c.a(cwVar);
        try {
            this.b.write(this.a);
            this.e.a(cwVar);
        } catch (Throwable th) {
        }
    }

    public void a(cw cwVar, int i) {
        this.c.a(cwVar, i);
        try {
            this.b.write(this.a);
            this.e.a(cwVar);
        } catch (Throwable th) {
        }
    }

    public ck(bl blVar, bl blVar2, Writer writer, String str) {
        this.c = blVar;
        this.d = blVar2;
        this.b = writer;
        this.e = new bj(this.b);
        this.a = str;
    }
}
