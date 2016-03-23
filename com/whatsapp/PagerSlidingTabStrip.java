package com.whatsapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

public class PagerSlidingTabStrip extends HorizontalScrollView {
    private static final String E;
    private static final int[] g;
    private boolean A;
    private int B;
    private LinearLayout C;
    private int D;
    private float a;
    private Paint b;
    private int c;
    public OnPageChangeListener d;
    private ViewPager e;
    private int f;
    private boolean h;
    private final e9 i;
    private int j;
    private int k;
    private LayoutParams l;
    private int m;
    private int n;
    private int o;
    private int p;
    private Paint q;
    private LayoutParams r;
    private int s;
    private Typeface t;
    private int u;
    private int v;
    private int w;
    private int x;
    private Locale y;
    private int z;

    protected void onDraw(Canvas canvas) {
        boolean z = DialogToastActivity.f;
        try {
            super.onDraw(canvas);
            if (!isInEditMode()) {
                if (this.o != 0) {
                    int height = getHeight();
                    this.b.setColor(this.j);
                    View childAt = this.C.getChildAt(this.s);
                    float left = (float) childAt.getLeft();
                    float right = (float) childAt.getRight();
                    try {
                        if (this.a > 0.0f && this.s < this.o - 1) {
                            childAt = this.C.getChildAt(this.s + 1);
                            float left2 = (float) childAt.getLeft();
                            left = (left * (1.0f - this.a)) + (left2 * this.a);
                            right = (((float) childAt.getRight()) * this.a) + ((1.0f - this.a) * right);
                        }
                        canvas.drawRect(left, (float) (height - this.B), right, (float) height, this.b);
                        this.b.setColor(this.v);
                        canvas.drawRect(0.0f, (float) (height - this.x), (float) this.C.getWidth(), (float) height, this.b);
                        this.q.setColor(this.c);
                        int i = 0;
                        while (i < this.o - 1) {
                            childAt = this.C.getChildAt(i);
                            canvas.drawLine((float) childAt.getRight(), (float) this.f, (float) childAt.getRight(), (float) (height - this.f), this.q);
                            int i2 = i + 1;
                            if (!z) {
                                i = i2;
                            } else {
                                return;
                            }
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private void b(int i, int i2) {
        try {
            if (this.o != 0) {
                int left = this.C.getChildAt(i).getLeft() + i2;
                if (i > 0 || i2 > 0) {
                    left -= this.k;
                }
                try {
                    if (left != this.p) {
                        this.p = left;
                        scrollTo(left, 0);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new e9(this, null);
        this.s = 0;
        this.a = 0.0f;
        this.j = -10066330;
        this.v = 436207616;
        this.c = 436207616;
        this.h = false;
        this.A = true;
        this.k = 52;
        this.B = 8;
        this.x = 2;
        this.f = 12;
        this.u = 24;
        this.z = 1;
        this.n = 12;
        this.w = -10066330;
        this.t = null;
        this.D = 1;
        this.p = 0;
        this.m = 2130837617;
        setFillViewport(true);
        setWillNotDraw(false);
        this.C = new LinearLayout(context);
        this.C.setOrientation(0);
        this.C.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.C);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.k = (int) TypedValue.applyDimension(1, (float) this.k, displayMetrics);
        this.B = (int) TypedValue.applyDimension(1, (float) this.B, displayMetrics);
        this.x = (int) TypedValue.applyDimension(1, (float) this.x, displayMetrics);
        this.f = (int) TypedValue.applyDimension(1, (float) this.f, displayMetrics);
        this.u = (int) TypedValue.applyDimension(1, (float) this.u, displayMetrics);
        this.z = (int) TypedValue.applyDimension(1, (float) this.z, displayMetrics);
        this.n = (int) TypedValue.applyDimension(2, (float) this.n, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g);
        this.n = obtainStyledAttributes.getDimensionPixelSize(0, this.n);
        this.w = obtainStyledAttributes.getColor(1, this.w);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, arj.PagerSlidingTabStrip);
        try {
            this.j = obtainStyledAttributes.getColor(0, this.j);
            this.v = obtainStyledAttributes.getColor(1, this.v);
            this.c = obtainStyledAttributes.getColor(2, this.c);
            this.B = obtainStyledAttributes.getDimensionPixelSize(3, this.B);
            this.x = obtainStyledAttributes.getDimensionPixelSize(4, this.x);
            this.f = obtainStyledAttributes.getDimensionPixelSize(5, this.f);
            this.u = obtainStyledAttributes.getDimensionPixelSize(6, this.u);
            this.m = obtainStyledAttributes.getResourceId(8, this.m);
            this.h = obtainStyledAttributes.getBoolean(9, this.h);
            this.k = obtainStyledAttributes.getDimensionPixelSize(7, this.k);
            this.A = obtainStyledAttributes.getBoolean(10, this.A);
            obtainStyledAttributes.recycle();
            this.b = new Paint();
            this.b.setAntiAlias(true);
            this.b.setStyle(Style.FILL);
            this.q = new Paint();
            this.q.setAntiAlias(true);
            this.q.setStrokeWidth((float) this.z);
            this.l = new LayoutParams(-2, -1);
            this.r = new LayoutParams(0, -1, 1.0f);
            if (this.y == null) {
                this.y = getResources().getConfiguration().locale;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable com_whatsapp_aov = new aov(super.onSaveInstanceState());
        com_whatsapp_aov.a = this.s;
        return com_whatsapp_aov;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r5 = this;
        r0 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r1 = r0;
    L_0x0004:
        r0 = r5.o;
        if (r1 >= r0) goto L_0x0051;
    L_0x0008:
        r0 = r5.C;
        r0 = r0.getChildAt(r1);
        r3 = r5.m;
        r0.setBackgroundResource(r3);
        r3 = r0 instanceof android.widget.TextView;
        if (r3 == 0) goto L_0x004d;
    L_0x0017:
        r0 = (android.widget.TextView) r0;
        r3 = 0;
        r4 = r5.n;	 Catch:{ IllegalStateException -> 0x0052 }
        r4 = (float) r4;	 Catch:{ IllegalStateException -> 0x0052 }
        r0.setTextSize(r3, r4);	 Catch:{ IllegalStateException -> 0x0052 }
        r3 = r5.t;	 Catch:{ IllegalStateException -> 0x0052 }
        r4 = r5.D;	 Catch:{ IllegalStateException -> 0x0052 }
        r0.setTypeface(r3, r4);	 Catch:{ IllegalStateException -> 0x0052 }
        r3 = r5.w;	 Catch:{ IllegalStateException -> 0x0052 }
        r0.setTextColor(r3);	 Catch:{ IllegalStateException -> 0x0052 }
        r3 = r5.A;	 Catch:{ IllegalStateException -> 0x0052 }
        if (r3 == 0) goto L_0x004d;
    L_0x0030:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0054 }
        r4 = 14;
        if (r3 < r4) goto L_0x003c;
    L_0x0036:
        r3 = 1;
        r0.setAllCaps(r3);	 Catch:{ IllegalStateException -> 0x0056 }
        if (r2 == 0) goto L_0x004d;
    L_0x003c:
        r3 = r0.getText();	 Catch:{ IllegalStateException -> 0x0056 }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x0056 }
        r4 = r5.y;	 Catch:{ IllegalStateException -> 0x0056 }
        r3 = r3.toUpperCase(r4);	 Catch:{ IllegalStateException -> 0x0056 }
        r0.setText(r3);	 Catch:{ IllegalStateException -> 0x0056 }
    L_0x004d:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0058;
    L_0x0051:
        return;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;
    L_0x0058:
        r1 = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PagerSlidingTabStrip.a():void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        aov com_whatsapp_aov = (aov) parcelable;
        super.onRestoreInstanceState(com_whatsapp_aov.getSuperState());
        this.s = com_whatsapp_aov.a;
        requestLayout();
    }

    static float a(PagerSlidingTabStrip pagerSlidingTabStrip, float f) {
        pagerSlidingTabStrip.a = f;
        return f;
    }

    static void a(PagerSlidingTabStrip pagerSlidingTabStrip, int i, int i2) {
        pagerSlidingTabStrip.b(i, i2);
    }

    static ViewPager a(PagerSlidingTabStrip pagerSlidingTabStrip) {
        return pagerSlidingTabStrip.e;
    }

    static int b(PagerSlidingTabStrip pagerSlidingTabStrip) {
        return pagerSlidingTabStrip.s;
    }

    public void setViewPager(ViewPager viewPager) {
        try {
            this.e = viewPager;
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException(E);
            }
            viewPager.setOnPageChangeListener(this.i);
            b();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void a(int i, View view) {
        try {
            ViewGroup.LayoutParams layoutParams;
            view.setFocusable(true);
            view.setOnClickListener(new yz(this, i));
            view.setPadding(this.u, 0, this.u, 0);
            LinearLayout linearLayout = this.C;
            if (this.h) {
                layoutParams = this.r;
            } else {
                layoutParams = this.l;
            }
            linearLayout.addView(view, i, layoutParams);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
        r3 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r3.C;
        r0.removeAllViews();
        r0 = r3.e;
        r0 = r0.getAdapter();
        r0 = r0.getCount();
        r3.o = r0;
        r0 = 0;
        r1 = r0;
    L_0x0015:
        r0 = r3.o;
        if (r1 >= r0) goto L_0x0064;
    L_0x0019:
        r0 = r3.e;	 Catch:{ IllegalStateException -> 0x0074 }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x0074 }
        r0 = r0 instanceof com.whatsapp.g1;	 Catch:{ IllegalStateException -> 0x0074 }
        if (r0 == 0) goto L_0x0034;
    L_0x0023:
        r0 = r3.e;	 Catch:{ IllegalStateException -> 0x0076 }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x0076 }
        r0 = (com.whatsapp.g1) r0;	 Catch:{ IllegalStateException -> 0x0076 }
        r0 = r0.a(r1);	 Catch:{ IllegalStateException -> 0x0076 }
        r3.a(r1, r0);	 Catch:{ IllegalStateException -> 0x0076 }
        if (r2 == 0) goto L_0x0060;
    L_0x0034:
        r0 = r3.e;	 Catch:{ IllegalStateException -> 0x0078 }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x0078 }
        r0 = r0 instanceof com.whatsapp.alp;	 Catch:{ IllegalStateException -> 0x0078 }
        if (r0 == 0) goto L_0x004f;
    L_0x003e:
        r0 = r3.e;	 Catch:{ IllegalStateException -> 0x007a }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x007a }
        r0 = (com.whatsapp.alp) r0;	 Catch:{ IllegalStateException -> 0x007a }
        r0 = r0.a(r1);	 Catch:{ IllegalStateException -> 0x007a }
        r3.a(r1, r0);	 Catch:{ IllegalStateException -> 0x007a }
        if (r2 == 0) goto L_0x0060;
    L_0x004f:
        r0 = r3.e;	 Catch:{ IllegalStateException -> 0x007a }
        r0 = r0.getAdapter();	 Catch:{ IllegalStateException -> 0x007a }
        r0 = r0.getPageTitle(r1);	 Catch:{ IllegalStateException -> 0x007a }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x007a }
        r3.a(r1, r0);	 Catch:{ IllegalStateException -> 0x007a }
    L_0x0060:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x007c;
    L_0x0064:
        r3.a();
        r0 = r3.getViewTreeObserver();
        r1 = new com.whatsapp.a56;
        r1.<init>(r3);
        r0.addOnGlobalLayoutListener(r1);
        return;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r1 = r0;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PagerSlidingTabStrip.b():void");
    }

    static {
        char[] toCharArray = "\u0000A<=k7O<8\u001b2G<9\u001b8G-jS7^<jZ2I)>^$\b0$H\"I7)^x".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 86;
                    break;
                case at.g /*1*/:
                    i2 = 40;
                    break;
                case at.i /*2*/:
                    i2 = 89;
                    break;
                case at.o /*3*/:
                    i2 = 74;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        E = new String(cArr).intern();
        g = new int[]{16842901, 16842904};
    }

    static LinearLayout c(PagerSlidingTabStrip pagerSlidingTabStrip) {
        return pagerSlidingTabStrip.C;
    }

    private void a(int i, String str) {
        View textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setSingleLine();
        a(i, textView);
    }

    static int a(PagerSlidingTabStrip pagerSlidingTabStrip, int i) {
        pagerSlidingTabStrip.s = i;
        return i;
    }

    public void setTextColorResource(int i) {
        this.w = getResources().getColor(i);
        a();
    }

    private void a(int i, int i2) {
        View imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        a(i, imageButton);
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.d = onPageChangeListener;
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
