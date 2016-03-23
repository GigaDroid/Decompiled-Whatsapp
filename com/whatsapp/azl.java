package com.whatsapp;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

class azl implements Runnable {
    final aka a;
    final File b;

    azl(aka com_whatsapp_aka, File file) {
        this.a = com_whatsapp_aka;
        this.b = file;
    }

    public void run() {
        try {
            oy.a(this.a.a, new _m(this.b));
            OutputStream fileOutputStream = new FileOutputStream(this.a.a.a());
            oy.a(oy.c(this.a.a), fileOutputStream);
            oy.c(this.a.a).close();
            oy.a(this.a.a, null);
            fileOutputStream.close();
        } catch (Throwable e) {
            Log.a(e);
        }
        this.b.delete();
    }
}
