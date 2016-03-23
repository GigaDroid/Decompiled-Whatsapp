package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

class av7 extends ArrayAdapter {
    private static final String z;
    final ContactsFragment a;
    private final LayoutInflater b;
    private final Filter c;
    protected final ArrayList d;

    static {
        char[] toCharArray = "G+%F7g0\r@7c).\\\"M0._".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = 68;
                    break;
                case at.i /*2*/:
                    i2 = 75;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean hasStableIds() {
        return true;
    }

    public l5 a(int i) {
        return (l5) this.d.get(i);
    }

    public Filter getFilter() {
        return this.c;
    }

    public av7(ContactsFragment contactsFragment, Context context, ArrayList arrayList) {
        this.a = contactsFragment;
        super(context, 2130903109, arrayList);
        this.c = new a37(this, null);
        this.d = arrayList;
        this.b = LayoutInflater.from(context);
    }

    public int getCount() {
        return this.d.size();
    }

    public long getItemId(int i) {
        return (long) (i * 1024);
    }

    public Object getItem(int i) {
        return a(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
        r11 = this;
        r10 = 8;
        r3 = 1;
        r4 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r6 = r11.a(r12);
        r0 = z;
        r1 = 20;
        r7 = com.whatsapp.tp.a(r0, r1);
        r7.e();
        r0 = com.whatsapp.a5a.POSITION;
        r7.a(r0, r12);
        r1 = com.whatsapp.tb.REQUIRES_INFLATE;
        if (r13 != 0) goto L_0x014b;
    L_0x001e:
        r0 = r3;
    L_0x001f:
        r7.a(r1, r0);
        r0 = com.whatsapp.t4.INFLATE;
        r7.b(r0);
        if (r13 != 0) goto L_0x0032;
    L_0x0029:
        r0 = r11.b;
        r1 = 2130903109; // 0x7f030045 float:1.7413027E38 double:1.052806021E-314;
        r13 = com.whatsapp.aam.a(r0, r1, r14, r4);
    L_0x0032:
        r0 = com.whatsapp.t4.INFLATE;
        r7.a(r0);
        r0 = com.whatsapp.t4.FILL;
        r7.b(r0);
        r0 = 2131755325; // 0x7f10013d float:1.9141526E38 double:1.0532270714E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r0.setEnabled(r3);
        r1 = r11.a;
        r1 = com.whatsapp.ContactsFragment.k(r1);
        r1.b(r6, r0);
        r1 = 2131755383; // 0x7f100177 float:1.9141644E38 double:1.0532271E-314;
        r1 = r13.findViewById(r1);
        r2 = new com.whatsapp.zz;
        r8 = r6.p;
        r9 = r11.getContext();
        r2.<init>(r8, r9);
        r1.setOnClickListener(r2);
        r0.setOnClickListener(r2);
        r0 = 2131755475; // 0x7f1001d3 float:1.914183E38 double:1.0532271455E-314;
        r0 = r13.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        com.whatsapp.a4d.a(r0);
        r1 = 2131755477; // 0x7f1001d5 float:1.9141834E38 double:1.0532271465E-314;
        r1 = r13.findViewById(r1);
        r1 = (com.whatsapp.TextEmojiLabel) r1;
        r2 = 2131755476; // 0x7f1001d4 float:1.9141832E38 double:1.053227146E-314;
        r2 = r13.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r8 = r11.a;
        r8 = com.whatsapp.ContactsFragment.l(r8);
        r0.setContact(r6, r8);
        r8 = r6.c();
        if (r8 == 0) goto L_0x00af;
    L_0x0096:
        r8 = r6.p;
        r8 = com.whatsapp.qm.b(r8);
        r1.setText(r8);
        r8 = "";
        r2.setText(r8);
        r8 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r0.setTextColor(r8);
        r13.setLongClickable(r4);
        if (r5 == 0) goto L_0x0142;
    L_0x00af:
        r8 = r6.p;
        r8 = com.whatsapp.aup.a(r8);
        if (r8 == 0) goto L_0x00c8;
    L_0x00b7:
        r8 = 2131232137; // 0x7f080589 float:1.8080375E38 double:1.052968582E-314;
        r1.setText(r8);
        r8 = -7829368; // 0xffffffffff888888 float:NaN double:NaN;
        r0.setTextColor(r8);
        r13.setLongClickable(r3);
        if (r5 == 0) goto L_0x0112;
    L_0x00c8:
        r13.setLongClickable(r4);
        r3 = 2131755474; // 0x7f1001d2 float:1.9141828E38 double:1.053227145E-314;
        r8 = r13.findViewById(r3);
        r3 = r6.m;
        if (r3 == 0) goto L_0x00f7;
    L_0x00d6:
        r3 = r11.a;
        r3 = r3.getResources();
        r9 = 2131624033; // 0x7f0e0061 float:1.8875234E38 double:1.0531622046E-314;
        r3 = r3.getColor(r9);
        r0.setTextColor(r3);
        r3 = r6.w;
        if (r3 == 0) goto L_0x014e;
    L_0x00ea:
        r3 = r6.w;
    L_0x00ec:
        r1.a(r3);
        r8.setVisibility(r10);
        r2.setVisibility(r4);
        if (r5 == 0) goto L_0x0112;
    L_0x00f7:
        r3 = -13679548; // 0xffffffffff2f4444 float:-2.3296935E38 double:NaN;
        r0.setTextColor(r3);
        r8.setVisibility(r4);
        r2.setVisibility(r10);
        r0 = r6.s();
        r1.setText(r0);
        r0 = new com.whatsapp.ym;
        r0.<init>(r11, r6);
        r8.setOnClickListener(r0);
    L_0x0112:
        r0 = r11.a;
        r0 = r0.getResources();
        r0 = r6.a(r0);
        if (r0 == 0) goto L_0x0121;
    L_0x011e:
        r2.setText(r0);
    L_0x0121:
        r0 = r11.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        if (r0 == 0) goto L_0x013f;
    L_0x0129:
        r0 = r11.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r1 = r6.p;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x013f;
    L_0x0137:
        r0 = 2130837744; // 0x7f0200f0 float:1.728045E38 double:1.052773726E-314;
        r13.setBackgroundResource(r0);
        if (r5 == 0) goto L_0x0142;
    L_0x013f:
        r13.setBackgroundResource(r4);
    L_0x0142:
        r0 = com.whatsapp.t4.FILL;
        r7.a(r0);
        r7.d();
        return r13;
    L_0x014b:
        r0 = r4;
        goto L_0x001f;
    L_0x014e:
        r3 = "";
        goto L_0x00ec;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.av7.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
