package com.whatsapp;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.BaseAdapter;

class u3 extends BaseAdapter {
    private final int a;
    private View b;
    private String c;
    private int d;
    final MessageDetailsActivity e;

    public u3(MessageDetailsActivity messageDetailsActivity) {
        this.e = messageDetailsActivity;
        this.a = messageDetailsActivity.getResources().getInteger(17694721);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r22, android.view.View r23) {
        /*
        r21 = this;
        r11 = com.whatsapp.DialogToastActivity.f;
        r0 = r21;
        r2 = r0.e;
        r2 = com.whatsapp.MessageDetailsActivity.b(r2);
        r0 = r22;
        r2 = r2.get(r0);
        r2 = (com.whatsapp.au7) r2;
        r3 = 2131755779; // 0x7f100303 float:1.9142447E38 double:1.0532272957E-314;
        r0 = r23;
        r6 = r0.findViewById(r3);
        if (r22 == 0) goto L_0x0037;
    L_0x001d:
        r4 = r2.a();
        r0 = r21;
        r3 = r0.e;
        r3 = com.whatsapp.MessageDetailsActivity.b(r3);
        r5 = r22 + -1;
        r3 = r3.get(r5);
        r3 = (com.whatsapp.au7) r3;
        r3 = r3.a();
        if (r4 == r3) goto L_0x005a;
    L_0x0037:
        r3 = 0;
        r6.setVisibility(r3);
        r3 = 2131755780; // 0x7f100304 float:1.9142449E38 double:1.053227296E-314;
        r0 = r23;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131755781; // 0x7f100305 float:1.914245E38 double:1.0532272967E-314;
        r0 = r23;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.TextView) r4;
        r5 = r2.a();
        switch(r5) {
            case 5: goto L_0x0282;
            case 8: goto L_0x02b0;
            case 13: goto L_0x0293;
            default: goto L_0x0058;
        };
    L_0x0058:
        if (r11 == 0) goto L_0x005f;
    L_0x005a:
        r3 = 8;
        r6.setVisibility(r3);
    L_0x005f:
        r3 = 2131755376; // 0x7f100170 float:1.914163E38 double:1.0532270966E-314;
        r0 = r23;
        r4 = r0.findViewById(r3);
        r3 = 2131755310; // 0x7f10012e float:1.9141496E38 double:1.053227064E-314;
        r0 = r23;
        r5 = r0.findViewById(r3);
        r0 = r21;
        r3 = r0.e;
        r3 = com.whatsapp.MessageDetailsActivity.b(r3);
        r3 = r3.size();
        r3 = r3 + -1;
        r0 = r22;
        if (r0 == r3) goto L_0x009d;
    L_0x0083:
        r6 = r2.a();
        r0 = r21;
        r3 = r0.e;
        r3 = com.whatsapp.MessageDetailsActivity.b(r3);
        r7 = r22 + 1;
        r3 = r3.get(r7);
        r3 = (com.whatsapp.au7) r3;
        r3 = r3.a();
        if (r6 == r3) goto L_0x00aa;
    L_0x009d:
        r3 = 2130839690; // 0x7f02088a float:1.7284398E38 double:1.0527746876E-314;
        r5.setBackgroundResource(r3);
        r3 = 8;
        r4.setVisibility(r3);
        if (r11 == 0) goto L_0x00b4;
    L_0x00aa:
        r3 = 2130839694; // 0x7f02088e float:1.7284406E38 double:1.0527746896E-314;
        r5.setBackgroundResource(r3);
        r3 = 0;
        r4.setVisibility(r3);
    L_0x00b4:
        r3 = 2131755351; // 0x7f100157 float:1.9141579E38 double:1.0532270843E-314;
        r0 = r23;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.ImageView) r3;
        r4 = 2131755327; // 0x7f10013f float:1.914153E38 double:1.0532270724E-314;
        r0 = r23;
        r4 = r0.findViewById(r4);
        r4 = (com.whatsapp.TextEmojiLabel) r4;
        r5 = 2131755677; // 0x7f10029d float:1.914224E38 double:1.0532272453E-314;
        r0 = r23;
        r5 = r0.findViewById(r5);
        r5 = (com.whatsapp.TextEmojiLabel) r5;
        r6 = 2131755782; // 0x7f100306 float:1.9142453E38 double:1.053227297E-314;
        r0 = r23;
        r6 = r0.findViewById(r6);
        r6 = (android.widget.TextView) r6;
        r7 = 2131755788; // 0x7f10030c float:1.9142465E38 double:1.0532273E-314;
        r0 = r23;
        r12 = r0.findViewById(r7);
        r7 = 2131755786; // 0x7f10030a float:1.9142461E38 double:1.053227299E-314;
        r0 = r23;
        r13 = r0.findViewById(r7);
        r7 = 2131755784; // 0x7f100308 float:1.9142457E38 double:1.053227298E-314;
        r0 = r23;
        r14 = r0.findViewById(r7);
        r7 = 2131755777; // 0x7f100301 float:1.9142443E38 double:1.0532272947E-314;
        r0 = r23;
        r7 = r0.findViewById(r7);
        r7 = (android.widget.TextView) r7;
        r8 = 2131755776; // 0x7f100300 float:1.914244E38 double:1.053227294E-314;
        r0 = r23;
        r8 = r0.findViewById(r8);
        r8 = (android.widget.TextView) r8;
        r9 = 2131755774; // 0x7f1002fe float:1.9142437E38 double:1.0532272933E-314;
        r0 = r23;
        r9 = r0.findViewById(r9);
        r9 = (android.widget.TextView) r9;
        r10 = 2131755789; // 0x7f10030d float:1.9142467E38 double:1.0532273007E-314;
        r0 = r23;
        r15 = r0.findViewById(r10);
        r10 = 2131755787; // 0x7f10030b float:1.9142463E38 double:1.0532272997E-314;
        r0 = r23;
        r16 = r0.findViewById(r10);
        r10 = 2131755785; // 0x7f100309 float:1.914246E38 double:1.0532272987E-314;
        r0 = r23;
        r17 = r0.findViewById(r10);
        r10 = 8;
        r12.setVisibility(r10);
        r10 = 8;
        r13.setVisibility(r10);
        r10 = 8;
        r14.setVisibility(r10);
        r10 = 8;
        r15.setVisibility(r10);
        r10 = 8;
        r0 = r16;
        r0.setVisibility(r10);
        r10 = 8;
        r0 = r17;
        r0.setVisibility(r10);
        r10 = r2 instanceof com.whatsapp.auf;
        if (r10 == 0) goto L_0x019b;
    L_0x015d:
        r10 = 0;
        r6.setVisibility(r10);
        r10 = 8;
        r3.setVisibility(r10);
        r10 = 8;
        r4.setVisibility(r10);
        r10 = 8;
        r5.setVisibility(r10);
        r10 = r2;
        r10 = (com.whatsapp.auf) r10;
        r18 = com.whatsapp.App.az;
        r19 = 2131296306; // 0x7f090032 float:1.8210525E38 double:1.053000286E-314;
        r0 = r10.c;
        r20 = r0;
        r18 = r18.a(r19, r20);
        r19 = 1;
        r0 = r19;
        r0 = new java.lang.Object[r0];
        r19 = r0;
        r20 = 0;
        r10 = r10.c;
        r10 = java.lang.Integer.valueOf(r10);
        r19[r20] = r10;
        r10 = java.lang.String.format(r18, r19);
        r6.setText(r10);
        if (r11 == 0) goto L_0x0281;
    L_0x019b:
        r10 = com.whatsapp.App.as;
        r0 = r2.a;
        r18 = r0;
        r0 = r18;
        r10 = r10.b(r0);
        r18 = 8;
        r0 = r18;
        r6.setVisibility(r0);
        r6 = 0;
        r3.setVisibility(r6);
        r0 = r21;
        r6 = r0.e;
        r6 = com.whatsapp.MessageDetailsActivity.h(r6);
        r6.b(r10, r3);
        r3 = 0;
        r4.setVisibility(r3);
        r4.setContact(r10);
        r3 = r10.n();
        if (r3 == 0) goto L_0x01f1;
    L_0x01ca:
        r3 = r10.f;
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x01f1;
    L_0x01d2:
        r3 = 0;
        r5.setVisibility(r3);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "~";
        r3 = r3.append(r4);
        r4 = r10.f;
        r3 = r3.append(r4);
        r3 = r3.toString();
        r5.a(r3);
        if (r11 == 0) goto L_0x01f6;
    L_0x01f1:
        r3 = 8;
        r5.setVisibility(r3);
    L_0x01f6:
        r3 = r10.p;
        r0 = r21;
        r4 = r0.c;
        r3 = r3.equals(r4);
        if (r3 == 0) goto L_0x0275;
    L_0x0202:
        r3 = 5;
        r4 = r2.a(r3);
        r18 = 0;
        r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1));
        if (r3 <= 0) goto L_0x0225;
    L_0x020d:
        r0 = r21;
        r3 = r0.e;
        r4 = 5;
        r4 = r2.a(r4);
        r3 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r7.setText(r3);
        r3 = 0;
        r12.setVisibility(r3);
        r3 = 0;
        r15.setVisibility(r3);
    L_0x0225:
        r3 = 13;
        r4 = r2.a(r3);
        r18 = 0;
        r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1));
        if (r3 <= 0) goto L_0x024c;
    L_0x0231:
        r0 = r21;
        r3 = r0.e;
        r4 = 13;
        r4 = r2.a(r4);
        r3 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r8.setText(r3);
        r3 = 0;
        r13.setVisibility(r3);
        r3 = 0;
        r0 = r16;
        r0.setVisibility(r3);
    L_0x024c:
        r3 = 8;
        r4 = r2.a(r3);
        r18 = 0;
        r3 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1));
        if (r3 <= 0) goto L_0x027c;
    L_0x0258:
        r0 = r21;
        r3 = r0.e;
        r4 = 8;
        r4 = r2.a(r4);
        r3 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r9.setText(r3);
        r3 = 0;
        r14.setVisibility(r3);
        r3 = 0;
        r0 = r17;
        r0.setVisibility(r3);
        if (r11 == 0) goto L_0x027c;
    L_0x0275:
        r3 = r2.a();
        switch(r3) {
            case 5: goto L_0x02c5;
            case 8: goto L_0x02f2;
            case 13: goto L_0x02db;
            default: goto L_0x027c;
        };
    L_0x027c:
        r0 = r23;
        r0.setTag(r10);
    L_0x0281:
        return;
    L_0x0282:
        r5 = 2131231449; // 0x7f0802d9 float:1.807898E38 double:1.0529682423E-314;
        r3.setText(r5);
        r5 = 2130839665; // 0x7f020871 float:1.7284347E38 double:1.0527746753E-314;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r4.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);
        if (r11 == 0) goto L_0x0058;
    L_0x0293:
        r0 = r21;
        r5 = r0.e;
        r5 = com.whatsapp.MessageDetailsActivity.e(r5);
        r5 = r5.c;
        if (r5 != 0) goto L_0x02c1;
    L_0x029f:
        r5 = 2131231456; // 0x7f0802e0 float:1.8078994E38 double:1.0529682457E-314;
    L_0x02a2:
        r3.setText(r5);
        r5 = 2130839664; // 0x7f020870 float:1.7284345E38 double:1.052774675E-314;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r4.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);
        if (r11 == 0) goto L_0x0058;
    L_0x02b0:
        r5 = 2131231454; // 0x7f0802de float:1.807899E38 double:1.052968245E-314;
        r3.setText(r5);
        r3 = 2130839670; // 0x7f020876 float:1.7284357E38 double:1.0527746777E-314;
        r5 = 0;
        r7 = 0;
        r8 = 0;
        r4.setCompoundDrawablesWithIntrinsicBounds(r3, r5, r7, r8);
        goto L_0x0058;
    L_0x02c1:
        r5 = 2131231458; // 0x7f0802e2 float:1.8078998E38 double:1.0529682467E-314;
        goto L_0x02a2;
    L_0x02c5:
        r0 = r21;
        r3 = r0.e;
        r4 = 5;
        r4 = r2.a(r4);
        r3 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r7.setText(r3);
        r3 = 0;
        r12.setVisibility(r3);
        if (r11 == 0) goto L_0x027c;
    L_0x02db:
        r0 = r21;
        r3 = r0.e;
        r4 = 13;
        r4 = r2.a(r4);
        r3 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r8.setText(r3);
        r3 = 0;
        r13.setVisibility(r3);
        if (r11 == 0) goto L_0x027c;
    L_0x02f2:
        r0 = r21;
        r3 = r0.e;
        r4 = 8;
        r4 = r2.a(r4);
        r2 = com.whatsapp.MessageDetailsActivity.a(r3, r4);
        r9.setText(r2);
        r2 = 0;
        r14.setVisibility(r2);
        goto L_0x027c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.u3.a(int, android.view.View):void");
    }

    static View a(u3 u3Var, View view) {
        u3Var.b = view;
        return view;
    }

    static int a(u3 u3Var, int i) {
        u3Var.d = i;
        return i;
    }

    public int getCount() {
        return MessageDetailsActivity.b(this.e).size();
    }

    private Animation a(float f) {
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration((long) this.a);
        alphaAnimation.setStartOffset((long) (((float) this.a) * f));
        return alphaAnimation;
    }

    static int a(u3 u3Var) {
        return u3Var.d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r19, android.view.View r20, boolean r21) {
        /*
        r18 = this;
        r6 = com.whatsapp.DialogToastActivity.f;
        r0 = r18;
        r2 = r0.e;
        r2 = com.whatsapp.MessageDetailsActivity.b(r2);
        r0 = r19;
        r2 = r2.get(r0);
        r2 = (com.whatsapp.au7) r2;
        r3 = 2131755777; // 0x7f100301 float:1.9142443E38 double:1.0532272947E-314;
        r0 = r20;
        r3 = r0.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131755776; // 0x7f100300 float:1.914244E38 double:1.053227294E-314;
        r0 = r20;
        r4 = r0.findViewById(r4);
        r4 = (android.widget.TextView) r4;
        r5 = 2131755774; // 0x7f1002fe float:1.9142437E38 double:1.0532272933E-314;
        r0 = r20;
        r5 = r0.findViewById(r5);
        r5 = (android.widget.TextView) r5;
        r7 = 2131755789; // 0x7f10030d float:1.9142467E38 double:1.0532273007E-314;
        r0 = r20;
        r7 = r0.findViewById(r7);
        r8 = 2131755787; // 0x7f10030b float:1.9142463E38 double:1.0532272997E-314;
        r0 = r20;
        r8 = r0.findViewById(r8);
        r9 = 2131755785; // 0x7f100309 float:1.914246E38 double:1.0532272987E-314;
        r0 = r20;
        r9 = r0.findViewById(r9);
        r10 = 2131755788; // 0x7f10030c float:1.9142465E38 double:1.0532273E-314;
        r0 = r20;
        r10 = r0.findViewById(r10);
        r11 = 2131755786; // 0x7f10030a float:1.9142461E38 double:1.053227299E-314;
        r0 = r20;
        r11 = r0.findViewById(r11);
        r12 = 2131755784; // 0x7f100308 float:1.9142457E38 double:1.053227298E-314;
        r0 = r20;
        r12 = r0.findViewById(r12);
        r13 = new java.util.ArrayList;
        r14 = 6;
        r13.<init>(r14);
        r2 = r2.a();
        switch(r2) {
            case 5: goto L_0x00d4;
            case 8: goto L_0x0147;
            case 13: goto L_0x010c;
            default: goto L_0x0076;
        };
    L_0x0076:
        r4 = r13.iterator();
    L_0x007a:
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x0094;
    L_0x0080:
        r2 = r4.next();
        r2 = (android.view.View) r2;
        if (r21 == 0) goto L_0x01b9;
    L_0x0088:
        r3 = 0;
        r0 = r18;
        r3 = r0.b(r3);
    L_0x008f:
        r2.startAnimation(r3);
        if (r6 == 0) goto L_0x007a;
    L_0x0094:
        r2 = 2131755783; // 0x7f100307 float:1.9142455E38 double:1.0532272977E-314;
        r0 = r20;
        r2 = r0.findViewById(r2);
        r3 = r2.getHeight();
        r18.a(r19, r20);
        r4 = r2.getWidth();
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5);
        r5 = 0;
        r6 = 0;
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6);
        r2.measure(r4, r5);
        r4 = r2.getMeasuredHeight();
        r5 = r2.getLayoutParams();
        r5.height = r3;
        r5 = new com.whatsapp.a4v;
        r0 = r18;
        r5.<init>(r0, r2, r3, r4);
        r0 = r18;
        r3 = r0.a;
        r6 = (long) r3;
        r5.setDuration(r6);
        r2.startAnimation(r5);
        return;
    L_0x00d4:
        r13.add(r7);
        r2 = com.whatsapp.App.a1();
        if (r2 == 0) goto L_0x0076;
    L_0x00dd:
        if (r21 == 0) goto L_0x0185;
    L_0x00df:
        r2 = new android.view.animation.TranslateAnimation;
        r14 = r3.getWidth();
        r15 = r10.getWidth();
        r14 = r14 - r15;
        r14 = (float) r14;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r0 = r16;
        r1 = r17;
        r2.<init>(r14, r15, r0, r1);
    L_0x00f7:
        r0 = r18;
        r14 = r0.a;
        r14 = (long) r14;
        r2.setDuration(r14);
        r14 = new android.view.animation.DecelerateInterpolator;
        r14.<init>();
        r2.setInterpolator(r14);
        r3.startAnimation(r2);
        if (r6 == 0) goto L_0x0076;
    L_0x010c:
        r13.add(r8);
        r13.add(r10);
        r13.add(r7);
        r2 = com.whatsapp.App.a1();
        if (r2 == 0) goto L_0x0076;
    L_0x011b:
        if (r21 == 0) goto L_0x019a;
    L_0x011d:
        r2 = new android.view.animation.TranslateAnimation;
        r3 = r4.getWidth();
        r14 = r11.getWidth();
        r3 = r3 - r14;
        r3 = (float) r3;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r0 = r16;
        r2.<init>(r3, r14, r15, r0);
    L_0x0132:
        r0 = r18;
        r3 = r0.a;
        r14 = (long) r3;
        r2.setDuration(r14);
        r3 = new android.view.animation.DecelerateInterpolator;
        r3.<init>();
        r2.setInterpolator(r3);
        r4.startAnimation(r2);
        if (r6 == 0) goto L_0x0076;
    L_0x0147:
        r13.add(r9);
        r13.add(r11);
        r13.add(r8);
        r13.add(r10);
        r13.add(r7);
        r2 = com.whatsapp.App.a1();
        if (r2 == 0) goto L_0x0076;
    L_0x015c:
        if (r21 == 0) goto L_0x01ab;
    L_0x015e:
        r2 = new android.view.animation.TranslateAnimation;
        r3 = r5.getWidth();
        r4 = r12.getWidth();
        r3 = r3 - r4;
        r3 = (float) r3;
        r4 = 0;
        r7 = 0;
        r8 = 0;
        r2.<init>(r3, r4, r7, r8);
    L_0x0170:
        r0 = r18;
        r3 = r0.a;
        r8 = (long) r3;
        r2.setDuration(r8);
        r3 = new android.view.animation.DecelerateInterpolator;
        r3.<init>();
        r2.setInterpolator(r3);
        r5.startAnimation(r2);
        goto L_0x0076;
    L_0x0185:
        r2 = new android.view.animation.TranslateAnimation;
        r14 = r7.getWidth();
        r14 = (float) r14;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r0 = r16;
        r1 = r17;
        r2.<init>(r14, r15, r0, r1);
        goto L_0x00f7;
    L_0x019a:
        r2 = new android.view.animation.TranslateAnimation;
        r3 = r8.getWidth();
        r3 = (float) r3;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r0 = r16;
        r2.<init>(r3, r14, r15, r0);
        goto L_0x0132;
    L_0x01ab:
        r2 = new android.view.animation.TranslateAnimation;
        r3 = r9.getWidth();
        r3 = (float) r3;
        r4 = 0;
        r7 = 0;
        r8 = 0;
        r2.<init>(r3, r4, r7, r8);
        goto L_0x0170;
    L_0x01b9:
        r3 = 0;
        r0 = r18;
        r3 = r0.a(r3);
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.u3.a(int, android.view.View, boolean):void");
    }

    public boolean hasStableIds() {
        return true;
    }

    private Animation b(float f) {
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) this.a);
        alphaAnimation.setStartOffset((long) (((float) this.a) * f));
        return alphaAnimation;
    }

    public Object getItem(int i) {
        return MessageDetailsActivity.b(this.e).get(i);
    }

    static View b(u3 u3Var) {
        return u3Var.b;
    }

    static String c(u3 u3Var) {
        return u3Var.c;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            View a = aam.a(this.e.getLayoutInflater(), 2130903227, viewGroup, false);
            if (!DialogToastActivity.f) {
                view = a;
            }
        }
        a(i, view);
        view.setOnClickListener(new a92(this, i));
        return view;
    }

    static void a(u3 u3Var, int i, View view, boolean z) {
        u3Var.a(i, view, z);
    }

    static String a(u3 u3Var, String str) {
        u3Var.c = str;
        return str;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
