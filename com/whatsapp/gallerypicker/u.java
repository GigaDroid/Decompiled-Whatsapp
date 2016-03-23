package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

public class u extends r implements f {
    private long b;
    private bz c;

    public long a() {
        return this.c.a();
    }

    public String d() {
        return this.c.d();
    }

    public u(e eVar, ContentResolver contentResolver, String str, long j) {
        this.c = new bz(eVar, contentResolver, Uri.fromFile(new File(str)));
        this.b = j;
    }

    public Uri c() {
        return this.c.c();
    }

    public String b() {
        return this.c.b();
    }

    public long e() {
        return this.b;
    }

    public Bitmap a(int i) {
        return this.c.a(i);
    }
}
