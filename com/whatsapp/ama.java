package com.whatsapp;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

@TargetApi(21)
public class ama extends Visibility {
    public static int a;
    private static long c;
    private final Rect b;

    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return a(view, view.getTranslationX(), view.getTranslationY(), (float) (this.b.centerX() - rect.centerX()), (float) (this.b.centerY() - rect.centerY()), false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.animation.Animator a(android.view.View r17, float r18, float r19, float r20, float r21, boolean r22) {
        /*
        r16 = this;
        r6 = a;
        r17.setTranslationX(r18);
        r0 = r17;
        r1 = r19;
        r0.setTranslationY(r1);
        r4 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1));
        if (r4 != 0) goto L_0x0016;
    L_0x0010:
        r4 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1));
        if (r4 != 0) goto L_0x0016;
    L_0x0014:
        r4 = 0;
    L_0x0015:
        return r4;
    L_0x0016:
        r7 = r17.getMeasuredWidth();
        r8 = r17.getMeasuredHeight();
        r0 = r16;
        r4 = r0.b;
        r4 = r4.width();
        r4 = (float) r4;
        r5 = (float) r7;
        r4 = r4 / r5;
        r0 = r16;
        r5 = r0.b;
        r5 = r5.height();
        r5 = (float) r5;
        r9 = (float) r8;
        r5 = r5 / r9;
        r5 = java.lang.Math.max(r4, r5);
        r4 = r16.getPathMotion();
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r4 = r4.getPath(r0, r1, r2, r3);
        r9 = android.view.View.TRANSLATION_X;
        r10 = android.view.View.TRANSLATION_Y;
        r0 = r17;
        r9 = android.animation.ObjectAnimator.ofFloat(r0, r9, r10, r4);
        r10 = android.view.View.SCALE_X;
        r4 = 2;
        r11 = new float[r4];
        r12 = 0;
        if (r22 == 0) goto L_0x015b;
    L_0x005a:
        r4 = r5;
    L_0x005b:
        r11[r12] = r4;
        r12 = 1;
        if (r22 == 0) goto L_0x015f;
    L_0x0060:
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0062:
        r11[r12] = r4;
        r0 = r17;
        r10 = android.animation.ObjectAnimator.ofFloat(r0, r10, r11);
        r11 = android.view.View.SCALE_Y;
        r4 = 2;
        r12 = new float[r4];
        r13 = 0;
        if (r22 == 0) goto L_0x0162;
    L_0x0072:
        r4 = r5;
    L_0x0073:
        r12[r13] = r4;
        r4 = 1;
        if (r22 == 0) goto L_0x007a;
    L_0x0078:
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x007a:
        r12[r4] = r5;
        r0 = r17;
        r4 = android.animation.ObjectAnimator.ofFloat(r0, r11, r12);
        r5 = new com.whatsapp.aou;
        r11 = r7 / 2;
        r12 = r8 / 2;
        r13 = r8 / 2;
        r13 = (float) r13;
        r14 = r8 / 2;
        r14 = (float) r14;
        r0 = r17;
        r11 = android.view.ViewAnimationUtils.createCircularReveal(r0, r11, r12, r13, r14);
        r5.<init>(r11);
        r11 = 0;
        r0 = r17;
        r0.setAlpha(r11);
        r11 = new com.whatsapp.axf;
        r0 = r16;
        r1 = r17;
        r2 = r22;
        r11.<init>(r0, r1, r2);
        r5.addListener(r11);
        r11 = new android.animation.AnimatorSet;
        r11.<init>();
        r12 = 4;
        r12 = new android.animation.Animator[r12];
        r13 = 0;
        r12[r13] = r9;
        r9 = 1;
        r12[r9] = r5;
        r5 = 2;
        r12[r5] = r10;
        r5 = 3;
        r12[r5] = r4;
        r11.playTogether(r12);
        r4 = r16.getInterpolator();
        r11.setInterpolator(r4);
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r12 = c;
        r4 = r4 * r12;
        r11.setDuration(r4);
        if (r22 == 0) goto L_0x00ee;
    L_0x00d3:
        r4 = r8 / 2;
        r5 = (float) r4;
        r4 = r7 * r7;
        r9 = r8 * r8;
        r4 = r4 + r9;
        r12 = (double) r4;
        r12 = java.lang.Math.sqrt(r12);
        r14 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r12 = r12 / r14;
        r4 = (float) r12;
        r9 = new android.view.animation.AccelerateInterpolator;
        r9.<init>();
        r11.setInterpolator(r9);
        if (r6 == 0) goto L_0x0107;
    L_0x00ee:
        r4 = r7 * r7;
        r5 = r8 * r8;
        r4 = r4 + r5;
        r4 = (double) r4;
        r4 = java.lang.Math.sqrt(r4);
        r12 = 4611686018427387904; // 0x4000000000000000 float:0.0 double:2.0;
        r4 = r4 / r12;
        r5 = (float) r4;
        r4 = r8 / 2;
        r4 = (float) r4;
        r9 = new android.view.animation.DecelerateInterpolator;
        r9.<init>();
        r11.setInterpolator(r9);
    L_0x0107:
        r9 = new com.whatsapp.aou;
        r7 = r7 / 2;
        r8 = r8 / 2;
        r0 = r17;
        r4 = android.view.ViewAnimationUtils.createCircularReveal(r0, r7, r8, r5, r4);
        r9.<init>(r4);
        r4 = new com.whatsapp.fa;
        r0 = r16;
        r1 = r17;
        r2 = r22;
        r4.<init>(r0, r1, r2);
        r9.addListener(r4);
        r4 = 100;
        r12 = c;
        r4 = r4 * r12;
        r9.setDuration(r4);
        r4 = new android.animation.AnimatorSet;
        r4.<init>();
        if (r22 == 0) goto L_0x0147;
    L_0x0133:
        r5 = new android.view.animation.DecelerateInterpolator;
        r5.<init>();
        r9.setInterpolator(r5);
        r4.play(r11);
        r5 = r4.play(r9);
        r5.after(r11);
        if (r6 == 0) goto L_0x0015;
    L_0x0147:
        r5 = new android.view.animation.AccelerateInterpolator;
        r5.<init>();
        r9.setInterpolator(r5);
        r4.play(r9);
        r5 = r4.play(r11);
        r5.after(r9);
        goto L_0x0015;
    L_0x015b:
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x005b;
    L_0x015f:
        r4 = r5;
        goto L_0x0062;
    L_0x0162:
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0073;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ama.a(android.view.View, float, float, float, float, boolean):android.animation.Animator");
    }

    public ama(View view) {
        int i = a;
        this.b = new Rect();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        this.b.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }

    static {
        c = 1;
    }

    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues2 == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        Rect rect = new Rect();
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return a(view, (float) (this.b.centerX() - rect.centerX()), (float) (this.b.centerY() - rect.centerY()), view.getTranslationX(), view.getTranslationY(), true);
    }
}
