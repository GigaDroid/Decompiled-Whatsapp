package com.whatsapp;

import android.widget.BaseAdapter;

public class ak1 extends BaseAdapter {
    final LocationPicker a;

    public ak1(LocationPicker locationPicker) {
        this.a = locationPicker;
    }

    public int getCount() {
        if (LocationPicker.n(this.a) == null) {
            return 0;
        }
        return LocationPicker.n(this.a).o();
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public Object getItem(int i) {
        if (LocationPicker.n(this.a) == null || i >= LocationPicker.n(this.a).o()) {
            return null;
        }
        return LocationPicker.n(this.a).b(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
        r8 = this;
        r3 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        if (r10 != 0) goto L_0x0015;
    L_0x0005:
        r0 = r8.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903213; // 0x7f0300ad float:1.7413238E38 double:1.052806072E-314;
        r2 = 0;
        r0 = com.whatsapp.aam.a(r0, r1, r2);
        if (r4 == 0) goto L_0x00be;
    L_0x0015:
        r0 = 2131755746; // 0x7f1002e2 float:1.914238E38 double:1.0532272794E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755747; // 0x7f1002e3 float:1.9142382E38 double:1.05322728E-314;
        r1 = r10.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131755735; // 0x7f1002d7 float:1.9142358E38 double:1.053227274E-314;
        r2 = r10.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r5 = r8.a;
        r5 = com.whatsapp.LocationPicker.n(r5);
        r5 = r5.b(r9);
        r6 = r5.name;
        r0.setText(r6);
        r6 = r5.vicinity;
        if (r6 == 0) goto L_0x005c;
    L_0x0043:
        r6 = "";
        r7 = r5.vicinity;
        r6 = r6.equals(r7);
        if (r6 != 0) goto L_0x005c;
    L_0x004e:
        r1.setVisibility(r3);
        r6 = r5.vicinity;
        r1.setText(r6);
        r6 = 1;
        r1.setSingleLine(r6);
        if (r4 == 0) goto L_0x0061;
    L_0x005c:
        r6 = 8;
        r1.setVisibility(r6);
    L_0x0061:
        r1 = r8.a;
        r1 = com.whatsapp.LocationPicker.g(r1);
        if (r5 != r1) goto L_0x0071;
    L_0x0069:
        r1 = 2130839623; // 0x7f020847 float:1.7284262E38 double:1.0527746545E-314;
        r0.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r1, r3);
        if (r4 == 0) goto L_0x0074;
    L_0x0071:
        r0.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3);
    L_0x0074:
        r0 = r5.source;
        switch(r0) {
            case 1: goto L_0x0092;
            case 2: goto L_0x00a1;
            case 3: goto L_0x00b0;
            default: goto L_0x0079;
        };
    L_0x0079:
        r0 = r3;
    L_0x007a:
        r2.setPadding(r0, r0, r0, r0);
        r0 = r5.icon;
        if (r0 == 0) goto L_0x008e;
    L_0x0081:
        r0 = r8.a;
        r0 = com.whatsapp.LocationPicker.m(r0);
        r1 = r5.icon;
        r0.b(r1, r2);
        if (r4 == 0) goto L_0x0091;
    L_0x008e:
        r2.setImageResource(r3);
    L_0x0091:
        return r10;
    L_0x0092:
        r0 = r8.a;
        r0 = r0.getResources();
        r1 = 2131427528; // 0x7f0b00c8 float:1.8476675E38 double:1.053065118E-314;
        r0 = r0.getDimensionPixelSize(r1);
        if (r4 == 0) goto L_0x007a;
    L_0x00a1:
        r0 = r8.a;
        r0 = r0.getResources();
        r1 = 2131427530; // 0x7f0b00ca float:1.8476679E38 double:1.053065119E-314;
        r0 = r0.getDimensionPixelSize(r1);
        if (r4 == 0) goto L_0x007a;
    L_0x00b0:
        r0 = r8.a;
        r0 = r0.getResources();
        r1 = 2131427529; // 0x7f0b00c9 float:1.8476677E38 double:1.0530651187E-314;
        r0 = r0.getDimensionPixelSize(r1);
        goto L_0x007a;
    L_0x00be:
        r10 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ak1.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
