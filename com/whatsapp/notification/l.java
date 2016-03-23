package com.whatsapp.notification;

import android.text.TextWatcher;
import com.whatsapp.aam;

class l implements TextWatcher {
    final PopupNotification a;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aam.a(PopupNotification.c(this.a), charSequence);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r8) {
        /*
        r7 = this;
        r6 = 8;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.notification.PopupNotification.p;
        com.whatsapp.App.a_();
        r0 = r8.toString();
        r4 = r0.length();
        if (r4 <= 0) goto L_0x001c;
    L_0x0013:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.e(r4);
        r4.setVisibility(r2);
    L_0x001c:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.a(r4);
        if (r4 == 0) goto L_0x0042;
    L_0x0024:
        r4 = r0.length();
        if (r4 == 0) goto L_0x0037;
    L_0x002a:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.a(r4);
        r4 = r4.p;
        com.whatsapp.App.b(r4, r2);
        if (r3 == 0) goto L_0x0042;
    L_0x0037:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.a(r4);
        r4 = r4.p;
        com.whatsapp.App.I(r4);
    L_0x0042:
        r4 = r7.a;
        r5 = r7.a;
        r5 = com.whatsapp.notification.PopupNotification.c(r5);
        r5 = r5.getPaint();
        com.whatsapp.a28.a(r8, r4, r5);
        r0 = r0.trim();
        r0 = r0.length();
        if (r0 <= 0) goto L_0x00dc;
    L_0x005b:
        r0 = r1;
    L_0x005c:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.e(r4);
        r4.setEnabled(r0);
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.n(r4);
        r4 = r4.getVisibility();
        if (r4 != r6) goto L_0x00a1;
    L_0x0071:
        if (r0 != 0) goto L_0x00a1;
    L_0x0073:
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.n(r4);
        r5 = com.whatsapp.a9z.a(r1);
        r4.startAnimation(r5);
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.n(r4);
        r4.setVisibility(r2);
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.e(r4);
        r5 = com.whatsapp.a9z.a(r2);
        r4.startAnimation(r5);
        r4 = r7.a;
        r4 = com.whatsapp.notification.PopupNotification.e(r4);
        r4.setVisibility(r6);
        if (r3 == 0) goto L_0x00db;
    L_0x00a1:
        r3 = r7.a;
        r3 = com.whatsapp.notification.PopupNotification.n(r3);
        r3 = r3.getVisibility();
        if (r3 != 0) goto L_0x00db;
    L_0x00ad:
        if (r0 == 0) goto L_0x00db;
    L_0x00af:
        r0 = r7.a;
        r0 = com.whatsapp.notification.PopupNotification.n(r0);
        r3 = com.whatsapp.a9z.a(r2);
        r0.startAnimation(r3);
        r0 = r7.a;
        r0 = com.whatsapp.notification.PopupNotification.n(r0);
        r0.setVisibility(r6);
        r0 = r7.a;
        r0 = com.whatsapp.notification.PopupNotification.e(r0);
        r1 = com.whatsapp.a9z.a(r1);
        r0.startAnimation(r1);
        r0 = r7.a;
        r0 = com.whatsapp.notification.PopupNotification.e(r0);
        r0.setVisibility(r2);
    L_0x00db:
        return;
    L_0x00dc:
        r0 = r2;
        goto L_0x005c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.l.afterTextChanged(android.text.Editable):void");
    }

    l(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
