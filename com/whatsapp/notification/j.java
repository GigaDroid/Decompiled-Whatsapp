package com.whatsapp.notification;

import com.whatsapp.protocol.co;

class j implements Runnable {
    final String a;
    final co b;
    final ao c;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r9 = this;
        r8 = 7;
        r4 = 1;
        r3 = 0;
        r5 = com.whatsapp.notification.PopupNotification.p;
        r0 = r9.c;
        r0 = com.whatsapp.notification.ao.a(r0);
        r1 = r9.a;
        r0 = r0.get(r1);
        r0 = (java.util.List) r0;
        if (r0 != 0) goto L_0x0085;
    L_0x0015:
        r0 = com.whatsapp.App.as;
        r1 = r9.a;
        r0 = r0.b(r1);
        r1 = r0.d;
        if (r1 <= r4) goto L_0x0031;
    L_0x0021:
        r1 = com.whatsapp.App.aK;
        r2 = r9.a;
        r0 = r0.d;
        r0 = java.lang.Math.min(r0, r8);
        r0 = r1.b(r2, r0);
        if (r5 == 0) goto L_0x0036;
    L_0x0031:
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x0036:
        r1 = r9.c;
        r1 = com.whatsapp.notification.ao.a(r1);
        r2 = r9.a;
        r1.put(r2, r0);
        r1 = r0;
    L_0x0042:
        r6 = r1.iterator();
        r2 = r3;
    L_0x0047:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0083;
    L_0x004d:
        r0 = r6.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r0 = r0.k;
        r7 = r9.b;
        r7 = r7.k;
        r0 = r0.equals(r7);
        if (r0 == 0) goto L_0x0081;
    L_0x005f:
        if (r5 == 0) goto L_0x007f;
    L_0x0061:
        r0 = r4;
    L_0x0062:
        if (r5 == 0) goto L_0x007d;
    L_0x0064:
        if (r0 != 0) goto L_0x007c;
    L_0x0066:
        r0 = r9.b;
        r1.add(r3, r0);
    L_0x006b:
        r0 = r1.size();
        if (r0 <= r8) goto L_0x007c;
    L_0x0071:
        r0 = r1.size();
        r0 = r0 + -1;
        r1.remove(r0);
        if (r5 == 0) goto L_0x006b;
    L_0x007c:
        return;
    L_0x007d:
        r2 = r0;
        goto L_0x0047;
    L_0x007f:
        r0 = r4;
        goto L_0x0064;
    L_0x0081:
        r0 = r2;
        goto L_0x0062;
    L_0x0083:
        r0 = r2;
        goto L_0x0064;
    L_0x0085:
        r1 = r0;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.j.run():void");
    }

    j(ao aoVar, String str, co coVar) {
        this.c = aoVar;
        this.a = str;
        this.b = coVar;
    }
}
