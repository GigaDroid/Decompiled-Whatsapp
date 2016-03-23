package com.whatsapp;

import com.whatsapp.util.bi;

class aw4 implements bi {
    final int a;
    final ChatInfoActivity b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.widget.ImageView r5, android.graphics.Bitmap r6, com.whatsapp.protocol.co r7) {
        /*
        r4 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r6 != 0) goto L_0x000f;
    L_0x0004:
        r1 = r7.c;
        switch(r1) {
            case 1: goto L_0x003c;
            case 2: goto L_0x0044;
            case 3: goto L_0x004c;
            case 4: goto L_0x0009;
            case 5: goto L_0x0009;
            case 6: goto L_0x0009;
            case 7: goto L_0x0009;
            case 8: goto L_0x0009;
            case 9: goto L_0x0054;
            default: goto L_0x0009;
        };
    L_0x0009:
        r1 = 0;
        r5.setImageResource(r1);
        if (r0 == 0) goto L_0x0012;
    L_0x000f:
        r5.setImageBitmap(r6);
    L_0x0012:
        r0 = r4.b;
        r0 = com.whatsapp.ChatInfoActivity.a(r0);
        r1 = r7.k;
        r0 = r0.contains(r1);
        if (r0 != 0) goto L_0x003b;
    L_0x0020:
        r0 = r4.b;
        r0 = com.whatsapp.ChatInfoActivity.a(r0);
        r1 = r7.k;
        r0.add(r1);
        r0 = new android.view.animation.AlphaAnimation;
        r1 = 0;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.<init>(r1, r2);
        r2 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0.setDuration(r2);
        r5.setAnimation(r0);
    L_0x003b:
        return;
    L_0x003c:
        r1 = 2130839629; // 0x7f02084d float:1.7284274E38 double:1.0527746575E-314;
        r5.setImageResource(r1);
        if (r0 == 0) goto L_0x0012;
    L_0x0044:
        r1 = 2130839628; // 0x7f02084c float:1.7284272E38 double:1.052774657E-314;
        r5.setImageResource(r1);
        if (r0 == 0) goto L_0x0012;
    L_0x004c:
        r1 = 2130839634; // 0x7f020852 float:1.7284284E38 double:1.05277466E-314;
        r5.setImageResource(r1);
        if (r0 == 0) goto L_0x0012;
    L_0x0054:
        r1 = r4.b;
        r1 = com.whatsapp.util.cb.a(r1, r7);
        r5.setImageDrawable(r1);
        if (r0 == 0) goto L_0x0012;
    L_0x005f:
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aw4.a(android.widget.ImageView, android.graphics.Bitmap, com.whatsapp.protocol.co):void");
    }

    aw4(ChatInfoActivity chatInfoActivity, int i) {
        this.b = chatInfoActivity;
        this.a = i;
    }

    public int a() {
        return (int) (((float) this.a) * a4d.a().g);
    }
}
