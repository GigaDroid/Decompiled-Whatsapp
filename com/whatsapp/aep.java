package com.whatsapp;

import android.view.View.OnClickListener;

class aep implements OnClickListener {
    final VideoPreviewActivity a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r9) {
        /*
        r8 = this;
        r7 = 1;
        r6 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r8.a;
        r1 = com.whatsapp.VideoPreviewActivity.i(r1);
        r1 = r1.isPlaying();
        if (r1 == 0) goto L_0x0020;
    L_0x0010:
        r1 = r8.a;
        r1 = com.whatsapp.VideoPreviewActivity.i(r1);
        r1.pause();
        r1 = r8.a;
        com.whatsapp.VideoPreviewActivity.a(r1, r7);
        if (r0 == 0) goto L_0x00b6;
    L_0x0020:
        r1 = r8.a;
        r1 = com.whatsapp.VideoPreviewActivity.k(r1);
        if (r9 != r1) goto L_0x00b6;
    L_0x0028:
        r1 = r8.a;
        com.whatsapp.VideoPreviewActivity.a(r1, r6);
        r1 = r8.a;
        com.whatsapp.VideoPreviewActivity.b(r1, r6);
        r1 = r8.a;
        r1 = com.whatsapp.VideoPreviewActivity.h(r1);
        if (r1 != 0) goto L_0x004f;
    L_0x003a:
        r1 = r8.a;
        r1 = com.whatsapp.VideoPreviewActivity.e(r1);
        r1 = r1.getProgress();
        r2 = (long) r1;
        r1 = r8.a;
        r4 = com.whatsapp.VideoPreviewActivity.n(r1);
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 != 0) goto L_0x0061;
    L_0x004f:
        r1 = r8.a;
        r1 = com.whatsapp.VideoPreviewActivity.i(r1);
        r2 = r8.a;
        r2 = com.whatsapp.VideoPreviewActivity.d(r2);
        r2 = (int) r2;
        r1.seekTo(r2);
        if (r0 == 0) goto L_0x008e;
    L_0x0061:
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.i(r0);
        r1 = r8.a;
        r1 = com.whatsapp.VideoPreviewActivity.e(r1);
        r1 = r1.getProgress();
        r0.seekTo(r1);
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.i(r0);
        r0 = r0.getCurrentPosition();
        r0 = (long) r0;
        r2 = r8.a;
        r2 = com.whatsapp.VideoPreviewActivity.n(r2);
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 < 0) goto L_0x008e;
    L_0x0089:
        r0 = r8.a;
        com.whatsapp.VideoPreviewActivity.b(r0, r7);
    L_0x008e:
        r0 = r8.a;
        com.whatsapp.VideoPreviewActivity.c(r0, r6);
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.i(r0);
        r1 = 0;
        r0.setBackgroundDrawable(r1);
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.i(r0);
        r0.start();
        r0 = r8.a;
        r0 = com.whatsapp.VideoPreviewActivity.i(r0);
        r1 = new com.whatsapp.am5;
        r1.<init>(r8);
        r2 = 0;
        r0.postDelayed(r1, r2);
    L_0x00b6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aep.onClick(android.view.View):void");
    }

    aep(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }
}
