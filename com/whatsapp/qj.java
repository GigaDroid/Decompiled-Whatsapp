package com.whatsapp;

class qj implements axn {
    final MediaView a;
    final MediaViewPager b;

    qj(MediaViewPager mediaViewPager, MediaView mediaView) {
        this.b = mediaViewPager;
        this.a = mediaView;
    }

    public alf a(float f, float f2) {
        boolean z = false;
        if (!this.b.f.isFinishing()) {
            boolean c;
            PhotoView a = MediaView.a(this.b.f, MediaView.i(this.b.f, this.b.getCurrentItem()));
            if (a != null) {
                c = a.c(f, f2);
                z = a.a(f, f2);
            } else {
                c = false;
            }
            if (c) {
                if (z) {
                    return alf.BOTH;
                }
                return alf.LEFT;
            } else if (z) {
                return alf.RIGHT;
            }
        }
        return alf.NONE;
    }
}
