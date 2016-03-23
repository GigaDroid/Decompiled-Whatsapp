package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import java.util.List;

class ll extends ArrayAdapter {
    public final LayoutInflater a;
    final ListChatInfo b;

    public int getCount() {
        return ListChatInfo.h(this.b).size();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
        r7 = this;
        r3 = 0;
        r6 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        if (r9 != 0) goto L_0x0057;
    L_0x0006:
        r0 = r7.getItemViewType(r8);
        if (r0 != 0) goto L_0x00bb;
    L_0x000c:
        r0 = 2130903191; // 0x7f030097 float:1.7413193E38 double:1.0528060613E-314;
    L_0x000f:
        r1 = r7.a;
        r2 = com.whatsapp.aam.a(r1, r0, r10, r6);
        r1 = new com.whatsapp.am0;
        r1.<init>(r3);
        r0 = 2131755466; // 0x7f1001ca float:1.9141812E38 double:1.053227141E-314;
        r0 = r2.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r1.a = r0;
        r0 = 2131755352; // 0x7f100158 float:1.914158E38 double:1.053227085E-314;
        r0 = r2.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r1.d = r0;
        r0 = 2131755675; // 0x7f10029b float:1.9142236E38 double:1.0532272443E-314;
        r0 = r2.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1.c = r0;
        r0 = 2131755376; // 0x7f100170 float:1.914163E38 double:1.0532270966E-314;
        r0 = r2.findViewById(r0);
        r1.b = r0;
        r2.setTag(r1);
        r0 = r7.getContext();
        r5 = 2131624087; // 0x7f0e0097 float:1.8875344E38 double:1.053162231E-314;
        r0 = android.support.v4.content.ContextCompat.getColor(r0, r5);
        r2.setBackgroundColor(r0);
        if (r4 == 0) goto L_0x00c2;
    L_0x0057:
        r0 = r9.getTag();
        r0 = (com.whatsapp.am0) r0;
        r1 = r0;
    L_0x005e:
        r0 = r7.getCount();
        r0 = r0 + -1;
        if (r8 != r0) goto L_0x006f;
    L_0x0066:
        r0 = r1.b;
        r2 = 8;
        r0.setVisibility(r2);
        if (r4 == 0) goto L_0x0074;
    L_0x006f:
        r0 = r1.b;
        r0.setVisibility(r6);
    L_0x0074:
        r0 = r7.getItem(r8);
        r0 = (com.whatsapp.l5) r0;
        r1.e = r0;
        r2 = r1.a;
        r2.setContact(r0);
        r2 = r7.b;
        r2 = com.whatsapp.ListChatInfo.a(r2);
        r5 = r1.c;
        r2.b(r0, r5);
        r2 = r0.n();
        if (r2 == 0) goto L_0x00b3;
    L_0x0092:
        r5 = r1.d;
        r2 = r0.f;
        if (r2 == 0) goto L_0x00c0;
    L_0x0098:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "~";
        r2 = r2.append(r3);
        r3 = r0.f;
        r2 = r2.append(r3);
        r2 = r2.toString();
    L_0x00ae:
        r5.a(r2);
        if (r4 == 0) goto L_0x00ba;
    L_0x00b3:
        r1 = r1.d;
        r0 = r0.w;
        r1.a(r0);
    L_0x00ba:
        return r9;
    L_0x00bb:
        r0 = 2130903192; // 0x7f030098 float:1.7413195E38 double:1.052806062E-314;
        goto L_0x000f;
    L_0x00c0:
        r2 = r3;
        goto L_0x00ae;
    L_0x00c2:
        r9 = r2;
        goto L_0x005e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ll.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 2;
    }

    public int getItemViewType(int i) {
        return ((l5) getItem(i)).n() ? 1 : 0;
    }

    public ll(ListChatInfo listChatInfo, Context context, int i, List list) {
        this.b = listChatInfo;
        super(context, i, list);
        this.a = LayoutInflater.from(context);
    }
}
