package com.whatsapp;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;

public class k3 extends PopupWindow {
    private View a;
    private aol b;
    private OnDismissListener c;
    private View d;
    private ViewGroup e;
    private boolean f;
    private a23 g;
    private Activity h;

    static View c(k3 k3Var) {
        return k3Var.d;
    }

    public void a(a23 com_whatsapp_a23) {
        this.g = com_whatsapp_a23;
        this.b.a(com_whatsapp_a23);
    }

    public k3(Activity activity, View view) {
        super(activity);
        this.c = new ane(this);
        this.h = activity;
        this.a = view;
        View emojiPopupWindow$2 = new EmojiPopupWindow$2(this, activity);
        aam.a(activity.getLayoutInflater(), 2130903178, emojiPopupWindow$2, true);
        this.e = (ViewGroup) emojiPopupWindow$2.findViewById(2131755633);
        this.e.getLayoutParams().height = -1;
        this.e.setVisibility(0);
        setContentView(emojiPopupWindow$2);
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new BitmapDrawable());
        setTouchInterceptor(new amo(this));
        setOnDismissListener(this.c);
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        this.b = new aol(activity, this.e);
        this.b.a(view);
        this.b.e((activity.getWindowManager().getDefaultDisplay().getWidth() - ViewConfiguration.getScrollBarSize()) / activity.getResources().getDimensionPixelSize(2131427483));
    }

    public k3(Activity activity) {
        this(activity, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r9) {
        /*
        r8 = this;
        r7 = -1;
        r6 = 1;
        r5 = 0;
        r8.d = r9;
        r0 = r9.getHeight();
        r1 = 2;
        r1 = new int[r1];
        r9.getLocationOnScreen(r1);
        r2 = r1[r6];
        r0 = r0 + r2;
        r0 = r0 + r5;
        r2 = r8.h;
        r2 = r2.getWindowManager();
        r2 = r2.getDefaultDisplay();
        r3 = r2.getHeight();
        r3 = r3 * 2;
        r3 = r3 / 3;
        if (r0 <= r3) goto L_0x0032;
    L_0x0027:
        r0 = r1[r6];
        r0 = r0 + 0;
        r8.setHeight(r0);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0036;
    L_0x0032:
        r0 = -2;
        r8.setHeight(r0);
    L_0x0036:
        r8.setWidth(r7);
        r0 = r2.getWidth();
        r1 = android.view.ViewConfiguration.getScrollBarSize();
        r0 = r0 - r1;
        r1 = r8.h;
        r1 = r1.getResources();
        r2 = 2131427483; // 0x7f0b009b float:1.8476584E38 double:1.053065096E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r1 = r0 / r1;
        r0 = r8.c;
        r8.setOnDismissListener(r0);
        r8.showAsDropDown(r9, r5, r5);
        r2 = r8.isAboveAnchor();
        r0 = r8.f;
        if (r2 == r0) goto L_0x00aa;
    L_0x0061:
        r0 = r8.getContentView();
        r0 = (android.widget.RelativeLayout) r0;
        r0.removeAllViews();
        r3 = r8.h;
        r3 = r3.getLayoutInflater();
        r4 = 2130903178; // 0x7f03008a float:1.7413167E38 double:1.052806055E-314;
        r3.inflate(r4, r0, r6);
        com.whatsapp.aam.a(r0);
        r3 = 2131755633; // 0x7f100271 float:1.914215E38 double:1.0532272236E-314;
        r0 = r0.findViewById(r3);
        r0 = (android.view.ViewGroup) r0;
        r8.e = r0;
        r0 = r8.e;
        r0 = r0.getLayoutParams();
        r0.height = r7;
        r0 = r8.e;
        r0.setVisibility(r5);
        r0 = new com.whatsapp.aol;
        r3 = r8.h;
        r4 = r8.e;
        r0.<init>(r3, r4);
        r8.b = r0;
        r0 = r8.b;
        r3 = r8.a;
        r0.a(r3);
        r0 = r8.b;
        r3 = r8.g;
        r0.a(r3);
    L_0x00aa:
        r8.f = r2;
        r0 = r8.b;
        r0.k();
        r0 = r8.b;
        r0.e(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.k3.a(android.view.View):void");
    }

    static aol a(k3 k3Var) {
        return k3Var.b;
    }

    public void a(OnDismissListener onDismissListener) {
        this.c = onDismissListener;
        setOnDismissListener(onDismissListener);
    }

    static Activity b(k3 k3Var) {
        return k3Var.h;
    }

    public void a(Configuration configuration) {
    }
}
