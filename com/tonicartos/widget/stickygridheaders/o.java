package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

class o extends DataSetObserver {
    final l a;

    o(l lVar) {
        this.a = lVar;
    }

    public void onChanged() {
        this.a.notifyDataSetChanged();
    }

    public void onInvalidated() {
        this.a.notifyDataSetInvalidated();
    }
}
