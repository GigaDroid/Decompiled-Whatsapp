package com.whatsapp;

import java.io.File;
import java.util.EnumSet;

final class mg implements Runnable {
    final EnumSet a;
    final String b;
    final boolean c;
    final boolean d;
    final boolean e;
    final File f;
    final String g;
    final boolean h;

    public void run() {
        if (this.h) {
            synchronized (App.al()) {
                App.a(this.g, this.e, this.c, this.d, this.a, this.f, this.b);
            }
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.a(this.g, this.e, this.c, this.d, this.a, this.f, this.b);
    }

    mg(boolean z, String str, boolean z2, boolean z3, boolean z4, EnumSet enumSet, File file, String str2) {
        this.h = z;
        this.g = str;
        this.e = z2;
        this.c = z3;
        this.d = z4;
        this.a = enumSet;
        this.f = file;
        this.b = str2;
    }
}
