package com.whatsapp;

import com.whatsapp.util.OpusRecorder;
import java.io.File;

class po extends oh {
    private OpusRecorder d;

    public void b() {
        this.d.close();
    }

    public void c() {
        this.d.start();
    }

    public po(String str, int i) {
        this.c = new File(str);
        this.a = 16000;
        this.d = new OpusRecorder(str, i);
    }

    public void e() {
        this.d.stop();
    }

    public void d() {
        this.d.prepare();
    }
}
