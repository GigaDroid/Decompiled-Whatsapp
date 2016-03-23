package com.google;

import org.v;
import org.whispersystems.at;

final class gd {
    private static final String z;
    private final StringBuilder a;
    private final d_ b;
    private final gx c;

    static {
        char[] toCharArray = "qfUp\u0004\\mQ?\t[uWs\tQ#Ws\u0010]bXj\rPq_|@CbZj\u0005\u000f#".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 53;
                    break;
                case at.g /*1*/:
                    i2 = 3;
                    break;
                case at.i /*2*/:
                    i2 = 54;
                    break;
                case at.o /*3*/:
                    i2 = 31;
                    break;
                default:
                    i2 = 96;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private boolean f(int i) {
        boolean z = true;
        try {
            if (i + 5 > this.b.d()) {
                return false;
            }
            int a = a(i, 5);
            if (a >= 5 && a < 16) {
                return true;
            }
            try {
                if (i + 6 > this.b.d()) {
                    return false;
                }
                a = a(i, 6);
                if (a < 16 || a >= 63) {
                    z = false;
                }
                return z;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.ep a() {
        /*
        r4 = this;
        r0 = com.google.dt.c;
    L_0x0002:
        r1 = r4.c;
        r1 = r1.b();
        r1 = r4.i(r1);
        if (r1 == 0) goto L_0x004a;
    L_0x000e:
        r1 = r4.c;
        r1 = r1.b();
        r1 = r4.c(r1);
        r2 = r4.c;
        r3 = r1.a();
        r2.a(r3);
        r2 = r1.b();
        if (r2 == 0) goto L_0x003f;
    L_0x0027:
        r1 = new com.google.bp;
        r0 = r4.c;
        r0 = r0.b();
        r2 = r4.a;
        r2 = r2.toString();
        r1.<init>(r0, r2);
        r0 = new com.google.ep;
        r2 = 1;
        r0.<init>(r1, r2);
    L_0x003e:
        return r0;
    L_0x003f:
        r2 = r4.a;
        r1 = r1.a();
        r2.append(r1);
        if (r0 == 0) goto L_0x0002;
    L_0x004a:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r1.b();	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r4.b(r1);	 Catch:{ IllegalStateException -> 0x009e }
        if (r1 == 0) goto L_0x0063;
    L_0x0056:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a0 }
        r2 = 3;
        r1.b(r2);	 Catch:{ IllegalStateException -> 0x00a0 }
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a0 }
        r1.a();	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r0 == 0) goto L_0x0097;
    L_0x0063:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a2 }
        r1 = r1.b();	 Catch:{ IllegalStateException -> 0x00a2 }
        r1 = r4.g(r1);	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r1 == 0) goto L_0x0097;
    L_0x006f:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = r1.b();	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = r1 + 5;
        r2 = r4.b;	 Catch:{ IllegalStateException -> 0x00a4 }
        r2 = r2.d();	 Catch:{ IllegalStateException -> 0x00a4 }
        if (r1 >= r2) goto L_0x0087;
    L_0x007f:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a6 }
        r2 = 5;
        r1.b(r2);	 Catch:{ IllegalStateException -> 0x00a6 }
        if (r0 == 0) goto L_0x0092;
    L_0x0087:
        r0 = r4.c;	 Catch:{ IllegalStateException -> 0x00a6 }
        r1 = r4.b;	 Catch:{ IllegalStateException -> 0x00a6 }
        r1 = r1.d();	 Catch:{ IllegalStateException -> 0x00a6 }
        r0.a(r1);	 Catch:{ IllegalStateException -> 0x00a6 }
    L_0x0092:
        r0 = r4.c;
        r0.c();
    L_0x0097:
        r0 = new com.google.ep;
        r1 = 0;
        r0.<init>(r1);
        goto L_0x003e;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gd.a():com.google.ep");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.ep d() {
        /*
        r4 = this;
        r0 = com.google.dt.c;
    L_0x0002:
        r1 = r4.c;
        r1 = r1.b();
        r1 = r4.f(r1);
        if (r1 == 0) goto L_0x004a;
    L_0x000e:
        r1 = r4.c;
        r1 = r1.b();
        r1 = r4.h(r1);
        r2 = r4.c;
        r3 = r1.a();
        r2.a(r3);
        r2 = r1.b();
        if (r2 == 0) goto L_0x003f;
    L_0x0027:
        r1 = new com.google.bp;
        r0 = r4.c;
        r0 = r0.b();
        r2 = r4.a;
        r2 = r2.toString();
        r1.<init>(r0, r2);
        r0 = new com.google.ep;
        r2 = 1;
        r0.<init>(r1, r2);
    L_0x003e:
        return r0;
    L_0x003f:
        r2 = r4.a;
        r1 = r1.a();
        r2.append(r1);
        if (r0 == 0) goto L_0x0002;
    L_0x004a:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r1.b();	 Catch:{ IllegalStateException -> 0x009e }
        r1 = r4.b(r1);	 Catch:{ IllegalStateException -> 0x009e }
        if (r1 == 0) goto L_0x0063;
    L_0x0056:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a0 }
        r2 = 3;
        r1.b(r2);	 Catch:{ IllegalStateException -> 0x00a0 }
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a0 }
        r1.a();	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r0 == 0) goto L_0x0097;
    L_0x0063:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a2 }
        r1 = r1.b();	 Catch:{ IllegalStateException -> 0x00a2 }
        r1 = r4.g(r1);	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r1 == 0) goto L_0x0097;
    L_0x006f:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = r1.b();	 Catch:{ IllegalStateException -> 0x00a4 }
        r1 = r1 + 5;
        r2 = r4.b;	 Catch:{ IllegalStateException -> 0x00a4 }
        r2 = r2.d();	 Catch:{ IllegalStateException -> 0x00a4 }
        if (r1 >= r2) goto L_0x0087;
    L_0x007f:
        r1 = r4.c;	 Catch:{ IllegalStateException -> 0x00a6 }
        r2 = 5;
        r1.b(r2);	 Catch:{ IllegalStateException -> 0x00a6 }
        if (r0 == 0) goto L_0x0092;
    L_0x0087:
        r0 = r4.c;	 Catch:{ IllegalStateException -> 0x00a6 }
        r1 = r4.b;	 Catch:{ IllegalStateException -> 0x00a6 }
        r1 = r1.d();	 Catch:{ IllegalStateException -> 0x00a6 }
        r0.a(r1);	 Catch:{ IllegalStateException -> 0x00a6 }
    L_0x0092:
        r0 = r4.c;
        r0.f();
    L_0x0097:
        r0 = new com.google.ep;
        r1 = 0;
        r0.<init>(r1);
        goto L_0x003e;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gd.d():com.google.ep");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.bp b() {
        /*
        r5 = this;
        r3 = com.google.dt.c;
    L_0x0002:
        r0 = r5.c;
        r4 = r0.b();
        r0 = r5.c;
        r0 = r0.e();
        if (r0 == 0) goto L_0x001a;
    L_0x0010:
        r0 = r5.d();
        r1 = r0.a();
        if (r3 == 0) goto L_0x0052;
    L_0x001a:
        r0 = r5.c;	 Catch:{ IllegalStateException -> 0x004c }
        r0 = r0.d();	 Catch:{ IllegalStateException -> 0x004c }
        if (r0 == 0) goto L_0x002c;
    L_0x0022:
        r0 = r5.a();
        r1 = r0.a();
        if (r3 == 0) goto L_0x0052;
    L_0x002c:
        r0 = r5.c();
        r1 = r0.a();
        r2 = r1;
        r1 = r0;
    L_0x0036:
        r0 = r5.c;	 Catch:{ IllegalStateException -> 0x004e }
        r0 = r0.b();	 Catch:{ IllegalStateException -> 0x004e }
        if (r4 == r0) goto L_0x0050;
    L_0x003e:
        r0 = 1;
    L_0x003f:
        if (r0 != 0) goto L_0x0045;
    L_0x0041:
        if (r2 != 0) goto L_0x0045;
    L_0x0043:
        if (r3 == 0) goto L_0x0047;
    L_0x0045:
        if (r2 == 0) goto L_0x0002;
    L_0x0047:
        r0 = r1.b();
        return r0;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = 0;
        goto L_0x003f;
    L_0x0052:
        r2 = r1;
        r1 = r0;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gd.b():com.google.bp");
    }

    bp a(int i, String str) {
        try {
            this.a.setLength(0);
            if (str != null) {
                this.a.append(str);
            }
            this.c.a(i);
            bp b = b();
            if (b != null) {
                try {
                    if (b.a()) {
                        return new bp(this.c.b(), this.a.toString(), b.c());
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return new bp(this.c.b(), this.a.toString());
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private boolean d(int i) {
        boolean z = dt.c;
        try {
            if (i + 7 <= this.b.d()) {
                int i2 = i;
                while (i2 < i + 3) {
                    try {
                        if (!this.b.f(i2)) {
                            i2++;
                            if (z) {
                                break;
                            }
                        }
                        return true;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                return this.b.f(i + 3);
            } else if (i + 4 <= this.b.d()) {
                return true;
            } else {
                return false;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private boolean i(int i) {
        boolean z = true;
        try {
            if (i + 5 > this.b.d()) {
                return false;
            }
            int a = a(i, 5);
            if (a >= 5 && a < 16) {
                return true;
            }
            try {
                if (i + 7 > this.b.d()) {
                    return false;
                }
                a = a(i, 7);
                if (a >= 64 && a < 116) {
                    return true;
                }
                try {
                    if (i + 8 > this.b.d()) {
                        return false;
                    }
                    a = a(i, 8);
                    if (a < 232 || a >= 253) {
                        z = false;
                    }
                    return z;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private boolean g(int i) {
        boolean z = dt.c;
        try {
            if (i + 1 > this.b.d()) {
                return false;
            }
            int i2 = 0;
            while (i2 < 5) {
                try {
                    if (i2 + i < this.b.d()) {
                        if (i2 == 2) {
                            try {
                                if (!this.b.f(i + 2)) {
                                    return false;
                                }
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                        try {
                            if (this.b.f(i + i2)) {
                                return false;
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                        i2++;
                        if (z) {
                            break;
                        }
                    }
                    break;
                } catch (IllegalStateException e22) {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            }
            return true;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    private boolean a(int i) {
        boolean z = dt.c;
        try {
            if (i + 1 > this.b.d()) {
                return false;
            }
            int i2 = 0;
            while (i2 < 4) {
                try {
                    if (i2 + i >= this.b.d()) {
                        break;
                    } else if (!this.b.f(i + i2)) {
                        i2++;
                        if (z) {
                            break;
                        }
                    } else {
                        return false;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            return true;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    gd(d_ d_Var) {
        this.c = new gx();
        this.a = new StringBuilder();
        this.b = d_Var;
    }

    private boolean b(int i) {
        boolean z = dt.c;
        try {
            if (i + 3 > this.b.d()) {
                return false;
            }
            int i2 = i;
            while (i2 < i + 3) {
                try {
                    if (!this.b.f(i2)) {
                        i2++;
                        if (z) {
                            break;
                        }
                    }
                    return false;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return true;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static int a(d_ d_Var, int i, int i2) {
        int i3 = 0;
        boolean z = dt.c;
        int i4 = 0;
        while (i4 < i2) {
            if (d_Var.f(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
            i4++;
            if (z) {
                break;
            }
        }
        return i3;
    }

    int a(int i, int i2) {
        return a(this.b, i, i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.b0 c(int r6) {
        /*
        r5 = this;
        r4 = 90;
        r3 = 15;
        r0 = 5;
        r1 = com.google.dt.c;
        r2 = r5.a(r6, r0);
        if (r2 != r3) goto L_0x0019;
    L_0x000d:
        r0 = new com.google.b0;	 Catch:{ IllegalStateException -> 0x0017 }
        r1 = r6 + 5;
        r2 = 36;
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0017 }
    L_0x0016:
        return r0;
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        if (r2 < r0) goto L_0x002c;
    L_0x001b:
        if (r2 >= r3) goto L_0x002c;
    L_0x001d:
        r0 = new com.google.b0;	 Catch:{ IllegalStateException -> 0x002a }
        r1 = r6 + 5;
        r2 = r2 + 48;
        r2 = r2 + -5;
        r2 = (char) r2;	 Catch:{ IllegalStateException -> 0x002a }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x002a }
        goto L_0x0016;
    L_0x002a:
        r0 = move-exception;
        throw r0;
    L_0x002c:
        r0 = 7;
        r2 = r5.a(r6, r0);
        r0 = 64;
        if (r2 < r0) goto L_0x0044;
    L_0x0035:
        if (r2 >= r4) goto L_0x0044;
    L_0x0037:
        r0 = new com.google.b0;	 Catch:{ IllegalStateException -> 0x0042 }
        r1 = r6 + 7;
        r2 = r2 + 1;
        r2 = (char) r2;	 Catch:{ IllegalStateException -> 0x0042 }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0042 }
        goto L_0x0016;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        if (r2 < r4) goto L_0x0057;
    L_0x0046:
        r0 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r2 >= r0) goto L_0x0057;
    L_0x004a:
        r0 = new com.google.b0;	 Catch:{ IllegalStateException -> 0x0055 }
        r1 = r6 + 7;
        r2 = r2 + 7;
        r2 = (char) r2;	 Catch:{ IllegalStateException -> 0x0055 }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0055 }
        goto L_0x0016;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r0 = 8;
        r0 = r5.a(r6, r0);
        switch(r0) {
            case 232: goto L_0x0067;
            case 233: goto L_0x006b;
            case 234: goto L_0x006f;
            case 235: goto L_0x0073;
            case 236: goto L_0x0077;
            case 237: goto L_0x007b;
            case 238: goto L_0x007f;
            case 239: goto L_0x0083;
            case 240: goto L_0x0087;
            case 241: goto L_0x008b;
            case 242: goto L_0x008f;
            case 243: goto L_0x0093;
            case 244: goto L_0x0097;
            case 245: goto L_0x009b;
            case 246: goto L_0x009f;
            case 247: goto L_0x00a3;
            case 248: goto L_0x00a7;
            case 249: goto L_0x00ab;
            case 250: goto L_0x00af;
            case 251: goto L_0x00b3;
            case 252: goto L_0x00b7;
            default: goto L_0x0060;
        };
    L_0x0060:
        r0 = com.google.aG.a();	 Catch:{ IllegalStateException -> 0x0065 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = 33;
        if (r1 == 0) goto L_0x00bb;
    L_0x006b:
        r0 = 34;
        if (r1 == 0) goto L_0x00bb;
    L_0x006f:
        r0 = 37;
        if (r1 == 0) goto L_0x00bb;
    L_0x0073:
        r0 = 38;
        if (r1 == 0) goto L_0x00bb;
    L_0x0077:
        r0 = 39;
        if (r1 == 0) goto L_0x00bb;
    L_0x007b:
        r0 = 40;
        if (r1 == 0) goto L_0x00bb;
    L_0x007f:
        r0 = 41;
        if (r1 == 0) goto L_0x00bb;
    L_0x0083:
        r0 = 42;
        if (r1 == 0) goto L_0x00bb;
    L_0x0087:
        r0 = 43;
        if (r1 == 0) goto L_0x00bb;
    L_0x008b:
        r0 = 44;
        if (r1 == 0) goto L_0x00bb;
    L_0x008f:
        r0 = 45;
        if (r1 == 0) goto L_0x00bb;
    L_0x0093:
        r0 = 46;
        if (r1 == 0) goto L_0x00bb;
    L_0x0097:
        r0 = 47;
        if (r1 == 0) goto L_0x00bb;
    L_0x009b:
        r0 = 58;
        if (r1 == 0) goto L_0x00bb;
    L_0x009f:
        r0 = 59;
        if (r1 == 0) goto L_0x00bb;
    L_0x00a3:
        r0 = 60;
        if (r1 == 0) goto L_0x00bb;
    L_0x00a7:
        r0 = 61;
        if (r1 == 0) goto L_0x00bb;
    L_0x00ab:
        r0 = 62;
        if (r1 == 0) goto L_0x00bb;
    L_0x00af:
        r0 = 63;
        if (r1 == 0) goto L_0x00bb;
    L_0x00b3:
        r0 = 95;
        if (r1 == 0) goto L_0x00bb;
    L_0x00b7:
        r0 = 32;
        if (r1 != 0) goto L_0x0060;
    L_0x00bb:
        r1 = new com.google.b0;
        r2 = r6 + 8;
        r1.<init>(r2, r0);
        r0 = r1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gd.c(int):com.google.b0");
    }

    private bH e(int i) {
        if (i + 7 > this.b.d()) {
            int a = a(i, 4);
            if (a != 0) {
                return new bH(this.b.d(), a - 1, 10);
            }
            try {
                return new bH(this.b.d(), 10, 10);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        int a2 = a(i, 7);
        return new bH(i + 7, (a2 - 8) / 11, (a2 - 8) % 11);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    java.lang.String a(java.lang.StringBuilder r6, int r7) {
        /*
        r5 = this;
        r1 = 0;
        r2 = com.google.dt.c;
        r0 = r1;
    L_0x0004:
        r3 = r5.a(r7, r0);
        r0 = r3.b();
        r0 = com.google.fL.a(r0);
        if (r0 == 0) goto L_0x0015;
    L_0x0012:
        r6.append(r0);
    L_0x0015:
        r0 = r3.a();
        if (r0 == 0) goto L_0x0025;
    L_0x001b:
        r0 = r3.c();
        r0 = java.lang.String.valueOf(r0);
        if (r2 == 0) goto L_0x0026;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        r4 = r3.a();	 Catch:{ IllegalStateException -> 0x0039 }
        if (r7 != r4) goto L_0x002e;
    L_0x002c:
        if (r2 == 0) goto L_0x0034;
    L_0x002e:
        r7 = r3.a();
        if (r2 == 0) goto L_0x0004;
    L_0x0034:
        r0 = r6.toString();
        return r0;
    L_0x0039:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gd.a(java.lang.StringBuilder, int):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.b0 h(int r5) {
        /*
        r4 = this;
        r3 = 15;
        r0 = 5;
        r1 = com.google.dt.c;
        r2 = r4.a(r5, r0);
        if (r2 != r3) goto L_0x0017;
    L_0x000b:
        r0 = new com.google.b0;	 Catch:{ IllegalStateException -> 0x0015 }
        r1 = r5 + 5;
        r2 = 36;
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0015 }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        if (r2 < r0) goto L_0x002a;
    L_0x0019:
        if (r2 >= r3) goto L_0x002a;
    L_0x001b:
        r0 = new com.google.b0;	 Catch:{ IllegalStateException -> 0x0028 }
        r1 = r5 + 5;
        r2 = r2 + 48;
        r2 = r2 + -5;
        r2 = (char) r2;	 Catch:{ IllegalStateException -> 0x0028 }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0028 }
        goto L_0x0014;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = 6;
        r2 = r4.a(r5, r0);
        r0 = 32;
        if (r2 < r0) goto L_0x0044;
    L_0x0033:
        r0 = 58;
        if (r2 >= r0) goto L_0x0044;
    L_0x0037:
        r0 = new com.google.b0;	 Catch:{ IllegalStateException -> 0x0042 }
        r1 = r5 + 6;
        r2 = r2 + 33;
        r2 = (char) r2;	 Catch:{ IllegalStateException -> 0x0042 }
        r0.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0042 }
        goto L_0x0014;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        switch(r2) {
            case 58: goto L_0x0062;
            case 59: goto L_0x0066;
            case 60: goto L_0x006a;
            case 61: goto L_0x006e;
            case 62: goto L_0x0072;
            default: goto L_0x0047;
        };
    L_0x0047:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0060 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0060 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = r1.append(r3);	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0060 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0060 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r0 = 42;
        if (r1 == 0) goto L_0x0076;
    L_0x0066:
        r0 = 44;
        if (r1 == 0) goto L_0x0076;
    L_0x006a:
        r0 = 45;
        if (r1 == 0) goto L_0x0076;
    L_0x006e:
        r0 = 46;
        if (r1 == 0) goto L_0x0076;
    L_0x0072:
        r0 = 47;
        if (r1 != 0) goto L_0x0047;
    L_0x0076:
        r1 = new com.google.b0;
        r2 = r5 + 6;
        r1.<init>(r2, r0);
        r0 = r1;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gd.h(int):com.google.b0");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.ep c() {
        /*
        r6 = this;
        r5 = 1;
        r1 = com.google.dt.c;
    L_0x0003:
        r0 = r6.c;
        r0 = r0.b();
        r0 = r6.d(r0);
        if (r0 == 0) goto L_0x0090;
    L_0x000f:
        r0 = r6.c;
        r0 = r0.b();
        r2 = r6.e(r0);
        r0 = r6.c;	 Catch:{ IllegalStateException -> 0x005d }
        r3 = r2.a();	 Catch:{ IllegalStateException -> 0x005d }
        r0.a(r3);	 Catch:{ IllegalStateException -> 0x005d }
        r0 = r2.a();	 Catch:{ IllegalStateException -> 0x005d }
        if (r0 == 0) goto L_0x005f;
    L_0x0028:
        r0 = r2.d();	 Catch:{ IllegalStateException -> 0x005d }
        if (r0 == 0) goto L_0x0041;
    L_0x002e:
        r0 = new com.google.bp;
        r3 = r6.c;
        r3 = r3.b();
        r4 = r6.a;
        r4 = r4.toString();
        r0.<init>(r3, r4);
        if (r1 == 0) goto L_0x0056;
    L_0x0041:
        r0 = new com.google.bp;
        r1 = r6.c;
        r1 = r1.b();
        r3 = r6.a;
        r3 = r3.toString();
        r2 = r2.b();
        r0.<init>(r1, r3, r2);
    L_0x0056:
        r1 = new com.google.ep;
        r1.<init>(r0, r5);
        r0 = r1;
    L_0x005c:
        return r0;
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r0 = r6.a;
        r3 = r2.c();
        r0.append(r3);
        r0 = r2.d();
        if (r0 == 0) goto L_0x0085;
    L_0x006e:
        r1 = new com.google.bp;
        r0 = r6.c;
        r0 = r0.b();
        r2 = r6.a;
        r2 = r2.toString();
        r1.<init>(r0, r2);
        r0 = new com.google.ep;
        r0.<init>(r1, r5);
        goto L_0x005c;
    L_0x0085:
        r0 = r6.a;
        r2 = r2.b();
        r0.append(r2);
        if (r1 == 0) goto L_0x0003;
    L_0x0090:
        r0 = r6.c;	 Catch:{ IllegalStateException -> 0x00ae }
        r0 = r0.b();	 Catch:{ IllegalStateException -> 0x00ae }
        r0 = r6.a(r0);	 Catch:{ IllegalStateException -> 0x00ae }
        if (r0 == 0) goto L_0x00a7;
    L_0x009c:
        r0 = r6.c;	 Catch:{ IllegalStateException -> 0x00ae }
        r0.c();	 Catch:{ IllegalStateException -> 0x00ae }
        r0 = r6.c;	 Catch:{ IllegalStateException -> 0x00ae }
        r1 = 4;
        r0.b(r1);	 Catch:{ IllegalStateException -> 0x00ae }
    L_0x00a7:
        r0 = new com.google.ep;
        r1 = 0;
        r0.<init>(r1);
        goto L_0x005c;
    L_0x00ae:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gd.c():com.google.ep");
    }
}
