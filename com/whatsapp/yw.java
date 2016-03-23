package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;

class yw extends ap {
    final CallRatingActivity b;

    public void a(View view) {
        this.b.finish();
    }

    yw(CallRatingActivity callRatingActivity) {
        this.b = callRatingActivity;
    }
}
