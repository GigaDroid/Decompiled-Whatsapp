package com.whatsapp;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;

final class aw8 implements OnClickListener {
    final Activity a;

    aw8(Activity activity) {
        this.a = activity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
