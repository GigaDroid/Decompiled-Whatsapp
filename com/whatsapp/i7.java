package com.whatsapp;

public class i7 {
    public final String a;
    public final String[] b;
    public final int c;
    public final String d;
    public final String e;
    public final int[] f;
    public final int[] g;
    public final String h;
    public final boolean i;
    public final String[] j;
    public final String[] k;
    public final String[] l;

    public String a(String str) {
        boolean z = DialogToastActivity.f;
        int i = 0;
        while (i < str.length()) {
            try {
                if (this.b != null) {
                    int i2 = 0;
                    Object obj = null;
                    while (i2 < this.b.length && r3 == null) {
                        try {
                            if (this.b[i2].charAt(0) == str.charAt(i)) {
                                obj = 1;
                            }
                            i2++;
                            if (z) {
                                break;
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    if (obj != null) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    try {
                        str = str.substring(i);
                        break;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                break;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        return str;
    }

    public int a() {
        boolean z = DialogToastActivity.f;
        try {
            if (this.g != null) {
                if (this.g.length != 0) {
                    int i = this.g[0];
                    int i2 = 1;
                    while (i2 < this.g.length) {
                        if (this.g[i2] < i) {
                            i = this.g[i2];
                        }
                        i2++;
                        if (z) {
                            return i;
                        }
                    }
                    return i;
                }
            }
            return 5;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int b() {
        boolean z = DialogToastActivity.f;
        try {
            if (this.g != null) {
                if (this.g.length != 0) {
                    int i = this.g[0];
                    int i2 = 1;
                    while (i2 < this.g.length) {
                        if (this.g[i2] > i) {
                            i = this.g[i2];
                        }
                        i2++;
                        if (z) {
                            return i;
                        }
                    }
                    return i;
                }
            }
            return 14;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public int a(int i) {
        boolean z = DialogToastActivity.f;
        try {
            if (i < a()) {
                return -1;
            }
            try {
                if (i > b()) {
                    return 1;
                }
                try {
                    if (this.g == null) {
                        return 0;
                    }
                    if (this.g.length == 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (i2 < this.g.length) {
                        try {
                            if (this.g[i2] != i) {
                                i2++;
                                if (z) {
                                    break;
                                }
                            }
                            return 0;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    return 1;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    i7(String[] strArr, a2m com_whatsapp_a2m) {
        this(strArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i7(java.lang.String[] r10) {
        /*
        r9 = this;
        r2 = 1;
        r1 = 0;
        r0 = 0;
        r9.<init>();
        r3 = r10.length;
        r4 = 12;
        if (r3 >= r4) goto L_0x0011;
    L_0x000b:
        r0 = new java.lang.IllegalArgumentException;
        r0.<init>();
        throw r0;
    L_0x0011:
        r3 = r10[r1];
        r4 = r10[r2];
        r5 = 2;
        r5 = r10[r5];
        r6 = 3;
        r6 = r10[r6];
        r7 = 4;
        r7 = r10[r7];
        r8 = 5;
        r8 = r10[r8];
        if (r4 == 0) goto L_0x0025;
    L_0x0023:
        if (r5 != 0) goto L_0x002d;
    L_0x0025:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x002b }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r9.h = r4;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r9.d = r3;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r3 = java.lang.Integer.parseInt(r5);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r9.c = r3;	 Catch:{ IllegalArgumentException -> 0x00cf }
        if (r6 == 0) goto L_0x00d3;
    L_0x0039:
        r3 = r6.trim();	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00d1 }
        if (r3 <= 0) goto L_0x00d3;
    L_0x0043:
        r3 = com.whatsapp.u0.g(r6);	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x0047:
        r9.f = r3;	 Catch:{ IllegalArgumentException -> 0x00d6 }
        if (r7 == 0) goto L_0x00da;
    L_0x004b:
        r3 = r7.trim();	 Catch:{ IllegalArgumentException -> 0x00d8 }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00d8 }
        if (r3 <= 0) goto L_0x00da;
    L_0x0055:
        r3 = com.whatsapp.u0.g(r7);	 Catch:{ IllegalArgumentException -> 0x00d8 }
    L_0x0059:
        r9.g = r3;	 Catch:{ IllegalArgumentException -> 0x00dd }
        if (r8 == 0) goto L_0x00e1;
    L_0x005d:
        r3 = r8.trim();	 Catch:{ IllegalArgumentException -> 0x00df }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00df }
        if (r3 <= 0) goto L_0x00e1;
    L_0x0067:
        r3 = ",";
        r3 = android.text.TextUtils.split(r8, r3);	 Catch:{ IllegalArgumentException -> 0x00df }
    L_0x006e:
        r9.b = r3;	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r3 = 7;
        r3 = r10[r3];	 Catch:{ IllegalArgumentException -> 0x00e3 }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00e3 }
        if (r3 > 0) goto L_0x008d;
    L_0x0079:
        r3 = 8;
        r3 = r10[r3];	 Catch:{ IllegalArgumentException -> 0x00e5 }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00e5 }
        if (r3 > 0) goto L_0x008d;
    L_0x0083:
        r3 = 9;
        r3 = r10[r3];	 Catch:{ IllegalArgumentException -> 0x00e7 }
        r3 = r3.length();	 Catch:{ IllegalArgumentException -> 0x00e7 }
        if (r3 <= 0) goto L_0x008e;
    L_0x008d:
        r1 = r2;
    L_0x008e:
        r9.i = r1;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r1 = r9.i;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        if (r1 == 0) goto L_0x00eb;
    L_0x0094:
        r1 = 7;
        r1 = r10[r1];	 Catch:{ IllegalArgumentException -> 0x00e9 }
        r2 = ";";
        r1 = android.text.TextUtils.split(r1, r2);	 Catch:{ IllegalArgumentException -> 0x00e9 }
    L_0x009e:
        r9.j = r1;	 Catch:{ IllegalArgumentException -> 0x00ed }
        r1 = r9.i;	 Catch:{ IllegalArgumentException -> 0x00ed }
        if (r1 == 0) goto L_0x00ef;
    L_0x00a4:
        r1 = 8;
        r1 = r10[r1];	 Catch:{ IllegalArgumentException -> 0x00ed }
        r2 = ";";
        r1 = android.text.TextUtils.split(r1, r2);	 Catch:{ IllegalArgumentException -> 0x00ed }
    L_0x00af:
        r9.l = r1;	 Catch:{ IllegalArgumentException -> 0x00f1 }
        r1 = r9.i;	 Catch:{ IllegalArgumentException -> 0x00f1 }
        if (r1 == 0) goto L_0x00c0;
    L_0x00b5:
        r0 = 9;
        r0 = r10[r0];	 Catch:{ IllegalArgumentException -> 0x00f1 }
        r1 = ";";
        r0 = android.text.TextUtils.split(r0, r1);	 Catch:{ IllegalArgumentException -> 0x00f1 }
    L_0x00c0:
        r9.k = r0;
        r0 = 10;
        r0 = r10[r0];
        r9.a = r0;
        r0 = 11;
        r0 = r10[r0];
        r9.e = r0;
        return;
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r3 = r0;
        goto L_0x0047;
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;
    L_0x00da:
        r3 = r0;
        goto L_0x0059;
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;
    L_0x00e1:
        r3 = r0;
        goto L_0x006e;
    L_0x00e3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r1 = r0;
        goto L_0x009e;
    L_0x00ed:
        r0 = move-exception;
        throw r0;
    L_0x00ef:
        r1 = r0;
        goto L_0x00af;
    L_0x00f1:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.i7.<init>(java.lang.String[]):void");
    }
}
