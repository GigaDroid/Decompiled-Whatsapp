package com.whatsapp;

import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.design.widget.TabLayout.Tab;
import android.support.v4.view.ViewPager;

class aio implements OnTabSelectedListener {
    final MediaGallery a;
    final ViewPager b;

    public void onTabUnselected(Tab tab) {
    }

    public void onTabReselected(Tab tab) {
    }

    aio(MediaGallery mediaGallery, ViewPager viewPager) {
        this.a = mediaGallery;
        this.b = viewPager;
    }

    public void onTabSelected(Tab tab) {
        this.b.setCurrentItem(tab.getPosition());
        if (MediaGallery.g(this.a) != null) {
            MediaGallery.g(this.a).setVisible(tab.getPosition() != MediaGallery.d(this.a));
        }
        MediaGallery.a(this.a, tab.getPosition());
        MediaGallery.c(this.a).a(MediaGallery.f(this.a));
    }
}
