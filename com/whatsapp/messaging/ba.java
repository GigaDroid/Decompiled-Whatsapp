package com.whatsapp.messaging;

import java.io.FilterInputStream;
import java.io.InputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class ba extends FilterInputStream {
    private static final String[] z;
    private boolean a;
    private int b;

    static {
        String[] strArr = new String[12];
        String str = "Nu5Nd\u000bwtSgNc5U{\u000b";
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
                        i3 = 110;
                        break;
                    case at.g /*1*/:
                        i3 = 19;
                        break;
                    case at.i /*2*/:
                        i3 = 84;
                        break;
                    case at.o /*3*/:
                        i3 = 39;
                        break;
                    default:
                        i3 = 8;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ";G\u0012\n0";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001dg&Bi\u000331Il\u000bwtBi\u001c\u007f-\u0007l\u001ba=IoNc5U{\u000b32Nf\u000f\u007ftD`\u001b}?";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ";G\u0012\n0";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\r|&U}\u001egtW{\u000bf0H(\u0006g W(\u0007}$R|NH9FpN{ SxN{1Fl\u000batKm\u0000t O(\u000bk7Bm\nv0z";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\r{!Ic\u000bw";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\r|&U}\u001egtW{\u000bf0H(\u0006g W(\u0007}$R|NH9FpNp<Rf\u00053<Bi\nv&\u0007d\u000b}3S`Nv,Dm\u000bw1CU";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "\u001dg&Bi\u000331Il\u000bwtBi\u001c\u007f-\u0007l\u001ba=IoNc5U{\u000b32Nf\u000f\u007ftD`\u001b}?";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = ";}1_x\u000bp \u0007|\u001cr:Tn\u000batBf\r|0Nf\t31Ik\u0001f:Sm\u001cv0\u001d(";
                    obj = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\r{!IcN\u007f1Io\u001a{t";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0007}tJi\u00173:H|Nq1\u0007f\u001b\u007f8";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ":a5I{\bv&\nM\u0000p;Ca\u0000t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ba(InputStream inputStream) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException(z[11]);
        }
    }

    public long skip(long j) {
        int i = co.a;
        long j2 = 0;
        while (j2 < j) {
            if (read() == -1) {
                return j2;
            }
            j2++;
            if (i != 0) {
                return j;
            }
        }
        return j;
    }

    public boolean markSupported() {
        return false;
    }

    public int read(byte[] bArr, int i, int i2) {
        int i3 = co.a;
        int i4 = 0;
        while (i4 < i2) {
            int read = read();
            if (read != -1) {
                bArr[i + i4] = (byte) read;
                i4++;
                if (i3 != 0) {
                    break;
                }
            }
            return i4 > 0 ? i4 : -1;
        }
        return i2;
    }

    public synchronized void reset() {
        throw new UnsupportedOperationException();
    }

    public synchronized void mark(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() {
        /*
        r13 = this;
        r12 = 10;
        r11 = 1;
        r10 = 0;
        r1 = -1;
        r9 = 2;
        r2 = com.whatsapp.messaging.co.a;
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3 = java.nio.ByteBuffer.allocate(r0);
        r4 = r3.array();
    L_0x0012:
        r0 = super.read();
        if (r0 == r1) goto L_0x0174;
    L_0x0018:
        r5 = r13.a;	 Catch:{ NumberFormatException -> 0x002f }
        if (r5 != 0) goto L_0x00c0;
    L_0x001c:
        r5 = r3.remaining();	 Catch:{ NumberFormatException -> 0x002f }
        if (r5 != 0) goto L_0x0031;
    L_0x0022:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x002d }
        r1 = z;	 Catch:{ NumberFormatException -> 0x002d }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x002d }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x002d }
        throw r0;	 Catch:{ NumberFormatException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002d }
    L_0x0031:
        r5 = (byte) r0;
        r3.put(r5);
        r5 = r3.position();
        if (r5 < r9) goto L_0x0012;
    L_0x003b:
        r5 = r3.position();
        r5 = r5 + -1;
        r5 = r4[r5];
        if (r5 != r12) goto L_0x0012;
    L_0x0045:
        r5 = r3.position();
        r5 = r5 + -2;
        r5 = r4[r5];
        r6 = 13;
        if (r5 != r6) goto L_0x0012;
    L_0x0051:
        r5 = r3.position();	 Catch:{ NumberFormatException -> 0x00b7 }
        if (r5 != r9) goto L_0x005c;
    L_0x0057:
        r5 = 1;
        r13.a = r5;	 Catch:{ NumberFormatException -> 0x00b7 }
        if (r2 == 0) goto L_0x00bb;
    L_0x005c:
        r5 = new java.lang.String;
        r6 = r3.position();
        r6 = r6 + -2;
        r7 = z;
        r8 = 4;
        r7 = r7[r8];
        r5.<init>(r4, r10, r6, r7);
        r6 = ":";
        r5 = r5.split(r6, r9);
        r6 = r5.length;
        if (r6 != r9) goto L_0x00bb;
    L_0x0076:
        r6 = r5[r10];
        r6 = r6.trim();
        r5 = r5[r11];
        r5 = r5.trim();
        r7 = z;	 Catch:{ NumberFormatException -> 0x00b9 }
        r8 = 1;
        r7 = r7[r8];	 Catch:{ NumberFormatException -> 0x00b9 }
        r6 = r6.equalsIgnoreCase(r7);	 Catch:{ NumberFormatException -> 0x00b9 }
        if (r6 == 0) goto L_0x00bb;
    L_0x008d:
        r6 = z;	 Catch:{ NumberFormatException -> 0x00b9 }
        r7 = 6;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x00b9 }
        r6 = r5.equalsIgnoreCase(r6);	 Catch:{ NumberFormatException -> 0x00b9 }
        if (r6 != 0) goto L_0x00bb;
    L_0x0098:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x00b5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00b5 }
        r1.<init>();	 Catch:{ NumberFormatException -> 0x00b5 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x00b5 }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x00b5 }
        r1 = r1.append(r2);	 Catch:{ NumberFormatException -> 0x00b5 }
        r1 = r1.append(r5);	 Catch:{ NumberFormatException -> 0x00b5 }
        r1 = r1.toString();	 Catch:{ NumberFormatException -> 0x00b5 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x00b5 }
        throw r0;	 Catch:{ NumberFormatException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        throw r0;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b5 }
    L_0x00bb:
        r3.clear();
        if (r2 == 0) goto L_0x0012;
    L_0x00c0:
        r5 = r13.b;	 Catch:{ NumberFormatException -> 0x00cb }
        if (r5 <= 0) goto L_0x00cd;
    L_0x00c4:
        r1 = r13.b;	 Catch:{ NumberFormatException -> 0x00cb }
        r1 = r1 + -1;
        r13.b = r1;	 Catch:{ NumberFormatException -> 0x00cb }
    L_0x00ca:
        return r0;
    L_0x00cb:
        r0 = move-exception;
        throw r0;
    L_0x00cd:
        r5 = r3.remaining();	 Catch:{ NumberFormatException -> 0x00de }
        if (r5 != 0) goto L_0x00e0;
    L_0x00d3:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x00de }
        r1 = z;	 Catch:{ NumberFormatException -> 0x00de }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00de }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x00de }
        throw r0;	 Catch:{ NumberFormatException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;
    L_0x00e0:
        r0 = (byte) r0;
        r3.put(r0);
        r0 = r3.position();
        if (r0 < r9) goto L_0x0012;
    L_0x00ea:
        r0 = r3.position();
        r0 = r0 + -1;
        r0 = r4[r0];
        if (r0 != r12) goto L_0x0012;
    L_0x00f4:
        r0 = r3.position();
        r0 = r0 + -2;
        r0 = r4[r0];
        r5 = 13;
        if (r0 != r5) goto L_0x0012;
    L_0x0100:
        r0 = r3.position();
        if (r0 <= r9) goto L_0x016f;
    L_0x0106:
        r0 = new java.lang.String;
        r5 = r3.position();
        r5 = r5 + -2;
        r6 = z;
        r6 = r6[r9];
        r0.<init>(r4, r10, r5, r6);
        r5 = 16;
        r5 = java.lang.Integer.parseInt(r0, r5);	 Catch:{ NumberFormatException -> 0x0135 }
        r13.b = r5;	 Catch:{ NumberFormatException -> 0x0135 }
        r0 = r13.b;
        if (r0 != 0) goto L_0x016f;
    L_0x0121:
        r0 = super.read();
        if (r0 != r1) goto L_0x0159;
    L_0x0127:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x0133 }
        r1 = z;	 Catch:{ NumberFormatException -> 0x0133 }
        r2 = 8;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x0133 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x0133 }
        throw r0;	 Catch:{ NumberFormatException -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        throw r0;
    L_0x0135:
        r1 = move-exception;
        r1 = new java.io.IOException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r3 = r3[r12];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r2 = z;
        r2 = r2[r10];
        r0 = r0.append(r2);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x0159:
        r0 = super.read();
        if (r0 != r1) goto L_0x016c;
    L_0x015f:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x016a }
        r1 = z;	 Catch:{ NumberFormatException -> 0x016a }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x016a }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x016a }
        throw r0;	 Catch:{ NumberFormatException -> 0x016a }
    L_0x016a:
        r0 = move-exception;
        throw r0;
    L_0x016c:
        r0 = r1;
        goto L_0x00ca;
    L_0x016f:
        r3.clear();
        if (r2 == 0) goto L_0x0012;
    L_0x0174:
        r0 = r1;
        goto L_0x00ca;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ba.read():int");
    }

    public int available() {
        return 0;
    }
}
