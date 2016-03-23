package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;

class zy extends AsyncTask {
    long a;
    final float b;
    final VideoTimelineView c;
    final int d;
    final float e;

    protected void onProgressUpdate(Object[] objArr) {
        a((Bitmap[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Bitmap[] bitmapArr) {
        boolean z = DialogToastActivity.f;
        int length = bitmapArr.length;
        int i = 0;
        while (i < length) {
            VideoTimelineView.a(this.c).add(bitmapArr[i]);
            i++;
            if (z) {
                break;
            }
        }
        if (System.currentTimeMillis() > this.a + 500) {
            this.a = System.currentTimeMillis();
            this.c.invalidate();
        }
    }

    zy(VideoTimelineView videoTimelineView, float f, float f2, int i) {
        this.c = videoTimelineView;
        this.e = f;
        this.b = f2;
        this.d = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Void a(java.lang.Void[] r15) {
        /*
        r14 = this;
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = new android.media.MediaMetadataRetriever;
        r4.<init>();
        r0 = r14.c;
        r0 = com.whatsapp.VideoTimelineView.c(r0);
        r0 = r0.getAbsolutePath();
        r4.setDataSource(r0);
        r0 = 9;
        r0 = r4.extractMetadata(r0);
        r6 = java.lang.Long.parseLong(r0);
        r0 = java.lang.System.currentTimeMillis();
        r14.a = r0;
        r5 = new android.graphics.RectF;
        r0 = 0;
        r1 = 0;
        r2 = r14.e;
        r8 = r14.b;
        r5.<init>(r0, r1, r2, r8);
        r8 = new android.graphics.Rect;
        r8.<init>();
        r0 = 0;
    L_0x0035:
        r1 = r14.d;
        if (r0 >= r1) goto L_0x00ba;
    L_0x0039:
        r1 = r14.isCancelled();	 Catch:{ Exception -> 0x0041 }
        if (r1 == 0) goto L_0x0043;
    L_0x003f:
        r0 = 0;
    L_0x0040:
        return r0;
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r10 = r10 * r6;
        r12 = (long) r0;
        r10 = r10 * r12;
        r1 = r14.d;
        r12 = (long) r1;
        r10 = r10 / r12;
        r2 = 0;
        r2 = r4.getFrameAtTime(r10);	 Catch:{ Exception -> 0x00c5, NoSuchMethodError -> 0x00c7 }
    L_0x0051:
        if (r2 == 0) goto L_0x00c9;
    L_0x0053:
        r9 = r2.getWidth();
        r10 = r2.getHeight();
        r1 = (float) r9;
        r11 = r14.e;	 Catch:{ Exception -> 0x00bf }
        r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1));
        if (r1 <= 0) goto L_0x00c9;
    L_0x0062:
        r1 = (float) r10;	 Catch:{ Exception -> 0x00bf }
        r11 = r14.b;	 Catch:{ Exception -> 0x00bf }
        r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1));
        if (r1 <= 0) goto L_0x00c9;
    L_0x0069:
        r1 = r14.e;
        r1 = (int) r1;
        r11 = r14.b;
        r11 = (int) r11;
        r12 = r2.getConfig();
        r1 = android.graphics.Bitmap.createBitmap(r1, r11, r12);
        if (r9 <= r10) goto L_0x008b;
    L_0x0079:
        r11 = 0;
        r8.top = r11;	 Catch:{ Exception -> 0x00c1 }
        r8.bottom = r10;	 Catch:{ Exception -> 0x00c1 }
        r11 = r9 - r10;
        r11 = r11 / 2;
        r8.left = r11;	 Catch:{ Exception -> 0x00c1 }
        r11 = r8.left;	 Catch:{ Exception -> 0x00c1 }
        r11 = r11 + r10;
        r8.right = r11;	 Catch:{ Exception -> 0x00c1 }
        if (r3 == 0) goto L_0x009a;
    L_0x008b:
        r11 = 0;
        r8.left = r11;	 Catch:{ Exception -> 0x00c1 }
        r8.right = r9;	 Catch:{ Exception -> 0x00c1 }
        r10 = r10 - r9;
        r10 = r10 / 2;
        r8.top = r10;	 Catch:{ Exception -> 0x00c1 }
        r10 = r8.top;	 Catch:{ Exception -> 0x00c1 }
        r9 = r9 + r10;
        r8.bottom = r9;	 Catch:{ Exception -> 0x00c1 }
    L_0x009a:
        r9 = new android.graphics.Canvas;
        r9.<init>(r1);
        r10 = r14.c;
        r10 = com.whatsapp.VideoTimelineView.b(r10);
        r9.drawBitmap(r2, r8, r5, r10);
    L_0x00a8:
        if (r1 == r2) goto L_0x00ad;
    L_0x00aa:
        r2.recycle();	 Catch:{ Exception -> 0x00c3 }
    L_0x00ad:
        r2 = 1;
        r2 = new android.graphics.Bitmap[r2];
        r9 = 0;
        r2[r9] = r1;
        r14.publishProgress(r2);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0035;
    L_0x00ba:
        r4.release();
        r0 = 0;
        goto L_0x0040;
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r0 = move-exception;
        throw r0;
    L_0x00c3:
        r0 = move-exception;
        throw r0;
    L_0x00c5:
        r1 = move-exception;
        goto L_0x0051;
    L_0x00c7:
        r1 = move-exception;
        goto L_0x0051;
    L_0x00c9:
        r1 = r2;
        goto L_0x00a8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.zy.a(java.lang.Void[]):java.lang.Void");
    }

    protected void a(Void voidR) {
        this.c.invalidate();
    }
}
