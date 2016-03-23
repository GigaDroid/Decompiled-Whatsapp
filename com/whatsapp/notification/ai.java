package com.whatsapp.notification;

import android.view.MotionEvent;
import com.whatsapp.App;
import com.whatsapp._n;

class ai implements _n {
    boolean a;
    final PopupNotification b;

    ai(PopupNotification popupNotification) {
        this.b = popupNotification;
    }

    public void a() {
    }

    public void a(MotionEvent motionEvent) {
    }

    public void c() {
        App.a_();
        if (PopupNotification.h(this.b) != null) {
            PopupNotification.s(this.b).add(PopupNotification.h(this.b).k);
        }
        if (PopupNotification.a(this.b) != null) {
            PopupNotification.l(this.b).add(PopupNotification.a(this.b).p);
        }
    }

    public void b() {
    }

    public void b(int i) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r6) {
        /*
        r5 = this;
        r4 = 1;
        r3 = 0;
        r0 = com.whatsapp.notification.PopupNotification.p;
        r1 = r5.a;
        if (r1 == 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r5.a = r4;
        r1 = r5.b;
        r1 = com.whatsapp.notification.PopupNotification.q(r1);
        r1 = r1.size();
        if (r1 != r4) goto L_0x001e;
    L_0x0017:
        r1 = r5.b;
        r1.c(r3);
        if (r0 == 0) goto L_0x0089;
    L_0x001e:
        if (r6 != 0) goto L_0x005b;
    L_0x0020:
        r1 = r5.b;
        r1 = com.whatsapp.notification.PopupNotification.f(r1);
        r2 = r5.b;
        r2 = com.whatsapp.notification.PopupNotification.q(r2);
        r2 = r2.size();
        r2 = r2 + 1;
        r1.setCurrentScreen(r2);
        r1 = r5.b;
        r1 = com.whatsapp.notification.PopupNotification.f(r1);
        r2 = r5.b;
        r2 = com.whatsapp.notification.PopupNotification.q(r2);
        r2 = r2.size();
        r1.a(r2);
        r1 = r5.b;
        r2 = r5.b;
        r2 = com.whatsapp.notification.PopupNotification.q(r2);
        r2 = r2.size();
        r2 = r2 + -1;
        r1.c(r2);
        if (r0 == 0) goto L_0x0089;
    L_0x005b:
        r1 = r5.b;
        r1 = com.whatsapp.notification.PopupNotification.q(r1);
        r1 = r1.size();
        r1 = r1 + 1;
        if (r6 != r1) goto L_0x0082;
    L_0x0069:
        r1 = r5.b;
        r1 = com.whatsapp.notification.PopupNotification.f(r1);
        r1.setCurrentScreen(r3);
        r1 = r5.b;
        r1 = com.whatsapp.notification.PopupNotification.f(r1);
        r1.a(r4);
        r1 = r5.b;
        r1.c(r3);
        if (r0 == 0) goto L_0x0089;
    L_0x0082:
        r0 = r5.b;
        r1 = r6 + -1;
        r0.c(r1);
    L_0x0089:
        r5.a = r3;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.ai.a(int):void");
    }
}
