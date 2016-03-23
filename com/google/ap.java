package com.google;

public final class ap extends aU {
    private final aH[] b;

    public void a() {
        int i = aU.a;
        aH[] aHVarArr = this.b;
        int length = aHVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            aHVarArr[i2].a();
            i2++;
            if (i != 0) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ap(java.util.Map r4) {
        /*
        r3 = this;
        r3.<init>();
        if (r4 != 0) goto L_0x007e;
    L_0x0005:
        r0 = 0;
    L_0x0006:
        r1 = new java.util.ArrayList;
        r1.<init>();
        if (r0 == 0) goto L_0x0051;
    L_0x000d:
        r2 = com.google.gg.EAN_13;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0021;
    L_0x0015:
        r2 = new com.google.a1;
        r2.<init>();
        r1.add(r2);
        r2 = com.google.aU.a;
        if (r2 == 0) goto L_0x0031;
    L_0x0021:
        r2 = com.google.gg.UPC_A;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0031;
    L_0x0029:
        r2 = new com.google.ay;
        r2.<init>();
        r1.add(r2);
    L_0x0031:
        r2 = com.google.gg.EAN_8;
        r2 = r0.contains(r2);
        if (r2 == 0) goto L_0x0041;
    L_0x0039:
        r2 = new com.google.aQ;
        r2.<init>();
        r1.add(r2);
    L_0x0041:
        r2 = com.google.gg.UPC_E;
        r0 = r0.contains(r2);
        if (r0 == 0) goto L_0x0051;
    L_0x0049:
        r0 = new com.google.ah;
        r0.<init>();
        r1.add(r0);
    L_0x0051:
        r0 = r1.isEmpty();
        if (r0 == 0) goto L_0x006f;
    L_0x0057:
        r0 = new com.google.a1;
        r0.<init>();
        r1.add(r0);
        r0 = new com.google.aQ;
        r0.<init>();
        r1.add(r0);
        r0 = new com.google.ah;
        r0.<init>();
        r1.add(r0);
    L_0x006f:
        r0 = r1.size();
        r0 = new com.google.aH[r0];
        r0 = r1.toArray(r0);
        r0 = (com.google.aH[]) r0;
        r3.b = r0;
        return;
    L_0x007e:
        r0 = com.google.b3.POSSIBLE_FORMATS;
        r0 = r4.get(r0);
        r0 = (java.util.Collection) r0;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ap.<init>(java.util.Map):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.f6 a(int r8, com.google.d_ r9, java.util.Map r10) {
        /*
        r7 = this;
        r2 = 1;
        r3 = 0;
        r1 = com.google.aH.a(r9);
        r4 = r7.b;
        r5 = r4.length;
        r0 = r3;
    L_0x000a:
        if (r0 >= r5) goto L_0x0073;
    L_0x000c:
        r6 = r4[r0];
        r4 = r6.a(r8, r9, r1, r10);	 Catch:{ aK -> 0x006c }
        r0 = r4.d();	 Catch:{ aK -> 0x0059 }
        r1 = com.google.gg.EAN_13;	 Catch:{ aK -> 0x0059 }
        if (r0 != r1) goto L_0x005d;
    L_0x001a:
        r0 = r4.c();	 Catch:{ aK -> 0x005b }
        r1 = 0;
        r0 = r0.charAt(r1);	 Catch:{ aK -> 0x005b }
        r1 = 48;
        if (r0 != r1) goto L_0x005d;
    L_0x0027:
        r1 = r2;
    L_0x0028:
        if (r10 != 0) goto L_0x005f;
    L_0x002a:
        r0 = 0;
    L_0x002b:
        if (r0 == 0) goto L_0x0035;
    L_0x002d:
        r5 = com.google.gg.UPC_A;	 Catch:{ aK -> 0x0068 }
        r0 = r0.contains(r5);	 Catch:{ aK -> 0x0068 }
        if (r0 == 0) goto L_0x0036;
    L_0x0035:
        r3 = r2;
    L_0x0036:
        if (r1 == 0) goto L_0x006a;
    L_0x0038:
        if (r3 == 0) goto L_0x006a;
    L_0x003a:
        r0 = new com.google.f6;
        r1 = r4.c();
        r1 = r1.substring(r2);
        r2 = r4.a();
        r3 = r4.e();
        r5 = com.google.gg.UPC_A;
        r0.<init>(r1, r2, r3, r5);
        r1 = r4.b();
        r0.a(r1);
    L_0x0058:
        return r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ aK -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r1 = r3;
        goto L_0x0028;
    L_0x005f:
        r0 = com.google.b3.POSSIBLE_FORMATS;
        r0 = r10.get(r0);
        r0 = (java.util.Collection) r0;
        goto L_0x002b;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = r4;
        goto L_0x0058;
    L_0x006c:
        r6 = move-exception;
        r0 = r0 + 1;
        r6 = com.google.aU.a;
        if (r6 == 0) goto L_0x000a;
    L_0x0073:
        r0 = com.google.aN.a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ap.a(int, com.google.d_, java.util.Map):com.google.f6");
    }
}
