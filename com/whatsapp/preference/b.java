package com.whatsapp.preference;

import android.widget.BaseAdapter;

class b extends BaseAdapter {
    final CharSequence[] a;
    final WaFontListPreference b;
    final CharSequence[] c;

    public Object getItem(int i) {
        return this.a[i];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
        r5 = this;
        r2 = 0;
        r3 = com.whatsapp.preference.WaListPreference.a;
        r0 = r5.b;
        r0 = r0.getContext();
        r0 = android.view.LayoutInflater.from(r0);
        r1 = 17367043; // 0x1090003 float:2.5162934E-38 double:8.5804593E-317;
        r4 = 0;
        r4 = r0.inflate(r1, r4, r2);
        r0 = 16908308; // 0x1020014 float:2.3877285E-38 double:8.353814E-317;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        switch(r6) {
            case 0: goto L_0x003b;
            case 1: goto L_0x0021;
            case 2: goto L_0x003e;
            default: goto L_0x0021;
        };
    L_0x0021:
        r1 = r2;
    L_0x0022:
        r2 = r5.b;
        r2 = r2.getContext();
        r2 = r2.getResources();
        r1 = com.whatsapp.ConversationRow.a(r2, r1);
        r0.setTextSize(r1);
        r1 = r5.c;
        r1 = r1[r6];
        r0.setText(r1);
        return r4;
    L_0x003b:
        r1 = -1;
        if (r3 == 0) goto L_0x0022;
    L_0x003e:
        r1 = 1;
        if (r3 == 0) goto L_0x0022;
    L_0x0041:
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.preference.b.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getCount() {
        return this.c.length;
    }

    b(WaFontListPreference waFontListPreference, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this.b = waFontListPreference;
        this.c = charSequenceArr;
        this.a = charSequenceArr2;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
