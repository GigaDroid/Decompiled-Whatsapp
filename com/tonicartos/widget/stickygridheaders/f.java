package com.tonicartos.widget.stickygridheaders;

import android.view.View;

class f extends e implements Runnable {
    final StickyGridHeadersGridView c;

    f(StickyGridHeadersGridView stickyGridHeadersGridView, m mVar) {
        this(stickyGridHeadersGridView);
    }

    public void run() {
        View b = this.c.b(this.c.B);
        if (b != null) {
            boolean z;
            long a = StickyGridHeadersGridView.a(this.c, this.c.B);
            if (!a() || this.c.x) {
                z = false;
            } else {
                z = this.c.b(b, a);
            }
            if (z) {
                this.c.w = -2;
                this.c.setPressed(false);
                b.setPressed(false);
                if (!StickyGridHeadersGridView.a) {
                    return;
                }
            }
            this.c.w = 2;
        }
    }

    private f(StickyGridHeadersGridView stickyGridHeadersGridView) {
        this.c = stickyGridHeadersGridView;
        super(stickyGridHeadersGridView, null);
    }
}
