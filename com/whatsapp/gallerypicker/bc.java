package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import java.util.HashMap;

public class bc implements e {
    private f a;
    private Uri b;

    public int e() {
        return 1;
    }

    public boolean b() {
        return false;
    }

    public void d() {
    }

    public void a(ContentObserver contentObserver) {
    }

    public HashMap c() {
        throw new UnsupportedOperationException();
    }

    public void b(ContentObserver contentObserver) {
    }

    public f a(int i) {
        if (i != 0) {
            return null;
        }
        try {
            return this.a;
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public void a() {
        this.a = null;
        this.b = null;
    }

    public bc(ContentResolver contentResolver, Uri uri) {
        this.b = uri;
        this.a = new bz(this, contentResolver, uri);
    }
}
