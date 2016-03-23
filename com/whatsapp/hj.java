package com.whatsapp;

import android.support.v7.graphics.Palette.PaletteAsyncListener;

class hj implements PaletteAsyncListener {
    final ChatInfoActivity a;
    final ChatInfoLayout b;

    hj(ChatInfoActivity chatInfoActivity, ChatInfoLayout chatInfoLayout) {
        this.a = chatInfoActivity;
        this.b = chatInfoLayout;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGenerated(android.support.v7.graphics.Palette r10) {
        /*
        r9 = this;
        r8 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r7 = 21;
        r6 = 1;
        r1 = 0;
        r5 = 2;
        r2 = r10.getMutedSwatch();
        if (r2 == 0) goto L_0x003a;
    L_0x000e:
        r0 = r2.getRgb();
        r3 = r9.b;
        r3.setColor(r0);
        r3 = android.os.Build.VERSION.SDK_INT;
        if (r3 < r7) goto L_0x005f;
    L_0x001b:
        r2 = r2.getHsl();
        r3 = r2[r5];
        r4 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r3 = r3 * r4;
        r4 = 1092616192; // 0x41200000 float:10.0 double:5.398241246E-315;
        r3 = r3 / r4;
        r2[r5] = r3;
        r2 = com.whatsapp.util.ao.a(r2);
        r3 = r9.a;
        r3 = r3.getWindow();
        r3.setStatusBarColor(r2);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x005f;
    L_0x003a:
        r0 = r9.b;
        r2 = r9.a;
        r3 = 2131624053; // 0x7f0e0075 float:1.8875275E38 double:1.0531622144E-314;
        r2 = android.support.v4.content.ContextCompat.getColor(r2, r3);
        r0.setColor(r2);
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r7) goto L_0x005e;
    L_0x004c:
        r0 = r9.a;
        r0 = r0.getWindow();
        r2 = r9.a;
        r3 = 2131624054; // 0x7f0e0076 float:1.8875277E38 double:1.053162215E-314;
        r2 = android.support.v4.content.ContextCompat.getColor(r2, r3);
        r0.setStatusBarColor(r2);
    L_0x005e:
        r0 = r1;
    L_0x005f:
        r2 = new int[r5];
        r3 = 1711276032; // 0x66000000 float:1.5111573E23 double:8.45482698E-315;
        r2[r1] = r3;
        r3 = r0 & r8;
        r2[r6] = r3;
        r3 = new android.graphics.drawable.GradientDrawable;
        r4 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP;
        r3.<init>(r4, r2);
        r2 = r9.a;
        r4 = 2131755435; // 0x7f1001ab float:1.914175E38 double:1.053227126E-314;
        r2 = r2.findViewById(r4);
        r2.setBackgroundDrawable(r3);
        r2 = new int[r5];
        r3 = 855638016; // 0x33000000 float:2.9802322E-8 double:4.22741349E-315;
        r2[r1] = r3;
        r0 = r0 & r8;
        r2[r6] = r0;
        r0 = new android.graphics.drawable.GradientDrawable;
        r1 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
        r0.<init>(r1, r2);
        r1 = r9.a;
        r2 = 2131755436; // 0x7f1001ac float:1.9141751E38 double:1.0532271263E-314;
        r1 = r1.findViewById(r2);
        r1.setBackgroundDrawable(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.hj.onGenerated(android.support.v7.graphics.Palette):void");
    }
}
