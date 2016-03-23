package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;

class awb extends ArrayAdapter {
    private LayoutInflater a;
    protected List b;
    final ContactInfo c;

    public int getViewTypeCount() {
        return 1;
    }

    public Object getItem(int i) {
        return a(i);
    }

    public l5 a(int i) {
        return (l5) this.b.get(i);
    }

    public void a(List list) {
        this.b = list;
        notifyDataSetChanged();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r7, android.view.View r8, android.view.ViewGroup r9) {
        /*
        r6 = this;
        r5 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        if (r8 != 0) goto L_0x0051;
    L_0x0005:
        r0 = r6.a;
        r1 = 2130903247; // 0x7f0300cf float:1.7413307E38 double:1.052806089E-314;
        r2 = com.whatsapp.aam.a(r0, r1, r9, r5);
        r1 = new com.whatsapp.ak4;
        r0 = 0;
        r1.<init>(r0);
        r0 = 2131755466; // 0x7f1001ca float:1.9141812E38 double:1.053227141E-314;
        r0 = r2.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r1.d = r0;
        r0 = 2131755352; // 0x7f100158 float:1.914158E38 double:1.053227085E-314;
        r0 = r2.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r1.a = r0;
        r0 = 2131755675; // 0x7f10029b float:1.9142236E38 double:1.0532272443E-314;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1.c = r0;
        r0 = 2131755376; // 0x7f100170 float:1.914163E38 double:1.0532270966E-314;
        r0 = r2.findViewById(r0);
        r1.e = r0;
        r2.setTag(r1);
        r0 = r6.getContext();
        r4 = 2131624087; // 0x7f0e0097 float:1.8875344E38 double:1.053162231E-314;
        r0 = android.support.v4.content.ContextCompat.getColor(r0, r4);
        r2.setBackgroundColor(r0);
        if (r3 == 0) goto L_0x009d;
    L_0x0051:
        r0 = r8.getTag();
        r0 = (com.whatsapp.ak4) r0;
    L_0x0057:
        r1 = r6.getCount();
        r1 = r1 + -1;
        if (r7 != r1) goto L_0x0068;
    L_0x005f:
        r1 = r0.e;
        r2 = 8;
        r1.setVisibility(r2);
        if (r3 == 0) goto L_0x006d;
    L_0x0068:
        r1 = r0.e;
        r1.setVisibility(r5);
    L_0x006d:
        r1 = r6.a(r7);
        r0.b = r1;
        r2 = r0.d;
        r2.setContact(r1);
        r2 = r0.a;
        r3 = r1.p;
        r2.setTag(r3);
        r2 = r0.a;
        r3 = "";
        r2.setText(r3);
        r2 = new com.whatsapp.adw;
        r2.<init>(r6, r1, r0);
        r3 = new java.lang.Void[r5];
        com.whatsapp.util.bq.a(r2, r3);
        r2 = r6.c;
        r2 = com.whatsapp.ContactInfo.c(r2);
        r0 = r0.c;
        r2.b(r1, r0);
        return r8;
    L_0x009d:
        r0 = r1;
        r8 = r2;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.awb.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getCount() {
        return this.b == null ? 0 : this.b.size();
    }

    public awb(ContactInfo contactInfo, Context context) {
        this.c = contactInfo;
        super(context, 2130903247, (List) null);
        this.a = LayoutInflater.from(context);
        this.b = new ArrayList();
    }
}
