package com.whatsapp;

import android.view.View.OnTouchListener;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import org.v;
import org.whispersystems.at;

class zj extends BaseAdapter implements Filterable {
    private static final String z;
    final CallsFragment a;
    private OnTouchListener b;
    private Filter c;

    static {
        char[] toCharArray = "s$APkB$JQH^1dHH]".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 48;
                    break;
                case at.g /*1*/:
                    i2 = 69;
                    break;
                case at.i /*2*/:
                    i2 = 45;
                    break;
                case at.o /*3*/:
                    i2 = 60;
                    break;
                default:
                    i2 = 45;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public rd a(int i) {
        return (rd) CallsFragment.a(this.a).get(i);
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getCount() {
        return CallsFragment.a(this.a).size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10 = this;
        r1 = 1;
        r2 = 0;
        r3 = r10.a(r11);
        r0 = z;
        r4 = 20;
        r4 = com.whatsapp.tp.a(r0, r4);
        r4.e();
        r0 = com.whatsapp.a5a.POSITION;
        r4.a(r0, r11);
        r5 = com.whatsapp.tb.REQUIRES_INFLATE;
        if (r12 != 0) goto L_0x010b;
    L_0x001a:
        r0 = r1;
    L_0x001b:
        r4.a(r5, r0);
        r0 = com.whatsapp.t4.INFLATE;
        r4.b(r0);
        if (r12 != 0) goto L_0x0033;
    L_0x0025:
        r0 = r10.a;
        r5 = 0;
        r0 = r0.getLayoutInflater(r5);
        r5 = 2130903090; // 0x7f030032 float:1.7412988E38 double:1.0528060114E-314;
        r12 = com.whatsapp.aam.a(r0, r5, r13, r2);
    L_0x0033:
        r0 = com.whatsapp.t4.INFLATE;
        r4.a(r0);
        r0 = com.whatsapp.t4.FILL;
        r4.b(r0);
        r5 = r3.f();
        r0 = 2131755351; // 0x7f100157 float:1.9141579E38 double:1.0532270843E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r6 = 2131755383; // 0x7f100177 float:1.9141644E38 double:1.0532271E-314;
        r6 = r12.findViewById(r6);
        r7 = new com.whatsapp.zz;
        r8 = r5.p;
        r9 = r10.a;
        r9 = r9.getActivity();
        r7.<init>(r8, r9);
        r0.setOnClickListener(r7);
        r6.setOnClickListener(r7);
        r6 = r10.a;
        r6 = com.whatsapp.CallsFragment.d(r6);
        r6.b(r5, r0);
        r0 = 2131755327; // 0x7f10013f float:1.914153E38 double:1.0532270724E-314;
        r0 = r12.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        com.whatsapp.a4d.a(r0);
        r6 = r10.a;
        r6 = com.whatsapp.CallsFragment.e(r6);
        r0.setContact(r5, r6);
        r0 = 2131755386; // 0x7f10017a float:1.914165E38 double:1.0532271016E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r5 = r10.a;
        r5 = r5.getActivity();
        r6 = r3.c();
        r5 = com.whatsapp.util.cs.k(r5, r6);
        r0.setText(r5);
        r0 = 2131755385; // 0x7f100179 float:1.9141648E38 double:1.053227101E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r5 = r3.a();
        if (r5 <= r1) goto L_0x00d4;
    L_0x00ab:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r6 = "(";
        r1 = r1.append(r6);
        r5 = java.lang.Integer.toString(r5);
        r1 = r1.append(r5);
        r5 = ")";
        r1 = r1.append(r5);
        r1 = r1.toString();
        r0.setText(r1);
        r0.setVisibility(r2);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x00d9;
    L_0x00d4:
        r1 = 8;
        r0.setVisibility(r1);
    L_0x00d9:
        r0 = 2131755371; // 0x7f10016b float:1.914162E38 double:1.053227094E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = r3.e();
        r0.setImageResource(r1);
        r0 = 2131755384; // 0x7f100178 float:1.9141646E38 double:1.0532271006E-314;
        r0 = r12.findViewById(r0);
        r1 = r10.a;
        r1 = r1.e;
        r0.setOnClickListener(r1);
        r0.setTag(r3);
        r1 = r10.b;
        r0.setOnTouchListener(r1);
        r12.setTag(r3);
        r0 = com.whatsapp.t4.FILL;
        r4.a(r0);
        r4.d();
        return r12;
    L_0x010b:
        r0 = r2;
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.zj.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public Object getItem(int i) {
        return a(i);
    }

    public long getItemId(int i) {
        return (long) ((rd) CallsFragment.a(this.a).get(i)).hashCode();
    }

    public Filter getFilter() {
        if (this.c == null) {
            this.c = new qb(this.a, null);
        }
        return this.c;
    }

    public zj(CallsFragment callsFragment) {
        this.a = callsFragment;
        this.b = new gt(0.15f, 0.15f, 0.15f, 0.15f);
    }
}
