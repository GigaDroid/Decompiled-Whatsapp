package com.whatsapp;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.PopupWindow;

public class a_p extends PopupWindow {
    private boolean a;
    private int b;

    static void b(a_p com_whatsapp_a_p) {
        super.dismiss();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r10) {
        /*
        r9 = this;
        r8 = 100;
        r7 = 50;
        r6 = 2;
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = android.os.Build.VERSION.SDK_INT;
        r4 = 14;
        if (r0 < r4) goto L_0x001d;
    L_0x000f:
        r0 = r10.getContext();
        r0 = android.view.ViewConfiguration.get(r0);
        r0 = r0.hasPermanentMenuKey();
        if (r3 == 0) goto L_0x0026;
    L_0x001d:
        r0 = android.os.Build.VERSION.SDK_INT;
        r4 = 11;
        if (r0 < r4) goto L_0x0025;
    L_0x0023:
        if (r3 == 0) goto L_0x0142;
    L_0x0025:
        r0 = r2;
    L_0x0026:
        r4 = r10.getContext();
        r4 = r4.getResources();
        r5 = 2131427368; // 0x7f0b0028 float:1.847635E38 double:1.053065039E-314;
        r4 = r4.getDimensionPixelSize(r5);
        r4 = r4 / 2;
        r9.b = r4;
        if (r0 != 0) goto L_0x004f;
    L_0x003b:
        r0 = r9.b;
        r4 = r10.getContext();
        r4 = r4.getResources();
        r5 = 2131427369; // 0x7f0b0029 float:1.8476352E38 double:1.0530650396E-314;
        r4 = r4.getDimensionPixelSize(r5);
        r0 = r0 + r4;
        r9.b = r0;
    L_0x004f:
        r0 = android.os.Build.VERSION.SDK_INT;
        r4 = 19;
        if (r0 < r4) goto L_0x005d;
    L_0x0055:
        r0 = 8388661; // 0x800035 float:1.1755018E-38 double:4.144549E-317;
        r9.showAsDropDown(r10, r1, r1, r0);
        if (r3 == 0) goto L_0x0060;
    L_0x005d:
        r9.showAsDropDown(r10, r1, r1);
    L_0x0060:
        r0 = r9.getContentView();
        r4 = 2131755309; // 0x7f10012d float:1.9141494E38 double:1.0532270635E-314;
        r0 = r0.findViewById(r4);
        r0 = (com.whatsapp.CircularRevealView) r0;
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        r0.setDuration(r4);
        r4 = r0.getResources();
        r5 = 2131623950; // 0x7f0e000e float:1.8875066E38 double:1.0531621635E-314;
        r4 = r4.getColor(r5);
        r0.setColor(r4);
        r0.setVisibility(r1);
        r4 = r0.getViewTreeObserver();
        r5 = new com.whatsapp.aqk;
        r5.<init>(r9, r0);
        r4.addOnGlobalLayoutListener(r5);
        r0 = r9.a;
        if (r0 == 0) goto L_0x00eb;
    L_0x0093:
        r0 = r9.getContentView();
        r4 = 2131755323; // 0x7f10013b float:1.9141522E38 double:1.0532270704E-314;
        r0 = r0.findViewById(r4);
        r9.a(r0, r8, r6, r2);
        r0 = r9.getContentView();
        r4 = 2131755313; // 0x7f100131 float:1.9141502E38 double:1.0532270655E-314;
        r0 = r0.findViewById(r4);
        r9.a(r0, r7, r2, r2);
        r0 = r9.getContentView();
        r4 = 2131755311; // 0x7f10012f float:1.9141498E38 double:1.0532270645E-314;
        r0 = r0.findViewById(r4);
        r9.a(r0, r1, r1, r2);
        r0 = r9.getContentView();
        r4 = 2131755317; // 0x7f100135 float:1.914151E38 double:1.0532270675E-314;
        r0 = r0.findViewById(r4);
        r4 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r9.a(r0, r4, r6, r6);
        r0 = r9.getContentView();
        r4 = 2131755319; // 0x7f100137 float:1.9141514E38 double:1.0532270685E-314;
        r0 = r0.findViewById(r4);
        r9.a(r0, r8, r2, r6);
        r0 = r9.getContentView();
        r4 = 2131755321; // 0x7f100139 float:1.9141518E38 double:1.0532270694E-314;
        r0 = r0.findViewById(r4);
        r9.a(r0, r7, r1, r6);
        if (r3 == 0) goto L_0x0141;
    L_0x00eb:
        r0 = r9.getContentView();
        r3 = 2131755311; // 0x7f10012f float:1.9141498E38 double:1.0532270645E-314;
        r0 = r0.findViewById(r3);
        r9.a(r0, r8, r6, r2);
        r0 = r9.getContentView();
        r3 = 2131755313; // 0x7f100131 float:1.9141502E38 double:1.0532270655E-314;
        r0 = r0.findViewById(r3);
        r9.a(r0, r7, r2, r2);
        r0 = r9.getContentView();
        r3 = 2131755315; // 0x7f100133 float:1.9141506E38 double:1.0532270665E-314;
        r0 = r0.findViewById(r3);
        r9.a(r0, r1, r1, r2);
        r0 = r9.getContentView();
        r3 = 2131755317; // 0x7f100135 float:1.914151E38 double:1.0532270675E-314;
        r0 = r0.findViewById(r3);
        r3 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r9.a(r0, r3, r6, r6);
        r0 = r9.getContentView();
        r3 = 2131755319; // 0x7f100137 float:1.9141514E38 double:1.0532270685E-314;
        r0 = r0.findViewById(r3);
        r9.a(r0, r8, r2, r6);
        r0 = r9.getContentView();
        r2 = 2131755321; // 0x7f100139 float:1.9141518E38 double:1.0532270694E-314;
        r0 = r0.findViewById(r2);
        r9.a(r0, r7, r1, r6);
    L_0x0141:
        return;
    L_0x0142:
        r0 = r1;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a_p.a(android.view.View):void");
    }

    public void dismiss() {
        if (isShowing()) {
            ((CircularRevealView) getContentView().findViewById(2131755309)).a();
            if (VERSION.SDK_INT < 21) {
                int width;
                View findViewById = getContentView().findViewById(2131755310);
                if (App.a1()) {
                    width = findViewById.getWidth() - (this.b / 2);
                } else {
                    width = this.b / 2;
                }
                Animation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 0, (float) width, 1, 0.0f);
                Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                Animation animationSet = new AnimationSet(true);
                animationSet.addAnimation(scaleAnimation);
                animationSet.addAnimation(alphaAnimation);
                animationSet.setDuration(300);
                findViewById.startAnimation(animationSet);
            }
        }
        App.p.M().postDelayed(new o4(this), 300);
    }

    static int a(a_p com_whatsapp_a_p) {
        return com_whatsapp_a_p.b;
    }

    private void a(View view, int i, int i2, int i3) {
        Animation animationSet = new AnimationSet(true);
        animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.0f));
        animationSet.setInterpolator(new OvershootInterpolator(1.0f));
        animationSet.setDuration(300);
        animationSet.setStartOffset((long) i);
        view.startAnimation(animationSet);
    }

    public a_p(Activity activity, boolean z) {
        int i;
        super(activity);
        this.a = z;
        View frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new LayoutParams(-2, -2));
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        if (this.a) {
            i = 2130903079;
        } else {
            i = 2130903078;
        }
        aam.a(layoutInflater, i, frameLayout, true);
        frameLayout.getChildAt(0).setVisibility(0);
        setContentView(frameLayout);
        setBackgroundDrawable(new BitmapDrawable());
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(0);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setTouchInterceptor(new anm(this, frameLayout, activity));
    }
}
