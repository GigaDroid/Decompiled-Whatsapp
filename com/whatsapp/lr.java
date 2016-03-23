package com.whatsapp;

import com.whatsapp.notification.aw;

class lr implements Runnable {
    final HomeActivity a;

    lr(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    public void run() {
        if (HomeActivity.h(this.a) == 0) {
            aw.a().b();
        }
    }
}
