package com.whatsapp.util;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import com.whatsapp.protocol.c3;
import java.lang.ref.SoftReference;

class b8 extends LruCache {
    final bd b;

    protected int a(c3 c3Var, Bitmap bitmap) {
        return ao.a(bitmap) / 1024;
    }

    protected void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        a(z, (c3) obj, (Bitmap) obj2, (Bitmap) obj3);
    }

    b8(bd bdVar, int i) {
        this.b = bdVar;
        super(i);
    }

    protected void a(boolean z, c3 c3Var, Bitmap bitmap, Bitmap bitmap2) {
        if (z) {
            bd.b(this.b).put(c3Var, new SoftReference(bitmap));
            bd.c(this.b).remove(c3Var);
        }
    }

    protected int sizeOf(Object obj, Object obj2) {
        return a((c3) obj, (Bitmap) obj2);
    }
}
