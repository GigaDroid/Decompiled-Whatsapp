package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class yz implements OnClickListener {
    final int a;
    final PagerSlidingTabStrip b;

    public void onClick(View view) {
        PagerSlidingTabStrip.a(this.b).setCurrentItem(this.a);
    }

    yz(PagerSlidingTabStrip pagerSlidingTabStrip, int i) {
        this.b = pagerSlidingTabStrip;
        this.a = i;
    }
}
