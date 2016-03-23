package com.whatsapp;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.v;
import org.whispersystems.at;

class cg extends PagerAdapter implements alp {
    final ContactPicker a;

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object instantiateItem(android.view.ViewGroup r12, int r13) {
        /*
        r11 = this;
        r10 = 2131427352; // 0x7f0b0018 float:1.8476318E38 double:1.053065031E-314;
        r9 = 2131427351; // 0x7f0b0017 float:1.8476316E38 double:1.0530650307E-314;
        r8 = 0;
        r7 = 0;
        r6 = 1;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.a;
        r0 = r0.getLayoutInflater();
        r1 = 2130903106; // 0x7f030042 float:1.741302E38 double:1.0528060193E-314;
        r3 = r0.inflate(r1, r7);
        r0 = 16908298; // 0x102000a float:2.3877257E-38 double:8.353809E-317;
        r0 = r3.findViewById(r0);
        r0 = (android.widget.ListView) r0;
        r1 = new com.whatsapp.util.bz;
        r4 = r11.a;
        r4 = r4.getResources();
        r5 = 2130837747; // 0x7f0200f3 float:1.7280457E38 double:1.0527737277E-314;
        r4 = r4.getDrawable(r5);
        r1.<init>(r4);
        r0.setDivider(r1);
        r0.setHeaderDividersEnabled(r6);
        r0.setFastScrollEnabled(r6);
        r0.setScrollbarFadingEnabled(r6);
        r0.setTextFilterEnabled(r6);
        r1 = 16908292; // 0x1020004 float:2.387724E-38 double:8.353806E-317;
        r1 = r3.findViewById(r1);
        r0.setEmptyView(r1);
        r1 = android.os.Build.VERSION.SDK_INT;
        r4 = 11;
        if (r1 < r4) goto L_0x0097;
    L_0x0052:
        r0.setFastScrollAlwaysVisible(r6);
        r1 = 33554432; // 0x2000000 float:9.403955E-38 double:1.6578092E-316;
        r0.setScrollBarStyle(r1);
        r1 = com.whatsapp.App.av;
        if (r1 == 0) goto L_0x007a;
    L_0x005e:
        r0.setVerticalScrollbarPosition(r6);
        r1 = r11.a;
        r1 = r1.getResources();
        r1 = r1.getDimensionPixelSize(r10);
        r4 = r11.a;
        r4 = r4.getResources();
        r4 = r4.getDimensionPixelSize(r9);
        r0.setPadding(r1, r8, r4, r8);
        if (r2 == 0) goto L_0x009d;
    L_0x007a:
        r1 = 2;
        r0.setVerticalScrollbarPosition(r1);
        r1 = r11.a;
        r1 = r1.getResources();
        r1 = r1.getDimensionPixelSize(r9);
        r4 = r11.a;
        r4 = r4.getResources();
        r4 = r4.getDimensionPixelSize(r10);
        r0.setPadding(r1, r8, r4, r8);
        if (r2 == 0) goto L_0x009d;
    L_0x0097:
        r1 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r0.setSelector(r1);
    L_0x009d:
        r1 = new com.whatsapp.p_;
        r1.<init>(r11, r0);
        r0.setOnItemClickListener(r1);
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.y(r1);
        if (r1 != 0) goto L_0x00ed;
    L_0x00ad:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.m(r1);
        if (r1 != 0) goto L_0x00ed;
    L_0x00b5:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.j(r1);
        if (r1 != 0) goto L_0x00ed;
    L_0x00bd:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.f(r1);
        if (r1 != 0) goto L_0x00ed;
    L_0x00c5:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.p(r1);
        if (r1 != 0) goto L_0x00ed;
    L_0x00cd:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.c(r1);
        if (r1 != 0) goto L_0x00ed;
    L_0x00d5:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.r(r1);
        if (r1 != 0) goto L_0x00ed;
    L_0x00dd:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.z(r1);
        if (r1 != 0) goto L_0x00ed;
    L_0x00e5:
        r1 = new com.whatsapp.wx;
        r1.<init>(r11, r0);
        r0.setOnItemLongClickListener(r1);
    L_0x00ed:
        r1 = new com.whatsapp.z8;
        r1.<init>(r11);
        r4 = 2131755660; // 0x7f10028c float:1.9142206E38 double:1.053227237E-314;
        r4 = r3.findViewById(r4);
        r4.setOnClickListener(r1);
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.j(r1);
        if (r1 != 0) goto L_0x014c;
    L_0x0104:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.m(r1);
        if (r1 != 0) goto L_0x014c;
    L_0x010c:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.y(r1);
        if (r1 != 0) goto L_0x014c;
    L_0x0114:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.f(r1);
        if (r1 != 0) goto L_0x014c;
    L_0x011c:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.p(r1);
        if (r1 != 0) goto L_0x014c;
    L_0x0124:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.c(r1);
        if (r1 != 0) goto L_0x014c;
    L_0x012c:
        r1 = r11.a;
        r1 = r1.getLayoutInflater();
        r4 = 2130903110; // 0x7f030046 float:1.7413029E38 double:1.0528060213E-314;
        r1 = com.whatsapp.aam.a(r1, r4, r7);
        r0.addFooterView(r1, r7, r6);
        r1 = r11.a;
        r1 = r1.getLayoutInflater();
        r4 = 2130903108; // 0x7f030044 float:1.7413025E38 double:1.0528060203E-314;
        r1 = com.whatsapp.aam.a(r1, r4, r7);
        r0.addFooterView(r1, r7, r6);
    L_0x014c:
        r1 = r11.a;
        r1.registerForContextMenu(r0);
        switch(r13) {
            case 0: goto L_0x015f;
            case 1: goto L_0x0231;
            case 2: goto L_0x023c;
            default: goto L_0x0154;
        };
    L_0x0154:
        r1 = java.lang.Integer.valueOf(r13);
        r0.setTag(r1);
        r12.addView(r3, r8);
        return r3;
    L_0x015f:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.y(r1);
        if (r1 != 0) goto L_0x017f;
    L_0x0167:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.f(r1);
        if (r1 != 0) goto L_0x017f;
    L_0x016f:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.p(r1);
        if (r1 != 0) goto L_0x017f;
    L_0x0177:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.c(r1);
        if (r1 == 0) goto L_0x018a;
    L_0x017f:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.s(r1);
        r0.setAdapter(r1);
        if (r2 == 0) goto L_0x0154;
    L_0x018a:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.r(r1);
        if (r1 == 0) goto L_0x019d;
    L_0x0192:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.l(r1);
        r0.setAdapter(r1);
        if (r2 == 0) goto L_0x0154;
    L_0x019d:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.y(r1);
        if (r1 != 0) goto L_0x0226;
    L_0x01a5:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.m(r1);
        if (r1 != 0) goto L_0x0226;
    L_0x01ad:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.j(r1);
        if (r1 != 0) goto L_0x0226;
    L_0x01b5:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.f(r1);
        if (r1 != 0) goto L_0x0226;
    L_0x01bd:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.p(r1);
        if (r1 != 0) goto L_0x0226;
    L_0x01c5:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.c(r1);
        if (r1 != 0) goto L_0x0226;
    L_0x01cd:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.z(r1);
        if (r1 != 0) goto L_0x0226;
    L_0x01d5:
        r1 = r11.a;
        r1 = r1.getLayoutInflater();
        r4 = 2130903109; // 0x7f030045 float:1.7413027E38 double:1.052806021E-314;
        r4 = com.whatsapp.aam.a(r1, r4, r7, r8);
        r1 = 2130837550; // 0x7f02002e float:1.7280057E38 double:1.0527736303E-314;
        r4.setBackgroundResource(r1);
        r1 = 2131755325; // 0x7f10013d float:1.9141526E38 double:1.0532270714E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r5 = 2130839679; // 0x7f02087f float:1.7284375E38 double:1.052774682E-314;
        r5 = com.whatsapp.l5.b(r5);
        r1.setImageBitmap(r5);
        r1 = 2131755475; // 0x7f1001d3 float:1.914183E38 double:1.0532271455E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        com.whatsapp.a4d.a(r1);
        r5 = 2131231545; // 0x7f080339 float:1.8079174E38 double:1.0529682897E-314;
        r1.setText(r5);
        r1 = 2131755477; // 0x7f1001d5 float:1.9141834E38 double:1.0532271465E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r5 = 8;
        r1.setVisibility(r5);
        r1 = new com.whatsapp.j0;
        r1.<init>(r11);
        r4.setOnClickListener(r1);
        r0.addHeaderView(r4, r7, r6);
    L_0x0226:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.h(r1);
        r0.setAdapter(r1);
        if (r2 == 0) goto L_0x0154;
    L_0x0231:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.l(r1);
        r0.setAdapter(r1);
        if (r2 == 0) goto L_0x0154;
    L_0x023c:
        r1 = r11.a;
        r1 = com.whatsapp.ContactPicker.h(r1);
        r0.setAdapter(r1);
        goto L_0x0154;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.cg.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    public int getCount() {
        if (ContactPicker.f(this.a) || ContactPicker.p(this.a) || ContactPicker.c(this.a)) {
            return 3;
        }
        return 1;
    }

    cg(ContactPicker contactPicker, am_ com_whatsapp_am_) {
        this(contactPicker);
    }

    public Parcelable saveState() {
        return null;
    }

    private cg(ContactPicker contactPicker) {
        this.a = contactPicker;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public CharSequence getPageTitle(int i) {
        return "";
    }

    public int a(int i) {
        switch (i) {
            case v.m /*0*/:
                return 2130839733;
            case at.g /*1*/:
                return 2130839419;
            case at.i /*2*/:
                return 2130839696;
            default:
                return 0;
        }
    }
}
