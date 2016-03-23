package com.whatsapp;

import android.view.View.OnClickListener;

class p1 implements OnClickListener {
    final RecordAudio a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r5) {
        /*
        r4 = this;
        r3 = 5;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x0080 }
        r1 = com.whatsapp.RecordAudio.f(r1);	 Catch:{ IllegalStateException -> 0x0080 }
        r1 = r1.f();	 Catch:{ IllegalStateException -> 0x0080 }
        if (r1 == 0) goto L_0x002a;
    L_0x000f:
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x0080 }
        r1 = com.whatsapp.RecordAudio.c(r1);	 Catch:{ IllegalStateException -> 0x0080 }
        r2 = 0;
        r1.removeMessages(r2);	 Catch:{ IllegalStateException -> 0x0080 }
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x0080 }
        r1 = com.whatsapp.RecordAudio.f(r1);	 Catch:{ IllegalStateException -> 0x0080 }
        r1.i();	 Catch:{ IllegalStateException -> 0x0080 }
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x0080 }
        r2 = 5;
        com.whatsapp.RecordAudio.c(r1, r2);	 Catch:{ IllegalStateException -> 0x0080 }
        if (r0 == 0) goto L_0x0074;
    L_0x002a:
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x0082 }
        r1 = com.whatsapp.RecordAudio.a(r1);	 Catch:{ IllegalStateException -> 0x0082 }
        if (r1 != r3) goto L_0x0091;
    L_0x0032:
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x0084 }
        r1 = com.whatsapp.RecordAudio.f(r1);	 Catch:{ IllegalStateException -> 0x0084 }
        r1 = r1.a();	 Catch:{ IllegalStateException -> 0x0084 }
        r2 = r4.a;	 Catch:{ IllegalStateException -> 0x0084 }
        r2 = com.whatsapp.RecordAudio.f(r2);	 Catch:{ IllegalStateException -> 0x0084 }
        r2 = r2.d();	 Catch:{ IllegalStateException -> 0x0084 }
        if (r1 == r2) goto L_0x0091;
    L_0x0048:
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r1 = com.whatsapp.RecordAudio.f(r1);	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r2 = r4.a;	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r2 = com.whatsapp.RecordAudio.j(r2);	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r2 = r2.getProgress();	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r1.a(r2);	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r1 = com.whatsapp.RecordAudio.f(r1);	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r1.c();	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r2 = 3;
        com.whatsapp.RecordAudio.c(r1, r2);	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r1 = com.whatsapp.RecordAudio.c(r1);	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
        r2 = 0;
        r1.sendEmptyMessage(r2);	 Catch:{ IllegalStateException -> 0x0086, IOException -> 0x00a3 }
    L_0x0074:
        r0 = r4.a;
        r1 = r4.a;
        r1 = com.whatsapp.RecordAudio.a(r1);
        com.whatsapp.RecordAudio.b(r0, r1);
        return;
    L_0x0080:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0084 }
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r1 = move-exception;
    L_0x0087:
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x00a1 }
        r2 = 2131231156; // 0x7f0801b4 float:1.8078385E38 double:1.0529680975E-314;
        r1.a(r2);	 Catch:{ IllegalStateException -> 0x00a1 }
        if (r0 == 0) goto L_0x0074;
    L_0x0091:
        r0 = r4.a;	 Catch:{ IllegalStateException -> 0x00a1 }
        r1 = r4.a;	 Catch:{ IllegalStateException -> 0x00a1 }
        r1 = com.whatsapp.RecordAudio.j(r1);	 Catch:{ IllegalStateException -> 0x00a1 }
        r1 = r1.getProgress();	 Catch:{ IllegalStateException -> 0x00a1 }
        com.whatsapp.RecordAudio.a(r0, r1);	 Catch:{ IllegalStateException -> 0x00a1 }
        goto L_0x0074;
    L_0x00a1:
        r0 = move-exception;
        throw r0;
    L_0x00a3:
        r1 = move-exception;
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.p1.onClick(android.view.View):void");
    }

    p1(RecordAudio recordAudio) {
        this.a = recordAudio;
    }
}
