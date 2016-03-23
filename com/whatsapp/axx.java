package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.os.ConditionVariable;

final class axx implements Runnable {
    final ConditionVariable a;
    final Context b;
    final Intent c;

    axx(ConditionVariable conditionVariable, Context context, Intent intent) {
        this.a = conditionVariable;
        this.b = context;
        this.c = intent;
    }

    public void run() {
        this.a.block();
        this.b.startService(this.c);
    }
}
