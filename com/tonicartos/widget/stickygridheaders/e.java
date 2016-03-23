package com.tonicartos.widget.stickygridheaders;

class e {
    private int a;
    final StickyGridHeadersGridView b;

    private e(StickyGridHeadersGridView stickyGridHeadersGridView) {
        this.b = stickyGridHeadersGridView;
    }

    public void b() {
        this.a = StickyGridHeadersGridView.b(this.b);
    }

    e(StickyGridHeadersGridView stickyGridHeadersGridView, m mVar) {
        this(stickyGridHeadersGridView);
    }

    public boolean a() {
        return this.b.hasWindowFocus() && StickyGridHeadersGridView.a(this.b) == this.a;
    }
}
