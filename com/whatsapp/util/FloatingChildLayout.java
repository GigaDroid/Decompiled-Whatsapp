package com.whatsapp.util;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewAnimationUtils;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class FloatingChildLayout extends FrameLayout {
    private static boolean h;
    private static final String z;
    private int a;
    private int b;
    private OnTouchListener c;
    private ValueAnimator d;
    private Rect e;
    private boolean f;
    private int g;
    private int i;
    private View j;

    public void d() {
        if (this.b == 0) {
            this.b = 1;
            a();
            a((View) this, new ae(this));
        }
    }

    private static void a(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    static int a(FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.a;
    }

    public static void a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.getViewTreeObserver().addOnDrawListener(new a9(view, runnable));
            if (Log.h == 0) {
                return;
            }
        }
        view.getViewTreeObserver().addOnPreDrawListener(new cg(view, runnable));
    }

    public void setChildTargetScreen(Rect rect) {
        this.e = rect;
        requestLayout();
    }

    public void setBackground(Drawable drawable) {
        Log.e(z);
    }

    static int c(FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.i;
    }

    private Rect f() {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect(this.e);
        rect2.offset(-rect.left, -rect.top);
        return rect2;
    }

    private void a(boolean z, Runnable runnable) {
        float width;
        float f;
        Interpolator accelerateInterpolator;
        float f2 = 1.0f;
        if (z) {
            width = ((float) this.e.width()) / ((float) this.j.getWidth());
        } else {
            width = 1.0f;
        }
        if (z) {
            f = 1.0f;
        } else {
            f = ((float) this.e.width()) / ((float) this.j.getWidth());
        }
        if (h) {
            int i;
            if (z) {
                i = 17563652;
            } else {
                i = 17563653;
            }
            if (this.f && VERSION.SDK_INT >= 21) {
                int sqrt = (int) Math.sqrt((double) ((this.j.getWidth() * this.j.getWidth()) + (this.j.getHeight() * this.j.getHeight())));
                int sqrt2 = (int) Math.sqrt((double) ((this.e.width() * this.e.width()) + (this.e.height() * this.e.height())));
                if (!z) {
                    int i2 = sqrt2;
                    sqrt2 = sqrt;
                    sqrt = i2;
                }
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this.j, this.j.getWidth() / 2, this.j.getHeight() / 2, (float) sqrt, (float) sqrt2);
                createCircularReveal.setDuration((long) this.i);
                createCircularReveal.start();
            }
            if (!z) {
                this.j.setScaleX(f);
                this.j.setScaleY(f);
                this.j.setAlpha(0.0f);
            }
            this.j.setPivotX((float) (this.e.left - this.j.getLeft()));
            this.j.setPivotY((float) (this.e.top - this.j.getTop()));
            ViewPropertyAnimator scaleY = this.j.animate().setDuration((long) this.i).setInterpolator(AnimationUtils.loadInterpolator(getContext(), i)).scaleX(width).scaleY(width);
            if (z) {
                f2 = 0.0f;
            }
            scaleY.alpha(f2).setListener(new al(this, z, runnable));
            if (Log.h == 0) {
                return;
            }
        }
        Animation scaleAnimation = new ScaleAnimation(f, width, f, width, 0, (float) (this.e.centerX() - this.j.getLeft()), 0, (float) (this.e.centerY() - this.j.getTop()));
        scaleAnimation.setDuration((long) this.i);
        scaleAnimation.setFillAfter(true);
        if (z) {
            accelerateInterpolator = new AccelerateInterpolator();
        } else {
            accelerateInterpolator = new DecelerateInterpolator();
        }
        scaleAnimation.setInterpolator(accelerateInterpolator);
        scaleAnimation.setAnimationListener(new c(this, z, runnable));
        this.j.startAnimation(scaleAnimation);
    }

    public void b(Runnable runnable) {
        if (this.a == 0) {
            this.a = 1;
            a(false, runnable);
        }
    }

    protected void onFinishInflate() {
        this.j = findViewById(16908290);
        this.j.setDuplicateParentStateEnabled(true);
        if (h) {
            this.j.setScaleX(0.5f);
            this.j.setScaleY(0.5f);
            this.j.setAlpha(0.0f);
        }
    }

    public void setBackgroundColorAlpha(int i) {
        setBackgroundColor(i << 24);
    }

    private void a() {
        this.j.invalidate();
    }

    static ValueAnimator d(FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.d;
    }

    public boolean a(Runnable runnable) {
        if (this.a != 1 && this.a != 2) {
            return false;
        }
        this.a = 3;
        a();
        a(true, runnable);
        return true;
    }

    public void b() {
        int i = Log.h;
        if (this.b == 1) {
            this.b = 3;
            if (h) {
                if (this.d.isRunning()) {
                    this.d.reverse();
                    if (i == 0) {
                        return;
                    }
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{127, 0});
                ofInt.addUpdateListener(new br(this));
                ofInt.setDuration((long) this.i).start();
                if (i == 0) {
                    return;
                }
            }
            Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration((long) this.i);
            alphaAnimation.setFillAfter(true);
            startAnimation(alphaAnimation);
        }
    }

    static {
        boolean z;
        char[] toCharArray = "\u001b\u0002\fB!_\u001e\u0007\u0011\u0017\u001e\u000e\t\u0002'\u0010\u0018\f\u0001}VAB\f!_\u0004\u0011E8\u001e\u0003\u0003\u00020\u001bM\u000b\u000b!\u001a\u001f\f\u00049\u0013\u0014".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 127;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case at.i /*2*/:
                    i2 = 98;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        if (VERSION.SDK_INT >= 12) {
            z = true;
        } else {
            z = false;
        }
        h = z;
    }

    static int a(FloatingChildLayout floatingChildLayout, int i) {
        floatingChildLayout.a = i;
        return i;
    }

    public void setCircularReveal(boolean z) {
        this.f = z;
        if (VERSION.SDK_INT >= 21) {
            this.i = getResources().getInteger(17694721);
        }
    }

    public void setOnOutsideTouchListener(OnTouchListener onTouchListener) {
        this.c = onTouchListener;
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Rect();
        this.b = 0;
        this.d = null;
        this.a = 0;
        Resources resources = getResources();
        this.g = resources.getDimensionPixelOffset(2131427536);
        this.i = resources.getInteger(17694720);
        if (h) {
            this.d = ValueAnimator.ofInt(new int[]{0, 127});
            this.d.addUpdateListener(new b4(this));
        }
        super.setBackgroundDrawable(new ColorDrawable(0));
    }

    private static int a(int i, int i2, int i3) {
        return i2 > i3 ? (i3 - i2) / 2 : Math.min(Math.max(i, 0), i3 - i2);
    }

    public boolean e() {
        return this.a == 2;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.j;
        Rect f = f();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (this.g != -1) {
            a(view, a((getWidth() - measuredWidth) / 2, measuredWidth, getWidth()), a(this.g, measuredHeight, getHeight()));
            if (Log.h == 0) {
                return;
            }
        }
        a(view, a(f.centerX() - (measuredWidth / 2), measuredWidth, getWidth()), a(f.centerY() - Math.round(((float) measuredHeight) * 0.75f), measuredHeight, getHeight()));
    }

    static boolean c() {
        return h;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.c != null ? this.c.onTouch(this, motionEvent) : false;
    }

    public static void b(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new c4(view, runnable));
    }

    static View b(FloatingChildLayout floatingChildLayout) {
        return floatingChildLayout.j;
    }
}
