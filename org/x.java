package org;

import com.whatsapp.WAAppCompatActivity;
import org.whispersystems.ag;
import org.whispersystems.aw;

public class x {
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] g;
    private aw c;
    private byte[] d;
    private final ag e;
    private long f;
    private final h h;

    public byte[] b(a9 a9Var) {
        return b(a9Var.a());
    }

    static {
        b = new byte[]{(byte) 78, (byte) 111, (byte) 105, (byte) 115, (byte) 101, (byte) 95, (byte) 88, (byte) 88, (byte) 95, (byte) 50, (byte) 53, (byte) 53, (byte) 49, (byte) 57, (byte) 95, (byte) 65, (byte) 69, (byte) 83, (byte) 71, (byte) 67, (byte) 77, (byte) 95, (byte) 83, (byte) 72, (byte) 65, (byte) 50, (byte) 53, (byte) 54, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        g = new byte[]{(byte) 78, (byte) 111, (byte) 105, (byte) 115, (byte) 101, (byte) 95, (byte) 73, (byte) 75, (byte) 95, (byte) 50, (byte) 53, (byte) 53, (byte) 49, (byte) 57, (byte) 95, (byte) 65, (byte) 69, (byte) 83, (byte) 71, (byte) 67, (byte) 77, (byte) 95, (byte) 83, (byte) 72, (byte) 65, (byte) 50, (byte) 53, (byte) 54, (byte) 0, (byte) 0, (byte) 0, (byte) 0};
        a = new byte[]{(byte) 78, (byte) 111, (byte) 105, (byte) 115, (byte) 101, (byte) 95, (byte) 88, (byte) 88, (byte) 102, (byte) 97, (byte) 108, (byte) 108, (byte) 98, (byte) 97, (byte) 99, (byte) 107, (byte) 95, (byte) 50, (byte) 53, (byte) 53, (byte) 49, (byte) 57, (byte) 95, (byte) 65, (byte) 69, (byte) 83, (byte) 71, (byte) 67, (byte) 77, (byte) 95, (byte) 83, (byte) 72, (byte) 65, (byte) 50, (byte) 53, (byte) 54};
    }

    public byte[] b(byte[] bArr) {
        if (this.c != null) {
            aw awVar = this.c;
            long j = this.f;
            this.f = 1 + j;
            byte[] a = awVar.a(j, this.h.a(), bArr);
            if (h.b == 0) {
                bArr = a;
            }
        }
        this.h.a(bArr);
        return bArr;
    }

    public byte[] a(a9 a9Var) {
        byte[] a = a9Var.a();
        this.h.a(a);
        return a;
    }

    public x(byte[] bArr, byte[] bArr2) {
        this.e = ag.a(3);
        this.h = new h(bArr);
        this.d = this.h.a();
        this.h.a(bArr2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] e(byte[] r7) {
        /*
        r6 = this;
        r0 = r6.c;
        if (r0 == 0) goto L_0x001b;
    L_0x0004:
        r0 = r6.c;
        r2 = r6.f;
        r4 = 1;
        r4 = r4 + r2;
        r6.f = r4;
        r1 = r6.h;
        r1 = r1.a();
        r0 = r0.b(r2, r1, r7);
        r1 = org.h.b;
        if (r1 == 0) goto L_0x001c;
    L_0x001b:
        r0 = r7;
    L_0x001c:
        r1 = r6.h;
        r1.a(r7);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.x.e(byte[]):byte[]");
    }

    public a9 c(byte[] bArr) {
        this.h.a(bArr);
        return new a9(bArr);
    }

    public a9 a(byte[] bArr) {
        return new a9(e(bArr));
    }

    public g a(a9 a9Var, boolean z) {
        int i = h.b;
        byte[][] c = aw.c(this.e.a(new byte[0], this.d, null, 64), 32, 32);
        if (z) {
            return new g(c[0], c[1], a9Var);
        }
        g gVar = new g(c[1], c[0], a9Var);
        if (WAAppCompatActivity.c == 0) {
            return gVar;
        }
        h.b = i + 1;
        return gVar;
    }

    public void d(byte[] bArr) {
        int i = h.b;
        byte[][] c = aw.c(this.e.a(bArr, this.d, null, 64), 32, 32);
        this.d = c[0];
        this.c = new aw(c[1]);
        this.f = 0;
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }
}
