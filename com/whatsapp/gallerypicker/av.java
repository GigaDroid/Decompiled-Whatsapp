package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.whatsapp.util.cb;

class av implements a8 {
    final b7 a;
    final at b;
    final ImageView c;
    final f d;

    public void a() {
        this.c.setBackgroundColor(GalleryPickerFragment.b(this.b.d));
        this.c.setImageDrawable(null);
    }

    av(at atVar, ImageView imageView, b7 b7Var, f fVar) {
        this.b = atVar;
        this.c = imageView;
        this.a = b7Var;
        this.d = fVar;
    }

    public void a(Bitmap bitmap, boolean z) {
        int i = MediaGalleryFragmentBase.e;
        if (this.c.getTag() == this.a && this.b.d.getActivity() != null) {
            if (bitmap == MediaGalleryFragmentBase.l) {
                this.c.setScaleType(ScaleType.CENTER);
                this.c.setBackgroundColor(GalleryPickerFragment.b(this.b.d));
                if (ag.b(this.d)) {
                    this.c.setBackgroundColor(this.b.d.getResources().getColor(2131624049));
                    this.c.setImageResource(2130839410);
                    if (i == 0) {
                        return;
                    }
                }
                if (ag.a(this.d)) {
                    this.c.setBackgroundColor(GalleryPickerFragment.b(this.b.d));
                    this.c.setImageResource(2130839525);
                    if (i == 0) {
                        return;
                    }
                }
                if (ag.c(this.d)) {
                    this.c.setBackgroundColor(GalleryPickerFragment.b(this.b.d));
                    this.c.setImageResource(2130839526);
                    if (i == 0) {
                        return;
                    }
                }
                if (cb.b(this.d.d())) {
                    this.c.setBackgroundColor(GalleryPickerFragment.b(this.b.d));
                    this.c.setImageDrawable(cb.a(this.b.d.getActivity(), this.d.d()));
                    if (i == 0) {
                        return;
                    }
                }
                this.c.setBackgroundColor(GalleryPickerFragment.b(this.b.d));
                this.c.setImageResource(0);
                if (i == 0) {
                    return;
                }
            }
            this.c.setScaleType(ScaleType.CENTER_CROP);
            this.c.setBackgroundResource(0);
            if (!z) {
                Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{GalleryPickerFragment.a(this.b.d), new BitmapDrawable(this.b.d.getResources(), bitmap)});
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(150);
                this.c.setImageDrawable(transitionDrawable);
                if (i == 0) {
                    return;
                }
            }
            this.c.setImageBitmap(bitmap);
        }
    }
}
