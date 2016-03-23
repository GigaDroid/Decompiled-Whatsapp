package com.google;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class dD {
    private static final int[] a;
    private static final String[] z;

    private static h8 a(String str, String str2) {
        int i = 0;
        int i2 = dG.c;
        if (z[6].equals(str2)) {
            return a(str) ? h8.KANJI : h8.BYTE;
        } else {
            int i3 = 0;
            int i4 = 0;
            while (i < str.length()) {
                int charAt = str.charAt(i);
                if (charAt >= '0' && charAt <= '9') {
                    if (i2 == 0) {
                        i4 = 1;
                        i++;
                        if (i2 != 0) {
                            break;
                        }
                    }
                    i4 = 1;
                }
                if (a(charAt) != -1 && i2 == 0) {
                    i3 = 1;
                    i++;
                    if (i2 != 0) {
                        break;
                    }
                }
                return h8.BYTE;
            }
            if (i3 != 0) {
                return h8.ALPHANUMERIC;
            }
            if (i4 != 0) {
                return h8.NUMERIC;
            }
            return h8.BYTE;
        }
    }

    static void a(int i, fQ fQVar, h8 h8Var, d_ d_Var) {
        int characterCountBits = h8Var.getCharacterCountBits(fQVar);
        if (i >= (1 << characterCountBits)) {
            throw new dC(i + z[0] + ((1 << characterCountBits) - 1));
        }
        d_Var.a(i, characterCountBits);
    }

    private static void a(dN dNVar, d_ d_Var) {
        d_Var.a(h8.ECI.getBits(), 4);
        d_Var.a(dNVar.getValue(), 8);
    }

    static byte[] a(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = dG.c;
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        int i4 = 0;
        while (i4 < length) {
            iArr[i4] = bArr[i4] & 255;
            i4++;
            if (i3 != 0) {
                break;
            }
        }
        new X(aj.g).a(iArr, i);
        byte[] bArr2 = new byte[i];
        while (i2 < i) {
            bArr2[i2] = (byte) iArr[length + i2];
            i2++;
            if (i3 != 0) {
                break;
            }
        }
        return bArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.lang.String r9, com.google.d_ r10) {
        /*
        r8 = 33088; // 0x8140 float:4.6366E-41 double:1.63476E-319;
        r1 = -1;
        r3 = com.google.dG.c;
        r0 = z;	 Catch:{ UnsupportedEncodingException -> 0x004c }
        r2 = 12;
        r0 = r0[r2];	 Catch:{ UnsupportedEncodingException -> 0x004c }
        r4 = r9.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x004c }
        r5 = r4.length;
        r0 = 0;
        r2 = r0;
    L_0x0013:
        if (r2 >= r5) goto L_0x0063;
    L_0x0015:
        r0 = r4[r2];
        r0 = r0 & 255;
        r6 = r2 + 1;
        r6 = r4[r6];
        r6 = r6 & 255;
        r0 = r0 << 8;
        r6 = r6 | r0;
        if (r6 < r8) goto L_0x0066;
    L_0x0024:
        r0 = 40956; // 0x9ffc float:5.7392E-41 double:2.0235E-319;
        if (r6 > r0) goto L_0x0066;
    L_0x0029:
        r0 = r6 - r8;
        if (r3 == 0) goto L_0x003c;
    L_0x002d:
        r7 = 57408; // 0xe040 float:8.0446E-41 double:2.83633E-319;
        if (r6 < r7) goto L_0x003c;
    L_0x0032:
        r7 = 60351; // 0xebbf float:8.457E-41 double:2.98174E-319;
        if (r6 > r7) goto L_0x003c;
    L_0x0037:
        r0 = 49472; // 0xc140 float:6.9325E-41 double:2.44424E-319;
        r0 = r6 - r0;
    L_0x003c:
        if (r0 != r1) goto L_0x0053;
    L_0x003e:
        r0 = new com.google.dC;	 Catch:{ UnsupportedEncodingException -> 0x004a }
        r1 = z;	 Catch:{ UnsupportedEncodingException -> 0x004a }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ UnsupportedEncodingException -> 0x004a }
        r0.<init>(r1);	 Catch:{ UnsupportedEncodingException -> 0x004a }
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r0 = move-exception;
        r1 = new com.google.dC;
        r1.<init>(r0);
        throw r1;
    L_0x0053:
        r6 = r0 >> 8;
        r6 = r6 * 192;
        r0 = r0 & 255;
        r0 = r0 + r6;
        r6 = 13;
        r10.a(r0, r6);
        r0 = r2 + 2;
        if (r3 == 0) goto L_0x0064;
    L_0x0063:
        return;
    L_0x0064:
        r2 = r0;
        goto L_0x0013;
    L_0x0066:
        r0 = r1;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dD.a(java.lang.String, com.google.d_):void");
    }

    static d_ a(d_ d_Var, int i, int i2, int i3) {
        int i4 = dG.c;
        if (d_Var.f() != i2) {
            throw new dC(z[3]);
        }
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        Collection<bf> arrayList = new ArrayList(i3);
        int i10 = 0;
        while (i10 < i3) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            a(i, i2, i3, i10, iArr, iArr2);
            i5 = iArr[0];
            byte[] bArr = new byte[i5];
            d_Var.a(i7 * 8, bArr, 0, i5);
            byte[] a = a(bArr, iArr2[0]);
            arrayList.add(new bf(bArr, a));
            int max = Math.max(i8, i5);
            i5 = Math.max(i9, a.length);
            i6 = iArr[0] + i7;
            i10++;
            if (i4 != 0) {
                i10 = max;
                int i11 = i5;
                i5 = i6;
                i6 = i11;
                break;
            }
            i9 = i5;
            i8 = max;
            i7 = i6;
        }
        i6 = i9;
        i10 = i8;
        i5 = i7;
        if (i2 != i5) {
            throw new dC(z[1]);
        }
        d_ d_Var2 = new d_();
        max = 0;
        while (max < i10) {
            for (bf a2 : arrayList) {
                byte[] a3 = a2.a();
                if (max < a3.length) {
                    d_Var2.a(a3[max], 8);
                    continue;
                }
                if (i4 != 0) {
                    break;
                }
            }
            i5 = max + 1;
            if (i4 != 0) {
                break;
            }
            max = i5;
        }
        max = 0;
        while (max < i6) {
            for (bf a22 : arrayList) {
                a3 = a22.b();
                if (max < a3.length) {
                    d_Var2.a(a3[max], 8);
                    continue;
                }
                if (i4 != 0) {
                    break;
                }
            }
            i5 = max + 1;
            if (i4 != 0) {
                break;
            }
            max = i5;
        }
        if (i == d_Var2.f()) {
            return d_Var2;
        }
        throw new dC(z[2] + i + z[4] + d_Var2.f() + z[5]);
    }

    static void a(int i, d_ d_Var) {
        int i2 = dG.c;
        int i3 = i * 8;
        if (d_Var.d() > i3) {
            throw new dC(z[14] + d_Var.d() + z[15] + i3);
        }
        int i4 = 0;
        while (i4 < 4 && d_Var.d() < i3) {
            d_Var.a(false);
            i4++;
            if (i2 != 0) {
                break;
            }
        }
        i4 = d_Var.d() & 7;
        if (i4 > 0) {
            while (i4 < 8) {
                d_Var.a(false);
                i4++;
                if (i2 != 0) {
                    break;
                }
            }
        }
        int f = i - d_Var.f();
        i4 = 0;
        while (i4 < f) {
            int i5;
            if ((i4 & 1) == 0) {
                i5 = 236;
            } else {
                i5 = 17;
            }
            d_Var.a(i5, 8);
            i5 = i4 + 1;
            if (i2 != 0) {
                break;
            }
            i4 = i5;
        }
        if (d_Var.d() != i3) {
            throw new dC(z[16]);
        }
    }

    static void a(h8 h8Var, d_ d_Var) {
        d_Var.a(h8Var.getBits(), 4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(java.lang.String r4, com.google.h8 r5, com.google.d_ r6, java.lang.String r7) {
        /*
        r0 = com.google.dG.c;
        r1 = com.google.aY.a;
        r2 = r5.ordinal();
        r1 = r1[r2];
        switch(r1) {
            case 1: goto L_0x002a;
            case 2: goto L_0x002f;
            case 3: goto L_0x0034;
            case 4: goto L_0x0039;
            default: goto L_0x000d;
        };
    L_0x000d:
        r0 = new com.google.dC;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 17;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r5);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x002a:
        b(r4, r6);
        if (r0 == 0) goto L_0x003e;
    L_0x002f:
        a(r4, r6);
        if (r0 == 0) goto L_0x003e;
    L_0x0034:
        a(r4, r6, r7);
        if (r0 == 0) goto L_0x003e;
    L_0x0039:
        a(r4, r6);
        if (r0 != 0) goto L_0x000d;
    L_0x003e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dD.a(java.lang.String, com.google.h8, com.google.d_, java.lang.String):void");
    }

    static void b(CharSequence charSequence, d_ d_Var) {
        int i = dG.c;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int charAt = charSequence.charAt(i2) - 48;
            if (i2 + 2 < length) {
                d_Var.a((((charSequence.charAt(i2 + 1) - 48) * 10) + (charAt * 100)) + (charSequence.charAt(i2 + 2) - 48), 10);
                i2 += 3;
                if (i == 0) {
                    continue;
                    if (i != 0) {
                        return;
                    }
                }
            }
            if (i2 + 1 < length) {
                d_Var.a((charSequence.charAt(i2 + 1) - 48) + (charAt * 10), 7);
                i2 += 2;
                if (i == 0) {
                    continue;
                    if (i != 0) {
                        return;
                    }
                }
            }
            d_Var.a(charAt, 4);
            i2++;
            continue;
            if (i != 0) {
                return;
            }
        }
    }

    private static fQ a(int i, hP hPVar) {
        int i2 = dG.c;
        int i3 = 1;
        while (i3 <= 40) {
            fQ b = fQ.b(i3);
            if (b.f() - b.a(hPVar).a() < (i + 7) / 8) {
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            return b;
        }
        throw new dC(z[18]);
    }

    static void a(CharSequence charSequence, d_ d_Var) {
        int i = dG.c;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            int a = a(charSequence.charAt(i2));
            if (a == -1) {
                throw new dC();
            }
            if (i2 + 1 < length) {
                int a2 = a(charSequence.charAt(i2 + 1));
                if (a2 == -1) {
                    throw new dC();
                }
                d_Var.a(a2 + (a * 45), 11);
                i2 += 2;
                if (i == 0) {
                    continue;
                    if (i != 0) {
                        return;
                    }
                }
            }
            d_Var.a(a, 6);
            i2++;
            continue;
            if (i != 0) {
                return;
            }
        }
    }

    private static int a(dG dGVar) {
        return ((iM.b(dGVar) + iM.a(dGVar)) + iM.c(dGVar)) + iM.d(dGVar);
    }

    private static int a(d_ d_Var, hP hPVar, fQ fQVar, dG dGVar) {
        int i = dG.c;
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        int i4 = 0;
        while (i4 < 8) {
            fB.a(d_Var, hPVar, fQVar, i4, dGVar);
            int a = a(dGVar);
            if (a < i2) {
                i3 = i4;
            } else {
                a = i2;
            }
            i4++;
            if (i != 0) {
                break;
            }
            i2 = a;
        }
        return i3;
    }

    public static fY a(String str, hP hPVar, Map map) {
        String str2;
        int i = dG.c;
        if (map == null) {
            str2 = null;
        } else {
            str2 = (String) map.get(i8.CHARACTER_SET);
        }
        if (str2 == null) {
            str2 = z[19];
        }
        h8 a = a(str, str2);
        d_ d_Var = new d_();
        if (a == h8.BYTE && !z[20].equals(str2)) {
            dN characterSetECIByName = dN.getCharacterSetECIByName(str2);
            if (characterSetECIByName != null) {
                a(characterSetECIByName, d_Var);
            }
        }
        a(a, d_Var);
        d_ d_Var2 = new d_();
        a(str, a, d_Var2, str2);
        fQ a2 = a((a.getCharacterCountBits(a((d_Var.d() + a.getCharacterCountBits(fQ.b(1))) + d_Var2.d(), hPVar)) + d_Var.d()) + d_Var2.d(), hPVar);
        d_ d_Var3 = new d_();
        d_Var3.b(d_Var);
        a(a == h8.BYTE ? d_Var2.f() : str.length(), a2, a, d_Var3);
        d_Var3.b(d_Var2);
        fu a3 = a2.a(hPVar);
        int f = a2.f() - a3.a();
        a(f, d_Var3);
        d_ a4 = a(d_Var3, a2.f(), f, a3.c());
        fY fYVar = new fY();
        fYVar.a(hPVar);
        fYVar.a(a);
        fYVar.a(a2);
        int d = a2.d();
        dG dGVar = new dG(d, d);
        d = a(a4, hPVar, a2, dGVar);
        fYVar.a(d);
        fB.a(a4, hPVar, a2, d, dGVar);
        fYVar.a(dGVar);
        if (i != 0) {
            boolean z;
            if (aK.a) {
                z = false;
            } else {
                z = true;
            }
            aK.a = z;
        }
        return fYVar;
    }

    static void a(String str, d_ d_Var, String str2) {
        int i = dG.c;
        try {
            byte[] bytes = str.getBytes(str2);
            int length = bytes.length;
            int i2 = 0;
            while (i2 < length) {
                d_Var.a(bytes[i2], 8);
                i2++;
                if (i != 0) {
                    return;
                }
            }
        } catch (Throwable e) {
            throw new dC(e);
        }
    }

    private static boolean a(String str) {
        int i = dG.c;
        try {
            byte[] bytes = str.getBytes(z[13]);
            int length = bytes.length;
            try {
                if (length % 2 != 0) {
                    return false;
                }
                int i2 = 0;
                while (i2 < length) {
                    int i3 = bytes[i2] & 255;
                    if ((i3 >= 129 && i3 <= 159) || (i3 >= 224 && i3 <= 235)) {
                        i2 += 2;
                        if (i != 0) {
                            break;
                        }
                    }
                    return false;
                }
                return true;
            } catch (UnsupportedEncodingException e) {
                throw e;
            }
        } catch (UnsupportedEncodingException e2) {
            return false;
        }
    }

    static {
        String[] strArr = new String[21];
        String str = "ba\u0015%J+o\u0001`Zb|\u000edFb";
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
                        i3 = 66;
                        break;
                    case at.g /*1*/:
                        i3 = 8;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 5;
                        break;
                    default:
                        i3 = 40;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000bf\u0012`Z.m\u0007sA,oF`Z0g\u0014?\b";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\f}\u000bgM0(\tc\b a\u0012v\b#f\u0002%L#|\u0007%J;|\u0003v\b&g\u0003v\b,g\u0012%E#|\u0005m";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "bi\ba\b";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    str = "bl\u000fcN'zH";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "\u0011`\u000fc\\\u001dB/V";
                    obj = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0010[FgD-k\rv\b/a\u0015hI6k\u000e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "\u0000d\tfCbA\"%\\-gFiI0o\u0003";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "\u0007KFgQ6m\u0015%E+{\u000bd\\!`";
                    obj = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0016g\u0012dDbj\u001fqM1(\u000bl[/i\u0012f@";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u000bf\u0010dD+lFgQ6mFvM3}\u0003kK'";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0011`\u000fc\\\u001dB/V";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0011`\u000fc\\\u001dB/V";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "&i\u0012d\b a\u0012v\b!i\bkG6(\u0000l\\ba\b%\\*mFTzbK\taM";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "b6F";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0000a\u0012v\b1a\u001c`\b&g\u0003v\b,g\u0012%M3}\u0007i\b!i\u0016dK+|\u001f";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u000bf\u0010dD+lFhG&m\\%";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0006i\u0012d\b6g\t%J+o";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u000b[)(\u0010z=_(\u0019";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u000b[)(\u0010z=_(\u0019";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0006i\u0012d\b q\u0012`[bl\t`[bf\tq\b/i\u0012f@bg\u0000c['|";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(int r10, int r11, int r12, int r13, int[] r14, int[] r15) {
        /*
        r9 = 0;
        r0 = com.google.dG.c;
        if (r13 < r12) goto L_0x0011;
    L_0x0005:
        r0 = new com.google.dC;
        r1 = z;
        r2 = 8;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0011:
        r1 = r10 % r12;
        r2 = r12 - r1;
        r3 = r10 / r12;
        r4 = r3 + 1;
        r5 = r11 / r12;
        r6 = r5 + 1;
        r3 = r3 - r5;
        r4 = r4 - r6;
        if (r3 == r4) goto L_0x002d;
    L_0x0021:
        r0 = new com.google.dC;
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x002d:
        r7 = r2 + r1;
        if (r12 == r7) goto L_0x003c;
    L_0x0031:
        r0 = new com.google.dC;
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x003c:
        r7 = r5 + r3;
        r7 = r7 * r2;
        r8 = r6 + r4;
        r1 = r1 * r8;
        r1 = r1 + r7;
        if (r10 == r1) goto L_0x0051;
    L_0x0045:
        r0 = new com.google.dC;
        r1 = z;
        r2 = 10;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0051:
        if (r13 >= r2) goto L_0x0059;
    L_0x0053:
        r14[r9] = r5;
        r15[r9] = r3;
        if (r0 == 0) goto L_0x005d;
    L_0x0059:
        r14[r9] = r6;
        r15[r9] = r4;
    L_0x005d:
        r1 = com.google.aK.a;
        if (r1 == 0) goto L_0x0065;
    L_0x0061:
        r0 = r0 + 1;
        com.google.dG.c = r0;
    L_0x0065:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.dD.a(int, int, int, int, int[], int[]):void");
    }

    static int a(int i) {
        return i < a.length ? a[i] : -1;
    }
}
