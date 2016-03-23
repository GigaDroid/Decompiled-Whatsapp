package com.google;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import org.v;
import org.whispersystems.at;

public final class ak extends AbstractMap implements Serializable {
    static final boolean d;
    private static final Comparator g;
    public static boolean i;
    private static final String[] z;
    int a;
    int b;
    int c;
    private gM e;
    c2[] f;
    private fJ h;
    final c2 j;
    Comparator k;

    private void b(c2 c2Var) {
        int i = 0;
        c2 c2Var2 = c2Var.h;
        c2 c2Var3 = c2Var.a;
        c2 c2Var4 = c2Var2.h;
        c2 c2Var5 = c2Var2.a;
        try {
            c2Var.h = c2Var5;
            if (c2Var5 != null) {
                c2Var5.b = c2Var;
            }
            try {
                int i2;
                a(c2Var, c2Var2);
                c2Var2.a = c2Var;
                c2Var.b = c2Var2;
                int i3 = c2Var3 != null ? c2Var3.i : 0;
                if (c2Var5 != null) {
                    try {
                        i2 = c2Var5.i;
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                i2 = 0;
                try {
                    c2Var.i = Math.max(i3, i2) + 1;
                    i2 = c2Var.i;
                    if (c2Var4 != null) {
                        i = c2Var4.i;
                    }
                    c2Var2.i = Math.max(i2, i) + 1;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            } catch (NullPointerException e22) {
                throw e22;
            }
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.google.c2 r12, boolean r13) {
        /*
        r11 = this;
        r10 = 1;
        r9 = -1;
        r1 = 0;
        r5 = i;
    L_0x0005:
        if (r12 == 0) goto L_0x00d4;
    L_0x0007:
        r6 = r12.h;
        r7 = r12.a;
        if (r6 == 0) goto L_0x0042;
    L_0x000d:
        r0 = r6.i;	 Catch:{ NullPointerException -> 0x0040 }
    L_0x000f:
        if (r7 == 0) goto L_0x0046;
    L_0x0011:
        r2 = r7.i;	 Catch:{ NullPointerException -> 0x0044 }
        r4 = r2;
    L_0x0014:
        r8 = r0 - r4;
        r2 = -2;
        if (r8 != r2) goto L_0x0060;
    L_0x0019:
        r3 = r7.h;
        r2 = r7.a;
        if (r2 == 0) goto L_0x004a;
    L_0x001f:
        r2 = r2.i;	 Catch:{ NullPointerException -> 0x0048 }
    L_0x0021:
        if (r3 == 0) goto L_0x004e;
    L_0x0023:
        r3 = r3.i;	 Catch:{ NullPointerException -> 0x004c }
    L_0x0025:
        r2 = r3 - r2;
        if (r2 == r9) goto L_0x002d;
    L_0x0029:
        if (r2 != 0) goto L_0x0032;
    L_0x002b:
        if (r13 != 0) goto L_0x0032;
    L_0x002d:
        r11.a(r12);	 Catch:{ NullPointerException -> 0x0050 }
        if (r5 == 0) goto L_0x005a;
    L_0x0032:
        r3 = d;	 Catch:{ NullPointerException -> 0x0052 }
        if (r3 != 0) goto L_0x0054;
    L_0x0036:
        if (r2 == r10) goto L_0x0054;
    L_0x0038:
        r0 = new java.lang.AssertionError;	 Catch:{ NullPointerException -> 0x003e }
        r0.<init>();	 Catch:{ NullPointerException -> 0x003e }
        throw r0;	 Catch:{ NullPointerException -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = r1;
        goto L_0x000f;
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r4 = r1;
        goto L_0x0014;
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r2 = r1;
        goto L_0x0021;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r3 = r1;
        goto L_0x0025;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003e }
    L_0x0054:
        r11.b(r7);
        r11.a(r12);
    L_0x005a:
        if (r13 == 0) goto L_0x005e;
    L_0x005c:
        if (r5 == 0) goto L_0x00d4;
    L_0x005e:
        if (r5 == 0) goto L_0x00d0;
    L_0x0060:
        r2 = 2;
        if (r8 != r2) goto L_0x00a2;
    L_0x0063:
        r3 = r6.h;
        r2 = r6.a;
        if (r2 == 0) goto L_0x008c;
    L_0x0069:
        r2 = r2.i;	 Catch:{ NullPointerException -> 0x008a }
    L_0x006b:
        if (r3 == 0) goto L_0x0090;
    L_0x006d:
        r3 = r3.i;	 Catch:{ NullPointerException -> 0x008e }
    L_0x006f:
        r2 = r3 - r2;
        if (r2 == r10) goto L_0x0077;
    L_0x0073:
        if (r2 != 0) goto L_0x007c;
    L_0x0075:
        if (r13 != 0) goto L_0x007c;
    L_0x0077:
        r11.b(r12);	 Catch:{ NullPointerException -> 0x0092 }
        if (r5 == 0) goto L_0x009c;
    L_0x007c:
        r3 = d;	 Catch:{ NullPointerException -> 0x0094 }
        if (r3 != 0) goto L_0x0096;
    L_0x0080:
        if (r2 == r9) goto L_0x0096;
    L_0x0082:
        r0 = new java.lang.AssertionError;	 Catch:{ NullPointerException -> 0x0088 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x0088 }
        throw r0;	 Catch:{ NullPointerException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r2 = r1;
        goto L_0x006b;
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        r3 = r1;
        goto L_0x006f;
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0088 }
    L_0x0096:
        r11.a(r6);
        r11.b(r12);
    L_0x009c:
        if (r13 == 0) goto L_0x00a0;
    L_0x009e:
        if (r5 == 0) goto L_0x00d4;
    L_0x00a0:
        if (r5 == 0) goto L_0x00d0;
    L_0x00a2:
        if (r8 != 0) goto L_0x00ac;
    L_0x00a4:
        r2 = r0 + 1;
        r12.i = r2;	 Catch:{ NullPointerException -> 0x00bc }
        if (r13 == 0) goto L_0x00d0;
    L_0x00aa:
        if (r5 == 0) goto L_0x00d4;
    L_0x00ac:
        r2 = d;	 Catch:{ NullPointerException -> 0x00c0 }
        if (r2 != 0) goto L_0x00c4;
    L_0x00b0:
        if (r8 == r9) goto L_0x00c4;
    L_0x00b2:
        if (r8 == r10) goto L_0x00c4;
    L_0x00b4:
        r0 = new java.lang.AssertionError;	 Catch:{ NullPointerException -> 0x00ba }
        r0.<init>();	 Catch:{ NullPointerException -> 0x00ba }
        throw r0;	 Catch:{ NullPointerException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c2 }
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00ba }
    L_0x00c4:
        r0 = java.lang.Math.max(r0, r4);	 Catch:{ NullPointerException -> 0x00d5 }
        r0 = r0 + 1;
        r12.i = r0;	 Catch:{ NullPointerException -> 0x00d5 }
        if (r13 != 0) goto L_0x00d0;
    L_0x00ce:
        if (r5 == 0) goto L_0x00d4;
    L_0x00d0:
        r12 = r12.b;
        if (r5 == 0) goto L_0x0005;
    L_0x00d4:
        return;
    L_0x00d5:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ak.a(com.google.c2, boolean):void");
    }

    public int size() {
        return this.a;
    }

    public boolean containsKey(Object obj) {
        try {
            return a(obj) != null;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private static int a(int i) {
        int i2 = ((i >>> 20) ^ (i >>> 12)) ^ i;
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    static c2[] a(c2[] c2VarArr) {
        boolean z = i;
        int length = c2VarArr.length;
        c2[] c2VarArr2 = new c2[(length * 2)];
        a_ a_Var = new a_();
        hG hGVar = new hG();
        hG hGVar2 = new hG();
        int i = 0;
        while (i < length) {
            int i2;
            c2 c2Var = c2VarArr[i];
            if (c2Var != null || z) {
                c2 a;
                a_Var.a(c2Var);
                i2 = 0;
                int i3 = 0;
                while (true) {
                    c2 a2 = a_Var.a();
                    if (a2 == null) {
                        break;
                    }
                    try {
                        if ((a2.d & length) == 0) {
                            i3++;
                            if (!z) {
                                continue;
                            }
                        }
                        i2++;
                        if (z) {
                            break;
                        }
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                hGVar.a(i3);
                hGVar2.a(i2);
                a_Var.a(c2Var);
                while (true) {
                    c2Var = a_Var.a();
                    if (c2Var == null) {
                        break;
                    }
                    try {
                        if ((c2Var.d & length) == 0) {
                            hGVar.a(c2Var);
                            if (!z) {
                                continue;
                            }
                        }
                        hGVar2.a(c2Var);
                        if (z) {
                            break;
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                }
                if (i3 > 0) {
                    try {
                        a = hGVar.a();
                    } catch (NullPointerException e22) {
                        throw e22;
                    }
                }
                a = null;
                try {
                    c2 a3;
                    c2VarArr2[i] = a;
                    i3 = i + length;
                    if (i2 > 0) {
                        a3 = hGVar2.a();
                    } else {
                        a3 = null;
                    }
                    c2VarArr2[i3] = a3;
                } catch (NullPointerException e222) {
                    throw e222;
                }
            }
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return c2VarArr2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void b(com.google.c2 r7, boolean r8) {
        /*
        r6 = this;
        r2 = 0;
        r5 = 0;
        r0 = i;
        if (r8 == 0) goto L_0x0017;
    L_0x0006:
        r1 = r7.c;	 Catch:{ NullPointerException -> 0x0052 }
        r3 = r7.f;	 Catch:{ NullPointerException -> 0x0052 }
        r1.f = r3;	 Catch:{ NullPointerException -> 0x0052 }
        r1 = r7.f;	 Catch:{ NullPointerException -> 0x0052 }
        r3 = r7.c;	 Catch:{ NullPointerException -> 0x0052 }
        r1.c = r3;	 Catch:{ NullPointerException -> 0x0052 }
        r1 = 0;
        r7.c = r1;	 Catch:{ NullPointerException -> 0x0052 }
        r7.f = r1;	 Catch:{ NullPointerException -> 0x0052 }
    L_0x0017:
        r1 = r7.h;
        r3 = r7.a;
        r4 = r7.b;
        if (r1 == 0) goto L_0x005b;
    L_0x001f:
        if (r3 == 0) goto L_0x005b;
    L_0x0021:
        r0 = r1.i;	 Catch:{ NullPointerException -> 0x0054 }
        r4 = r3.i;	 Catch:{ NullPointerException -> 0x0054 }
        if (r0 <= r4) goto L_0x0056;
    L_0x0027:
        r0 = r1.a();	 Catch:{ NullPointerException -> 0x0054 }
    L_0x002b:
        r6.b(r0, r2);
        r3 = r7.h;
        if (r3 == 0) goto L_0x0098;
    L_0x0032:
        r1 = r3.i;
        r0.h = r3;
        r3.b = r0;
        r7.h = r5;
    L_0x003a:
        r3 = r7.a;
        if (r3 == 0) goto L_0x0046;
    L_0x003e:
        r2 = r3.i;
        r0.a = r3;
        r3.b = r0;
        r7.a = r5;
    L_0x0046:
        r1 = java.lang.Math.max(r1, r2);
        r1 = r1 + 1;
        r0.i = r1;
        r6.a(r7, r0);
    L_0x0051:
        return;
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r0 = r3.b();
        goto L_0x002b;
    L_0x005b:
        if (r1 == 0) goto L_0x0065;
    L_0x005d:
        r6.a(r7, r1);	 Catch:{ NullPointerException -> 0x008c }
        r1 = 0;
        r7.h = r1;	 Catch:{ NullPointerException -> 0x008c }
        if (r0 == 0) goto L_0x0073;
    L_0x0065:
        if (r3 == 0) goto L_0x006f;
    L_0x0067:
        r6.a(r7, r3);	 Catch:{ NullPointerException -> 0x0090 }
        r1 = 0;
        r7.a = r1;	 Catch:{ NullPointerException -> 0x0090 }
        if (r0 == 0) goto L_0x0073;
    L_0x006f:
        r1 = 0;
        r6.a(r7, r1);	 Catch:{ NullPointerException -> 0x0090 }
    L_0x0073:
        r1 = 0;
        r6.a(r4, r1);	 Catch:{ NullPointerException -> 0x0092 }
        r1 = r6.a;	 Catch:{ NullPointerException -> 0x0092 }
        r1 = r1 + -1;
        r6.a = r1;	 Catch:{ NullPointerException -> 0x0092 }
        r1 = r6.b;	 Catch:{ NullPointerException -> 0x0092 }
        r1 = r1 + 1;
        r6.b = r1;	 Catch:{ NullPointerException -> 0x0092 }
        r1 = com.google.aX.a;	 Catch:{ NullPointerException -> 0x0092 }
        if (r1 == 0) goto L_0x0051;
    L_0x0087:
        if (r0 == 0) goto L_0x0096;
    L_0x0089:
        i = r2;
        goto L_0x0051;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r2 = 1;
        goto L_0x0089;
    L_0x0098:
        r1 = r2;
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ak.b(com.google.c2, boolean):void");
    }

    public void clear() {
        boolean z = i;
        Arrays.fill(this.f, null);
        this.a = 0;
        this.b++;
        c2 c2Var = this.j;
        c2 c2Var2 = c2Var.f;
        while (c2Var2 != c2Var) {
            c2 c2Var3 = c2Var2.f;
            c2Var2.c = null;
            c2Var2.f = null;
            if (z) {
                break;
            }
            c2Var2 = c2Var3;
        }
        c2Var.c = c2Var;
        c2Var.f = c2Var;
    }

    public ak(Comparator comparator) {
        this.a = 0;
        this.b = 0;
        if (comparator == null) {
            comparator = g;
        }
        this.k = comparator;
        this.j = new c2();
        this.f = new c2[16];
        this.c = (this.f.length / 2) + (this.f.length / 4);
    }

    c2 a(Entry entry) {
        Object obj;
        c2 a = a(entry.getKey());
        if (a != null) {
            try {
                if (a(a.e, entry.getValue())) {
                    obj = 1;
                    if (obj == null) {
                        return a;
                    }
                    return null;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        obj = null;
        if (obj == null) {
            return null;
        }
        return a;
    }

    private void a(c2 c2Var) {
        int i = 0;
        c2 c2Var2 = c2Var.h;
        c2 c2Var3 = c2Var.a;
        c2 c2Var4 = c2Var3.h;
        c2 c2Var5 = c2Var3.a;
        try {
            c2Var.a = c2Var4;
            if (c2Var4 != null) {
                c2Var4.b = c2Var;
            }
            try {
                int i2;
                a(c2Var, c2Var3);
                c2Var3.h = c2Var;
                c2Var.b = c2Var3;
                int i3 = c2Var2 != null ? c2Var2.i : 0;
                if (c2Var4 != null) {
                    try {
                        i2 = c2Var4.i;
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
                i2 = 0;
                try {
                    c2Var.i = Math.max(i3, i2) + 1;
                    i2 = c2Var.i;
                    if (c2Var5 != null) {
                        i = c2Var5.i;
                    }
                    c2Var3.i = Math.max(i2, i) + 1;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            } catch (NullPointerException e22) {
                throw e22;
            }
        } catch (NullPointerException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.Object r2, java.lang.Object r3) {
        /*
        r1 = this;
        if (r2 == r3) goto L_0x000a;
    L_0x0002:
        if (r2 == 0) goto L_0x000e;
    L_0x0004:
        r0 = r2.equals(r3);	 Catch:{ NullPointerException -> 0x000c }
        if (r0 == 0) goto L_0x000e;
    L_0x000a:
        r0 = 1;
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = 0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ak.a(java.lang.Object, java.lang.Object):boolean");
    }

    private void a() {
        this.f = a(this.f);
        this.c = (this.f.length / 2) + (this.f.length / 4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    com.google.c2 a(java.lang.Object r13, boolean r14) {
        /*
        r12 = this;
        r3 = 0;
        r2 = 0;
        r8 = i;
        r9 = r12.k;
        r10 = r12.f;
        r1 = r13.hashCode();
        r4 = a(r1);
        r1 = r10.length;
        r1 = r1 + -1;
        r11 = r4 & r1;
        r6 = r10[r11];
        if (r6 == 0) goto L_0x00be;
    L_0x0019:
        r1 = g;	 Catch:{ NullPointerException -> 0x002d }
        if (r9 != r1) goto L_0x002f;
    L_0x001d:
        r0 = r13;
        r0 = (java.lang.Comparable) r0;	 Catch:{ NullPointerException -> 0x002d }
        r1 = r0;
    L_0x0021:
        if (r1 == 0) goto L_0x0031;
    L_0x0023:
        r2 = r6.g;
        r2 = r1.compareTo(r2);
    L_0x0029:
        if (r2 != 0) goto L_0x0038;
    L_0x002b:
        r3 = r6;
    L_0x002c:
        return r3;
    L_0x002d:
        r1 = move-exception;
        throw r1;
    L_0x002f:
        r1 = r3;
        goto L_0x0021;
    L_0x0031:
        r2 = r6.g;
        r2 = r9.compare(r13, r2);
        goto L_0x0029;
    L_0x0038:
        if (r2 >= 0) goto L_0x007a;
    L_0x003a:
        r5 = r6.h;	 Catch:{ NullPointerException -> 0x0078 }
    L_0x003c:
        if (r5 != 0) goto L_0x0040;
    L_0x003e:
        if (r8 == 0) goto L_0x00be;
    L_0x0040:
        if (r8 == 0) goto L_0x00bb;
    L_0x0042:
        r7 = r2;
        r2 = r5;
    L_0x0044:
        if (r14 == 0) goto L_0x002c;
    L_0x0046:
        r5 = r12.j;
        if (r2 != 0) goto L_0x008b;
    L_0x004a:
        r1 = g;	 Catch:{ NullPointerException -> 0x007d }
        if (r9 != r1) goto L_0x007f;
    L_0x004e:
        r1 = r13 instanceof java.lang.Comparable;	 Catch:{ NullPointerException -> 0x0076 }
        if (r1 != 0) goto L_0x007f;
    L_0x0052:
        r1 = new java.lang.ClassCastException;	 Catch:{ NullPointerException -> 0x0076 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0076 }
        r2.<init>();	 Catch:{ NullPointerException -> 0x0076 }
        r3 = r13.getClass();	 Catch:{ NullPointerException -> 0x0076 }
        r3 = r3.getName();	 Catch:{ NullPointerException -> 0x0076 }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x0076 }
        r3 = z;	 Catch:{ NullPointerException -> 0x0076 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x0076 }
        r2 = r2.append(r3);	 Catch:{ NullPointerException -> 0x0076 }
        r2 = r2.toString();	 Catch:{ NullPointerException -> 0x0076 }
        r1.<init>(r2);	 Catch:{ NullPointerException -> 0x0076 }
        throw r1;	 Catch:{ NullPointerException -> 0x0076 }
    L_0x0076:
        r1 = move-exception;
        throw r1;
    L_0x0078:
        r1 = move-exception;
        throw r1;
    L_0x007a:
        r5 = r6.a;
        goto L_0x003c;
    L_0x007d:
        r1 = move-exception;
        throw r1;	 Catch:{ NullPointerException -> 0x0076 }
    L_0x007f:
        r1 = new com.google.c2;
        r6 = r5.c;
        r3 = r13;
        r1.<init>(r2, r3, r4, r5, r6);
        r10[r11] = r1;
        if (r8 == 0) goto L_0x00b9;
    L_0x008b:
        r1 = new com.google.c2;
        r6 = r5.c;
        r3 = r13;
        r1.<init>(r2, r3, r4, r5, r6);
        if (r7 >= 0) goto L_0x0099;
    L_0x0095:
        r2.h = r1;	 Catch:{ NullPointerException -> 0x00b5 }
        if (r8 == 0) goto L_0x009b;
    L_0x0099:
        r2.a = r1;	 Catch:{ NullPointerException -> 0x00b5 }
    L_0x009b:
        r3 = 1;
        r12.a(r2, r3);
        r3 = r1;
    L_0x00a0:
        r1 = r12.a;	 Catch:{ NullPointerException -> 0x00b7 }
        r2 = r1 + 1;
        r12.a = r2;	 Catch:{ NullPointerException -> 0x00b7 }
        r2 = r12.c;	 Catch:{ NullPointerException -> 0x00b7 }
        if (r1 <= r2) goto L_0x00ad;
    L_0x00aa:
        r12.a();	 Catch:{ NullPointerException -> 0x00b7 }
    L_0x00ad:
        r1 = r12.b;
        r1 = r1 + 1;
        r12.b = r1;
        goto L_0x002c;
    L_0x00b5:
        r1 = move-exception;
        throw r1;
    L_0x00b7:
        r1 = move-exception;
        throw r1;
    L_0x00b9:
        r3 = r1;
        goto L_0x00a0;
    L_0x00bb:
        r6 = r5;
        goto L_0x0021;
    L_0x00be:
        r7 = r2;
        r2 = r6;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ak.a(java.lang.Object, boolean):com.google.c2");
    }

    static {
        int i;
        boolean z = true;
        String[] strArr = new String[2];
        char[] toCharArray = ";UPcctH\u0003\u0000bvLB1lyPF".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 27;
                    break;
                case at.g /*1*/:
                    i2 = 60;
                    break;
                case at.i /*2*/:
                    i2 = 35;
                    break;
                case at.o /*3*/:
                    i2 = 67;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "pYZc0&\u001cM6aw".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 27;
                    break;
                case at.g /*1*/:
                    i2 = 60;
                    break;
                case at.i /*2*/:
                    i2 = 35;
                    break;
                case at.o /*3*/:
                    i2 = 67;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
        try {
            if (ak.class.desiredAssertionStatus()) {
                z = false;
            }
            d = z;
            g = new hu();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public Set entrySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        set = new fJ(this);
        this.h = set;
        return set;
    }

    public Object get(Object obj) {
        c2 a = a(obj);
        if (a == null) {
            return null;
        }
        try {
            return a.e;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public Object remove(Object obj) {
        c2 b = b(obj);
        if (b == null) {
            return null;
        }
        try {
            return b.e;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    c2 a(Object obj) {
        c2 c2Var = null;
        if (obj != null) {
            try {
                c2Var = a(obj, false);
            } catch (ClassCastException e) {
                throw e;
            } catch (ClassCastException e2) {
            }
        }
        return c2Var;
    }

    public ak() {
        this(g);
    }

    c2 b(Object obj) {
        c2 a = a(obj);
        if (a != null) {
            try {
                b(a, true);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        return a;
    }

    public Set keySet() {
        Set set = this.e;
        if (set != null) {
            return set;
        }
        set = new gM(this);
        this.e = set;
        return set;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            try {
                throw new NullPointerException(z[1]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        c2 a = a(obj, true);
        Object obj3 = a.e;
        a.e = obj2;
        return obj3;
    }

    private void a(c2 c2Var, c2 c2Var2) {
        boolean z = i;
        c2 c2Var3 = c2Var.b;
        try {
            c2Var.b = null;
            if (c2Var2 != null) {
                c2Var2.b = c2Var3;
            }
            if (c2Var3 != null) {
                try {
                    if (c2Var3.h == c2Var) {
                        c2Var3.h = c2Var2;
                        if (!z) {
                            return;
                        }
                    }
                    try {
                        if (!d) {
                            try {
                                if (c2Var3.a != c2Var) {
                                    throw new AssertionError();
                                }
                            } catch (NullPointerException e) {
                                throw e;
                            }
                        }
                        c2Var3.a = c2Var2;
                        if (!z) {
                            return;
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                } catch (NullPointerException e22) {
                    throw e22;
                } catch (NullPointerException e222) {
                    throw e222;
                }
            }
            this.f[c2Var.d & (this.f.length - 1)] = c2Var2;
        } catch (NullPointerException e2222) {
            throw e2222;
        }
    }
}
