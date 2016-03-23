package com.whatsapp;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

public class AnswerCallView extends View {
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int[] w;
    private Drawable a;
    private Paint e;
    private float f;
    private Drawable g;
    private int h;
    private Path i;
    private boolean j;
    private a5r k;
    private float l;
    private Drawable m;
    private Path n;
    private af o;
    private int p;
    private boolean q;
    private boolean r;
    private float s;
    private Drawable t;
    private boolean u;
    private Path v;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r13) {
        /*
        r12 = this;
        r1 = 0;
        r11 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        super.onDraw(r13);
        r13.drawColor(r1);
        r5 = r12.getWidth();
        r6 = r12.getHeight();
        r0 = r12.r;
        if (r0 == 0) goto L_0x01e1;
    L_0x0016:
        r0 = r5 - r6;
        if (r4 == 0) goto L_0x002a;
    L_0x001a:
        r2 = r12.j;
        if (r2 == 0) goto L_0x002a;
    L_0x001e:
        r0 = r12.l;
        r2 = r12.s;
        r0 = r0 - r2;
        r0 = (int) r0;
        r2 = r5 - r6;
        r0 = java.lang.Math.min(r0, r2);
    L_0x002a:
        r2 = r12.u;
        if (r2 == 0) goto L_0x01de;
    L_0x002e:
        r2 = r5 - r6;
        if (r4 == 0) goto L_0x0042;
    L_0x0032:
        r3 = r12.q;
        if (r3 == 0) goto L_0x0042;
    L_0x0036:
        r2 = r12.s;
        r3 = r12.l;
        r2 = r2 - r3;
        r2 = (int) r2;
        r3 = r5 - r6;
        r2 = java.lang.Math.min(r2, r3);
    L_0x0042:
        r3 = r12.q;
        if (r3 != 0) goto L_0x00af;
    L_0x0046:
        r3 = r12.j;
        if (r3 != 0) goto L_0x00af;
    L_0x004a:
        r3 = r12.r;
        if (r3 != 0) goto L_0x00af;
    L_0x004e:
        r3 = r12.u;
        if (r3 != 0) goto L_0x00af;
    L_0x0052:
        r13.save();
        r3 = r6 / 4;
        r3 = r6 - r3;
        r3 = (float) r3;
        r7 = r12.f;
        r8 = r6 * 5;
        r8 = r8 / 2;
        r8 = r5 - r8;
        r8 = (float) r8;
        r7 = r7 * r8;
        r3 = r3 + r7;
        r13.translate(r3, r11);
    L_0x0068:
        r3 = w;
        r3 = r3.length;
        if (r1 >= r3) goto L_0x00a5;
    L_0x006d:
        r3 = r12.e;
        r7 = d;
        r3.setColor(r7);
        r3 = w;
        r3 = r3[r1];
        r3 = 255 - r3;
        r7 = r12.f;
        r8 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1));
        if (r7 <= 0) goto L_0x008d;
    L_0x0083:
        r3 = r3 * 5;
        r3 = (float) r3;
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r8 = r12.f;
        r7 = r7 - r8;
        r3 = r3 * r7;
        r3 = (int) r3;
    L_0x008d:
        r7 = r12.e;
        r7.setAlpha(r3);
        r3 = r12.n;
        r7 = r12.e;
        r13.drawPath(r3, r7);
        r3 = r6 * -2;
        r3 = r3 / 5;
        r3 = (float) r3;
        r13.translate(r3, r11);
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x0068;
    L_0x00a5:
        r13.restore();
        r1 = r12.e;
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r1.setAlpha(r3);
    L_0x00af:
        r1 = r12.q;
        if (r1 != 0) goto L_0x0141;
    L_0x00b3:
        r1 = r12.u;
        if (r1 != 0) goto L_0x0141;
    L_0x00b7:
        r1 = r12.p;
        if (r1 == r0) goto L_0x00fc;
    L_0x00bb:
        r12.p = r0;
        r1 = r12.v;
        r1.rewind();
        r1 = r12.v;
        r1.moveTo(r11, r11);
        r1 = r12.v;
        r3 = r6 + r0;
        r3 = (float) r3;
        r1.lineTo(r3, r11);
        r1 = r12.v;
        r3 = r6 / 4;
        r3 = r3 + r6;
        r3 = r3 + r0;
        r3 = (float) r3;
        r7 = r6 / 2;
        r7 = (float) r7;
        r1.lineTo(r3, r7);
        r1 = r12.v;
        r3 = r6 + r0;
        r3 = (float) r3;
        r7 = (float) r6;
        r1.lineTo(r3, r7);
        r1 = r12.v;
        r3 = (float) r6;
        r1.lineTo(r11, r3);
        r1 = r12.v;
        r1.lineTo(r11, r11);
        r1 = r12.v;
        r1.close();
        r1 = r12.v;
        r3 = android.graphics.Path.FillType.WINDING;
        r1.setFillType(r3);
    L_0x00fc:
        r1 = r12.j;
        if (r1 != 0) goto L_0x0104;
    L_0x0100:
        r1 = r12.r;
        if (r1 == 0) goto L_0x010f;
    L_0x0104:
        r1 = r12.e;
        r3 = b;
        r1.setColor(r3);
        r1 = r12.a;
        if (r4 == 0) goto L_0x0118;
    L_0x010f:
        r1 = r12.e;
        r3 = d;
        r1.setColor(r3);
        r1 = r12.t;
    L_0x0118:
        r3 = r12.e;
        r7 = android.graphics.Paint.Style.FILL;
        r3.setStyle(r7);
        r3 = r12.v;
        r7 = r12.e;
        r13.drawPath(r3, r7);
        r3 = r1.getIntrinsicHeight();
        r7 = r1.getIntrinsicWidth();
        r8 = r6 - r7;
        r8 = r8 / 2;
        r9 = r6 - r3;
        r9 = r9 / 2;
        r10 = r8 + r0;
        r7 = r7 + r8;
        r0 = r0 + r7;
        r3 = r3 + r9;
        r1.setBounds(r10, r9, r0, r3);
        r1.draw(r13);
    L_0x0141:
        r0 = r12.j;
        if (r0 != 0) goto L_0x01dd;
    L_0x0145:
        r0 = r12.r;
        if (r0 != 0) goto L_0x01dd;
    L_0x0149:
        r0 = r12.h;
        if (r0 == r2) goto L_0x0195;
    L_0x014d:
        r0 = r12.i;
        r0.rewind();
        r0 = r12.i;
        r1 = (float) r5;
        r0.moveTo(r1, r11);
        r0 = r12.i;
        r1 = r5 - r6;
        r1 = r1 - r2;
        r1 = (float) r1;
        r0.lineTo(r1, r11);
        r0 = r12.i;
        r1 = r5 - r6;
        r3 = r6 / 4;
        r1 = r1 - r3;
        r1 = r1 - r2;
        r1 = (float) r1;
        r3 = r6 / 2;
        r3 = (float) r3;
        r0.lineTo(r1, r3);
        r0 = r12.i;
        r1 = r5 - r6;
        r1 = r1 - r2;
        r1 = (float) r1;
        r3 = (float) r6;
        r0.lineTo(r1, r3);
        r0 = r12.i;
        r1 = (float) r5;
        r3 = (float) r6;
        r0.lineTo(r1, r3);
        r0 = r12.i;
        r1 = (float) r5;
        r0.lineTo(r1, r11);
        r0 = r12.i;
        r0.close();
        r0 = r12.i;
        r1 = android.graphics.Path.FillType.WINDING;
        r0.setFillType(r1);
        r12.h = r2;
    L_0x0195:
        r0 = r12.q;
        if (r0 != 0) goto L_0x019d;
    L_0x0199:
        r0 = r12.u;
        if (r0 == 0) goto L_0x01a8;
    L_0x019d:
        r0 = r12.e;
        r1 = c;
        r0.setColor(r1);
        r0 = r12.m;
        if (r4 == 0) goto L_0x01b1;
    L_0x01a8:
        r0 = r12.e;
        r1 = d;
        r0.setColor(r1);
        r0 = r12.g;
    L_0x01b1:
        r1 = r12.e;
        r3 = android.graphics.Paint.Style.FILL;
        r1.setStyle(r3);
        r1 = r12.i;
        r3 = r12.e;
        r13.drawPath(r1, r3);
        r1 = r0.getIntrinsicHeight();
        r3 = r0.getIntrinsicWidth();
        r4 = r6 + r3;
        r4 = r4 / 2;
        r4 = r5 - r4;
        r5 = r6 - r1;
        r5 = r5 / 2;
        r6 = r4 - r2;
        r3 = r3 + r4;
        r2 = r3 - r2;
        r1 = r1 + r5;
        r0.setBounds(r6, r5, r2, r1);
        r0.draw(r13);
    L_0x01dd:
        return;
    L_0x01de:
        r2 = r1;
        goto L_0x0032;
    L_0x01e1:
        r0 = r1;
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AnswerCallView.onDraw(android.graphics.Canvas):void");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o = new af(this, null);
        this.o.setDuration(800);
        this.o.setRepeatCount(-1);
        this.o.setInterpolator(new DecelerateInterpolator());
        startAnimation(this.o);
    }

    public void setAnswerCallListener(a5r com_whatsapp_a5r) {
        this.k = com_whatsapp_a5r;
    }

    static float a(AnswerCallView answerCallView, float f) {
        answerCallView.f = f;
        return f;
    }

    protected void onVisibilityChanged(View view, int i) {
        if (getVisibility() == 0) {
            if (getAnimation() == null && this.o != null) {
                startAnimation(this.o);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            return;
        }
        clearAnimation();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = android.os.Build.VERSION.SDK_INT;
        r4 = 8;
        if (r0 < r4) goto L_0x0014;
    L_0x000a:
        r0 = r6.getActionIndex();
        r0 = r6.getX(r0);
        if (r3 == 0) goto L_0x0018;
    L_0x0014:
        r0 = r6.getX();
    L_0x0018:
        r4 = r5.j;
        if (r4 == 0) goto L_0x0038;
    L_0x001c:
        r4 = r5.getWidth();
        r4 = r4 / 2;
        r4 = (float) r4;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0038;
    L_0x0027:
        r4 = r5.k;
        if (r4 == 0) goto L_0x0066;
    L_0x002b:
        r4 = r5.r;
        if (r4 != 0) goto L_0x0066;
    L_0x002f:
        r4 = r5.k;
        r4.a();
        r5.r = r1;
        if (r3 == 0) goto L_0x0066;
    L_0x0038:
        r4 = r5.q;
        if (r4 == 0) goto L_0x0058;
    L_0x003c:
        r4 = r5.getWidth();
        r4 = r4 / 2;
        r4 = (float) r4;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0058;
    L_0x0047:
        r0 = r5.k;
        if (r0 == 0) goto L_0x0066;
    L_0x004b:
        r0 = r5.u;
        if (r0 != 0) goto L_0x0066;
    L_0x004f:
        r0 = r5.k;
        r0.b();
        r5.u = r1;
        if (r3 == 0) goto L_0x0066;
    L_0x0058:
        r0 = r5.k;
        if (r0 == 0) goto L_0x0066;
    L_0x005c:
        r3 = r5.k;
        r0 = r5.q;
        if (r0 != 0) goto L_0x006b;
    L_0x0062:
        r0 = r1;
    L_0x0063:
        r3.a(r0);
    L_0x0066:
        r5.j = r2;
        r5.q = r2;
        return;
    L_0x006b:
        r0 = r2;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AnswerCallView.b(android.view.MotionEvent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(android.view.MotionEvent r3) {
        /*
        r2 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 8;
        if (r0 < r1) goto L_0x0012;
    L_0x0006:
        r0 = r3.getActionIndex();
        r0 = r3.getX(r0);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r0 = r3.getX();
    L_0x0016:
        r2.l = r0;
        r2.invalidate();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AnswerCallView.c(android.view.MotionEvent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(8)
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r2 = 0;
        r1 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = android.os.Build.VERSION.SDK_INT;
        r4 = 8;
        if (r0 < r4) goto L_0x0010;
    L_0x000a:
        r0 = r6.getActionMasked();
        if (r3 == 0) goto L_0x0014;
    L_0x0010:
        r0 = r6.getAction();
    L_0x0014:
        switch(r0) {
            case 0: goto L_0x0025;
            case 1: goto L_0x0032;
            case 2: goto L_0x002d;
            case 3: goto L_0x003a;
            case 4: goto L_0x0017;
            case 5: goto L_0x0025;
            case 6: goto L_0x0032;
            default: goto L_0x0017;
        };
    L_0x0017:
        r0 = r2;
    L_0x0018:
        r5.invalidate();
        if (r0 != 0) goto L_0x0023;
    L_0x001d:
        r0 = super.onTouchEvent(r6);
        if (r0 == 0) goto L_0x0024;
    L_0x0023:
        r2 = r1;
    L_0x0024:
        return r2;
    L_0x0025:
        r5.d(r6);
        r5.c(r6);
        if (r3 == 0) goto L_0x0042;
    L_0x002d:
        r5.c(r6);
        if (r3 == 0) goto L_0x0042;
    L_0x0032:
        r5.c(r6);
        r5.b(r6);
        if (r3 == 0) goto L_0x0042;
    L_0x003a:
        r5.c(r6);
        r5.a(r6);
        r0 = r1;
        goto L_0x0018;
    L_0x0042:
        r0 = r1;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AnswerCallView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void a(MotionEvent motionEvent) {
        this.j = false;
        this.q = false;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int height = getHeight();
        this.n.rewind();
        this.n.moveTo(0.0f, 0.0f);
        this.n.lineTo((float) (height / 4), 0.0f);
        this.n.lineTo((float) (height / 2), (float) (height / 2));
        this.n.lineTo((float) (height / 4), (float) height);
        this.n.lineTo(0.0f, (float) height);
        this.n.lineTo((float) (height / 4), (float) (height / 2));
        this.n.close();
        this.n.setFillType(FillType.WINDING);
    }

    static {
        d = App.z().getResources().getColor(2131624057);
        b = App.z().getResources().getColor(2131623973);
        c = App.z().getResources().getColor(2131623974);
        w = new int[]{0, 70, 130};
    }

    public AnswerCallView(Context context) {
        this(context, null);
    }

    public void a() {
        this.r = false;
        this.u = false;
    }

    public AnswerCallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Paint(1);
        this.v = new Path();
        this.i = new Path();
        this.n = new Path();
        this.p = -1;
        this.h = -1;
        this.t = context.getResources().getDrawable(2130839468);
        this.a = context.getResources().getDrawable(2130839467);
        this.g = context.getResources().getDrawable(2130839470);
        this.m = context.getResources().getDrawable(2130839469);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(android.view.MotionEvent r5) {
        /*
        r4 = this;
        r3 = 1;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 8;
        if (r0 < r1) goto L_0x0013;
    L_0x0007:
        r0 = r5.getActionIndex();
        r0 = r5.getX(r0);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0017;
    L_0x0013:
        r0 = r5.getX();
    L_0x0017:
        r1 = 0;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x002b;
    L_0x001c:
        r1 = r4.getHeight();
        r1 = r1 * 5;
        r1 = r1 / 4;
        r1 = (float) r1;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 >= 0) goto L_0x002b;
    L_0x0029:
        r4.j = r3;
    L_0x002b:
        r1 = r4.getWidth();
        r1 = (float) r1;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 >= 0) goto L_0x0048;
    L_0x0034:
        r1 = r4.getWidth();
        r2 = r4.getHeight();
        r2 = r2 * 5;
        r2 = r2 / 4;
        r1 = r1 - r2;
        r1 = (float) r1;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0048;
    L_0x0046:
        r4.q = r3;
    L_0x0048:
        r4.s = r0;
        r4.l = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AnswerCallView.d(android.view.MotionEvent):void");
    }
}
