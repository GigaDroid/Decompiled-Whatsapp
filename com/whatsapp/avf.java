package com.whatsapp;

import android.content.Context;
import android.text.TextUtils;
import android.widget.SectionIndexer;
import java.util.ArrayList;

class avf extends av7 implements SectionIndexer {
    private ArrayList e;
    final ContactsFragment f;
    private ArrayList g;

    public avf(ContactsFragment contactsFragment, Context context, ArrayList arrayList) {
        this.f = contactsFragment;
        super(contactsFragment, context, arrayList);
        this.g = new ArrayList();
        this.e = new ArrayList();
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        a();
    }

    public int getSectionForPosition(int i) {
        boolean z = DialogToastActivity.f;
        if (i < 0) {
            return 0;
        }
        if (i >= this.d.size()) {
            return this.g.size() - 1;
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

    public Object[] getSections() {
        return this.g.toArray(new String[1]);
    }

    private void a() {
        boolean z = DialogToastActivity.f;
        this.g = new ArrayList();
        this.e = new ArrayList();
        int size = this.d.size();
        int i = 0;
        String str = "";
        while (i < size) {
            Object a = ((l5) this.d.get(i)).a(getContext());
            if (!TextUtils.isEmpty(a)) {
                String toUpperCase = a.substring(0, 1).toUpperCase();
                if (Character.isDigit(toUpperCase.charAt(0)) || toUpperCase.charAt(0) == '+') {
                    toUpperCase = "#";
                }
                if (!str.equals(toUpperCase)) {
                    this.g.add(toUpperCase);
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

    public int getPositionForSection(int i) {
        if (this.e == null || i >= this.e.size() || i < 0) {
            return -1;
        }
        return ((Integer) this.e.get(i)).intValue();
    }
}
