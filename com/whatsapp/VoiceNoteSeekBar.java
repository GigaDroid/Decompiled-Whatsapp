package com.whatsapp;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class VoiceNoteSeekBar extends View {
    private float a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private int f;
    private final Rect g;
    private final Paint h;
    private OnSeekBarChangeListener i;
    private int j;
    private int k;
    private int l;

    private void a(Context context, AttributeSet attributeSet) {
        this.j = ViewConfiguration.get(context).getScaledTouchSlop();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, arj.VoiceNoteSeekBar);
            this.f = obtainStyledAttributes.getDimensionPixelSize(0, this.f);
            this.k = obtainStyledAttributes.getDimensionPixelSize(1, this.k);
            this.l = obtainStyledAttributes.getInteger(2, this.l);
            this.c = obtainStyledAttributes.getInteger(3, this.c);
            obtainStyledAttributes.recycle();
        }
    }

    public VoiceNoteSeekBar(Context context) {
        super(context);
        this.f = 20;
        this.k = 10;
        this.l = -21217;
        this.c = 536870912;
        this.h = new Paint(1);
        this.g = new Rect();
        a(context, null);
    }

    private void f() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void setProgressColor(int i) {
        this.l = i;
        invalidate();
    }

    public void setMax(int i) {
        this.d = i;
    }

    public int b() {
        return this.e;
    }

    public void setOnSeekBarChangeListener(OnSeekBarChangeListener onSeekBarChangeListener) {
        this.i = onSeekBarChangeListener;
    }

    void e() {
        this.b = false;
        if (this.i != null) {
            this.i.onStopTrackingTouch(null);
        }
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = 20;
        this.k = 10;
        this.l = -21217;
        this.c = 536870912;
        this.h = new Paint(1);
        this.g = new Rect();
        a(context, attributeSet);
    }

    public VoiceNoteSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = 20;
        this.k = 10;
        this.l = -21217;
        this.c = 536870912;
        this.h = new Paint(1);
        this.g = new Rect();
        a(context, attributeSet);
    }

    public int d() {
        return this.d;
    }

    private void a(MotionEvent motionEvent) {
        float f = 1.0f;
        boolean z = DialogToastActivity.f;
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i = (width - paddingLeft) - paddingRight;
        int x = (int) motionEvent.getX();
        if (App.av) {
            if (x <= width - paddingRight || z) {
                if (x >= paddingLeft || z) {
                    float f2 = ((float) ((i - x) + paddingLeft)) / ((float) i);
                    if (!z) {
                        f = f2;
                    }
                }
                setProgress((int) ((f * ((float) d())) + 0.0f));
            }
            f = 0.0f;
            setProgress((int) ((f * ((float) d())) + 0.0f));
        }
        if (x >= paddingLeft || z) {
            if (x <= width - paddingRight || z) {
                f = ((float) (x - paddingLeft)) / ((float) i);
            }
            setProgress((int) ((f * ((float) d())) + 0.0f));
        }
        f = 0.0f;
        setProgress((int) ((f * ((float) d())) + 0.0f));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r1 = 1;
        r0 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = r5.isEnabled();
        if (r3 != 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        r3 = r6.getAction();
        switch(r3) {
            case 0: goto L_0x0014;
            case 1: goto L_0x005f;
            case 2: goto L_0x0033;
            case 3: goto L_0x007c;
            default: goto L_0x0012;
        };
    L_0x0012:
        r0 = r1;
        goto L_0x000a;
    L_0x0014:
        r3 = r5.a();
        if (r3 == 0) goto L_0x0022;
    L_0x001a:
        r3 = r6.getX();
        r5.a = r3;
        if (r2 == 0) goto L_0x0012;
    L_0x0022:
        r5.setPressed(r1);
        r5.invalidate();
        r5.c();
        r5.a(r6);
        r5.f();
        if (r2 == 0) goto L_0x0012;
    L_0x0033:
        r3 = r5.b;
        if (r3 == 0) goto L_0x003c;
    L_0x0037:
        r5.a(r6);
        if (r2 == 0) goto L_0x0012;
    L_0x003c:
        r3 = r6.getX();
        r4 = r5.a;
        r3 = r3 - r4;
        r3 = java.lang.Math.abs(r3);
        r4 = r5.j;
        r4 = (float) r4;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x005d;
    L_0x004e:
        r5.setPressed(r1);
        r5.invalidate();
        r5.c();
        r5.a(r6);
        r5.f();
    L_0x005d:
        if (r2 == 0) goto L_0x0012;
    L_0x005f:
        r3 = r5.b;
        if (r3 == 0) goto L_0x006e;
    L_0x0063:
        r5.a(r6);
        r5.e();
        r5.setPressed(r0);
        if (r2 == 0) goto L_0x0077;
    L_0x006e:
        r5.c();
        r5.a(r6);
        r5.e();
    L_0x0077:
        r5.invalidate();
        if (r2 == 0) goto L_0x0012;
    L_0x007c:
        r2 = r5.b;
        if (r2 == 0) goto L_0x0086;
    L_0x0080:
        r5.e();
        r5.setPressed(r0);
    L_0x0086:
        r5.invalidate();
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceNoteSeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected synchronized void onDraw(android.graphics.Canvas r13) {
        /*
        r12 = this;
        monitor-enter(r12);
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ all -> 0x00cb }
        r3 = r12.getWidth();	 Catch:{ all -> 0x00cb }
        r4 = r12.getPaddingLeft();	 Catch:{ all -> 0x00cb }
        r5 = r12.getPaddingRight();	 Catch:{ all -> 0x00cb }
        r0 = r3 - r4;
        r6 = r0 - r5;
        r0 = r12.isPressed();	 Catch:{ all -> 0x00cb }
        if (r0 == 0) goto L_0x00c1;
    L_0x0019:
        r0 = r12.f;	 Catch:{ all -> 0x00cb }
        r0 = r0 * 3;
        r0 = r0 / 4;
        r1 = r0;
    L_0x0020:
        r0 = r12.d();	 Catch:{ all -> 0x00cb }
        if (r0 <= 0) goto L_0x00c8;
    L_0x0026:
        r7 = r12.b();	 Catch:{ all -> 0x00cb }
        r7 = (float) r7;	 Catch:{ all -> 0x00cb }
        r0 = (float) r0;	 Catch:{ all -> 0x00cb }
        r0 = r7 / r0;
    L_0x002e:
        r7 = r1 * 2;
        r6 = r6 - r7;
        r6 = (float) r6;	 Catch:{ all -> 0x00cb }
        r0 = r0 * r6;
        r0 = (int) r0;	 Catch:{ all -> 0x00cb }
        r0 = r0 + r1;
        r6 = com.whatsapp.App.a1();	 Catch:{ all -> 0x00cb }
        if (r6 == 0) goto L_0x003e;
    L_0x003b:
        r0 = r0 + r4;
        if (r2 == 0) goto L_0x0041;
    L_0x003e:
        r0 = r3 - r0;
        r0 = r0 - r5;
    L_0x0041:
        r6 = r12.getPaddingTop();	 Catch:{ all -> 0x00cb }
        r7 = r12.getHeight();	 Catch:{ all -> 0x00cb }
        r8 = r12.getPaddingTop();	 Catch:{ all -> 0x00cb }
        r7 = r7 - r8;
        r8 = r12.getPaddingBottom();	 Catch:{ all -> 0x00cb }
        r7 = r7 - r8;
        r7 = r7 / 2;
        r6 = r6 + r7;
        r7 = r12.h;	 Catch:{ all -> 0x00cb }
        r8 = r12.c;	 Catch:{ all -> 0x00cb }
        r7.setColor(r8);	 Catch:{ all -> 0x00cb }
        r7 = r12.h;	 Catch:{ all -> 0x00cb }
        r8 = android.graphics.Paint.Style.FILL;	 Catch:{ all -> 0x00cb }
        r7.setStyle(r8);	 Catch:{ all -> 0x00cb }
        r7 = r12.g;	 Catch:{ all -> 0x00cb }
        r8 = 0;
        r9 = r12.k;	 Catch:{ all -> 0x00cb }
        r9 = r9 / 2;
        r9 = r6 - r9;
        r10 = r12.getWidth();	 Catch:{ all -> 0x00cb }
        r11 = r12.k;	 Catch:{ all -> 0x00cb }
        r11 = r11 / 2;
        r11 = r11 + r6;
        r7.set(r8, r9, r10, r11);	 Catch:{ all -> 0x00cb }
        r7 = r12.g;	 Catch:{ all -> 0x00cb }
        r8 = r12.h;	 Catch:{ all -> 0x00cb }
        r13.drawRect(r7, r8);	 Catch:{ all -> 0x00cb }
        r7 = r12.h;	 Catch:{ all -> 0x00cb }
        r8 = r12.l;	 Catch:{ all -> 0x00cb }
        r7.setColor(r8);	 Catch:{ all -> 0x00cb }
        r7 = com.whatsapp.App.a1();	 Catch:{ all -> 0x00cb }
        if (r7 == 0) goto L_0x009f;
    L_0x008d:
        r7 = r12.g;	 Catch:{ all -> 0x00cb }
        r8 = r12.k;	 Catch:{ all -> 0x00cb }
        r8 = r8 / 2;
        r8 = r6 - r8;
        r9 = r12.k;	 Catch:{ all -> 0x00cb }
        r9 = r9 / 2;
        r9 = r9 + r6;
        r7.set(r4, r8, r0, r9);	 Catch:{ all -> 0x00cb }
        if (r2 == 0) goto L_0x00b0;
    L_0x009f:
        r2 = r12.g;	 Catch:{ all -> 0x00cb }
        r4 = r12.k;	 Catch:{ all -> 0x00cb }
        r4 = r4 / 2;
        r4 = r6 - r4;
        r3 = r3 - r5;
        r5 = r12.k;	 Catch:{ all -> 0x00cb }
        r5 = r5 / 2;
        r5 = r5 + r6;
        r2.set(r0, r4, r3, r5);	 Catch:{ all -> 0x00cb }
    L_0x00b0:
        r2 = r12.g;	 Catch:{ all -> 0x00cb }
        r3 = r12.h;	 Catch:{ all -> 0x00cb }
        r13.drawRect(r2, r3);	 Catch:{ all -> 0x00cb }
        r0 = (float) r0;	 Catch:{ all -> 0x00cb }
        r2 = (float) r6;	 Catch:{ all -> 0x00cb }
        r1 = (float) r1;	 Catch:{ all -> 0x00cb }
        r3 = r12.h;	 Catch:{ all -> 0x00cb }
        r13.drawCircle(r0, r2, r1, r3);	 Catch:{ all -> 0x00cb }
        monitor-exit(r12);
        return;
    L_0x00c1:
        r0 = r12.f;	 Catch:{ all -> 0x00cb }
        r0 = r0 / 2;
        r1 = r0;
        goto L_0x0020;
    L_0x00c8:
        r0 = 0;
        goto L_0x002e;
    L_0x00cb:
        r0 = move-exception;
        monitor-exit(r12);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VoiceNoteSeekBar.onDraw(android.graphics.Canvas):void");
    }

    private boolean a() {
        boolean z = DialogToastActivity.f;
        if (VERSION.SDK_INT < 14) {
            return true;
        }
        ViewParent parent = getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            if (!((ViewGroup) parent).shouldDelayChildPressedState()) {
                parent = parent.getParent();
                if (z) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public void setProgress(int i) {
        if (this.e != i) {
            this.e = i;
            invalidate();
        }
    }

    void c() {
        this.b = true;
        if (this.i != null) {
            this.i.onStartTrackingTouch(null);
        }
    }
}
