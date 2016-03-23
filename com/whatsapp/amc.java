package com.whatsapp;

import android.support.annotation.Nullable;

class amc implements as8 {
    final RecordAudio a;

    amc(RecordAudio recordAudio) {
        this.a = recordAudio;
    }

    public void b() {
        RequestPermissionActivity.a(this.a, 2131231666, 2131231663);
    }

    public void a() {
        RequestPermissionActivity.a(this.a, 2131231666, 2131231663);
    }

    public void a(@Nullable String str) {
        this.a.showDialog(0);
    }

    public void b(@Nullable String str) {
        this.a.showDialog(0);
    }
}
