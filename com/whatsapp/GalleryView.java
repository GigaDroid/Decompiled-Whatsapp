package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class GalleryView extends ViewGroup implements OnDoubleTapListener {
    private static final String[] G;
    private static Interpolator f;
    private VelocityTracker A;
    private aa8 B;
    private int C;
    private float D;
    private int E;
    private Paint F;
    private int a;
    public Scroller b;
    private boolean c;
    private int d;
    private boolean e;
    private _n g;
    Bitmap h;
    private int i;
    private RectF j;
    private boolean k;
    private Paint l;
    private RectF m;
    private int n;
    private Paint o;
    private int p;
    private Canvas q;
    private float r;
    boolean s;
    private float t;
    private int u;
    private int v;
    private int w;
    private Bitmap x;
    private int y;
    private GestureDetector z;

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = DialogToastActivity.f;
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                childAt.layout(i6, 0, i6 + measuredWidth, childAt.getMeasuredHeight());
                i6 += measuredWidth;
            }
            i5++;
            if (z2) {
                break;
            }
        }
        if (this.B != null) {
            this.B.a();
        }
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        boolean z = DialogToastActivity.f;
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            getChildAt(i).setOnLongClickListener(onLongClickListener);
            i++;
            if (z) {
                return;
            }
        }
    }

    private void b() {
        int width = getWidth();
        a((getScrollX() + (width / 2)) / width);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        r7 = this;
        r6 = -1;
        r5 = 0;
        r4 = 1;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r7.z;
        r1.onTouchEvent(r8);
        r1 = r7.A;
        if (r1 != 0) goto L_0x0014;
    L_0x000e:
        r1 = android.view.VelocityTracker.obtain();
        r7.A = r1;
    L_0x0014:
        r1 = r7.A;
        r1.addMovement(r8);
        r1 = r8.getAction();
        r2 = r8.getX();
        switch(r1) {
            case 0: goto L_0x0025;
            case 1: goto L_0x0074;
            case 2: goto L_0x004e;
            case 3: goto L_0x00cf;
            case 4: goto L_0x0024;
            case 5: goto L_0x00ea;
            case 6: goto L_0x00e1;
            default: goto L_0x0024;
        };
    L_0x0024:
        return r4;
    L_0x0025:
        r1 = r7.s;
        if (r1 == 0) goto L_0x0033;
    L_0x0029:
        r0 = r7.g;
        if (r0 == 0) goto L_0x0024;
    L_0x002d:
        r0 = r7.g;
        r0.a(r8);
        goto L_0x0024;
    L_0x0033:
        r1 = r7.i;
        if (r1 == 0) goto L_0x0024;
    L_0x0037:
        r1 = r7.b;
        r1 = r1.isFinished();
        if (r1 != 0) goto L_0x0044;
    L_0x003f:
        r1 = r7.b;
        r1.abortAnimation();
    L_0x0044:
        r7.t = r2;
        r1 = r8.getPointerId(r5);
        r7.u = r1;
        if (r0 == 0) goto L_0x0024;
    L_0x004e:
        r1 = r7.s;
        if (r1 == 0) goto L_0x005c;
    L_0x0052:
        r0 = r7.g;
        if (r0 == 0) goto L_0x0024;
    L_0x0056:
        r0 = r7.g;
        r0.a(r8);
        goto L_0x0024;
    L_0x005c:
        r1 = r7.i;
        if (r1 != r4) goto L_0x0065;
    L_0x0060:
        r7.a(r8);
        if (r0 == 0) goto L_0x0024;
    L_0x0065:
        r1 = r7.onInterceptTouchEvent(r8);
        if (r1 == 0) goto L_0x0024;
    L_0x006b:
        r1 = r7.i;
        if (r1 != r4) goto L_0x0024;
    L_0x006f:
        r7.a(r8);
        if (r0 == 0) goto L_0x0024;
    L_0x0074:
        java.lang.System.currentTimeMillis();
        r1 = r7.g;
        if (r1 == 0) goto L_0x007b;
    L_0x007b:
        r1 = r7.A;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r7.n;
        r3 = (float) r3;
        r1.computeCurrentVelocity(r2, r3);
        r1 = r1.getXVelocity();
        r1 = (int) r1;
        r2 = r7.i;
        if (r2 != r4) goto L_0x00c9;
    L_0x008e:
        r2 = r7.s;
        if (r2 != 0) goto L_0x00c9;
    L_0x0092:
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        if (r1 <= r2) goto L_0x00a3;
    L_0x0096:
        r2 = r7.E;
        if (r2 <= 0) goto L_0x00a3;
    L_0x009a:
        r2 = r7.E;
        r2 = r2 + -1;
        r7.a(r2);
        if (r0 == 0) goto L_0x00bd;
    L_0x00a3:
        r2 = -250; // 0xffffffffffffff06 float:NaN double:NaN;
        if (r1 >= r2) goto L_0x00ba;
    L_0x00a7:
        r1 = r7.E;
        r2 = r7.getChildCount();
        r2 = r2 + -1;
        if (r1 >= r2) goto L_0x00ba;
    L_0x00b1:
        r1 = r7.E;
        r1 = r1 + 1;
        r7.a(r1);
        if (r0 == 0) goto L_0x00bd;
    L_0x00ba:
        r7.b();
    L_0x00bd:
        r1 = r7.A;
        if (r1 == 0) goto L_0x00c9;
    L_0x00c1:
        r1 = r7.A;
        r1.recycle();
        r1 = 0;
        r7.A = r1;
    L_0x00c9:
        r7.i = r5;
        r7.u = r6;
        if (r0 == 0) goto L_0x0024;
    L_0x00cf:
        r1 = r7.s;
        if (r1 != 0) goto L_0x0024;
    L_0x00d3:
        r1 = G;
        r2 = 5;
        r1 = r1[r2];
        com.whatsapp.util.Log.w(r1);
        r7.i = r5;
        r7.u = r6;
        if (r0 == 0) goto L_0x0024;
    L_0x00e1:
        r1 = r7.s;
        if (r1 != 0) goto L_0x0024;
    L_0x00e5:
        r7.b(r8);
        if (r0 == 0) goto L_0x0024;
    L_0x00ea:
        r0 = G;
        r1 = 6;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GalleryView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    static Bitmap a(Bitmap bitmap, int i, int i2, Context context) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= i && height >= i2) {
            return bitmap;
        }
        int i3;
        int i4;
        int intValue = Integer.valueOf(G[2], 16).intValue();
        if (width < i) {
            i3 = i;
        } else {
            i3 = width;
        }
        if (height < i2) {
            i4 = i2;
        } else {
            i4 = height;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(intValue);
        canvas.drawBitmap(bitmap, ((float) (i - width)) / 2.0f, ((float) (i2 - height)) / 2.0f, null);
        return createBitmap;
    }

    private void b(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.u) {
            if (action == 0) {
                action = 1;
            } else {
                action = 0;
            }
            this.t = motionEvent.getX(action);
            this.D = motionEvent.getY(action);
            this.u = motionEvent.getPointerId(action);
            if (this.A != null) {
                this.A.clear();
            }
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.g != null) {
            this.g.b();
        }
        return false;
    }

    private void c() {
        if (this.c) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            this.j = new RectF(0.0f, 0.0f, (float) measuredWidth, (float) ((measuredHeight * 2) / 100));
            int scrollX = getScrollX() / getChildCount();
            this.m = new RectF((float) scrollX, 0.0f, (float) (scrollX + (measuredWidth / getChildCount())), (float) ((measuredHeight * 2) / 100));
            try {
                this.h = Bitmap.createBitmap(measuredWidth, (measuredHeight * 2) / 100, Config.ARGB_8888);
                this.q = new Canvas(this.h);
                this.q.drawRoundRect(this.j, 0.0f, 0.0f, this.o);
                this.q.drawRoundRect(this.m, 5.0f, 5.0f, this.l);
            } catch (OutOfMemoryError e) {
                Log.e(G[8] + e);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r5.s;
        if (r0 == 0) goto L_0x0009;
    L_0x0008:
        return r2;
    L_0x0009:
        r0 = r6.getAction();
        r4 = 2;
        if (r0 != r4) goto L_0x0014;
    L_0x0010:
        r4 = r5.i;
        if (r4 != 0) goto L_0x0008;
    L_0x0014:
        r4 = r5.A;
        if (r4 != 0) goto L_0x001e;
    L_0x0018:
        r4 = android.view.VelocityTracker.obtain();
        r5.A = r4;
    L_0x001e:
        r4 = r5.A;
        r4.addMovement(r6);
        switch(r0) {
            case 0: goto L_0x0031;
            case 1: goto L_0x0052;
            case 2: goto L_0x002c;
            case 3: goto L_0x0052;
            case 4: goto L_0x0026;
            case 5: goto L_0x0074;
            case 6: goto L_0x006f;
            default: goto L_0x0026;
        };
    L_0x0026:
        r0 = r5.i;
        if (r0 != 0) goto L_0x0008;
    L_0x002a:
        r2 = r1;
        goto L_0x0008;
    L_0x002c:
        r5.c(r6);
        if (r3 == 0) goto L_0x0026;
    L_0x0031:
        r0 = r6.getX();
        r4 = r6.getY();
        r5.t = r0;
        r5.D = r4;
        r5.k = r2;
        r0 = r6.getPointerId(r1);
        r5.u = r0;
        r0 = r5.b;
        r0 = r0.isFinished();
        if (r0 == 0) goto L_0x007d;
    L_0x004d:
        r0 = r1;
    L_0x004e:
        r5.i = r0;
        if (r3 == 0) goto L_0x0026;
    L_0x0052:
        r0 = G;
        r4 = 3;
        r0 = r0[r4];
        com.whatsapp.util.Log.w(r0);
        r0 = -1;
        r5.u = r0;
        r5.k = r1;
        r0 = r5.A;
        if (r0 == 0) goto L_0x006b;
    L_0x0063:
        r0 = r5.A;
        r0.recycle();
        r0 = 0;
        r5.A = r0;
    L_0x006b:
        r5.i = r1;
        if (r3 == 0) goto L_0x0026;
    L_0x006f:
        r5.b(r6);
        if (r3 == 0) goto L_0x0026;
    L_0x0074:
        r0 = G;
        r3 = 4;
        r0 = r0[r3];
        com.whatsapp.util.Log.e(r0);
        goto L_0x0026;
    L_0x007d:
        r0 = r2;
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GalleryView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    private void c(MotionEvent motionEvent) {
        int findPointerIndex = motionEvent.findPointerIndex(this.u);
        if (findPointerIndex != -1) {
            float x = motionEvent.getX(findPointerIndex);
            int abs = (int) Math.abs(motionEvent.getY(findPointerIndex) - this.D);
            if (((int) Math.abs(x - this.t)) > this.a) {
                findPointerIndex = 1;
            } else {
                boolean z = false;
            }
            if (abs > this.a) {
                int i = 1;
            } else {
                boolean z2 = false;
            }
            if (findPointerIndex != 0 || r3 != 0) {
                if (findPointerIndex != 0 && r3 == 0) {
                    this.i = 1;
                    this.t = x;
                }
                if (this.k) {
                    this.k = false;
                    View childAt = getChildAt(this.E);
                    if (childAt != null) {
                        childAt.cancelLongPress();
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r4 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r5.u;
        r1 = r6.findPointerIndex(r1);
        r2 = -1;
        if (r1 != r2) goto L_0x000d;
    L_0x000c:
        return;
    L_0x000d:
        r1 = r6.getX(r1);
        r2 = r5.t;
        r2 = r2 - r1;
        r2 = (int) r2;
        r5.t = r1;
        r1 = r5.g;
        if (r1 == 0) goto L_0x0020;
    L_0x001b:
        r1 = r5.g;
        r1.c();
    L_0x0020:
        if (r2 >= 0) goto L_0x003b;
    L_0x0022:
        r1 = r5.getScrollX();
        if (r1 <= 0) goto L_0x0036;
    L_0x0028:
        r1 = r5.getScrollX();
        r1 = -r1;
        r1 = java.lang.Math.max(r1, r2);
        r5.scrollBy(r1, r4);
        if (r0 == 0) goto L_0x000c;
    L_0x0036:
        r0 = r5.g;
        if (r0 == 0) goto L_0x000c;
    L_0x003a:
        goto L_0x000c;
    L_0x003b:
        if (r2 <= 0) goto L_0x0066;
    L_0x003d:
        r1 = r5.getChildCount();
        r1 = r1 + -1;
        r1 = r5.getChildAt(r1);
        r1 = r1.getRight();
        r3 = r5.getScrollX();
        r1 = r1 - r3;
        r3 = r5.getWidth();
        r1 = r1 - r3;
        if (r1 <= 0) goto L_0x0060;
    L_0x0057:
        r1 = java.lang.Math.min(r1, r2);
        r5.scrollBy(r1, r4);
        if (r0 == 0) goto L_0x0064;
    L_0x0060:
        r1 = r5.g;
        if (r1 == 0) goto L_0x0064;
    L_0x0064:
        if (r0 == 0) goto L_0x000c;
    L_0x0066:
        r5.awakenScrollBars();
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GalleryView.a(android.view.MotionEvent):void");
    }

    public GalleryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = -1;
        this.w = -1;
        this.i = 0;
        this.v = 0;
        d();
        this.z = new GestureDetector(new of(this));
        this.z.setOnDoubleTapListener(this);
    }

    private void d() {
        this.b = new Scroller(getContext(), f);
        this.E = this.v;
        this.F = new Paint();
        this.F.setDither(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.a = viewConfiguration.getScaledTouchSlop();
        this.n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.l = new Paint();
        this.l.setColor(-65536);
        this.l.setStyle(Style.FILL_AND_STROKE);
        this.o = new Paint();
        this.o.setColor(-7829368);
        this.o.setStyle(Style.FILL);
    }

    public void setEventCallback(_n _nVar) {
        this.g = _nVar;
    }

    static int b(GalleryView galleryView) {
        return galleryView.E;
    }

    public void setCurrentScreen(int i) {
        setCurrentScreen(i, this.y);
    }

    protected void onMeasure(int i, int i2) {
        float f;
        boolean z = DialogToastActivity.f;
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (!(MeasureSpec.getMode(i) == 1073741824 || i == 0)) {
            Log.e(G[0] + i);
        }
        int mode = MeasureSpec.getMode(i2);
        if (!(mode == 1073741824 || i2 == 0)) {
            Log.e(G[1] + i2);
        }
        int childCount = getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            int i4;
            if (this.c) {
                i4 = 98;
            } else {
                i4 = 100;
            }
            getChildAt(i3).measure(i, MeasureSpec.makeMeasureSpec((i4 * size2) / 100, mode));
            i4 = i3 + 1;
            if (z) {
                break;
            }
            i3 = i4;
        }
        if (this.e) {
            this.e = false;
            this.x = a(this.x, size, size2, getContext());
            this.C = this.x.getWidth();
            this.p = this.x.getHeight();
        }
        if (this.C > size) {
            f = ((float) ((childCount * size) - this.C)) / (((float) (childCount - 1)) * ((float) size));
        } else {
            f = 1.0f;
        }
        this.r = f;
        if (this.d != size) {
            this.d = size;
            scrollTo(this.E * size, 0);
            setScreenWidth(size);
        }
        c();
        invalidate();
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.g != null) {
            this.g.b(0);
        }
        return false;
    }

    public void setScreenWidth(int i) {
        if (i == 0) {
            i = getWidth();
        }
        this.y = i;
    }

    static {
        String[] strArr = new String[9];
        String str = "\u001f\t_]v\n\u0011EXv\u000fG\\_~\u001d\t@Da\u001dG\u0013Fz\u001c\u001c[|v\u0019\u001bFCv+\u0018VR)";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 120;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 51;
                        break;
                    case at.o /*3*/:
                        i3 = 49;
                        break;
                    default:
                        i3 = 19;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ">.\u0002\b\"AY\n";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "1\u0006GTa\u001b\rCEv\u001cHR\u0011g\u0017\u001dPY3\u001d\u001eV_gXE\u0013dC";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0019\u000bGX|\u00167C^z\u0016\u001cVCL\u001c\u0007D_";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001b\tFV{\fHR\u0011p\u0019\u0006PT\u007fX\u001c\\Dp\u0010HVGv\u0016\u001c";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0019\u000bZE|\u0016HC^a\u0011\u0006GTaX\f\\F}";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001f\t_]v\n\u0011lGz\u001d\u001f\u001c_|'\u000bFCa\u001d\u0006Gne\u0011\rD\u001e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u001f\t_]v\n\u0011\u001eGz\u001d\u001f\u001c^|\u0015R";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    G = strArr3;
                    f = new f6();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001f\t_]v\n\u0011EXv\u000fG\\_~\u001d\t@Da\u001dG\u0013Yv\u0011\u000f[E^\u001d\t@Da\u001d;CTpB";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void dispatchDraw(android.graphics.Canvas r8) {
        /*
        r7 = this;
        r1 = 0;
        r2 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r7.x;
        if (r0 == 0) goto L_0x0045;
    L_0x0008:
        r0 = r7.getScrollX();
        r0 = (float) r0;
        r4 = r7.r;
        r0 = r0 * r4;
        r4 = r7.C;
        r4 = (float) r4;
        r4 = r4 + r0;
        r5 = r7.getRight();
        r6 = r7.getLeft();
        r5 = r5 - r6;
        r5 = (float) r5;
        r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1));
        if (r4 >= 0) goto L_0x002f;
    L_0x0022:
        r0 = r7.getRight();
        r4 = r7.getLeft();
        r0 = r0 - r4;
        r4 = r7.C;
        r0 = r0 - r4;
        r0 = (float) r0;
    L_0x002f:
        r4 = r7.x;
        r5 = r7.getBottom();
        r6 = r7.getTop();
        r5 = r5 - r6;
        r6 = r7.p;
        r5 = r5 - r6;
        r5 = r5 / 2;
        r5 = (float) r5;
        r6 = r7.F;
        r8.drawBitmap(r4, r0, r5, r6);
    L_0x0045:
        r0 = r7.i;
        if (r0 == r2) goto L_0x00e6;
    L_0x0049:
        r0 = r7.w;
        r4 = -1;
        if (r0 != r4) goto L_0x00e6;
    L_0x004e:
        r0 = r2;
    L_0x004f:
        if (r0 == 0) goto L_0x0088;
    L_0x0051:
        r0 = r7.E;
        r0 = r7.getChildAt(r0);
        if (r0 == 0) goto L_0x0062;
    L_0x0059:
        r4 = r7.getDrawingTime();
        r7.drawChild(r8, r0, r4);
        if (r3 == 0) goto L_0x0086;
    L_0x0062:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = G;
        r5 = 7;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r7.E;
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r7.g;
        if (r0 == 0) goto L_0x0086;
    L_0x0081:
        r0 = r7.g;
        r0.a();
    L_0x0086:
        if (r3 == 0) goto L_0x00c9;
    L_0x0088:
        r4 = r7.getDrawingTime();
        r0 = r7.w;
        if (r0 < 0) goto L_0x00b7;
    L_0x0090:
        r0 = r7.w;
        r6 = r7.getChildCount();
        if (r0 >= r6) goto L_0x00b7;
    L_0x0098:
        r0 = r7.E;
        r6 = r7.w;
        r0 = r0 - r6;
        r0 = java.lang.Math.abs(r0);
        if (r0 != r2) goto L_0x00b7;
    L_0x00a3:
        r0 = r7.E;
        r0 = r7.getChildAt(r0);
        r7.drawChild(r8, r0, r4);
        r0 = r7.w;
        r0 = r7.getChildAt(r0);
        r7.drawChild(r8, r0, r4);
        if (r3 == 0) goto L_0x00c9;
    L_0x00b7:
        r2 = r7.getChildCount();
        r0 = r1;
    L_0x00bc:
        if (r0 >= r2) goto L_0x00c9;
    L_0x00be:
        r1 = r7.getChildAt(r0);
        r7.drawChild(r8, r1, r4);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x00bc;
    L_0x00c9:
        r0 = r7.c;
        if (r0 == 0) goto L_0x00e5;
    L_0x00cd:
        r7.c();
        r0 = r7.h;
        r1 = r7.getScrollX();
        r1 = (float) r1;
        r2 = r7.getMeasuredHeight();
        r2 = r2 * 98;
        r2 = r2 / 100;
        r2 = (float) r2;
        r3 = r7.F;
        r8.drawBitmap(r0, r1, r2, r3);
    L_0x00e5:
        return;
    L_0x00e6:
        r0 = r1;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.GalleryView.dispatchDraw(android.graphics.Canvas):void");
    }

    static int a(GalleryView galleryView) {
        return galleryView.i;
    }

    public void setCurrentScreen(int i, int i2) {
        setScreenWidth(i2);
        if (!this.b.isFinished()) {
            this.b.abortAnimation();
        }
        this.E = Math.max(0, Math.min(i, getChildCount()));
        scrollTo(this.E * i2, 0);
        if (this.g != null) {
            this.g.a(i);
        }
        invalidate();
    }

    public boolean dispatchUnhandledMove(View view, int i) {
        if (i == 17) {
            if (a() > 0) {
                a(a() - 1);
                return true;
            }
        } else if (i == 66 && a() < getChildCount() - 1) {
            a(a() + 1);
            return true;
        }
        return super.dispatchUnhandledMove(view, i);
    }

    public void computeScroll() {
        if (this.b.computeScrollOffset()) {
            scrollTo(this.b.getCurrX(), this.b.getCurrY());
            postInvalidate();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        if (this.w != -1) {
            this.E = Math.max(0, Math.min(this.w, getChildCount() - 1));
            this.w = -1;
        }
    }

    public GalleryView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(int i) {
        a(i, false);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    private void a(int i, boolean z) {
        int i2;
        int i3;
        if (i != this.E) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.w = i;
        View focusedChild = getFocusedChild();
        if (!(focusedChild == null || r0 == 0 || focusedChild != getChildAt(this.E))) {
            focusedChild.clearFocus();
        }
        int width = (getWidth() * i) - getScrollX();
        Scroller scroller = this.b;
        int scrollX = getScrollX();
        if (z) {
            i2 = 0;
        } else {
            i2 = Math.abs(width);
        }
        scroller.startScroll(scrollX, 0, width, 0, i2);
        if (this.g != null) {
            this.g.a(i);
        }
        invalidate();
    }

    public int a() {
        return this.E;
    }
}
