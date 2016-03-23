package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ph implements OnClickListener {
    final DialogToastActivity a;

    public void onClick(View view) {
        this.a.finish();
    }

    ph(DialogToastActivity dialogToastActivity) {
        this.a = dialogToastActivity;
    }
}
