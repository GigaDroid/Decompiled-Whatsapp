package com.whatsapp;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.text.format.DateUtils;
import android.widget.Button;
import android.widget.TextView;

class h7 {
    private static final long f;
    private long a;
    private final int b;
    private final TextView c;
    private CountDownTimer d;
    private final Button e;
    private final int g;
    private final int h;
    private long i;
    private final int j;
    private final String k;

    static {
        f = App.am == 3 ? 20000 : 300000;
    }

    public void a(long j) {
        a(j, true);
    }

    static int b(h7 h7Var) {
        return h7Var.g;
    }

    static int d(h7 h7Var) {
        return h7Var.j;
    }

    static long a() {
        return f;
    }

    h7(Activity activity, String str, int i, int i2, int i3, int i4, int i5, int i6, 1 1) {
        this(activity, str, i, i2, i3, i4, i5, i6);
    }

    private CharSequence b(long j) {
        return DateUtils.formatElapsedTime(j / 1000);
    }

    private void b() {
        if (this.d != null) {
            this.d.cancel();
            this.d = null;
        }
        this.e.setEnabled(true);
    }

    static Button a(h7 h7Var) {
        return h7Var.e;
    }

    static CountDownTimer a(h7 h7Var, CountDownTimer countDownTimer) {
        h7Var.d = countDownTimer;
        return countDownTimer;
    }

    static TextView c(h7 h7Var) {
        return h7Var.c;
    }

    private h7(@NonNull Activity activity, @NonNull String str, int i, int i2, int i3, int i4, int i5, int i6) {
        this.k = str;
        this.e = (Button) activity.findViewById(i);
        this.c = (TextView) activity.findViewById(i2);
        this.h = i3;
        this.b = i4;
        this.j = i5;
        this.g = i6;
        if (VERSION.SDK_INT >= 14) {
            this.e.setAllCaps(false);
        }
        a(true);
    }

    static CharSequence b(h7 h7Var, long j) {
        return h7Var.b(j);
    }

    private void a(long j, boolean z) {
        if (j < 3000) {
            a(true);
            return;
        }
        a(false);
        if (this.d != null) {
            this.d.cancel();
            this.i = 0;
        }
        this.a = j;
        this.c.setText(b(j));
        this.d = new ak(this, this.a, 1000, z).start();
    }

    public void c() {
        if (this.d != null) {
            if (this.i <= f) {
                this.d.cancel();
                this.d = null;
                this.i = 0;
            } else {
                return;
            }
        }
        a(f, false);
    }

    static long a(h7 h7Var, long j) {
        h7Var.i = j;
        return j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r6) {
        /*
        r5 = this;
        r4 = 8;
        r3 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r5.e;
        r1.setEnabled(r6);
        if (r6 == 0) goto L_0x0033;
    L_0x000c:
        r5.b();
        r1 = r5.e;
        r2 = r5.j;
        r1.setText(r2);
        r1 = com.whatsapp.App.a1();
        if (r1 == 0) goto L_0x0025;
    L_0x001c:
        r1 = r5.e;
        r2 = r5.h;
        r1.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r3, r3);
        if (r0 == 0) goto L_0x002c;
    L_0x0025:
        r1 = r5.e;
        r2 = r5.h;
        r1.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r2, r3);
    L_0x002c:
        r1 = r5.c;
        r1.setVisibility(r4);
        if (r0 == 0) goto L_0x004e;
    L_0x0033:
        r1 = com.whatsapp.App.a1();
        if (r1 == 0) goto L_0x0042;
    L_0x0039:
        r1 = r5.e;
        r2 = r5.b;
        r1.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r3, r3);
        if (r0 == 0) goto L_0x0049;
    L_0x0042:
        r0 = r5.e;
        r1 = r5.b;
        r0.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r1, r3);
    L_0x0049:
        r0 = r5.c;
        r0.setVisibility(r4);
    L_0x004e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.h7.a(boolean):void");
    }
}
