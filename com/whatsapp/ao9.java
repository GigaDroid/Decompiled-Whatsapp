package com.whatsapp;

import android.os.ConditionVariable;

class ao9 implements Runnable {
    final amh a;
    final ConditionVariable b;

    ao9(amh com_whatsapp_amh, ConditionVariable conditionVariable) {
        this.a = com_whatsapp_amh;
        this.b = conditionVariable;
    }

    public void run() {
        this.b.open();
    }
}
