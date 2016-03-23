package com.whatsapp;

import android.support.v4.view.ViewPager.OnPageChangeListener;

class fc implements OnPageChangeListener {
    final MediaViewPager a;
    final MediaView b;

    fc(MediaViewPager mediaViewPager, MediaView mediaView) {
        this.a = mediaViewPager;
        this.b = mediaView;
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageSelected(int i) {
        MediaView.e(this.a.f, i);
    }
}
