package com.whatsapp.util;

import android.support.annotation.NonNull;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class b {
    private static final byte[] A;
    private static final cm B;
    static final int C;
    private static final byte[] D;
    static final int E;
    private static final byte[] F;
    private static final byte[] G;
    static final int H;
    private static final String[] I;
    static final int a;
    private static final bg b;
    static final int c;
    static final int d;
    static final int e;
    static final int f;
    static final int g;
    static final int h;
    static final int i;
    private static final byte[] j;
    static final int k;
    static final int l;
    private static final byte[] m;
    private static final byte[] n;
    static final int o;
    private static final byte[] p;
    private static final byte[] q;
    static final int r;
    private static final byte[] s;
    static final int t;
    private static final byte[] u;
    static final int v;
    static final int w;
    private static final byte[] x;
    private static final byte[] y;
    static final int z;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    private static com.whatsapp.util.cm b(@android.support.annotation.NonNull java.io.InputStream r21, long r22) {
        /*
        r10 = com.whatsapp.util.Log.h;
        r6 = -1;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r3 = c;
        r8[r2] = r3;
        r3 = r21;
        r4 = r22;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x0022;
    L_0x0016:
        r2 = I;
        r3 = 69;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
    L_0x0021:
        return r2;
    L_0x0022:
        r9 = new com.whatsapp.util.cm;
        r9.<init>();
        r3 = -1;
        r9.b = r3;
        r3 = -1;
        r9.a = r3;
        r4 = r2.c;
        r6 = r2.a;
        r4 = r4 - r6;
        r3 = new com.whatsapp.util.bj;
        r6 = r2.a;
        r0 = r21;
        r3.<init>(r0, r6);
        r6 = r3.a();
        r12 = r6 + r4;
    L_0x0041:
        r4 = r3.a();
        r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1));
        if (r2 >= 0) goto L_0x0115;
    L_0x0049:
        r4 = 0;
        r6 = r3.a();
        r6 = r12 - r6;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r11 = t;
        r8[r2] = r11;
        r2 = a(r3, r4, r6, r8);
        if (r2 == 0) goto L_0x0113;
    L_0x005f:
        r4 = r3.a();
        r6 = r2.c;
        r4 = r4 + r6;
        r6 = r2.a;
        r14 = r4 - r6;
    L_0x006a:
        r4 = r3.a();
        r2 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1));
        if (r2 >= 0) goto L_0x0113;
    L_0x0072:
        r4 = 0;
        r6 = r3.a();
        r6 = r14 - r6;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r11 = v;
        r8[r2] = r11;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x0094;
    L_0x0088:
        r2 = I;
        r3 = 76;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
        goto L_0x0021;
    L_0x0094:
        r4 = r3.a();
        r6 = r2.c;
        r4 = r4 + r6;
        r6 = r2.a;
        r16 = r4 - r6;
        r4 = 0;
        r6 = r3.a();
        r6 = r16 - r6;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r11 = d;
        r8[r2] = r11;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x00c2;
    L_0x00b5:
        r2 = I;
        r3 = 77;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
        goto L_0x0021;
    L_0x00c2:
        r4 = r3.a();
        r6 = r2.c;
        r4 = r4 + r6;
        r6 = r2.a;
        r4 = r4 - r6;
        r6 = 16;
        r0 = r2.a;
        r18 = r0;
        r6 = r6 - r18;
        c(r3, r6);
        r2 = 4;
        r2 = new byte[r2];
        r6 = 0;
        r7 = r2.length;
        r6 = a(r3, r2, r6, r7);
        r7 = r2.length;
        if (r6 == r7) goto L_0x00f0;
    L_0x00e3:
        r2 = I;
        r3 = 73;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
        goto L_0x0021;
    L_0x00f0:
        r6 = 0;
        r6 = r2[r6];
        r7 = 1;
        r7 = r2[r7];
        r8 = 2;
        r8 = r2[r8];
        r11 = 3;
        r2 = r2[r11];
        r2 = a(r6, r7, r8, r2);
        r6 = k;
        if (r2 == r6) goto L_0x0132;
    L_0x0104:
        r6 = h;
        if (r2 == r6) goto L_0x0132;
    L_0x0108:
        r4 = r3.a();
        r4 = r14 - r4;
        c(r3, r4);
        if (r10 == 0) goto L_0x006a;
    L_0x0113:
        if (r10 == 0) goto L_0x0041;
    L_0x0115:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = I;
        r4 = 74;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r9);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r9;
        goto L_0x0021;
    L_0x0132:
        r6 = k;
        if (r2 != r6) goto L_0x0148;
    L_0x0136:
        r6 = r9.b;
        r7 = -1;
        if (r6 == r7) goto L_0x0148;
    L_0x013b:
        r2 = I;
        r3 = 71;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
        goto L_0x0021;
    L_0x0148:
        r6 = h;
        if (r2 != r6) goto L_0x015e;
    L_0x014c:
        r2 = r9.a;
        r6 = -1;
        if (r2 == r6) goto L_0x015e;
    L_0x0151:
        r2 = I;
        r3 = 72;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
        goto L_0x0021;
    L_0x015e:
        r6 = r3.a();
        r4 = r4 - r6;
        r6 = r3.a();
        r6 = r16 - r6;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r11 = H;
        r8[r2] = r11;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x0184;
    L_0x0177:
        r2 = I;
        r3 = 67;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
        goto L_0x0021;
    L_0x0184:
        r4 = r3.a();
        r6 = r2.c;
        r4 = r4 + r6;
        r6 = r2.a;
        r6 = r4 - r6;
        r4 = 0;
        r16 = r3.a();
        r6 = r6 - r16;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r11 = a;
        r8[r2] = r11;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x01b2;
    L_0x01a5:
        r2 = I;
        r3 = 68;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
        goto L_0x0021;
    L_0x01b2:
        r4 = r3.a();
        r6 = r2.c;
        r4 = r4 + r6;
        r6 = r2.a;
        r6 = r4 - r6;
        r4 = 0;
        r16 = r3.a();
        r6 = r6 - r16;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r11 = o;
        r8[r2] = r11;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x01e0;
    L_0x01d3:
        r2 = I;
        r3 = 66;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
        goto L_0x0021;
    L_0x01e0:
        r4 = 8;
        c(r3, r4);
        r4 = r3.a();
        r6 = r2.c;
        r4 = r4 + r6;
        r6 = r2.a;
        r6 = r4 - r6;
        r2 = 9;
        r8 = new int[r2];
        r2 = 0;
        r4 = i;
        r8[r2] = r4;
        r2 = 1;
        r4 = w;
        r8[r2] = r4;
        r2 = 2;
        r4 = e;
        r8[r2] = r4;
        r2 = 3;
        r4 = l;
        r8[r2] = r4;
        r2 = 4;
        r4 = z;
        r8[r2] = r4;
        r2 = 5;
        r4 = f;
        r8[r2] = r4;
        r2 = 6;
        r4 = g;
        r8[r2] = r4;
        r2 = 7;
        r4 = r;
        r8[r2] = r4;
        r2 = 8;
        r4 = E;
        r8[r2] = r4;
        r4 = 0;
        r16 = r3.a();
        r6 = r6 - r16;
        r11 = a(r3, r4, r6, r8);
        if (r11 != 0) goto L_0x023d;
    L_0x0230:
        r2 = I;
        r3 = 75;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
        goto L_0x0021;
    L_0x023d:
        r2 = -1;
        r4 = -1;
        r5 = r11.b;
        r6 = i;
        if (r5 != r6) goto L_0x0248;
    L_0x0245:
        r2 = 1;
        if (r10 == 0) goto L_0x02c8;
    L_0x0248:
        r5 = r11.b;
        r6 = w;
        if (r5 != r6) goto L_0x0251;
    L_0x024e:
        r2 = 2;
        if (r10 == 0) goto L_0x02c8;
    L_0x0251:
        r5 = r11.b;
        r6 = e;
        if (r5 != r6) goto L_0x025a;
    L_0x0257:
        r2 = 3;
        if (r10 == 0) goto L_0x02c8;
    L_0x025a:
        r5 = r11.b;
        r6 = l;
        if (r5 != r6) goto L_0x0263;
    L_0x0260:
        r2 = 4;
        if (r10 == 0) goto L_0x02c8;
    L_0x0263:
        r5 = r11.b;
        r6 = z;
        if (r5 != r6) goto L_0x02a6;
    L_0x0269:
        r4 = r3.a();
        r6 = r11.c;
        r4 = r4 + r6;
        r6 = r11.a;
        r6 = r4 - r6;
        r4 = 8;
        c(r3, r4);
        r4 = b(r3, r11);
        r4 = (long) r4;
        r16 = r3.a();
        r6 = r6 - r16;
        r8 = 1;
        r8 = new int[r8];
        r16 = 0;
        r17 = C;
        r8[r16] = r17;
        r4 = a(r3, r4, r6, r8);
        if (r4 != 0) goto L_0x02a0;
    L_0x0293:
        r2 = I;
        r3 = 70;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = B;
        goto L_0x0021;
    L_0x02a0:
        r4 = a(r3, r4);
        if (r10 == 0) goto L_0x02c8;
    L_0x02a6:
        r5 = r11.b;
        r6 = f;
        if (r5 != r6) goto L_0x02af;
    L_0x02ac:
        r4 = 1;
        if (r10 == 0) goto L_0x02c8;
    L_0x02af:
        r5 = r11.b;
        r6 = g;
        if (r5 != r6) goto L_0x02b8;
    L_0x02b5:
        r4 = 2;
        if (r10 == 0) goto L_0x02c8;
    L_0x02b8:
        r5 = r11.b;
        r6 = r;
        if (r5 != r6) goto L_0x02c1;
    L_0x02be:
        r4 = 4;
        if (r10 == 0) goto L_0x02c8;
    L_0x02c1:
        r5 = r11.b;
        r6 = E;
        if (r5 != r6) goto L_0x02c8;
    L_0x02c7:
        r4 = 7;
    L_0x02c8:
        r5 = -1;
        if (r2 == r5) goto L_0x02cd;
    L_0x02cb:
        r9.a = r2;
    L_0x02cd:
        r2 = -1;
        if (r4 == r2) goto L_0x0108;
    L_0x02d0:
        r9.b = r4;
        goto L_0x0108;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b.b(java.io.InputStream, long):com.whatsapp.util.cm");
    }

    private static boolean a(byte[] bArr, int i, byte[] bArr2) {
        int i2 = Log.h;
        if (bArr.length - i < bArr2.length) {
            return false;
        }
        int i3 = 0;
        while (i3 < bArr2.length) {
            if (bArr[i + i3] == bArr2[i3]) {
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean b(@NonNull File file) {
        bg a = a(file);
        switch (a.a) {
            case -1:
            case v.m /*0*/:
            case at.i /*2*/:
            case at.p /*4*/:
            case aF.v /*7*/:
                return false;
            case at.g /*1*/:
            case at.o /*3*/:
            case at.m /*5*/:
            case Y.f /*6*/:
                return true;
            default:
                throw new AssertionError(I[13] + a);
        }
    }

    @NonNull
    private static bg a(@NonNull InputStream inputStream) {
        int i = Log.h;
        byte[] bArr = new byte[36];
        int a = a(inputStream, bArr, 0, 8);
        if (a < 8) {
            return b;
        }
        if (a(bArr, 4, m)) {
            if (a + a(inputStream, bArr, 8, 4) < 12) {
                return b;
            }
            return a(bArr, 8, x) ? new bg(1, a(inputStream, (long) (a(bArr[0], bArr[1], bArr[2], bArr[3]) - 12))) : b;
        } else if (a(bArr, 0, G)) {
            r3 = a(inputStream, bArr, a, bArr.length - a) + a;
            if (r3 < 27) {
                return b;
            }
            byte[] bArr2;
            int i2 = (bArr[26] & 255) + 27;
            if (r3 < s.length + i2) {
                bArr2 = new byte[(s.length + i2)];
                System.arraycopy(bArr, 0, bArr2, 0, r3);
                if (a(inputStream, bArr2, r3, bArr2.length - r3) + r3 < bArr2.length) {
                    return b;
                }
            }
            bArr2 = bArr;
            if (a(bArr2, i2, s)) {
                return new bg(3);
            }
            return b;
        } else {
            r3 = a(inputStream, bArr, a, 10 - a) + a;
            if (r3 < 10) {
                return b;
            }
            if (r3 == 10 && a(bArr, 0, q)) {
                c(inputStream, (long) (((((bArr[6] & 127) << 21) | ((bArr[7] & 127) << 14)) | ((bArr[8] & 127) << 7)) | (bArr[9] & 127)));
                r3 = a(inputStream, bArr, 0, 10);
                a = 0;
                while (bArr[0] == null && r3 > 0) {
                    System.arraycopy(bArr, 1, bArr, 0, r3 - 1);
                    r3--;
                    if (a == 0) {
                        if (inputStream.read(bArr, r3, 1) == -1) {
                            bArr[r3] = (byte) 0;
                            if (i != 0) {
                                a = 1;
                            } else {
                                a = 1;
                                if (i != 0) {
                                    break;
                                }
                            }
                        }
                        r3++;
                        if (i != 0) {
                            break;
                        }
                    }
                }
            }
            if (r3 < 10) {
                return b;
            }
            if (a(inputStream, bArr, r3, bArr.length - r3) + r3 < 36) {
                return b;
            }
            if (bArr[0] == -1 && ((byte) (bArr[1] & 224)) == -32) {
                if ((bArr[1] & 6) == 0) {
                    return new bg(5);
                }
                return new bg(6);
            } else if (a(bArr, 0, j)) {
                return new bg(1);
            } else {
                if (a(bArr, 0, n)) {
                    return new bg(2);
                }
                return (a(bArr, 0, D) && a(bArr, 8, F)) ? new bg(4) : b;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public static java.lang.String a(@android.support.annotation.Nullable java.lang.String r5, boolean r6) {
        /*
        r1 = 0;
        r2 = com.whatsapp.util.Log.h;
        r0 = android.text.TextUtils.isEmpty(r5);
        if (r0 == 0) goto L_0x0016;
    L_0x0009:
        if (r6 == 0) goto L_0x0014;
    L_0x000b:
        r0 = I;
        r2 = 54;
        r0 = r0[r2];
        com.whatsapp.util.Log.w(r0);
    L_0x0014:
        r0 = r1;
    L_0x0015:
        return r0;
    L_0x0016:
        r0 = -1;
        r3 = r5.hashCode();
        switch(r3) {
            case 49939588: goto L_0x007b;
            case 187078282: goto L_0x003f;
            case 187078669: goto L_0x005d;
            case 187090232: goto L_0x004e;
            case 1504831518: goto L_0x006c;
            default: goto L_0x001e;
        };
    L_0x001e:
        switch(r0) {
            case 0: goto L_0x0089;
            case 1: goto L_0x0090;
            case 2: goto L_0x0098;
            case 3: goto L_0x00a0;
            case 4: goto L_0x00a8;
            default: goto L_0x0021;
        };
    L_0x0021:
        if (r6 == 0) goto L_0x003d;
    L_0x0023:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = I;
        r3 = 53;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r5);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x003d:
        r0 = r1;
        goto L_0x0015;
    L_0x003f:
        r3 = I;
        r4 = 49;
        r3 = r3[r4];
        r3 = r5.equals(r3);
        if (r3 == 0) goto L_0x001e;
    L_0x004b:
        r0 = 0;
        if (r2 == 0) goto L_0x001e;
    L_0x004e:
        r3 = I;
        r4 = 58;
        r3 = r3[r4];
        r3 = r5.equals(r3);
        if (r3 == 0) goto L_0x001e;
    L_0x005a:
        r0 = 1;
        if (r2 == 0) goto L_0x001e;
    L_0x005d:
        r3 = I;
        r4 = 56;
        r3 = r3[r4];
        r3 = r5.equals(r3);
        if (r3 == 0) goto L_0x001e;
    L_0x0069:
        r0 = 2;
        if (r2 == 0) goto L_0x001e;
    L_0x006c:
        r3 = I;
        r4 = 55;
        r3 = r3[r4];
        r3 = r5.equals(r3);
        if (r3 == 0) goto L_0x001e;
    L_0x0078:
        r0 = 3;
        if (r2 == 0) goto L_0x001e;
    L_0x007b:
        r2 = I;
        r3 = 50;
        r2 = r2[r3];
        r2 = r5.equals(r2);
        if (r2 == 0) goto L_0x001e;
    L_0x0087:
        r0 = 4;
        goto L_0x001e;
    L_0x0089:
        r0 = I;
        r1 = 51;
        r0 = r0[r1];
        goto L_0x0015;
    L_0x0090:
        r0 = I;
        r1 = 52;
        r0 = r0[r1];
        goto L_0x0015;
    L_0x0098:
        r0 = I;
        r1 = 57;
        r0 = r0[r1];
        goto L_0x0015;
    L_0x00a0:
        r0 = I;
        r1 = 59;
        r0 = r0[r1];
        goto L_0x0015;
    L_0x00a8:
        r0 = I;
        r1 = 48;
        r0 = r0[r1];
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b.a(java.lang.String, boolean):java.lang.String");
    }

    @NonNull
    public static bg a(@NonNull File file) {
        bg a;
        Throwable e;
        InputStream bufferedInputStream;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                a = a(bufferedInputStream);
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable e2) {
                        Log.b(I[79] + file, e2);
                    }
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    Log.c(I[78] + file, e);
                    a = b;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable e22) {
                            Log.b(I[80] + file, e22);
                        }
                    }
                    return a;
                } catch (Throwable th) {
                    e = th;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable e222) {
                            Log.b(I[81] + file, e222);
                        }
                    }
                    throw e;
                }
            }
        } catch (IOException e4) {
            e = e4;
            bufferedInputStream = null;
            Log.c(I[78] + file, e);
            a = b;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            return a;
        } catch (Throwable th2) {
            e = th2;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw e;
        }
        return a;
    }

    private static int b(InputStream inputStream, ct ctVar) {
        byte[] bArr = new byte[2];
        if (a(inputStream, bArr, 0, bArr.length) != bArr.length) {
            throw new IOException(I[15]);
        }
        int i = (bArr[1] & 255) | ((bArr[0] & 255) << 8);
        Log.i(I[16] + i);
        if (i == 0) {
            return 18;
        }
        if (i == 1) {
            return 34;
        }
        if (i == 2) {
            return 54;
        }
        throw new IOException(I[14]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] a(byte[] r6, int r7, int r8) {
        /*
        r0 = 0;
        r1 = 0;
        r2 = r7 + 4;
        r4 = java.lang.Math.min(r8, r2);	 Catch:{ Exception -> 0x002f }
        r3 = r1;
        r1 = r7;
    L_0x000a:
        r2 = r1 + 1;
        r1 = r6[r2];	 Catch:{ Exception -> 0x002f }
        r1 = r1 & 127;
        r1 = r3 << 7;
        r3 = r6[r2];	 Catch:{ Exception -> 0x002f }
        r3 = r3 & 127;
        r3 = r3 + r1;
        if (r7 >= r4) goto L_0x0021;
    L_0x0019:
        r1 = r6[r2];	 Catch:{ Exception -> 0x002f }
        r1 = r1 & 128;
        r5 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r1 == r5) goto L_0x004f;
    L_0x0021:
        if (r3 != 0) goto L_0x0024;
    L_0x0023:
        return r0;
    L_0x0024:
        r1 = 2;
        r1 = new int[r1];	 Catch:{ Exception -> 0x002f }
        r4 = 0;
        r1[r4] = r2;	 Catch:{ Exception -> 0x002f }
        r2 = 1;
        r1[r2] = r3;	 Catch:{ Exception -> 0x002f }
        r0 = r1;
        goto L_0x0023;
    L_0x002f:
        r1 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = I;
        r4 = 17;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r1.toString();
        r1 = r2.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        goto L_0x0023;
    L_0x004f:
        r1 = r2;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b.a(byte[], int, int):int[]");
    }

    public static int a(byte b, byte b2, byte b3, byte b4) {
        return ((((b & 255) << 24) | ((b2 & 255) << 16)) | ((b3 & 255) << 8)) | (b4 & 255);
    }

    private static cm b(InputStream inputStream) {
        int i = Log.h;
        byte[] bArr = new byte[12];
        if (a(inputStream, bArr, 0, bArr.length) < bArr.length) {
            return B;
        }
        if (a(bArr, 4, y)) {
            i = (a(bArr, 8, p) && i == 0) ? 1 : (a(bArr, 8, u) && i == 0) ? 2 : (a(bArr, 8, A) && i == 0) ? 3 : 0;
            if (i == 0) {
                Log.i(I[23] + new String(bArr, 8, 4));
                return B;
            }
            cm b = b(inputStream, (long) (a(bArr[0], bArr[1], bArr[2], bArr[3]) - 12));
            b.c = i;
            return b;
        }
        Log.i(I[24]);
        return B;
    }

    private static int a(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i, int i2) {
        int i3 = Log.h;
        int min = Math.min(i2, bArr.length - i);
        int i4 = 0;
        while (i4 < min) {
            int read = inputStream.read(bArr, i + i4, min - i4);
            if (read != -1) {
                i4 += read;
                if (i3 != 0) {
                    break;
                }
            }
            break;
        }
        return i4;
    }

    static {
        String[] strArr = new String[82];
        int i = 0;
        String str = "a(R>\"p3Hrl}(\u00104mg2T";
        int i2 = -1;
        String[] strArr2 = strArr;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 18;
                        break;
                    case at.g /*1*/:
                        i4 = 92;
                        break;
                    case at.i /*2*/:
                        i4 = 48;
                        break;
                    case at.o /*3*/:
                        i4 = 82;
                        break;
                    default:
                        i4 = 2;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case v.m /*0*/:
                    strArr[i] = str;
                    i = 2;
                    str = "w/T!\"p3Hrl}(\u00104mg2T";
                    i2 = 1;
                    strArr = strArr2;
                    break;
                case at.g /*1*/:
                    strArr[i] = str;
                    str = "a(C6\"p3Hrl}(\u00104mg2T";
                    i2 = 2;
                    i = 3;
                    strArr = strArr2;
                    break;
                case at.i /*2*/:
                    strArr[i] = str;
                    str = "T3E<f21U6ks|S=lf9^&q2(X3v2+Q!l5(\u0010?6sf\u0010";
                    i = 4;
                    strArr = strArr2;
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    strArr[i] = str;
                    i = 5;
                    strArr = strArr2;
                    str = "\u007f5^4\"p3Hrl}(\u00104mg2T";
                    i2 = 4;
                    break;
                case at.p /*4*/:
                    strArr[i] = str;
                    i = 6;
                    str = "\u007f)\\&kb0Urj~8Brq})^6\"f.Q1ia|V=w|8";
                    i2 = 5;
                    strArr = strArr2;
                    break;
                case at.m /*5*/:
                    strArr[i] = str;
                    i = 7;
                    str = "\u007f3_$\"p3Hrl}(\u00104mg2T";
                    i2 = 6;
                    strArr = strArr2;
                    break;
                case Y.f /*6*/:
                    strArr[i] = str;
                    i = 8;
                    str = "q3^&g|(\u00100mj|^=v2:_'lv";
                    i2 = 7;
                    strArr = strArr2;
                    break;
                case aF.v /*7*/:
                    strArr[i] = str;
                    i = 9;
                    str = "|3^rq})^6\"z8\\ \"f%@7\"t3E<f2";
                    i2 = 8;
                    strArr = strArr2;
                    break;
                case aF.u /*8*/:
                    strArr[i] = str;
                    i = 10;
                    str = "d5T7m24T>p2(I\"g22_&\"d=\\;f";
                    i2 = 9;
                    strArr = strArr2;
                    break;
                case Y.l /*9*/:
                    strArr[i] = str;
                    i = 11;
                    str = "z8\\ \"p3Hrl}(\u00104mg2T";
                    i2 = 10;
                    strArr = strArr2;
                    break;
                case Y.t /*10*/:
                    strArr[i] = str;
                    i = 12;
                    str = "z8\\ \"p3Hrv}3\u0010!j}.D";
                    i2 = 11;
                    strArr = strArr2;
                    break;
                case Y.j /*11*/:
                    strArr[i] = str;
                    i = 13;
                    str = "{2F3n{8\u00103wv5_rd{0Urvk,Urpw(E lw8\u000br";
                    i2 = 12;
                    strArr = strArr2;
                    break;
                case Y.p /*12*/:
                    strArr[i] = str;
                    i = 14;
                    str = "G2U*rw?D7f2.U!w~(\u00105gf(Y<e21@fc2*U q{3^";
                    i2 = 13;
                    strArr = strArr2;
                    break;
                case Y.q /*13*/:
                    strArr[i] = str;
                    i = 15;
                    str = "G2U*rw?D7f29_4\"u9D&k|;\u0010?r&=\u0010$g`/Y=l";
                    i2 = 14;
                    strArr = strArr2;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr[i] = str;
                    i = 16;
                    str = "\u007f,\u00043\"p3Hrtw.C;m|f\u0010";
                    i2 = 15;
                    strArr = strArr2;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr[i] = str;
                    i = 17;
                    str = "W$S7rf5_<\"b._1ga/Y<e29C6q2>_*82";
                    i2 = 16;
                    strArr = strArr2;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr[i] = str;
                    i = 18;
                    str = "g2Q0nw|D=\"v9D7p\u007f5^7\"s)T;m2:Y>g2(I\"g)|V;nwa";
                    i2 = 17;
                    strArr = strArr2;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr[i] = str;
                    i = 19;
                    str = "g2Q0nw|D=\"q0_!g2:Y>g25^\"wf|C&pw=]i\"t5\\7?";
                    i2 = 18;
                    strArr = strArr2;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr[i] = str;
                    i = 20;
                    str = "g2Q0nw|D=\"q0_!g2:Y>g25^\"wf|C&pw=]i\"t5\\7?";
                    i2 = 19;
                    strArr = strArr2;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr[i] = str;
                    i = 21;
                    str = "g2Q0nw|D=\"q0_!g2:Y>g25^\"wf|C&pw=]i\"t5\\7?";
                    i2 = 20;
                    strArr = strArr2;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr[i] = str;
                    i = 22;
                    str = "G2U*rw?D7f2\u0019\u007f\u0014\"a7Y\"r{2Wr";
                    i2 = 21;
                    strArr = strArr2;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr[i] = str;
                    i = 23;
                    str = "d5T7m2>B3lv|^=v2/E\"r}.D7f(|";
                    i2 = 22;
                    strArr = strArr2;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr[i] = str;
                    i = 24;
                    str = "d5T7m22_&\"_\f\u0004}1U\f\u0010&{b9\u00104k~9";
                    i2 = 23;
                    strArr = strArr2;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr[i] = str;
                    i = 25;
                    str = "d5T7m=1@f";
                    i2 = 24;
                    strArr = strArr2;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr[i] = str;
                    i = 26;
                    str = "d5T7m=oW\"r";
                    i2 = 25;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr[i] = str;
                    i = 27;
                    str = "g2B7a};^;xw8\u0010$kv9_ro{1Urvk,Ui\"\u007f5]7Vk,Uo";
                    i2 = 26;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr[i] = str;
                    i = 28;
                    str = "!;@";
                    i2 = 27;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr[i] = str;
                    i = 29;
                    str = "w1@&{2*Y6g}|];ow|D+rw";
                    i2 = 28;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr[i] = str;
                    i = 30;
                    str = "\u007f,\u0004";
                    i2 = 29;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr[i] = str;
                    i = 31;
                    str = "d5T7m=1@f";
                    i2 = 30;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr[i] = str;
                    i = 32;
                    str = "d5T7m=oW\"r";
                    i2 = 31;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr[i] = str;
                    i = 33;
                    str = "{2F3n{8\u00103wv5_rvk,Urpw(E lw8\u000br";
                    i2 = 32;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr[i] = str;
                    i = 34;
                    str = "s)T;m==] ";
                    i2 = 33;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr[i] = str;
                    i = 35;
                    str = "s)T;m=1@7e";
                    i2 = 34;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr[i] = str;
                    i = 36;
                    str = "g2C'rb3B&gv|Q'f{3\u0010&{b9\u000brpw(E l{2Wrlg0\\ro{1Urvk,U";
                    i2 = 35;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr[i] = str;
                    i = 37;
                    str = "s)T;m=1@f";
                    i2 = 36;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr[i] = str;
                    i = 38;
                    str = "s)T;m=3W592?_6gq/\r=rg/";
                    i2 = 37;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr[i] = str;
                    i = 39;
                    str = "s)T;m=1@f";
                    i2 = 38;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr[i] = str;
                    i = 40;
                    str = "s)T;m==Q1";
                    i2 = 39;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr[i] = str;
                    i = 41;
                    str = "V5Trl}(\u00104k|8\u00107qv/\u00101m|:Y5\"v9C1p{,D;m||D3e2q\u00104mg2Th\"";
                    i2 = 40;
                    strArr = strArr2;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr[i] = str;
                    i = 42;
                    str = "V5Trl}(\u00104k|8\u00107qv/\u00106ga?B;rf5_<\"f=Wr/2:_'lvf\u0010";
                    i2 = 41;
                    strArr = strArr2;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr[i] = str;
                    i = 43;
                    str = "V5Trl}(\u00104k|8\u00107qv/\u00106ga?B;rf5_<\"v9D3k~/";
                    i2 = 42;
                    strArr = strArr2;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr[i] = str;
                    i = 44;
                    str = "V5Trl}(\u00104k|8\u00107qv/\u00101m|:Y5\"v9D3k~/";
                    i2 = 43;
                    strArr = strArr2;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr[i] = str;
                    i = 45;
                    str = "W$S7rf5_<\"b._1ga/Y<e29C6q2>_*82";
                    i2 = 44;
                    strArr = strArr2;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr[i] = str;
                    i = 46;
                    str = "V5Trl}(\u00104k|8\u00107qv/\u0010!rw?Y4kq|T7qq.Y\"v{3^rvs;\u0010\u007f\"t3E<f(|";
                    i2 = 45;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr[i] = str;
                    i = 47;
                    str = "V5Trl}(\u00104k|8\u00107qv/\u0010!wb,_ vw8\u0010&{b9\u0010\u007f\"t3E<f(|";
                    i2 = 46;
                    strArr = strArr2;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr[i] = str;
                    i = 48;
                    str = "},E!";
                    i2 = 47;
                    strArr = strArr2;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr[i] = str;
                    i = 49;
                    str = "s)T;m==Q1";
                    i2 = 48;
                    strArr = strArr2;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr[i] = str;
                    i = 50;
                    str = "s)T;m=3W592?_6gq/\r=rg/";
                    i2 = 49;
                    strArr = strArr2;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr[i] = str;
                    i = 51;
                    str = "s=S";
                    i2 = 50;
                    strArr = strArr2;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr[i] = str;
                    i = 52;
                    str = "\u007fhQ";
                    i2 = 51;
                    strArr = strArr2;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr[i] = str;
                    i = 53;
                    str = "g2B7a};^;xw8\u00103wv5_ro{1Urvk,Ui\"\u007f5]7Vk,Uo";
                    i2 = 52;
                    strArr = strArr2;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr[i] = str;
                    i = 54;
                    str = "w1@&{2=E6k}|];ow|D+rw";
                    i2 = 53;
                    strArr = strArr2;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr[i] = str;
                    i = 55;
                    str = "s)T;m=1@7e";
                    i2 = 54;
                    strArr = strArr2;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr[i] = str;
                    i = 56;
                    str = "s)T;m==] ";
                    i2 = 55;
                    strArr = strArr2;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr[i] = str;
                    i = 57;
                    str = "s1B";
                    i2 = 56;
                    strArr = strArr2;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr[i] = str;
                    i = 58;
                    str = "s)T;m=1@f";
                    i2 = 57;
                    strArr = strArr2;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr[i] = str;
                    i = 59;
                    str = "\u007f,\u0003";
                    i2 = 58;
                    strArr = strArr2;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr[i] = str;
                    i = 60;
                    str = "^9^5vz|_4\"p3Hrv}3\u0010>m|;\u0010&m2>Urr`3S7qa9Th\"";
                    i2 = 59;
                    strArr = strArr2;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr[i] = str;
                    i = 61;
                    str = "W2Trmt|V;nw|\\=my5^5\"t3Br`}$\u0010:gs8U ";
                    i2 = 60;
                    strArr = strArr2;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr[i] = str;
                    i = 62;
                    str = "T3E<f22_<\"q4Q cq(U \"v=D3\"{2\u00100mj|D+rw|";
                    i2 = 61;
                    strArr = strArr2;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr[i] = str;
                    i = 63;
                    str = "^9^5vz|_4\"p3Hrv}3\u0010>m|;\u0010&m2>Urk||S'p`9^&\"{2@'v(|";
                    i2 = 62;
                    strArr = strArr2;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr[i] = str;
                    i = 64;
                    str = "W2Trmt|V;nw|\\=my5^5\"t3Bru{8Ur`}$\u0010>g|;D:";
                    i2 = 63;
                    strArr = strArr2;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr[i] = str;
                    i = 65;
                    str = "\\3Drg|3E5j2>I&ga|D=\"a7Y\"";
                    i2 = 64;
                    strArr = strArr2;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr[i] = str;
                    i = 66;
                    str = "a(C6\"p3Hrl}(\u00104mg2T";
                    i2 = 65;
                    strArr = strArr2;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr[i] = str;
                    i = 67;
                    str = "\u007f5^4\"p3Hrl}(\u00104mg2T";
                    i2 = 66;
                    strArr = strArr2;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr[i] = str;
                    i = 68;
                    str = "a(R>\"p3Hrl}(\u00104mg2T";
                    i2 = 67;
                    strArr = strArr2;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr[i] = str;
                    i = 69;
                    str = "\u007f3_$\"p3Hrl}(\u00104mg2T";
                    i2 = 68;
                    strArr = strArr2;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr[i] = str;
                    i = 70;
                    str = "w/T!\"p3Hrl}(\u00104mg2T";
                    i2 = 69;
                    strArr = strArr2;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr[i] = str;
                    i = 71;
                    str = "\u007f)\\&kb0Urj~8Brq})^6\"f.Q1ia|V=w|8";
                    i2 = 70;
                    strArr = strArr2;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr[i] = str;
                    i = 72;
                    str = "\u007f)\\&kb0Urj~8Brt{8U=\"f.Q1ia|V=w|8";
                    i2 = 71;
                    strArr = strArr2;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr[i] = str;
                    i = 73;
                    str = "z8\\ \"p3Hrv}3\u0010!j}.D";
                    i2 = 72;
                    strArr = strArr2;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr[i] = str;
                    i = 74;
                    str = "V9D3k~/\u00104mg2Th\"";
                    i2 = 73;
                    strArr = strArr2;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr[i] = str;
                    i = 75;
                    str = "q3^&g|(\u00100mj|^=v2:_'lv";
                    i2 = 74;
                    strArr = strArr2;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr[i] = str;
                    i = 76;
                    str = "\u007f8Y3\"p3Hrl}(\u00104mg2T";
                    i2 = 75;
                    strArr = strArr2;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr[i] = str;
                    i = 77;
                    str = "z8\\ \"p3Hrl}(\u00104mg2T";
                    i2 = 76;
                    strArr = strArr2;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr[i] = str;
                    i = 78;
                    str = "g2Q0nw|D=\"v9D7p\u007f5^7\"s)T;m2:Y>g2(I\"g)|V;nwa";
                    i2 = 77;
                    strArr = strArr2;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr[i] = str;
                    i = 79;
                    str = "g2Q0nw|D=\"q0_!g2:Y>g25^\"wf|C&pw=]i\"t5\\7?";
                    i2 = 78;
                    strArr = strArr2;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr[i] = str;
                    i = 80;
                    str = "g2Q0nw|D=\"q0_!g2:Y>g25^\"wf|C&pw=]i\"t5\\7?";
                    i2 = 79;
                    strArr = strArr2;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr[i] = str;
                    i = 81;
                    str = "g2Q0nw|D=\"q0_!g2:Y>g25^\"wf|C&pw=]i\"t5\\7?";
                    i2 = 80;
                    strArr = strArr2;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr[i] = str;
                    I = strArr2;
                    j = new byte[]{(byte) 35, (byte) 33, (byte) 65, (byte) 77, (byte) 82, (byte) 10};
                    n = new byte[]{(byte) 35, (byte) 33, (byte) 65, (byte) 77, (byte) 82, (byte) 45, (byte) 87, (byte) 66, (byte) 10};
                    m = new byte[]{(byte) 102, (byte) 116, (byte) 121, (byte) 112};
                    x = new byte[]{(byte) 77, (byte) 52, (byte) 65, (byte) 32};
                    G = new byte[]{(byte) 79, (byte) 103, (byte) 103, (byte) 83};
                    s = new byte[]{(byte) 79, (byte) 112, (byte) 117, (byte) 115, (byte) 72, (byte) 101, (byte) 97, (byte) 100};
                    D = new byte[]{(byte) 82, (byte) 73, (byte) 70, (byte) 70};
                    F = new byte[]{(byte) 81, (byte) 76, (byte) 67, (byte) 77};
                    q = new byte[]{(byte) 73, (byte) 68, (byte) 51};
                    b = new bg();
                    B = new cm();
                    y = m;
                    u = new byte[]{(byte) 51, (byte) 103, (byte) 112};
                    p = new byte[]{(byte) 109, (byte) 112, (byte) 52};
                    A = new byte[]{(byte) 105, (byte) 115, (byte) 111, (byte) 109};
                    c = a((byte) 109, (byte) 111, (byte) 111, (byte) 118);
                    t = a((byte) 116, (byte) 114, (byte) 97, (byte) 107);
                    v = a((byte) 109, (byte) 100, (byte) 105, (byte) 97);
                    d = a((byte) 104, (byte) 100, (byte) 108, (byte) 114);
                    H = a((byte) 109, (byte) 105, (byte) 110, (byte) 102);
                    a = a((byte) 115, (byte) 116, (byte) 98, (byte) 108);
                    o = a((byte) 115, (byte) 116, (byte) 115, (byte) 100);
                    i = a((byte) 97, (byte) 118, (byte) 99, (byte) 49);
                    w = a((byte) 109, (byte) 112, (byte) 52, (byte) 118);
                    e = a((byte) 115, (byte) 50, (byte) 54, (byte) 51);
                    l = a((byte) 104, (byte) 118, (byte) 99, (byte) 49);
                    z = a((byte) 109, (byte) 112, (byte) 52, (byte) 97);
                    f = a((byte) 115, (byte) 97, (byte) 109, (byte) 114);
                    g = a((byte) 115, (byte) 97, (byte) 119, (byte) 98);
                    r = a((byte) 115, (byte) 113, (byte) 99, (byte) 112);
                    E = a((byte) 97, (byte) 108, (byte) 97, (byte) 99);
                    C = a((byte) 101, (byte) 115, (byte) 100, (byte) 115);
                    k = a((byte) 115, (byte) 111, (byte) 117, (byte) 110);
                    h = a((byte) 118, (byte) 105, (byte) 100, (byte) 101);
                    return;
                default:
                    strArr[i] = str;
                    i = 1;
                    str = "\u007f8Y3\"p3Hrl}(\u00104mg2T";
                    i2 = 0;
                    strArr = strArr2;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.util.ct a(java.io.InputStream r17, long r18, long r20, int[] r22) {
        /*
        r10 = com.whatsapp.util.Log.h;
        r4 = 0;
        r4 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0029;
    L_0x0008:
        r4 = 0;
        r4 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x001e;
    L_0x000e:
        r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1));
        if (r4 <= 0) goto L_0x001e;
    L_0x0012:
        r4 = new java.io.IOException;
        r5 = I;
        r6 = 65;
        r5 = r5[r6];
        r4.<init>(r5);
        throw r4;
    L_0x001e:
        c(r17, r18);
        r0 = r20;
        r2 = r18;
        r20 = a(r0, r2);
    L_0x0029:
        r4 = 8;
        r11 = new byte[r4];
    L_0x002d:
        r4 = -1;
        r4 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x0039;
    L_0x0033:
        r4 = 0;
        r4 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0171;
    L_0x0039:
        r4 = 0;
        r5 = r11.length;
        r0 = r17;
        r5 = a(r0, r11, r4, r5);
        r4 = r11.length;
        if (r5 >= r4) goto L_0x0050;
    L_0x0044:
        r4 = new java.io.IOException;
        r5 = I;
        r6 = 61;
        r5 = r5[r6];
        r4.<init>(r5);
        throw r4;
    L_0x0050:
        r6 = (long) r5;
        r0 = r20;
        r6 = a(r0, r6);
        r4 = 4;
    L_0x0058:
        r8 = 8;
        if (r4 >= r8) goto L_0x0084;
    L_0x005c:
        r8 = r11[r4];
        r9 = 32;
        if (r8 >= r9) goto L_0x0080;
    L_0x0062:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = I;
        r7 = 62;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r4 = r11[r4];
        r4 = r5.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r4 = 0;
    L_0x007f:
        return r4;
    L_0x0080:
        r4 = r4 + 1;
        if (r10 == 0) goto L_0x0058;
    L_0x0084:
        r4 = 0;
        r4 = r11[r4];
        r8 = 1;
        r8 = r11[r8];
        r9 = 2;
        r9 = r11[r9];
        r12 = 3;
        r12 = r11[r12];
        r4 = a(r4, r8, r9, r12);
        if (r4 != 0) goto L_0x0099;
    L_0x0096:
        r4 = -1;
        if (r10 == 0) goto L_0x0174;
    L_0x0099:
        r8 = 1;
        if (r4 != r8) goto L_0x0174;
    L_0x009c:
        r4 = 8;
        r4 = new byte[r4];
        r8 = 0;
        r9 = r4.length;
        r0 = r17;
        r8 = a(r0, r4, r8, r9);
        r5 = r5 + r8;
        r8 = r11.length;
        r9 = r4.length;
        r8 = r8 + r9;
        if (r5 == r8) goto L_0x00ba;
    L_0x00ae:
        r4 = new java.io.IOException;
        r5 = I;
        r6 = 64;
        r5 = r5[r6];
        r4.<init>(r5);
        throw r4;
    L_0x00ba:
        r8 = (long) r5;
        r6 = a(r6, r8);
        r8 = 0;
        r8 = r4[r8];
        r9 = 1;
        r9 = r4[r9];
        r12 = 2;
        r12 = r4[r12];
        r13 = 3;
        r13 = r4[r13];
        r8 = a(r8, r9, r12, r13);
        r8 = (long) r8;
        r12 = 32;
        r8 = r8 << r12;
        r12 = 4;
        r12 = r4[r12];
        r13 = 5;
        r13 = r4[r13];
        r14 = 6;
        r14 = r4[r14];
        r15 = 7;
        r4 = r4[r15];
        r4 = a(r12, r13, r14, r4);
        r12 = (long) r4;
        r8 = r8 | r12;
        r12 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r4 <= 0) goto L_0x0109;
    L_0x00ec:
        r4 = new java.io.IOException;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = I;
        r7 = 60;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r8);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
    L_0x0109:
        r4 = (int) r8;
        r8 = r6;
        r6 = r5;
        r5 = r4;
    L_0x010d:
        r12 = 0;
        r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r4 <= 0) goto L_0x0141;
    L_0x0113:
        r4 = r5 - r6;
        r12 = (long) r4;
        r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r4 >= 0) goto L_0x0141;
    L_0x011a:
        r4 = new java.io.IOException;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = I;
        r10 = 63;
        r7 = r7[r10];
        r6 = r6.append(r7);
        r5 = r6.append(r5);
        r6 = 62;
        r5 = r5.append(r6);
        r5 = r5.append(r8);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
    L_0x0141:
        r4 = 4;
        r4 = r11[r4];
        r7 = 5;
        r7 = r11[r7];
        r12 = 6;
        r12 = r11[r12];
        r13 = 7;
        r13 = r11[r13];
        r7 = a(r4, r7, r12, r13);
        r0 = r22;
        r4 = com.whatsapp.util.ax.a(r0, r7);
        if (r4 == 0) goto L_0x0160;
    L_0x0159:
        r4 = new com.whatsapp.util.ct;
        r4.<init>(r5, r7, r6);
        goto L_0x007f;
    L_0x0160:
        r4 = r5 - r6;
        r12 = (long) r4;
        r0 = r17;
        c(r0, r12);
        r4 = r5 - r6;
        r4 = (long) r4;
        r20 = a(r8, r4);
        if (r10 == 0) goto L_0x002d;
    L_0x0171:
        r4 = 0;
        goto L_0x007f;
    L_0x0174:
        r8 = r6;
        r6 = r5;
        r5 = r4;
        goto L_0x010d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b.a(java.io.InputStream, long, long, int[]):com.whatsapp.util.ct");
    }

    private static void c(InputStream inputStream, long j) {
        int i = Log.h;
        byte[] bArr = new byte[1024];
        while (j > 0) {
            if (a(inputStream, bArr, 0, (int) Math.min((long) bArr.length, j)) == -1) {
                throw new IOException(I[22] + j);
            }
            j -= (long) bArr.length;
            if (i != 0) {
                return;
            }
        }
    }

    public static String a(bg bgVar) {
        switch (bgVar.a) {
            case -1:
            case v.m /*0*/:
            case at.i /*2*/:
            case at.p /*4*/:
            case aF.v /*7*/:
                Log.w(I[36]);
                return null;
            case at.g /*1*/:
                return I[34];
            case at.o /*3*/:
                return I[38];
            case at.m /*5*/:
                return bgVar.b == 1 ? I[39] : I[40];
            case Y.f /*6*/:
                return bgVar.b == 1 ? I[37] : I[35];
            default:
                throw new AssertionError(I[33] + bgVar);
        }
    }

    public static String d(@NonNull File file) {
        return c(file).c == 2 ? I[32] : I[31];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.Nullable
    public static java.lang.String b(@android.support.annotation.Nullable java.lang.String r4, boolean r5) {
        /*
        r1 = 0;
        r0 = android.text.TextUtils.isEmpty(r4);
        if (r0 == 0) goto L_0x0014;
    L_0x0007:
        if (r5 == 0) goto L_0x0012;
    L_0x0009:
        r0 = I;
        r2 = 29;
        r0 = r0[r2];
        com.whatsapp.util.Log.w(r0);
    L_0x0012:
        r0 = r1;
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = -1;
        r2 = r4.hashCode();
        switch(r2) {
            case -1664118616: goto L_0x004e;
            case 1331848029: goto L_0x003d;
            default: goto L_0x001c;
        };
    L_0x001c:
        switch(r0) {
            case 0: goto L_0x005c;
            case 1: goto L_0x0063;
            default: goto L_0x001f;
        };
    L_0x001f:
        if (r5 == 0) goto L_0x003b;
    L_0x0021:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = I;
        r3 = 27;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x003b:
        r0 = r1;
        goto L_0x0013;
    L_0x003d:
        r2 = I;
        r3 = 25;
        r2 = r2[r3];
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x001c;
    L_0x0049:
        r0 = 0;
        r2 = com.whatsapp.util.Log.h;
        if (r2 == 0) goto L_0x001c;
    L_0x004e:
        r2 = I;
        r3 = 26;
        r2 = r2[r3];
        r2 = r4.equals(r2);
        if (r2 == 0) goto L_0x001c;
    L_0x005a:
        r0 = 1;
        goto L_0x001c;
    L_0x005c:
        r0 = I;
        r1 = 30;
        r0 = r0[r1];
        goto L_0x0013;
    L_0x0063:
        r0 = I;
        r1 = 28;
        r0 = r0[r1];
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b.b(java.lang.String, boolean):java.lang.String");
    }

    public static cm c(@NonNull File file) {
        InputStream bufferedInputStream;
        cm b;
        Throwable e;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                b = b(bufferedInputStream);
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable e2) {
                        Log.b(I[21] + file, e2);
                    }
                }
            } catch (IOException e3) {
                e = e3;
                try {
                    Log.c(I[18] + file, e);
                    b = B;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable e22) {
                            Log.b(I[19] + file, e22);
                        }
                    }
                    return b;
                } catch (Throwable th) {
                    e = th;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable e222) {
                            Log.b(I[20] + file, e222);
                        }
                    }
                    throw e;
                }
            }
        } catch (IOException e4) {
            e = e4;
            bufferedInputStream = null;
            Log.c(I[18] + file, e);
            b = B;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            return b;
        } catch (Throwable th2) {
            e = th2;
            bufferedInputStream = null;
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            throw e;
        }
        return b;
    }

    private static int a(InputStream inputStream, ct ctVar) {
        try {
            byte[] bArr = new byte[((int) (ctVar.c - ctVar.a))];
            if (a(inputStream, bArr, 0, bArr.length) != bArr.length) {
                return 0;
            }
            if (bArr[4] != 3) {
                Log.i(I[42] + bArr[4]);
                return 0;
            }
            int[] a = a(bArr, 4, bArr.length);
            if (a == null) {
                Log.i(I[43]);
                return 0;
            }
            int i = a[0] + 4;
            if (bArr[i] != 4) {
                Log.i(I[41] + bArr[i]);
                return 0;
            }
            a = a(bArr, i, bArr.length);
            if (a == null) {
                Log.i(I[44]);
                return 0;
            }
            int i2 = a[0];
            if (bArr[i2 + 1] == 107) {
                return 6;
            }
            if (bArr[i2 + 1] != 64) {
                Log.i(I[47] + bArr[i2 + 1]);
                return 0;
            }
            i = a[0] + 14;
            if (bArr[i] == (byte) 5) {
                return 5;
            }
            Log.i(I[46] + bArr[i]);
            return 0;
        } catch (Exception e) {
            Log.i(I[45] + e.toString());
            return 0;
        }
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(java.io.InputStream r19, long r20) {
        /*
        r9 = com.whatsapp.util.Log.h;
        r6 = -1;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r3 = c;
        r8[r2] = r3;
        r3 = r19;
        r4 = r20;
        r4 = a(r3, r4, r6, r8);
        if (r4 != 0) goto L_0x0020;
    L_0x0016:
        r2 = I;
        r3 = 7;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
    L_0x001f:
        return r2;
    L_0x0020:
        r2 = -1;
        r6 = r4.c;
        r10 = r4.a;
        r6 = r6 - r10;
        r3 = new com.whatsapp.util.bj;
        r4 = r4.a;
        r0 = r19;
        r3.<init>(r0, r4);
        r4 = r3.a();
        r10 = r4 + r6;
    L_0x0035:
        r4 = r3.a();
        r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r4 >= 0) goto L_0x001f;
    L_0x003d:
        r4 = 0;
        r6 = r3.a();
        r6 = r10 - r6;
        r8 = 1;
        r8 = new int[r8];
        r12 = 0;
        r13 = t;
        r8[r12] = r13;
        r4 = a(r3, r4, r6, r8);
        if (r4 == 0) goto L_0x0275;
    L_0x0053:
        r6 = r3.a();
        r12 = r4.c;
        r6 = r6 + r12;
        r4 = r4.a;
        r12 = r6 - r4;
    L_0x005e:
        r4 = r3.a();
        r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1));
        if (r4 >= 0) goto L_0x0275;
    L_0x0066:
        r4 = 0;
        r6 = r3.a();
        r6 = r12 - r6;
        r8 = 1;
        r8 = new int[r8];
        r14 = 0;
        r15 = v;
        r8[r14] = r15;
        r4 = a(r3, r4, r6, r8);
        if (r4 != 0) goto L_0x0086;
    L_0x007c:
        r2 = I;
        r3 = 1;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x0086:
        r6 = r3.a();
        r14 = r4.c;
        r6 = r6 + r14;
        r4 = r4.a;
        r14 = r6 - r4;
        r4 = 0;
        r6 = r3.a();
        r6 = r14 - r6;
        r8 = 1;
        r8 = new int[r8];
        r16 = 0;
        r17 = d;
        r8[r16] = r17;
        r4 = a(r3, r4, r6, r8);
        if (r4 != 0) goto L_0x00b4;
    L_0x00a8:
        r2 = I;
        r3 = 11;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x00b4:
        r6 = r3.a();
        r0 = r4.c;
        r16 = r0;
        r6 = r6 + r16;
        r0 = r4.a;
        r16 = r0;
        r6 = r6 - r16;
        r16 = 16;
        r4 = r4.a;
        r4 = r16 - r4;
        c(r3, r4);
        r4 = 4;
        r4 = new byte[r4];
        r5 = 0;
        r8 = r4.length;
        r5 = a(r3, r4, r5, r8);
        r8 = r4.length;
        if (r5 == r8) goto L_0x00e5;
    L_0x00d9:
        r2 = I;
        r3 = 12;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x00e5:
        r5 = 0;
        r5 = r4[r5];
        r8 = 1;
        r8 = r4[r8];
        r16 = 2;
        r16 = r4[r16];
        r17 = 3;
        r4 = r4[r17];
        r0 = r16;
        r4 = a(r5, r8, r0, r4);
        r5 = h;
        if (r4 != r5) goto L_0x0109;
    L_0x00fd:
        r2 = I;
        r3 = 10;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x0109:
        r5 = k;
        if (r4 == r5) goto L_0x0134;
    L_0x010d:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r8 = I;
        r16 = 9;
        r8 = r8[r16];
        r5 = r5.append(r8);
        r8 = new java.lang.String;
        r16 = a(r4);
        r0 = r16;
        r8.<init>(r0);
        r5 = r5.append(r8);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        if (r9 == 0) goto L_0x026a;
    L_0x0134:
        r5 = k;
        if (r4 != r5) goto L_0x0146;
    L_0x0138:
        r4 = -1;
        if (r2 == r4) goto L_0x0146;
    L_0x013b:
        r2 = I;
        r3 = 6;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x0146:
        r4 = r3.a();
        r4 = r6 - r4;
        r6 = r3.a();
        r6 = r14 - r6;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r14 = H;
        r8[r2] = r14;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x016b;
    L_0x0160:
        r2 = I;
        r3 = 5;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x016b:
        r4 = r3.a();
        r6 = r2.c;
        r4 = r4 + r6;
        r6 = r2.a;
        r6 = r4 - r6;
        r4 = 0;
        r14 = r3.a();
        r6 = r6 - r14;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r14 = a;
        r8[r2] = r14;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x0196;
    L_0x018b:
        r2 = I;
        r3 = 0;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x0196:
        r4 = r3.a();
        r6 = r2.c;
        r4 = r4 + r6;
        r6 = r2.a;
        r6 = r4 - r6;
        r4 = 0;
        r14 = r3.a();
        r6 = r6 - r14;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r14 = o;
        r8[r2] = r14;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x01c1;
    L_0x01b6:
        r2 = I;
        r3 = 3;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x01c1:
        r4 = 8;
        c(r3, r4);
        r4 = r3.a();
        r6 = r2.c;
        r4 = r4 + r6;
        r6 = r2.a;
        r6 = r4 - r6;
        r2 = 5;
        r8 = new int[r2];
        r2 = 0;
        r4 = z;
        r8[r2] = r4;
        r2 = 1;
        r4 = f;
        r8[r2] = r4;
        r2 = 2;
        r4 = g;
        r8[r2] = r4;
        r2 = 3;
        r4 = r;
        r8[r2] = r4;
        r2 = 4;
        r4 = E;
        r8[r2] = r4;
        r4 = 0;
        r14 = r3.a();
        r6 = r6 - r14;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x0206;
    L_0x01fa:
        r2 = I;
        r3 = 8;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x0206:
        r4 = r2.b;
        r5 = z;
        if (r4 == r5) goto L_0x0233;
    L_0x020c:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = I;
        r5 = 4;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = new java.lang.String;
        r2 = r2.b;
        r2 = a(r2);
        r4.<init>(r2);
        r2 = r3.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x0233:
        r4 = r3.a();
        r6 = r2.c;
        r4 = r4 + r6;
        r6 = r2.a;
        r6 = r4 - r6;
        r4 = 8;
        c(r3, r4);
        r2 = b(r3, r2);
        r4 = (long) r2;
        r14 = r3.a();
        r6 = r6 - r14;
        r2 = 1;
        r8 = new int[r2];
        r2 = 0;
        r14 = C;
        r8[r2] = r14;
        r2 = a(r3, r4, r6, r8);
        if (r2 != 0) goto L_0x0266;
    L_0x025b:
        r2 = I;
        r3 = 2;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        goto L_0x001f;
    L_0x0266:
        r2 = a(r3, r2);
    L_0x026a:
        r4 = r3.a();
        r4 = r12 - r4;
        c(r3, r4);
        if (r9 == 0) goto L_0x005e;
    L_0x0275:
        if (r9 == 0) goto L_0x0035;
    L_0x0277:
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.b.a(java.io.InputStream, long):int");
    }

    private static long a(long j, long j2) {
        if (j == -1) {
            return -1;
        }
        return j - j2;
    }

    public static boolean e(@NonNull File file) {
        cm c = c(file);
        if ((c.c == 1 || c.c == 2 || c.c == 3) && ((c.b == 1 || c.b == 2 || c.b == 6 || c.b == 5 || c.b == -1) && (c.a == 1 || c.a == 3 || c.a == 2))) {
            return true;
        }
        return false;
    }
}
