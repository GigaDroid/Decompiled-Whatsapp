package com.whatsapp;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.whatsapp.util.bq;

class i4 implements OnScrollListener {
    private boolean a;
    final LocationPicker b;
    private boolean c;
    private int d;

    i4(LocationPicker locationPicker, m4 m4Var) {
        this(locationPicker);
    }

    private i4(LocationPicker locationPicker) {
        this.b = locationPicker;
        this.c = false;
        this.a = true;
        this.d = 0;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.c) {
            int footerViewsCount = i3 - ((ListView) absListView).getFooterViewsCount();
            if (this.a && footerViewsCount > this.d) {
                this.a = false;
                this.d = footerViewsCount;
            }
            if (!this.a && i + i2 >= footerViewsCount - 5) {
                this.a = true;
                bq.a(new h(this.b, LocationPicker.n(this.b)), new Void[0]);
            }
        }
    }

    public void b(boolean z) {
        a(z);
        this.a = true;
        this.d = 0;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
