package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.protocol.b3;
import com.whatsapp.protocol.ct;

final class a2 extends Handler implements ar {
    final MessageService a;

    public void a(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        obtainMessage(4, i, 0).sendToTarget();
    }

    public void a(ct ctVar) {
        obtainMessage(9, ctVar).sendToTarget();
    }

    public void a(Message message) {
        message.what = 5;
        if (co.d(message) == 58) {
            sendMessageAtFrontOfQueue(message);
            if (co.a == 0) {
                return;
            }
        }
        sendMessage(message);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r5) {
        /*
        r4 = this;
        r1 = 1;
        r2 = com.whatsapp.messaging.co.a;
        r0 = r5.what;
        switch(r0) {
            case 0: goto L_0x0009;
            case 1: goto L_0x0014;
            case 2: goto L_0x001b;
            case 3: goto L_0x0026;
            case 4: goto L_0x002d;
            case 5: goto L_0x0047;
            case 6: goto L_0x0039;
            case 7: goto L_0x0040;
            case 8: goto L_0x004e;
            case 9: goto L_0x0059;
            default: goto L_0x0008;
        };
    L_0x0008:
        return;
    L_0x0009:
        r3 = r4.a;
        r0 = r5.obj;
        r0 = (com.whatsapp.messaging.a8) r0;
        com.whatsapp.messaging.MessageService.a(r3, r0);
        if (r2 == 0) goto L_0x0008;
    L_0x0014:
        r0 = r4.a;
        com.whatsapp.messaging.MessageService.d(r0);
        if (r2 == 0) goto L_0x0008;
    L_0x001b:
        r3 = r4.a;
        r0 = r5.obj;
        r0 = (com.whatsapp.protocol.b3) r0;
        com.whatsapp.messaging.MessageService.a(r3, r0);
        if (r2 == 0) goto L_0x0008;
    L_0x0026:
        r0 = r4.a;
        com.whatsapp.messaging.MessageService.a(r0);
        if (r2 == 0) goto L_0x0008;
    L_0x002d:
        r3 = r4.a;
        r0 = r5.arg1;
        if (r0 != r1) goto L_0x0063;
    L_0x0033:
        r0 = r1;
    L_0x0034:
        com.whatsapp.messaging.MessageService.b(r3, r0);
        if (r2 == 0) goto L_0x0008;
    L_0x0039:
        r0 = r4.a;
        com.whatsapp.messaging.MessageService.f(r0);
        if (r2 == 0) goto L_0x0008;
    L_0x0040:
        r0 = r4.a;
        com.whatsapp.messaging.MessageService.h(r0);
        if (r2 == 0) goto L_0x0008;
    L_0x0047:
        r0 = r4.a;
        com.whatsapp.messaging.MessageService.a(r0, r5);
        if (r2 == 0) goto L_0x0008;
    L_0x004e:
        r1 = r4.a;
        r0 = r5.obj;
        r0 = (java.lang.String) r0;
        com.whatsapp.messaging.MessageService.a(r1, r0);
        if (r2 == 0) goto L_0x0008;
    L_0x0059:
        r1 = r4.a;
        r0 = r5.obj;
        r0 = (com.whatsapp.protocol.ct) r0;
        com.whatsapp.messaging.MessageService.a(r1, r0);
        goto L_0x0008;
    L_0x0063:
        r0 = 0;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.a2.handleMessage(android.os.Message):void");
    }

    public void b() {
        sendEmptyMessage(1);
    }

    public a2(MessageService messageService, Looper looper) {
        this.a = messageService;
        super(looper);
    }

    public void a() {
        sendEmptyMessage(6);
    }

    public void a(String str) {
        obtainMessage(8, str).sendToTarget();
    }

    public void c() {
        sendEmptyMessage(3);
    }

    public void a(a8 a8Var) {
        obtainMessage(0, a8Var).sendToTarget();
    }

    public void d() {
        sendEmptyMessage(7);
    }

    public void a(b3 b3Var) {
        obtainMessage(2, b3Var).sendToTarget();
    }
}
