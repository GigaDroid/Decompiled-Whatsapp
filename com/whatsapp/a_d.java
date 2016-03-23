package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Stack;
import org.v;
import org.whispersystems.at;

class a_d extends Thread {
    private static final String[] z;
    private Stack a;
    final MediaView b;

    static {
        String[] strArr = new String[3];
        String str = ";DOwK HNi\u00050HGr\\?D\\1H?UF\u007fZyO^rF";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 86;
                        break;
                    case at.g /*1*/:
                        i3 = 33;
                        break;
                    case at.i /*2*/:
                        i3 = 43;
                        break;
                    case at.o /*3*/:
                        i3 = 30;
                        break;
                    default:
                        i3 = 42;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0019SB{D\"@_wE8";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "!HEzE!";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(co coVar, PhotoView photoView) {
        u8 u8Var = new u8(this, coVar, photoView);
        synchronized (this.a) {
            this.a.add(0, u8Var);
            this.a.notifyAll();
        }
    }

    private a_d(MediaView mediaView) {
        this.b = mediaView;
        this.a = new Stack();
    }

    a_d(MediaView mediaView, ao_ com_whatsapp_ao_) {
        this(mediaView);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r10 = this;
        r3 = 1;
        r6 = com.whatsapp.DialogToastActivity.f;
    L_0x0003:
        r0 = r10.a;	 Catch:{ InterruptedException -> 0x00ef }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x00ef }
        if (r0 != 0) goto L_0x0014;
    L_0x000b:
        r1 = r10.a;	 Catch:{ InterruptedException -> 0x00ef }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x00ef }
        r0 = r10.a;	 Catch:{ all -> 0x00ec }
        r0.wait();	 Catch:{ all -> 0x00ec }
        monitor-exit(r1);	 Catch:{ all -> 0x00ec }
    L_0x0014:
        r0 = r10.a;	 Catch:{ InterruptedException -> 0x00ef }
        r0 = r0.size();	 Catch:{ InterruptedException -> 0x00ef }
        if (r0 == 0) goto L_0x00e0;
    L_0x001c:
        r1 = r10.a;	 Catch:{ InterruptedException -> 0x00ef }
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x00ef }
        r0 = r10.a;	 Catch:{ all -> 0x00f1 }
        r0 = r0.pop();	 Catch:{ all -> 0x00f1 }
        r0 = (com.whatsapp.u8) r0;	 Catch:{ all -> 0x00f1 }
        monitor-exit(r1);	 Catch:{ all -> 0x00f1 }
        r4 = 0;
        r1 = r0.b;	 Catch:{ InterruptedException -> 0x00ef }
        r1 = r1.Q;	 Catch:{ InterruptedException -> 0x00ef }
        r1 = (com.whatsapp.MediaData) r1;	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r1.file;	 Catch:{ IOException -> 0x00f4 }
        if (r2 == 0) goto L_0x0126;
    L_0x0033:
        r2 = r0.b;	 Catch:{ IOException -> 0x00f4 }
        r2 = r2.c;	 Catch:{ IOException -> 0x00f4 }
        if (r2 != r3) goto L_0x00ff;
    L_0x0039:
        r7 = new android.graphics.BitmapFactory$Options;	 Catch:{ InterruptedException -> 0x00ef }
        r7.<init>();	 Catch:{ InterruptedException -> 0x00ef }
        r2 = 1;
        r7.inJustDecodeBounds = r2;	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r1.file;	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r2.getAbsolutePath();	 Catch:{ InterruptedException -> 0x00ef }
        android.graphics.BitmapFactory.decodeFile(r2, r7);	 Catch:{ InterruptedException -> 0x00ef }
        r2 = 0;
        r7.inJustDecodeBounds = r2;	 Catch:{ InterruptedException -> 0x00ef }
        r2 = 1;
        r7.inPurgeable = r2;	 Catch:{ InterruptedException -> 0x00ef }
        r2 = 1;
        r7.inInputShareable = r2;	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r0.c;	 Catch:{ InterruptedException -> 0x00ef }
        r5 = r2.getWidth();	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r0.c;	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r2.getHeight();	 Catch:{ InterruptedException -> 0x00ef }
        if (r5 == 0) goto L_0x0063;
    L_0x0061:
        if (r2 != 0) goto L_0x0092;
    L_0x0063:
        r2 = com.whatsapp.App.z();	 Catch:{ InterruptedException -> 0x00ef }
        r5 = z;	 Catch:{ InterruptedException -> 0x00ef }
        r8 = 1;
        r5 = r5[r8];	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r2.getSystemService(r5);	 Catch:{ InterruptedException -> 0x00ef }
        r2 = (android.view.WindowManager) r2;	 Catch:{ InterruptedException -> 0x00ef }
        r8 = r2.getDefaultDisplay();	 Catch:{ InterruptedException -> 0x00ef }
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ InterruptedException -> 0x00ef }
        r5 = 13;
        if (r2 < r5) goto L_0x008a;
    L_0x007c:
        r2 = new android.graphics.Point;	 Catch:{ InterruptedException -> 0x00ef }
        r2.<init>();	 Catch:{ InterruptedException -> 0x00ef }
        r8.getSize(r2);	 Catch:{ InterruptedException -> 0x00ef }
        r5 = r2.x;	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r2.y;	 Catch:{ InterruptedException -> 0x00ef }
        if (r6 == 0) goto L_0x0092;
    L_0x008a:
        r5 = r8.getWidth();	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r8.getHeight();	 Catch:{ InterruptedException -> 0x00ef }
    L_0x0092:
        r8 = 1;
        r7.inSampleSize = r8;	 Catch:{ IOException -> 0x00f6 }
        if (r5 <= 0) goto L_0x00b0;
    L_0x0097:
        if (r2 <= 0) goto L_0x00b0;
    L_0x0099:
        r8 = r7.outWidth;	 Catch:{ IOException -> 0x00f8 }
        r9 = r7.outHeight;	 Catch:{ IOException -> 0x00f8 }
        r8 = r8 * r9;
        r9 = r5 * r2;
        r9 = r9 * 4;
        if (r8 <= r9) goto L_0x00b0;
    L_0x00a4:
        r8 = r7.inSampleSize;	 Catch:{ InterruptedException -> 0x00ef }
        r8 = r8 * 2;
        r7.inSampleSize = r8;	 Catch:{ InterruptedException -> 0x00ef }
        r5 = r5 * 2;
        r2 = r2 * 2;
        if (r6 == 0) goto L_0x0099;
    L_0x00b0:
        r2 = r1.file;	 Catch:{ IOException -> 0x00fa }
        r2 = com.whatsapp.qi.a(r2);	 Catch:{ IOException -> 0x00fa }
        r5 = 0;
        r8 = r2.length;	 Catch:{ IOException -> 0x00fa }
        r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r5, r8, r7);	 Catch:{ IOException -> 0x00fa }
        r4 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x0128 }
        r1 = r1.file;	 Catch:{ IOException -> 0x0128 }
        r1 = r1.getAbsolutePath();	 Catch:{ IOException -> 0x0128 }
        r4.<init>(r1);	 Catch:{ IOException -> 0x0128 }
        r1 = z;	 Catch:{ IOException -> 0x0128 }
        r5 = 2;
        r1 = r1[r5];	 Catch:{ IOException -> 0x0128 }
        r5 = 1;
        r1 = r4.getAttributeInt(r1, r5);	 Catch:{ IOException -> 0x0128 }
    L_0x00d1:
        r4 = r2;
    L_0x00d2:
        if (r4 == 0) goto L_0x00e0;
    L_0x00d4:
        r0 = r0.c;	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r10.b;	 Catch:{ InterruptedException -> 0x00ef }
        r5 = new com.whatsapp.ais;	 Catch:{ InterruptedException -> 0x00ef }
        r5.<init>(r10, r1, r0, r4);	 Catch:{ InterruptedException -> 0x00ef }
        r2.runOnUiThread(r5);	 Catch:{ InterruptedException -> 0x00ef }
    L_0x00e0:
        r0 = java.lang.Thread.interrupted();	 Catch:{ InterruptedException -> 0x00ef }
        if (r0 == 0) goto L_0x0003;
    L_0x00e6:
        r0 = r10.a;
        r0.clear();
        return;
    L_0x00ec:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00ec }
        throw r0;	 Catch:{ InterruptedException -> 0x00ef }
    L_0x00ef:
        r0 = move-exception;
        goto L_0x00e6;
    L_0x00f1:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00f1 }
        throw r0;	 Catch:{ InterruptedException -> 0x00ef }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00ef }
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00ef }
    L_0x00fa:
        r1 = move-exception;
        r1 = r4;
    L_0x00fc:
        r2 = r1;
        r1 = r3;
        goto L_0x00d1;
    L_0x00ff:
        r2 = r0.b;	 Catch:{ InterruptedException -> 0x00ef }
        r2 = r2.c;	 Catch:{ InterruptedException -> 0x00ef }
        r5 = 3;
        if (r2 != r5) goto L_0x0126;
    L_0x0106:
        r1 = r1.file;	 Catch:{ OutOfMemoryError -> 0x011d }
        r1 = r1.getAbsolutePath();	 Catch:{ OutOfMemoryError -> 0x011d }
        r4 = com.whatsapp.util.ag.e(r1);	 Catch:{ OutOfMemoryError -> 0x011d }
        if (r4 == 0) goto L_0x0114;
    L_0x0112:
        r1 = r3;
        goto L_0x00d2;
    L_0x0114:
        r1 = z;	 Catch:{ OutOfMemoryError -> 0x011d }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x011d }
        com.whatsapp.util.Log.w(r1);	 Catch:{ OutOfMemoryError -> 0x011d }
        goto L_0x0112;
    L_0x011d:
        r1 = move-exception;
        com.whatsapp.util.Log.a(r1);	 Catch:{ InterruptedException -> 0x00ef }
        r1 = r10.b;	 Catch:{ InterruptedException -> 0x00ef }
        r1.f();	 Catch:{ InterruptedException -> 0x00ef }
    L_0x0126:
        r1 = r3;
        goto L_0x00d2;
    L_0x0128:
        r1 = move-exception;
        r1 = r2;
        goto L_0x00fc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a_d.run():void");
    }
}
