package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

class a5u implements Runnable {
    final Bitmap a;
    final x3 b;

    a5u(x3 x3Var, Bitmap bitmap) {
        this.b = x3Var;
        this.a = bitmap;
    }

    public void run() {
        if (!VideoPreviewActivity.i(this.b.b).isPlaying()) {
            VideoPreviewActivity.i(this.b.b).setBackgroundDrawable(new BitmapDrawable(this.b.b.getResources(), this.a));
        }
    }
}
