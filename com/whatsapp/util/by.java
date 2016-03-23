package com.whatsapp.util;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.util.LruCache;

class by extends LruCache {
    final bb b;

    protected int a(String str, Bitmap bitmap) {
        if (VERSION.SDK_INT < 12) {
            return (bitmap.getRowBytes() * bitmap.getHeight()) / 1024;
        }
        return bitmap.getByteCount() / 1024;
    }

    protected int sizeOf(Object obj, Object obj2) {
        return a((String) obj, (Bitmap) obj2);
    }

    by(bb bbVar, int i) {
        this.b = bbVar;
        super(i);
    }
}
