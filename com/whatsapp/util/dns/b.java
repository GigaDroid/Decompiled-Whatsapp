package com.whatsapp.util.dns;

import com.whatsapp.arj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import org.v;
import org.whispersystems.at;

class b {
    private static final AtomicInteger a;
    private static final String z;
    private int b;
    private final h[] c;
    private final int d;
    private final g[] e;
    private byte[] f;
    private final c g;

    void a(OutputStream outputStream) {
        int i = 0;
        int i2 = i.a;
        this.g.a(outputStream);
        h[] hVarArr = this.c;
        int length = hVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            hVarArr[i3].a(outputStream);
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        g[] gVarArr = this.e;
        int length2 = gVarArr.length;
        while (i < length2) {
            gVarArr[i].a(outputStream);
            i++;
            if (i2 != 0) {
                return;
            }
        }
    }

    private b(c cVar, h[] hVarArr, g[] gVarArr, int i) {
        this.g = cVar;
        this.c = hVarArr;
        this.e = gVarArr;
        this.d = i;
    }

    static b a(byte[] bArr) {
        return a(bArr, 0);
    }

    byte[] c() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            return null;
        }
    }

    static {
        char[] toCharArray = "+f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 119;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 122;
                    break;
                case at.o /*3*/:
                    i2 = 124;
                    break;
                default:
                    i2 = arj.Theme_editTextStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        a = new AtomicInteger();
    }

    String a(f fVar) {
        int i = 0;
        int i2 = i.a;
        StringBuilder stringBuilder = new StringBuilder();
        String[] c = fVar.c();
        int length = c.length;
        int i3 = 0;
        while (i3 < length) {
            stringBuilder.append(c[i3]).append('.');
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        if (fVar.b() != (short) 0) {
            String[] c2 = f.a(this.f, this.b + fVar.b()).c();
            int length2 = c2.length;
            while (i < length2) {
                stringBuilder.append(c2[i]).append('.');
                i++;
                if (i2 != 0) {
                    break;
                }
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    g[] b() {
        return this.e;
    }

    static b a(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = i.a;
        c a = c.a(bArr, i);
        h[] hVarArr = new h[a.e()];
        int a2 = a.a() + i;
        int i4 = 0;
        while (i4 < hVarArr.length) {
            hVarArr[i4] = h.a(bArr, a2);
            a2 += hVarArr[i4].a();
            i4++;
            if (i3 != 0) {
                break;
            }
        }
        g[] gVarArr = new g[a.g()];
        while (i2 < gVarArr.length) {
            gVarArr[i2] = g.a(bArr, a2);
            a2 += gVarArr[i2].d();
            i2++;
            if (i3 != 0) {
                break;
            }
        }
        b bVar = new b(a, hVarArr, gVarArr, -1);
        bVar.f = bArr;
        bVar.b = i;
        return bVar;
    }

    static b a(String str) {
        String[] split = str.split(z);
        c cVar = new c((short) a.getAndIncrement(), false, (byte) 0, false, false, true, false, (short) 0, (short) 1, (short) 0, (short) 0, (short) 0);
        h[] hVarArr = new h[]{h.a(f.a(split, (short) 0), (short) 1, (short) 1)};
        return new b(cVar, hVarArr, new g[0], hVarArr[0].a() + cVar.a());
    }

    c a() {
        return this.g;
    }
}
