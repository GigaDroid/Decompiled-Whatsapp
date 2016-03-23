package com.whatsapp;

import android.hardware.TriggerEvent;
import android.hardware.TriggerEventListener;

final class aq9 extends TriggerEventListener {
    public void onTrigger(TriggerEvent triggerEvent) {
        if (wn.t()) {
            wn.c();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        wn.d(false);
    }

    aq9() {
    }
}
