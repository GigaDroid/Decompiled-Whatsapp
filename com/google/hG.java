package com.google;

final class hG {
    private int a;
    private int b;
    private c2 c;
    private int d;

    void a(int i) {
        this.a = ((Integer.highestOneBit(i) * 2) - 1) - i;
        this.d = 0;
        this.b = 0;
        this.c = null;
    }

    c2 a() {
        c2 c2Var = this.c;
        try {
            if (c2Var.b == null) {
                return c2Var;
            }
            throw new IllegalStateException();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    hG() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a(com.google.c2 r9) {
        /*
        r8 = this;
        r3 = 1;
        r2 = 0;
        r4 = com.google.ak.i;
        r0 = 0;
        r9.a = r0;	 Catch:{ IllegalStateException -> 0x00a9 }
        r9.b = r0;	 Catch:{ IllegalStateException -> 0x00a9 }
        r9.h = r0;	 Catch:{ IllegalStateException -> 0x00a9 }
        r0 = 1;
        r9.i = r0;	 Catch:{ IllegalStateException -> 0x00a9 }
        r0 = r8.a;	 Catch:{ IllegalStateException -> 0x00a9 }
        if (r0 <= 0) goto L_0x002a;
    L_0x0012:
        r0 = r8.d;	 Catch:{ IllegalStateException -> 0x00ab }
        r0 = r0 & 1;
        if (r0 != 0) goto L_0x002a;
    L_0x0018:
        r0 = r8.d;	 Catch:{ IllegalStateException -> 0x00ab }
        r0 = r0 + 1;
        r8.d = r0;	 Catch:{ IllegalStateException -> 0x00ab }
        r0 = r8.a;	 Catch:{ IllegalStateException -> 0x00ab }
        r0 = r0 + -1;
        r8.a = r0;	 Catch:{ IllegalStateException -> 0x00ab }
        r0 = r8.b;	 Catch:{ IllegalStateException -> 0x00ab }
        r0 = r0 + 1;
        r8.b = r0;	 Catch:{ IllegalStateException -> 0x00ab }
    L_0x002a:
        r0 = r8.c;	 Catch:{ IllegalStateException -> 0x00ad }
        r9.b = r0;	 Catch:{ IllegalStateException -> 0x00ad }
        r8.c = r9;	 Catch:{ IllegalStateException -> 0x00ad }
        r0 = r8.d;	 Catch:{ IllegalStateException -> 0x00ad }
        r0 = r0 + 1;
        r8.d = r0;	 Catch:{ IllegalStateException -> 0x00ad }
        r0 = r8.a;	 Catch:{ IllegalStateException -> 0x00ad }
        if (r0 <= 0) goto L_0x0052;
    L_0x003a:
        r0 = r8.d;	 Catch:{ IllegalStateException -> 0x00af }
        r0 = r0 & 1;
        if (r0 != 0) goto L_0x0052;
    L_0x0040:
        r0 = r8.d;	 Catch:{ IllegalStateException -> 0x00af }
        r0 = r0 + 1;
        r8.d = r0;	 Catch:{ IllegalStateException -> 0x00af }
        r0 = r8.a;	 Catch:{ IllegalStateException -> 0x00af }
        r0 = r0 + -1;
        r8.a = r0;	 Catch:{ IllegalStateException -> 0x00af }
        r0 = r8.b;	 Catch:{ IllegalStateException -> 0x00af }
        r0 = r0 + 1;
        r8.b = r0;	 Catch:{ IllegalStateException -> 0x00af }
    L_0x0052:
        r0 = 4;
    L_0x0053:
        r1 = r8.d;
        r5 = r0 + -1;
        r1 = r1 & r5;
        r5 = r0 + -1;
        if (r1 != r5) goto L_0x00a8;
    L_0x005c:
        r1 = r8.b;
        if (r1 != 0) goto L_0x0083;
    L_0x0060:
        r1 = r8.c;
        r5 = r1.b;
        r6 = r5.b;
        r7 = r6.b;	 Catch:{ IllegalStateException -> 0x00b1 }
        r5.b = r7;	 Catch:{ IllegalStateException -> 0x00b1 }
        r8.c = r5;	 Catch:{ IllegalStateException -> 0x00b1 }
        r5.h = r6;	 Catch:{ IllegalStateException -> 0x00b1 }
        r5.a = r1;	 Catch:{ IllegalStateException -> 0x00b1 }
        r7 = r1.i;	 Catch:{ IllegalStateException -> 0x00b1 }
        r7 = r7 + 1;
        r5.i = r7;	 Catch:{ IllegalStateException -> 0x00b1 }
        r6.b = r5;	 Catch:{ IllegalStateException -> 0x00b1 }
        r1.b = r5;	 Catch:{ IllegalStateException -> 0x00b1 }
        if (r4 == 0) goto L_0x00a4;
    L_0x007c:
        r1 = com.google.aX.a;	 Catch:{ IllegalStateException -> 0x00b3 }
        if (r1 == 0) goto L_0x00b5;
    L_0x0080:
        r1 = r2;
    L_0x0081:
        com.google.aX.a = r1;
    L_0x0083:
        r1 = r8.b;
        if (r1 != r3) goto L_0x009c;
    L_0x0087:
        r1 = r8.c;
        r5 = r1.b;
        r8.c = r5;	 Catch:{ IllegalStateException -> 0x00b7 }
        r5.a = r1;	 Catch:{ IllegalStateException -> 0x00b7 }
        r6 = r1.i;	 Catch:{ IllegalStateException -> 0x00b7 }
        r6 = r6 + 1;
        r5.i = r6;	 Catch:{ IllegalStateException -> 0x00b7 }
        r1.b = r5;	 Catch:{ IllegalStateException -> 0x00b7 }
        r1 = 0;
        r8.b = r1;	 Catch:{ IllegalStateException -> 0x00b7 }
        if (r4 == 0) goto L_0x00a4;
    L_0x009c:
        r1 = r8.b;	 Catch:{ IllegalStateException -> 0x00b9 }
        r5 = 2;
        if (r1 != r5) goto L_0x00a4;
    L_0x00a1:
        r1 = 0;
        r8.b = r1;	 Catch:{ IllegalStateException -> 0x00b9 }
    L_0x00a4:
        r0 = r0 * 2;
        if (r4 == 0) goto L_0x0053;
    L_0x00a8:
        return;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;
    L_0x00b5:
        r1 = r3;
        goto L_0x0081;
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.hG.a(com.google.c2):void");
    }
}
