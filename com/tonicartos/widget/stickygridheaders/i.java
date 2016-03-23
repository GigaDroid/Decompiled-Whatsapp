package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

class i extends DataSetObserver {
    final a a;

    i(a aVar) {
        this.a = aVar;
    }

    public void onInvalidated() {
        a.a(this.a).clear();
        this.a.notifyDataSetInvalidated();
    }

    public void onChanged() {
        this.a.a();
        this.a.notifyDataSetChanged();
    }
}
