package com.facebook.rebound.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

class f extends BaseAdapter {
    final SpringConfiguratorView a;
    private final List b;
    private final Context c;

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            View textView = new TextView(this.c);
            textView.setLayoutParams(new LayoutParams(-1, -1));
            int a = a.a(12.0f, this.a.getResources());
            textView.setPadding(a, a, a, a);
            textView.setTextColor(SpringConfiguratorView.a(this.a));
            if (!SpringConfiguratorView.d) {
                view = textView;
                view.setText((CharSequence) this.b.get(i));
                return view;
            }
        }
        view = (TextView) view;
        view.setText((CharSequence) this.b.get(i));
        return view;
    }

    public Object getItem(int i) {
        return this.b.get(i);
    }

    public f(SpringConfiguratorView springConfiguratorView, Context context) {
        this.a = springConfiguratorView;
        this.c = context;
        this.b = new ArrayList();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.b.size();
    }

    public void a() {
        this.b.clear();
        notifyDataSetChanged();
    }

    public void a(String str) {
        this.b.add(str);
        notifyDataSetChanged();
    }
}
