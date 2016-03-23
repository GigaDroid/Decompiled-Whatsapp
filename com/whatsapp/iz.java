package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.protocol.co;

class iz implements OnClickListener {
    final MediaView a;
    final co b;

    iz(MediaView mediaView, co coVar) {
        this.a = mediaView;
        this.b = coVar;
    }

    public void onClick(View view) {
        MediaView.a(this.a, this.b, 0);
    }
}
