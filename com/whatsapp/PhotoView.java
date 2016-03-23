package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import org.whispersystems.at;

public class PhotoView extends View implements OnGestureListener, OnDoubleTapListener, OnScaleGestureListener {
    private static Paint A;
    public static Bitmap O;
    private static int i;
    private static Paint w;
    private static boolean z;
    private boolean B;
    private boolean C;
    private RectF D;
    private Matrix E;
    private float F;
    private boolean G;
    private float H;
    private Rect I;
    private float J;
    private float K;
    private Matrix L;
    private boolean M;
    private GestureDetectorCompat N;
    private int P;
    private int Q;
    private float a;
    private ae4 b;
    private float c;
    private float[] d;
    private int e;
    private boolean f;
    private ni g;
    private kr h;
    private RectF j;
    private akd k;
    private OnClickListener l;
    private int m;
    private int n;
    private boolean o;
    private RectF p;
    private BitmapDrawable q;
    private boolean r;
    private boolean s;
    private ScaleGestureDetector t;
    private float u;
    private boolean v;
    private bu x;
    private Matrix y;

    public void setIsVideo(boolean z) {
        this.B = z;
    }

    public boolean a(float f, float f2) {
        if (!this.s) {
            return false;
        }
        if (bu.a(this.x)) {
            return true;
        }
        if (this.c == 0.0f) {
            if (e() == this.J) {
                return false;
            }
            return true;
        } else if (e() <= this.c) {
            return false;
        } else {
            return true;
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E = new Matrix();
        this.L = new Matrix();
        this.m = -1;
        this.I = new Rect();
        this.C = true;
        this.h = kr.FIT_CENTER;
        this.p = new RectF();
        this.D = new RectF();
        this.j = new RectF();
        this.d = new float[9];
        d();
    }

    protected float g() {
        return this.J;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.s) {
            b(-f, -f2);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDoubleTap(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = r5.C;
        if (r0 == 0) goto L_0x0051;
    L_0x0004:
        r0 = r5.s;
        if (r0 == 0) goto L_0x0051;
    L_0x0008:
        r0 = r5.v;
        if (r0 != 0) goto L_0x004e;
    L_0x000c:
        r1 = r5.e();
        r0 = r5.J;
        r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0053;
    L_0x0016:
        r0 = 1075838976; // 0x40200000 float:2.5 double:5.315350785E-315;
    L_0x0018:
        r2 = r5.J;
        r0 = java.lang.Math.max(r2, r0);
        r2 = r5.H;
        r0 = java.lang.Math.min(r2, r0);
        r2 = r5.J;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0041;
    L_0x002a:
        r2 = r5.k;
        r3 = r5.getWidth();
        r3 = r3 / 2;
        r3 = (float) r3;
        r4 = r5.getHeight();
        r4 = r4 / 2;
        r4 = (float) r4;
        r2.a(r1, r0, r3, r4);
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x004e;
    L_0x0041:
        r2 = r5.k;
        r3 = r6.getX();
        r4 = r6.getY();
        r2.a(r1, r0, r3, r4);
    L_0x004e:
        r0 = 0;
        r5.v = r0;
    L_0x0051:
        r0 = 1;
        return r0;
    L_0x0053:
        r0 = r5.J;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhotoView.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public void a(Bitmap bitmap) {
        boolean z;
        if (this.q == null) {
            z = false;
        } else if (bitmap != this.q.getBitmap()) {
            if (bitmap == null || (this.q.getIntrinsicWidth() == bitmap.getWidth() && this.q.getIntrinsicHeight() == bitmap.getHeight())) {
                z = false;
            } else {
                z = true;
            }
            this.J = 0.0f;
            this.q = null;
        } else {
            return;
        }
        if (this.q == null && bitmap != null) {
            this.q = new BitmapDrawable(getResources(), bitmap);
        }
        if (z) {
            this.e = 0;
            this.P = 0;
        }
        a(z);
        invalidate();
    }

    static void a(PhotoView photoView, boolean z) {
        photoView.c(z);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!(this.l == null || this.M)) {
            this.l.onClick(this);
        }
        this.M = false;
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.s) {
            this.k.a();
            this.M = true;
        }
        return true;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.l = onClickListener;
    }

    static float a(PhotoView photoView, float f) {
        photoView.a = f;
        return f;
    }

    static void a(PhotoView photoView, float f, float f2, float f3, boolean z) {
        photoView.a(f, f2, f3, z);
    }

    public void setHeightForInitialScaleCalculation(int i) {
        this.Q = i;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public void a(float f, boolean z) {
        if (z) {
            this.b.a(f);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a += f;
        this.E.postRotate(f, (float) (getWidth() / 2), (float) (getHeight() / 2));
        invalidate();
    }

    private void d() {
        Context context = getContext();
        if (!z) {
            z = true;
            A = new Paint();
            A.setAntiAlias(true);
            A.setStyle(Style.FILL);
            w = new Paint();
            w.setAntiAlias(true);
            w.setStyle(Style.STROKE);
        }
        this.N = new GestureDetectorCompat(context, this, null);
        this.t = new ScaleGestureDetector(context, this);
        if (VERSION.SDK_INT >= 19) {
            this.t.setQuickScaleEnabled(false);
        }
        this.k = new akd(this);
        this.x = new bu(this);
        this.g = new ni(this);
        this.b = new ae4(this);
    }

    public void b() {
        this.N = null;
        this.t = null;
        this.q = null;
        if (this.k != null) {
            this.k.a();
        }
        this.k = null;
        if (this.x != null) {
            this.x.a();
        }
        this.x = null;
        if (this.g != null) {
            this.g.a();
        }
        this.g = null;
        if (this.b != null) {
            this.b.a();
        }
        this.b = null;
        setOnClickListener(null);
        this.l = null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.r = true;
        int width = getWidth();
        int height = getHeight();
        if (this.o) {
            this.n = Math.min(i, Math.min(width, height));
            width = (width - this.n) / 2;
            height = (height - this.n) / 2;
            this.I.set(width, height, this.n + width, this.n + height);
        }
        a(z);
    }

    protected float e() {
        return this.F;
    }

    public void b(boolean z) {
        this.s = z;
        if (!this.s) {
            a();
        }
    }

    static boolean a(PhotoView photoView, float f, float f2) {
        return photoView.b(f, f2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r14 = this;
        r13 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r12 = 1127481344; // 0x43340000 float:180.0 double:5.570497984E-315;
        r9 = 1119092736; // 0x42b40000 float:90.0 double:5.529052754E-315;
        r11 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r10 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r14.q;
        r4 = r0.getIntrinsicWidth();
        r0 = r14.q;
        r5 = r0.getIntrinsicHeight();
        r0 = r14.o;
        if (r0 == 0) goto L_0x017b;
    L_0x001b:
        r0 = i;
    L_0x001d:
        r1 = r14.o;
        if (r1 == 0) goto L_0x0181;
    L_0x0021:
        r2 = i;
    L_0x0023:
        if (r4 < 0) goto L_0x0027;
    L_0x0025:
        if (r0 != r4) goto L_0x0187;
    L_0x0027:
        if (r5 < 0) goto L_0x002b;
    L_0x0029:
        if (r2 != r5) goto L_0x0187;
    L_0x002b:
        r1 = 1;
    L_0x002c:
        r14.c = r10;
        r6 = r14.E;
        r6.reset();
        if (r1 == 0) goto L_0x003f;
    L_0x0035:
        r1 = r14.o;
        if (r1 != 0) goto L_0x003f;
    L_0x0039:
        r14.J = r13;
        r14.F = r13;
        if (r3 == 0) goto L_0x014d;
    L_0x003f:
        r1 = r14.p;
        r6 = (float) r4;
        r7 = (float) r5;
        r1.set(r10, r10, r6, r7);
        r1 = r14.o;
        if (r1 == 0) goto L_0x0053;
    L_0x004a:
        r1 = r14.D;
        r6 = r14.I;
        r1.set(r6);
        if (r3 == 0) goto L_0x005a;
    L_0x0053:
        r1 = r14.D;
        r6 = (float) r0;
        r7 = (float) r2;
        r1.set(r10, r10, r6, r7);
    L_0x005a:
        r1 = r14.E;
        r6 = r0 / 2;
        r7 = r4 / 2;
        r6 = r6 - r7;
        r6 = (float) r6;
        r7 = r2 / 2;
        r8 = r5 / 2;
        r7 = r7 - r8;
        r7 = (float) r7;
        r1.setTranslate(r6, r7);
        r1 = r14.Q;
        if (r1 == 0) goto L_0x01d4;
    L_0x006f:
        r1 = r14.Q;
    L_0x0071:
        r2 = r14.a;
        r2 = r2 % r12;
        r2 = java.lang.Math.abs(r2);
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 != 0) goto L_0x018a;
    L_0x007c:
        r2 = (float) r0;
        r6 = (float) r5;
        r2 = r2 / r6;
        r6 = (float) r1;
        r7 = (float) r4;
        r6 = r6 / r7;
        r2 = java.lang.Math.min(r2, r6);
    L_0x0086:
        r14.J = r2;
        r2 = r14.J;
        r2 = java.lang.Math.min(r2, r11);
        r14.J = r2;
        r2 = r14.h;
        r6 = com.whatsapp.kr.CENTER_CROP;
        if (r2 != r6) goto L_0x00ad;
    L_0x0096:
        r2 = r14.a;
        r2 = r2 % r12;
        r2 = java.lang.Math.abs(r2);
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 != 0) goto L_0x0196;
    L_0x00a1:
        r2 = (float) r0;
        r6 = (float) r5;
        r2 = r2 / r6;
        r6 = (float) r1;
        r7 = (float) r4;
        r6 = r6 / r7;
        r2 = java.lang.Math.max(r2, r6);
    L_0x00ab:
        if (r3 == 0) goto L_0x00db;
    L_0x00ad:
        r2 = r14.h;
        r6 = com.whatsapp.kr.FIT_WIDTH;
        if (r2 != r6) goto L_0x00c3;
    L_0x00b3:
        r2 = r14.a;
        r2 = r2 % r12;
        r2 = java.lang.Math.abs(r2);
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 != 0) goto L_0x01a2;
    L_0x00be:
        r2 = (float) r0;
        r6 = (float) r5;
        r2 = r2 / r6;
    L_0x00c1:
        if (r3 == 0) goto L_0x00db;
    L_0x00c3:
        r2 = r14.h;
        r6 = com.whatsapp.kr.FIT_HEIGHT;
        if (r2 != r6) goto L_0x00d9;
    L_0x00c9:
        r2 = r14.a;
        r2 = r2 % r12;
        r2 = java.lang.Math.abs(r2);
        r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1));
        if (r2 != 0) goto L_0x01a7;
    L_0x00d4:
        r2 = (float) r1;
        r6 = (float) r4;
        r2 = r2 / r6;
    L_0x00d7:
        if (r3 == 0) goto L_0x00db;
    L_0x00d9:
        r2 = r14.J;
    L_0x00db:
        r6 = r14.a;
        r6 = r6 % r12;
        r6 = java.lang.Math.abs(r6);
        r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1));
        if (r6 != 0) goto L_0x0103;
    L_0x00e6:
        r6 = (float) r0;
        r7 = (float) r5;
        r6 = r6 / r7;
        r7 = (float) r1;
        r8 = (float) r4;
        r7 = r7 / r8;
        r8 = r6 / r7;
        r8 = r8 - r13;
        r8 = java.lang.Math.abs(r8);
        r9 = r14.K;
        r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r8 >= 0) goto L_0x0101;
    L_0x00f9:
        r2 = java.lang.Math.max(r6, r7);
        r14.c = r2;
        r2 = r14.c;
    L_0x0101:
        if (r3 == 0) goto L_0x011e;
    L_0x0103:
        r6 = (float) r0;
        r7 = (float) r4;
        r6 = r6 / r7;
        r7 = (float) r1;
        r8 = (float) r5;
        r7 = r7 / r8;
        r8 = r6 / r7;
        r8 = r8 - r13;
        r8 = java.lang.Math.abs(r8);
        r9 = r14.K;
        r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
        if (r8 >= 0) goto L_0x011e;
    L_0x0116:
        r2 = java.lang.Math.max(r6, r7);
        r14.c = r2;
        r2 = r14.c;
    L_0x011e:
        r6 = r14.F;
        r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r6 != 0) goto L_0x012a;
    L_0x0124:
        r6 = java.lang.Math.min(r2, r11);
        r14.F = r6;
    L_0x012a:
        r6 = r14.f;
        if (r6 == 0) goto L_0x01ac;
    L_0x012e:
        r6 = r14.G;
        if (r6 == 0) goto L_0x01ac;
    L_0x0132:
        r14.e = r0;
        r14.P = r1;
        r0 = r14.c;
        r0 = java.lang.Math.min(r0, r11);
        r14.c = r0;
        r0 = r14.E;
        r1 = r14.F;
        r2 = r14.F;
        r3 = r4 / 2;
        r3 = (float) r3;
        r4 = r5 / 2;
        r4 = (float) r4;
        r0.preScale(r1, r2, r3, r4);
    L_0x014d:
        r0 = r14.J;
        r1 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r0 = r0 * r1;
        r1 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r0 = java.lang.Math.max(r0, r1);
        r14.H = r0;
        r0 = r14.E;
        r1 = r14.a;
        r2 = r14.getWidth();
        r2 = r2 / 2;
        r2 = (float) r2;
        r3 = r14.getHeight();
        r3 = r3 / 2;
        r3 = (float) r3;
        r0.postRotate(r1, r2, r3);
        r0 = r14.F;
        r14.u = r0;
        r0 = r14.L;
        r1 = r14.E;
        r0.set(r1);
        return;
    L_0x017b:
        r0 = r14.getWidth();
        goto L_0x001d;
    L_0x0181:
        r2 = r14.getHeight();
        goto L_0x0023;
    L_0x0187:
        r1 = 0;
        goto L_0x002c;
    L_0x018a:
        r2 = (float) r0;
        r6 = (float) r4;
        r2 = r2 / r6;
        r6 = (float) r1;
        r7 = (float) r5;
        r6 = r6 / r7;
        r2 = java.lang.Math.min(r2, r6);
        goto L_0x0086;
    L_0x0196:
        r2 = (float) r0;
        r6 = (float) r4;
        r2 = r2 / r6;
        r6 = (float) r1;
        r7 = (float) r5;
        r6 = r6 / r7;
        r2 = java.lang.Math.max(r2, r6);
        goto L_0x00ab;
    L_0x01a2:
        r2 = (float) r0;
        r6 = (float) r4;
        r2 = r2 / r6;
        goto L_0x00c1;
    L_0x01a7:
        r2 = (float) r1;
        r6 = (float) r5;
        r2 = r2 / r6;
        goto L_0x00d7;
    L_0x01ac:
        r6 = r14.G;
        if (r6 == 0) goto L_0x01bc;
    L_0x01b0:
        r6 = r14.e;
        if (r6 == r0) goto L_0x0132;
    L_0x01b4:
        r6 = java.lang.Math.min(r2, r11);
        r14.F = r6;
        if (r3 == 0) goto L_0x0132;
    L_0x01bc:
        r6 = r14.f;
        if (r6 == 0) goto L_0x01cc;
    L_0x01c0:
        r6 = r14.P;
        if (r6 == r1) goto L_0x0132;
    L_0x01c4:
        r6 = java.lang.Math.min(r2, r11);
        r14.F = r6;
        if (r3 == 0) goto L_0x0132;
    L_0x01cc:
        r2 = java.lang.Math.min(r2, r11);
        r14.F = r2;
        goto L_0x0132;
    L_0x01d4:
        r1 = r2;
        goto L_0x0071;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhotoView.c():void");
    }

    protected void onMeasure(int i, int i2) {
        if (this.m != -1) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(this.m, Integer.MIN_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.m);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setRotation(float f, boolean z) {
        this.a = 0.0f;
        a(f, z);
    }

    public boolean c(float f, float f2) {
        if (!this.s) {
            return false;
        }
        if (bu.a(this.x)) {
            return true;
        }
        if (this.c == 0.0f) {
            if (e() == this.J) {
                return false;
            }
            return true;
        } else if (e() <= this.c) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.t == null || this.N == null)) {
            this.t.onTouchEvent(motionEvent);
            this.N.onTouchEvent(motionEvent);
            switch (motionEvent.getAction()) {
                case at.g /*1*/:
                case at.o /*3*/:
                    if (!bu.a(this.x)) {
                        c(false);
                        break;
                    }
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    public void setInitialFitTolerance(float f) {
        this.K = f;
    }

    private void a(boolean z) {
        if (this.q != null && this.r) {
            int intrinsicWidth = this.q.getIntrinsicWidth();
            int intrinsicHeight = this.q.getIntrinsicHeight();
            this.q.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (Math.abs(this.a % 180.0f) != 90.0f) {
                int i = intrinsicHeight;
                intrinsicHeight = intrinsicWidth;
                intrinsicWidth = i;
            }
            int width = getWidth();
            int height = getHeight();
            if ((intrinsicHeight < 0 || width == intrinsicHeight) && (r0 < 0 || height == r0)) {
                intrinsicWidth = 1;
            } else {
                intrinsicWidth = 0;
            }
            if (z || (this.J == 0.0f && this.q != null && this.r)) {
                c();
            }
            if (intrinsicWidth != 0 || this.E.isIdentity()) {
                this.y = null;
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            this.y = this.E;
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.s) {
            this.x.a(f, f2);
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r12) {
        /*
        r11 = this;
        r10 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.j;
        r2 = r11.p;
        r0.set(r2);
        r0 = r11.E;
        r2 = r11.j;
        r0.mapRect(r2);
        r0 = r11.o;
        if (r0 == 0) goto L_0x00ac;
    L_0x0019:
        r0 = r11.I;
        r0 = r0.left;
        r0 = (float) r0;
    L_0x001e:
        r2 = r11.o;
        if (r2 == 0) goto L_0x00af;
    L_0x0022:
        r2 = r11.I;
        r2 = r2.right;
        r2 = (float) r2;
    L_0x0027:
        r3 = r11.j;
        r4 = r3.left;
        r3 = r11.j;
        r6 = r3.right;
        r3 = r6 - r4;
        r7 = r2 - r0;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 >= 0) goto L_0x0040;
    L_0x0037:
        r3 = r2 - r0;
        r7 = r6 + r4;
        r3 = r3 - r7;
        r3 = r3 / r9;
        r3 = r3 + r0;
        if (r5 == 0) goto L_0x00c2;
    L_0x0040:
        r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r3 <= 0) goto L_0x0047;
    L_0x0044:
        r0 = r0 - r4;
        if (r5 == 0) goto L_0x0050;
    L_0x0047:
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x004f;
    L_0x004b:
        r0 = r2 - r6;
        if (r5 == 0) goto L_0x0050;
    L_0x004f:
        r0 = r1;
    L_0x0050:
        r2 = r11.o;
        if (r2 == 0) goto L_0x00b6;
    L_0x0054:
        r2 = r11.I;
        r2 = r2.top;
        r2 = (float) r2;
    L_0x0059:
        r3 = r11.o;
        if (r3 == 0) goto L_0x00b8;
    L_0x005d:
        r3 = r11.I;
        r3 = r3.bottom;
        r3 = (float) r3;
    L_0x0062:
        r4 = r11.j;
        r6 = r4.top;
        r4 = r11.j;
        r7 = r4.bottom;
        r4 = r7 - r6;
        r8 = r3 - r2;
        r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r4 >= 0) goto L_0x007b;
    L_0x0072:
        r4 = r3 - r2;
        r8 = r7 + r6;
        r4 = r4 - r8;
        r4 = r4 / r9;
        r4 = r4 + r2;
        if (r5 == 0) goto L_0x00c0;
    L_0x007b:
        r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0082;
    L_0x007f:
        r2 = r2 - r6;
        if (r5 == 0) goto L_0x00be;
    L_0x0082:
        r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1));
        if (r2 >= 0) goto L_0x008a;
    L_0x0086:
        r2 = r3 - r7;
        if (r5 == 0) goto L_0x00be;
    L_0x008a:
        r2 = java.lang.Math.abs(r0);
        r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r2 > 0) goto L_0x009a;
    L_0x0092:
        r2 = java.lang.Math.abs(r1);
        r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x00a3;
    L_0x009a:
        if (r12 != 0) goto L_0x00a3;
    L_0x009c:
        r2 = r11.g;
        r2.a(r0, r1);
        if (r5 == 0) goto L_0x00ab;
    L_0x00a3:
        r2 = r11.E;
        r2.postTranslate(r0, r1);
        r11.invalidate();
    L_0x00ab:
        return;
    L_0x00ac:
        r0 = r1;
        goto L_0x001e;
    L_0x00af:
        r2 = r11.getWidth();
        r2 = (float) r2;
        goto L_0x0027;
    L_0x00b6:
        r2 = r1;
        goto L_0x0059;
    L_0x00b8:
        r3 = r11.getHeight();
        r3 = (float) r3;
        goto L_0x0062;
    L_0x00be:
        r1 = r2;
        goto L_0x008a;
    L_0x00c0:
        r1 = r4;
        goto L_0x008a;
    L_0x00c2:
        r0 = r3;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhotoView.c(boolean):void");
    }

    private void a(float f, float f2, float f3, boolean z) {
        float min = Math.min(Math.max(f, this.J), this.H);
        float e = min / e();
        this.E.postRotate(-this.a, (float) (getWidth() / 2), (float) (getHeight() / 2));
        this.E.postScale(e, e, f2, f3);
        this.F = min;
        this.E.postRotate(this.a, (float) (getWidth() / 2), (float) (getHeight() / 2));
        c(z);
        invalidate();
    }

    public void f() {
        a(90.0f, true);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.s) {
            this.M = false;
            a(e() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), false);
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(float r10, float r11) {
        /*
        r9 = this;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.j;
        r2 = r9.p;
        r0.set(r2);
        r0 = r9.E;
        r2 = r9.j;
        r0.mapRect(r2);
        r0 = r9.o;
        if (r0 == 0) goto L_0x00c3;
    L_0x0017:
        r0 = r9.I;
        r0 = r0.left;
        r0 = (float) r0;
    L_0x001c:
        r2 = r9.o;
        if (r2 == 0) goto L_0x00c6;
    L_0x0020:
        r2 = r9.I;
        r2 = r2.right;
        r2 = (float) r2;
    L_0x0025:
        r3 = r9.j;
        r5 = r3.left;
        r3 = r9.j;
        r6 = r3.right;
        r3 = r9.o;
        if (r3 == 0) goto L_0x0047;
    L_0x0031:
        r3 = r9.j;
        r3 = r3.right;
        r3 = r0 - r3;
        r7 = r9.j;
        r7 = r7.left;
        r7 = r2 - r7;
        r7 = java.lang.Math.min(r7, r10);
        r3 = java.lang.Math.max(r3, r7);
        if (r4 == 0) goto L_0x00d7;
    L_0x0047:
        r3 = r6 - r5;
        r7 = r2 - r0;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 >= 0) goto L_0x0058;
    L_0x004f:
        r3 = r2 - r0;
        r7 = r6 + r5;
        r3 = r3 - r7;
        r3 = r3 / r8;
        r3 = r3 + r0;
        if (r4 == 0) goto L_0x00d7;
    L_0x0058:
        r2 = r2 - r6;
        r0 = r0 - r5;
        r0 = java.lang.Math.min(r0, r10);
        r0 = java.lang.Math.max(r2, r0);
    L_0x0062:
        r2 = r9.o;
        if (r2 == 0) goto L_0x006b;
    L_0x0066:
        r1 = r9.I;
        r1 = r1.top;
        r1 = (float) r1;
    L_0x006b:
        r2 = r9.o;
        if (r2 == 0) goto L_0x00cd;
    L_0x006f:
        r2 = r9.I;
        r2 = r2.bottom;
        r2 = (float) r2;
    L_0x0074:
        r3 = r9.j;
        r5 = r3.top;
        r3 = r9.j;
        r6 = r3.bottom;
        r3 = r9.o;
        if (r3 == 0) goto L_0x0096;
    L_0x0080:
        r3 = r9.j;
        r3 = r3.bottom;
        r3 = r1 - r3;
        r7 = r9.j;
        r7 = r7.top;
        r7 = r2 - r7;
        r7 = java.lang.Math.min(r7, r11);
        r3 = java.lang.Math.max(r3, r7);
        if (r4 == 0) goto L_0x00d5;
    L_0x0096:
        r3 = r6 - r5;
        r7 = r2 - r1;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 >= 0) goto L_0x00a7;
    L_0x009e:
        r3 = r2 - r1;
        r7 = r6 + r5;
        r3 = r3 - r7;
        r3 = r3 / r8;
        r3 = r3 + r1;
        if (r4 == 0) goto L_0x00d5;
    L_0x00a7:
        r2 = r2 - r6;
        r1 = r1 - r5;
        r1 = java.lang.Math.min(r1, r11);
        r1 = java.lang.Math.max(r2, r1);
    L_0x00b1:
        r2 = r9.E;
        r2.postTranslate(r0, r1);
        r9.invalidate();
        r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1));
        if (r0 != 0) goto L_0x00d3;
    L_0x00bd:
        r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1));
        if (r0 != 0) goto L_0x00d3;
    L_0x00c1:
        r0 = 1;
    L_0x00c2:
        return r0;
    L_0x00c3:
        r0 = r1;
        goto L_0x001c;
    L_0x00c6:
        r2 = r9.getWidth();
        r2 = (float) r2;
        goto L_0x0025;
    L_0x00cd:
        r2 = r9.getHeight();
        r2 = (float) r2;
        goto L_0x0074;
    L_0x00d3:
        r0 = 0;
        goto L_0x00c2;
    L_0x00d5:
        r1 = r3;
        goto L_0x00b1;
    L_0x00d7:
        r0 = r3;
        goto L_0x0062;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhotoView.b(float, float):boolean");
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.s) {
            this.x.a();
            this.g.a();
        }
        return true;
    }

    static void b(PhotoView photoView, boolean z) {
        photoView.a(z);
    }

    public void a() {
        this.E.set(this.L);
        this.F = this.u;
        invalidate();
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.q != null) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            if (this.y != null) {
                canvas.concat(this.y);
            }
            this.q.draw(canvas);
            canvas.restoreToCount(saveCount);
            if (this.B) {
                Bitmap bitmap = O;
                canvas.drawBitmap(bitmap, (float) ((getWidth() - bitmap.getWidth()) / 2), (float) ((getHeight() - bitmap.getHeight()) / 2), null);
            }
            this.j.set(this.q.getBounds());
            if (Math.abs(this.a % 180.0f) == 90.0f) {
                float f = this.j.right;
                this.j.right = this.j.bottom;
                this.j.bottom = f;
            }
            if (this.y != null) {
                this.y.mapRect(this.j);
            }
            if (this.o) {
                int saveCount2 = canvas.getSaveCount();
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), A);
                canvas.save();
                canvas.clipRect(this.I);
                if (this.y != null) {
                    canvas.concat(this.y);
                }
                this.q.draw(canvas);
                canvas.restoreToCount(saveCount2);
                canvas.drawRect(this.I, w);
            }
        }
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.s && this.M) {
            this.v = true;
            a();
        }
    }

    public PhotoView(Context context) {
        super(context);
        this.E = new Matrix();
        this.L = new Matrix();
        this.m = -1;
        this.I = new Rect();
        this.C = true;
        this.h = kr.FIT_CENTER;
        this.p = new RectF();
        this.D = new RectF();
        this.j = new RectF();
        this.d = new float[9];
        d();
    }

    static float a(PhotoView photoView) {
        return photoView.a;
    }

    public void h() {
        a(-90.0f, true);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = new Matrix();
        this.L = new Matrix();
        this.m = -1;
        this.I = new Rect();
        this.C = true;
        this.h = kr.FIT_CENTER;
        this.p = new RectF();
        this.D = new RectF();
        this.j = new RectF();
        this.d = new float[9];
        d();
    }
}
