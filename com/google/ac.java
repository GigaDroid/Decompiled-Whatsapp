package com.google;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class ac extends a3 {
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    private static final int[] l;
    private static final int[] m;
    private static final int[][] n;
    private static final int[] o;
    private final List h;
    private final List p;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.fx a(com.google.d_ r16, com.google.e4 r17, boolean r18) {
        /*
        r15 = this;
        r6 = com.google.fx.a;
        r4 = r15.b();
        r1 = 0;
        r2 = 0;
        r4[r1] = r2;
        r1 = 1;
        r2 = 0;
        r4[r1] = r2;
        r1 = 2;
        r2 = 0;
        r4[r1] = r2;
        r1 = 3;
        r2 = 0;
        r4[r1] = r2;
        r1 = 4;
        r2 = 0;
        r4[r1] = r2;
        r1 = 5;
        r2 = 0;
        r4[r1] = r2;
        r1 = 6;
        r2 = 0;
        r4[r1] = r2;
        r1 = 7;
        r2 = 0;
        r4[r1] = r2;
        if (r18 == 0) goto L_0x0036;
    L_0x0028:
        r1 = r17.b();
        r2 = 0;
        r1 = r1[r2];
        r0 = r16;
        com.google.aU.b(r0, r1, r4);
        if (r6 == 0) goto L_0x0058;
    L_0x0036:
        r1 = r17.b();
        r2 = 1;
        r1 = r1[r2];
        r1 = r1 + 1;
        r0 = r16;
        com.google.aU.a(r0, r1, r4);
        r2 = 0;
        r1 = r4.length;
        r1 = r1 + -1;
    L_0x0048:
        if (r2 >= r1) goto L_0x0058;
    L_0x004a:
        r3 = r4[r2];
        r5 = r4[r1];
        r4[r2] = r5;
        r4[r1] = r3;
        r2 = r2 + 1;
        r1 = r1 + -1;
        if (r6 == 0) goto L_0x0048;
    L_0x0058:
        if (r18 == 0) goto L_0x00ef;
    L_0x005a:
        r1 = 16;
    L_0x005c:
        r2 = com.google.a3.a(r4);
        r2 = (float) r2;
        r3 = (float) r1;
        r5 = r2 / r3;
        r7 = r15.c();
        r8 = r15.f();
        r9 = r15.a();
        r10 = r15.e();
        r2 = 0;
    L_0x0075:
        r3 = r4.length;
        if (r2 >= r3) goto L_0x00a7;
    L_0x0078:
        r3 = r4[r2];
        r3 = (float) r3;
        r11 = r3 / r5;
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r3 = r3 + r11;
        r3 = (int) r3;
        r12 = 1;
        if (r3 >= r12) goto L_0x0087;
    L_0x0084:
        r3 = 1;
        if (r6 == 0) goto L_0x008d;
    L_0x0087:
        r12 = 8;
        if (r3 <= r12) goto L_0x008d;
    L_0x008b:
        r3 = 8;
    L_0x008d:
        r12 = r2 / 2;
        r13 = r2 & 1;
        if (r13 != 0) goto L_0x009c;
    L_0x0093:
        r7[r12] = r3;
        r13 = (float) r3;
        r13 = r11 - r13;
        r9[r12] = r13;
        if (r6 == 0) goto L_0x00a3;
    L_0x009c:
        r8[r12] = r3;
        r3 = (float) r3;
        r3 = r11 - r3;
        r10[r12] = r3;
    L_0x00a3:
        r2 = r2 + 1;
        if (r6 == 0) goto L_0x0075;
    L_0x00a7:
        r0 = r18;
        r15.a(r0, r1);
        r3 = 0;
        r2 = 0;
        r1 = r7.length;
        r1 = r1 + -1;
        r14 = r1;
        r1 = r2;
        r2 = r3;
        r3 = r14;
    L_0x00b5:
        if (r3 < 0) goto L_0x00c3;
    L_0x00b7:
        r1 = r1 * 9;
        r4 = r7[r3];
        r1 = r1 + r4;
        r4 = r7[r3];
        r2 = r2 + r4;
        r3 = r3 + -1;
        if (r6 == 0) goto L_0x00b5;
    L_0x00c3:
        r5 = 0;
        r4 = 0;
        r3 = r8.length;
        r3 = r3 + -1;
        r14 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r14;
    L_0x00cc:
        if (r5 < 0) goto L_0x00da;
    L_0x00ce:
        r4 = r4 * 9;
        r9 = r8[r5];
        r4 = r4 + r9;
        r9 = r8[r5];
        r3 = r3 + r9;
        r5 = r5 + -1;
        if (r6 == 0) goto L_0x00cc;
    L_0x00da:
        r4 = r4 * 3;
        r4 = r4 + r1;
        if (r18 == 0) goto L_0x0118;
    L_0x00df:
        r1 = r2 & 1;
        if (r1 != 0) goto L_0x00ea;
    L_0x00e3:
        r1 = 12;
        if (r2 > r1) goto L_0x00ea;
    L_0x00e7:
        r1 = 4;
        if (r2 >= r1) goto L_0x00f3;
    L_0x00ea:
        r1 = com.google.aN.a();
        throw r1;
    L_0x00ef:
        r1 = 15;
        goto L_0x005c;
    L_0x00f3:
        r1 = 12 - r2;
        r1 = r1 / 2;
        r2 = o;
        r2 = r2[r1];
        r3 = 9 - r2;
        r5 = 0;
        r2 = com.google.m.a(r7, r2, r5);
        r5 = 1;
        r3 = com.google.m.a(r8, r3, r5);
        r5 = j;
        r5 = r5[r1];
        r6 = l;
        r6 = r6[r1];
        r1 = new com.google.fx;
        r2 = r2 * r5;
        r2 = r2 + r3;
        r2 = r2 + r6;
        r1.<init>(r2, r4);
    L_0x0117:
        return r1;
    L_0x0118:
        r1 = r3 & 1;
        if (r1 != 0) goto L_0x0123;
    L_0x011c:
        r1 = 10;
        if (r3 > r1) goto L_0x0123;
    L_0x0120:
        r1 = 4;
        if (r3 >= r1) goto L_0x0128;
    L_0x0123:
        r1 = com.google.aN.a();
        throw r1;
    L_0x0128:
        r1 = 10 - r3;
        r1 = r1 / 2;
        r2 = k;
        r2 = r2[r1];
        r3 = 9 - r2;
        r5 = 1;
        r2 = com.google.m.a(r7, r2, r5);
        r5 = 0;
        r3 = com.google.m.a(r8, r3, r5);
        r5 = m;
        r5 = r5[r1];
        r6 = i;
        r6 = r6[r1];
        r1 = new com.google.fx;
        r3 = r3 * r5;
        r2 = r2 + r3;
        r2 = r2 + r6;
        r1.<init>(r2, r4);
        goto L_0x0117;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ac.a(com.google.d_, com.google.e4, boolean):com.google.fx");
    }

    private static boolean a(fg fgVar, fg fgVar2) {
        int b = (fgVar.b() + (fgVar2.b() * 16)) % 79;
        int c = (fgVar.e().c() * 9) + fgVar2.e().c();
        if (c > 72) {
            c--;
        }
        if (c > 8) {
            c--;
        }
        return b == c;
    }

    private static f6 b(fg fgVar, fg fgVar2) {
        int i = fx.a;
        String valueOf = String.valueOf((4537077 * ((long) fgVar.a())) + ((long) fgVar2.a()));
        StringBuilder stringBuilder = new StringBuilder(14);
        int length = 13 - valueOf.length();
        while (length > 0) {
            stringBuilder.append('0');
            length--;
            if (i != 0) {
                break;
            }
        }
        stringBuilder.append(valueOf);
        int i2 = 0;
        length = 0;
        while (i2 < 13) {
            int charAt = stringBuilder.charAt(i2) - 48;
            if ((i2 & 1) == 0) {
                charAt *= 3;
            }
            length += charAt;
            charAt = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = charAt;
        }
        length = 10 - (length % 10);
        if (length == 10) {
            length = 0;
        }
        stringBuilder.append(length);
        fI[] a = fgVar.e().a();
        fI[] a2 = fgVar2.e().a();
        return new f6(String.valueOf(stringBuilder.toString()), null, new fI[]{a[0], a[1], a2[0], a2[1]}, gg.RSS_14);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r12, int r13) {
        /*
        r11 = this;
        r6 = com.google.fx.a;
        r0 = r11.c();
        r7 = com.google.a3.a(r0);
        r0 = r11.f();
        r8 = com.google.a3.a(r0);
        r0 = r7 + r8;
        r9 = r0 - r13;
        r1 = r7 & 1;
        if (r12 == 0) goto L_0x0066;
    L_0x001a:
        r0 = 1;
    L_0x001b:
        if (r1 != r0) goto L_0x0068;
    L_0x001d:
        r0 = 1;
        r5 = r0;
    L_0x001f:
        r0 = r8 & 1;
        r1 = 1;
        if (r0 != r1) goto L_0x006b;
    L_0x0024:
        r0 = 1;
        r4 = r0;
    L_0x0026:
        r3 = 0;
        r2 = 0;
        r1 = 0;
        r0 = 0;
        if (r12 == 0) goto L_0x0044;
    L_0x002c:
        r10 = 12;
        if (r7 <= r10) goto L_0x0033;
    L_0x0030:
        r2 = 1;
        if (r6 == 0) goto L_0x0037;
    L_0x0033:
        r10 = 4;
        if (r7 >= r10) goto L_0x0037;
    L_0x0036:
        r3 = 1;
    L_0x0037:
        r10 = 12;
        if (r8 <= r10) goto L_0x003e;
    L_0x003b:
        r0 = 1;
        if (r6 == 0) goto L_0x005a;
    L_0x003e:
        r10 = 4;
        if (r8 >= r10) goto L_0x005a;
    L_0x0041:
        r1 = 1;
        if (r6 == 0) goto L_0x005a;
    L_0x0044:
        r10 = 11;
        if (r7 <= r10) goto L_0x004b;
    L_0x0048:
        r2 = 1;
        if (r6 == 0) goto L_0x004f;
    L_0x004b:
        r10 = 5;
        if (r7 >= r10) goto L_0x004f;
    L_0x004e:
        r3 = 1;
    L_0x004f:
        r10 = 10;
        if (r8 <= r10) goto L_0x0056;
    L_0x0053:
        r0 = 1;
        if (r6 == 0) goto L_0x005a;
    L_0x0056:
        r10 = 4;
        if (r8 >= r10) goto L_0x005a;
    L_0x0059:
        r1 = 1;
    L_0x005a:
        r10 = 1;
        if (r9 != r10) goto L_0x007b;
    L_0x005d:
        if (r5 == 0) goto L_0x0071;
    L_0x005f:
        if (r4 == 0) goto L_0x006e;
    L_0x0061:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0066:
        r0 = 0;
        goto L_0x001b;
    L_0x0068:
        r0 = 0;
        r5 = r0;
        goto L_0x001f;
    L_0x006b:
        r0 = 0;
        r4 = r0;
        goto L_0x0026;
    L_0x006e:
        r2 = 1;
        if (r6 == 0) goto L_0x00b5;
    L_0x0071:
        if (r4 != 0) goto L_0x0078;
    L_0x0073:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0078:
        r0 = 1;
        if (r6 == 0) goto L_0x00b5;
    L_0x007b:
        r10 = -1;
        if (r9 != r10) goto L_0x0094;
    L_0x007e:
        if (r5 == 0) goto L_0x008a;
    L_0x0080:
        if (r4 == 0) goto L_0x0087;
    L_0x0082:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0087:
        r3 = 1;
        if (r6 == 0) goto L_0x00b5;
    L_0x008a:
        if (r4 != 0) goto L_0x0091;
    L_0x008c:
        r0 = com.google.aN.a();
        throw r0;
    L_0x0091:
        r1 = 1;
        if (r6 == 0) goto L_0x00b5;
    L_0x0094:
        if (r9 != 0) goto L_0x00b0;
    L_0x0096:
        if (r5 == 0) goto L_0x00a9;
    L_0x0098:
        if (r4 != 0) goto L_0x009f;
    L_0x009a:
        r0 = com.google.aN.a();
        throw r0;
    L_0x009f:
        if (r7 >= r8) goto L_0x00a5;
    L_0x00a1:
        r3 = 1;
        r0 = 1;
        if (r6 == 0) goto L_0x00b5;
    L_0x00a5:
        r2 = 1;
        r1 = 1;
        if (r6 == 0) goto L_0x00b5;
    L_0x00a9:
        if (r4 == 0) goto L_0x00b5;
    L_0x00ab:
        r0 = com.google.aN.a();
        throw r0;
    L_0x00b0:
        r0 = com.google.aN.a();
        throw r0;
    L_0x00b5:
        if (r3 == 0) goto L_0x00c9;
    L_0x00b7:
        if (r2 == 0) goto L_0x00be;
    L_0x00b9:
        r0 = com.google.aN.a();
        throw r0;
    L_0x00be:
        r3 = r11.c();
        r4 = r11.a();
        com.google.a3.b(r3, r4);
    L_0x00c9:
        if (r2 == 0) goto L_0x00d6;
    L_0x00cb:
        r2 = r11.c();
        r3 = r11.a();
        com.google.a3.a(r2, r3);
    L_0x00d6:
        if (r1 == 0) goto L_0x00ea;
    L_0x00d8:
        if (r0 == 0) goto L_0x00df;
    L_0x00da:
        r0 = com.google.aN.a();
        throw r0;
    L_0x00df:
        r1 = r11.f();
        r2 = r11.a();
        com.google.a3.b(r1, r2);
    L_0x00ea:
        if (r0 == 0) goto L_0x00f7;
    L_0x00ec:
        r0 = r11.f();
        r1 = r11.e();
        com.google.a3.a(r0, r1);
    L_0x00f7:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ac.a(boolean, int):void");
    }

    private fg a(d_ d_Var, boolean z, int i, Map map) {
        try {
            dB dBVar;
            int[] a = a(d_Var, 0, z);
            e4 a2 = a(d_Var, i, z, a);
            if (map == null) {
                dBVar = null;
            } else {
                dBVar = (dB) map.get(b3.NEED_RESULT_POINT_CALLBACK);
            }
            if (dBVar != null) {
                float f = ((float) (a[0] + a[1])) / 2.0f;
                if (z) {
                    f = ((float) (d_Var.d() - 1)) - f;
                }
                dBVar.a(new fI(f, (float) i));
            }
            fx a3 = a(d_Var, a2, true);
            fx a4 = a(d_Var, a2, false);
            return new fg((a3.a() * 1597) + a4.a(), a3.b() + (a4.b() * 4), a2);
        } catch (aN e) {
            return null;
        }
    }

    public f6 a(int i, d_ d_Var, Map map) {
        int i2 = fx.a;
        a(this.p, a(d_Var, false, i, map));
        d_Var.b();
        a(this.h, a(d_Var, true, i, map));
        d_Var.b();
        int size = this.p.size();
        int i3 = 0;
        while (i3 < size) {
            fg fgVar = (fg) this.p.get(i3);
            if (fgVar.c() > 1) {
                int size2 = this.h.size();
                int i4 = 0;
                while (i4 < size2) {
                    fg fgVar2 = (fg) this.h.get(i4);
                    if (fgVar2.c() > 1 && a(fgVar, fgVar2)) {
                        return b(fgVar, fgVar2);
                    }
                    int i5 = i4 + 1;
                    if (i2 != 0) {
                        boolean z;
                        if (aK.a) {
                            z = false;
                        } else {
                            z = true;
                        }
                        aK.a = z;
                    } else {
                        i4 = i5;
                    }
                }
            }
            int i6 = i3 + 1;
            if (i2 != 0) {
                break;
            }
            i3 = i6;
        }
        throw aN.a();
    }

    public ac() {
        this.p = new ArrayList();
        this.h = new ArrayList();
    }

    static {
        j = new int[]{1, 10, 34, 70, 126};
        m = new int[]{4, 20, 48, 81};
        l = new int[]{0, 161, 961, 2015, 2715};
        i = new int[]{0, 336, 1036, 1516};
        o = new int[]{8, 6, 4, 3, 1};
        k = new int[]{2, 4, 6, 8};
        n = new int[][]{new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};
    }

    private static void a(Collection collection, fg fgVar) {
        int i = fx.a;
        if (fgVar != null) {
            Object obj;
            Object obj2 = null;
            for (fg fgVar2 : collection) {
                if (fgVar2.a() == fgVar.a()) {
                    fgVar2.d();
                    obj = 1;
                    if (i == 0) {
                        break;
                    }
                }
                obj = obj2;
                if (i != 0) {
                    break;
                }
                obj2 = obj;
            }
            obj = obj2;
            if (obj == null) {
                collection.add(fgVar);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] a(com.google.d_ r11, int r12, boolean r13) {
        /*
        r10 = this;
        r4 = com.google.fx.a;
        r5 = r10.d();
        r0 = 0;
        r1 = 0;
        r5[r0] = r1;
        r0 = 1;
        r1 = 0;
        r5[r0] = r1;
        r0 = 2;
        r1 = 0;
        r5[r0] = r1;
        r0 = 3;
        r1 = 0;
        r5[r0] = r1;
        r6 = r11.d();
        r0 = 0;
        r1 = r12;
    L_0x001c:
        if (r1 >= r6) goto L_0x002d;
    L_0x001e:
        r0 = r11.f(r1);
        if (r0 != 0) goto L_0x0057;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        if (r13 != r0) goto L_0x0029;
    L_0x0027:
        if (r4 == 0) goto L_0x002d;
    L_0x0029:
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x001c;
    L_0x002d:
        r2 = 0;
        r3 = r1;
        r9 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r9;
    L_0x0033:
        if (r3 >= r6) goto L_0x0085;
    L_0x0035:
        r7 = r11.f(r3);
        r7 = r7 ^ r2;
        if (r7 == 0) goto L_0x0044;
    L_0x003c:
        r7 = r5[r1];
        r7 = r7 + 1;
        r5[r1] = r7;
        if (r4 == 0) goto L_0x0081;
    L_0x0044:
        r7 = 3;
        if (r1 != r7) goto L_0x0079;
    L_0x0047:
        r7 = com.google.a3.b(r5);
        if (r7 == 0) goto L_0x0059;
    L_0x004d:
        r1 = 2;
        r1 = new int[r1];
        r2 = 0;
        r1[r2] = r0;
        r0 = 1;
        r1[r0] = r3;
        return r1;
    L_0x0057:
        r0 = 0;
        goto L_0x0025;
    L_0x0059:
        r7 = 0;
        r7 = r5[r7];
        r8 = 1;
        r8 = r5[r8];
        r7 = r7 + r8;
        r0 = r0 + r7;
        r7 = 0;
        r8 = 2;
        r8 = r5[r8];
        r5[r7] = r8;
        r7 = 1;
        r8 = 3;
        r8 = r5[r8];
        r5[r7] = r8;
        r7 = 2;
        r8 = 0;
        r5[r7] = r8;
        r7 = 3;
        r8 = 0;
        r5[r7] = r8;
        r1 = r1 + -1;
        if (r4 == 0) goto L_0x007b;
    L_0x0079:
        r1 = r1 + 1;
    L_0x007b:
        r7 = 1;
        r5[r1] = r7;
        if (r2 != 0) goto L_0x008a;
    L_0x0080:
        r2 = 1;
    L_0x0081:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0033;
    L_0x0085:
        r0 = com.google.aN.a();
        throw r0;
    L_0x008a:
        r2 = 0;
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ac.a(com.google.d_, int, boolean):int[]");
    }

    public void a() {
        this.p.clear();
        this.h.clear();
    }

    private e4 a(d_ d_Var, int i, boolean z, int[] iArr) {
        int d;
        int i2 = fx.a;
        boolean f = d_Var.f(iArr[0]);
        int i3 = iArr[0] - 1;
        while (i3 >= 0 && (d_Var.f(i3) ^ f) != 0) {
            i3--;
            if (i2 != 0) {
                break;
            }
        }
        int i4 = i3 + 1;
        i3 = iArr[0] - i4;
        Object d2 = d();
        System.arraycopy(d2, 0, d2, 1, d2.length - 1);
        d2[0] = i3;
        i2 = a3.a((int[]) d2, n);
        int i5 = iArr[1];
        if (z) {
            d = (d_Var.d() - 1) - i4;
            i5 = (d_Var.d() - 1) - i5;
        } else {
            d = i4;
        }
        return new e4(i2, new int[]{i4, iArr[1]}, d, i5, i);
    }
}
