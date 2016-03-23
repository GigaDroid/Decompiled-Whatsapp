package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class pc implements OnClickListener {
    final MediaView a;

    pc(MediaView mediaView) {
        this.a = mediaView;
    }

    public void onClick(View view) {
        MediaView.b(this.a, !MediaView.q(this.a));
    }
}
