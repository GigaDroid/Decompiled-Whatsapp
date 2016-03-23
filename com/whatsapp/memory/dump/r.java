package com.whatsapp.memory.dump;

import com.whatsapp.WAAppCompatActivity;
import java.io.DataOutputStream;

public class r implements g {
    public static int c;
    private final DataOutputStream a;
    private final g b;

    public int f() {
        int f = this.b.f();
        this.a.writeInt(f);
        return f;
    }

    public void a(long j) {
        int i = c;
        a(new byte[((int) (j - this.b.e()))]);
        if (WAAppCompatActivity.c != 0) {
            c = i + 1;
        }
    }

    public void a(byte[] bArr) {
        this.b.a(bArr);
        this.a.write(bArr);
    }

    public boolean d() {
        return this.b.d();
    }

    public void b(byte[] bArr) {
        this.b.a(bArr);
        this.a.write(new byte[bArr.length]);
    }

    public long e() {
        return this.b.e();
    }

    public short b() {
        short b = this.b.b();
        this.a.writeShort(b);
        return b;
    }

    public void a(int i) {
        b(new byte[i]);
    }

    public r(g gVar, DataOutputStream dataOutputStream) {
        this.b = gVar;
        this.a = dataOutputStream;
    }

    public void g() {
        this.b.g();
        this.a.close();
    }

    public long a() {
        return this.b.a();
    }

    public byte h() {
        byte h = this.b.h();
        this.a.write(h);
        return h;
    }

    public long c() {
        long c = this.b.c();
        this.a.writeLong(c);
        return c;
    }
}
