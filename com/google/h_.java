package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class h_ {
    public static boolean e;
    private final int[] a;
    private final hX b;
    private boolean c;
    private final dB d;
    private final List f;

    private boolean b(int i, int i2, int i3, int i4) {
        boolean z = e;
        int[] c = c();
        int i5 = 0;
        while (i >= i5 && i2 >= i5 && this.b.a(i2 - i5, i - i5)) {
            c[2] = c[2] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (i < i5 || i2 < i5) {
            return false;
        }
        while (i >= i5 && i2 >= i5 && !this.b.a(i2 - i5, i - i5) && c[1] <= i3) {
            c[1] = c[1] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (i < i5 || i2 < i5 || c[1] > i3) {
            return false;
        }
        while (i >= i5 && i2 >= i5 && this.b.a(i2 - i5, i - i5) && c[0] <= i3) {
            c[0] = c[0] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (c[0] > i3) {
            return false;
        }
        int g = this.b.g();
        int c2 = this.b.c();
        i5 = 1;
        while (i + i5 < g && i2 + i5 < c2 && this.b.a(i2 + i5, i + i5)) {
            c[2] = c[2] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (i + i5 >= g || i2 + i5 >= c2) {
            return false;
        }
        while (i + i5 < g && i2 + i5 < c2 && !this.b.a(i2 + i5, i + i5) && c[3] < i3) {
            c[3] = c[3] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (i + i5 >= g || i2 + i5 >= c2 || c[3] >= i3) {
            return false;
        }
        while (i + i5 < g && i2 + i5 < c2 && this.b.a(i2 + i5, i + i5) && c[4] < i3) {
            c[4] = c[4] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (c[4] >= i3) {
            return false;
        }
        return Math.abs(((((c[0] + c[1]) + c[2]) + c[3]) + c[4]) - i4) < i4 * 2 && a(c);
    }

    private int b() {
        boolean z = e;
        if (this.f.size() <= 1) {
            return 0;
        }
        fI fIVar = null;
        for (fI fIVar2 : this.f) {
            if (fIVar2.a() >= 2) {
                if (fIVar == null) {
                    if (z) {
                        fIVar = fIVar2;
                    } else {
                        fIVar = fIVar2;
                        continue;
                    }
                }
                this.c = true;
                return ((int) (Math.abs(fIVar.a() - fIVar2.a()) - Math.abs(fIVar.b() - fIVar2.b()))) / 2;
            }
            if (z) {
                break;
            }
        }
        return 0;
    }

    private fV[] d() {
        float f = 0.0f;
        boolean z = e;
        int size = this.f.size();
        if (size < 3) {
            throw aN.a();
        }
        if (size > 3) {
            float c;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (fV c2 : this.f) {
                c = c2.c();
                f3 += c;
                c = (c * c) + f2;
                if (z) {
                    break;
                }
                f2 = c;
            }
            c = f2;
            f3 /= (float) size;
            c = (float) Math.sqrt((double) ((c / ((float) size)) - (f3 * f3)));
            Collections.sort(this.f, new bV(f3, null));
            float max = Math.max(0.2f * f3, c);
            int i = 0;
            while (i < this.f.size() && this.f.size() > 3) {
                if (Math.abs(((fV) this.f.get(i)).c() - f3) > max) {
                    this.f.remove(i);
                    i--;
                }
                int i2 = i + 1;
                if (z) {
                    break;
                }
                i = i2;
            }
        }
        if (this.f.size() > 3) {
            for (fV c22 : this.f) {
                f += c22.c();
                if (z) {
                    break;
                }
            }
            Collections.sort(this.f, new eX(f / ((float) this.f.size()), null));
            this.f.subList(3, this.f.size()).clear();
        }
        return new fV[]{(fV) this.f.get(0), (fV) this.f.get(1), (fV) this.f.get(2)};
    }

    protected static boolean a(int[] iArr) {
        boolean z = true;
        boolean z2 = e;
        int i = 0;
        int i2 = 0;
        while (i < 5) {
            int i3 = iArr[i];
            if (i3 != 0) {
                i2 += i3;
                i++;
                if (z2) {
                    break;
                }
            }
            return false;
        }
        if (i2 < 7) {
            return false;
        }
        float f = ((float) i2) / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - ((float) iArr[0])) >= f2 || Math.abs(f - ((float) iArr[1])) >= f2 || Math.abs((3.0f * f) - ((float) iArr[2])) >= 3.0f * f2 || Math.abs(f - ((float) iArr[3])) >= f2 || Math.abs(f - ((float) iArr[4])) >= f2) {
            z = false;
        }
        return z;
    }

    private float a(int i, int i2, int i3, int i4) {
        boolean z = e;
        hX hXVar = this.b;
        int g = hXVar.g();
        int[] c = c();
        int i5 = i;
        while (i5 >= 0 && hXVar.a(i2, i5)) {
            c[2] = c[2] + 1;
            i5--;
            if (z) {
                break;
            }
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !hXVar.a(i2, i5) && c[1] <= i3) {
            c[1] = c[1] + 1;
            i5--;
            if (z) {
                break;
            }
        }
        if (i5 < 0 || c[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && hXVar.a(i2, i5) && c[0] <= i3) {
            c[0] = c[0] + 1;
            i5--;
            if (z) {
                break;
            }
        }
        if (c[0] > i3) {
            return Float.NaN;
        }
        i5 = i + 1;
        while (i5 < g && hXVar.a(i2, i5)) {
            c[2] = c[2] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (i5 == g) {
            return Float.NaN;
        }
        while (i5 < g && !hXVar.a(i2, i5) && c[3] < i3) {
            c[3] = c[3] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (i5 == g || c[3] >= i3) {
            return Float.NaN;
        }
        while (i5 < g && hXVar.a(i2, i5) && c[4] < i3) {
            c[4] = c[4] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (c[4] >= i3) {
            return Float.NaN;
        }
        if (Math.abs(((((c[0] + c[1]) + c[2]) + c[3]) + c[4]) - i4) * 5 >= i4 * 2) {
            return Float.NaN;
        }
        return a(c) ? a(c, i5) : Float.NaN;
    }

    private int[] c() {
        this.a[0] = 0;
        this.a[1] = 0;
        this.a[2] = 0;
        this.a[3] = 0;
        this.a[4] = 0;
        return this.a;
    }

    protected final boolean a(int[] iArr, int i, int i2, boolean z) {
        boolean z2 = e;
        int i3 = (((iArr[0] + iArr[1]) + iArr[2]) + iArr[3]) + iArr[4];
        float a = a(iArr, i2);
        float a2 = a(i, (int) a, iArr[2], i3);
        if (Float.isNaN(a2)) {
            return false;
        }
        float c = c((int) a, (int) a2, iArr[2], i3);
        if (Float.isNaN(c)) {
            return false;
        }
        if (z && !b((int) a2, (int) c, iArr[2], i3)) {
            return false;
        }
        float f = ((float) i3) / 7.0f;
        i3 = 0;
        int i4 = false;
        while (i3 < this.f.size()) {
            fV fVVar = (fV) this.f.get(i3);
            if (fVVar.b(f, a2, c)) {
                this.f.set(i3, fVVar.a(a2, c, f));
                if (!z2) {
                    i4 = 1;
                    break;
                }
                i4 = true;
            }
            int i5 = i3 + 1;
            if (z2) {
                break;
            }
            i3 = i5;
        }
        if (i4 == 0) {
            fI fVVar2 = new fV(c, a2, f);
            this.f.add(fVVar2);
            if (this.d != null) {
                this.d.a(fVVar2);
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final com.google.eu a(java.util.Map r14) {
        /*
        r13 = this;
        r6 = e;
        if (r14 == 0) goto L_0x013d;
    L_0x0004:
        r0 = com.google.b3.TRY_HARDER;
        r0 = r14.containsKey(r0);
        if (r0 == 0) goto L_0x013d;
    L_0x000c:
        r0 = 1;
        r2 = r0;
    L_0x000e:
        if (r14 == 0) goto L_0x0141;
    L_0x0010:
        r0 = com.google.b3.PURE_BARCODE;
        r0 = r14.containsKey(r0);
        if (r0 == 0) goto L_0x0141;
    L_0x0018:
        r0 = 1;
    L_0x0019:
        r1 = r13.b;
        r7 = r1.g();
        r1 = r13.b;
        r8 = r1.c();
        r1 = r7 * 3;
        r1 = r1 / 228;
        r3 = 3;
        if (r1 < r3) goto L_0x002e;
    L_0x002c:
        if (r2 == 0) goto L_0x002f;
    L_0x002e:
        r1 = 3;
    L_0x002f:
        r2 = 0;
        r3 = 5;
        r9 = new int[r3];
        r4 = r1 + -1;
        r5 = r1;
    L_0x0036:
        if (r4 >= r7) goto L_0x0127;
    L_0x0038:
        if (r2 != 0) goto L_0x0127;
    L_0x003a:
        r1 = 0;
        r3 = 0;
        r9[r1] = r3;
        r1 = 1;
        r3 = 0;
        r9[r1] = r3;
        r1 = 2;
        r3 = 0;
        r9[r1] = r3;
        r1 = 3;
        r3 = 0;
        r9[r1] = r3;
        r1 = 4;
        r3 = 0;
        r9[r1] = r3;
        r1 = 0;
        r3 = 0;
    L_0x0050:
        if (r3 >= r8) goto L_0x010d;
    L_0x0052:
        r10 = r13.b;
        r10 = r10.a(r3, r4);
        if (r10 == 0) goto L_0x0069;
    L_0x005a:
        r10 = r1 & 1;
        r11 = 1;
        if (r10 != r11) goto L_0x0061;
    L_0x005f:
        r1 = r1 + 1;
    L_0x0061:
        r10 = r9[r1];
        r10 = r10 + 1;
        r9[r1] = r10;
        if (r6 == 0) goto L_0x0109;
    L_0x0069:
        r10 = r1 & 1;
        if (r10 != 0) goto L_0x0103;
    L_0x006d:
        r10 = 4;
        if (r1 != r10) goto L_0x00f9;
    L_0x0070:
        r1 = a(r9);
        if (r1 == 0) goto L_0x0162;
    L_0x0076:
        r1 = r13.a(r9, r4, r3, r0);
        if (r1 == 0) goto L_0x015c;
    L_0x007c:
        r5 = 2;
        r1 = r13.c;
        if (r1 == 0) goto L_0x0159;
    L_0x0081:
        r1 = r13.a();
        if (r6 == 0) goto L_0x00c2;
    L_0x0087:
        r2 = r13.b();
        r10 = 2;
        r10 = r9[r10];
        if (r2 <= r10) goto L_0x0155;
    L_0x0090:
        r3 = 2;
        r3 = r9[r3];
        r2 = r2 - r3;
        r2 = r2 - r5;
        r3 = r4 + r2;
        r2 = r8 + -1;
    L_0x0099:
        if (r6 == 0) goto L_0x0151;
    L_0x009b:
        r4 = r5;
        r12 = r3;
        r3 = r1;
        r1 = r2;
        r2 = r12;
    L_0x00a0:
        r5 = 0;
        r10 = 2;
        r10 = r9[r10];
        r9[r5] = r10;
        r5 = 1;
        r10 = 3;
        r10 = r9[r10];
        r9[r5] = r10;
        r5 = 2;
        r10 = 4;
        r10 = r9[r10];
        r9[r5] = r10;
        r5 = 3;
        r10 = 1;
        r9[r5] = r10;
        r5 = 4;
        r10 = 0;
        r9[r5] = r10;
        r5 = 3;
        if (r6 == 0) goto L_0x014a;
    L_0x00bd:
        r5 = r4;
        r4 = r2;
        r12 = r3;
        r3 = r1;
        r1 = r12;
    L_0x00c2:
        r2 = 0;
        r10 = 0;
        r11 = 0;
        r9[r10] = r11;
        r10 = 1;
        r11 = 0;
        r9[r10] = r11;
        r10 = 2;
        r11 = 0;
        r9[r10] = r11;
        r10 = 3;
        r11 = 0;
        r9[r10] = r11;
        r10 = 4;
        r11 = 0;
        r9[r10] = r11;
        if (r6 == 0) goto L_0x0146;
    L_0x00d9:
        r2 = 0;
        r10 = 2;
        r10 = r9[r10];
        r9[r2] = r10;
        r2 = 1;
        r10 = 3;
        r10 = r9[r10];
        r9[r2] = r10;
        r2 = 2;
        r10 = 4;
        r10 = r9[r10];
        r9[r2] = r10;
        r2 = 3;
        r10 = 1;
        r9[r2] = r10;
        r2 = 4;
        r10 = 0;
        r9[r2] = r10;
        r2 = 3;
        if (r6 == 0) goto L_0x0146;
    L_0x00f6:
        r12 = r2;
        r2 = r1;
        r1 = r12;
    L_0x00f9:
        r1 = r1 + 1;
        r10 = r9[r1];
        r10 = r10 + 1;
        r9[r1] = r10;
        if (r6 == 0) goto L_0x0109;
    L_0x0103:
        r10 = r9[r1];
        r10 = r10 + 1;
        r9[r1] = r10;
    L_0x0109:
        r3 = r3 + 1;
        if (r6 == 0) goto L_0x0050;
    L_0x010d:
        r1 = a(r9);
        if (r1 == 0) goto L_0x0124;
    L_0x0113:
        r1 = r13.a(r9, r4, r8, r0);
        if (r1 == 0) goto L_0x0124;
    L_0x0119:
        r1 = 0;
        r5 = r9[r1];
        r1 = r13.c;
        if (r1 == 0) goto L_0x0124;
    L_0x0120:
        r2 = r13.a();
    L_0x0124:
        r4 = r4 + r5;
        if (r6 == 0) goto L_0x0036;
    L_0x0127:
        r0 = r13.d();
        com.google.fI.a(r0);
        r1 = new com.google.eu;
        r1.<init>(r0);
        r0 = com.google.aK.a;
        if (r0 == 0) goto L_0x013c;
    L_0x0137:
        if (r6 == 0) goto L_0x0144;
    L_0x0139:
        r0 = 0;
    L_0x013a:
        e = r0;
    L_0x013c:
        return r1;
    L_0x013d:
        r0 = 0;
        r2 = r0;
        goto L_0x000e;
    L_0x0141:
        r0 = 0;
        goto L_0x0019;
    L_0x0144:
        r0 = 1;
        goto L_0x013a;
    L_0x0146:
        r12 = r2;
        r2 = r1;
        r1 = r12;
        goto L_0x0109;
    L_0x014a:
        r12 = r1;
        r1 = r5;
        r5 = r4;
        r4 = r2;
        r2 = r3;
        r3 = r12;
        goto L_0x0109;
    L_0x0151:
        r4 = r3;
        r3 = r2;
        goto L_0x00c2;
    L_0x0155:
        r2 = r3;
        r3 = r4;
        goto L_0x0099;
    L_0x0159:
        r1 = r2;
        goto L_0x0087;
    L_0x015c:
        r1 = r3;
        r3 = r2;
        r2 = r4;
        r4 = r5;
        goto L_0x00a0;
    L_0x0162:
        r1 = r2;
        goto L_0x00d9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.h_.a(java.util.Map):com.google.eu");
    }

    private static float a(int[] iArr, int i) {
        return ((float) ((i - iArr[4]) - iArr[3])) - (((float) iArr[2]) / 2.0f);
    }

    public h_(hX hXVar, dB dBVar) {
        this.b = hXVar;
        this.f = new ArrayList();
        this.a = new int[5];
        this.d = dBVar;
    }

    private float c(int i, int i2, int i3, int i4) {
        boolean z = e;
        hX hXVar = this.b;
        int c = hXVar.c();
        int[] c2 = c();
        int i5 = i;
        while (i5 >= 0 && hXVar.a(i5, i2)) {
            c2[2] = c2[2] + 1;
            i5--;
            if (z) {
                break;
            }
        }
        if (i5 < 0) {
            return Float.NaN;
        }
        while (i5 >= 0 && !hXVar.a(i5, i2) && c2[1] <= i3) {
            c2[1] = c2[1] + 1;
            i5--;
            if (z) {
                break;
            }
        }
        if (i5 < 0 || c2[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && hXVar.a(i5, i2) && c2[0] <= i3) {
            c2[0] = c2[0] + 1;
            i5--;
            if (z) {
                break;
            }
        }
        if (c2[0] > i3) {
            return Float.NaN;
        }
        i5 = i + 1;
        while (i5 < c && hXVar.a(i5, i2)) {
            c2[2] = c2[2] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (i5 == c) {
            return Float.NaN;
        }
        while (i5 < c && !hXVar.a(i5, i2) && c2[3] < i3) {
            c2[3] = c2[3] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (i5 == c || c2[3] >= i3) {
            return Float.NaN;
        }
        while (i5 < c && hXVar.a(i5, i2) && c2[4] < i3) {
            c2[4] = c2[4] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (c2[4] >= i3) {
            return Float.NaN;
        }
        if (Math.abs(((((c2[0] + c2[1]) + c2[2]) + c2[3]) + c2[4]) - i4) * 5 >= i4) {
            return Float.NaN;
        }
        return a(c2) ? a(c2, i5) : Float.NaN;
    }

    private boolean a() {
        float f = 0.0f;
        boolean z = e;
        int size = this.f.size();
        float f2 = 0.0f;
        int i = 0;
        for (fV fVVar : this.f) {
            float c;
            int i2;
            if (fVVar.a() >= 2) {
                c = fVVar.c() + f2;
                i2 = i + 1;
            } else {
                c = f2;
                i2 = i;
            }
            if (z) {
                i = i2;
                f2 = c;
                break;
            }
            i = i2;
            f2 = c;
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / ((float) size);
        for (fV fVVar2 : this.f) {
            f += Math.abs(fVVar2.c() - f3);
            if (z) {
                break;
            }
        }
        if (f <= 0.05f * f2) {
            return true;
        }
        return false;
    }
}
