package com.tonicartos.widget.stickygridheaders;

import android.database.DataSetObserver;

class m extends DataSetObserver {
    final StickyGridHeadersGridView a;

    m(StickyGridHeadersGridView stickyGridHeadersGridView) {
        this.a = stickyGridHeadersGridView;
    }

    public void onChanged() {
        StickyGridHeadersGridView.c(this.a);
    }

    public void onInvalidated() {
        StickyGridHeadersGridView.c(this.a);
    }
}
