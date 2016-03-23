package com.whatsapp;

class x3 extends Thread {
    private long a;
    final VideoPreviewActivity b;
    private Object c;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r6 = this;
        r0 = -1;
    L_0x0002:
        r2 = r6.c;	 Catch:{ InterruptedException -> 0x0037 }
        monitor-enter(r2);	 Catch:{ InterruptedException -> 0x0037 }
        r4 = r6.a;	 Catch:{ all -> 0x0039 }
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0010;
    L_0x000b:
        r0 = r6.c;	 Catch:{ all -> 0x0039 }
        r0.wait();	 Catch:{ all -> 0x0039 }
    L_0x0010:
        r0 = r6.a;	 Catch:{ all -> 0x0039 }
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        r2 = r6.b;	 Catch:{ InterruptedException -> 0x0037 }
        r2 = com.whatsapp.VideoPreviewActivity.i(r2);	 Catch:{ InterruptedException -> 0x0037 }
        r2 = r2.isPlaying();	 Catch:{ InterruptedException -> 0x0037 }
        if (r2 != 0) goto L_0x0002;
    L_0x001f:
        r2 = r6.b;	 Catch:{ InterruptedException -> 0x0037 }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r0;
        r2 = r2.a(r4);	 Catch:{ InterruptedException -> 0x0037 }
        if (r2 == 0) goto L_0x0002;
    L_0x002a:
        r3 = r6.b;	 Catch:{ InterruptedException -> 0x0035 }
        r4 = new com.whatsapp.a5u;	 Catch:{ InterruptedException -> 0x0035 }
        r4.<init>(r6, r2);	 Catch:{ InterruptedException -> 0x0035 }
        r3.runOnUiThread(r4);	 Catch:{ InterruptedException -> 0x0035 }
        goto L_0x0002;
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0037 }
    L_0x0037:
        r0 = move-exception;
        return;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        throw r0;	 Catch:{ InterruptedException -> 0x0037 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.x3.run():void");
    }

    x3(VideoPreviewActivity videoPreviewActivity) {
        this.b = videoPreviewActivity;
        this.a = -1;
        this.c = new Object();
    }

    public void a(long j) {
        synchronized (this.c) {
            this.a = j;
            this.c.notifyAll();
        }
    }
}
