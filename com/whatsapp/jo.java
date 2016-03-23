package com.whatsapp;

import com.whatsapp.protocol.co;

class jo implements be {
    final co a;
    final boolean b;
    final MediaView c;

    public void a() {
        boolean z = DialogToastActivity.f;
        MediaView.n(this.c);
        MediaView.g(this.c).remove(this.a);
        MediaView.o(this.c).notifyDataSetChanged();
        if (MediaView.g(this.c).isEmpty()) {
            this.c.finish();
            if (!z) {
                return;
            }
        }
        if (MediaView.b(this.c).getCurrentItem() == 0) {
            MediaView.e(this.c, MediaView.b(this.c).getCurrentItem());
            if (!z) {
                return;
            }
        }
        if (!this.b) {
            MediaView.c(this.c, 1);
        }
    }

    jo(MediaView mediaView, co coVar, boolean z) {
        this.c = mediaView;
        this.a = coVar;
        this.b = z;
    }
}
