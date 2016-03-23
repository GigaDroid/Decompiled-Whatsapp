package com.whatsapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class pz extends PopupWindow {
    private static final String[] z;
    private Activity a;
    private ImageButton b;
    private ImageButton c;
    private OnGlobalLayoutListener d;
    private aol e;
    private View f;
    private ViewGroup g;
    private View h;
    private boolean i;
    private a23 j;

    static {
        String[] strArr = new String[9];
        String str = "2\u001f\u0018K)9\u0011\u0001\u0016?!\u0000*\u0015,4\u0016\u0010\u0017;?\u0013\u0010\u0016";
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
                        i3 = 81;
                        break;
                    case at.g /*1*/:
                        i3 = 112;
                        break;
                    case at.i /*2*/:
                        i3 = 117;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    default:
                        i3 = 94;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "4\u001d\u001a\u000f7\u000e\u0000\u001a\u0015+!/\u001d\u000076\u0018\u0001";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "4\u001d\u001a\u000f7\u000e\u0000\u001a\u0015+!/\u001d\u000076\u0018\u0001";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "2\u001f\u0018K)9\u0011\u0001\u0016?!\u0000*\u0015,4\u0016\u0010\u0017;?\u0013\u0010\u0016";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "4\u001d\u001a\u000f7\u000e\u0000\u001a\u0015+!/\u0019\u000405\u0003\u0016\u0004.4/\u001d\u000076\u0018\u0001";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "2\u001f\u001b\u0013;#\u0003\u0014\u00117>\u001e\u0010\b1;\u0019\u0005\n.$\u0000\u0002\f05\u001f\u0002J-9\u001f\u0002E?3\u001f\u0003\u0000d";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "q\u0018O";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "q\tO";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "4\u001d\u001a\u000f7\u000e\u0000\u001a\u0015+!/\u0019\u000405\u0003\u0016\u0004.4/\u001d\u000076\u0018\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a(int i) {
        String str;
        if (this.a.getResources().getConfiguration().orientation == 2) {
            str = z[1];
        } else {
            str = z[2];
        }
        App.z().getSharedPreferences(z[0], 0).edit().putInt(str, i).commit();
    }

    static View a(pz pzVar) {
        return pzVar.f;
    }

    public void a(Configuration configuration) {
        if (this.e != null) {
            this.e.e(this.a.getWindowManager().getDefaultDisplay().getWidth() / this.a.getResources().getDimensionPixelSize(2131427483));
        }
    }

    private void a() {
        RelativeLayout relativeLayout = new RelativeLayout(this.a);
        aam.a(this.a.getLayoutInflater(), 2130903178, relativeLayout, true);
        this.g = (ViewGroup) relativeLayout.findViewById(2131755633);
        this.g.getLayoutParams().height = -1;
        this.g.setVisibility(0);
        a(relativeLayout);
        setContentView(relativeLayout);
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new BitmapDrawable());
        setTouchInterceptor(new ec(this));
        setTouchable(true);
        setFocusable(false);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        this.e = new aol(this.a, this.g);
        this.e.e(this.a.getWindowManager().getDefaultDisplay().getWidth() / this.a.getResources().getDimensionPixelSize(2131427483));
        this.e.a(true);
        this.e.a(this.j);
    }

    public boolean c() {
        return this.i;
    }

    static View c(pz pzVar) {
        return pzVar.h;
    }

    static boolean a(pz pzVar, boolean z) {
        pzVar.i = z;
        return z;
    }

    @SuppressLint({"NewApi"})
    private void a(RelativeLayout relativeLayout) {
        if (aam.a) {
            relativeLayout.setLayoutDirection(3);
        }
    }

    static void a(pz pzVar, int i) {
        pzVar.a(i);
    }

    public void a(a23 com_whatsapp_a23) {
        this.j = com_whatsapp_a23;
        if (this.e != null) {
            this.e.a(com_whatsapp_a23);
        }
    }

    public void a(boolean z) {
        this.i = z;
    }

    static aol e(pz pzVar) {
        return pzVar.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r12, android.widget.ImageButton r13, android.widget.ImageButton r14, android.view.View r15) {
        /*
        r11 = this;
        r1 = 1;
        r3 = 0;
        r0 = r11.e;
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        r11.a();
    L_0x0009:
        r0 = r11.e;
        r0.k();
        r0 = r11.h;
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r11.h;
        r0 = r0.getViewTreeObserver();
        r2 = r11.d;
        r0.removeGlobalOnLayoutListener(r2);
    L_0x001d:
        r11.h = r12;
        r11.b = r13;
        r11.c = r14;
        r11.f = r15;
        r0 = r11.b;
        r2 = 2130839606; // 0x7f020836 float:1.7284227E38 double:1.052774646E-314;
        r0.setImageResource(r2);
        r4 = com.whatsapp.a4d.a();
        r5 = r12.getHeight();
        r0 = 2;
        r0 = new int[r0];
        r12.getLocationOnScreen(r0);
        r0 = r0[r1];
        r0 = r0 + r5;
        r0 = r0 + r3;
        r2 = r11.a;
        r2 = r2.getWindowManager();
        r6 = r2.getDefaultDisplay();
        r7 = r6.getWidth();
        r2 = r6.getHeight();
        r2 = r2 - r0;
        r2 = (float) r2;
        r8 = 1124073472; // 0x43000000 float:128.0 double:5.55366086E-315;
        r9 = r4.g;
        r8 = r8 * r9;
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 >= 0) goto L_0x00e4;
    L_0x005c:
        r2 = r1;
    L_0x005d:
        if (r2 == 0) goto L_0x0078;
    L_0x005f:
        r1 = 1131413504; // 0x43700000 float:240.0 double:5.589925436E-315;
        r4 = r4.g;
        r1 = r1 * r4;
        r4 = r6.getHeight();
        r4 = (float) r4;
        r1 = java.lang.Math.min(r1, r4);
        r1 = (int) r1;
        r11.setHeight(r1);
        r4 = r1 + r5;
        r0 = r0 - r4;
        r4 = com.whatsapp.DialogToastActivity.f;
        if (r4 == 0) goto L_0x0083;
    L_0x0078:
        r1 = r6.getHeight();
        r1 = r1 - r0;
        r11.setHeight(r1);
        r11.a(r1);
    L_0x0083:
        r10 = r1;
        r1 = r0;
        r0 = r10;
        r11.setWidth(r7);
        r4 = r11.h;
        r4 = r4.getViewTreeObserver();
        if (r4 == 0) goto L_0x0096;
    L_0x0091:
        r5 = r11.d;
        r4.addOnGlobalLayoutListener(r5);
    L_0x0096:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 6;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r2 = r4.append(r2);
        r4 = z;
        r5 = 8;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.append(r1);
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = 51;
        r11.showAtLocation(r12, r0, r3, r1);
        r0 = r11.e;
        r1 = r11.a;
        r1 = r1.getResources();
        r2 = 2131427483; // 0x7f0b009b float:1.8476584E38 double:1.053065096E-314;
        r1 = r1.getDimensionPixelSize(r2);
        r1 = r7 / r1;
        r0.e(r1);
        return;
    L_0x00e4:
        r2 = r3;
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.pz.a(android.view.View, android.widget.ImageButton, android.widget.ImageButton, android.view.View):void");
    }

    static ImageButton b(pz pzVar) {
        return pzVar.b;
    }

    public pz(Activity activity) {
        super(activity);
        this.d = new or(this);
        this.a = activity;
    }

    static Activity d(pz pzVar) {
        return pzVar.a;
    }

    public void dismiss() {
        if (this.h != null) {
            this.h.getViewTreeObserver().removeGlobalOnLayoutListener(this.d);
        }
        if (this.b != null) {
            this.b.setImageResource(2130839604);
        }
        if (this.e != null) {
            this.e.b();
        }
        super.dismiss();
    }

    public int b() {
        return App.z().getSharedPreferences(z[4], 0).getInt(this.a.getResources().getConfiguration().orientation == 2 ? z[5] : z[3], 0);
    }
}
