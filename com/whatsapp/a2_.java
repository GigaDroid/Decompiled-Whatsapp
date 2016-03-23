package com.whatsapp;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.widget.ImageView;

public class a2_ {
    private ax2 a;
    private final float b;
    private final int c;
    private axv d;

    static axv b(a2_ com_whatsapp_a2_) {
        return com_whatsapp_a2_.d;
    }

    public void a() {
        if (this.a != null) {
            this.a.interrupt();
            this.a = null;
        }
    }

    public a2_(int i, float f) {
        this.a = null;
        this.d = new axv(null);
        this.c = i;
        this.b = f;
    }

    static float a(a2_ com_whatsapp_a2_) {
        return com_whatsapp_a2_.b;
    }

    public void b(@NonNull l5 l5Var, ImageView imageView) {
        imageView.setContentDescription(l5Var.a(imageView.getContext()));
        String b = l5Var.b(this.c, this.b);
        if (b == null) {
            imageView.setImageBitmap(l5Var.w());
            return;
        }
        boolean equals = b.equals(imageView.getTag());
        imageView.setTag(b);
        Bitmap bitmap = (Bitmap) App.o.get(b);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        if (!equals) {
            imageView.setImageBitmap(l5Var.w());
        }
        if (l5Var.a) {
            a(l5Var, imageView);
        }
    }

    static int c(a2_ com_whatsapp_a2_) {
        return com_whatsapp_a2_.c;
    }

    public a2_() {
        this(App.z().getResources().getDimensionPixelSize(2131427544), (float) App.z().getResources().getDimensionPixelSize(2131427359));
    }

    private void a(l5 l5Var, ImageView imageView) {
        synchronized (axv.a(this.d)) {
            this.d.a(imageView);
        }
        at9 com_whatsapp_at9 = new at9(l5Var, imageView);
        synchronized (axv.a(this.d)) {
            axv.a(this.d).add(0, com_whatsapp_at9);
            axv.a(this.d).notifyAll();
        }
        if (this.a == null) {
            this.a = new ax2(this);
            this.a.setPriority(4);
            this.a.start();
        }
    }
}
