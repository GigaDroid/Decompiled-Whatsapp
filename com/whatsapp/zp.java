package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

class zp extends BaseAdapter {
    public LayoutInflater a;
    final BroadcastDetails b;

    public Object getItem(int i) {
        return BroadcastDetails.d(this.b)[i];
    }

    public zp(BroadcastDetails broadcastDetails, Context context) {
        this.b = broadcastDetails;
        this.a = LayoutInflater.from(context);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10 = this;
        r1 = 2130839665; // 0x7f020871 float:1.7284347E38 double:1.0527746753E-314;
        r9 = 5;
        r3 = com.whatsapp.DialogToastActivity.f;
        if (r12 != 0) goto L_0x0014;
    L_0x0008:
        r0 = r10.a;
        r2 = 2130903084; // 0x7f03002c float:1.7412976E38 double:1.0528060084E-314;
        r4 = 0;
        r0 = com.whatsapp.aam.a(r0, r2, r13, r4);
        if (r3 == 0) goto L_0x00ab;
    L_0x0014:
        r0 = 2131755352; // 0x7f100158 float:1.914158E38 double:1.053227085E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r2 = r10.b;
        r2 = com.whatsapp.BroadcastDetails.a(r2);
        r2 = r2.d;
        r2 = com.whatsapp.protocol.b7.a(r2, r9);
        if (r2 < 0) goto L_0x002d;
    L_0x002b:
        if (r3 == 0) goto L_0x0068;
    L_0x002d:
        r2 = r10.b;
        r2 = com.whatsapp.BroadcastDetails.a(r2);
        r2 = r2.d;
        r4 = 4;
        if (r2 != r4) goto L_0x0065;
    L_0x0038:
        r2 = 2130839673; // 0x7f020879 float:1.7284363E38 double:1.052774679E-314;
        r4 = com.whatsapp.App.aK;
        r5 = new com.whatsapp.protocol.c3;
        r6 = r10.b;
        r6 = com.whatsapp.BroadcastDetails.d(r6);
        r6 = r6[r11];
        r7 = 1;
        r8 = r10.b;
        r8 = com.whatsapp.BroadcastDetails.a(r8);
        r8 = r8.k;
        r8 = r8.b;
        r5.<init>(r6, r7, r8);
        r4 = r4.a(r5);
        if (r4 == 0) goto L_0x00a9;
    L_0x005b:
        r4 = r4.d;
        r4 = com.whatsapp.protocol.b7.a(r4, r9);
        if (r4 < 0) goto L_0x00a9;
    L_0x0063:
        if (r3 == 0) goto L_0x0068;
    L_0x0065:
        r1 = 2130839668; // 0x7f020874 float:1.7284353E38 double:1.052774677E-314;
    L_0x0068:
        r0.setImageResource(r1);
        r0 = com.whatsapp.App.as;
        r1 = r10.b;
        r1 = com.whatsapp.BroadcastDetails.d(r1);
        r1 = r1[r11];
        r1 = r0.b(r1);
        r0 = 2131755351; // 0x7f100157 float:1.9141579E38 double:1.0532270843E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r2 = r10.b;
        r2 = com.whatsapp.BroadcastDetails.e(r2);
        r2.b(r1, r0);
        r0 = 2131755353; // 0x7f100159 float:1.9141583E38 double:1.0532270853E-314;
        r0 = r12.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r0.setContact(r1);
        r0 = 2131755354; // 0x7f10015a float:1.9141585E38 double:1.0532270857E-314;
        r0 = r12.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r2 = r1.w;
        r0.a(r2);
        r12.setTag(r1);
        return r12;
    L_0x00a9:
        r1 = r2;
        goto L_0x0063;
    L_0x00ab:
        r12 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.zp.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public int getCount() {
        return BroadcastDetails.d(this.b).length;
    }
}
