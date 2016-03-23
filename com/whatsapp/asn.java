package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;

class asn extends BitmapDrawable {
    final Conversation a;
    private Paint b;

    public asn(Conversation conversation, Resources resources, Bitmap bitmap) {
        this.a = conversation;
        super(resources, bitmap);
    }

    public void draw(Canvas canvas) {
        if (this.b == null) {
            this.b = new Paint();
            this.b.setAntiAlias(true);
            this.b.setStrokeJoin(Join.ROUND);
            this.b.setStrokeCap(Cap.ROUND);
            this.b.setStrokeWidth(1.0f * Conversation.A(this.a).g);
        }
        super.draw(canvas);
        float dimension = this.a.getResources().getDimension(2131427359);
        RectF rectF = new RectF(getBounds());
        this.b.setStyle(Style.STROKE);
        this.b.setColor(1493172224);
        if (dimension > 0.0f) {
            canvas.drawRoundRect(rectF, dimension, dimension, this.b);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        canvas.drawArc(rectF, 0.0f, 360.0f, true, this.b);
    }
}
