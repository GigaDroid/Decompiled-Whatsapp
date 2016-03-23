package com.whatsapp;

import android.os.CountDownTimer;
import android.text.format.DateUtils;

class ak extends CountDownTimer {
    final h7 a;
    final boolean b;

    public void onFinish() {
        this.a.a(true);
        h7.a(this.a, null);
    }

    public void onTick(long j) {
        boolean z = DialogToastActivity.f;
        h7.a(this.a, j);
        if (!this.b) {
            h7.a(this.a).setText(h7.d(this.a));
            h7.c(this.a).setVisibility(8);
            if (!z) {
                return;
            }
        }
        if (j > 3600000) {
            j = (long) (((int) Math.ceil(((double) j) / 3600000.0d)) * 3600000);
            long currentTimeMillis = System.currentTimeMillis();
            h7.a(this.a).setText(h7.a(this.a).getContext().getString(h7.b(this.a), new Object[]{DateUtils.getRelativeTimeSpanString(currentTimeMillis + j, currentTimeMillis, 0)}));
            if (!z) {
                return;
            }
        }
        h7.a(this.a).setText(h7.d(this.a));
        h7.c(this.a).setVisibility(0);
        h7.c(this.a).setText(h7.b(this.a, j));
    }

    ak(h7 h7Var, long j, long j2, boolean z) {
        this.a = h7Var;
        this.b = z;
        super(j, j2);
    }
}
