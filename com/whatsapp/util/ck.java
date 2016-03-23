package com.whatsapp.util;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.HashSet;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ck {
    public static final String[] a;
    public static final HashSet c;
    private static final String[] z;
    private co[] b;

    public static long d(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[4];
        randomAccessFile.read(bArr, 0, 4);
        return (long) ((bArr[3] & 255) | (((((bArr[0] << 24) & -16777216) | 0) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)));
    }

    private static ca a(long j, String str, RandomAccessFile randomAccessFile) {
        if (z[4].equals(str)) {
            return new ci(j, str, randomAccessFile);
        }
        if (z[5].equals(str)) {
            return new cw(j, str, randomAccessFile);
        }
        return z[3].equals(str) ? new ce(j, str, randomAccessFile) : new ca(j, str, randomAccessFile);
    }

    public static double g(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[4];
        randomAccessFile.read(bArr, 0, 4);
        return ((double) ((bArr[3] & 255) | (((((bArr[0] << 24) & -16777216) | 0) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)))) / 1.073741824E9d;
    }

    public cl a() {
        return a(this.b);
    }

    public static Date a(long j) {
        return new Date((j - 2082844800) * 1000);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static com.whatsapp.util.co[] a(java.io.RandomAccessFile r13, long r14, long r16) {
        /*
        r6 = com.whatsapp.util.co.a;
        r7 = new java.util.ArrayList;
        r7.<init>();
        r2 = r14;
    L_0x0008:
        r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r0 >= 0) goto L_0x0099;
    L_0x000c:
        r13.seek(r2);
        r0 = d(r13);
        r4 = r13.getFilePointer();
        r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1));
        if (r4 != 0) goto L_0x001d;
    L_0x001b:
        if (r6 == 0) goto L_0x0099;
    L_0x001d:
        r4 = 4;
        r4 = new byte[r4];
        r5 = 0;
        r8 = r4.length;
        r5 = r13.read(r4, r5, r8);
        r8 = r4.length;
        if (r5 == r8) goto L_0x0034;
    L_0x0029:
        r0 = new java.io.IOException;
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0034:
        r8 = new java.lang.String;
        r8.<init>(r4);
        r4 = 1;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 != 0) goto L_0x00ad;
    L_0x003f:
        r0 = b(r13);
        r4 = r0;
    L_0x0044:
        r0 = 0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0054;
    L_0x004a:
        r0 = r2 + r4;
        r10 = r13.length();
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x0070;
    L_0x0054:
        r0 = new java.io.IOException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r4);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0070:
        r0 = c;
        r0 = r0.contains(r8);
        if (r0 == 0) goto L_0x00a3;
    L_0x0078:
        r0 = r13.getFilePointer();
        r10 = r2 + r4;
        r1 = a(r13, r0, r10);
        r0 = new com.whatsapp.util.cz;
        r0.<init>(r4, r8, r1);
    L_0x0087:
        r7.add(r0);
        r0 = 0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x00ab;
    L_0x0090:
        r0 = r13.length();
        if (r6 == 0) goto L_0x0097;
    L_0x0096:
        r0 = r0 + r4;
    L_0x0097:
        if (r6 == 0) goto L_0x00a8;
    L_0x0099:
        r0 = r7.size();
        r0 = new com.whatsapp.util.co[r0];
        r7.toArray(r0);
        return r0;
    L_0x00a3:
        r0 = a(r4, r8, r13);
        goto L_0x0087;
    L_0x00a8:
        r2 = r0;
        goto L_0x0008;
    L_0x00ab:
        r0 = r2;
        goto L_0x0096;
    L_0x00ad:
        r4 = r0;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ck.a(java.io.RandomAccessFile, long, long):com.whatsapp.util.co[]");
    }

    static {
        int i = 0;
        String[] strArr = new String[6];
        String str = "\u0010}E\u0019";
        int i2 = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i3 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i4 = 0; length > i4; i4++) {
                int i5;
                char c = cArr[i4];
                switch (i4 % 5) {
                    case v.m /*0*/:
                        i5 = arj.Theme_checkboxStyle;
                        break;
                    case at.g /*1*/:
                        i5 = 20;
                        break;
                    case at.i /*2*/:
                        i5 = 33;
                        break;
                    case at.o /*3*/:
                        i5 = 124;
                        break;
                    default:
                        i5 = 117;
                        break;
                }
                cArr[i4] = (char) (i5 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i3] = str;
                    str = "\u0007`N\u0011U\u000euR\\\u001c\bb@\u0010\u001c\u00024R\u0015\u000f\u0003.\u0001";
                    i3 = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i3] = str;
                    str = "\u0012\u007fI\u0018";
                    i3 = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i3] = str;
                    str = "\u000epM\u000e";
                    i3 = 4;
                    strArr2 = strArr3;
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i3] = str;
                    i3 = 5;
                    strArr2 = strArr3;
                    str = "\u000bbI\u0018";
                    i2 = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i3] = str;
                    z = strArr3;
                    strArr = new String[14];
                    str = "\u000b{N\n";
                    i2 = 5;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i3 = 0;
                    break;
                case at.m /*5*/:
                    strArr2[i3] = str;
                    str = "\u0012f@\u0017";
                    i2 = 6;
                    i3 = 1;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i3] = str;
                    str = "\u0013pU\u001d";
                    i2 = 7;
                    i3 = 2;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i3] = str;
                    str = "\u0012fD\u001a";
                    i2 = 8;
                    i3 = 3;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i3] = str;
                    str = "\u000fy@\f";
                    i2 = 9;
                    i3 = 4;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i3] = str;
                    i3 = 5;
                    str = "\u000bpH\u001d";
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i3] = str;
                    i3 = 6;
                    str = "\u000b}O\u001a";
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i3] = str;
                    i3 = 7;
                    str = "\u0015`C\u0010";
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i3] = str;
                    i3 = 8;
                    str = "\u0003pU\u000f";
                    i2 = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i3] = str;
                    i3 = 9;
                    str = "\u000bpS\u001d";
                    i2 = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i3] = str;
                    i3 = 10;
                    str = "\u0014yS\u001d";
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i3] = str;
                    i3 = 11;
                    str = "\u000fy@\u001b";
                    i2 = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i3] = str;
                    i3 = 12;
                    str = "\u0010zS\f";
                    i2 = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i3] = str;
                    i3 = 13;
                    str = "\u0002}O\u001a";
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i3] = str;
                    a = strArr3;
                    c = new HashSet();
                    while (i < a.length) {
                        c.add(a[i]);
                        i++;
                    }
                    return;
                default:
                    strArr2[i3] = str;
                    str = "%{T\u0010\u0011\b3U\\\u0007\u0003uE\\\u0014\u0012{L\\\u0001\u001fdD";
                    i3 = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.util.co a(com.whatsapp.util.co[] r4, java.lang.Class r5) {
        /*
        r3 = com.whatsapp.util.co.a;
        r0 = 0;
        r2 = r0;
    L_0x0004:
        r0 = r4.length;
        if (r2 >= r0) goto L_0x0028;
    L_0x0007:
        r1 = r4[r2];
        r0 = r1 instanceof com.whatsapp.util.cz;
        if (r0 == 0) goto L_0x001e;
    L_0x000d:
        r0 = r1;
        r0 = (com.whatsapp.util.cz) r0;
        r0 = r0.a();
        r0 = a(r0, r5);
        if (r0 == 0) goto L_0x001c;
    L_0x001a:
        r1 = r0;
    L_0x001b:
        return r1;
    L_0x001c:
        if (r3 == 0) goto L_0x0024;
    L_0x001e:
        r0 = r1.getClass();
        if (r0 == r5) goto L_0x001b;
    L_0x0024:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x002a;
    L_0x0028:
        r1 = 0;
        goto L_0x001b;
    L_0x002a:
        r2 = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ck.a(com.whatsapp.util.co[], java.lang.Class):com.whatsapp.util.co");
    }

    public static int e(RandomAccessFile randomAccessFile) {
        return randomAccessFile.readByte();
    }

    public static double c(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[4];
        randomAccessFile.read(bArr, 0, 4);
        return ((double) ((bArr[3] & 255) | (((((bArr[0] << 24) & -16777216) | 0) | ((bArr[1] << 16) & 16711680)) | ((bArr[2] << 8) & 65280)))) / 65536.0d;
    }

    public static int a(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[3];
        randomAccessFile.read(bArr, 0, 3);
        return (bArr[2] & 255) | ((((bArr[0] << 16) & 16711680) | 0) | ((bArr[1] << 8) & 65280));
    }

    public static long b(RandomAccessFile randomAccessFile) {
        return (0 + (d(randomAccessFile) << 32)) + d(randomAccessFile);
    }

    public static String a(RandomAccessFile randomAccessFile, int i) {
        byte[] bArr = new byte[i];
        randomAccessFile.read(bArr, 0, i);
        return new String(bArr);
    }

    public static int f(RandomAccessFile randomAccessFile) {
        return (randomAccessFile.readByte() << 8) | randomAccessFile.readByte();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.whatsapp.util.cl a(com.whatsapp.util.co[] r6) {
        /*
        r3 = 0;
        r4 = com.whatsapp.util.co.a;
        r2 = r3;
    L_0x0004:
        r0 = r6.length;
        if (r2 >= r0) goto L_0x0040;
    L_0x0007:
        r1 = r6[r2];
        r0 = r1 instanceof com.whatsapp.util.cz;
        if (r0 == 0) goto L_0x001d;
    L_0x000d:
        r0 = r1;
        r0 = (com.whatsapp.util.cz) r0;
        r0 = r0.a();
        r0 = a(r0);
        if (r0 == 0) goto L_0x001b;
    L_0x001a:
        return r0;
    L_0x001b:
        if (r4 == 0) goto L_0x003c;
    L_0x001d:
        r0 = r1 instanceof com.whatsapp.util.ce;
        if (r0 == 0) goto L_0x003c;
    L_0x0021:
        r0 = com.whatsapp.util.ci.class;
        r0 = a(r6, r0);
        r0 = (com.whatsapp.util.ci) r0;
        if (r0 == 0) goto L_0x003c;
    L_0x002b:
        r5 = z;
        r5 = r5[r3];
        r0 = r0.h;
        r0 = r5.equals(r0);
        if (r0 == 0) goto L_0x003c;
    L_0x0037:
        r1 = (com.whatsapp.util.ce) r1;
        r0 = r1.f;
        goto L_0x001a;
    L_0x003c:
        r0 = r2 + 1;
        if (r4 == 0) goto L_0x0042;
    L_0x0040:
        r0 = 0;
        goto L_0x001a;
    L_0x0042:
        r2 = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ck.a(com.whatsapp.util.co[]):com.whatsapp.util.cl");
    }

    public void a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        this.b = a(randomAccessFile, 0, randomAccessFile.length());
        randomAccessFile.close();
    }
}
