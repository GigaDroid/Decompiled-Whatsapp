package com.google;

import java.util.Arrays;
import java.util.Map;

public abstract class aH extends aU {
    static final int[] d;
    static final int[][] f;
    static final int[][] g;
    static final int[] h;
    private final StringBuilder b;
    private final v c;
    private final hs e;

    protected abstract int a(d_ d_Var, int[] iArr, StringBuilder stringBuilder);

    abstract gg a();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] a(com.google.d_ r10, int r11, boolean r12, int[] r13, int[] r14) {
        /*
        r4 = com.google.aU.a;
        r5 = r13.length;
        r6 = r10.d();
        if (r12 == 0) goto L_0x003d;
    L_0x0009:
        r0 = r10.d(r11);
    L_0x000d:
        r1 = 0;
        r3 = r0;
        r2 = r12;
    L_0x0010:
        if (r3 >= r6) goto L_0x006b;
    L_0x0012:
        r7 = r10.f(r3);
        r7 = r7 ^ r2;
        if (r7 == 0) goto L_0x0021;
    L_0x0019:
        r7 = r14[r1];
        r7 = r7 + 1;
        r14[r1] = r7;
        if (r4 == 0) goto L_0x0067;
    L_0x0021:
        r7 = r5 + -1;
        if (r1 != r7) goto L_0x005f;
    L_0x0025:
        r7 = 1060320051; // 0x3f333333 float:0.7 double:5.23867711E-315;
        r7 = com.google.aU.a(r14, r13, r7);
        r8 = 1056293519; // 0x3ef5c28f float:0.48 double:5.218783397E-315;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 >= 0) goto L_0x0042;
    L_0x0033:
        r1 = 2;
        r1 = new int[r1];
        r2 = 0;
        r1[r2] = r0;
        r0 = 1;
        r1[r0] = r3;
        return r1;
    L_0x003d:
        r0 = r10.c(r11);
        goto L_0x000d;
    L_0x0042:
        r7 = 0;
        r7 = r14[r7];
        r8 = 1;
        r8 = r14[r8];
        r7 = r7 + r8;
        r0 = r0 + r7;
        r7 = 2;
        r8 = 0;
        r9 = r5 + -2;
        java.lang.System.arraycopy(r14, r7, r14, r8, r9);
        r7 = r5 + -2;
        r8 = 0;
        r14[r7] = r8;
        r7 = r5 + -1;
        r8 = 0;
        r14[r7] = r8;
        r1 = r1 + -1;
        if (r4 == 0) goto L_0x0061;
    L_0x005f:
        r1 = r1 + 1;
    L_0x0061:
        r7 = 1;
        r14[r1] = r7;
        if (r2 != 0) goto L_0x0070;
    L_0x0066:
        r2 = 1;
    L_0x0067:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0010;
    L_0x006b:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0070:
        r2 = 0;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.aH.a(com.google.d_, int, boolean, int[], int[]):int[]");
    }

    static int[] a(d_ d_Var, int i, boolean z, int[] iArr) {
        return a(d_Var, i, z, iArr, new int[iArr.length]);
    }

    public f6 a(int i, d_ d_Var, Map map) {
        return a(i, d_Var, a(d_Var), map);
    }

    static int[] a(d_ d_Var) {
        int i = aU.a;
        int[] iArr = null;
        int[] iArr2 = new int[h.length];
        int i2 = 0;
        boolean z = false;
        while (!z) {
            Arrays.fill(iArr2, 0, h.length, 0);
            iArr = a(d_Var, i2, false, h, iArr2);
            int i3 = iArr[0];
            i2 = iArr[1];
            int i4 = i3 - (i2 - i3);
            if (i4 >= 0) {
                z = d_Var.a(i4, i3, false);
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        return iArr;
    }

    int[] a(d_ d_Var, int i) {
        return a(d_Var, i, false, h);
    }

    boolean a(String str) {
        return a((CharSequence) str);
    }

    static int a(d_ d_Var, int[] iArr, int i, int[][] iArr2) {
        int i2 = aU.a;
        aU.a(d_Var, i, iArr);
        float f = 0.48f;
        int i3 = -1;
        int length = iArr2.length;
        int i4 = 0;
        while (i4 < length) {
            float a = aU.a(iArr, iArr2[i4], 0.7f);
            if (a < f) {
                i3 = i4;
            } else {
                a = f;
            }
            i4++;
            if (i2 != 0) {
                break;
            }
            f = a;
        }
        if (i3 >= 0) {
            return i3;
        }
        throw aN.a();
    }

    public f6 a(int i, d_ d_Var, int[] iArr, Map map) {
        dB dBVar;
        int i2 = aU.a;
        if (map == null) {
            dBVar = null;
        } else {
            dBVar = (dB) map.get(b3.NEED_RESULT_POINT_CALLBACK);
        }
        if (dBVar != null) {
            try {
                dBVar.a(new fI(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i));
            } catch (aK e) {
                throw e;
            }
        }
        StringBuilder stringBuilder = this.b;
        stringBuilder.setLength(0);
        int a = a(d_Var, iArr, stringBuilder);
        if (dBVar != null) {
            try {
                dBVar.a(new fI((float) a, (float) i));
            } catch (aK e2) {
                throw e2;
            }
        }
        int[] a2 = a(d_Var, a);
        if (dBVar != null) {
            try {
                dBVar.a(new fI(((float) (a2[0] + a2[1])) / 2.0f, (float) i));
            } catch (aK e22) {
                throw e22;
            }
        }
        int i3 = a2[1];
        int i4 = (i3 - a2[0]) + i3;
        try {
            if (i4 >= d_Var.d() || !d_Var.a(i3, i4, false)) {
                throw aN.a();
            }
            String stringBuilder2 = stringBuilder.toString();
            try {
                if (stringBuilder2.length() < 8) {
                    throw aG.a();
                }
                try {
                    if (a(stringBuilder2)) {
                        float f = ((float) (iArr[1] + iArr[0])) / 2.0f;
                        float f2 = ((float) (a2[1] + a2[0])) / 2.0f;
                        gg a3 = a();
                        f6 f6Var = new f6(stringBuilder2, null, new fI[]{new fI(f, (float) i), new fI(f2, (float) i)}, a3);
                        i3 = 0;
                        try {
                            f6 a4 = this.c.a(i, d_Var, a2[1]);
                            f6Var.a(eD.UPC_EAN_EXTENSION, a4.c());
                            f6Var.a(a4.b());
                            f6Var.a(a4.e());
                            i4 = a4.c().length();
                        } catch (aK e3) {
                            i4 = i3;
                        }
                        if (map == null) {
                            a2 = null;
                        } else {
                            a2 = (int[]) map.get(b3.ALLOWED_EAN_EXTENSIONS);
                        }
                        if (a2 != null) {
                            int length = a2.length;
                            Object obj = null;
                            int i5 = 0;
                            while (i5 < length) {
                                if (i4 == a2[i5]) {
                                    obj = 1;
                                    if (i2 == 0) {
                                        break;
                                    }
                                }
                                i5++;
                                if (i2 != 0) {
                                    break;
                                }
                            }
                            if (obj == null) {
                                try {
                                    throw aN.a();
                                } catch (aK e222) {
                                    throw e222;
                                }
                            }
                        }
                        try {
                            if (a3 == gg.EAN_13 || a3 == gg.UPC_A) {
                                String a5 = this.e.a(stringBuilder2);
                                if (a5 != null) {
                                    try {
                                        f6Var.a(eD.POSSIBLE_COUNTRY, a5);
                                    } catch (aK e2222) {
                                        throw e2222;
                                    }
                                }
                            }
                            return f6Var;
                        } catch (aK e22222) {
                            throw e22222;
                        }
                    }
                    throw aC.a();
                } catch (aK e222222) {
                    throw e222222;
                }
            } catch (aK e2222222) {
                throw e2222222;
            }
        } catch (aK e22222222) {
            throw e22222222;
        } catch (aK e222222222) {
            throw e222222222;
        }
    }

    static boolean a(CharSequence charSequence) {
        int i = aU.a;
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i2 = length - 2;
        int i3 = 0;
        while (i2 >= 0) {
            int charAt = charSequence.charAt(i2) - 48;
            if (charAt >= 0 && charAt <= 9) {
                i3 += charAt;
                i2 -= 2;
                if (i != 0) {
                    break;
                }
            }
            throw aG.a();
        }
        i3 *= 3;
        i2 = length - 1;
        while (i2 >= 0) {
            length = charSequence.charAt(i2) - 48;
            if (length >= 0 && length <= 9) {
                i3 += length;
                i2 -= 2;
                if (i != 0) {
                    break;
                }
            }
            throw aG.a();
        }
        return i3 % 10 == 0;
    }

    protected aH() {
        this.b = new StringBuilder(20);
        this.c = new v();
        this.e = new hs();
    }

    static {
        h = new int[]{1, 1, 1};
        d = new int[]{1, 1, 1, 1, 1};
        f = new int[][]{new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        g = new int[20][];
        System.arraycopy(f, 0, g, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr = f[i - 10];
            int[] iArr2 = new int[iArr.length];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr2[i2] = iArr[(iArr.length - i2) - 1];
            }
            g[i] = iArr2;
        }
    }
}
