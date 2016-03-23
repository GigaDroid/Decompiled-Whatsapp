package com.whatsapp.gallerypicker;

class bb implements Runnable {
    final ba a;

    private bb(ba baVar) {
        this.a = baVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r3 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
    L_0x0002:
        r0 = r6.a;
        r1 = com.whatsapp.gallerypicker.ba.c(r0);
        monitor-enter(r1);
        r0 = r6.a;	 Catch:{ all -> 0x0071 }
        r0 = com.whatsapp.gallerypicker.ba.b(r0);	 Catch:{ all -> 0x0071 }
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        monitor-exit(r1);	 Catch:{ all -> 0x0071 }
        if (r3 == 0) goto L_0x0078;
    L_0x0014:
        r0 = r6.a;	 Catch:{ all -> 0x0071 }
        r0 = com.whatsapp.gallerypicker.ba.c(r0);	 Catch:{ all -> 0x0071 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0071 }
        if (r0 != 0) goto L_0x0066;
    L_0x0020:
        r0 = r6.a;	 Catch:{ all -> 0x0071 }
        r0 = com.whatsapp.gallerypicker.ba.c(r0);	 Catch:{ all -> 0x0071 }
        r2 = 0;
        r0 = r0.remove(r2);	 Catch:{ all -> 0x0071 }
        r0 = (com.whatsapp.gallerypicker.a4) r0;	 Catch:{ all -> 0x0071 }
        monitor-exit(r1);	 Catch:{ all -> 0x0071 }
        r1 = r0.b;
        r2 = com.whatsapp.gallerypicker.ba.a();
        r1 = r1.a();
        r1 = r2.get(r1);
        r1 = (android.graphics.Bitmap) r1;
        if (r1 != 0) goto L_0x0076;
    L_0x0040:
        r2 = r0.b;	 Catch:{ InterruptedException -> 0x0074 }
        r2 = r2.b();	 Catch:{ InterruptedException -> 0x0074 }
    L_0x0046:
        if (r2 == 0) goto L_0x0002;
    L_0x0048:
        r4 = com.whatsapp.gallerypicker.ba.a();
        r5 = r0.b;
        r5 = r5.a();
        r4.put(r5, r2);
        r0 = r0.a;
        r4 = r6.a;
        r4 = com.whatsapp.gallerypicker.ba.a(r4);
        r5 = new com.whatsapp.gallerypicker.bo;
        r5.<init>(r6, r0, r2, r1);
        r4.post(r5);
        goto L_0x0002;
    L_0x0066:
        r0 = r6.a;	 Catch:{ InterruptedException -> 0x0079 }
        r0 = com.whatsapp.gallerypicker.ba.c(r0);	 Catch:{ InterruptedException -> 0x0079 }
        r0.wait();	 Catch:{ InterruptedException -> 0x0079 }
    L_0x006f:
        monitor-exit(r1);	 Catch:{ all -> 0x0071 }
        goto L_0x0002;
    L_0x0071:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0071 }
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;
    L_0x0076:
        r2 = r1;
        goto L_0x0046;
    L_0x0078:
        return;
    L_0x0079:
        r0 = move-exception;
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.bb.run():void");
    }

    bb(ba baVar, br brVar) {
        this(baVar);
    }
}
