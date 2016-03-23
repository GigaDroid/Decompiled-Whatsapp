package com.whatsapp;

import android.widget.BaseAdapter;

class c4 extends BaseAdapter {
    final MessageDetailsActivity a;

    public int getCount() {
        return 1;
    }

    c4(MessageDetailsActivity messageDetailsActivity, ati com_whatsapp_ati) {
        this(messageDetailsActivity);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    private c4(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public Object getItem(int i) {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10 = this;
        r4 = com.whatsapp.DialogToastActivity.f;
        if (r12 != 0) goto L_0x0014;
    L_0x0004:
        r0 = r10.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903226; // 0x7f0300ba float:1.7413264E38 double:1.0528060786E-314;
        r2 = 0;
        r0 = com.whatsapp.aam.a(r0, r1, r13, r2);
        if (r4 == 0) goto L_0x0106;
    L_0x0014:
        r0 = r10.a;
        r0 = com.whatsapp.MessageDetailsActivity.b(r0);
        r1 = 0;
        r0 = r0.get(r1);
        r0 = (com.whatsapp.au7) r0;
        r5 = r0.b;
        r0 = 2131755773; // 0x7f1002fd float:1.9142435E38 double:1.053227293E-314;
        r0 = r12.findViewById(r0);
        r1 = r10.a;
        r1 = com.whatsapp.MessageDetailsActivity.e(r1);
        r1 = r1.c;
        r2 = 2;
        if (r1 != r2) goto L_0x0046;
    L_0x0035:
        r1 = r10.a;
        r1 = com.whatsapp.MessageDetailsActivity.e(r1);
        r1 = r1.r;
        r2 = 1;
        if (r1 != r2) goto L_0x0046;
    L_0x0040:
        r1 = 0;
        r0.setVisibility(r1);
        if (r4 == 0) goto L_0x004b;
    L_0x0046:
        r1 = 8;
        r0.setVisibility(r1);
    L_0x004b:
        r0 = 2131755775; // 0x7f1002ff float:1.9142439E38 double:1.0532272938E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r10.a;
        r1 = com.whatsapp.MessageDetailsActivity.e(r1);
        r1 = r1.c;
        if (r1 != 0) goto L_0x0101;
    L_0x005e:
        r1 = 2131231455; // 0x7f0802df float:1.8078991E38 double:1.0529682453E-314;
    L_0x0061:
        r0.setText(r1);
        r0 = 2131755778; // 0x7f100302 float:1.9142445E38 double:1.053227295E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755777; // 0x7f100301 float:1.9142443E38 double:1.0532272947E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131755776; // 0x7f100300 float:1.914244E38 double:1.053227294E-314;
        r2 = r12.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = 2131755774; // 0x7f1002fe float:1.9142437E38 double:1.0532272933E-314;
        r3 = r12.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r6 = r10.a;
        r7 = r10.a;
        r7 = com.whatsapp.MessageDetailsActivity.e(r7);
        r8 = r7.b;
        r6 = com.whatsapp.MessageDetailsActivity.a(r6, r8);
        r0.setText(r6);
        r0 = 5;
        r6 = r5.a(r0);
        r8 = 0;
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x00b4;
    L_0x00a4:
        r0 = r10.a;
        r6 = 5;
        r6 = r5.a(r6);
        r0 = com.whatsapp.MessageDetailsActivity.a(r0, r6);
        r1.setText(r0);
        if (r4 == 0) goto L_0x00ba;
    L_0x00b4:
        r0 = "\u2014";
        r1.setText(r0);
    L_0x00ba:
        r0 = 13;
        r0 = r5.a(r0);
        r6 = 0;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00d7;
    L_0x00c6:
        r0 = r10.a;
        r1 = 13;
        r6 = r5.a(r1);
        r0 = com.whatsapp.MessageDetailsActivity.a(r0, r6);
        r2.setText(r0);
        if (r4 == 0) goto L_0x00dd;
    L_0x00d7:
        r0 = "\u2014";
        r2.setText(r0);
    L_0x00dd:
        r0 = 8;
        r0 = r5.a(r0);
        r6 = 0;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00fa;
    L_0x00e9:
        r0 = r10.a;
        r1 = 8;
        r6 = r5.a(r1);
        r0 = com.whatsapp.MessageDetailsActivity.a(r0, r6);
        r3.setText(r0);
        if (r4 == 0) goto L_0x0100;
    L_0x00fa:
        r0 = "\u2014";
        r3.setText(r0);
    L_0x0100:
        return r12;
    L_0x0101:
        r1 = 2131231457; // 0x7f0802e1 float:1.8078996E38 double:1.052968246E-314;
        goto L_0x0061;
    L_0x0106:
        r12 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.c4.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
