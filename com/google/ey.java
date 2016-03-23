package com.google;

import org.v;
import org.whispersystems.at;

final class ey {
    private static final String[] z;
    private final int[] a;
    private final eF b;

    static {
        String[] strArr = new String[6];
        String str = "z~q";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = 85;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 94;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "zxq";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0017:532/&\u0001)2#&q\"1z;>2~24'#~)4<#~\u0017:532/&\u0016\u0000~<<4*:";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0017:532/&\u0001)2#&q\"1z;>2~24'#~)4<#~\u0017:532/&\u0016\u0000~<<4*:";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0017:532/&\u0001)2#&q\"1z;>2~24'#~)4<#~\u0017:532/&\u0016\u0000~<<4*:";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\"\u000b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    int b(int i) {
        int i2;
        int i3 = 0;
        boolean z = eF.e;
        if (i != 0) {
            int length = this.a.length;
            if (i != 1) {
                i2 = this.a[0];
                i3 = 1;
                while (i3 < length) {
                    i2 = this.b.a(this.b.c(i, i2), this.a[i3]);
                    i3++;
                    if (z) {
                        break;
                    }
                }
            }
            int[] iArr = this.a;
            int length2 = iArr.length;
            i2 = 0;
            while (i3 < length2) {
                i2 = this.b.a(i2, iArr[i3]);
                i3++;
                if (z) {
                    break;
                }
            }
        }
        try {
            i2 = c(0);
        } catch (IllegalArgumentException e) {
            throw e;
        }
        return i2;
    }

    ey a(int i) {
        boolean z = eF.e;
        if (i == 0) {
            try {
                return this.b.b();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i == 1) {
            return this;
        } else {
            int length = this.a.length;
            int[] iArr = new int[length];
            int i2 = 0;
            while (i2 < length) {
                iArr[i2] = this.b.c(this.a[i2], i);
                i2++;
                if (z) {
                    break;
                }
            }
            return new ey(this.b, iArr);
        }
    }

    ey c(ey eyVar) {
        try {
            if (this.b.equals(eyVar.b)) {
                try {
                    if (eyVar.a()) {
                        return this;
                    }
                    return b(eyVar.b());
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(z[4]);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    ey a(int i, int i2) {
        boolean z = eF.e;
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.b.b();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int length = this.a.length;
            int[] iArr = new int[(length + i)];
            int i3 = 0;
            while (i3 < length) {
                iArr[i3] = this.b.c(this.a[i3], i2);
                i3++;
                if (z) {
                    break;
                }
            }
            return new ey(this.b, iArr);
        }
    }

    ey b(ey eyVar) {
        boolean z = eF.e;
        try {
            if (this.b.equals(eyVar.b)) {
                try {
                    if (a()) {
                        return eyVar;
                    }
                    try {
                        if (eyVar.a()) {
                            return this;
                        }
                        Object obj = this.a;
                        Object obj2 = eyVar.a;
                        if (obj.length <= obj2.length) {
                            Object obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        }
                        Object obj4 = new int[obj.length];
                        int length = obj.length - r1.length;
                        System.arraycopy(obj, 0, obj4, 0, length);
                        int i = length;
                        while (i < obj.length) {
                            obj4[i] = this.b.a(r1[i - length], obj[i]);
                            i++;
                            if (z) {
                                break;
                            }
                        }
                        return new ey(this.b, obj4);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            throw new IllegalArgumentException(z[3]);
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.google.ey b() {
        /*
        r7 = this;
        r0 = 0;
        r2 = com.google.eF.e;
        r1 = r7.a;
        r3 = r1.length;
        r4 = new int[r3];
        r1 = r0;
    L_0x0009:
        if (r1 >= r3) goto L_0x001b;
    L_0x000b:
        r5 = r7.b;
        r6 = r7.a;
        r6 = r6[r1];
        r5 = r5.b(r0, r6);
        r4[r1] = r5;
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0009;
    L_0x001b:
        r1 = new com.google.ey;	 Catch:{ IllegalArgumentException -> 0x002b }
        r3 = r7.b;	 Catch:{ IllegalArgumentException -> 0x002b }
        r1.<init>(r3, r4);	 Catch:{ IllegalArgumentException -> 0x002b }
        r3 = com.google.aK.a;	 Catch:{ IllegalArgumentException -> 0x002b }
        if (r3 == 0) goto L_0x002a;
    L_0x0026:
        if (r2 == 0) goto L_0x002f;
    L_0x0028:
        com.google.eF.e = r0;
    L_0x002a:
        return r1;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = 1;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ey.b():com.google.ey");
    }

    int c() {
        return this.a.length - 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r7 = this;
        r6 = 1;
        r2 = com.google.eF.e;
        r3 = new java.lang.StringBuilder;
        r0 = r7.c();
        r0 = r0 * 8;
        r3.<init>(r0);
        r0 = r7.c();
        r1 = r0;
    L_0x0013:
        if (r1 < 0) goto L_0x0057;
    L_0x0015:
        r0 = r7.c(r1);
        if (r0 == 0) goto L_0x0053;
    L_0x001b:
        if (r0 >= 0) goto L_0x0028;
    L_0x001d:
        r4 = z;
        r5 = 2;
        r4 = r4[r5];
        r3.append(r4);
        r0 = -r0;
        if (r2 == 0) goto L_0x0036;
    L_0x0028:
        r4 = r3.length();	 Catch:{ IllegalArgumentException -> 0x005c }
        if (r4 <= 0) goto L_0x0036;
    L_0x002e:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x005c }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x005c }
        r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x005c }
    L_0x0036:
        if (r1 == 0) goto L_0x003a;
    L_0x0038:
        if (r0 == r6) goto L_0x003d;
    L_0x003a:
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x005e }
    L_0x003d:
        if (r1 == 0) goto L_0x0053;
    L_0x003f:
        if (r1 != r6) goto L_0x0048;
    L_0x0041:
        r0 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x0060 }
        if (r2 == 0) goto L_0x0053;
    L_0x0048:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0060 }
        r4 = 1;
        r0 = r0[r4];	 Catch:{ IllegalArgumentException -> 0x0060 }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x0060 }
        r3.append(r1);	 Catch:{ IllegalArgumentException -> 0x0060 }
    L_0x0053:
        r0 = r1 + -1;
        if (r2 == 0) goto L_0x0062;
    L_0x0057:
        r0 = r3.toString();
        return r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r1 = r0;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ey.toString():java.lang.String");
    }

    ey a(ey eyVar) {
        boolean z = eF.e;
        try {
            if (this.b.equals(eyVar.b)) {
                try {
                    if (!a()) {
                        if (!eyVar.a()) {
                            int[] iArr = this.a;
                            int length = iArr.length;
                            int[] iArr2 = eyVar.a;
                            int length2 = iArr2.length;
                            int[] iArr3 = new int[((length + length2) - 1)];
                            int i = 0;
                            while (i < length) {
                                int i2 = iArr[i];
                                int i3 = 0;
                                while (i3 < length2) {
                                    iArr3[i + i3] = this.b.a(iArr3[i + i3], this.b.c(i2, iArr2[i3]));
                                    i3++;
                                    if (z) {
                                        break;
                                    }
                                }
                                i3 = i + 1;
                                if (z) {
                                    break;
                                }
                                i = i3;
                            }
                            return new ey(this.b, iArr3);
                        }
                    }
                    return this.b.b();
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            throw new IllegalArgumentException(z[5]);
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    ey(eF eFVar, int[] iArr) {
        int i = 1;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.b = eFVar;
        int length = iArr.length;
        if (length > 1) {
            try {
                if (iArr[0] == 0) {
                    while (i < length) {
                        try {
                            if (iArr[i] != 0) {
                                break;
                            }
                            i++;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    if (i == length) {
                        try {
                            this.a = new int[]{0};
                            return;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    this.a = new int[(length - i)];
                    System.arraycopy(iArr, i, this.a, 0, this.a.length);
                    return;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        this.a = iArr;
    }

    boolean a() {
        try {
            return this.a[0] == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    int c(int i) {
        return this.a[(this.a.length - 1) - i];
    }
}
