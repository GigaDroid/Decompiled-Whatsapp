package com.whatsapp;

import android.content.ContentResolver;

final class e3 implements Runnable {
    final String a;
    final ContentResolver b;

    e3(ContentResolver contentResolver, String str) {
        this.b = contentResolver;
        this.a = str;
    }

    public void run() {
        App.as.a(this.b, this.a);
    }
}
