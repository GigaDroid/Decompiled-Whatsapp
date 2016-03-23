package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.cd;
import com.whatsapp.util.ap;

class yi extends ap {
    final CallLogActivity b;

    public void a(View view) {
        if (App.a(CallLogActivity.a(this.b), this.b, cd.CALL_INFO, false)) {
            this.b.finish();
        }
    }

    yi(CallLogActivity callLogActivity) {
        this.b = callLogActivity;
    }
}
