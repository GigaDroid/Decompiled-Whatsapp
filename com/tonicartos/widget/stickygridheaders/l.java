package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;

public class l extends BaseAdapter implements r {
    private ListAdapter a;
    private DataSetObserver b;

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.a.getView(i, view, viewGroup);
    }

    public l(ListAdapter listAdapter) {
        this.b = new o(this);
        this.a = listAdapter;
        listAdapter.registerDataSetObserver(this.b);
    }

    public View a(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    public Object getItem(int i) {
        return this.a.getItem(i);
    }

    public int a() {
        return 0;
    }

    public int a(int i) {
        return 0;
    }

    public int getCount() {
        return this.a.getCount();
    }

    public long getItemId(int i) {
        return this.a.getItemId(i);
    }
}
