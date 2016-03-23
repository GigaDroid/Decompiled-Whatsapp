package com.whatsapp.protocol;

import java.io.Writer;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class bj implements bl {
    private static final String[] a;
    private static final String[] c;
    private static final String[] d;
    private static final String[] z;
    private final Writer b;

    public synchronized void a(cw cwVar) {
        a(cwVar, 1);
    }

    public synchronized void a() {
        this.b.write(z[0]);
        this.b.flush();
    }

    private void b(cw cwVar) {
        c(cwVar);
    }

    public byte[] m1031b(cw cwVar) {
        throw new UnsupportedOperationException();
    }

    private static boolean a(String str, String str2) {
        boolean z = co.s;
        int i = 0;
        while (i < a.length) {
            if (a[i].equals(str)) {
                int i2 = 0;
                while (i2 < d.length) {
                    try {
                        if (!d[i2].equals(str2)) {
                            i2++;
                            if (z) {
                                break;
                            }
                        }
                        return true;
                    } catch (UnsupportedOperationException e) {
                        throw e;
                    }
                }
            }
            i++;
            if (z) {
                return false;
            }
        }
        return false;
    }

    void a(String str) {
        a(str.getBytes());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(byte[] r10) {
        /*
        r9 = this;
        r8 = 37;
        r1 = com.whatsapp.protocol.co.s;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r10.length;
        r0 = 0;
    L_0x000b:
        if (r0 >= r3) goto L_0x003b;
    L_0x000d:
        r4 = r10[r0];
        r5 = 33;
        if (r4 < r5) goto L_0x0019;
    L_0x0013:
        if (r4 == r8) goto L_0x0019;
    L_0x0015:
        r5 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        if (r4 <= r5) goto L_0x0033;
    L_0x0019:
        r2.append(r8);
        r5 = r4 & 255;
        r5 = java.lang.Integer.toHexString(r5);
        r6 = r5.length();	 Catch:{ UnsupportedOperationException -> 0x0045 }
        r7 = 1;
        if (r6 != r7) goto L_0x002e;
    L_0x0029:
        r6 = 48;
        r2.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0045 }
    L_0x002e:
        r2.append(r5);	 Catch:{ UnsupportedOperationException -> 0x0047 }
        if (r1 == 0) goto L_0x0037;
    L_0x0033:
        r4 = (char) r4;	 Catch:{ UnsupportedOperationException -> 0x0047 }
        r2.append(r4);	 Catch:{ UnsupportedOperationException -> 0x0047 }
    L_0x0037:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000b;
    L_0x003b:
        r0 = r9.b;
        r1 = r2.toString();
        r0.write(r1);
        return;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bj.a(byte[]):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(com.whatsapp.protocol.cw r3, int r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        if (r3 != 0) goto L_0x000e;
    L_0x0003:
        r0 = r2.b;	 Catch:{ UnsupportedOperationException -> 0x001c }
        r1 = 32;
        r0.write(r1);	 Catch:{ UnsupportedOperationException -> 0x001c }
        r0 = com.whatsapp.protocol.co.s;	 Catch:{ UnsupportedOperationException -> 0x001c }
        if (r0 == 0) goto L_0x0011;
    L_0x000e:
        r2.b(r3);	 Catch:{ UnsupportedOperationException -> 0x001c }
    L_0x0011:
        r0 = r4 & 1;
        if (r0 == 0) goto L_0x001a;
    L_0x0015:
        r0 = r2.b;	 Catch:{ UnsupportedOperationException -> 0x0021 }
        r0.flush();	 Catch:{ UnsupportedOperationException -> 0x0021 }
    L_0x001a:
        monitor-exit(r2);
        return;
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        monitor-exit(r2);
        throw r0;
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001e }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bj.a(com.whatsapp.protocol.cw, int):void");
    }

    static {
        String[] strArr = new String[6];
        String str = "\u0011.!OwH`?\u0001vYs7Zh\u0013";
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
                        i4 = 45;
                        break;
                    case at.g /*1*/:
                        i4 = 1;
                        break;
                    case at.i /*2*/:
                        i4 = 82;
                        break;
                    case at.o /*3*/:
                        i4 = 59;
                        break;
                    default:
                        i4 = 5;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0011.";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "Vz\u0011tKyD\u001coV\rD\u001erAhE/F";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "\u0010&";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    str = "\u0013z)xJcU\u0017uQ~!\u0017wLiD\u0016Fx\u0011.";
                    i = 4;
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    String[] strArr4 = new String[1];
                    i2 = 0;
                    strArr2 = strArr4;
                    strArr3 = strArr4;
                    str = "On6B";
                    i = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    c = strArr3;
                    strArr = new String[2];
                    str = "C`?^";
                    i = 6;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    str = "^i=Iq";
                    i = 7;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    d = strArr3;
                    strArr = new String[2];
                    str = "Xr7I";
                    i = 8;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    str = "Ni3O";
                    i = 9;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    a = strArr3;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0002?";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private static boolean b(String str) {
        boolean z = co.s;
        int i = 0;
        while (i < c.length) {
            try {
                if (c[i].equals(str)) {
                    return true;
                }
                i++;
                if (z) {
                    return false;
                }
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }
        return false;
    }

    public bj(Writer writer) {
        this.b = writer;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.whatsapp.protocol.cw r8) {
        /*
        r7 = this;
        r1 = 0;
        r6 = 62;
        r2 = com.whatsapp.protocol.co.s;
        r0 = r7.b;
        r3 = 60;
        r0.write(r3);
        r0 = r7.b;
        r3 = r8.c;
        r0.write(r3);
        r0 = r8.b;
        if (r0 == 0) goto L_0x0067;
    L_0x0017:
        r0 = r1;
    L_0x0018:
        r3 = r8.b;
        r3 = r3.length;
        if (r0 >= r3) goto L_0x0067;
    L_0x001d:
        r3 = r7.b;	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r4 = 32;
        r3.write(r4);	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r3 = r7.b;	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r4 = r8.b;	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r4 = r4[r0];	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r4 = r4.a;	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r3.write(r4);	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r3 = r7.b;	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r4 = z;	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r3.write(r4);	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r3 = r8.c;	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r4 = r8.b;	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r4 = r4[r0];	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r4 = r4.a;	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        r3 = a(r3, r4);	 Catch:{ UnsupportedOperationException -> 0x00d8 }
        if (r3 == 0) goto L_0x0053;
    L_0x0047:
        r3 = r7.b;	 Catch:{ UnsupportedOperationException -> 0x00da }
        r4 = z;	 Catch:{ UnsupportedOperationException -> 0x00da }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ UnsupportedOperationException -> 0x00da }
        r3.write(r4);	 Catch:{ UnsupportedOperationException -> 0x00da }
        if (r2 == 0) goto L_0x005c;
    L_0x0053:
        r3 = r8.b;	 Catch:{ UnsupportedOperationException -> 0x00da }
        r3 = r3[r0];	 Catch:{ UnsupportedOperationException -> 0x00da }
        r3 = r3.b;	 Catch:{ UnsupportedOperationException -> 0x00da }
        r7.a(r3);	 Catch:{ UnsupportedOperationException -> 0x00da }
    L_0x005c:
        r3 = r7.b;
        r4 = 39;
        r3.write(r4);
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0018;
    L_0x0067:
        r0 = r8.a;	 Catch:{ UnsupportedOperationException -> 0x00dc }
        if (r0 != 0) goto L_0x007b;
    L_0x006b:
        r0 = r8.d;	 Catch:{ UnsupportedOperationException -> 0x00de }
        if (r0 != 0) goto L_0x007b;
    L_0x006f:
        r0 = r7.b;	 Catch:{ UnsupportedOperationException -> 0x00e0 }
        r3 = z;	 Catch:{ UnsupportedOperationException -> 0x00e0 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ UnsupportedOperationException -> 0x00e0 }
        r0.write(r3);	 Catch:{ UnsupportedOperationException -> 0x00e0 }
        if (r2 == 0) goto L_0x00d7;
    L_0x007b:
        r0 = r8.c;	 Catch:{ UnsupportedOperationException -> 0x00e2 }
        r0 = b(r0);	 Catch:{ UnsupportedOperationException -> 0x00e2 }
        if (r0 == 0) goto L_0x009d;
    L_0x0083:
        r0 = r7.b;	 Catch:{ UnsupportedOperationException -> 0x00e4 }
        r3 = z;	 Catch:{ UnsupportedOperationException -> 0x00e4 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ UnsupportedOperationException -> 0x00e4 }
        r0.write(r3);	 Catch:{ UnsupportedOperationException -> 0x00e4 }
        r0 = r7.b;	 Catch:{ UnsupportedOperationException -> 0x00e4 }
        r3 = r8.c;	 Catch:{ UnsupportedOperationException -> 0x00e4 }
        r0.write(r3);	 Catch:{ UnsupportedOperationException -> 0x00e4 }
        r0 = r7.b;	 Catch:{ UnsupportedOperationException -> 0x00e4 }
        r3 = 62;
        r0.write(r3);	 Catch:{ UnsupportedOperationException -> 0x00e4 }
        if (r2 == 0) goto L_0x00d7;
    L_0x009d:
        r0 = r7.b;	 Catch:{ UnsupportedOperationException -> 0x00e6 }
        r3 = 62;
        r0.write(r3);	 Catch:{ UnsupportedOperationException -> 0x00e6 }
        r0 = r8.a;	 Catch:{ UnsupportedOperationException -> 0x00e6 }
        if (r0 == 0) goto L_0x00ad;
    L_0x00a8:
        r0 = r8.a;	 Catch:{ UnsupportedOperationException -> 0x00e6 }
        r7.a(r0);	 Catch:{ UnsupportedOperationException -> 0x00e6 }
    L_0x00ad:
        r0 = r8.d;
        if (r0 == 0) goto L_0x00c1;
    L_0x00b1:
        r0 = r8.d;
        r0 = r0.length;
        if (r1 >= r0) goto L_0x00c1;
    L_0x00b6:
        r0 = r8.d;
        r0 = r0[r1];
        r7.b(r0);
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x00b1;
    L_0x00c1:
        r0 = r7.b;
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0.write(r1);
        r0 = r7.b;
        r1 = r8.c;
        r0.write(r1);
        r0 = r7.b;
        r0.write(r6);
    L_0x00d7:
        return;
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x00da }
    L_0x00da:
        r0 = move-exception;
        throw r0;
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x00e0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.bj.c(com.whatsapp.protocol.cw):void");
    }
}
