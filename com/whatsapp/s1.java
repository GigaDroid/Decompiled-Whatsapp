package com.whatsapp;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import com.whatsapp.util.l;
import java.io.File;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class s1 extends Filter {
    int a;
    final DocumentPickerActivity b;

    s1(DocumentPickerActivity documentPickerActivity, py pyVar) {
        this(documentPickerActivity);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        ArrayList h;
        List list;
        FilterResults filterResults;
        boolean z = DialogToastActivity.f;
        if (charSequence != null) {
            h = ael.h(charSequence.toString());
        } else {
            h = null;
        }
        if (this.a != DocumentPickerActivity.d(this.b)) {
            this.a = DocumentPickerActivity.d(this.b);
            DocumentPickerActivity.b(DocumentPickerActivity.j(this.b), this.a);
        }
        if (!(h == null || h.isEmpty())) {
            List arrayList = new ArrayList();
            for (File file : DocumentPickerActivity.j(this.b)) {
                Object obj;
                String replaceAll = ael.q.matcher(file.getName()).replaceAll(" ");
                Iterator it = h.iterator();
                Object obj2 = 1;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    BreakIterator a = l.a();
                    a.setText(replaceAll);
                    int first = a.first();
                    Object obj3 = null;
                    int i = first;
                    first = a.next();
                    while (first != -1) {
                        if (ael.o(replaceAll.substring(i, first)).startsWith(str)) {
                            obj3 = 1;
                            if (!z) {
                                break;
                            }
                        }
                        i = a.next();
                        if (z) {
                            break;
                        }
                        int i2 = i;
                        i = first;
                        first = i2;
                    }
                    if (obj3 == null) {
                        obj = null;
                        if (!z) {
                            break;
                        }
                    }
                    obj = obj2;
                    if (z) {
                        break;
                    }
                    obj2 = obj;
                }
                obj = obj2;
                if (obj != null) {
                    arrayList.add(file);
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (!z) {
                list = arrayList;
                filterResults = new FilterResults();
                filterResults.values = list;
                filterResults.count = list.size();
                return filterResults;
            }
        }
        list = DocumentPickerActivity.j(this.b);
        filterResults = new FilterResults();
        filterResults.values = list;
        filterResults.count = list.size();
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        if (filterResults != null) {
            DocumentPickerActivity.a(this.b, (ArrayList) filterResults.values);
        }
        DocumentPickerActivity.l(this.b).notifyDataSetChanged();
        DocumentPickerActivity.f(this.b);
    }

    private s1(DocumentPickerActivity documentPickerActivity) {
        this.b = documentPickerActivity;
        this.a = 0;
    }
}
