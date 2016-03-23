package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;
import com.whatsapp.util.bq;

class zd extends ap {
    final TosUpdateDetailsActivity b;

    public void a(View view) {
        TosUpdateDetailsActivity.a(this.b).cancel(true);
        TosUpdateDetailsActivity.a(this.b, new a9v(this.b));
        bq.a(TosUpdateDetailsActivity.a(this.b), new Void[0]);
    }

    zd(TosUpdateDetailsActivity tosUpdateDetailsActivity) {
        this.b = tosUpdateDetailsActivity;
    }
}
