package com.whatsapp;

import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.Iterator;

class aer extends Filter {
    final avx a;

    aer(avx com_whatsapp_avx, a4s com_whatsapp_a4s) {
        this(com_whatsapp_avx);
    }

    private aer(avx com_whatsapp_avx) {
        this.a = com_whatsapp_avx;
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        boolean z = DialogToastActivity.f;
        FilterResults filterResults = new FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList arrayList = new ArrayList();
            ArrayList h = ael.h(charSequence.toString());
            Iterator it = MultipleContactsSelector.b(this.a.a).iterator();
            while (it.hasNext()) {
                l5 l5Var = (l5) it.next();
                if (l5Var.a(h) && !MultipleContactsSelector.a(this.a.a, l5Var.p)) {
                    arrayList.add(l5Var);
                    continue;
                }
                if (z) {
                    break;
                }
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
        }
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        String str;
        avx.a(this.a, (ArrayList) filterResults.values);
        MultipleContactsSelector multipleContactsSelector = this.a.a;
        if (charSequence == null) {
            str = null;
        } else {
            str = charSequence.toString();
        }
        MultipleContactsSelector.a(multipleContactsSelector, ael.h(str));
        this.a.notifyDataSetChanged();
    }

    public CharSequence convertResultToString(Object obj) {
        return (obj == null || !(obj instanceof l5)) ? super.convertResultToString(obj) : ((l5) obj).a(this.a.a);
    }
}
