package com.whatsapp.gallerypicker;

import android.support.v4.view.ViewPager.OnPageChangeListener;

class be implements OnPageChangeListener {
    final ImagePreview a;

    public void onPageScrolled(int i, float f, int i2) {
    }

    be(ImagePreview imagePreview) {
        this.a = imagePreview;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageSelected(int i) {
        ImagePreview.a(this.a, i);
    }
}
