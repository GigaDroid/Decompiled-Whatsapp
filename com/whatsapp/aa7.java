package com.whatsapp;

import android.content.ContentResolver;

final class aa7 implements Runnable {
    final ContentResolver a;
    final String b;

    public void run() {
        App.as.a(this.a, this.b);
    }

    aa7(ContentResolver contentResolver, String str) {
        this.a = contentResolver;
        this.b = str;
    }
}
