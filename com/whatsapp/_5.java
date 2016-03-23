package com.whatsapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class _5 extends Filter {
    ArrayList a;
    private final Object b;
    final g7 c;

    protected FilterResults performFiltering(CharSequence charSequence) {
        ArrayList g;
        boolean z = DialogToastActivity.f;
        FilterResults filterResults = new FilterResults();
        if (charSequence.length() > 0) {
            q7 q7Var;
            ArrayList arrayList = new ArrayList();
            ArrayList h = ael.h(charSequence.toString());
            g = qa.g();
            HashSet hashSet = new HashSet();
            Iterator it = g.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                l5 d = qa.d(str);
                if (!d.A() && d.a(h)) {
                    if (arrayList.isEmpty()) {
                        arrayList.add(new a_b(this.c.c.getString(2131231852)));
                    }
                    arrayList.add(new wu(str));
                    hashSet.add(str);
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Iterator it2 = a().iterator();
            Object obj = null;
            while (it2.hasNext()) {
                l5 l5Var = (l5) it2.next();
                if (!(l5Var.l == null || !l5Var.a(h) || hashSet.contains(l5Var.p))) {
                    if (obj == null) {
                        arrayList.add(new a_b(this.c.c.getString(2131231853)));
                    }
                    obj = 1;
                    arrayList.add(new ans(l5Var.p));
                }
                Object obj2 = obj;
                if (z) {
                    break;
                }
                obj = obj2;
            }
            g = App.aK.a(charSequence.toString(), Integer.MAX_VALUE, 100);
            ArrayList arrayList2 = new ArrayList();
            h = new ArrayList();
            Iterator it3 = g.iterator();
            while (it3.hasNext()) {
                q7Var = (q7) it3.next();
                if (q7Var.b.P) {
                    arrayList2.add(q7Var);
                    if (!z) {
                        continue;
                        if (z) {
                            break;
                        }
                    }
                }
                h.add(q7Var);
                continue;
                if (z) {
                    break;
                }
            }
            if (arrayList2.size() > 0) {
                arrayList.add(new a_b(this.c.c.getString(2131231855)));
            }
            it = arrayList2.iterator();
            while (it.hasNext()) {
                q7Var = (q7) it.next();
                arrayList.add(new df(q7Var.b, q7Var.a));
                if (z) {
                    break;
                }
            }
            if (h.size() > 0) {
                arrayList.add(new a_b(this.c.c.getString(2131231854)));
            }
            it = h.iterator();
            while (it.hasNext()) {
                q7Var = (q7) it.next();
                arrayList.add(new df(q7Var.b, q7Var.a));
                if (z) {
                    break;
                }
            }
            if (!z) {
                g = arrayList;
                filterResults.values = g;
                filterResults.count = g.size();
                return filterResults;
            }
        }
        g = this.c.c.a();
        filterResults.values = g;
        filterResults.count = g.size();
        return filterResults;
    }

    public ArrayList a() {
        ArrayList arrayList;
        synchronized (this.b) {
            if (this.a == null) {
                this.a = new ArrayList();
                App.as.d(this.a);
            }
            arrayList = this.a;
        }
        return arrayList;
    }

    private _5(g7 g7Var) {
        this.c = g7Var;
        this.b = new Object();
    }

    public void b() {
        synchronized (this.b) {
            this.a = null;
        }
    }

    _5(g7 g7Var, bm bmVar) {
        this(g7Var);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void publishResults(java.lang.CharSequence r10, android.widget.Filter.FilterResults r11) {
        /*
        r9 = this;
        r8 = 0;
        r7 = 2131755379; // 0x7f100173 float:1.9141636E38 double:1.053227098E-314;
        r6 = 8;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.c;
        r0 = r0.c;
        r2 = r0.getView();
        if (r2 == 0) goto L_0x0135;
    L_0x0012:
        r0 = r11.count;
        if (r0 != 0) goto L_0x005e;
    L_0x0016:
        r0 = r10.length();
        if (r0 <= 0) goto L_0x004e;
    L_0x001c:
        r0 = r2.findViewById(r7);
        r0.setVisibility(r8);
        r3 = r9.c;
        r3 = r3.c;
        r3 = com.whatsapp.ConversationsFragment.l(r3);
        r3.setEmptyView(r0);
        r0 = 2131755571; // 0x7f100233 float:1.9142025E38 double:1.053227193E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r6);
        r0 = 2131755569; // 0x7f100231 float:1.914202E38 double:1.053227192E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r6);
        r0 = 2131755572; // 0x7f100234 float:1.9142027E38 double:1.0532271935E-314;
        r0 = r2.findViewById(r0);
        r0.setVisibility(r6);
        if (r1 == 0) goto L_0x0065;
    L_0x004e:
        r0 = r2.findViewById(r7);
        r0.setVisibility(r6);
        r0 = r9.c;
        r0 = r0.c;
        com.whatsapp.ConversationsFragment.o(r0);
        if (r1 == 0) goto L_0x0065;
    L_0x005e:
        r0 = r2.findViewById(r7);
        r0.setVisibility(r6);
    L_0x0065:
        r0 = r9.c;
        r3 = r0.c;
        r0 = r11.values;
        r0 = (java.util.ArrayList) r0;
        com.whatsapp.ConversationsFragment.a(r3, r0);
        r0 = r9.c;
        r0 = r0.c;
        r0 = com.whatsapp.ConversationsFragment.m(r0);
        if (r0 != 0) goto L_0x0089;
    L_0x007a:
        r0 = r9.c;
        r0 = r0.c;
        r3 = r9.c;
        r3 = r3.c;
        r3 = r3.a();
        com.whatsapp.ConversationsFragment.a(r0, r3);
    L_0x0089:
        r0 = r9.c;
        r3 = r10.toString();
        com.whatsapp.g7.a(r0, r3);
        r0 = r9.c;
        r3 = r9.c;
        r3 = com.whatsapp.g7.a(r3);
        r3 = com.whatsapp.ael.h(r3);
        com.whatsapp.g7.a(r0, r3);
        r0 = r9.c;
        r0 = com.whatsapp.g7.a(r0);
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00ec;
    L_0x00ad:
        r0 = r9.c;
        r0 = r0.c;
        r0 = com.whatsapp.ConversationsFragment.l(r0);
        r3 = new com.whatsapp.util.bz;
        r4 = r9.c;
        r4 = r4.c;
        r4 = r4.getResources();
        r5 = 2130837747; // 0x7f0200f3 float:1.7280457E38 double:1.0527737277E-314;
        r4 = r4.getDrawable(r5);
        r3.<init>(r4);
        r0.setDivider(r3);
        r0 = r9.c;
        r0 = r0.c;
        r0 = com.whatsapp.ConversationsFragment.g(r0);
        if (r0 <= 0) goto L_0x00e1;
    L_0x00d6:
        r0 = r9.c;
        r0 = r0.c;
        r0 = r0.t;
        r0.setVisibility(r8);
        if (r1 == 0) goto L_0x0130;
    L_0x00e1:
        r0 = r9.c;
        r0 = r0.c;
        r0 = r0.t;
        r0.setVisibility(r6);
        if (r1 == 0) goto L_0x0130;
    L_0x00ec:
        r0 = r9.c;
        r0 = r0.c;
        r0 = com.whatsapp.ConversationsFragment.l(r0);
        r1 = 0;
        r0.setDivider(r1);
        r0 = r9.c;
        r0 = r0.c;
        r0 = r0.t;
        r0.setVisibility(r6);
        r0 = r9.c;
        r0 = r0.c;
        r0 = com.whatsapp.ConversationsFragment.m(r0);
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0130;
    L_0x010f:
        if (r2 == 0) goto L_0x0130;
    L_0x0111:
        r0 = r2.findViewById(r7);
        r0 = (android.widget.TextView) r0;
        r1 = r2.getContext();
        r2 = 2131231851; // 0x7f08046b float:1.8079795E38 double:1.052968441E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r4 = r9.c;
        r4 = com.whatsapp.g7.a(r4);
        r3[r8] = r4;
        r1 = r1.getString(r2, r3);
        r0.setText(r1);
    L_0x0130:
        r0 = r9.c;
        r0.notifyDataSetChanged();
    L_0x0135:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp._5.publishResults(java.lang.CharSequence, android.widget.Filter$FilterResults):void");
    }
}
