package com.google;

import java.util.ArrayList;
import java.util.List;

final class ed {
    private final hX a;
    private final int b;
    private final int c;
    private final List d;
    private final float e;
    private final int[] f;
    private final int g;
    private final dB h;
    private final int i;

    private float a(int i, int i2, int i3, int i4) {
        boolean z = h_.e;
        hX hXVar = this.a;
        int g = hXVar.g();
        int[] iArr = this.f;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && hXVar.a(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5--;
            if (z) {
                break;
            }
        }
        if (i5 < 0 || iArr[1] > i3) {
            return Float.NaN;
        }
        while (i5 >= 0 && !hXVar.a(i2, i5) && iArr[0] <= i3) {
            iArr[0] = iArr[0] + 1;
            i5--;
            if (z) {
                break;
            }
        }
        if (iArr[0] > i3) {
            return Float.NaN;
        }
        i5 = i + 1;
        while (i5 < g && hXVar.a(i2, i5) && iArr[1] <= i3) {
            iArr[1] = iArr[1] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (i5 == g || iArr[1] > i3) {
            return Float.NaN;
        }
        while (i5 < g && !hXVar.a(i2, i5) && iArr[2] <= i3) {
            iArr[2] = iArr[2] + 1;
            i5++;
            if (z) {
                break;
            }
        }
        if (iArr[2] > i3 || Math.abs(((iArr[0] + iArr[1]) + iArr[2]) - i4) * 5 >= i4 * 2) {
            return Float.NaN;
        }
        return a(iArr) ? a(iArr, i5) : Float.NaN;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.google.fa a() {
        /*
        r14 = this;
        r13 = 2;
        r1 = 1;
        r2 = 0;
        r6 = com.google.h_.e;
        r4 = r14.g;
        r7 = r14.i;
        r0 = r14.b;
        r8 = r4 + r0;
        r0 = r14.c;
        r3 = r7 / 2;
        r9 = r0 + r3;
        r0 = 3;
        r10 = new int[r0];
        r5 = r2;
    L_0x0017:
        if (r5 >= r7) goto L_0x0096;
    L_0x0019:
        r0 = r5 & 1;
        if (r0 != 0) goto L_0x005d;
    L_0x001d:
        r0 = r5 + 1;
        r0 = r0 / 2;
    L_0x0021:
        r11 = r9 + r0;
        r10[r2] = r2;
        r10[r1] = r2;
        r10[r13] = r2;
        r0 = r4;
    L_0x002a:
        if (r0 >= r8) goto L_0x0038;
    L_0x002c:
        r3 = r14.a;
        r3 = r3.a(r0, r11);
        if (r3 != 0) goto L_0x0038;
    L_0x0034:
        r0 = r0 + 1;
        if (r6 == 0) goto L_0x002a;
    L_0x0038:
        r3 = r0;
        r0 = r2;
    L_0x003a:
        if (r3 >= r8) goto L_0x0086;
    L_0x003c:
        r12 = r14.a;
        r12 = r12.a(r3, r11);
        if (r12 == 0) goto L_0x0078;
    L_0x0044:
        if (r0 != r1) goto L_0x004e;
    L_0x0046:
        r12 = r10[r0];
        r12 = r12 + 1;
        r10[r0] = r12;
        if (r6 == 0) goto L_0x0082;
    L_0x004e:
        if (r0 != r13) goto L_0x006e;
    L_0x0050:
        r0 = r14.a(r10);
        if (r0 == 0) goto L_0x0063;
    L_0x0056:
        r0 = r14.a(r10, r11, r3);
        if (r0 == 0) goto L_0x0063;
    L_0x005c:
        return r0;
    L_0x005d:
        r0 = r5 + 1;
        r0 = r0 / 2;
        r0 = -r0;
        goto L_0x0021;
    L_0x0063:
        r0 = r10[r13];
        r10[r2] = r0;
        r10[r1] = r1;
        r10[r13] = r2;
        if (r6 == 0) goto L_0x00af;
    L_0x006d:
        r0 = r1;
    L_0x006e:
        r0 = r0 + 1;
        r12 = r10[r0];
        r12 = r12 + 1;
        r10[r0] = r12;
        if (r6 == 0) goto L_0x0082;
    L_0x0078:
        if (r0 != r1) goto L_0x007c;
    L_0x007a:
        r0 = r0 + 1;
    L_0x007c:
        r12 = r10[r0];
        r12 = r12 + 1;
        r10[r0] = r12;
    L_0x0082:
        r3 = r3 + 1;
        if (r6 == 0) goto L_0x003a;
    L_0x0086:
        r0 = r14.a(r10);
        if (r0 == 0) goto L_0x0092;
    L_0x008c:
        r0 = r14.a(r10, r11, r8);
        if (r0 != 0) goto L_0x005c;
    L_0x0092:
        r0 = r5 + 1;
        if (r6 == 0) goto L_0x00ac;
    L_0x0096:
        r0 = r14.d;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00a7;
    L_0x009e:
        r0 = r14.d;
        r0 = r0.get(r2);
        r0 = (com.google.fa) r0;
        goto L_0x005c;
    L_0x00a7:
        r0 = com.google.aN.a();
        throw r0;
    L_0x00ac:
        r5 = r0;
        goto L_0x0017;
    L_0x00af:
        r0 = r1;
        goto L_0x0082;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ed.a():com.google.fa");
    }

    private static float a(int[] iArr, int i) {
        return ((float) (i - iArr[2])) - (((float) iArr[1]) / 2.0f);
    }

    private boolean a(int[] iArr) {
        boolean z = h_.e;
        float f = this.e;
        float f2 = f / 2.0f;
        int i = 0;
        while (i < 3) {
            if (Math.abs(f - ((float) iArr[i])) < f2) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    private fa a(int[] iArr, int i, int i2) {
        boolean z = h_.e;
        int i3 = (iArr[0] + iArr[1]) + iArr[2];
        float a = a(iArr, i2);
        float a2 = a(i, (int) a, iArr[1] * 2, i3);
        if (!Float.isNaN(a2)) {
            float f = ((float) ((iArr[0] + iArr[1]) + iArr[2])) / 3.0f;
            for (fa faVar : this.d) {
                if (!faVar.a(f, a2, a)) {
                    if (z) {
                        break;
                    }
                }
                return faVar.b(a2, a, f);
            }
            fI faVar2 = new fa(a, a2, f);
            this.d.add(faVar2);
            if (this.h != null) {
                this.h.a(faVar2);
            }
        }
        return null;
    }

    ed(hX hXVar, int i, int i2, int i3, int i4, float f, dB dBVar) {
        this.a = hXVar;
        this.d = new ArrayList(5);
        this.g = i;
        this.c = i2;
        this.b = i3;
        this.i = i4;
        this.e = f;
        this.f = new int[3];
        this.h = dBVar;
    }
}
