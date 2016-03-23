package com.google;

public class fI {
    public static int a;
    private final float b;
    private final float c;

    public fI(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public static float a(fI fIVar, fI fIVar2) {
        return h6.a(fIVar.b, fIVar.c, fIVar2.b, fIVar2.c);
    }

    public final float a() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(25);
        stringBuilder.append('(');
        stringBuilder.append(this.b);
        stringBuilder.append(',');
        stringBuilder.append(this.c);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    private static float a(fI fIVar, fI fIVar2, fI fIVar3) {
        float f = fIVar2.b;
        float f2 = fIVar2.c;
        return ((fIVar3.b - f) * (fIVar.c - f2)) - ((fIVar.b - f) * (fIVar3.c - f2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fI)) {
            return false;
        }
        fI fIVar = (fI) obj;
        if (this.b == fIVar.b && this.c == fIVar.c) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.google.fI[] r11) {
        /*
        r9 = 2;
        r2 = 1;
        r1 = 0;
        r5 = a;
        r0 = r11[r1];
        r3 = r11[r2];
        r6 = a(r0, r3);
        r0 = r11[r2];
        r3 = r11[r9];
        r7 = a(r0, r3);
        r0 = r11[r1];
        r3 = r11[r9];
        r8 = a(r0, r3);
        r0 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x0034;
    L_0x0021:
        r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r0 < 0) goto L_0x0034;
    L_0x0025:
        r3 = r11[r1];
        r4 = r11[r2];
        r0 = r11[r9];
        if (r5 == 0) goto L_0x004a;
    L_0x002d:
        r0 = com.google.aK.a;
        if (r0 == 0) goto L_0x005a;
    L_0x0031:
        r0 = r1;
    L_0x0032:
        com.google.aK.a = r0;
    L_0x0034:
        r0 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1));
        if (r0 < 0) goto L_0x0044;
    L_0x0038:
        r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x0044;
    L_0x003c:
        r3 = r11[r2];
        r4 = r11[r1];
        r0 = r11[r9];
        if (r5 == 0) goto L_0x004a;
    L_0x0044:
        r3 = r11[r9];
        r4 = r11[r1];
        r0 = r11[r2];
    L_0x004a:
        r5 = a(r4, r3, r0);
        r6 = 0;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x005c;
    L_0x0053:
        r11[r1] = r0;
        r11[r2] = r3;
        r11[r9] = r4;
        return;
    L_0x005a:
        r0 = r2;
        goto L_0x0032;
    L_0x005c:
        r10 = r0;
        r0 = r4;
        r4 = r10;
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fI.a(com.google.fI[]):void");
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c);
    }

    public final float b() {
        return this.c;
    }
}
