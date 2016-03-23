package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ad9 implements OnClickListener {
    final a3c a;
    final MediaView b;

    ad9(MediaView mediaView, a3c com_whatsapp_a3c) {
        this.b = mediaView;
        this.a = com_whatsapp_a3c;
    }

    public void onClick(View view) {
        view.setOnClickListener(this.a);
        MediaView.b(this.b, !MediaView.q(this.b));
    }
}
