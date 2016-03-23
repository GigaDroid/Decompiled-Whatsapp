package com.google;

import java.util.HashMap;
import java.util.Map;

final class e3 {
    private final Map a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int[] a() {
        /*
        r6 = this;
        r3 = com.google.g0.a;
        r0 = -1;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r1 = r6.a;
        r1 = r1.entrySet();
        r5 = r1.iterator();
        r2 = r0;
    L_0x0013:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0057;
    L_0x0019:
        r0 = r5.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getValue();
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        if (r1 <= r2) goto L_0x0041;
    L_0x002b:
        r1 = r0.getValue();
        r1 = (java.lang.Integer) r1;
        r2 = r1.intValue();
        r4.clear();
        r1 = r0.getKey();
        r4.add(r1);
        if (r3 == 0) goto L_0x0054;
    L_0x0041:
        r1 = r0.getValue();
        r1 = (java.lang.Integer) r1;
        r1 = r1.intValue();
        if (r1 != r2) goto L_0x0054;
    L_0x004d:
        r0 = r0.getKey();
        r4.add(r0);
    L_0x0054:
        r0 = r2;
        if (r3 == 0) goto L_0x005c;
    L_0x0057:
        r0 = com.google.Q.a(r4);
        return r0;
    L_0x005c:
        r2 = r0;
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.e3.a():int[]");
    }

    void a(int i) {
        Integer num = (Integer) this.a.get(Integer.valueOf(i));
        if (num == null) {
            num = Integer.valueOf(0);
        }
        this.a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }

    e3() {
        this.a = new HashMap();
    }
}
