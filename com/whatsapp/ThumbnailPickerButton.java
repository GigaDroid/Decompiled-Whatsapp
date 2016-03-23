package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

public class ThumbnailPickerButton extends ThumbnailButton {
    private Path k;

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new Path();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new Path();
    }

    public ThumbnailPickerButton(Context context) {
        super(context);
        this.k = new Path();
    }

    protected void b(Canvas canvas) {
        super.b(canvas);
        if (isEnabled() && this.a > 0.0f) {
            float f = 7.0f * this.a;
            this.k.reset();
            this.f.setStyle(Style.FILL);
            this.k.moveTo(this.c.right, this.c.bottom - f);
            this.k.lineTo(this.c.right, this.c.bottom - this.a);
            this.k.arcTo(new RectF(this.c.right - (this.a * 2.0f), this.c.bottom - (this.a * 2.0f), this.c.right, this.c.bottom), 0.0f, 90.0f);
            this.k.lineTo(this.c.right - f, this.c.bottom);
            this.k.lineTo(this.c.right, this.c.bottom - f);
            this.f.setColor(1409286144);
            canvas.drawPath(this.k, this.f);
            this.k.reset();
            this.k.moveTo(this.c.right, this.c.bottom - f);
            this.k.lineTo(this.c.right - f, this.c.bottom);
            this.f.setStyle(Style.STROKE);
            this.f.setStrokeJoin(Join.ROUND);
            this.f.setStrokeCap(Cap.ROUND);
            this.f.setStrokeWidth(1.0f * a4d.a().g);
            this.f.setColor(-570425345);
            canvas.drawPath(this.k, this.f);
        }
    }
}
