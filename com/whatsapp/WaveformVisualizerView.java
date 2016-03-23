package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class WaveformVisualizerView extends View {
    private float[] a;
    private Rect b;
    private Paint c;
    private byte[] d;

    private void a() {
        this.d = null;
        this.c.setStrokeWidth(2.0f);
        this.c.setStyle(Style.STROKE);
        this.c.setStrokeJoin(Join.ROUND);
        this.c.setStrokeCap(Cap.ROUND);
        this.c.setAntiAlias(true);
        this.c.setColor(Color.rgb(0, 128, 255));
    }

    public void setColor(int i) {
        this.c.setColor(i);
    }

    protected void onDraw(Canvas canvas) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        super.onDraw(canvas);
        if (this.d != null) {
            if (this.a == null || this.a.length < this.d.length * 4) {
                this.a = new float[(this.d.length * 4)];
            }
            this.b.set(0, 0, getWidth(), getHeight());
            Rect rect = this.b;
            rect.top += getPaddingTop();
            rect = this.b;
            rect.bottom -= getPaddingBottom();
            rect = this.b;
            rect.left += getPaddingLeft();
            rect = this.b;
            rect.right -= getPaddingRight();
            Path path = new Path();
            path.moveTo((float) this.b.left, (float) ((this.b.top + (this.b.height() / 2)) + ((((byte) (this.d[0] + 128)) * (this.b.height() / 2)) / 128)));
            while (i < this.d.length - 1) {
                path.lineTo((float) (this.b.left + ((this.b.width() * i) / (this.d.length - 1))), (float) ((this.b.top + (this.b.height() / 2)) + ((((byte) (this.d[i] + 128)) * (this.b.height() / 2)) / 128)));
                i++;
                if (z) {
                    break;
                }
            }
            canvas.drawPath(path, this.c);
        }
    }

    public void a(byte[] bArr) {
        this.d = bArr;
        invalidate();
    }

    public WaveformVisualizerView(Context context) {
        super(context);
        this.b = new Rect();
        this.c = new Paint();
        a();
    }
}
