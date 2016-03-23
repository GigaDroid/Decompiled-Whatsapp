package com.whatsapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class pr extends BaseAdapter {
    final MultipleContactsSelector a;

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            View a = aam.a(this.a.getLayoutInflater(), 2130903234, viewGroup, false);
            if (!DialogToastActivity.f) {
                view = a;
            }
        }
        l5 l5Var = (l5) this.a.w.get(i);
        ((ImageView) view.findViewById(2131755801)).setOnClickListener(new a5y(this, l5Var));
        TextView textView = (TextEmojiLabel) view.findViewById(2131755353);
        a4d.a(textView);
        textView.setContact(l5Var);
        MultipleContactsSelector.c(this.a).b(l5Var, (ImageView) view.findViewById(2131755351));
        return view;
    }

    private pr(MultipleContactsSelector multipleContactsSelector) {
        this.a = multipleContactsSelector;
    }

    pr(MultipleContactsSelector multipleContactsSelector, a4s com_whatsapp_a4s) {
        this(multipleContactsSelector);
    }

    public Object getItem(int i) {
        return this.a.w.get(i);
    }

    public int getCount() {
        return this.a.w.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
