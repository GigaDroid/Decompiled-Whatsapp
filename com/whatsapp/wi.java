package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.protocol.co;
import java.util.Collections;

class wi implements OnClickListener {
    final co a;
    final MediaView b;

    wi(MediaView mediaView, co coVar) {
        this.b = mediaView;
        this.a = coVar;
    }

    public void onClick(View view) {
        App app = App.p;
        App.aK.b(Collections.singleton(this.a), !this.a.P, true);
        MediaView.b(this.b, this.a);
    }
}
