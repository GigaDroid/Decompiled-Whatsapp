package com.whatsapp;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.util.LruCache;

class a2p extends LruCache {
    final App b;

    a2p(App app, int i) {
        this.b = app;
        super(i);
    }

    protected int a(String str, Bitmap bitmap) {
        if (VERSION.SDK_INT < 12) {
            return (bitmap.getRowBytes() * bitmap.getHeight()) / 1024;
        }
        return bitmap.getByteCount() / 1024;
    }

    protected int sizeOf(Object obj, Object obj2) {
        return a((String) obj, (Bitmap) obj2);
    }
}
