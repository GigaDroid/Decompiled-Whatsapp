package com.whatsapp;

import android.support.v4.view.ViewPager.OnPageChangeListener;

class e9 implements OnPageChangeListener {
    final PagerSlidingTabStrip a;

    public void onPageSelected(int i) {
        if (this.a.d != null) {
            this.a.d.onPageSelected(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        PagerSlidingTabStrip.a(this.a, i);
        PagerSlidingTabStrip.a(this.a, f);
        PagerSlidingTabStrip.a(this.a, i, (int) (((float) PagerSlidingTabStrip.c(this.a).getChildAt(i).getWidth()) * f));
        this.a.invalidate();
        if (this.a.d != null) {
            this.a.d.onPageScrolled(i, f, i2);
        }
    }

    e9(PagerSlidingTabStrip pagerSlidingTabStrip, a56 com_whatsapp_a56) {
        this(pagerSlidingTabStrip);
    }

    private e9(PagerSlidingTabStrip pagerSlidingTabStrip) {
        this.a = pagerSlidingTabStrip;
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            PagerSlidingTabStrip.a(this.a, PagerSlidingTabStrip.a(this.a).getCurrentItem(), 0);
        }
        if (this.a.d != null) {
            this.a.d.onPageScrollStateChanged(i);
        }
    }
}
