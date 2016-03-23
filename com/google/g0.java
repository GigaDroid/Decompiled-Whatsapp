package com.google;

import java.lang.reflect.Array;

public final class g0 {
    public static int a;
    private static final h0 b;

    private static int a(int[] iArr, int[] iArr2, int i) {
        if ((iArr2 == null || iArr2.length <= (i / 2) + 3) && i >= 0 && i <= 512) {
            return b.a(iArr, i, iArr2);
        }
        throw aC.a();
    }

    private static int b(int i) {
        return 2 << i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.am b(com.google.ds r13) {
        /*
        r1 = 0;
        r3 = a;
        r4 = a(r13);
        a(r13, r4);
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0 = r13.h();
        r2 = r13.c();
        r0 = r0 * r2;
        r6 = new int[r0];
        r7 = new java.util.ArrayList;
        r7.<init>();
        r8 = new java.util.ArrayList;
        r8.<init>();
        r0 = r1;
    L_0x0025:
        r2 = r13.h();
        if (r0 >= r2) goto L_0x006a;
    L_0x002b:
        r2 = r1;
    L_0x002c:
        r9 = r13.c();
        if (r2 >= r9) goto L_0x0066;
    L_0x0032:
        r9 = r4[r0];
        r10 = r2 + 1;
        r9 = r9[r10];
        r9 = r9.a();
        r10 = r13.c();
        r10 = r10 * r0;
        r10 = r10 + r2;
        r11 = r9.length;
        if (r11 != 0) goto L_0x004e;
    L_0x0045:
        r11 = java.lang.Integer.valueOf(r10);
        r5.add(r11);
        if (r3 == 0) goto L_0x0062;
    L_0x004e:
        r11 = r9.length;
        r12 = 1;
        if (r11 != r12) goto L_0x0058;
    L_0x0052:
        r11 = r9[r1];
        r6[r10] = r11;
        if (r3 == 0) goto L_0x0062;
    L_0x0058:
        r10 = java.lang.Integer.valueOf(r10);
        r8.add(r10);
        r7.add(r9);
    L_0x0062:
        r2 = r2 + 1;
        if (r3 == 0) goto L_0x002c;
    L_0x0066:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0025;
    L_0x006a:
        r0 = r7.size();
        r2 = new int[r0][];
    L_0x0070:
        r0 = r2.length;
        if (r1 >= r0) goto L_0x007f;
    L_0x0073:
        r0 = r7.get(r1);
        r0 = (int[]) r0;
        r2[r1] = r0;
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0070;
    L_0x007f:
        r0 = r13.g();
        r1 = com.google.Q.a(r5);
        r3 = com.google.Q.a(r8);
        r0 = a(r0, r6, r1, r3, r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.g0.b(com.google.ds):com.google.am");
    }

    private static void a(ds dsVar, e3[][] e3VarArr) {
        int[] a = e3VarArr[0][1].a();
        int c = (dsVar.c() * dsVar.h()) - b(dsVar.g());
        if (a.length == 0) {
            if (c < 1 || c > 928) {
                throw aN.a();
            }
            e3VarArr[0][1].a(c);
            if (a == 0) {
                return;
            }
        }
        if (a[0] != c) {
            e3VarArr[0][1].a(c);
        }
    }

    private static e3[][] a(ds dsVar) {
        int i;
        int i2 = a;
        e3[][] e3VarArr = (e3[][]) Array.newInstance(e3.class, new int[]{dsVar.h(), dsVar.c() + 2});
        int i3 = 0;
        while (i3 < e3VarArr.length) {
            i = 0;
            while (i < e3VarArr[i3].length) {
                e3VarArr[i3][i] = new e3();
                i++;
                if (i2 != 0) {
                    break;
                }
            }
            i3++;
            if (i2 != 0) {
                break;
            }
        }
        gr[] i4 = dsVar.i();
        int length = i4.length;
        i = 0;
        int i5 = 0;
        while (i < length) {
            gr grVar = i4[i];
            if (grVar != null) {
                dv[] b = grVar.b();
                int length2 = b.length;
                i3 = 0;
                while (i3 < length2) {
                    dv dvVar = b[i3];
                    if (dvVar != null) {
                        int c = dvVar.c();
                        if (c >= 0) {
                            if (c >= e3VarArr.length) {
                                throw aG.a();
                            }
                            e3VarArr[c][i5].a(dvVar.f());
                        }
                    }
                    i3++;
                    if (i2 != 0) {
                        break;
                    }
                }
            }
            i5++;
            i3 = i + 1;
            if (i2 != 0) {
                break;
            }
            i = i3;
        }
        return e3VarArr;
    }

    private static int[] a(int i) {
        int i2 = a;
        int[] iArr = new int[8];
        int i3 = 0;
        int length = iArr.length - 1;
        do {
            if ((i & 1) != i3) {
                i3 = i & 1;
                length--;
                if (length < 0 && i2 == 0) {
                    break;
                }
            }
            iArr[length] = iArr[length] + 1;
            i >>= 1;
        } while (i2 == 0);
        return iArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] a(com.google.hX r9, int r10, int r11, boolean r12, int r13, int r14) {
        /*
        r1 = 1;
        r6 = 0;
        r7 = a;
        r0 = 8;
        r4 = new int[r0];
        if (r12 == 0) goto L_0x0043;
    L_0x000a:
        r0 = r1;
    L_0x000b:
        r5 = r12;
        r2 = r6;
        r3 = r13;
    L_0x000e:
        if (r12 == 0) goto L_0x0012;
    L_0x0010:
        if (r3 < r11) goto L_0x0016;
    L_0x0012:
        if (r12 != 0) goto L_0x002f;
    L_0x0014:
        if (r3 < r10) goto L_0x002f;
    L_0x0016:
        r8 = r4.length;
        if (r2 >= r8) goto L_0x002f;
    L_0x0019:
        r8 = r9.a(r3, r14);
        if (r8 != r5) goto L_0x0028;
    L_0x001f:
        r8 = r4[r2];
        r8 = r8 + 1;
        r4[r2] = r8;
        r3 = r3 + r0;
        if (r7 == 0) goto L_0x000e;
    L_0x0028:
        r2 = r2 + 1;
        if (r5 != 0) goto L_0x0045;
    L_0x002c:
        r5 = r1;
    L_0x002d:
        if (r7 == 0) goto L_0x000e;
    L_0x002f:
        r0 = r2;
        r1 = r3;
        r2 = r4.length;
        if (r0 == r2) goto L_0x0041;
    L_0x0034:
        if (r12 == 0) goto L_0x0038;
    L_0x0036:
        if (r1 == r11) goto L_0x003c;
    L_0x0038:
        if (r12 != 0) goto L_0x0047;
    L_0x003a:
        if (r1 != r10) goto L_0x0047;
    L_0x003c:
        r1 = r4.length;
        r1 = r1 + -1;
        if (r0 != r1) goto L_0x0047;
    L_0x0041:
        r0 = r4;
    L_0x0042:
        return r0;
    L_0x0043:
        r0 = -1;
        goto L_0x000b;
    L_0x0045:
        r5 = r6;
        goto L_0x002d;
    L_0x0047:
        r0 = 0;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.g0.a(com.google.hX, int, int, boolean, int, int):int[]");
    }

    private static W b(gR gRVar, gR gRVar2) {
        if (gRVar != null) {
            W b = gRVar.b();
            if (b != null) {
                if (gRVar2 != null) {
                    W b2 = gRVar2.b();
                    if (b2 != null) {
                        if (b.c() == b2.c() || b.a() == b2.a() || b.d() == b2.d()) {
                            return b;
                        }
                        return null;
                    }
                }
                return b;
            }
        }
        if (gRVar2 == null) {
            return null;
        }
        return gRVar2.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(com.google.hX r8, int r9, int r10, boolean r11, int r12, int r13) {
        /*
        r7 = 2;
        r1 = 1;
        r3 = 0;
        r6 = a;
        if (r11 == 0) goto L_0x0025;
    L_0x0007:
        r0 = -1;
    L_0x0008:
        r4 = r3;
        r2 = r0;
        r0 = r12;
    L_0x000b:
        if (r4 >= r7) goto L_0x0024;
    L_0x000d:
        if (r11 == 0) goto L_0x0011;
    L_0x000f:
        if (r0 >= r9) goto L_0x0015;
    L_0x0011:
        if (r11 != 0) goto L_0x002a;
    L_0x0013:
        if (r0 >= r10) goto L_0x002a;
    L_0x0015:
        r5 = r8.a(r0, r13);
        if (r11 != r5) goto L_0x002a;
    L_0x001b:
        r5 = r12 - r0;
        r5 = java.lang.Math.abs(r5);
        if (r5 <= r7) goto L_0x0027;
    L_0x0023:
        r0 = r12;
    L_0x0024:
        return r0;
    L_0x0025:
        r0 = r1;
        goto L_0x0008;
    L_0x0027:
        r0 = r0 + r2;
        if (r6 == 0) goto L_0x000d;
    L_0x002a:
        r5 = -r2;
        if (r11 != 0) goto L_0x0035;
    L_0x002d:
        r2 = r1;
    L_0x002e:
        r4 = r4 + 1;
        if (r6 != 0) goto L_0x0024;
    L_0x0032:
        r11 = r2;
        r2 = r5;
        goto L_0x000b;
    L_0x0035:
        r2 = r3;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.g0.b(com.google.hX, int, int, boolean, int, int):int");
    }

    private static int c(int i) {
        return b(a(i));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.gR a(com.google.hX r12, com.google.eP r13, com.google.fI r14, boolean r15, int r16, int r17) {
        /*
        r10 = a;
        r11 = new com.google.gR;
        r11.<init>(r13, r15);
        r0 = 0;
        r9 = r0;
    L_0x0009:
        r0 = 2;
        if (r9 >= r0) goto L_0x004d;
    L_0x000c:
        if (r9 != 0) goto L_0x004e;
    L_0x000e:
        r0 = 1;
        r8 = r0;
    L_0x0010:
        r0 = r14.a();
        r4 = (int) r0;
        r0 = r14.b();
        r5 = (int) r0;
    L_0x001a:
        r0 = r13.a();
        if (r5 > r0) goto L_0x0049;
    L_0x0020:
        r0 = r13.i();
        if (r5 < r0) goto L_0x0049;
    L_0x0026:
        r1 = 0;
        r2 = r12.c();
        r0 = r12;
        r3 = r15;
        r6 = r16;
        r7 = r17;
        r0 = a(r0, r1, r2, r3, r4, r5, r6, r7);
        if (r0 == 0) goto L_0x0046;
    L_0x0037:
        r11.a(r5, r0);
        if (r15 == 0) goto L_0x0042;
    L_0x003c:
        r4 = r0.g();
        if (r10 == 0) goto L_0x0046;
    L_0x0042:
        r4 = r0.e();
    L_0x0046:
        r5 = r5 + r8;
        if (r10 == 0) goto L_0x001a;
    L_0x0049:
        r0 = r9 + 1;
        if (r10 == 0) goto L_0x0051;
    L_0x004d:
        return r11;
    L_0x004e:
        r0 = -1;
        r8 = r0;
        goto L_0x0010;
    L_0x0051:
        r9 = r0;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.g0.a(com.google.hX, com.google.eP, com.google.fI, boolean, int, int):com.google.gR");
    }

    private static boolean a(ds dsVar, int i) {
        return i >= 0 && i <= dsVar.c() + 1;
    }

    private static am a(int[] iArr, int i, int[] iArr2) {
        if (iArr.length == 0) {
            throw aG.a();
        }
        int i2 = 1 << (i + 1);
        int a = a(iArr, iArr2, i2);
        a(iArr, i2);
        am a2 = fM.a(iArr, String.valueOf(i));
        a2.b(Integer.valueOf(a));
        a2.a(Integer.valueOf(iArr2.length));
        return a2;
    }

    static {
        b = new h0();
    }

    private static eP a(gR gRVar) {
        int i = a;
        if (gRVar == null) {
            return null;
        }
        int[] c = gRVar.c();
        if (c == null) {
            return null;
        }
        int a = a(c);
        int length = c.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = c[i2];
            i3 += a - i4;
            if (i4 > 0 && i == 0) {
                break;
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        dv[] b = gRVar.b();
        i2 = 0;
        while (i3 > 0 && b[i2] == null) {
            i3--;
            i2++;
            if (i != 0) {
                break;
            }
        }
        i2 = 0;
        int length2 = c.length - 1;
        while (length2 >= 0) {
            i2 += a - c[length2];
            if (c[length2] > 0 && i == 0) {
                break;
            }
            length2--;
            if (i != 0) {
                break;
            }
        }
        length2 = b.length - 1;
        while (i2 > 0 && b[length2] == null) {
            i2--;
            length2--;
            if (i != 0) {
                break;
            }
        }
        return gRVar.a().a(i3, i2, gRVar.a());
    }

    private static int a(int[] iArr) {
        int i = a;
        int length = iArr.length;
        int i2 = -1;
        int i3 = 0;
        while (i3 < length) {
            i2 = Math.max(i2, iArr[i3]);
            i3++;
            if (i != 0) {
                break;
            }
        }
        return i2;
    }

    private static void a(int[] iArr, int i) {
        if (iArr.length < 4) {
            throw aG.a();
        }
        int i2 = iArr[0];
        if (i2 > iArr.length) {
            throw aG.a();
        } else if (i2 == 0) {
            if (i < iArr.length) {
                iArr[0] = iArr.length - i;
                if (a == 0) {
                    return;
                }
            }
            throw aG.a();
        }
    }

    private static int b(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.am a(int r8, int[] r9, int[] r10, int[] r11, int[][] r12) {
        /*
        r1 = 0;
        r3 = a;
        r0 = r11.length;
        r4 = new int[r0];
        r0 = 100;
    L_0x0008:
        r2 = r0 + -1;
        if (r0 <= 0) goto L_0x005c;
    L_0x000c:
        r0 = r1;
    L_0x000d:
        r5 = r4.length;
        if (r0 >= r5) goto L_0x001e;
    L_0x0010:
        r5 = r11[r0];
        r6 = r12[r0];
        r7 = r4[r0];
        r6 = r6[r7];
        r9[r5] = r6;
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x000d;
    L_0x001e:
        r0 = a(r9, r8, r10);	 Catch:{ aC -> 0x0023 }
        return r0;
    L_0x0023:
        r0 = move-exception;
        r0 = r4.length;	 Catch:{ aC -> 0x002c }
        if (r0 != 0) goto L_0x002e;
    L_0x0027:
        r0 = com.google.aC.a();	 Catch:{ aC -> 0x002c }
        throw r0;	 Catch:{ aC -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = r1;
    L_0x002f:
        r5 = r4.length;
        if (r0 >= r5) goto L_0x005a;
    L_0x0032:
        r5 = r4[r0];	 Catch:{ aC -> 0x0052 }
        r6 = r12[r0];	 Catch:{ aC -> 0x0052 }
        r6 = r6.length;	 Catch:{ aC -> 0x0052 }
        r6 = r6 + -1;
        if (r5 >= r6) goto L_0x0043;
    L_0x003b:
        r5 = r4[r0];	 Catch:{ aC -> 0x0054 }
        r5 = r5 + 1;
        r4[r0] = r5;	 Catch:{ aC -> 0x0054 }
        if (r3 == 0) goto L_0x005a;
    L_0x0043:
        r5 = 0;
        r4[r0] = r5;	 Catch:{ aC -> 0x0050 }
        r5 = r4.length;	 Catch:{ aC -> 0x0050 }
        r5 = r5 + -1;
        if (r0 != r5) goto L_0x0056;
    L_0x004b:
        r0 = com.google.aC.a();	 Catch:{ aC -> 0x0050 }
        throw r0;	 Catch:{ aC -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ aC -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ aC -> 0x0050 }
    L_0x0056:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x002f;
    L_0x005a:
        if (r3 == 0) goto L_0x0061;
    L_0x005c:
        r0 = com.google.aC.a();
        throw r0;
    L_0x0061:
        r0 = r2;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.g0.a(int, int[], int[], int[], int[][]):com.google.am");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.am a(com.google.hX r16, com.google.fI r17, com.google.fI r18, com.google.fI r19, com.google.fI r20, int r21, int r22) {
        /*
        r14 = a;
        r0 = new com.google.eP;
        r1 = r16;
        r2 = r17;
        r3 = r18;
        r4 = r19;
        r5 = r20;
        r0.<init>(r1, r2, r3, r4, r5);
        r7 = 0;
        r6 = 0;
        r2 = 0;
        r1 = 0;
        r8 = r1;
        r1 = r0;
        r0 = r2;
        r2 = r7;
    L_0x0019:
        r3 = 2;
        if (r8 >= r3) goto L_0x0117;
    L_0x001c:
        if (r17 == 0) goto L_0x0114;
    L_0x001e:
        r3 = 1;
        r0 = r16;
        r2 = r17;
        r4 = r21;
        r5 = r22;
        r7 = a(r0, r1, r2, r3, r4, r5);
    L_0x002b:
        if (r19 == 0) goto L_0x0111;
    L_0x002d:
        r3 = 0;
        r0 = r16;
        r2 = r19;
        r4 = r21;
        r5 = r22;
        r0 = a(r0, r1, r2, r3, r4, r5);
    L_0x003a:
        r2 = a(r7, r0);
        if (r2 != 0) goto L_0x0045;
    L_0x0040:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0045:
        if (r8 != 0) goto L_0x006f;
    L_0x0047:
        r3 = r2.j();
        if (r3 == 0) goto L_0x006f;
    L_0x004d:
        r3 = r2.j();
        r3 = r3.i();
        r4 = r1.i();
        if (r3 < r4) goto L_0x0069;
    L_0x005b:
        r3 = r2.j();
        r3 = r3.a();
        r4 = r1.a();
        if (r3 <= r4) goto L_0x006f;
    L_0x0069:
        r1 = r2.j();
        if (r14 == 0) goto L_0x0074;
    L_0x006f:
        r2.a(r1);
        if (r14 == 0) goto L_0x0078;
    L_0x0074:
        r3 = r8 + 1;
        if (r14 == 0) goto L_0x011d;
    L_0x0078:
        r8 = r2;
        r9 = r1;
        r1 = r7;
    L_0x007b:
        r2 = r8.c();
        r15 = r2 + 1;
        r2 = 0;
        r8.a(r2, r1);
        r8.a(r15, r0);
        if (r1 == 0) goto L_0x0103;
    L_0x008a:
        r3 = 1;
    L_0x008b:
        r11 = 1;
        r7 = r22;
        r6 = r21;
    L_0x0090:
        if (r11 > r15) goto L_0x00fe;
    L_0x0092:
        if (r3 == 0) goto L_0x0105;
    L_0x0094:
        r10 = r11;
    L_0x0095:
        r0 = r8.a(r10);
        if (r0 == 0) goto L_0x009d;
    L_0x009b:
        if (r14 == 0) goto L_0x00fa;
    L_0x009d:
        if (r10 == 0) goto L_0x00a1;
    L_0x009f:
        if (r10 != r15) goto L_0x00ab;
    L_0x00a1:
        r1 = new com.google.gR;
        if (r10 != 0) goto L_0x0109;
    L_0x00a5:
        r0 = 1;
    L_0x00a6:
        r1.<init>(r9, r0);
        if (r14 == 0) goto L_0x010f;
    L_0x00ab:
        r0 = new com.google.gr;
        r0.<init>(r9);
        r12 = r0;
    L_0x00b1:
        r8.a(r10, r12);
        r0 = -1;
        r5 = r9.i();
        r13 = r0;
    L_0x00ba:
        r0 = r9.a();
        if (r5 > r0) goto L_0x00fa;
    L_0x00c0:
        r4 = a(r8, r10, r5, r3);
        if (r4 < 0) goto L_0x00cc;
    L_0x00c6:
        r0 = r9.f();
        if (r4 <= r0) goto L_0x00d2;
    L_0x00cc:
        r0 = -1;
        if (r13 != r0) goto L_0x00d1;
    L_0x00cf:
        if (r14 == 0) goto L_0x010d;
    L_0x00d1:
        r4 = r13;
    L_0x00d2:
        r1 = r9.d();
        r2 = r9.f();
        r0 = r16;
        r0 = a(r0, r1, r2, r3, r4, r5, r6, r7);
        if (r0 == 0) goto L_0x010d;
    L_0x00e2:
        r12.a(r5, r0);
        r1 = r0.h();
        r6 = java.lang.Math.min(r6, r1);
        r0 = r0.h();
        r7 = java.lang.Math.max(r7, r0);
        r0 = r4;
    L_0x00f6:
        r5 = r5 + 1;
        if (r14 == 0) goto L_0x010b;
    L_0x00fa:
        r11 = r11 + 1;
        if (r14 == 0) goto L_0x0090;
    L_0x00fe:
        r0 = b(r8);
        return r0;
    L_0x0103:
        r3 = 0;
        goto L_0x008b;
    L_0x0105:
        r0 = r15 - r11;
        r10 = r0;
        goto L_0x0095;
    L_0x0109:
        r0 = 0;
        goto L_0x00a6;
    L_0x010b:
        r13 = r0;
        goto L_0x00ba;
    L_0x010d:
        r0 = r13;
        goto L_0x00f6;
    L_0x010f:
        r12 = r1;
        goto L_0x00b1;
    L_0x0111:
        r0 = r6;
        goto L_0x003a;
    L_0x0114:
        r7 = r2;
        goto L_0x002b;
    L_0x0117:
        r8 = r0;
        r9 = r1;
        r1 = r2;
        r0 = r6;
        goto L_0x007b;
    L_0x011d:
        r8 = r3;
        r6 = r0;
        r0 = r2;
        r2 = r7;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.g0.a(com.google.hX, com.google.fI, com.google.fI, com.google.fI, com.google.fI, int, int):com.google.am");
    }

    private static ds a(gR gRVar, gR gRVar2) {
        if (gRVar == null && gRVar2 == null) {
            return null;
        }
        W b = b(gRVar, gRVar2);
        if (b != null) {
            return new ds(b, eP.a(a(gRVar), a(gRVar2)));
        }
        return null;
    }

    private static int a(ds dsVar, int i, int i2, boolean z) {
        int i3;
        int i4 = a;
        if (z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        dv dvVar = null;
        if (a(dsVar, i - i3)) {
            dvVar = dsVar.a(i - i3).c(i2);
        }
        if (dvVar == null) {
            dvVar = dsVar.a(i).b(i2);
            if (dvVar != null) {
                return z ? dvVar.g() : dvVar.e();
            } else {
                if (a(dsVar, i - i3)) {
                    dvVar = dsVar.a(i - i3).b(i2);
                }
                if (dvVar != null) {
                    return z ? dvVar.e() : dvVar.g();
                } else {
                    int i5 = 0;
                    while (a(dsVar, i - i3)) {
                        i -= i3;
                        dv[] b = dsVar.a(i).b();
                        int length = b.length;
                        int i6 = 0;
                        while (i6 < length) {
                            dv dvVar2 = b[i6];
                            if (dvVar2 == null) {
                                i6++;
                                if (i4 != 0) {
                                    break;
                                }
                            }
                            return ((i3 * i5) * (dvVar2.e() - dvVar2.g())) + (z ? dvVar2.e() : dvVar2.g());
                        }
                        i5++;
                        if (i4 != 0) {
                            break;
                        }
                    }
                    return z ? dsVar.j().d() : dsVar.j().f();
                }
            }
        } else if (z) {
            return dvVar.e();
        } else {
            return dvVar.g();
        }
    }

    private static boolean a(int i, int i2, int i3) {
        return i2 + -2 <= i && i <= i3 + 2;
    }

    private static dv a(hX hXVar, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        int i7 = a;
        int b = b(hXVar, i, i2, z, i3, i4);
        int[] a = a(hXVar, i, i2, z, b, i4);
        if (a == null) {
            return null;
        }
        int i8;
        int a2;
        int a3 = Q.a(a);
        if (z) {
            i8 = b + a3;
            if (i7 == 0) {
                int i9 = i8;
                i8 = b;
                b = i9;
                if (!a(a3, i5, i6)) {
                    return null;
                }
                a3 = fH.d(a);
                a2 = Q.a(a3);
                if (a2 != -1) {
                    return null;
                }
                return new dv(i8, b, c(a3), a2);
            }
        }
        i8 = 0;
        while (i8 < a.length / 2) {
            a2 = a[i8];
            a[i8] = a[(a.length - 1) - i8];
            a[(a.length - 1) - i8] = a2;
            i8++;
            if (i7 != 0) {
                break;
            }
        }
        i8 = b - a3;
        if (!a(a3, i5, i6)) {
            return null;
        }
        a3 = fH.d(a);
        a2 = Q.a(a3);
        if (a2 != -1) {
            return new dv(i8, b, c(a3), a2);
        }
        return null;
    }
}
