package com.whatsapp;

import android.os.CountDownTimer;
import android.text.format.DateUtils;

class ax4 extends CountDownTimer {
    final SpamWarningActivity a;
    final CircularProgressBar b;

    public void onTick(long j) {
        this.b.setCenterText(DateUtils.formatElapsedTime((long) (((int) j) / 1000)));
        this.b.setProgress((int) j);
    }

    public void onFinish() {
        this.a.finish();
    }

    ax4(SpamWarningActivity spamWarningActivity, long j, long j2, CircularProgressBar circularProgressBar) {
        this.a = spamWarningActivity;
        this.b = circularProgressBar;
        super(j, j2);
    }
}
