package com.whatsapp;

import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

class g4 extends BaseAdapter implements Filterable {
    s1 a;
    final DocumentPickerActivity b;

    public int getCount() {
        return DocumentPickerActivity.g(this.b) == null ? 0 : DocumentPickerActivity.g(this.b).size();
    }

    g4(DocumentPickerActivity documentPickerActivity, py pyVar) {
        this(documentPickerActivity);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public Filter getFilter() {
        return this.a;
    }

    private g4(DocumentPickerActivity documentPickerActivity) {
        this.b = documentPickerActivity;
        this.a = new s1(this.b, null);
    }

    public boolean isEmpty() {
        return false;
    }

    public Object getItem(int i) {
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
        /*
        r10 = this;
        r9 = 0;
        r8 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        if (r12 == 0) goto L_0x0008;
    L_0x0006:
        if (r5 == 0) goto L_0x0015;
    L_0x0008:
        r0 = r10.b;
        r0 = r0.getLayoutInflater();
        r1 = 2130903173; // 0x7f030085 float:1.7413157E38 double:1.0528060524E-314;
        r12 = com.whatsapp.aam.a(r0, r1, r9, r8);
    L_0x0015:
        r0 = 2131755126; // 0x7f100076 float:1.9141122E38 double:1.053226973E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = 2131755127; // 0x7f100077 float:1.9141124E38 double:1.0532269736E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131755620; // 0x7f100264 float:1.9142124E38 double:1.053227217E-314;
        r2 = r12.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = 2131755530; // 0x7f10020a float:1.9141942E38 double:1.0532271727E-314;
        r3 = r12.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = r10.b;
        r4 = com.whatsapp.DocumentPickerActivity.g(r4);
        r4 = r4.get(r11);
        r4 = (java.io.File) r4;
        r6 = r10.b;
        r6 = r6.getBaseContext();
        r6 = com.whatsapp.util.cb.a(r6, r4);
        r0.setImageDrawable(r6);
        r0 = r10.b;
        r0 = r0.getBaseContext();
        r6 = r4.getName();
        r7 = r10.b;
        r7 = com.whatsapp.DocumentPickerActivity.a(r7);
        r0 = com.whatsapp.util.bw.a(r0, r9, r6, r7);
        r1.setText(r0);
        r0 = r10.b;
        r0 = r0.getBaseContext();
        r6 = r4.length();
        r0 = com.whatsapp.util.l.a(r0, r6);
        r2.setText(r0);
        r0 = r10.b;
        r0 = r0.getBaseContext();
        r6 = r4.lastModified();
        r0 = com.whatsapp.util.cs.j(r0, r6);
        r3.setText(r0);
        r0 = r10.b;
        r0 = com.whatsapp.DocumentPickerActivity.k(r0);
        r0 = r0.contains(r4);
        if (r0 == 0) goto L_0x009f;
    L_0x0097:
        r0 = 2130837744; // 0x7f0200f0 float:1.728045E38 double:1.052773726E-314;
        r12.setBackgroundResource(r0);
        if (r5 == 0) goto L_0x00a2;
    L_0x009f:
        r12.setBackgroundResource(r8);
    L_0x00a2:
        return r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.g4.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
