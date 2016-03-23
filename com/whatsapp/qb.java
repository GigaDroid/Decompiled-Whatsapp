package com.whatsapp;

import android.text.TextUtils;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.ListIterator;

class qb extends Filter {
    final CallsFragment a;

    qb(CallsFragment callsFragment, xq xqVar) {
        this(callsFragment);
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        String str;
        CallsFragment.b(this.a, (ArrayList) filterResults.values);
        if (CallsFragment.a(this.a) == null) {
            CallsFragment.b(this.a, CallsFragment.j(this.a));
        }
        CallsFragment.a(this.a, charSequence);
        CallsFragment callsFragment = this.a;
        if (charSequence == null) {
            str = null;
        } else {
            str = charSequence.toString();
        }
        CallsFragment.c(callsFragment, ael.h(str));
        CallsFragment.g(this.a);
        CallsFragment.b(this.a);
        CallsFragment.h(this.a).notifyDataSetChanged();
    }

    private qb(CallsFragment callsFragment) {
        this.a = callsFragment;
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        boolean z = DialogToastActivity.f;
        FilterResults filterResults = new FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            ArrayList arrayList2 = new ArrayList(CallsFragment.j(this.a));
            ArrayList h = ael.h(charSequence.toString());
            ListIterator listIterator = arrayList2.listIterator();
            while (listIterator.hasNext()) {
                if (!((rd) listIterator.next()).f().a(h)) {
                    listIterator.remove();
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (!z) {
                arrayList = arrayList2;
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }
        }
        arrayList = CallsFragment.j(this.a);
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }
}
