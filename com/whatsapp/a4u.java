package com.whatsapp;

import android.view.animation.Animation;
import com.whatsapp.IdentityVerificationActivity.QrImageView;

class a4u extends Animation {
    final QrImageView a;

    private a4u(QrImageView qrImageView) {
        this.a = qrImageView;
    }

    a4u(QrImageView qrImageView, axi com_whatsapp_axi) {
        this(qrImageView);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void applyTransformation(float r6, android.view.animation.Transformation r7) {
        /*
        r5 = this;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x0015;
    L_0x000a:
        r0 = r5.a;
        r0 = com.whatsapp.IdentityVerificationActivity.QrImageView.b(r0);
        r0.clear();
        if (r1 == 0) goto L_0x006c;
    L_0x0015:
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0020;
    L_0x0019:
        r0 = r6 - r2;
        r2 = 1061158912; // 0x3f400000 float:0.75 double:5.24282163E-315;
        r0 = r0 / r2;
        if (r1 == 0) goto L_0x0021;
    L_0x0020:
        r0 = 0;
    L_0x0021:
        r2 = r5.a;
        r2 = com.whatsapp.IdentityVerificationActivity.QrImageView.a(r2);
        r2 = r2.a();
        r2 = r2.b();
        r3 = r5.a;
        r3 = com.whatsapp.IdentityVerificationActivity.QrImageView.a(r3);
        r3 = r3.a();
        r3 = r3.c();
        r2 = r2 * r3;
        r2 = (float) r2;
        r0 = r4 - r0;
        r0 = r0 * r2;
        r0 = (int) r0;
    L_0x0043:
        r2 = r5.a;
        r2 = com.whatsapp.IdentityVerificationActivity.QrImageView.b(r2);
        r2 = r2.size();
        if (r2 <= r0) goto L_0x006c;
    L_0x004f:
        r2 = r5.a;
        r2 = com.whatsapp.IdentityVerificationActivity.QrImageView.b(r2);
        r3 = com.whatsapp.IdentityVerificationActivity.QrImageView.a();
        r4 = r5.a;
        r4 = com.whatsapp.IdentityVerificationActivity.QrImageView.b(r4);
        r4 = r4.size();
        r3 = r3.nextInt(r4);
        r2.remove(r3);
        if (r1 == 0) goto L_0x0043;
    L_0x006c:
        r0 = r5.a;
        r0.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a4u.applyTransformation(float, android.view.animation.Transformation):void");
    }
}
