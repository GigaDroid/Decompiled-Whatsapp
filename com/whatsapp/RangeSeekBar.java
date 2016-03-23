package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import org.v;
import org.whispersystems.at;

public class RangeSeekBar extends ImageView {
    private static final String[] C;
    public static final int g;
    public static final int v;
    private float A;
    private boolean B;
    private float a;
    private final double b;
    private final Number c;
    private final Paint d;
    private Bitmap e;
    private RectF f;
    private final double h;
    private Bitmap i;
    private aab j;
    private float k;
    private Bitmap l;
    private Number m;
    private int n;
    private float o;
    private aks p;
    private int q;
    private float r;
    private final avz s;
    private double t;
    private final Number u;
    private double w;
    private Bitmap x;
    private int y;
    private boolean z;

    private void a(float f, boolean z, Canvas canvas) {
        Bitmap bitmap;
        if (this.n > 0) {
            this.d.setColor(g);
            this.d.setStrokeWidth(this.A / 2.0f);
            canvas.drawLine(f, 0.0f, f, ((float) this.n) + (0.5f * (((float) (getHeight() - this.n)) - this.A)), this.d);
        }
        if (z) {
            bitmap = this.i;
        } else {
            bitmap = this.e;
        }
        canvas.drawBitmap(bitmap, f - ((float) (this.e.getWidth() / 2)), (float) this.n, this.d);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable(C[2], super.onSaveInstanceState());
        bundle.putDouble(C[0], this.w);
        bundle.putDouble(C[1], this.t);
        return bundle;
    }

    private float d(double d) {
        return (float) (((double) this.r) + (((double) (((float) getWidth()) - (2.0f * this.r))) * d));
    }

    public void setTopExtension(int i) {
        this.n = i;
    }

    public void setNormalizedMaxValue(double d) {
        this.t = Math.max(0.0d, Math.min(1.0d, Math.max(d, this.w)));
        invalidate();
    }

    private final void b() {
        this.y = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.view.MotionEvent r14) {
        /*
        r13 = this;
        r1 = 4;
        r2 = 2;
        r12 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r13.q;
        r0 = r14.findPointerIndex(r0);
        r4 = r14.getX(r0);
        r5 = r14.getY(r0);
        r0 = com.whatsapp.aab.MIN;
        r6 = r13.j;
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x0072;
    L_0x0020:
        r0 = r13.a;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0044;
    L_0x0026:
        r0 = r13.k;
        r6 = r13.a(r0);
        r8 = r13.a(r4);
        r6 = r6 - r8;
        r0 = r13.a;
        r0 = r0 * r12;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x0107;
    L_0x0038:
        r0 = r1;
    L_0x0039:
        r8 = (double) r0;
        r6 = r6 / r8;
        r8 = r13.w;
        r6 = r8 - r6;
        r13.setNormalizedMinValue(r6);
        if (r3 == 0) goto L_0x004b;
    L_0x0044:
        r6 = r13.a(r4);
        r13.setNormalizedMinValue(r6);
    L_0x004b:
        r0 = r13.m;
        r6 = r13.a(r0);
        r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x0104;
    L_0x0055:
        r6 = r13.t;
        r8 = r13.w;
        r6 = r6 - r8;
        r0 = r13.m;
        r8 = r13.a(r0);
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x0104;
    L_0x0064:
        r6 = r13.w;
        r0 = r13.m;
        r8 = r13.a(r0);
        r6 = r6 + r8;
        r13.setNormalizedMaxValue(r6);
        if (r3 == 0) goto L_0x0104;
    L_0x0072:
        r0 = com.whatsapp.aab.MAX;
        r6 = r13.j;
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x00ce;
    L_0x007c:
        r0 = r13.a;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x00a0;
    L_0x0082:
        r0 = r13.k;
        r6 = r13.a(r0);
        r8 = r13.a(r4);
        r6 = r6 - r8;
        r0 = r13.a;
        r0 = r0 * r12;
        r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x010a;
    L_0x0094:
        r0 = (double) r1;
        r0 = r6 / r0;
        r6 = r13.t;
        r0 = r6 - r0;
        r13.setNormalizedMaxValue(r0);
        if (r3 == 0) goto L_0x00a7;
    L_0x00a0:
        r0 = r13.a(r4);
        r13.setNormalizedMaxValue(r0);
    L_0x00a7:
        r0 = r13.m;
        r0 = r13.a(r0);
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 <= 0) goto L_0x0104;
    L_0x00b1:
        r0 = r13.t;
        r6 = r13.w;
        r0 = r0 - r6;
        r2 = r13.m;
        r6 = r13.a(r2);
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0104;
    L_0x00c0:
        r0 = r13.t;
        r2 = r13.m;
        r6 = r13.a(r2);
        r0 = r0 - r6;
        r13.setNormalizedMinValue(r0);
        if (r3 == 0) goto L_0x0104;
    L_0x00ce:
        r0 = com.whatsapp.aab.MID;
        r1 = r13.j;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0104;
    L_0x00d8:
        r0 = r13.w;
        r0 = r13.d(r0);
        r2 = r13.t;
        r1 = r13.d(r2);
        r2 = r13.k;
        r2 = r2 - r4;
        r0 = r0 - r2;
        r6 = r13.a(r0);
        r0 = r1 - r2;
        r0 = r13.a(r0);
        r2 = r13.b(r6);
        if (r2 == 0) goto L_0x0104;
    L_0x00f8:
        r2 = r13.c(r0);
        if (r2 == 0) goto L_0x0104;
    L_0x00fe:
        r13.setNormalizedMinValue(r6);
        r13.setNormalizedMaxValue(r0);
    L_0x0104:
        r13.k = r4;
        return;
    L_0x0107:
        r0 = r2;
        goto L_0x0039;
    L_0x010a:
        r1 = r2;
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RangeSeekBar.a(android.view.MotionEvent):void");
    }

    public void setNotifyWhileDragging(boolean z) {
        this.B = z;
    }

    public Number a() {
        return a(this.t);
    }

    public void setOnRangeSeekBarChangeListener(aks com_whatsapp_aks) {
        this.p = com_whatsapp_aks;
    }

    public boolean b(double d) {
        return this.w != Math.max(0.0d, Math.min(1.0d, Math.min(d, this.t)));
    }

    private boolean b(float f, double d) {
        return Math.abs(f - d(d)) <= ((float) (this.x.getWidth() / 2));
    }

    public void setThumbResources(int i, int i2, int i3, int i4) {
        this.e = BitmapFactory.decodeResource(getResources(), i);
        this.i = BitmapFactory.decodeResource(getResources(), i2);
        this.x = BitmapFactory.decodeResource(getResources(), i3);
        this.l = BitmapFactory.decodeResource(getResources(), i4);
        this.A = 0.15f * ((float) this.e.getHeight());
        this.r = 0.5f * ((float) this.e.getWidth());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r1 = 1;
        r0 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = r6.isEnabled();
        if (r3 != 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        r3 = r7.getAction();
        r3 = r3 & 255;
        switch(r3) {
            case 0: goto L_0x0016;
            case 1: goto L_0x009f;
            case 2: goto L_0x0054;
            case 3: goto L_0x00ef;
            case 4: goto L_0x0014;
            case 5: goto L_0x00d0;
            case 6: goto L_0x00e7;
            default: goto L_0x0014;
        };
    L_0x0014:
        r0 = r1;
        goto L_0x000a;
    L_0x0016:
        r3 = r7.getPointerCount();
        r3 = r3 + -1;
        r3 = r7.getPointerId(r3);
        r6.q = r3;
        r3 = r6.q;
        r3 = r7.findPointerIndex(r3);
        r3 = r7.getX(r3);
        r6.o = r3;
        r3 = r6.o;
        r6.k = r3;
        r3 = r6.o;
        r3 = r6.b(r3);
        r6.j = r3;
        r3 = r6.j;
        if (r3 != 0) goto L_0x0043;
    L_0x003e:
        r0 = super.onTouchEvent(r7);
        goto L_0x000a;
    L_0x0043:
        r6.setPressed(r1);
        r6.invalidate();
        r6.d();
        r6.a(r7);
        r6.f();
        if (r2 == 0) goto L_0x0014;
    L_0x0054:
        r3 = r6.j;
        if (r3 == 0) goto L_0x0014;
    L_0x0058:
        r3 = r6.z;
        if (r3 == 0) goto L_0x0061;
    L_0x005c:
        r6.a(r7);
        if (r2 == 0) goto L_0x0088;
    L_0x0061:
        r3 = r6.q;
        r3 = r7.findPointerIndex(r3);
        r3 = r7.getX(r3);
        r4 = r6.o;
        r3 = r3 - r4;
        r3 = java.lang.Math.abs(r3);
        r4 = r6.y;
        r4 = (float) r4;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x0088;
    L_0x0079:
        r6.setPressed(r1);
        r6.invalidate();
        r6.d();
        r6.a(r7);
        r6.f();
    L_0x0088:
        r3 = r6.B;
        if (r3 == 0) goto L_0x0014;
    L_0x008c:
        r3 = r6.p;
        if (r3 == 0) goto L_0x0014;
    L_0x0090:
        r3 = r6.p;
        r4 = r6.e();
        r5 = r6.a();
        r3.a(r6, r4, r5, r1);
        if (r2 == 0) goto L_0x0014;
    L_0x009f:
        r3 = r6.z;
        if (r3 == 0) goto L_0x00ae;
    L_0x00a3:
        r6.a(r7);
        r6.c();
        r6.setPressed(r0);
        if (r2 == 0) goto L_0x00b7;
    L_0x00ae:
        r6.d();
        r6.a(r7);
        r6.c();
    L_0x00b7:
        r3 = 0;
        r6.j = r3;
        r6.invalidate();
        r3 = r6.p;
        if (r3 == 0) goto L_0x0014;
    L_0x00c1:
        r3 = r6.p;
        r4 = r6.e();
        r5 = r6.a();
        r3.a(r6, r4, r5, r0);
        if (r2 == 0) goto L_0x0014;
    L_0x00d0:
        r3 = r7.getPointerCount();
        r3 = r3 + -1;
        r4 = r7.getX(r3);
        r6.o = r4;
        r3 = r7.getPointerId(r3);
        r6.q = r3;
        r6.invalidate();
        if (r2 == 0) goto L_0x0014;
    L_0x00e7:
        r6.b(r7);
        r6.invalidate();
        if (r2 == 0) goto L_0x0014;
    L_0x00ef:
        r2 = r6.z;
        if (r2 == 0) goto L_0x00f9;
    L_0x00f3:
        r6.c();
        r6.setPressed(r0);
    L_0x00f9:
        r6.invalidate();
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RangeSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private double a(Number number) {
        if (0.0d == this.b - this.h) {
            return 0.0d;
        }
        return (number.doubleValue() - this.h) / (this.b - this.h);
    }

    private final void b(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.q) {
            if (action == 0) {
                action = 1;
            } else {
                action = 0;
            }
            this.o = motionEvent.getX(action);
            this.q = motionEvent.getPointerId(action);
        }
    }

    private double a(float f) {
        int width = getWidth();
        if (((float) width) <= this.r * 2.0f) {
            return 0.0d;
        }
        return Math.min(1.0d, Math.max(0.0d, (double) ((f - this.r) / (((float) width) - (this.r * 2.0f)))));
    }

    private void b(float f, boolean z, Canvas canvas) {
        Bitmap bitmap;
        if (this.n > 0) {
            this.d.setColor(g);
            this.d.setStrokeWidth(this.A / 2.0f);
            canvas.drawLine(f, 0.0f, f, ((float) this.n) + (0.5f * (((float) (getHeight() - this.n)) - this.A)), this.d);
        }
        if (z) {
            bitmap = this.l;
        } else {
            bitmap = this.x;
        }
        canvas.drawBitmap(bitmap, f - ((float) (this.x.getWidth() / 2)), (float) this.n, this.d);
    }

    public RangeSeekBar(Number number, Number number2, Number number3, Context context) {
        super(context);
        this.d = new Paint(1);
        this.w = 0.0d;
        this.t = 1.0d;
        this.j = null;
        this.B = false;
        this.q = 255;
        this.f = new RectF();
        this.c = number;
        this.u = number2;
        this.m = number3;
        this.h = number.doubleValue();
        this.b = number2.doubleValue();
        this.s = avz.fromNumber(number);
        setThumbResources(2130839755, 2130839755, 2130839753, 2130839753);
        setFocusable(true);
        setFocusableInTouchMode(true);
        b();
    }

    private boolean a(float f, double d) {
        return Math.abs(f - d(d)) <= ((float) (this.e.getWidth() / 2));
    }

    void d() {
        this.z = true;
    }

    protected synchronized void onMeasure(int i, int i2) {
        int size;
        if (MeasureSpec.getMode(i) != 0) {
            size = MeasureSpec.getSize(i);
        } else {
            size = 200;
        }
        int max = Math.max(this.e.getHeight(), this.x.getHeight()) + this.n;
        if (MeasureSpec.getMode(i2) != 0) {
            max = Math.min(max, MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(size, max);
    }

    public void setSlowScrubStep(float f) {
        this.a = f;
    }

    public void setNormalizedMinValue(double d) {
        this.w = Math.max(0.0d, Math.min(1.0d, Math.min(d, this.t)));
        invalidate();
    }

    static {
        String[] strArr = new String[6];
        String str = "//$";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 98;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_checkboxStyle;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i4 = 90;
                        break;
                    default:
                        i4 = 39;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "13:\u001fu";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "//$";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "/'2";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "13:\u001fu";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    C = strArr3;
                    g = App.z().getResources().getColor(2131623943);
                    v = Color.argb(arj.Theme_checkboxStyle, 0, 0, 0);
                    return;
                default:
                    strArr2[i2] = str;
                    str = "/'2";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private Number a(double d) {
        return this.s.toNumber(this.h + ((this.b - this.h) * d));
    }

    void c() {
        this.z = false;
    }

    public Number e() {
        return a(this.w);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable(C[5]));
        this.w = bundle.getDouble(C[3]);
        this.t = bundle.getDouble(C[4]);
    }

    public void setSelectedMaxValue(Number number) {
        if (0.0d == this.b - this.h) {
            setNormalizedMaxValue(1.0d);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        setNormalizedMaxValue(a(number));
    }

    public boolean c(double d) {
        return this.t != Math.max(0.0d, Math.min(1.0d, Math.max(d, this.w)));
    }

    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.d.setStyle(Style.FILL);
        this.d.setColor(v);
        this.f.set(this.r, 0.0f, d(this.w), (float) getHeight());
        canvas.drawRect(this.f, this.d);
        this.f.set(d(this.t), 0.0f, ((float) getWidth()) - this.r, ((float) this.n) + ((((float) (getHeight() - this.n)) + this.A) * 0.5f));
        canvas.drawRect(this.f, this.d);
        this.f.set(this.r, ((float) this.n) + ((((float) (getHeight() - this.n)) - this.A) * 0.5f), ((float) getWidth()) - this.r, ((float) this.n) + ((((float) (getHeight() - this.n)) + this.A) * 0.5f));
        this.d.setColor(-7829368);
        this.d.setAntiAlias(true);
        canvas.drawRect(this.f, this.d);
        this.f.left = d(this.w);
        this.f.right = d(this.t);
        this.d.setColor(g);
        canvas.drawRect(this.f, this.d);
        a(d(this.w), aab.MIN.equals(this.j), canvas);
        b(d(this.t), aab.MAX.equals(this.j), canvas);
    }

    private aab b(float f) {
        boolean a = a(f, this.w);
        boolean b = b(f, this.t);
        if (a && b) {
            if (f / ((float) getWidth()) > 0.5f) {
                return aab.MIN;
            }
            return aab.MAX;
        } else if (a) {
            return aab.MIN;
        } else {
            if (b) {
                return aab.MAX;
            }
            if (f <= d(this.w) || f >= d(this.t)) {
                return null;
            }
            return aab.MID;
        }
    }

    private void f() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }
}
