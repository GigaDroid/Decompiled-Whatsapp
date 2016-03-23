package com.whatsapp;

import android.content.Context;
import android.widget.BaseAdapter;

class a_2 extends BaseAdapter {
    private int a;
    final aol b;
    private Context c;

    public a_2(aol com_whatsapp_aol, Context context, int i) {
        this.b = com_whatsapp_aol;
        this.c = context;
        this.a = i;
    }

    public Object getItem(int i) {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
        r9 = this;
        r8 = 0;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        if (r11 == 0) goto L_0x0015;
    L_0x0006:
        r0 = r11;
        r0 = (android.view.ViewGroup) r0;
        r0 = r0.getChildCount();
        r2 = r9.b;
        r2 = com.whatsapp.aol.k(r2);
        if (r0 == r2) goto L_0x004f;
    L_0x0015:
        r2 = new com.whatsapp.EmojiPicker$EmojiAdapter$1;
        r0 = r9.b;
        r0 = com.whatsapp.aol.l(r0);
        r2.<init>(r9, r0);
        r0 = r1;
    L_0x0021:
        r4 = r9.b;
        r4 = com.whatsapp.aol.k(r4);
        if (r0 >= r4) goto L_0x004d;
    L_0x0029:
        r4 = new com.whatsapp.EmojiPicker$EmojiImageView;
        r5 = r9.b;
        r6 = r9.c;
        r4.<init>(r5, r6);
        r5 = new android.view.ViewGroup$LayoutParams;
        r6 = r9.b;
        r6 = com.whatsapp.aol.g(r6);
        r7 = r9.b;
        r7 = com.whatsapp.aol.g(r7);
        r5.<init>(r6, r7);
        r4.setLayoutParams(r5);
        r2.addView(r4);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0021;
    L_0x004d:
        if (r3 == 0) goto L_0x00cf;
    L_0x004f:
        r11 = (android.view.ViewGroup) r11;
    L_0x0051:
        r2 = r1;
    L_0x0052:
        r0 = r9.b;
        r0 = com.whatsapp.aol.k(r0);
        if (r2 >= r0) goto L_0x00c9;
    L_0x005a:
        r0 = r11.getChildAt(r2);
        r0 = (com.whatsapp.EmojiPicker$EmojiImageView) r0;
        r4 = r9.b;
        r4 = com.whatsapp.aol.k(r4);
        r4 = r4 * r10;
        r4 = r4 + r2;
        r5 = com.whatsapp.aol.i();
        r6 = r9.a;
        r5 = r5[r6];
        r5 = r5.a();
        if (r4 >= r5) goto L_0x00b9;
    L_0x0076:
        r5 = com.whatsapp.aol.i();
        r6 = r9.a;
        r5 = r5[r6];
        r5 = r5.a(r4);
        r0.setEmoji(r5);
        r5 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r0.setBackgroundResource(r5);
        r5 = 1;
        r0.setClickable(r5);
        r5 = r9.b;
        r5 = com.whatsapp.aol.j(r5);
        r0.setOnClickListener(r5);
        r5 = com.whatsapp.aol.i();
        r6 = r9.a;
        r5 = r5[r6];
        r4 = r5.a(r4);
        r4 = com.whatsapp.aqj.a(r4);
        if (r4 == 0) goto L_0x00b4;
    L_0x00aa:
        r4 = new com.whatsapp.iv;
        r4.<init>(r9);
        r0.setOnLongClickListener(r4);
        if (r3 == 0) goto L_0x00b7;
    L_0x00b4:
        r0.setOnLongClickListener(r8);
    L_0x00b7:
        if (r3 == 0) goto L_0x00c5;
    L_0x00b9:
        r0.setEmoji(r8);
        r0.setBackgroundDrawable(r8);
        r0.setClickable(r1);
        r0.setOnLongClickListener(r8);
    L_0x00c5:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x00cd;
    L_0x00c9:
        r11.setClickable(r1);
        return r11;
    L_0x00cd:
        r2 = r0;
        goto L_0x0052;
    L_0x00cf:
        r11 = r2;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a_2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getCount() {
        if (aol.k(this.b) == 0) {
            return 0;
        }
        return ((aol.i()[this.a].a() + aol.k(this.b)) - 1) / aol.k(this.b);
    }
}
