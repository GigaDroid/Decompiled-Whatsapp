package com.whatsapp.util;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

class y implements Runnable {
    final bb a;
    private String b;
    private ImageView c;
    private Bitmap d;

    public y(bb bbVar, Bitmap bitmap, ImageView imageView, String str) {
        this.a = bbVar;
        this.d = bitmap;
        this.c = imageView;
        this.b = str;
    }

    public void run() {
        int i = Log.h;
        if (this.c.getTag() != null && this.c.getTag().equals(this.b)) {
            if (this.d != null) {
                if (this.c.getDrawable() == null) {
                    Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), new BitmapDrawable(this.c.getResources(), this.d)});
                    transitionDrawable.setCrossFadeEnabled(true);
                    transitionDrawable.startTransition(200);
                    this.c.setImageDrawable(transitionDrawable);
                    if (i == 0) {
                        return;
                    }
                }
                this.c.setImageBitmap(this.d);
                if (i == 0) {
                    return;
                }
            }
            this.c.setImageDrawable(bb.b(this.a));
        }
    }
}
