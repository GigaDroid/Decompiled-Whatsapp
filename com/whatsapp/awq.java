package com.whatsapp;

import android.widget.Toast;

final class awq implements Runnable {
    final String a;

    awq(String str) {
        this.a = str;
    }

    public void run() {
        Toast makeText = Toast.makeText(App.z().getApplicationContext(), this.a, 0);
        makeText.setGravity(85, 0, 0);
        makeText.show();
    }
}
