package com.tonicartos.widget.stickygridheaders;

import android.view.View;

class g extends e implements Runnable {
    int c;
    final StickyGridHeadersGridView d;

    private g(StickyGridHeadersGridView stickyGridHeadersGridView) {
        this.d = stickyGridHeadersGridView;
        super(stickyGridHeadersGridView, null);
    }

    g(StickyGridHeadersGridView stickyGridHeadersGridView, m mVar) {
        this(stickyGridHeadersGridView);
    }

    public void run() {
        if (!this.d.x && this.d.t != null && this.d.t.getCount() > 0 && this.c != -1 && this.c < this.d.t.getCount() && a()) {
            View b = this.d.b(this.c);
            if (b != null) {
                this.d.a(b, StickyGridHeadersGridView.a(this.d, this.c));
            }
        }
    }
}
