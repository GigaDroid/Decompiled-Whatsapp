package com.whatsapp;

import android.widget.AbsListView.OnScrollListener;

class a43 implements OnScrollListener {
    final Conversation a;
    private int b;

    a43(Conversation conversation) {
        this.a = conversation;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r12, int r13, int r14, int r15) {
        /*
        r11 = this;
        r2 = 0;
        r1 = 1;
        r8 = 0;
        r10 = 8;
        r9 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.a;
        com.whatsapp.Conversation.c(r0, r13);
        r0 = r11.a;
        com.whatsapp.Conversation.a(r0, r8);
        r0 = r13 + r14;
        r3 = r11.a;
        r3 = r3.bd;
        r3 = r3.getCount();
        r4 = r11.a;
        r4 = r4.bc;
        r4 = r4.getHeaderViewsCount();
        r3 = r3 + r4;
        if (r0 < r3) goto L_0x002d;
    L_0x0026:
        r0 = r11.a;
        com.whatsapp.Conversation.a(r0, r1);
        if (r9 == 0) goto L_0x0049;
    L_0x002d:
        r0 = r11.a;
        com.whatsapp.Conversation.a(r0, r8);
        r0 = android.os.Build.VERSION.SDK_INT;
        r3 = 18;
        if (r0 < r3) goto L_0x0042;
    L_0x0038:
        r0 = r11.a;
        r0 = r0.bc;
        r0 = r0.isInLayout();
        if (r0 != 0) goto L_0x0049;
    L_0x0042:
        r0 = r11.a;
        r0 = r0.bc;
        r0.setTranscriptMode(r8);
    L_0x0049:
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.I(r0);
        if (r0 == 0) goto L_0x018a;
    L_0x0051:
        r0 = r11.b;
        if (r0 == r13) goto L_0x018a;
    L_0x0055:
        if (r14 == 0) goto L_0x018a;
    L_0x0057:
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.A(r0);
        r0 = r0.g;
        r3 = 1111490560; // 0x42400000 float:48.0 double:5.491493014E-315;
        r0 = r0 * r3;
        r0 = (int) r0;
        r3 = r11.b;
        if (r13 <= r3) goto L_0x00b4;
    L_0x0067:
        r3 = r11.a;
        r3 = com.whatsapp.Conversation.W(r3);
        if (r3 == 0) goto L_0x00b4;
    L_0x006f:
        r3 = r15 - r14;
        if (r3 != 0) goto L_0x007e;
    L_0x0073:
        r3 = r11.a;
        r3 = com.whatsapp.Conversation.W(r3);
        r3.setVisibility(r10);
        if (r9 == 0) goto L_0x00b4;
    L_0x007e:
        r3 = r12.getHeight();
        r3 = r3 - r0;
        r3 = r3 * r13;
        r4 = r15 - r14;
        r3 = r3 / r4;
        r3 = r3 + r0;
        r4 = r12.getHeight();
        r4 = r4 - r0;
        if (r3 >= r4) goto L_0x00ab;
    L_0x008f:
        r3 = r11.a;
        r3 = com.whatsapp.Conversation.W(r3);
        r3.setVisibility(r8);
        r3 = r11.a;
        r3 = com.whatsapp.Conversation.D(r3);
        if (r3 == 0) goto L_0x00b4;
    L_0x00a0:
        r3 = r11.a;
        r3 = com.whatsapp.Conversation.D(r3);
        r3.setVisibility(r10);
        if (r9 == 0) goto L_0x00b4;
    L_0x00ab:
        r3 = r11.a;
        r3 = com.whatsapp.Conversation.W(r3);
        r3.setVisibility(r10);
    L_0x00b4:
        r3 = r11.b;
        if (r13 >= r3) goto L_0x00ff;
    L_0x00b8:
        r3 = r11.a;
        r3 = com.whatsapp.Conversation.D(r3);
        if (r3 == 0) goto L_0x00ff;
    L_0x00c0:
        r3 = r15 - r14;
        if (r3 != 0) goto L_0x00cf;
    L_0x00c4:
        r3 = r11.a;
        r3 = com.whatsapp.Conversation.D(r3);
        r3.setVisibility(r10);
        if (r9 == 0) goto L_0x00ff;
    L_0x00cf:
        r3 = r12.getHeight();
        r3 = r3 - r0;
        r3 = r3 * r13;
        r4 = r15 - r14;
        r3 = r3 / r4;
        if (r3 <= r0) goto L_0x00f6;
    L_0x00da:
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.D(r0);
        r0.setVisibility(r8);
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.W(r0);
        if (r0 == 0) goto L_0x00ff;
    L_0x00eb:
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.W(r0);
        r0.setVisibility(r10);
        if (r9 == 0) goto L_0x00ff;
    L_0x00f6:
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.D(r0);
        r0.setVisibility(r10);
    L_0x00ff:
        r0 = r11.a;
        r0 = r0.bc;
        r0 = r0.getHeaderViewsCount();
        r0 = r13 - r0;
        if (r0 < 0) goto L_0x0181;
    L_0x010b:
        r3 = r11.a;
        r3 = r3.bd;
        r0 = r3.b(r0);
        if (r0 == 0) goto L_0x0176;
    L_0x0115:
        r4 = r0.b;
        r6 = java.lang.System.currentTimeMillis();
        r3 = com.whatsapp.util.cs.a(r4, r6);
        if (r3 != 0) goto L_0x0176;
    L_0x0121:
        r3 = r11.a;
        r3 = com.whatsapp.Conversation.az(r3);
        r4 = r11.a;
        r6 = r0.b;
        r0 = com.whatsapp.util.cs.b(r4, r6);
        r3.setText(r0);
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.az(r0);
        r3 = r11.a;
        r3 = r3.getResources();
        r3 = com.whatsapp.ConversationRow.b(r3);
        r0.setTextSize(r3);
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.az(r0);
        r0 = r0.getVisibility();
        if (r0 == 0) goto L_0x017f;
    L_0x0151:
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.az(r0);
        r0.setVisibility(r8);
        r0 = new android.view.animation.TranslateAnimation;
        r6 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r3 = r1;
        r4 = r2;
        r5 = r1;
        r7 = r1;
        r8 = r2;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r0.setDuration(r2);
        r2 = r11.a;
        r2 = com.whatsapp.Conversation.az(r2);
        r2.startAnimation(r0);
        if (r9 == 0) goto L_0x017f;
    L_0x0176:
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.az(r0);
        r0.setVisibility(r10);
    L_0x017f:
        if (r9 == 0) goto L_0x018a;
    L_0x0181:
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.az(r0);
        r0.setVisibility(r10);
    L_0x018a:
        r0 = r11.b;
        if (r0 == r13) goto L_0x0199;
    L_0x018e:
        r0 = r11.a;
        r0 = com.whatsapp.Conversation.I(r0);
        if (r0 == 0) goto L_0x0199;
    L_0x0196:
        com.whatsapp.util.bd.a(r1);
    L_0x0199:
        r11.b = r13;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a43.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r7, int r8) {
        /*
        r6 = this;
        r1 = 1;
        r2 = 0;
        if (r8 == 0) goto L_0x0025;
    L_0x0004:
        r0 = r6.a;
        r3 = r0.bc;
        r0 = android.os.Build.VERSION.SDK_INT;
        r4 = 11;
        if (r0 >= r4) goto L_0x0041;
    L_0x000e:
        r0 = r1;
    L_0x000f:
        r3.setFastScrollEnabled(r0);
        r0 = r6.a;
        r0 = com.whatsapp.Conversation.x(r0);
        r3 = r6.a;
        r3 = com.whatsapp.Conversation.aA(r3);
        r0.removeCallbacks(r3);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0036;
    L_0x0025:
        r0 = r6.a;
        r0 = com.whatsapp.Conversation.x(r0);
        r3 = r6.a;
        r3 = com.whatsapp.Conversation.aA(r3);
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0.postDelayed(r3, r4);
    L_0x0036:
        r0 = r6.a;
        com.whatsapp.Conversation.a(r0, r8);
        if (r8 == 0) goto L_0x0043;
    L_0x003d:
        com.whatsapp.util.bd.a(r1);
        return;
    L_0x0041:
        r0 = r2;
        goto L_0x000f;
    L_0x0043:
        r1 = r2;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a43.onScrollStateChanged(android.widget.AbsListView, int):void");
    }
}
