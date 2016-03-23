package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class auz extends ArrayAdapter {
    private static final String[] z;
    private Filter a;
    final ContactPicker b;
    protected final ArrayList c;
    private LayoutInflater d;

    static {
        String[] strArr = new String[2];
        String str = "sI";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 83;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 17;
                        break;
                    case at.o /*3*/:
                        i3 = 81;
                        break;
                    default:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "sI";
                    obj = null;
            }
        }
    }

    public Filter getFilter() {
        return this.a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10 = this;
        r9 = 2131624033; // 0x7f0e0061 float:1.8875234E38 double:1.0531622046E-314;
        r8 = 0;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = 1;
        r5 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = r10.a(r11);
        if (r12 != 0) goto L_0x004f;
    L_0x0010:
        r0 = r10.d;
        r1 = 2130903109; // 0x7f030045 float:1.7413027E38 double:1.052806021E-314;
        r2 = com.whatsapp.aam.a(r0, r1, r13, r5);
        r1 = new com.whatsapp.fp;
        r1.<init>(r8);
        r2.setTag(r1);
        r0 = 2131755325; // 0x7f10013d float:1.9141526E38 double:1.0532270714E-314;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1.c = r0;
        r0 = 2131755475; // 0x7f1001d3 float:1.914183E38 double:1.0532271455E-314;
        r0 = r2.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r1.a = r0;
        r0 = 2131755477; // 0x7f1001d5 float:1.9141834E38 double:1.0532271465E-314;
        r0 = r2.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r1.b = r0;
        r0 = 2131755476; // 0x7f1001d4 float:1.9141832E38 double:1.053227146E-314;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1.d = r0;
        if (r3 == 0) goto L_0x022f;
    L_0x004f:
        r0 = r12.getTag();
        r0 = (com.whatsapp.fp) r0;
    L_0x0055:
        r12.setClickable(r5);
        r12.setLongClickable(r5);
        r1 = com.whatsapp.ContactPicker.a(r4);
        if (r1 == 0) goto L_0x0084;
    L_0x0061:
        r12.setBackgroundResource(r5);
        r1 = r0.d;
        r2 = 8;
        r1.setVisibility(r2);
        r1 = r0.b;
        r2 = 8;
        r1.setVisibility(r2);
        r1 = r0.c;
        r2 = 4;
        r1.setVisibility(r2);
        r1 = r0.a;
        r1.setTypeface(r8, r5);
        r1 = r0.a;
        r1.setContact(r4);
        if (r3 == 0) goto L_0x0223;
    L_0x0084:
        r1 = r0.d;
        r1.setVisibility(r5);
        r1 = r0.b;
        r1.setVisibility(r5);
        r1 = r0.b;
        r1.setTypeface(r8, r5);
        r1 = r0.b;
        r2 = r10.b;
        r2 = r2.getResources();
        r2 = r2.getColor(r9);
        r1.setTextColor(r2);
        r1 = r0.c;
        r1.setVisibility(r5);
        r1 = r0.c;
        r1.setEnabled(r6);
        r1 = r10.b;
        r1 = com.whatsapp.ContactPicker.v(r1);
        r2 = r0.c;
        r1.b(r4, r2);
        r1 = r0.a;
        com.whatsapp.a4d.a(r1);
        r1 = r0.a;
        r2 = r10.b;
        r2 = com.whatsapp.ContactPicker.u(r2);
        r1.setContact(r4, r2);
        r1 = r4.c();
        if (r1 != 0) goto L_0x00d3;
    L_0x00cd:
        r1 = r4.m();
        if (r1 == 0) goto L_0x0145;
    L_0x00d3:
        r1 = r10.b;
        r1 = com.whatsapp.ContactPicker.c(r1);
        if (r1 != 0) goto L_0x00eb;
    L_0x00db:
        r1 = r10.b;
        r1 = com.whatsapp.ContactPicker.p(r1);
        if (r1 != 0) goto L_0x00eb;
    L_0x00e3:
        r1 = r10.b;
        r1 = com.whatsapp.ContactPicker.r(r1);
        if (r1 == 0) goto L_0x011e;
    L_0x00eb:
        r1 = r4.c();
        if (r1 == 0) goto L_0x011e;
    L_0x00f1:
        r1 = r4.p;
        r1 = com.whatsapp.qm.h(r1);
        if (r1 != 0) goto L_0x011e;
    L_0x00f9:
        r1 = r0.c;
        r1.setEnabled(r5);
        r12.setClickable(r6);
        r12.setLongClickable(r6);
        r1 = r0.b;
        r2 = 2131231574; // 0x7f080356 float:1.8079233E38 double:1.052968304E-314;
        r1.setText(r2);
        r1 = r0.b;
        r2 = 2;
        r1.setTypeface(r8, r2);
        r1 = r0.b;
        r1.setTextColor(r7);
        r1 = r0.a;
        r1.setTextColor(r7);
        if (r3 == 0) goto L_0x0138;
    L_0x011e:
        r1 = r0.b;
        r2 = r4.p;
        r2 = com.whatsapp.qm.b(r2);
        r1.a(r2);
        r1 = r0.a;
        r2 = r10.b;
        r2 = r2.getResources();
        r2 = r2.getColor(r9);
        r1.setTextColor(r2);
    L_0x0138:
        r1 = r0.d;
        r2 = "";
        r1.setText(r2);
        r12.setLongClickable(r5);
        if (r3 == 0) goto L_0x01aa;
    L_0x0145:
        r1 = r4.p;
        r1 = com.whatsapp.aup.a(r1);
        if (r1 == 0) goto L_0x0167;
    L_0x014d:
        r2 = r0.b;
        r1 = r10.b;
        r1 = com.whatsapp.ContactPicker.z(r1);
        if (r1 == 0) goto L_0x0224;
    L_0x0157:
        r1 = 2131232136; // 0x7f080588 float:1.8080373E38 double:1.0529685817E-314;
    L_0x015a:
        r2.setText(r1);
        r1 = r0.a;
        r1.setTextColor(r7);
        r12.setLongClickable(r6);
        if (r3 == 0) goto L_0x0199;
    L_0x0167:
        r1 = r4.w;
        if (r1 == 0) goto L_0x0229;
    L_0x016b:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r4.w;
        r1 = r1.append(r2);
        r2 = z;
        r2 = r2[r5];
        r1 = r1.append(r2);
        r1 = r1.toString();
    L_0x0182:
        r2 = r0.b;
        r2.a(r1);
        r1 = r0.a;
        r2 = r10.b;
        r2 = r2.getResources();
        r2 = r2.getColor(r9);
        r1.setTextColor(r2);
        r12.setLongClickable(r5);
    L_0x0199:
        r1 = r10.b;
        r1 = r1.getResources();
        r1 = r4.a(r1);
        if (r1 == 0) goto L_0x01aa;
    L_0x01a5:
        r2 = r0.d;
        r2.setText(r1);
    L_0x01aa:
        r1 = r10.b;
        r1 = com.whatsapp.ContactPicker.n(r1);
        if (r1 == 0) goto L_0x01c8;
    L_0x01b2:
        r1 = r10.b;
        r1 = com.whatsapp.ContactPicker.n(r1);
        r2 = r4.p;
        r1 = r1.containsKey(r2);
        if (r1 == 0) goto L_0x01c8;
    L_0x01c0:
        r1 = 2130837744; // 0x7f0200f0 float:1.728045E38 double:1.052773726E-314;
        r12.setBackgroundResource(r1);
        if (r3 == 0) goto L_0x01cb;
    L_0x01c8:
        r12.setBackgroundResource(r5);
    L_0x01cb:
        r1 = r10.b;
        r1 = com.whatsapp.ContactPicker.j(r1);
        if (r1 == 0) goto L_0x0223;
    L_0x01d3:
        r1 = r10.b;
        r1 = com.whatsapp.ContactPicker.A(r1);
        r2 = r10.a(r11);
        r2 = r2.p;
        r1 = r1.contains(r2);
        if (r1 == 0) goto L_0x0223;
    L_0x01e5:
        r1 = r10.b;
        r1 = com.whatsapp.ContactPicker.t(r1);
        r1 = com.whatsapp.l5.e(r1);
        if (r1 == 0) goto L_0x01fb;
    L_0x01f1:
        r1 = r0.b;
        r2 = 2131230944; // 0x7f0800e0 float:1.8077955E38 double:1.052967993E-314;
        r1.setText(r2);
        if (r3 == 0) goto L_0x0203;
    L_0x01fb:
        r1 = r0.b;
        r2 = 2131230945; // 0x7f0800e1 float:1.8077957E38 double:1.0529679933E-314;
        r1.setText(r2);
    L_0x0203:
        r1 = r0.c;
        r1.setEnabled(r5);
        r12.setClickable(r6);
        r12.setLongClickable(r6);
        r1 = r0.b;
        r2 = 2;
        r1.setTypeface(r8, r2);
        r1 = r0.b;
        r1.setTextColor(r7);
        r1 = r0.a;
        r1.setTextColor(r7);
        r0 = r0.d;
        r0.setTextColor(r7);
    L_0x0223:
        return r12;
    L_0x0224:
        r1 = 2131232137; // 0x7f080589 float:1.8080375E38 double:1.052968582E-314;
        goto L_0x015a;
    L_0x0229:
        r1 = z;
        r1 = r1[r6];
        goto L_0x0182;
    L_0x022f:
        r0 = r1;
        r12 = r2;
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.auz.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public long getItemId(int i) {
        return (long) (i * 1024);
    }

    public Object getItem(int i) {
        return a(i);
    }

    public l5 a(int i) {
        return (l5) this.c.get(i);
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getCount() {
        return this.c.size();
    }

    public auz(ContactPicker contactPicker, Context context, ArrayList arrayList) {
        this.b = contactPicker;
        super(context, 2130903109, arrayList);
        this.a = new uf(this, null);
        this.c = arrayList;
        this.d = LayoutInflater.from(context);
    }
}
