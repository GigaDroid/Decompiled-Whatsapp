package com.whatsapp;

import android.widget.BaseAdapter;

public class cr extends BaseAdapter {
    final LocationPicker2 a;

    public Object getItem(int i) {
        if (LocationPicker2.r(this.a) == null || i >= LocationPicker2.r(this.a).o()) {
            return null;
        }
        return LocationPicker2.r(this.a).b(i);
    }

    public int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
        r9 = this;
        r8 = 0;
        r3 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        if (r11 != 0) goto L_0x0015;
    L_0x0006:
        r0 = r9.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903213; // 0x7f0300ad float:1.7413238E38 double:1.052806072E-314;
        r0 = com.whatsapp.aam.a(r0, r1, r8);
        if (r4 == 0) goto L_0x00c5;
    L_0x0015:
        r0 = 2131755746; // 0x7f1002e2 float:1.914238E38 double:1.0532272794E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755747; // 0x7f1002e3 float:1.9142382E38 double:1.05322728E-314;
        r1 = r11.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131755735; // 0x7f1002d7 float:1.9142358E38 double:1.053227274E-314;
        r2 = r11.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r5 = r9.a;
        r5 = com.whatsapp.LocationPicker2.r(r5);
        r5 = r5.b(r10);
        r6 = r5.name;
        r0.setText(r6);
        r6 = r5.vicinity;
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 != 0) goto L_0x0055;
    L_0x0047:
        r1.setVisibility(r3);
        r6 = r5.vicinity;
        r1.setText(r6);
        r6 = 1;
        r1.setSingleLine(r6);
        if (r4 == 0) goto L_0x005a;
    L_0x0055:
        r6 = 8;
        r1.setVisibility(r6);
    L_0x005a:
        r1 = r9.a;
        r1 = com.whatsapp.LocationPicker2.h(r1);
        if (r5 != r1) goto L_0x0078;
    L_0x0062:
        r1 = new android.graphics.drawable.BitmapDrawable;
        r6 = r9.a;
        r6 = r6.getResources();
        r7 = r9.a;
        r7 = com.whatsapp.LocationPicker2.n(r7);
        r1.<init>(r6, r7);
        r0.setCompoundDrawablesWithIntrinsicBounds(r8, r8, r1, r8);
        if (r4 == 0) goto L_0x007b;
    L_0x0078:
        r0.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3);
    L_0x007b:
        r0 = r5.source;
        switch(r0) {
            case 1: goto L_0x0099;
            case 2: goto L_0x00a8;
            case 3: goto L_0x00b7;
            default: goto L_0x0080;
        };
    L_0x0080:
        r0 = r3;
    L_0x0081:
        r2.setPadding(r0, r0, r0, r0);
        r0 = r5.icon;
        if (r0 == 0) goto L_0x0095;
    L_0x0088:
        r0 = r9.a;
        r0 = com.whatsapp.LocationPicker2.k(r0);
        r1 = r5.icon;
        r0.b(r1, r2);
        if (r4 == 0) goto L_0x0098;
    L_0x0095:
        r2.setImageDrawable(r8);
    L_0x0098:
        return r11;
    L_0x0099:
        r0 = r9.a;
        r0 = r0.getResources();
        r1 = 2131427528; // 0x7f0b00c8 float:1.8476675E38 double:1.053065118E-314;
        r0 = r0.getDimensionPixelSize(r1);
        if (r4 == 0) goto L_0x0081;
    L_0x00a8:
        r0 = r9.a;
        r0 = r0.getResources();
        r1 = 2131427530; // 0x7f0b00ca float:1.8476679E38 double:1.053065119E-314;
        r0 = r0.getDimensionPixelSize(r1);
        if (r4 == 0) goto L_0x0081;
    L_0x00b7:
        r0 = r9.a;
        r0 = r0.getResources();
        r1 = 2131427529; // 0x7f0b00c9 float:1.8476677E38 double:1.0530651187E-314;
        r0 = r0.getDimensionPixelSize(r1);
        goto L_0x0081;
    L_0x00c5:
        r11 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cr.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getCount() {
        if (LocationPicker2.r(this.a) == null) {
            return 0;
        }
        return LocationPicker2.r(this.a).o();
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public cr(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
    }
}
