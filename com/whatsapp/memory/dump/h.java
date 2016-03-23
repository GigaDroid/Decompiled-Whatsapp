package com.whatsapp.memory.dump;

import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import java.io.EOFException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class h {
    private static final String[] z;
    c a;
    int b;
    protected final g c;

    static {
        String[] strArr = new String[6];
        String str = "\u0007l\u0001\u0011\u0000T.\b\n\u0016Tg\u001a\t\u001c\u0007|\u001d\b\u0004N`\u0011\u000b\u0002";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 39;
                        break;
                    case at.g /*1*/:
                        i3 = 14;
                        break;
                    case at.i /*2*/:
                        i3 = 120;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    default:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "ca\u0016B\u0011\u0007e\u0016\n\u0012\u0007f\u0017\u0012ESaX\t\nFjX\u0004EIa\u001c\u0004\u0011F.\u0019\u0017\u0017Fw";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\f#UHEw\\1(,sG. Ef\\*$<\u0007@7!$sOX!0j^";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "Ka\u0019\u0001-Bo\b!\u0010J~X\t\nH~X\u0012\fSfX\u0010\u000bL`\u0017\u0012\u000b\u0007z\u0019\u0002E";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "nJX)\u0000Ii\f\rEJ{\u000b\u0011EEkXTI\u0007<TEQ\u000b.\u0017\u0017E\u001f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0007y\u0011\u0011\r\u0007";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private int h() {
        q();
        this.c.f();
        return this.b + 4;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(long r8) {
        /*
        r7 = this;
        r2 = com.whatsapp.memory.dump.d.a;
    L_0x0002:
        r0 = 0;
        r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x00d9;
    L_0x0008:
        r3 = r7.m();
        r0 = 1;
        r0 = r8 - r0;
        switch(r3) {
            case 1: goto L_0x004d;
            case 2: goto L_0x005c;
            case 3: goto L_0x005c;
            case 4: goto L_0x0064;
            case 5: goto L_0x00c7;
            case 6: goto L_0x006c;
            case 7: goto L_0x00c7;
            case 8: goto L_0x0074;
            case 32: goto L_0x007c;
            case 33: goto L_0x0084;
            case 34: goto L_0x008c;
            case 35: goto L_0x0094;
            case 137: goto L_0x00c7;
            case 138: goto L_0x00c7;
            case 139: goto L_0x00c7;
            case 140: goto L_0x00c7;
            case 141: goto L_0x00c7;
            case 142: goto L_0x00cf;
            case 144: goto L_0x00c7;
            case 195: goto L_0x009c;
            case 254: goto L_0x00b7;
            case 255: goto L_0x00c7;
            default: goto L_0x0013;
        };
    L_0x0013:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x004b }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x004b }
        r4 = 4;
        r2 = r2[r4];	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = r1.append(r3);	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x004b }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r7.c;	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = r2.a();	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x004b }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x004b }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x004b }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x004b }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;
    L_0x004d:
        r3 = r7.k();
        r4 = (long) r3;
        r0 = r0 - r4;
        r7.q();
        r3 = r7.b;
        r4 = (long) r3;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x005c:
        r3 = r7.l();
        r4 = (long) r3;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x0064:
        r3 = r7.a();
        r4 = (long) r3;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x006c:
        r3 = r7.h();
        r4 = (long) r3;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x0074:
        r3 = r7.o();
        r4 = (long) r3;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x007c:
        r3 = r7.n();
        r4 = (long) r3;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x0084:
        r3 = r7.f();
        r4 = (long) r3;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x008c:
        r3 = r7.e();
        r4 = (long) r3;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x0094:
        r3 = r7.i();
        r4 = (long) r3;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x009c:
        r2 = java.lang.System.err;
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2.println(r3);
        r2 = r7.i();
        r2 = (long) r2;
        r0 = r0 - r2;
        r0 = new java.lang.IllegalArgumentException;
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x00b7:
        r4 = r7.c;
        r4.f();
        r7.q();
        r4 = r7.b;
        r4 = r4 + 4;
        r4 = (long) r4;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x00c7:
        r4 = r7.k();
        r4 = (long) r4;
        r0 = r0 - r4;
        if (r2 == 0) goto L_0x00d7;
    L_0x00cf:
        r4 = r7.p();
        r4 = (long) r4;
        r0 = r0 - r4;
        if (r2 != 0) goto L_0x0013;
    L_0x00d7:
        if (r2 == 0) goto L_0x00da;
    L_0x00d9:
        return;
    L_0x00da:
        r8 = r0;
        goto L_0x0002;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.memory.dump.h.b(long):void");
    }

    protected int j() {
        int a = this.a.a(d.getType(m()));
        a((long) a);
        return a + 1;
    }

    private int a() {
        q();
        this.c.f();
        return this.b + 4;
    }

    private int o() {
        q();
        this.c.f();
        this.c.f();
        return (this.b + 4) + 4;
    }

    private String d() {
        int i = d.a;
        StringBuilder stringBuilder = new StringBuilder();
        int h = this.c.h();
        while (h != 0) {
            stringBuilder.append((char) h);
            h = this.c.h();
            if (i != 0) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    protected int m() {
        return this.c.h() & 255;
    }

    public h(g gVar) {
        this.c = gVar;
    }

    private int p() {
        q();
        this.c.f();
        this.c.f();
        return (this.b + 4) + 4;
    }

    public final void c() {
        int i = d.a;
        this.a = new c();
        try {
            d();
            this.b = this.c.f();
            this.a.a(this.b);
            this.c.c();
            while (this.c.d()) {
                int m = m();
                this.c.f();
                long b = b();
                switch (m) {
                    case Y.p /*12*/:
                    case arj.Theme_actionModeCloseButtonStyle /*28*/:
                        b(b);
                        if (i != 0) {
                            break;
                        }
                        continue;
                }
                try {
                    a(b);
                    if (i != 0) {
                        return;
                    }
                } catch (EOFException e) {
                    throw e;
                } catch (EOFException e2) {
                    throw e2;
                }
            }
        } catch (EOFException e3) {
        }
    }

    private int l() {
        a((long) ((this.b + 4) + 4));
        return (this.b + 4) + 4;
    }

    protected int n() {
        int i = 0;
        int i2 = d.a;
        q();
        int i3 = this.b;
        this.c.f();
        i3 += 4;
        q();
        i3 += this.b;
        q();
        i3 += this.b;
        q();
        i3 += this.b;
        q();
        i3 += this.b;
        q();
        i3 += this.b;
        q();
        i3 += this.b;
        this.c.f();
        i3 += 4;
        int g = g();
        i3 += 2;
        int i4 = 0;
        while (i4 < g) {
            g();
            i3 += j() + 2;
            i4++;
            if (i2 != 0) {
                WAAppCompatActivity.c++;
                break;
            }
        }
        g = g();
        i3 += 2;
        i4 = 0;
        while (i4 < g) {
            q();
            d type = d.getType(this.c.h());
            a((long) this.a.a(type));
            i3 += this.a.a(type) + (this.b + 1);
            i4++;
            if (i2 != 0) {
                break;
            }
        }
        i4 = g();
        i3 += 2;
        while (i < i4) {
            q();
            d.getType(m());
            i3 += this.b + 1;
            i++;
            if (i2 != 0) {
                break;
            }
        }
        return i3;
    }

    protected int e() {
        q();
        this.c.f();
        int f = this.c.f();
        q();
        f *= this.b;
        a((long) f);
        return f + (((this.b + 4) + 4) + this.b);
    }

    protected int f() {
        q();
        this.c.f();
        q();
        int f = this.c.f();
        a((long) f);
        return f + (((this.b + 4) + this.b) + 4);
    }

    protected long q() {
        try {
            switch (this.b) {
                case at.g /*1*/:
                    return (long) this.c.h();
                case at.i /*2*/:
                    return (long) this.c.b();
                case at.p /*4*/:
                    return (long) this.c.f();
                case aF.u /*8*/:
                    return this.c.c();
                default:
                    throw new IllegalArgumentException(z[5]);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    protected int i() {
        q();
        this.c.f();
        int f = this.c.f() * this.a.a(d.getType(m()));
        a((long) f);
        return f + (((this.b + 4) + 4) + 1);
    }

    protected int g() {
        return this.c.b() & 65535;
    }

    protected void a(long j) {
        this.c.a(this.c.e() + j);
    }

    private int k() {
        a((long) this.b);
        return this.b;
    }

    private long b() {
        return ((long) this.c.f()) & 4294967295L;
    }
}
