package com.whatsapp;

import android.content.Intent;

class qr extends Thread {
    final SpamWarningActivity a;

    qr(SpamWarningActivity spamWarningActivity) {
        this.a = spamWarningActivity;
    }

    public void run() {
        SpamWarningActivity.b().block();
        this.a.startActivity(new Intent(null, null, this.a, Main.e()));
        this.a.finish();
    }
}
