package com.whatsapp.util;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.protocol.co;

class cn implements Runnable {
    private Bitmap a;
    final bd b;
    private co c;
    private bi d;
    private ImageView e;

    public cn(bd bdVar, Bitmap bitmap, ImageView imageView, co coVar, bi biVar) {
        this.b = bdVar;
        this.a = bitmap;
        this.e = imageView;
        this.c = coVar;
        this.d = biVar;
    }

    public void run() {
        if (this.e.getTag() != null && this.e.getTag().equals(this.c.k)) {
            this.d.a(this.e, this.a, this.c);
            bd.b(this.b).remove(this.c.k);
            if (this.a != null) {
                bd.e(this.b).put(this.c.k, this.a);
                bd.c(this.b).add(this.c.k);
                if (Log.h == 0) {
                    return;
                }
            }
            return;
        }
        if (this.a != null) {
            this.a.recycle();
        }
    }
}
