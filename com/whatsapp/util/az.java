package com.whatsapp.util;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class az extends Thread {
    private static final String[] z;
    final bd a;

    static {
        String[] strArr = new String[3];
        String str = "\u000f\u0013n\u000bX\r\u0002j\u000e^\u0000Ln\u0003W";
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
                        i3 = 110;
                        break;
                    case at.g /*1*/:
                        i3 = 99;
                        break;
                    case at.i /*2*/:
                        i3 = 30;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    default:
                        i3 = 49;
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
                    str = "!\u0011w\u0002_\u001a\u0002j\u000e^\u0000";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "#\u0006m\u0014P\t\u0006J\u000fD\u0003\u0001m3Y\u001c\u0006\u007f\u0003\u001e\f\nj\nP\u001eNz\u0002R\u0001\u0007{H~\u001b\u0017Q\u0001|\u000b\u000eq\u0015HN\u0002h\bX\n\u0006z";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    az(bd bdVar) {
        this.a = bdVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r12 = this;
        r11 = 1;
        r10 = com.whatsapp.util.Log.h;
    L_0x0003:
        r2 = r12.a;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = com.whatsapp.util.bd.d(r2);	 Catch:{ InterruptedException -> 0x0146 }
        r2 = com.whatsapp.util.am.a(r2);	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2.size();	 Catch:{ InterruptedException -> 0x0146 }
        if (r2 != 0) goto L_0x002c;
    L_0x0013:
        r2 = r12.a;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = com.whatsapp.util.bd.d(r2);	 Catch:{ InterruptedException -> 0x0146 }
        r3 = com.whatsapp.util.am.a(r2);	 Catch:{ InterruptedException -> 0x0146 }
        monitor-enter(r3);	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r12.a;	 Catch:{ all -> 0x0143 }
        r2 = com.whatsapp.util.bd.d(r2);	 Catch:{ all -> 0x0143 }
        r2 = com.whatsapp.util.am.a(r2);	 Catch:{ all -> 0x0143 }
        r2.wait();	 Catch:{ all -> 0x0143 }
        monitor-exit(r3);	 Catch:{ all -> 0x0143 }
    L_0x002c:
        r2 = r12.a;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = com.whatsapp.util.bd.d(r2);	 Catch:{ InterruptedException -> 0x0146 }
        r2 = com.whatsapp.util.am.a(r2);	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2.size();	 Catch:{ InterruptedException -> 0x0146 }
        if (r2 == 0) goto L_0x013c;
    L_0x003c:
        r2 = r12.a;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = com.whatsapp.util.bd.d(r2);	 Catch:{ InterruptedException -> 0x0146 }
        r3 = com.whatsapp.util.am.a(r2);	 Catch:{ InterruptedException -> 0x0146 }
        monitor-enter(r3);	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r12.a;	 Catch:{ all -> 0x0148 }
        r2 = com.whatsapp.util.bd.d(r2);	 Catch:{ all -> 0x0148 }
        r2 = com.whatsapp.util.am.a(r2);	 Catch:{ all -> 0x0148 }
        r2 = r2.pop();	 Catch:{ all -> 0x0148 }
        r0 = r2;
        r0 = (com.whatsapp.util.bh) r0;	 Catch:{ all -> 0x0148 }
        r9 = r0;
        monitor-exit(r3);	 Catch:{ all -> 0x0148 }
    L_0x005a:
        r2 = com.whatsapp.util.bd.a();	 Catch:{ InterruptedException -> 0x0146 }
        if (r2 == 0) goto L_0x0067;
    L_0x0060:
        r2 = 50;
        java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x0146 }
        if (r10 == 0) goto L_0x005a;
    L_0x0067:
        r4 = 0;
        r2 = r9.d;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2.getTag();	 Catch:{ InterruptedException -> 0x0146 }
        r3 = r9.b;	 Catch:{ InterruptedException -> 0x0146 }
        r3 = r3.k;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2.equals(r3);	 Catch:{ InterruptedException -> 0x0146 }
        if (r2 == 0) goto L_0x010f;
    L_0x0078:
        r2 = r9.b;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2.Q;	 Catch:{ InterruptedException -> 0x0146 }
        r0 = r2;
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ InterruptedException -> 0x0146 }
        r3 = r0;
        if (r3 == 0) goto L_0x010f;
    L_0x0082:
        r2 = r3.file;	 Catch:{ IOException -> 0x014b }
        if (r2 == 0) goto L_0x010f;
    L_0x0086:
        r2 = r3.file;	 Catch:{ IOException -> 0x014d }
        r2 = r2.exists();	 Catch:{ IOException -> 0x014d }
        if (r2 == 0) goto L_0x010f;
    L_0x008e:
        r2 = r9.b;	 Catch:{ IOException -> 0x014f }
        r2 = r2.c;	 Catch:{ IOException -> 0x014f }
        if (r2 != r11) goto L_0x016d;
    L_0x0094:
        r5 = new android.graphics.BitmapFactory$Options;	 Catch:{ InterruptedException -> 0x0146 }
        r5.<init>();	 Catch:{ InterruptedException -> 0x0146 }
        r2 = 1;
        r5.inJustDecodeBounds = r2;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r3.file;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2.getAbsolutePath();	 Catch:{ InterruptedException -> 0x0146 }
        android.graphics.BitmapFactory.decodeFile(r2, r5);	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r9.a;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2.a();	 Catch:{ InterruptedException -> 0x0146 }
        r2 = (float) r2;	 Catch:{ InterruptedException -> 0x0146 }
        r6 = com.whatsapp.a4d.a();	 Catch:{ InterruptedException -> 0x0146 }
        r6 = r6.g;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2 / r6;
        r6 = (int) r2;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = 1;
        r5.inSampleSize = r2;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r5.outWidth;	 Catch:{ InterruptedException -> 0x0146 }
    L_0x00b9:
        r7 = r2 / 2;
        if (r7 < r6) goto L_0x00c7;
    L_0x00bd:
        r2 = r2 / 2;
        r7 = r5.inSampleSize;	 Catch:{ InterruptedException -> 0x0146 }
        r7 = r7 * 2;
        r5.inSampleSize = r7;	 Catch:{ InterruptedException -> 0x0146 }
        if (r10 == 0) goto L_0x00b9;
    L_0x00c7:
        r2 = 0;
        r5.inJustDecodeBounds = r2;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = 1;
        r5.inInputShareable = r2;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = 1;
        r5.inPurgeable = r2;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r3.file;	 Catch:{ IOException -> 0x01b8, OutOfMemoryError -> 0x0155 }
        r2 = com.whatsapp.qi.a(r2);	 Catch:{ IOException -> 0x01b8, OutOfMemoryError -> 0x0155 }
        r6 = 0;
        r7 = r2.length;	 Catch:{ IOException -> 0x01b8, OutOfMemoryError -> 0x0155 }
        r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r6, r7, r5);	 Catch:{ IOException -> 0x01b8, OutOfMemoryError -> 0x0155 }
        if (r2 == 0) goto L_0x010e;
    L_0x00de:
        r4 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        r3 = r3.file;	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        r3 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        r4.<init>(r3);	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        r3 = z;	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        r5 = 2;
        r3 = r3[r5];	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        r5 = 1;
        r3 = r4.getAttributeInt(r3, r5);	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        r7 = com.whatsapp.util.ag.a(r3);	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        if (r7 == 0) goto L_0x010e;
    L_0x00f9:
        r3 = 0;
        r4 = 0;
        r5 = r2.getWidth();	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        r6 = r2.getHeight();	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        r8 = 1;
        r3 = android.graphics.Bitmap.createBitmap(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
        if (r2 == r3) goto L_0x010d;
    L_0x010a:
        r2.recycle();	 Catch:{ IOException -> 0x0151, OutOfMemoryError -> 0x01b6 }
    L_0x010d:
        r2 = r3;
    L_0x010e:
        r4 = r2;
    L_0x010f:
        if (r4 == 0) goto L_0x013c;
    L_0x0111:
        r2 = r9.d;	 Catch:{ IOException -> 0x01b2 }
        r2 = r2.getTag();	 Catch:{ IOException -> 0x01b2 }
        r3 = r9.b;	 Catch:{ IOException -> 0x01b2 }
        r3 = r3.k;	 Catch:{ IOException -> 0x01b2 }
        r2 = r2.equals(r3);	 Catch:{ IOException -> 0x01b2 }
        if (r2 == 0) goto L_0x0139;
    L_0x0121:
        r2 = new com.whatsapp.util.cn;	 Catch:{ InterruptedException -> 0x0146 }
        r3 = r12.a;	 Catch:{ InterruptedException -> 0x0146 }
        r5 = r9.d;	 Catch:{ InterruptedException -> 0x0146 }
        r6 = r9.b;	 Catch:{ InterruptedException -> 0x0146 }
        r7 = r9.a;	 Catch:{ InterruptedException -> 0x0146 }
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ InterruptedException -> 0x0146 }
        r3 = r12.a;	 Catch:{ IOException -> 0x01b4 }
        r3 = com.whatsapp.util.bd.a(r3);	 Catch:{ IOException -> 0x01b4 }
        r3.post(r2);	 Catch:{ IOException -> 0x01b4 }
        if (r10 == 0) goto L_0x013c;
    L_0x0139:
        r4.recycle();	 Catch:{ IOException -> 0x01b4 }
    L_0x013c:
        r2 = java.lang.Thread.interrupted();	 Catch:{ InterruptedException -> 0x0146 }
        if (r2 == 0) goto L_0x0003;
    L_0x0142:
        return;
    L_0x0143:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0143 }
        throw r2;	 Catch:{ InterruptedException -> 0x0146 }
    L_0x0146:
        r2 = move-exception;
        goto L_0x0142;
    L_0x0148:
        r2 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0148 }
        throw r2;	 Catch:{ InterruptedException -> 0x0146 }
    L_0x014b:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x014d }
    L_0x014d:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x014f }
    L_0x014f:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0146 }
    L_0x0151:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0153, OutOfMemoryError -> 0x01b6 }
    L_0x0153:
        r3 = move-exception;
        goto L_0x010e;
    L_0x0155:
        r2 = move-exception;
        r3 = r2;
        r2 = r4;
    L_0x0158:
        r4 = com.whatsapp.memory.a.a();	 Catch:{ IOException -> 0x016b }
        if (r4 != 0) goto L_0x0168;
    L_0x015e:
        r4 = z;	 Catch:{ IOException -> 0x016b }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ IOException -> 0x016b }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IOException -> 0x016b }
        if (r10 == 0) goto L_0x010e;
    L_0x0168:
        throw r3;	 Catch:{ IOException -> 0x0169 }
    L_0x0169:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0146 }
    L_0x016b:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0169 }
    L_0x016d:
        r2 = r9.b;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2.c;	 Catch:{ InterruptedException -> 0x0146 }
        r5 = 3;
        if (r2 != r5) goto L_0x017f;
    L_0x0174:
        r2 = r3.file;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2.getAbsolutePath();	 Catch:{ InterruptedException -> 0x0146 }
        r4 = com.whatsapp.util.ag.e(r2);	 Catch:{ InterruptedException -> 0x0146 }
        goto L_0x010f;
    L_0x017f:
        r2 = r9.b;	 Catch:{ IOException -> 0x01b0 }
        r2 = r2.c;	 Catch:{ IOException -> 0x01b0 }
        r5 = 9;
        if (r2 != r5) goto L_0x010f;
    L_0x0187:
        r2 = z;	 Catch:{ IOException -> 0x01b0 }
        r5 = 0;
        r2 = r2[r5];	 Catch:{ IOException -> 0x01b0 }
        r5 = r9.b;	 Catch:{ IOException -> 0x01b0 }
        r5 = r5.n;	 Catch:{ IOException -> 0x01b0 }
        r2 = r2.equals(r5);	 Catch:{ IOException -> 0x01b0 }
        if (r2 == 0) goto L_0x010f;
    L_0x0196:
        r2 = r3.file;	 Catch:{ InterruptedException -> 0x0146 }
        r2 = r2.getAbsolutePath();	 Catch:{ InterruptedException -> 0x0146 }
        r3 = r9.a;	 Catch:{ InterruptedException -> 0x0146 }
        r3 = r3.a();	 Catch:{ InterruptedException -> 0x0146 }
        r4 = r9.a;	 Catch:{ InterruptedException -> 0x0146 }
        r4 = r4.a();	 Catch:{ InterruptedException -> 0x0146 }
        r4 = r4 / 3;
        r4 = com.whatsapp.util.cb.a(r2, r3, r4);	 Catch:{ InterruptedException -> 0x0146 }
        goto L_0x010f;
    L_0x01b0:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0146 }
    L_0x01b2:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0146 }
    L_0x01b4:
        r2 = move-exception;
        throw r2;	 Catch:{ InterruptedException -> 0x0146 }
    L_0x01b6:
        r3 = move-exception;
        goto L_0x0158;
    L_0x01b8:
        r2 = move-exception;
        r2 = r4;
        goto L_0x010e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.az.run():void");
    }
}
