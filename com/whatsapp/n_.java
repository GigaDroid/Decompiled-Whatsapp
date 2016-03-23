package com.whatsapp;

import android.os.Build.VERSION;
import com.whatsapp.util.FloatingChildLayout;

class n_ implements Runnable {
    final QuickContactActivity a;

    public void run() {
        QuickContactActivity.c(this.a).invalidate();
        if (VERSION.SDK_INT >= 21) {
            this.a.getWindow().setStatusBarColor(this.a.getResources().getColor(2131624054));
        }
        FloatingChildLayout.a(QuickContactActivity.c(this.a), new a53(this));
    }

    n_(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }
}
