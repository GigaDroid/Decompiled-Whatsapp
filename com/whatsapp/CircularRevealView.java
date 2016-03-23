package com.whatsapp;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ViewAnimationUtils;
import android.widget.FrameLayout;

public class CircularRevealView extends FrameLayout {
    private static boolean h;
    private int a;
    private Paint b;
    private int c;
    private int d;
    private float e;
    private int f;
    private qx g;
    private RectF i;

    static {
        h = VERSION.SDK_INT < 21;
    }

    public void a() {
        if (h) {
            clearAnimation();
            this.g = new qx(this, true);
            this.g.setDuration((long) this.f);
            startAnimation(this.g);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, this.c, this.d, (float) Math.max(getWidth(), getHeight()), 0.0f);
        createCircularReveal.setDuration((long) this.f);
        createCircularReveal.addListener(new aln(this));
        createCircularReveal.start();
    }

    public void setAnchor(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (h) {
            clearAnimation();
        }
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    static float a(CircularRevealView circularRevealView, float f) {
        circularRevealView.e = f;
        return f;
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = 300;
        this.a = -1;
        this.b = new Paint(1);
        this.i = new RectF();
    }

    public CircularRevealView(Context context) {
        super(context);
        this.f = 300;
        this.a = -1;
        this.b = new Paint(1);
        this.i = new RectF();
    }

    public CircularRevealView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = 300;
        this.a = -1;
        this.b = new Paint(1);
        this.i = new RectF();
    }

    public CircularRevealView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 300;
        this.a = -1;
        this.b = new Paint(1);
        this.i = new RectF();
    }

    public void b() {
        if (h) {
            clearAnimation();
            setWillNotDraw(false);
            setBackgroundColor(0);
            this.g = new qx(this, false);
            this.g.setDuration((long) this.f);
            startAnimation(this.g);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        setVisibility(0);
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this, this.c, this.d, 0.0f, (float) Math.max(getWidth(), getHeight()));
        createCircularReveal.setDuration((long) this.f);
        createCircularReveal.start();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (h) {
            float sqrt = (float) (Math.sqrt((double) ((getWidth() * getWidth()) + (getHeight() * getHeight()))) * ((double) this.e));
            this.i.set(-sqrt, -sqrt, sqrt, sqrt);
            this.i.offset((float) this.c, (float) this.d);
            this.b.setColor(this.a);
            this.b.setStyle(Style.FILL);
            canvas.drawArc(this.i, 0.0f, 360.0f, true, this.b);
            if (this.e == 1.0f) {
                this.b.setColor(855638016);
                this.b.setStyle(Style.STROKE);
                this.b.setStrokeWidth(a4d.a().g);
                canvas.drawLine(0.0f, (float) getHeight(), (float) getWidth(), (float) getHeight(), this.b);
            }
        }
    }

    public void setColor(int i) {
        this.a = i;
    }

    public void setDuration(int i) {
        this.f = i;
    }
}
