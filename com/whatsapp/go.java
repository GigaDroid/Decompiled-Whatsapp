package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import com.google.android.maps.MapView;

class go extends Handler {
    final MapView a;
    final m_ b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r5) {
        /*
        r4 = this;
        r0 = r4.b;
        r0 = com.whatsapp.m_.c(r0);
        r1 = r4.b;
        r1 = com.whatsapp.m_.a(r1);
        if (r0 != r1) goto L_0x001d;
    L_0x000e:
        r0 = r4.b;
        r1 = r4.b;
        r1 = com.whatsapp.m_.b(r1);
        com.whatsapp.m_.a(r0, r1);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0028;
    L_0x001d:
        r0 = r4.b;
        r1 = r4.b;
        r1 = com.whatsapp.m_.a(r1);
        com.whatsapp.m_.a(r0, r1);
    L_0x0028:
        r0 = r4.a;
        r1 = r4.b;
        r1 = com.whatsapp.m_.c(r1);
        r1 = r1.getBounds();
        r0.invalidate(r1);
        r0 = 0;
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r4.sendEmptyMessageDelayed(r0, r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.go.handleMessage(android.os.Message):void");
    }

    go(m_ m_Var, Looper looper, MapView mapView) {
        this.b = m_Var;
        this.a = mapView;
        super(looper);
    }
}
