package com.google;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

final class ht {
    private static final String[] z;
    private final aj a;
    private final int[] b;

    static {
        String[] strArr = new String[8];
        String str = "K\u0012/}{e\u0014\u0006^Yc\u001b8k)h\u0018avfxW)y\u007fiW2ydiW\u0006}gi\u0005({NJW'ql`\u0013";
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
                        i3 = 12;
                        break;
                    case at.g /*1*/:
                        i3 = 119;
                        break;
                    case at.i /*2*/:
                        i3 = 65;
                        break;
                    case at.o /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "m)";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "t)";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ",\\a";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ",Za";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "K\u0012/}{e\u0014\u0006^Yc\u001b8k)h\u0018avfxW)y\u007fiW2ydiW\u0006}gi\u0005({NJW'ql`\u0013";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "H\u001e7qmiW#a)<";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "K\u0012/}{e\u0014\u0006^Yc\u001b8k)h\u0018avfxW)y\u007fiW2ydiW\u0006}gi\u0005({NJW'ql`\u0013";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    ht[] b(ht htVar) {
        int i = aj.l;
        try {
            if (this.a.equals(htVar.a)) {
                try {
                    if (htVar.c()) {
                        throw new IllegalArgumentException(z[7]);
                    }
                    ht b = this.a.b();
                    int b2 = this.a.b(htVar.c(htVar.a()));
                    ht htVar2 = b;
                    b = this;
                    while (b.a() >= htVar.a() && !b.c()) {
                        int a = b.a() - htVar.a();
                        int b3 = this.a.b(b.c(b.a()), b2);
                        ht a2 = htVar.a(a, b3);
                        htVar2 = htVar2.c(this.a.a(a, b3));
                        b = b.c(a2);
                        if (i != 0) {
                            break;
                        }
                    }
                    try {
                        ht[] htVarArr = new ht[]{htVar2, b};
                        if (aK.a) {
                            aj.l = i + 1;
                        }
                        return htVarArr;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            throw new IllegalArgumentException(z[6]);
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    int c(int i) {
        return this.b[(this.b.length - 1) - i];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        r7 = this;
        r6 = 1;
        r2 = com.google.aj.l;
        r3 = new java.lang.StringBuilder;
        r0 = r7.a();
        r0 = r0 * 8;
        r3.<init>(r0);
        r0 = r7.a();
        r1 = r0;
    L_0x0013:
        if (r1 < 0) goto L_0x0077;
    L_0x0015:
        r0 = r7.c(r1);
        if (r0 == 0) goto L_0x0073;
    L_0x001b:
        if (r0 >= 0) goto L_0x0028;
    L_0x001d:
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r3.append(r4);
        r0 = -r0;
        if (r2 == 0) goto L_0x0036;
    L_0x0028:
        r4 = r3.length();	 Catch:{ IllegalArgumentException -> 0x007c }
        if (r4 <= 0) goto L_0x0036;
    L_0x002e:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x007c }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x007c }
        r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x007c }
    L_0x0036:
        if (r1 == 0) goto L_0x003a;
    L_0x0038:
        if (r0 == r6) goto L_0x005d;
    L_0x003a:
        r4 = r7.a;
        r0 = r4.a(r0);
        if (r0 != 0) goto L_0x0049;
    L_0x0042:
        r4 = 49;
        r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x007e }
        if (r2 == 0) goto L_0x005d;
    L_0x0049:
        if (r0 != r6) goto L_0x0052;
    L_0x004b:
        r4 = 97;
        r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0082 }
        if (r2 == 0) goto L_0x005d;
    L_0x0052:
        r4 = z;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ IllegalArgumentException -> 0x0082 }
        r3.append(r4);	 Catch:{ IllegalArgumentException -> 0x0082 }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x005d:
        if (r1 == 0) goto L_0x0073;
    L_0x005f:
        if (r1 != r6) goto L_0x0068;
    L_0x0061:
        r0 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x0084 }
        if (r2 == 0) goto L_0x0073;
    L_0x0068:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x0084 }
        r4 = 3;
        r0 = r0[r4];	 Catch:{ IllegalArgumentException -> 0x0084 }
        r3.append(r0);	 Catch:{ IllegalArgumentException -> 0x0084 }
        r3.append(r1);	 Catch:{ IllegalArgumentException -> 0x0084 }
    L_0x0073:
        r0 = r1 + -1;
        if (r2 == 0) goto L_0x0086;
    L_0x0077:
        r0 = r3.toString();
        return r0;
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r1 = r0;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ht.toString():java.lang.String");
    }

    boolean c() {
        try {
            return this.b[0] == 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    ht(aj ajVar, int[] iArr) {
        int i = 1;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = ajVar;
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
                            this.b = new int[]{0};
                            return;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    this.b = new int[(length - i)];
                    System.arraycopy(iArr, i, this.b, 0, this.b.length);
                    return;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        this.b = iArr;
    }

    int a(int i) {
        int i2;
        int i3 = 0;
        int i4 = aj.l;
        if (i != 0) {
            int length = this.b.length;
            if (i != 1) {
                i2 = this.b[0];
                i3 = 1;
                while (i3 < length) {
                    i2 = aj.c(this.a.b(i, i2), this.b[i3]);
                    i3++;
                    if (i4 != 0) {
                        break;
                    }
                }
            }
            int[] iArr = this.b;
            int length2 = iArr.length;
            i2 = 0;
            while (i3 < length2) {
                i2 = aj.c(i2, iArr[i3]);
                i3++;
                if (i4 != 0) {
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

    ht a(int i, int i2) {
        int i3 = aj.l;
        if (i < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i2 == 0) {
            try {
                return this.a.b();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            int length = this.b.length;
            int[] iArr = new int[(length + i)];
            int i4 = 0;
            while (i4 < length) {
                iArr[i4] = this.a.b(this.b[i4], i2);
                i4++;
                if (i3 != 0) {
                    break;
                }
            }
            return new ht(this.a, iArr);
        }
    }

    ht b(int i) {
        int i2 = aj.l;
        if (i == 0) {
            try {
                return this.a.b();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (i == 1) {
            return this;
        } else {
            int length = this.b.length;
            int[] iArr = new int[length];
            int i3 = 0;
            while (i3 < length) {
                iArr[i3] = this.a.b(this.b[i3], i);
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            return new ht(this.a, iArr);
        }
    }

    int a() {
        return this.b.length - 1;
    }

    ht a(ht htVar) {
        int i = aj.l;
        try {
            if (this.a.equals(htVar.a)) {
                try {
                    if (!c()) {
                        if (!htVar.c()) {
                            int[] iArr = this.b;
                            int length = iArr.length;
                            int[] iArr2 = htVar.b;
                            int length2 = iArr2.length;
                            int[] iArr3 = new int[((length + length2) - 1)];
                            int i2 = 0;
                            while (i2 < length) {
                                int i3 = iArr[i2];
                                int i4 = 0;
                                while (i4 < length2) {
                                    iArr3[i2 + i4] = aj.c(iArr3[i2 + i4], this.a.b(i3, iArr2[i4]));
                                    i4++;
                                    if (i != 0) {
                                        break;
                                    }
                                }
                                i4 = i2 + 1;
                                if (i != 0) {
                                    break;
                                }
                                i2 = i4;
                            }
                            return new ht(this.a, iArr3);
                        }
                    }
                    return this.a.b();
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            throw new IllegalArgumentException(z[0]);
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    int[] b() {
        return this.b;
    }

    ht c(ht htVar) {
        int i = aj.l;
        try {
            if (this.a.equals(htVar.a)) {
                try {
                    if (c()) {
                        return htVar;
                    }
                    try {
                        if (htVar.c()) {
                            return this;
                        }
                        Object obj = this.b;
                        Object obj2 = htVar.b;
                        if (obj.length <= obj2.length) {
                            Object obj3 = obj2;
                            obj2 = obj;
                            obj = obj3;
                        }
                        Object obj4 = new int[obj.length];
                        int length = obj.length - r1.length;
                        System.arraycopy(obj, 0, obj4, 0, length);
                        int i2 = length;
                        while (i2 < obj.length) {
                            obj4[i2] = aj.c(r1[i2 - length], obj[i2]);
                            i2++;
                            if (i != 0) {
                                break;
                            }
                        }
                        return new ht(this.a, obj4);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            throw new IllegalArgumentException(z[1]);
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }
}
