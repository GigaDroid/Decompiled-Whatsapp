package com.whatsapp;

import java.io.IOException;
import java.net.URISyntaxException;

final class gs implements Runnable {
    final pi a;
    final String b;

    gs(pi piVar, String str) {
        this.a = piVar;
        this.b = str;
    }

    public void run() {
        try {
            this.a.b();
            if (this.a.d()) {
                ae2.a(this.b, this.a, false);
                this.a.a();
            }
        } catch (IOException e) {
        } catch (URISyntaxException e2) {
        }
        ae2.a(this.b, this.a, true);
    }
}
