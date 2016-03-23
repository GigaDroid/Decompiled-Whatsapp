package com.tonicartos.widget.stickygridheaders;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class k extends BaseAdapter implements r {
    private h a;
    private List b;

    public Object getItem(int i) {
        return this.a.getItem(i);
    }

    public int a(int i) {
        return ((j) this.b.get(i)).c();
    }

    public View a(int i, View view, ViewGroup viewGroup) {
        return this.a.a(((j) this.b.get(i)).b(), view, viewGroup);
    }

    public k(h hVar) {
        this.a = hVar;
        hVar.registerDataSetObserver(new d(this, null));
        this.b = a(hVar);
    }

    public int getCount() {
        return this.a.getCount();
    }

    protected List a(h hVar) {
        boolean z = StickyGridHeadersGridView.a;
        Map hashMap = new HashMap();
        List arrayList = new ArrayList();
        int i = 0;
        while (i < hVar.getCount()) {
            long a = hVar.a(i);
            j jVar = (j) hashMap.get(Long.valueOf(a));
            if (jVar == null) {
                jVar = new j(this, i);
                arrayList.add(jVar);
            }
            jVar.a();
            hashMap.put(Long.valueOf(a), jVar);
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return arrayList;
    }

    static h a(k kVar) {
        return kVar.a;
    }

    public int a() {
        return this.b.size();
    }

    static List a(k kVar, List list) {
        kVar.b = list;
        return list;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return this.a.getView(i, view, viewGroup);
    }

    public long getItemId(int i) {
        return this.a.getItemId(i);
    }
}
