package com.whatsapp;

import android.widget.BaseAdapter;
import com.whatsapp.util.a3;
import com.whatsapp.util.bq;

class aon extends BaseAdapter {
    private uo a;
    private boolean b;
    final WebImagePicker c;

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
        r11 = this;
        r4 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        if (r13 == 0) goto L_0x0014;
    L_0x0005:
        r0 = r13;
        r0 = (android.widget.LinearLayout) r0;
        r0 = r0.getChildCount();
        r1 = r11.c;
        r1 = com.whatsapp.WebImagePicker.c(r1);
        if (r0 == r1) goto L_0x003b;
    L_0x0014:
        r0 = new android.widget.LinearLayout;
        r1 = r11.c;
        r0.<init>(r1);
        r1 = r11.c;
        r1 = com.whatsapp.WebImagePicker.g(r1);
        r1 = r1.l;
        r2 = r11.c;
        r2 = com.whatsapp.WebImagePicker.g(r2);
        r2 = r2.c;
        r3 = r11.c;
        r3 = com.whatsapp.WebImagePicker.g(r3);
        r3 = r3.c;
        r0.setPadding(r1, r2, r4, r3);
        r0.setClickable(r4);
        if (r5 == 0) goto L_0x0129;
    L_0x003b:
        r13 = (android.widget.LinearLayout) r13;
    L_0x003d:
        r6 = r13.getChildCount();
        r0 = r11.c;
        r0 = com.whatsapp.WebImagePicker.c(r0);
        r0 = r0 * r12;
        r2 = r0;
        r3 = r4;
    L_0x004a:
        r0 = r12 + 1;
        r1 = r11.c;
        r1 = com.whatsapp.WebImagePicker.c(r1);
        r0 = r0 * r1;
        if (r2 >= r0) goto L_0x0103;
    L_0x0055:
        r0 = r11.c;
        r0 = com.whatsapp.WebImagePicker.f(r0);
        r0 = r0.size();
        if (r2 >= r0) goto L_0x00e9;
    L_0x0061:
        r0 = r11.c;
        r0 = com.whatsapp.WebImagePicker.f(r0);
        r0 = r0.get(r2);
        r0 = (com.whatsapp.anw) r0;
        if (r6 > r3) goto L_0x00d1;
    L_0x006f:
        r1 = new android.widget.ImageView;
        r7 = r11.c;
        r1.<init>(r7);
        r7 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r1.setScaleType(r7);
        r7 = new android.widget.LinearLayout$LayoutParams;
        r8 = r11.c;
        r8 = com.whatsapp.WebImagePicker.a(r8);
        r9 = r11.c;
        r9 = com.whatsapp.WebImagePicker.a(r9);
        r7.<init>(r8, r9);
        r1.setLayoutParams(r7);
        r8 = r11.c;
        r8 = com.whatsapp.WebImagePicker.g(r8);
        r8 = r8.x;
        r8 = (int) r8;
        r7.rightMargin = r8;
        r7 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r1.setBackgroundResource(r7);
        r7 = r11.c;
        r7 = com.whatsapp.WebImagePicker.g(r7);
        r7 = r7.r;
        r8 = r11.c;
        r8 = com.whatsapp.WebImagePicker.g(r8);
        r8 = r8.r;
        r9 = r11.c;
        r9 = com.whatsapp.WebImagePicker.g(r9);
        r9 = r9.r;
        r10 = r11.c;
        r10 = com.whatsapp.WebImagePicker.g(r10);
        r10 = r10.r;
        r1.setPadding(r7, r8, r9, r10);
        r7 = r11.c;
        r7 = com.whatsapp.WebImagePicker.e(r7);
        r1.setOnClickListener(r7);
        r13.addView(r1);
        if (r5 == 0) goto L_0x00da;
    L_0x00d1:
        r1 = r13.getChildAt(r3);
        r1 = (android.widget.ImageView) r1;
        r1.setVisibility(r4);
    L_0x00da:
        r7 = r11.c;
        r7 = com.whatsapp.WebImagePicker.d(r7);
        r0 = r0.d;
        r7.b(r0, r1);
        r3 = r3 + 1;
        if (r5 == 0) goto L_0x00fe;
    L_0x00e9:
        r0 = r11.c;
        r0 = com.whatsapp.WebImagePicker.c(r0);
        r0 = r0 * r12;
        r0 = r2 - r0;
        if (r6 <= r0) goto L_0x00fe;
    L_0x00f4:
        r0 = r13.getChildAt(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = 4;
        r0.setVisibility(r1);
    L_0x00fe:
        r1 = r3;
        r0 = r2 + 1;
        if (r5 == 0) goto L_0x0125;
    L_0x0103:
        r0 = r11.a;
        if (r0 != 0) goto L_0x0124;
    L_0x0107:
        r0 = r11.b;
        if (r0 == 0) goto L_0x0124;
    L_0x010b:
        r0 = r11.c;
        r0 = com.whatsapp.WebImagePicker.f(r0);
        r0 = r0.size();
        r0 = r0 + -1;
        r1 = r11.c;
        r1 = com.whatsapp.WebImagePicker.c(r1);
        r0 = r0 / r1;
        if (r12 != r0) goto L_0x0124;
    L_0x0120:
        r0 = 0;
        r11.a(r0);
    L_0x0124:
        return r13;
    L_0x0125:
        r2 = r0;
        r3 = r1;
        goto L_0x004a;
    L_0x0129:
        r13 = r0;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aon.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    private void a() {
        if (this.a != null) {
            this.a.cancel(false);
        }
    }

    static void a(aon com_whatsapp_aon) {
        com_whatsapp_aon.a();
    }

    static boolean b(aon com_whatsapp_aon) {
        return com_whatsapp_aon.b;
    }

    public aon(WebImagePicker webImagePicker) {
        this.c = webImagePicker;
    }

    public Object getItem(int i) {
        return null;
    }

    static uo a(aon com_whatsapp_aon, uo uoVar) {
        com_whatsapp_aon.a = uoVar;
        return uoVar;
    }

    static void a(aon com_whatsapp_aon, String str) {
        com_whatsapp_aon.a(str);
    }

    public int getCount() {
        return ((WebImagePicker.f(this.c).size() + WebImagePicker.c(this.c)) - 1) / WebImagePicker.c(this.c);
    }

    private void a(String str) {
        if (str != null) {
            if (this.a != null) {
                this.a.cancel(false);
            }
            this.b = true;
            WebImagePicker.a(this.c, new aqt(str));
            WebImagePicker.f(this.c).clear();
            WebImagePicker.d(this.c).b();
            WebImagePicker.a(this.c, new a3(WebImagePicker.i(this.c)).a(WebImagePicker.a(this.c)).a(4194304).b(this.c.getResources().getDrawable(2130839707)).a(this.c.getResources().getDrawable(2130839525)).a());
        }
        this.a = new uo(this, null);
        bq.a(this.a, new Void[0]);
        if (str != null) {
            notifyDataSetChanged();
        }
    }

    static boolean a(aon com_whatsapp_aon, boolean z) {
        com_whatsapp_aon.b = z;
        return z;
    }
}
