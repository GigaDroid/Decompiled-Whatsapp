package com.whatsapp.observablelistview;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class l implements OnScrollListener {
    final ObservableListView a;

    l(ObservableListView observableListView) {
        this.a = observableListView;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (ObservableListView.a(this.a) != null) {
            ObservableListView.a(this.a).onScroll(absListView, i, i2, i3);
        }
        ObservableListView.b(this.a);
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (ObservableListView.a(this.a) != null) {
            ObservableListView.a(this.a).onScrollStateChanged(absListView, i);
        }
        if (ObservableListView.c(this.a) != null && i == 0) {
            ObservableListView.c(this.a).a(this.a);
        }
    }
}
