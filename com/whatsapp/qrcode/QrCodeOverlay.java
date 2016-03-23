package com.whatsapp.qrcode;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;

public class QrCodeOverlay extends View {
    float a;
    private Paint b;
    private RectF c;
    float d;
    private g e;
    private Paint f;
    private boolean g;

    public void onDraw(Canvas canvas) {
        boolean z = QrCodeView.g;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = (Math.min(width, height) * 3) / 4;
        int paddingLeft = ((width - min) / 2) + getPaddingLeft();
        int paddingTop = ((height - min) / 2) + getPaddingTop();
        int i = paddingLeft + min;
        int i2 = paddingTop + min;
        if (this.g) {
            if (this.f == null) {
                this.f = new Paint();
                this.f.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
            }
            this.b.setARGB(125, 50, 50, 50);
            this.b.setStyle(Style.FILL);
            canvas.drawColor(Color.argb(125, 50, 50, 50));
            this.c.set((float) paddingLeft, (float) paddingTop, (float) i, (float) i2);
            canvas.drawArc(this.c, 0.0f, 360.0f, true, this.f);
            float dimension = getContext().getResources().getDimension(2131427415);
            this.b.setStyle(Style.STROKE);
            this.b.setColor(-2147418368);
            this.b.setStrokeWidth(2.0f * dimension);
            paddingTop = (int) (((float) paddingTop) + (2.0f * dimension));
            i2 = (int) (((float) i2) - (dimension * 2.0f));
            if (this.a > 1.0f || this.a < 0.0f) {
                this.d = -this.d;
            }
            this.a += this.d;
            dimension = (float) Math.sqrt((double) (1.0f - (((2.0f * this.a) - 1.0f) * ((2.0f * this.a) - 1.0f))));
            Canvas canvas2 = canvas;
            canvas2.drawLine(((float) ((paddingLeft + i) / 2)) - ((((float) (i - paddingLeft)) * dimension) / 2.0f), ((float) paddingTop) + (((float) (i2 - paddingTop)) * this.a), ((float) ((paddingLeft + i) / 2)) + ((dimension * ((float) (i - paddingLeft))) / 2.0f), (((float) (i2 - paddingTop)) * this.a) + ((float) paddingTop), this.b);
            if (z) {
                WAAppCompatActivity.c++;
            } else {
                return;
            }
        }
        this.b.setARGB(125, 50, 50, 50);
        this.b.setStyle(Style.FILL);
        canvas.drawRect(0.0f, 0.0f, (float) width, (float) paddingTop, this.b);
        canvas.drawRect(0.0f, (float) paddingTop, (float) paddingLeft, (float) i2, this.b);
        canvas.drawRect((float) i, (float) paddingTop, (float) width, (float) i2, this.b);
        canvas.drawRect(0.0f, (float) i2, (float) width, (float) height, this.b);
        float dimension2 = getContext().getResources().getDimension(2131427415);
        this.b.setStrokeWidth(dimension2);
        this.b.setStyle(Style.STROKE);
        this.b.setColor(872415231);
        canvas.drawRect((float) paddingLeft, (float) paddingTop, (float) i, (float) i2, this.b);
        canvas.drawLine((float) ((paddingLeft + i) / 2), (float) (paddingTop - (min / 12)), (float) ((paddingLeft + i) / 2), (float) ((min / 12) + paddingTop), this.b);
        canvas.drawLine((float) ((paddingLeft + i) / 2), (float) (i2 - (min / 12)), (float) ((paddingLeft + i) / 2), (float) ((min / 12) + i2), this.b);
        canvas.drawLine((float) (paddingLeft - (min / 12)), (float) ((paddingTop + i2) / 2), (float) ((min / 12) + paddingLeft), (float) ((paddingTop + i2) / 2), this.b);
        canvas.drawLine((float) (i - (min / 12)), (float) ((paddingTop + i2) / 2), (float) ((min / 12) + i), (float) ((paddingTop + i2) / 2), this.b);
        this.b.setStyle(Style.STROKE);
        this.b.setColor(-2147418368);
        this.b.setStrokeWidth(2.0f * dimension2);
        int i3 = (int) (((float) paddingTop) + (2.0f * dimension2));
        int i4 = (int) (((float) i2) - (2.0f * dimension2));
        if (this.a > 1.0f || this.a < 0.0f) {
            this.d = -this.d;
        }
        this.a += this.d;
        canvas.drawLine((float) paddingLeft, ((float) i3) + (((float) (i4 - i3)) * this.a), (float) i, ((float) i3) + (((float) (i4 - i3)) * this.a), this.b);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = new g(this, null);
        this.e.setDuration(2000);
        this.e.setRepeatCount(-1);
        this.e.setRepeatMode(2);
        startAnimation(this.e);
    }

    public QrCodeOverlay(Context context) {
        this(context, null);
    }

    public QrCodeOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected void onVisibilityChanged(View view, int i) {
        if (getVisibility() == 0) {
            if (getAnimation() == null && this.e != null) {
                startAnimation(this.e);
                if (!QrCodeView.g) {
                    return;
                }
            }
            return;
        }
        clearAnimation();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    public QrCodeOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Paint(1);
        this.a = 0.0f;
        this.d = 0.01f;
        this.c = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, arj.QrScannerOverlay);
        this.g = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
}
