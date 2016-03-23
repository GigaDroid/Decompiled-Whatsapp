package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class qz implements OnClickListener {
    final SystemStatusActivity a;

    public void onClick(View view) {
        UserFeedbackActivity.a(this.a, SystemStatusActivity.a(this.a), SystemStatusActivity.b(this.a), Integer.valueOf(SystemStatusActivity.c(this.a)));
        this.a.finish();
    }

    qz(SystemStatusActivity systemStatusActivity) {
        this.a = systemStatusActivity;
    }
}
