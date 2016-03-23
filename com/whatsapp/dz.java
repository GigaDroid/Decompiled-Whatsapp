package com.whatsapp;

import android.annotation.TargetApi;

class dz implements Runnable {
    final ga a;
    final boolean b;

    @TargetApi(8)
    public void run() {
        if (this.b) {
            ConversationsFragment.c(this.a.e).getAnimation().startNow();
            ConversationsFragment.c(this.a.e).setImageResource(2130839504);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        ConversationsFragment.c(this.a.e).getAnimation().cancel();
    }

    dz(ga gaVar, boolean z) {
        this.a = gaVar;
        this.b = z;
    }
}
