package com.whatsapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import org.v;
import org.whispersystems.at;

public class CircularProgressBar extends ProgressBar {
    private static final String z;
    private float a;
    private long b;
    private RectF c;
    private float d;
    private float e;
    private int f;
    private int g;
    private boolean h;
    private Paint i;
    private String j;
    private float k;
    private float l;
    private float m;

    static {
        char[] toCharArray = "Q)~j8Q-bps\u000f$y~}V".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 34;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = 25;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onDraw(@NonNull Canvas canvas) {
        if (isIndeterminate()) {
            a(canvas);
            invalidate();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.i.setAntiAlias(true);
        this.i.setStyle(Style.STROKE);
        this.i.setStrokeWidth(this.d / this.m);
        this.i.setColor(this.f);
        canvas.drawArc(this.c, ((((float) getProgress()) * 360.0f) / ((float) getMax())) + 270.0f, 360.0f - ((((float) getProgress()) * 360.0f) / ((float) getMax())), false, this.i);
        this.i.setColor(this.g);
        canvas.drawArc(this.c, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, this.i);
        if (this.h) {
            this.i.setColor(this.f);
            this.i.setStyle(Style.FILL);
            float progress = ((float) getProgress()) * ((float) (6.283185307179586d / ((double) getMax())));
            canvas.drawCircle((float) (((double) this.c.centerX()) + (((double) this.d) * Math.sin((double) progress))), (float) (((double) this.c.centerY()) - (((double) this.d) * Math.cos((double) progress))), 10.0f, this.i);
        }
        if (this.j != null) {
            this.i.setColor(-9408400);
            this.i.setTextSize(this.a);
            this.i.setTextAlign(Align.CENTER);
            this.i.setTypeface(Typeface.create(z, 0));
            Rect rect = new Rect();
            this.i.getTextBounds(this.j, 0, this.j.length(), rect);
            this.i.setStyle(Style.FILL);
            canvas.drawText(this.j, 0, this.j.length(), this.c.centerX(), this.c.centerY() + (((float) rect.height()) * 0.5f), this.i);
        }
    }

    public void setKnobEnabled(boolean z) {
        this.h = z;
    }

    public void setProgressBarColor(int i) {
        this.g = i;
    }

    public void setPaintStrokeFactor(float f) {
        this.m = f;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        this.d = ((float) Math.min((i - paddingLeft) - paddingRight, (i2 - getPaddingTop()) - getPaddingBottom())) / 2.0f;
        this.d -= 0.3f * this.d;
        this.c.set(((float) (i / 2)) - this.d, ((float) (i2 / 2)) - this.d, ((float) (i / 2)) + this.d, ((float) (i2 / 2)) + this.d);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.graphics.Canvas r15) {
        /*
        r14 = this;
        r12 = 4614256656552045848; // 0x400921fb54442d18 float:3.37028055E12 double:3.141592653589793;
        r11 = 1133248512; // 0x438c0000 float:280.0 double:5.59899158E-315;
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = android.os.SystemClock.uptimeMillis();
        r4 = r14.b;
        r6 = 0;
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x001d;
    L_0x001b:
        r14.b = r2;
    L_0x001d:
        r4 = r14.b;
        r4 = r2 - r4;
        r6 = 1333; // 0x535 float:1.868E-42 double:6.586E-321;
        r4 = r4 % r6;
        r0 = (float) r4;
        r0 = r0 * r10;
        r4 = 1151770624; // 0x44a6a000 float:1333.0 double:5.69050297E-315;
        r0 = r0 / r4;
        r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r4 >= 0) goto L_0x003c;
    L_0x002e:
        r4 = (double) r0;
        r4 = r4 * r12;
        r4 = java.lang.Math.sin(r4);
        r0 = (float) r4;
        r4 = r0 * r0;
        r4 = r4 * r0;
        r0 = r0 * r4;
        r0 = r0 / r9;
        if (r1 == 0) goto L_0x004a;
    L_0x003c:
        r0 = r0 - r8;
        r4 = (double) r0;
        r4 = r4 * r12;
        r4 = java.lang.Math.sin(r4);
        r0 = (float) r4;
        r4 = r0 * r0;
        r4 = r4 * r0;
        r0 = r0 * r4;
        r0 = r0 / r9;
        r0 = r0 + r8;
    L_0x004a:
        r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r4 >= 0) goto L_0x0059;
    L_0x004e:
        r4 = r0 * r9;
        r4 = r4 * r11;
        r14.l = r4;
        r4 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r14.k = r4;
        if (r1 == 0) goto L_0x0072;
    L_0x0059:
        r1 = r14.k;
        r4 = 0;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x0064;
    L_0x0060:
        r1 = r14.e;
        r14.k = r1;
    L_0x0064:
        r1 = r10 - r0;
        r1 = r1 * r9;
        r1 = r1 * r11;
        r14.l = r1;
        r1 = r14.k;
        r0 = r0 - r8;
        r0 = r0 * r9;
        r0 = r0 * r11;
        r0 = r0 + r1;
        r14.e = r0;
    L_0x0072:
        r0 = r14.b;
        r0 = r2 - r0;
        r2 = 2200; // 0x898 float:3.083E-42 double:1.087E-320;
        r0 = r0 % r2;
        r0 = (float) r0;
        r0 = r0 * r10;
        r1 = 1158250496; // 0x45098000 float:2200.0 double:5.722517794E-315;
        r0 = r0 / r1;
        r1 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r0 = r0 * r1;
        r1 = r14.getWidth();
        r1 = r1 / 2;
        r1 = (float) r1;
        r2 = r14.getHeight();
        r2 = r2 / 2;
        r2 = (float) r2;
        r15.rotate(r0, r1, r2);
        r0 = r14.i;
        r1 = 1;
        r0.setAntiAlias(r1);
        r0 = r14.f;
        if (r0 == 0) goto L_0x00b7;
    L_0x009d:
        r0 = r14.i;
        r1 = r14.f;
        r0.setColor(r1);
        r0 = r14.i;
        r1 = android.graphics.Paint.Style.STROKE;
        r0.setStyle(r1);
        r1 = r14.c;
        r2 = 0;
        r3 = 1135869952; // 0x43b40000 float:360.0 double:5.611943214E-315;
        r4 = 0;
        r5 = r14.i;
        r0 = r15;
        r0.drawArc(r1, r2, r3, r4, r5);
    L_0x00b7:
        r0 = r14.i;
        r1 = r14.g;
        r0.setColor(r1);
        r0 = r14.i;
        r1 = android.graphics.Paint.Style.STROKE;
        r0.setStyle(r1);
        r0 = r14.i;
        r1 = r14.d;
        r2 = r14.m;
        r1 = r1 / r2;
        r0.setStrokeWidth(r1);
        r0 = r14.i;
        r1 = android.graphics.Paint.Cap.ROUND;
        r0.setStrokeCap(r1);
        r1 = r14.c;
        r2 = r14.e;
        r3 = r14.l;
        r4 = 0;
        r5 = r14.i;
        r0 = r15;
        r0.drawArc(r1, r2, r3, r4, r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.CircularProgressBar.a(android.graphics.Canvas):void");
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new RectF();
        this.i = new Paint();
        this.g = -13388315;
        this.f = -1711276033;
        this.j = null;
        this.m = 5.0f;
        this.h = false;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, arj.CircularProgressBar);
            this.g = obtainStyledAttributes.getInteger(0, this.g);
            this.f = obtainStyledAttributes.getInteger(1, this.f);
            this.m = obtainStyledAttributes.getFloat(2, this.m);
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgressBarBackgroundColor(int i) {
        this.f = i;
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new RectF();
        this.i = new Paint();
        this.g = -13388315;
        this.f = -1711276033;
        this.j = null;
        this.m = 5.0f;
        this.h = false;
        a(context, attributeSet);
    }

    public CircularProgressBar(Context context) {
        super(context);
        this.c = new RectF();
        this.i = new Paint();
        this.g = -13388315;
        this.f = -1711276033;
        this.j = null;
        this.m = 5.0f;
        this.h = false;
        a(context, null);
    }

    public void setCenterText(String str) {
        this.j = str;
        this.a = 30.0f * a4d.a().g;
    }
}
