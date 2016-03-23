package com.whatsapp;

import android.os.CountDownTimer;

class ae_ extends CountDownTimer {
    final WebSessionsActivity a;
    final String b;

    public void onFinish() {
        wn.m(this.b);
        WebSessionsActivity.b(this.a).remove(this.b);
        WebSessionsActivity.c(this.a).a(wn.e());
    }

    public void onTick(long j) {
    }

    ae_(WebSessionsActivity webSessionsActivity, long j, long j2, String str) {
        this.a = webSessionsActivity;
        this.b = str;
        super(j, j2);
    }
}
