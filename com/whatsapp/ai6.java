package com.whatsapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

abstract class ai6 extends aic {
    private static final String[] z;
    private ImageView[] c;
    private final Handler d;
    Runnable e;
    private int f;
    private final int[] g;
    private Activity h;

    static {
        String[] strArr = new String[3];
        String str = "\u001c(\u0019\u001bl";
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
                        i3 = 111;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 120;
                        break;
                    case at.o /*3*/:
                        i3 = 111;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "=9\u000b\n}";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001c(\u0019\u001bl";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static int d(ai6 com_whatsapp_ai6) {
        return com_whatsapp_ai6.f;
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public void a() {
        if (this.h.getResources().getConfiguration().orientation == 1) {
            findViewById(2131755330).setVisibility(0);
            findViewById(2131755339).setVisibility(0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        findViewById(2131755330).setVisibility(8);
        findViewById(2131755339).setVisibility(8);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (App.am == 3) {
            menu.add(0, 0, 0, z[2]);
        }
        return true;
    }

    static int[] c(ai6 com_whatsapp_ai6) {
        return com_whatsapp_ai6.g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r8) {
        /*
        r7 = this;
        r6 = 2131755339; // 0x7f10014b float:1.9141554E38 double:1.0532270783E-314;
        r5 = 2131755330; // 0x7f100142 float:1.9141536E38 double:1.053227074E-314;
        r4 = 8;
        r3 = 1;
        r0 = 0;
        super.onCreate(r8);
        r1 = 2131755342; // 0x7f10014e float:1.914156E38 double:1.05322708E-314;
        r1 = r7.findViewById(r1);
        r2 = new com.whatsapp.aqh;
        r2.<init>(r7);
        r1.setOnClickListener(r2);
        r1 = 2131755344; // 0x7f100150 float:1.9141565E38 double:1.053227081E-314;
        r1 = r7.findViewById(r1);
        r2 = new com.whatsapp.aap;
        r2.<init>(r7);
        r1.setOnClickListener(r2);
        r1 = 2131755343; // 0x7f10014f float:1.9141563E38 double:1.0532270803E-314;
        r1 = r7.findViewById(r1);
        r2 = new com.whatsapp.vj;
        r2.<init>(r7);
        r1.setOnClickListener(r2);
        r1 = r7.h;
        r1 = r1.getResources();
        r1 = r1.getConfiguration();
        r1 = r1.orientation;
        if (r1 != r3) goto L_0x005a;
    L_0x0048:
        r1 = r7.findViewById(r5);
        r1.setVisibility(r0);
        r1 = r7.findViewById(r6);
        r1.setVisibility(r0);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0068;
    L_0x005a:
        r1 = r7.findViewById(r5);
        r1.setVisibility(r4);
        r1 = r7.findViewById(r6);
        r1.setVisibility(r4);
    L_0x0068:
        if (r8 != 0) goto L_0x0076;
    L_0x006a:
        r7.a(r0);
        r0 = r7.getWindow();
        r1 = 3;
        r0.setSoftInputMode(r1);
        return;
    L_0x0076:
        r0 = z;
        r0 = r0[r3];
        r0 = r8.getInt(r0);
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ai6.onCreate(android.os.Bundle):void");
    }

    static Handler a(ai6 com_whatsapp_ai6) {
        return com_whatsapp_ai6.d;
    }

    public ai6(Activity activity) {
        super(activity, 2130903081);
        this.d = new Handler(Looper.getMainLooper());
        this.f = 0;
        this.g = new int[]{2131755333, 2131755334, 2131755335, 2131755336, 2131755337};
        this.e = new aue(this);
        this.h = activity;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case v.m /*0*/:
                App.l(this.h);
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    static ImageView[] b(ai6 com_whatsapp_ai6) {
        return com_whatsapp_ai6.c;
    }

    protected void a(int i) {
        int i2;
        a4d a;
        View findViewById;
        Animation translateAnimation;
        TextView textView;
        boolean z = DialogToastActivity.f;
        this.f = i;
        switch (i) {
            case at.g /*1*/:
                Animation translateAnimation2;
                AlphaAnimation[] alphaAnimationArr;
                this.c = new ImageView[this.g.length];
                int i3 = 0;
                while (i3 < this.g.length) {
                    this.c[i3] = (ImageView) findViewById(this.g[i3]);
                    this.c[i3].setVisibility(0);
                    this.c[i3].setImageDrawable(this.h.getResources().getDrawable(2130837758).mutate());
                    i2 = i3 + 1;
                    if (z) {
                        findViewById(2131755338).setVisibility(0);
                        findViewById(2131755342).setVisibility(0);
                        findViewById(2131755342).setOnClickListener(null);
                        findViewById(2131755342).setClickable(false);
                        ((Button) findViewById(2131755342)).setText(2131231499);
                        findViewById(2131755344).setVisibility(8);
                        findViewById(2131755345).setVisibility(0);
                        a = a4d.a();
                        findViewById = findViewById(2131755338);
                        translateAnimation2 = new TranslateAnimation(-50.0f * a.g, 0.0f, 0.0f, 0.0f);
                        translateAnimation2.setDuration(200);
                        findViewById.startAnimation(translateAnimation2);
                        findViewById = findViewById(2131755332);
                        translateAnimation2 = new TranslateAnimation(a.g * 50.0f, 0.0f, 0.0f, 0.0f);
                        translateAnimation2.setDuration(200);
                        findViewById.startAnimation(translateAnimation2);
                        this.d.removeCallbacks(this.e);
                        this.d.postDelayed(this.e, 500);
                        if (null == null) {
                            alphaAnimationArr = new AlphaAnimation[this.g.length];
                            i2 = 0;
                            while (i2 < this.c.length) {
                                alphaAnimationArr[i2] = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimationArr[i2].setDuration(50);
                                alphaAnimationArr[i2].setFillAfter(true);
                                this.c[i2].startAnimation(alphaAnimationArr[i2]);
                                i2++;
                                if (z) {
                                }
                            }
                        }
                        ((TextView) findViewById(2131755340)).setVisibility(4);
                        ((TextView) findViewById(2131755341)).setVisibility(4);
                        if (!z) {
                            return;
                        }
                    }
                    i3 = i2;
                }
                findViewById(2131755338).setVisibility(0);
                findViewById(2131755342).setVisibility(0);
                findViewById(2131755342).setOnClickListener(null);
                findViewById(2131755342).setClickable(false);
                ((Button) findViewById(2131755342)).setText(2131231499);
                findViewById(2131755344).setVisibility(8);
                findViewById(2131755345).setVisibility(0);
                a = a4d.a();
                findViewById = findViewById(2131755338);
                translateAnimation2 = new TranslateAnimation(-50.0f * a.g, 0.0f, 0.0f, 0.0f);
                translateAnimation2.setDuration(200);
                findViewById.startAnimation(translateAnimation2);
                findViewById = findViewById(2131755332);
                translateAnimation2 = new TranslateAnimation(a.g * 50.0f, 0.0f, 0.0f, 0.0f);
                translateAnimation2.setDuration(200);
                findViewById.startAnimation(translateAnimation2);
                this.d.removeCallbacks(this.e);
                this.d.postDelayed(this.e, 500);
                if (null == null) {
                    alphaAnimationArr = new AlphaAnimation[this.g.length];
                    i2 = 0;
                    while (i2 < this.c.length) {
                        alphaAnimationArr[i2] = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimationArr[i2].setDuration(50);
                        alphaAnimationArr[i2].setFillAfter(true);
                        this.c[i2].startAnimation(alphaAnimationArr[i2]);
                        i2++;
                        if (z) {
                        }
                    }
                }
                ((TextView) findViewById(2131755340)).setVisibility(4);
                ((TextView) findViewById(2131755341)).setVisibility(4);
                if (z) {
                    return;
                }
                break;
            case at.i /*2*/:
                break;
            default:
                return;
        }
        i2 = 0;
        while (i2 < this.g.length) {
            findViewById(this.g[i2]).setVisibility(8);
            i2++;
            if (z) {
                a = a4d.a();
                findViewById = findViewById(2131755338);
                translateAnimation = new TranslateAnimation(50.0f * a.g, 0.0f, 0.0f, 0.0f);
                translateAnimation.setDuration(200);
                findViewById.startAnimation(translateAnimation);
                findViewById = findViewById(2131755332);
                translateAnimation = new AnimationSet(true);
                translateAnimation.addAnimation(new TranslateAnimation(a.g * -50.0f, 0.0f, 0.0f, 0.0f));
                translateAnimation.addAnimation(new AlphaAnimation(1.0f, 0.0f));
                translateAnimation.setDuration(200);
                findViewById.startAnimation(translateAnimation);
                findViewById(2131755332).setVisibility(8);
                findViewById(2131755338).setVisibility(0);
                findViewById(2131755342).setVisibility(8);
                findViewById(2131755344).setVisibility(4);
                findViewById(2131755343).setVisibility(0);
                findViewById(2131755345).setVisibility(8);
                textView = (TextView) findViewById(2131755340);
                textView.setText(2131231748);
                textView.setVisibility(0);
                textView = (TextView) findViewById(2131755341);
                textView.setText(App.az.a(2131296307, App.aK.p(), new Object[]{Integer.valueOf(App.aK.p())}));
                textView.setVisibility(0);
            }
        }
        a = a4d.a();
        findViewById = findViewById(2131755338);
        translateAnimation = new TranslateAnimation(50.0f * a.g, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(200);
        findViewById.startAnimation(translateAnimation);
        findViewById = findViewById(2131755332);
        translateAnimation = new AnimationSet(true);
        translateAnimation.addAnimation(new TranslateAnimation(a.g * -50.0f, 0.0f, 0.0f, 0.0f));
        translateAnimation.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        translateAnimation.setDuration(200);
        findViewById.startAnimation(translateAnimation);
        findViewById(2131755332).setVisibility(8);
        findViewById(2131755338).setVisibility(0);
        findViewById(2131755342).setVisibility(8);
        findViewById(2131755344).setVisibility(4);
        findViewById(2131755343).setVisibility(0);
        findViewById(2131755345).setVisibility(8);
        textView = (TextView) findViewById(2131755340);
        textView.setText(2131231748);
        textView.setVisibility(0);
        textView = (TextView) findViewById(2131755341);
        textView.setText(App.az.a(2131296307, App.aK.p(), new Object[]{Integer.valueOf(App.aK.p())}));
        textView.setVisibility(0);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            onSaveInstanceState.putInt(z[0], this.f);
        }
        return onSaveInstanceState;
    }
}
