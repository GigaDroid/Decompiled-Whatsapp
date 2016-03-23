package com.whatsapp;

import android.widget.RatingBar.OnRatingBarChangeListener;

class jl implements OnRatingBarChangeListener {
    final CallRatingActivity a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRatingChanged(android.widget.RatingBar r4, float r5, boolean r6) {
        /*
        r3 = this;
        r0 = r3.a;
        r0 = r0.getResources();
        r1 = 2131689498; // 0x7f0f001a float:1.9008013E38 double:1.0531945486E-314;
        r0 = r0.getStringArray(r1);
        r1 = 0;
        r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0034;
    L_0x0012:
        r1 = r0.length;
        r1 = (float) r1;
        r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1));
        if (r1 > 0) goto L_0x0034;
    L_0x0018:
        r1 = r3.a;
        r1 = com.whatsapp.CallRatingActivity.a(r1);
        r2 = (int) r5;
        r2 = r2 + -1;
        r0 = r0[r2];
        r1.setText(r0);
        r0 = r3.a;
        r0 = com.whatsapp.CallRatingActivity.a(r0);
        r1 = 0;
        r0.setVisibility(r1);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x003e;
    L_0x0034:
        r0 = r3.a;
        r0 = com.whatsapp.CallRatingActivity.a(r0);
        r1 = 4;
        r0.setVisibility(r1);
    L_0x003e:
        r0 = r3.a;
        com.whatsapp.CallRatingActivity.e(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jl.onRatingChanged(android.widget.RatingBar, float, boolean):void");
    }

    jl(CallRatingActivity callRatingActivity) {
        this.a = callRatingActivity;
    }
}
