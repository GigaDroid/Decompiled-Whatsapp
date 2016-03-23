package com.whatsapp;

import android.support.v4.view.ViewPager.SimpleOnPageChangeListener;
import android.view.View;
import com.whatsapp.notification.aw;
import com.whatsapp.observablelistview.ObservableListView;

class asl extends SimpleOnPageChangeListener {
    final HomeActivity a;

    public void onPageSelected(int i) {
        boolean z;
        boolean z2 = DialogToastActivity.f;
        super.onPageSelected(i);
        HomeActivity.b(this.a, true);
        HomeActivity.b(this.a, i);
        HomeActivity.f(this.a);
        this.a.supportInvalidateOptionsMenu();
        if (HomeActivity.h(this.a) == 0) {
            aw.a().b();
        }
        ObservableListView d = HomeActivity.d(this.a);
        if (d == null || d.getChildCount() <= 0) {
            z = false;
        } else {
            int i2;
            int height = this.a.findViewById(2131755457).getHeight();
            if (d.getFirstVisiblePosition() <= 0 || z2) {
                i2 = -d.getChildAt(0).getTop();
            } else {
                i2 = height;
            }
            View childAt = d.getChildAt(d.getChildCount() - 1);
            z = i2 + (childAt.getBottom() > d.getBottom() ? childAt.getBottom() - d.getBottom() : 0) >= height;
        }
        if (!z) {
            HomeActivity.e(this.a);
            if (!z2) {
                return;
            }
        }
        if (HomeActivity.b(this.a)) {
            if (d.a() > 0) {
                d.setSelection(0);
                if (!z2) {
                    return;
                }
            }
            return;
        }
        if (d.a() < HomeActivity.i(this.a).getHeight()) {
            d.setSelection(1);
        }
    }

    asl(HomeActivity homeActivity) {
        this.a = homeActivity;
    }
}
