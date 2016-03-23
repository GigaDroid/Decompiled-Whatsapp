package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

final class _7 implements Runnable {
    final a2_ a;
    private l5 b;
    private Bitmap c;
    private ImageView d;

    public void run() {
        if (this.d.getTag() != null && this.d.getTag().equals(this.b.b(a2_.c(this.a), a2_.a(this.a)))) {
            if (this.c != null) {
                Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{this.d.getDrawable(), new BitmapDrawable(this.c)});
                transitionDrawable.setCrossFadeEnabled(false);
                transitionDrawable.startTransition(300);
                this.d.setImageDrawable(transitionDrawable);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            Bitmap w = this.b.w();
            if (!(this.d.getDrawable() instanceof BitmapDrawable) || ((BitmapDrawable) this.d.getDrawable()).getBitmap() != w) {
                this.d.setImageBitmap(w);
            }
        }
    }

    public _7(a2_ com_whatsapp_a2_, Bitmap bitmap, ImageView imageView, l5 l5Var) {
        this.a = com_whatsapp_a2_;
        this.c = bitmap;
        this.d = imageView;
        this.b = l5Var;
    }
}
