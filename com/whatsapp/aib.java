package com.whatsapp;

import android.os.Handler;
import android.os.Looper;

class aib extends Handler {
    int a;
    final RecordAudio b;

    aib(RecordAudio recordAudio, Looper looper) {
        this.b = recordAudio;
        super(looper);
        this.a = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r15) {
        /*
        r14 = this;
        r13 = 4;
        r12 = 3;
        r2 = 0;
        r1 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.a(r0);
        if (r0 != r12) goto L_0x0046;
    L_0x000e:
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.f(r0);
        r0 = r0.a();
        r4 = r0 / 1000;
        r5 = r14.a;
        if (r4 == r5) goto L_0x0032;
    L_0x001e:
        r4 = r14.b;
        r4 = com.whatsapp.RecordAudio.l(r4);
        r5 = r0 / 1000;
        r6 = (long) r5;
        r5 = android.text.format.DateUtils.formatElapsedTime(r6);
        r4.setText(r5);
        r4 = r0 / 1000;
        r14.a = r4;
    L_0x0032:
        r4 = r14.b;
        r4 = com.whatsapp.RecordAudio.d(r4);
        r4.setProgress(r0);
        r4 = r14.b;
        r4 = com.whatsapp.RecordAudio.j(r4);
        r4.setProgress(r0);
        if (r3 == 0) goto L_0x011a;
    L_0x0046:
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.a(r0);
        if (r0 != r1) goto L_0x011a;
    L_0x004e:
        r4 = java.lang.System.currentTimeMillis();
        r0 = r14.b;
        r6 = com.whatsapp.RecordAudio.i(r0);
        r4 = r4 - r6;
        r6 = 120000; // 0x1d4c0 float:1.68156E-40 double:5.9288E-319;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0117;
    L_0x0060:
        r0 = r14.b;
        com.whatsapp.RecordAudio.e(r0);
        r0 = r14.b;
        com.whatsapp.RecordAudio.c(r0, r13);
        r0 = r14.b;
        r6 = r14.b;
        r6 = com.whatsapp.RecordAudio.a(r6);
        com.whatsapp.RecordAudio.b(r0, r6);
        if (r3 == 0) goto L_0x0115;
    L_0x0077:
        r0 = r1;
    L_0x0078:
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r4 / r6;
        r8 = r14.b;
        r8 = com.whatsapp.RecordAudio.l(r8);
        r10 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r10 = r10 - r6;
        r9 = android.text.format.DateUtils.formatElapsedTime(r10);
        r8.setText(r9);
        r8 = r14.b;
        r8 = com.whatsapp.RecordAudio.b(r8);
        r6 = android.text.format.DateUtils.formatElapsedTime(r6);
        r8.setText(r6);
        r6 = r14.b;
        r6 = com.whatsapp.RecordAudio.d(r6);
        r4 = (int) r4;
        r6.setProgress(r4);
    L_0x00a3:
        if (r0 != 0) goto L_0x00d6;
    L_0x00a5:
        r0 = r14.b;
        r0 = r0.isFinishing();
        if (r0 != 0) goto L_0x00d6;
    L_0x00ad:
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.a(r0);
        if (r0 != r12) goto L_0x00c1;
    L_0x00b5:
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.f(r0);
        r0 = r0.f();
        if (r0 != 0) goto L_0x00c9;
    L_0x00c1:
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.a(r0);
        if (r0 != r1) goto L_0x00d6;
    L_0x00c9:
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.c(r0);
        r4 = 50;
        r0.sendEmptyMessageDelayed(r2, r4);
        if (r3 == 0) goto L_0x0114;
    L_0x00d6:
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.a(r0);
        if (r0 != r12) goto L_0x00e9;
    L_0x00de:
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.j(r0);
        r0.setProgress(r2);
        if (r3 == 0) goto L_0x0104;
    L_0x00e9:
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.a(r0);
        if (r0 != r1) goto L_0x0104;
    L_0x00f1:
        r0 = r14.b;
        r0 = com.whatsapp.RecordAudio.d(r0);
        r1 = r14.b;
        r1 = com.whatsapp.RecordAudio.d(r1);
        r1 = r1.getMax();
        r0.setProgress(r1);
    L_0x0104:
        r0 = r14.b;
        com.whatsapp.RecordAudio.c(r0, r13);
        r0 = r14.b;
        r1 = r14.b;
        r1 = com.whatsapp.RecordAudio.a(r1);
        com.whatsapp.RecordAudio.b(r0, r1);
    L_0x0114:
        return;
    L_0x0115:
        r0 = r1;
        goto L_0x00a3;
    L_0x0117:
        r0 = r2;
        goto L_0x0078;
    L_0x011a:
        r0 = r2;
        goto L_0x00a3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aib.handleMessage(android.os.Message):void");
    }
}
