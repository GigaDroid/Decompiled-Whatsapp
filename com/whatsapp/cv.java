package com.whatsapp;

import java.util.ArrayList;
import java.util.Collection;

final class cv extends c_ {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r4) {
        /*
        r3 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = 1;
        r2 = com.whatsapp.App.aK;
        r2 = r2.t(r4);
        if (r2 == 0) goto L_0x0011;
    L_0x000b:
        r0 = com.whatsapp.qa.a(r4);
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        com.whatsapp.qa.b(r4);
    L_0x0014:
        if (r0 == 0) goto L_0x001b;
    L_0x0016:
        com.whatsapp.App.a7();
        if (r1 == 0) goto L_0x001e;
    L_0x001b:
        com.whatsapp.App.l(r4);
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cv.a(java.lang.String):void");
    }

    public void b(String str) {
        qa.b(str);
        App.a7();
    }

    public void a(String str, ArrayList arrayList) {
        if (App.C(str)) {
            a25.a((Collection) arrayList);
        }
    }

    cv() {
    }

    public void a(String str, boolean z) {
        App.a7();
    }

    public void c(String str) {
        if (App.aK.t(str)) {
            qa.a(str);
            App.a7();
        }
    }
}
