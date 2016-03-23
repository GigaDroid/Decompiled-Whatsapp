package com.facebook.rebound;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.v;
import org.whispersystems.at;

public class m {
    public static int f;
    private static int g;
    private static final String[] z;
    private boolean a;
    private final l b;
    private boolean c;
    private final c d;
    private double e;
    private double h;
    private CopyOnWriteArraySet i;
    private final l j;
    private double k;
    private double l;
    private final String m;
    private final l n;
    private o o;
    private double p;

    public m a(o oVar) {
        if (oVar == null) {
            try {
                throw new IllegalArgumentException(z[3]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.o = oVar;
        return this;
    }

    public double f() {
        return this.b.b;
    }

    public m e(double d) {
        return a(d, true);
    }

    public m a(f fVar) {
        if (fVar == null) {
            try {
                throw new IllegalArgumentException(z[2]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.i.add(fVar);
        return this;
    }

    private void b(double d) {
        this.b.b = (this.b.b * d) + (this.j.b * (1.0d - d));
        this.b.a = (this.b.a * d) + (this.j.a * (1.0d - d));
    }

    m(c cVar) {
        int i = f;
        this.b = new l(null);
        this.j = new l(null);
        this.n = new l(null);
        this.a = true;
        this.l = 0.005d;
        this.p = 0.005d;
        this.i = new CopyOnWriteArraySet();
        this.e = 0.0d;
        if (cVar == null) {
            throw new IllegalArgumentException(z[0]);
        }
        this.d = cVar;
        StringBuilder append = new StringBuilder().append(z[1]);
        int i2 = g;
        g = i2 + 1;
        this.m = append.append(i2).toString();
        a(o.b);
        if (i != 0) {
            g.b++;
        }
    }

    public m a(double d, boolean z) {
        int i = f;
        this.k = d;
        this.b.b = d;
        this.d.a(g());
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((f) it.next()).c(this);
            if (i != 0) {
                break;
            }
        }
        if (z) {
            try {
                e();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return this;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
        r4 = this;
        r0 = r4.o;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r0 = r0.a;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x003a;
    L_0x000a:
        r0 = r4.k;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2 = r4.h;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x001c;
    L_0x0012:
        r0 = r4.f();	 Catch:{ IllegalArgumentException -> 0x0034 }
        r2 = r4.h;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x002e;
    L_0x001c:
        r0 = r4.k;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r2 = r4.h;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x003a;
    L_0x0024:
        r0 = r4.f();	 Catch:{ IllegalArgumentException -> 0x0038 }
        r2 = r4.h;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x003a;
    L_0x002e:
        r0 = 1;
    L_0x002f:
        return r0;
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r0 = 0;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rebound.m.d():boolean");
    }

    public m e() {
        this.h = this.b.b;
        this.n.b = this.b.b;
        this.b.a = 0.0d;
        return this;
    }

    public boolean a() {
        return this.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.rebound.m a(double r6) {
        /*
        r5 = this;
        r1 = f;
        r2 = r5.h;	 Catch:{ IllegalArgumentException -> 0x000f }
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x0013;
    L_0x0008:
        r0 = r5.c();	 Catch:{ IllegalArgumentException -> 0x0011 }
        if (r0 == 0) goto L_0x0013;
    L_0x000e:
        return r5;
    L_0x000f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r2 = r5.f();
        r5.k = r2;
        r5.h = r6;
        r0 = r5.d;
        r2 = r5.g();
        r0.a(r2);
        r0 = r5.i;
        r2 = r0.iterator();
    L_0x002a:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x000e;
    L_0x0030:
        r0 = r2.next();
        r0 = (com.facebook.rebound.f) r0;
        r0.d(r5);
        if (r1 == 0) goto L_0x002a;
    L_0x003b:
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rebound.m.a(double):com.facebook.rebound.m");
    }

    private double a(l lVar) {
        return Math.abs(this.h - lVar.b);
    }

    public boolean b() {
        try {
            if (c()) {
                if (a()) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "\u0018-Bmq,}Seq%2D$}.}Svz*)U`?$(Dwv/8\u0010kyk<\u0010F~88ctm\"3WWf8)Ui";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 75;
                        break;
                    case at.g /*1*/:
                        i4 = 93;
                        break;
                    case at.i /*2*/:
                        i4 = 48;
                        break;
                    case at.o /*3*/:
                        i4 = 4;
                        break;
                    default:
                        i4 = 31;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "%8GHv8)Ujz9}Yw?98Aqv98T";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    strArr2 = strArr3;
                    str = "8-Bmq,\u001e_jy\":\u0010mlk/Uuj\"/U`";
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    g = 0;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "8-Bmq,g";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void d(double r34) {
        /*
        r33 = this;
        r11 = f;
        r10 = r33.c();
        if (r10 == 0) goto L_0x0011;
    L_0x0008:
        r0 = r33;
        r2 = r0.a;	 Catch:{ IllegalArgumentException -> 0x000f }
        if (r2 == 0) goto L_0x0011;
    L_0x000e:
        return;
    L_0x000f:
        r2 = move-exception;
        throw r2;
    L_0x0011:
        r2 = 4589276106681592316; // 0x3fb0624dd2f1a9fc float:-5.18969491E11 double:0.064;
        r2 = (r34 > r2 ? 1 : (r34 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x001f;
    L_0x001a:
        r34 = 4589276106681592316; // 0x3fb0624dd2f1a9fc float:-5.18969491E11 double:0.064;
    L_0x001f:
        r0 = r33;
        r2 = r0.e;
        r2 = r2 + r34;
        r0 = r33;
        r0.e = r2;
        r0 = r33;
        r2 = r0.o;
        r12 = r2.a;
        r0 = r33;
        r2 = r0.o;
        r14 = r2.c;
        r0 = r33;
        r2 = r0.b;
        r8 = r2.b;
        r0 = r33;
        r2 = r0.b;
        r6 = r2.a;
        r0 = r33;
        r2 = r0.n;
        r4 = r2.b;
        r0 = r33;
        r2 = r0.n;
        r2 = r2.a;
    L_0x004d:
        r0 = r33;
        r0 = r0.e;
        r16 = r0;
        r18 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1));
        if (r16 < 0) goto L_0x0128;
    L_0x005c:
        r0 = r33;
        r2 = r0.e;	 Catch:{ IllegalArgumentException -> 0x01e2 }
        r16 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r2 = r2 - r16;
        r0 = r33;
        r0.e = r2;	 Catch:{ IllegalArgumentException -> 0x01e2 }
        r0 = r33;
        r2 = r0.e;	 Catch:{ IllegalArgumentException -> 0x01e2 }
        r16 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r2 >= 0) goto L_0x0084;
    L_0x0078:
        r0 = r33;
        r2 = r0.j;	 Catch:{ IllegalArgumentException -> 0x01e2 }
        r2.b = r8;	 Catch:{ IllegalArgumentException -> 0x01e2 }
        r0 = r33;
        r2 = r0.j;	 Catch:{ IllegalArgumentException -> 0x01e2 }
        r2.a = r6;	 Catch:{ IllegalArgumentException -> 0x01e2 }
    L_0x0084:
        r0 = r33;
        r2 = r0.h;
        r2 = r2 - r4;
        r2 = r2 * r12;
        r4 = r14 * r6;
        r16 = r2 - r4;
        r2 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r2 = r2 * r6;
        r4 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r2 = r2 * r4;
        r2 = r2 + r8;
        r4 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r4 = r4 * r16;
        r18 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r4 = r4 * r18;
        r18 = r6 + r4;
        r0 = r33;
        r4 = r0.h;
        r2 = r4 - r2;
        r2 = r2 * r12;
        r4 = r14 * r18;
        r20 = r2 - r4;
        r2 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r2 = r2 * r18;
        r4 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r2 = r2 * r4;
        r2 = r2 + r8;
        r4 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r4 = r4 * r20;
        r22 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r4 = r4 * r22;
        r22 = r6 + r4;
        r0 = r33;
        r4 = r0.h;
        r2 = r4 - r2;
        r2 = r2 * r12;
        r4 = r14 * r22;
        r24 = r2 - r4;
        r2 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r2 = r2 * r22;
        r4 = r8 + r2;
        r2 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r2 = r2 * r24;
        r2 = r2 + r6;
        r0 = r33;
        r0 = r0.h;
        r26 = r0;
        r26 = r26 - r4;
        r26 = r26 * r12;
        r28 = r14 * r2;
        r26 = r26 - r28;
        r28 = 4595172819793696085; // 0x3fc5555555555555 float:1.46601547E13 double:0.16666666666666666;
        r30 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r18 = r18 + r22;
        r18 = r18 * r30;
        r18 = r18 + r6;
        r18 = r18 + r2;
        r18 = r18 * r28;
        r22 = 4595172819793696085; // 0x3fc5555555555555 float:1.46601547E13 double:0.16666666666666666;
        r28 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r20 = r20 + r24;
        r20 = r20 * r28;
        r16 = r16 + r20;
        r16 = r16 + r26;
        r16 = r16 * r22;
        r20 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r18 = r18 * r20;
        r8 = r8 + r18;
        r18 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r16 = r16 * r18;
        r6 = r6 + r16;
        if (r11 == 0) goto L_0x004d;
    L_0x0128:
        r0 = r33;
        r14 = r0.n;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r14.b = r4;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r0 = r33;
        r4 = r0.n;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r4.a = r2;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r0 = r33;
        r2 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r2.b = r8;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r0 = r33;
        r2 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r2.a = r6;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r0 = r33;
        r2 = r0.e;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0159;
    L_0x014a:
        r0 = r33;
        r2 = r0.e;	 Catch:{ IllegalArgumentException -> 0x01e4 }
        r4 = 4562254508917369340; // 0x3f50624dd2f1a9fc float:-5.18969491E11 double:0.001;
        r2 = r2 / r4;
        r0 = r33;
        r0.b(r2);	 Catch:{ IllegalArgumentException -> 0x01e4 }
    L_0x0159:
        r2 = r33.c();	 Catch:{ IllegalArgumentException -> 0x01e6 }
        if (r2 != 0) goto L_0x016b;
    L_0x015f:
        r0 = r33;
        r2 = r0.c;	 Catch:{ IllegalArgumentException -> 0x01e8 }
        if (r2 == 0) goto L_0x01f6;
    L_0x0165:
        r2 = r33.d();	 Catch:{ IllegalArgumentException -> 0x01ea }
        if (r2 == 0) goto L_0x01f6;
    L_0x016b:
        r2 = 0;
        r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x0185;
    L_0x0171:
        r0 = r33;
        r2 = r0.h;	 Catch:{ IllegalArgumentException -> 0x01ee }
        r0 = r33;
        r0.k = r2;	 Catch:{ IllegalArgumentException -> 0x01ee }
        r0 = r33;
        r2 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01ee }
        r0 = r33;
        r4 = r0.h;	 Catch:{ IllegalArgumentException -> 0x01ee }
        r2.b = r4;	 Catch:{ IllegalArgumentException -> 0x01ee }
        if (r11 == 0) goto L_0x0197;
    L_0x0185:
        r0 = r33;
        r2 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01ee }
        r2 = r2.b;	 Catch:{ IllegalArgumentException -> 0x01ee }
        r0 = r33;
        r0.h = r2;	 Catch:{ IllegalArgumentException -> 0x01ee }
        r0 = r33;
        r2 = r0.h;	 Catch:{ IllegalArgumentException -> 0x01ee }
        r0 = r33;
        r0.k = r2;	 Catch:{ IllegalArgumentException -> 0x01ee }
    L_0x0197:
        r2 = 0;
        r0 = r33;
        r0.c(r2);
        r2 = 1;
    L_0x019f:
        r3 = 0;
        r0 = r33;
        r4 = r0.a;
        if (r4 == 0) goto L_0x01f4;
    L_0x01a6:
        r3 = 0;
        r0 = r33;
        r0.a = r3;
        r3 = 1;
        r4 = r3;
    L_0x01ad:
        r3 = 0;
        if (r2 == 0) goto L_0x01b7;
    L_0x01b0:
        r2 = 1;
        r0 = r33;
        r0.a = r2;
        r2 = 1;
        r3 = r2;
    L_0x01b7:
        r0 = r33;
        r2 = r0.i;
        r5 = r2.iterator();
    L_0x01bf:
        r2 = r5.hasNext();
        if (r2 == 0) goto L_0x000e;
    L_0x01c5:
        r2 = r5.next();
        r2 = (com.facebook.rebound.f) r2;
        if (r4 == 0) goto L_0x01d2;
    L_0x01cd:
        r0 = r33;
        r2.a(r0);	 Catch:{ IllegalArgumentException -> 0x01f0 }
    L_0x01d2:
        r0 = r33;
        r2.c(r0);	 Catch:{ IllegalArgumentException -> 0x01f2 }
        if (r3 == 0) goto L_0x01de;
    L_0x01d9:
        r0 = r33;
        r2.b(r0);	 Catch:{ IllegalArgumentException -> 0x01f2 }
    L_0x01de:
        if (r11 == 0) goto L_0x01bf;
    L_0x01e0:
        goto L_0x000e;
    L_0x01e2:
        r2 = move-exception;
        throw r2;
    L_0x01e4:
        r2 = move-exception;
        throw r2;
    L_0x01e6:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01e8 }
    L_0x01e8:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01ea }
    L_0x01ea:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01ec }
    L_0x01ec:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01ee }
    L_0x01ee:
        r2 = move-exception;
        throw r2;
    L_0x01f0:
        r2 = move-exception;
        throw r2;
    L_0x01f2:
        r2 = move-exception;
        throw r2;
    L_0x01f4:
        r4 = r3;
        goto L_0x01ad;
    L_0x01f6:
        r2 = r10;
        goto L_0x019f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rebound.m.d(double):void");
    }

    public double i() {
        return this.h;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
        r4 = this;
        r0 = r4.b;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0 = r0.a;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0 = java.lang.Math.abs(r0);	 Catch:{ IllegalArgumentException -> 0x0026 }
        r2 = r4.l;	 Catch:{ IllegalArgumentException -> 0x0026 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x002c;
    L_0x000e:
        r0 = r4.b;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r0 = r4.a(r0);	 Catch:{ IllegalArgumentException -> 0x0028 }
        r2 = r4.p;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0024;
    L_0x001a:
        r0 = r4.o;	 Catch:{ IllegalArgumentException -> 0x002a }
        r0 = r0.a;	 Catch:{ IllegalArgumentException -> 0x002a }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 != 0) goto L_0x002c;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        return r0;
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = 0;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rebound.m.c():boolean");
    }

    public m c(double d) {
        try {
            if (d != this.b.a) {
                this.b.a = d;
                this.d.a(g());
            }
            return this;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public String g() {
        return this.m;
    }

    public m h() {
        this.i.clear();
        return this;
    }
}
