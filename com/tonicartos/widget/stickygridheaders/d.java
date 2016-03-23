package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

final class d extends DataSetObserver {
    final k a;

    d(k kVar, p pVar) {
        this(kVar);
    }

    public void onChanged() {
        k.a(this.a, this.a.a(k.a(this.a)));
        this.a.notifyDataSetChanged();
    }

    public void onInvalidated() {
        k.a(this.a, this.a.a(k.a(this.a)));
        this.a.notifyDataSetInvalidated();
    }

    private d(k kVar) {
        this.a = kVar;
    }
}
