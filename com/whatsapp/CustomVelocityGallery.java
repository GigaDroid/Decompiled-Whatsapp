package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Gallery;

public class CustomVelocityGallery extends Gallery {
    private ju a;

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a != null) {
            f = this.a.a(f);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public void setVelocityTransformer(ju juVar) {
        this.a = juVar;
    }

    public CustomVelocityGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
