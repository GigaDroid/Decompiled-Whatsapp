package com.whatsapp.gdrive;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class GoogleDriveRestoreAnimationView extends View {
    private boolean a;
    private Drawable b;
    private int c;
    private Paint d;
    private bh e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    private boolean i;
    private float j;
    private final DecelerateInterpolator k;
    private Resources l;

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new DecelerateInterpolator();
        a(context);
    }

    public GoogleDriveRestoreAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new DecelerateInterpolator();
        a(context);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = new bh(this, null);
        this.e.setDuration(2000);
        this.e.setRepeatCount(-1);
        this.e.setInterpolator(new LinearInterpolator());
        this.e.setFillAfter(true);
        startAnimation(this.e);
    }

    private static float a(float f, float f2, float f3) {
        if (f3 <= f) {
            return 0.0f;
        }
        if (f3 >= f2) {
            return 1.0f;
        }
        return (f3 - f) / (f2 - f);
    }

    @TargetApi(8)
    public void a() {
        this.i = true;
        if (this.e != null) {
            this.e.cancel();
        }
    }

    private void a(Context context) {
        int intrinsicWidth;
        this.l = context.getResources();
        this.b = this.l.getDrawable(2130839571);
        if (this.b != null) {
            intrinsicWidth = this.b.getIntrinsicWidth();
        } else {
            intrinsicWidth = 0;
        }
        this.c = intrinsicWidth;
        this.g = this.l.getDrawable(2130839570);
        this.d = new Paint();
    }

    static float a(GoogleDriveRestoreAnimationView googleDriveRestoreAnimationView, float f) {
        googleDriveRestoreAnimationView.j = f;
        return f;
    }

    private void b() {
        this.e = new bh(this, null);
        this.e.setDuration(2000);
        this.e.setRepeatCount(-1);
        this.e.setInterpolator(new LinearInterpolator());
        this.e.setFillAfter(true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(8)
    public void onDraw(android.graphics.Canvas r29) {
        /*
        r28 = this;
        r7 = com.whatsapp.gdrive.GoogleDriveService.c;
        r8 = r28.getWidth();
        r4 = r28.getHeight();
        r5 = r8 / 2;
        r5 = (float) r5;
        r4 = r4 / 2;
        r4 = (float) r4;
        r0 = r29;
        r0.translate(r5, r4);
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r28;
        r4 = r0.b;
        r4 = r4.getIntrinsicWidth();
        r4 = (float) r4;
        r4 = r4 * r6;
        r9 = (int) r4;
        r4 = -r8;
        r4 = r4 / 2;
        r5 = r9 / 2;
        r4 = r4 + r5;
        r5 = (float) r4;
        r4 = 0;
        r0 = r28;
        r10 = r0.a;
        if (r10 == 0) goto L_0x00c1;
    L_0x0030:
        r0 = r28;
        r5 = r0.h;
        if (r5 != 0) goto L_0x00bc;
    L_0x0036:
        r0 = r28;
        r5 = r0.j;
        r6 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x0094;
    L_0x0041:
        r0 = r28;
        r5 = r0.k;
        r0 = r28;
        r6 = r0.j;
        r10 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r6 = r6 / r10;
        r5 = r5.getInterpolation(r6);
        r0 = r28;
        r6 = r0.b;
        r6 = r6.getIntrinsicWidth();
        r0 = r28;
        r10 = r0.c;
        r10 = (float) r10;
        r0 = r28;
        r11 = r0.b;
        r11 = r11.getIntrinsicWidth();
        r11 = (float) r11;
        r10 = r10 / r11;
        r6 = (float) r6;
        r0 = r28;
        r11 = r0.c;
        r11 = (float) r11;
        r6 = r6 - r11;
        r6 = r6 * r5;
        r0 = r28;
        r11 = r0.b;
        r11 = r11.getIntrinsicWidth();
        r11 = (float) r11;
        r6 = r6 / r11;
        r6 = r6 + r10;
        r9 = r9 / 2;
        r10 = r8 / 2;
        r9 = r9 - r10;
        r9 = (float) r9;
        r10 = (float) r8;
        r0 = r28;
        r11 = r0.b;
        r11 = r11.getIntrinsicWidth();
        r11 = (float) r11;
        r11 = r11 * r6;
        r10 = r10 - r11;
        r5 = r5 * r10;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r5 / r10;
        r5 = r5 + r9;
        if (r7 == 0) goto L_0x00c1;
    L_0x0094:
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 0;
        r0 = r28;
        r4 = r0.k;
        r0 = r28;
        r9 = r0.j;
        r10 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r9 = r9 - r10;
        r4 = r4.getInterpolation(r9);
        r9 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = r4 * r9;
        r0 = r28;
        r9 = r0.j;
        r10 = 1065185444; // 0x3f7d70a4 float:0.99 double:5.262715343E-315;
        r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
        if (r9 < 0) goto L_0x00ba;
    L_0x00b5:
        r9 = 1;
        r0 = r28;
        r0.h = r9;
    L_0x00ba:
        if (r7 == 0) goto L_0x00c1;
    L_0x00bc:
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 0;
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
    L_0x00c1:
        r0 = r28;
        r9 = r0.b;
        r9 = r9.getIntrinsicWidth();
        r9 = (float) r9;
        r9 = r9 * r6;
        r9 = (int) r9;
        r0 = r28;
        r10 = r0.b;
        r10 = r10.getIntrinsicHeight();
        r10 = (float) r10;
        r6 = r6 * r10;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = r6 / r10;
        r6 = (int) r6;
        r0 = r28;
        r10 = r0.b;
        r11 = r9 / 2;
        r11 = (float) r11;
        r11 = r5 - r11;
        r11 = (int) r11;
        r12 = -r6;
        r13 = r9 / 2;
        r13 = (float) r13;
        r5 = r5 + r13;
        r5 = (int) r5;
        r10.setBounds(r11, r12, r5, r6);
        r0 = r28;
        r5 = r0.b;
        r0 = r29;
        r5.draw(r0);
        r10 = (double) r4;
        r12 = 0;
        r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r5 <= 0) goto L_0x0127;
    L_0x00fd:
        r0 = r28;
        r5 = r0.f;
        r5 = r5.getIntrinsicWidth();
        r5 = (float) r5;
        r5 = r5 * r4;
        r0 = r28;
        r6 = r0.f;
        r6 = r6.getIntrinsicHeight();
        r6 = (float) r6;
        r4 = r4 * r6;
        r0 = r28;
        r6 = r0.f;
        r10 = (int) r5;
        r10 = -r10;
        r11 = (int) r4;
        r11 = -r11;
        r5 = (int) r5;
        r4 = (int) r4;
        r6.setBounds(r10, r11, r5, r4);
        r0 = r28;
        r4 = r0.f;
        r0 = r29;
        r4.draw(r0);
    L_0x0127:
        r0 = r28;
        r4 = r0.a;
        if (r4 == 0) goto L_0x012e;
    L_0x012d:
        return;
    L_0x012e:
        r0 = r28;
        r4 = r0.g;
        r4 = r4.getIntrinsicWidth();
        r0 = r28;
        r5 = r0.g;
        r5 = r5.getIntrinsicHeight();
        r5 = r5 / 2;
        r0 = r28;
        r6 = r0.g;
        r10 = r8 / 2;
        r10 = r10 - r4;
        r11 = -r5;
        r12 = r8 / 2;
        r6.setBounds(r10, r11, r12, r5);
        r0 = r28;
        r5 = r0.g;
        r0 = r29;
        r5.draw(r0);
        r5 = (float) r8;
        r5 = -r5;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r5 / r6;
        r6 = (float) r9;
        r5 = r5 + r6;
        r10 = (double) r5;
        r12 = 0;
        r5 = (float) r8;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r5 / r6;
        r4 = (float) r4;
        r4 = r5 - r4;
        r4 = (double) r4;
        r8 = 0;
        r14 = r10 - r4;
        r16 = r10 - r4;
        r14 = r14 * r16;
        r16 = r12 - r8;
        r8 = r12 - r8;
        r8 = r8 * r16;
        r8 = r8 + r14;
        r8 = java.lang.Math.sqrt(r8);
        r6 = (float) r8;
        r8 = (double) r6;
        r14 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r16 = 4599526299433487565; // 0x3fd4cccccccccccd float:-1.07374184E8 double:0.325;
        r16 = java.lang.Math.sin(r16);
        r14 = r14 * r16;
        r8 = r8 / r14;
        r4 = r4 + r10;
        r10 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r10 = r4 / r10;
        r4 = 4599526299433487565; // 0x3fd4cccccccccccd float:-1.07374184E8 double:0.325;
        r4 = java.lang.Math.cos(r4);
        r4 = r4 * r8;
        r12 = r12 + r4;
        r0 = r28;
        r4 = r0.d;
        r5 = 1;
        r4.setAntiAlias(r5);
        r4 = 0;
        r5 = r4;
    L_0x01a5:
        r4 = 12;
        if (r5 >= r4) goto L_0x02e3;
    L_0x01a9:
        r14 = -4623935809413835653; // 0xbfd47ae147ae147b float:89128.96 double:-0.32;
        r16 = 4604029899060858061; // 0x3fe4cccccccccccd float:-1.07374184E8 double:0.65;
        r0 = (double) r5;
        r18 = r0;
        r16 = r16 * r18;
        r18 = 4622945017495814144; // 0x4028000000000000 float:0.0 double:12.0;
        r16 = r16 / r18;
        r14 = r14 + r16;
        r16 = -4623935809413835653; // 0xbfd47ae147ae147b float:89128.96 double:-0.32;
        r18 = 4604029899060858061; // 0x3fe4cccccccccccd float:-1.07374184E8 double:0.65;
        r4 = r5 + 1;
        r0 = (double) r4;
        r20 = r0;
        r18 = r18 * r20;
        r20 = 4622945017495814144; // 0x4028000000000000 float:0.0 double:12.0;
        r18 = r18 / r20;
        r16 = r16 + r18;
        r4 = 0;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r28;
        r0 = r0.j;
        r18 = r0;
        r14 = (float) r14;
        r0 = r16;
        r15 = (float) r0;
        r0 = r18;
        r4 = a(r4, r6, r0, r14, r15);
        r14 = (double) r4;
        r16 = java.lang.Math.sin(r14);
        r16 = r16 * r8;
        r16 = r16 + r10;
        r14 = java.lang.Math.cos(r14);
        r14 = r14 * r8;
        r14 = r12 - r14;
        r4 = 1053609164; // 0x3ecccccc float:0.39999998 double:5.20552092E-315;
        r18 = 4609753056924675352; // 0x3ff921fb54442d18 float:3.37028055E12 double:1.5707963267948966;
        r0 = (double) r5;
        r20 = r0;
        r18 = r18 * r20;
        r20 = 4622945017495814144; // 0x4028000000000000 float:0.0 double:12.0;
        r18 = r18 / r20;
        r18 = java.lang.Math.sin(r18);
        r20 = 4609434218613702656; // 0x3ff8000000000000 float:0.0 double:1.5;
        r0 = r28;
        r6 = r0.j;
        r22 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r6 = r6 - r22;
        r0 = (double) r6;
        r22 = r0;
        r20 = r20 * r22;
        r0 = (double) r4;
        r22 = r0;
        r20 = r20 / r22;
        r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1));
        if (r4 > 0) goto L_0x02f8;
    L_0x0226:
        r22 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r22 = r20 - r22;
        r4 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1));
        if (r4 < 0) goto L_0x02f8;
    L_0x022e:
        r4 = 1;
    L_0x022f:
        r0 = r28;
        r6 = r0.d;
        r22 = r28.getResources();
        r23 = 2131624019; // 0x7f0e0053 float:1.8875206E38 double:1.0531621976E-314;
        r22 = r22.getColor(r23);
        r0 = r22;
        r6.setColor(r0);
        r0 = r28;
        r6 = r0.d;
        r22 = android.graphics.Paint.Style.FILL;
        r0 = r22;
        r6.setStyle(r0);
        r0 = r16;
        r6 = (float) r0;
        r0 = (float) r14;
        r22 = r0;
        r23 = 1076552008; // 0x402ae148 float:2.67 double:5.31887363E-315;
        r24 = com.whatsapp.a4d.a();
        r0 = r24;
        r0 = r0.g;
        r24 = r0;
        r23 = r23 * r24;
        r0 = r28;
        r0 = r0.d;
        r24 = r0;
        r0 = r29;
        r1 = r22;
        r2 = r23;
        r3 = r24;
        r0.drawCircle(r6, r1, r2, r3);
        r0 = r28;
        r6 = r0.j;
        r22 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r6 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1));
        if (r6 < 0) goto L_0x02df;
    L_0x027f:
        r0 = r28;
        r6 = r0.j;
        r22 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1));
        if (r6 >= 0) goto L_0x02df;
    L_0x0289:
        if (r4 == 0) goto L_0x02df;
    L_0x028b:
        r22 = 4634204016564240384; // 0x4050000000000000 float:0.0 double:64.0;
        r24 = 4652218415073722368; // 0x4090000000000000 float:0.0 double:1024.0;
        r26 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r20 = r20 - r26;
        r18 = r18 - r20;
        r18 = r18 * r24;
        r18 = r18 + r22;
        r0 = r18;
        r4 = (int) r0;
        r6 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        if (r4 < r6) goto L_0x02a2;
    L_0x02a0:
        r4 = 255; // 0xff float:3.57E-43 double:1.26E-321;
    L_0x02a2:
        r0 = r28;
        r6 = r0.d;
        r18 = r28.getResources();
        r19 = 2131624020; // 0x7f0e0054 float:1.8875208E38 double:1.053162198E-314;
        r18 = r18.getColor(r19);
        r0 = r18;
        r6.setColor(r0);
        r0 = r28;
        r6 = r0.d;
        r18 = android.graphics.Paint.Style.FILL;
        r0 = r18;
        r6.setStyle(r0);
        r0 = r28;
        r6 = r0.d;
        r6.setAlpha(r4);
        r0 = r16;
        r4 = (float) r0;
        r6 = (float) r14;
        r14 = 1076552008; // 0x402ae148 float:2.67 double:5.31887363E-315;
        r15 = com.whatsapp.a4d.a();
        r15 = r15.g;
        r14 = r14 * r15;
        r0 = r28;
        r15 = r0.d;
        r0 = r29;
        r0.drawCircle(r4, r6, r14, r15);
    L_0x02df:
        r4 = r5 + 1;
        if (r7 == 0) goto L_0x02fb;
    L_0x02e3:
        r0 = r28;
        r4 = r0.i;
        if (r4 == 0) goto L_0x012d;
    L_0x02e9:
        r0 = r28;
        r4 = r0.e;
        if (r4 == 0) goto L_0x012d;
    L_0x02ef:
        r0 = r28;
        r4 = r0.e;
        r4.cancel();
        goto L_0x012d;
    L_0x02f8:
        r4 = 0;
        goto L_0x022f;
    L_0x02fb:
        r5 = r4;
        goto L_0x01a5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveRestoreAnimationView.onDraw(android.graphics.Canvas):void");
    }

    public void d() {
        if (this.e == null) {
            b();
        }
        this.i = false;
        startAnimation(this.e);
    }

    public GoogleDriveRestoreAnimationView(Context context) {
        super(context);
        this.k = new DecelerateInterpolator();
        a(context);
    }

    private static float a(float f, float f2, float f3, float f4, float f5) {
        return ((f5 - f4) * a(f, f2, f3)) + f4;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    protected void onVisibilityChanged(@NonNull View view, int i) {
        if (getVisibility() == 0) {
            if (getAnimation() == null && this.e != null) {
                startAnimation(this.e);
                if (!GoogleDriveService.c) {
                    return;
                }
            }
            return;
        }
        clearAnimation();
    }

    public void c() {
        if (this.e == null) {
            b();
        }
        clearAnimation();
        this.b = this.l.getDrawable(2130839573);
        this.f = this.l.getDrawable(2130839574);
        this.e.setDuration(800);
        startAnimation(this.e);
        this.a = true;
    }
}
