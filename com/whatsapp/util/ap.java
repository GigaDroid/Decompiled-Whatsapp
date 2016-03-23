package com.whatsapp.util;

import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;

public abstract class ap implements OnClickListener {
    private long a;

    public abstract void a(View view);

    public final void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.a > 1000) {
            this.a = elapsedRealtime;
            a(view);
        }
    }
}
