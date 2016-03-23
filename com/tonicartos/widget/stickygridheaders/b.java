package com.tonicartos.widget.stickygridheaders;

import android.view.View;

class b implements Runnable {
    final StickyGridHeadersGridView a;
    final View b;
    final g c;

    b(StickyGridHeadersGridView stickyGridHeadersGridView, View view, g gVar) {
        this.a = stickyGridHeadersGridView;
        this.b = view;
        this.c = gVar;
    }

    public void run() {
        this.a.w = -1;
        this.b.setPressed(false);
        this.a.setPressed(false);
        if (!this.a.x) {
            this.c.run();
        }
    }
}
