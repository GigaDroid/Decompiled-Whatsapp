package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class g6 implements OnClickListener {
    final DialogToastPreferenceActivity a;

    g6(DialogToastPreferenceActivity dialogToastPreferenceActivity) {
        this.a = dialogToastPreferenceActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
