package com.whatsapp;

import android.os.ConditionVariable;

class co implements Runnable {
    final ConditionVariable a;
    final a3l b;

    co(a3l com_whatsapp_a3l, ConditionVariable conditionVariable) {
        this.b = com_whatsapp_a3l;
        this.a = conditionVariable;
    }

    public void run() {
        this.a.open();
    }
}
