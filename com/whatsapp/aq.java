package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.whatsapp.util.bq;

class aq implements OnScrollListener {
    final LocationPicker2 a;
    private boolean b;
    private int c;
    private boolean d;

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.b) {
            int footerViewsCount = i3 - ((ListView) absListView).getFooterViewsCount();
            if (this.d && footerViewsCount > this.c) {
                this.d = false;
                this.c = footerViewsCount;
            }
            if (!this.d && i + i2 >= footerViewsCount - 5) {
                this.d = true;
                bq.a(new au2(this.a, LocationPicker2.r(this.a)), new Void[0]);
            }
        }
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void b(boolean z) {
        a(z);
        this.d = true;
        this.c = 0;
    }

    aq(LocationPicker2 locationPicker2, jb jbVar) {
        this(locationPicker2);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    private aq(LocationPicker2 locationPicker2) {
        this.a = locationPicker2;
        this.b = false;
        this.d = true;
        this.c = 0;
    }
}
