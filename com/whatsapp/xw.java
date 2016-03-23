package com.whatsapp;

import android.os.AsyncTask;
import android.support.v4.os.CancellationSignal;
import org.v;
import org.whispersystems.at;

class xw extends AsyncTask {
    private static final String z;
    private int a;
    private final String b;
    private CancellationSignal c;
    final DocumentsGalleryFragment d;

    static {
        char[] toCharArray = "Le\u00122kMd\u00054aIf\u001d\"tQl\u0003&aEo\u001f3)If\u001dgd]i\u001a\"r[*\u00104uAm\u001f\"b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 40;
                    break;
                case at.g /*1*/:
                    i2 = 10;
                    break;
                case at.i /*2*/:
                    i2 = 113;
                    break;
                case at.o /*3*/:
                    i2 = 71;
                    break;
                default:
                    i2 = 6;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Void voidR) {
        DocumentsGalleryFragment.c(this.d).notifyDataSetChanged();
    }

    public xw(DocumentsGalleryFragment documentsGalleryFragment, String str) {
        this.d = documentsGalleryFragment;
        this.b = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Void a(java.lang.Void[] r13) {
        /*
        r12 = this;
        r1 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.isCancelled();	 Catch:{ SQLiteDiskIOException -> 0x000a }
        if (r0 == 0) goto L_0x000c;
    L_0x0009:
        return r1;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        monitor-enter(r12);
        r0 = new android.support.v4.os.CancellationSignal;	 Catch:{ all -> 0x00bb }
        r0.<init>();	 Catch:{ all -> 0x00bb }
        r12.c = r0;	 Catch:{ all -> 0x00bb }
        monitor-exit(r12);	 Catch:{ all -> 0x00bb }
        r0 = com.whatsapp.App.aK;
        r2 = r12.d;
        r2 = com.whatsapp.DocumentsGalleryFragment.f(r2);
        r3 = r12.b;
        r4 = r12.c;
        r6 = r0.a(r2, r3, r4);
        r2 = android.os.SystemClock.uptimeMillis();
        r7 = new java.util.ArrayList;
        r7.<init>();
        r0 = r1;
    L_0x002f:
        r4 = r6.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        if (r4 == 0) goto L_0x0095;
    L_0x0035:
        r4 = r12.isCancelled();	 Catch:{ SQLiteDiskIOException -> 0x00be }
        if (r4 == 0) goto L_0x003d;
    L_0x003b:
        if (r5 == 0) goto L_0x0095;
    L_0x003d:
        r4 = com.whatsapp.App.aK;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r8 = r12.d;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r8 = com.whatsapp.DocumentsGalleryFragment.f(r8);	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r4 = r4.a(r6, r8);	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r8 = r12.d;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r8 = com.whatsapp.DocumentsGalleryFragment.a(r8);	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r10 = r4.b;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r4 = r8.a(r10);	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        if (r0 == 0) goto L_0x005d;
    L_0x0057:
        r8 = r0.equals(r4);	 Catch:{ SQLiteDiskIOException -> 0x00da }
        if (r8 != 0) goto L_0x0066;
    L_0x005d:
        if (r0 == 0) goto L_0x0062;
    L_0x005f:
        r7.add(r0);	 Catch:{ SQLiteDiskIOException -> 0x00de }
    L_0x0062:
        r0 = 0;
        r4.b = r0;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r0 = r4;
    L_0x0066:
        r4 = r0.b;	 Catch:{ SQLiteDiskIOException -> 0x00e0 }
        r4 = r4 + 1;
        r0.b = r4;	 Catch:{ SQLiteDiskIOException -> 0x00e0 }
        r4 = r7.isEmpty();	 Catch:{ SQLiteDiskIOException -> 0x00e0 }
        if (r4 != 0) goto L_0x0093;
    L_0x0072:
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 + r2;
        r10 = android.os.SystemClock.uptimeMillis();	 Catch:{ SQLiteDiskIOException -> 0x00e0 }
        r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r4 >= 0) goto L_0x0093;
    L_0x007d:
        r2 = android.os.SystemClock.uptimeMillis();	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r4 = new java.util.ArrayList;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r4.<init>(r7);	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r7.clear();	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r8 = r12.d;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r9 = new com.whatsapp.un;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r9.<init>(r12, r4);	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        com.whatsapp.DocumentsGalleryFragment.a(r8, r9);	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
    L_0x0093:
        if (r5 == 0) goto L_0x002f;
    L_0x0095:
        if (r0 == 0) goto L_0x00a0;
    L_0x0097:
        r2 = r12.isCancelled();	 Catch:{ SQLiteDiskIOException -> 0x00e2 }
        if (r2 != 0) goto L_0x00a0;
    L_0x009d:
        r7.add(r0);	 Catch:{ SQLiteDiskIOException -> 0x00e4 }
    L_0x00a0:
        r0 = r12.d;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r2 = new com.whatsapp.aa2;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        r2.<init>(r12, r7);	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        com.whatsapp.DocumentsGalleryFragment.a(r0, r2);	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
        monitor-enter(r12);
        r0 = 0;
        r12.c = r0;	 Catch:{ all -> 0x00e6 }
        monitor-exit(r12);	 Catch:{ all -> 0x00e6 }
        if (r6 == 0) goto L_0x00b4;
    L_0x00b1:
        r6.close();	 Catch:{ SQLiteDiskIOException -> 0x00e9 }
    L_0x00b4:
        r0 = z;
        com.whatsapp.util.Log.i(r0);
        goto L_0x0009;
    L_0x00bb:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x00bb }
        throw r0;
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        r1 = r12.d;	 Catch:{ all -> 0x00ce }
        r1 = r1.getContext();	 Catch:{ all -> 0x00ce }
        r2 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;
        com.whatsapp.util.p.a(r1, r2);	 Catch:{ all -> 0x00ce }
        throw r0;	 Catch:{ all -> 0x00ce }
    L_0x00ce:
        r0 = move-exception;
        monitor-enter(r12);
        r1 = 0;
        r12.c = r1;	 Catch:{ all -> 0x00eb }
        monitor-exit(r12);	 Catch:{ all -> 0x00eb }
        if (r6 == 0) goto L_0x00d9;
    L_0x00d6:
        r6.close();	 Catch:{ SQLiteDiskIOException -> 0x00ee }
    L_0x00d9:
        throw r0;
    L_0x00da:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00dc }
    L_0x00dc:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
    L_0x00e0:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00c0 }
    L_0x00e6:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x00e6 }
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
    L_0x00eb:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x00eb }
        throw r0;
    L_0x00ee:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xw.a(java.lang.Void[]):java.lang.Void");
    }

    static int a(xw xwVar) {
        return xwVar.a;
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    void a() {
        super.cancel(true);
        synchronized (this) {
            if (this.c != null) {
                this.c.cancel();
            }
        }
    }

    static int a(xw xwVar, int i) {
        xwVar.a = i;
        return i;
    }
}
