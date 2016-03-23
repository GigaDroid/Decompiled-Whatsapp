package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class ai_ implements OnClickListener {
    final HomeActivity a;

    public void onClick(View view) {
        HomeActivity.b(this.a, true);
    }

    ai_(HomeActivity homeActivity) {
        this.a = homeActivity;
    }
}
