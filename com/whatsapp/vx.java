package com.whatsapp;

import android.graphics.BlurMaskFilter;
import android.graphics.BlurMaskFilter.Blur;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class vx extends Drawable {
    private Paint a;
    private Paint b;
    private int c;
    private int d;
    final Broadcasts e;

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public vx(Broadcasts broadcasts, int i, int i2) {
        this.e = broadcasts;
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.c = i2;
        this.d = i;
    }

    public void draw(Canvas canvas) {
        float f = (a4d.a().g * 3.0f) / 2.0f;
        Rect rect = new Rect(getBounds());
        rect.right = (int) (((float) rect.right) - (2.0f * f));
        rect.bottom = (int) (((float) rect.bottom) - (2.0f * f));
        int min = (Math.min(rect.width(), rect.height()) / 2) - ((int) f);
        MaskFilter blurMaskFilter = new BlurMaskFilter(f, Blur.NORMAL);
        this.a.setColor(-10066330);
        this.a.setStyle(Style.FILL);
        this.a.setMaskFilter(blurMaskFilter);
        canvas.translate((2.0f * f) / 3.0f, f);
        canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) min, this.a);
        canvas.translate((-2.0f * f) / 3.0f, -f);
        this.a.setMaskFilter(null);
        this.b.setStrokeWidth(1.0f);
        this.b.setStyle(Style.STROKE);
        this.b.setColor(-1728053248);
        canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) min, this.b);
        RectF rectF = new RectF(rect.exactCenterX() - ((float) min), rect.exactCenterY() - ((float) min), rect.exactCenterX() + ((float) min), rect.exactCenterY() + ((float) min));
        this.b.setStyle(Style.FILL);
        if (this.c == 0) {
            this.b.setColor(-1728001024);
            canvas.drawArc(rectF, 270.0f, 360.0f, true, this.b);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.b.setColor(-1728001024);
        canvas.drawArc(rectF, 270.0f, (float) ((this.d * 360) / this.c), true, this.b);
        this.b.setColor(-1426063361);
        canvas.drawArc(rectF, (float) (((this.d * 360) / this.c) + 270), (float) (360 - ((this.d * 360) / this.c)), true, this.b);
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }
}
