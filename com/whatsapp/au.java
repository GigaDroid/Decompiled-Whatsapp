package com.whatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.whatsapp.contact.d;
import java.util.List;

class au extends ArrayAdapter {
    private final List a;
    private final LayoutInflater b;

    public boolean areAllItemsEnabled() {
        return false;
    }

    public au(Context context, int i, List list) {
        super(context, i, list);
        this.b = LayoutInflater.from(context);
        this.a = list;
    }

    public int getViewTypeCount() {
        return 2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.a.isEmpty()) {
            view = aam.a(this.b, 2130903231, viewGroup, false);
            ((TextView) view.findViewById(2131755472)).setText(2131230972);
            view.setTag(Integer.valueOf(2));
            view.setClickable(false);
            return view;
        }
        if (view == null || ((Integer) view.getTag()).intValue() != 1) {
            View a = aam.a(this.b, 2130903105, viewGroup, false);
            if (!DialogToastActivity.f) {
                view = a;
            }
        }
        TextView textView = (TextView) view.findViewById(2131755467);
        d dVar = (d) getItem(i);
        ((TextView) view.findViewById(2131755466)).setText(dVar.g());
        textView.setText(dVar.a());
        view.setTag(Integer.valueOf(2));
        view.setBackgroundColor(getContext().getResources().getColor(i % 2 == 0 ? 2131624069 : 2131624070));
        return view;
    }

    public int getCount() {
        return Math.max(1, super.getCount());
    }

    public boolean isEnabled(int i) {
        return false;
    }
}
