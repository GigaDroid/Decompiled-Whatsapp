package com.whatsapp.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

public class ShutterOverlay extends View {
    private Paint a;
    private boolean b;

    static boolean a(ShutterOverlay shutterOverlay, boolean z) {
        shutterOverlay.b = z;
        return z;
    }

    public ShutterOverlay(Context context) {
        super(context);
        this.a = new Paint(1);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint(1);
    }

    public void onDraw(Canvas canvas) {
        if (this.b) {
            this.a.setStrokeWidth(getContext().getResources().getDimension(2131427415) * 8.0f);
            this.a.setStyle(Style.STROKE);
            this.a.setColor(-1);
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.a);
        }
    }

    public void setOn() {
        this.b = true;
        invalidate();
        postDelayed(new ai(this), 50);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Paint(1);
    }
}
