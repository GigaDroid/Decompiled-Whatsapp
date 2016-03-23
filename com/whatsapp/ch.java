package com.whatsapp;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

class ch extends PagerAdapter {
    final aol a;

    ch(aol com_whatsapp_aol, asi com_whatsapp_asi) {
        this(com_whatsapp_aol);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = aol.d(this.a).inflate(2130903177, null);
        ListView listView = (ListView) inflate.findViewById(16908298);
        if (!App.a1()) {
            i = (aol.e(this.a).length - 1) - i;
        }
        if (aol.e(this.a)[i] == null) {
            aol.e(this.a)[i] = new a_2(this.a, aol.l(this.a), i);
        }
        listView.setAdapter(aol.e(this.a)[i]);
        listView.setEmptyView(inflate.findViewById(16908292));
        listView.setTag(Integer.valueOf(i));
        viewGroup.addView(inflate, 0);
        return inflate;
    }

    private ch(aol com_whatsapp_aol) {
        this.a = com_whatsapp_aol;
    }

    public int getCount() {
        return aol.e(this.a).length;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
