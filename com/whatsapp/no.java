package com.whatsapp;

import android.content.Context;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.fieldstats.i;

final class no implements Runnable {
    final Events$Call a;
    final boolean b;
    final Context c;

    no(Context context, Events$Call events$Call, boolean z) {
        this.c = context;
        this.a = events$Call;
        this.b = z;
    }

    public void run() {
        i.a(this.c, this.a);
        if (this.b) {
            nf.d();
        }
    }
}
