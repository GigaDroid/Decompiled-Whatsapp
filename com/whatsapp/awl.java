package com.whatsapp;

import java.io.OutputStream;
import org.apache.http.entity.ContentProducer;

class awl implements ContentProducer {
    final String a;
    final mk b;

    public void writeTo(OutputStream outputStream) {
        mk.a(this.b, this.a, outputStream);
    }

    awl(mk mkVar, String str) {
        this.b = mkVar;
        this.a = str;
    }
}
