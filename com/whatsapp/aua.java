package com.whatsapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.widget.SectionIndexer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

class aua extends auz implements SectionIndexer {
    private ArrayList e;
    private ArrayList f;
    @NonNull
    private final Set g;
    final ContactPicker h;

    public Object[] getSections() {
        return this.f.toArray(new String[1]);
    }

    public int getSectionForPosition(int i) {
        boolean z = DialogToastActivity.f;
        if (i < 0) {
            return 0;
        }
        if (i >= this.c.size()) {
            return this.f.size() - 1;
        }
        int size = this.e.size() - 1;
        while (size >= 0) {
            if (((Integer) this.e.get(size)).intValue() > i) {
                size--;
                if (z) {
                    break;
                }
            }
            return size;
        }
        return 0;
    }

    public aua(ContactPicker contactPicker, Context context, @NonNull ArrayList arrayList, Set set) {
        this.h = contactPicker;
        super(contactPicker, context, arrayList);
        this.f = new ArrayList();
        this.e = new ArrayList();
        this.g = set;
    }

    private void a() {
        boolean z = DialogToastActivity.f;
        this.f = new ArrayList();
        this.e = new ArrayList();
        int size = this.c.size();
        int i = 0;
        String str = "";
        while (i < size) {
            Object a = ((l5) this.c.get(i)).a(this.h);
            if (!TextUtils.isEmpty(a)) {
                String toUpperCase = a.substring(0, 1).toUpperCase();
                if (Character.isDigit(toUpperCase.charAt(0)) || toUpperCase.charAt(0) == '+') {
                    toUpperCase = "#";
                }
                if (!str.equals(toUpperCase)) {
                    this.f.add(toUpperCase);
                    this.e.add(Integer.valueOf(i));
                    str = toUpperCase;
                }
            }
            int i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    public aua(ContactPicker contactPicker, Context context, ArrayList arrayList) {
        this(contactPicker, context, arrayList, Collections.emptySet());
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        a();
    }

    public int getPositionForSection(int i) {
        if (this.e == null || i >= this.e.size() || i < 0) {
            return -1;
        }
        return ((Integer) this.e.get(i)).intValue();
    }
}
