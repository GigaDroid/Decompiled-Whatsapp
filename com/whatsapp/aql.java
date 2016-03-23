package com.whatsapp;

import android.app.Activity;

class aql extends aqq {
    final VerifyMessageStoreActivity i;

    protected void a(int i) {
        this.i.h(i);
    }

    protected void c(boolean z) {
        this.i.e(z);
    }

    protected void a() {
        this.i.b();
    }

    aql(VerifyMessageStoreActivity verifyMessageStoreActivity, Activity activity) {
        this.i = verifyMessageStoreActivity;
        super(activity);
    }
}
