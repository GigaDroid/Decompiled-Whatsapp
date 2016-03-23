package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;

public class MediaGalleryImageView extends ThumbnailTextButton {
    private static Paint u;
    private static Paint w;
    private static Paint x;
    protected boolean v;
    private final Rect y;

    protected void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
        setMeasuredDimension(defaultSize, defaultSize);
    }

    public void c(Canvas canvas) {
        getDrawingRect(this.y);
        if (isPressed() || isSelected()) {
            if (this.v) {
                canvas.drawRect(this.y, x);
            }
            canvas.drawRect(this.y, u);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        canvas.drawRect(this.y, w);
    }

    public MediaGalleryImageView(Context context) {
        super(context);
        this.y = new Rect();
        this.v = true;
        if (x == null) {
            x = new Paint();
            x.setColor(1711315404);
            x.setStyle(Style.FILL);
            x.setAntiAlias(true);
        }
        if (u == null) {
            a4d a = a4d.a();
            u = new Paint();
            u.setColor(-16725026);
            u.setStrokeWidth((float) (a.r * 3));
            u.setStyle(Style.STROKE);
            u.setAntiAlias(true);
        }
        if (w == null) {
            a = a4d.a();
            w = new Paint();
            w.setColor(2097152000);
            w.setStrokeWidth((float) a.r);
            w.setStyle(Style.STROKE);
            w.setAntiAlias(true);
        }
    }
}
