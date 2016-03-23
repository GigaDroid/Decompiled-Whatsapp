package com.whatsapp;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

public class a4d {
    private static final String[] A;
    private static Typeface a;
    private static Boolean e;
    private static Typeface h;
    private static Typeface i;
    private static Typeface n;
    private static a4d y;
    public final int b;
    public final int c;
    public final int d;
    public final int f;
    public final float g;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int o;
    public final float p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final float v;
    public final float w;
    public final float x;
    public final int z;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface e() {
        /*
        r0 = n;	 Catch:{ IllegalStateException -> 0x0030 }
        if (r0 != 0) goto L_0x002d;
    L_0x0004:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0032 }
        r1 = 21;
        if (r0 < r1) goto L_0x001a;
    L_0x000a:
        r0 = A;	 Catch:{ IllegalStateException -> 0x0034 }
        r1 = 4;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0034 }
        r1 = 0;
        r0 = android.graphics.Typeface.create(r0, r1);	 Catch:{ IllegalStateException -> 0x0034 }
        n = r0;	 Catch:{ IllegalStateException -> 0x0034 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalStateException -> 0x0034 }
        if (r0 == 0) goto L_0x002d;
    L_0x001a:
        r0 = com.whatsapp.App.z();	 Catch:{ IllegalStateException -> 0x0034 }
        r0 = r0.getAssets();	 Catch:{ IllegalStateException -> 0x0034 }
        r1 = A;	 Catch:{ IllegalStateException -> 0x0034 }
        r2 = 5;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0034 }
        r0 = android.graphics.Typeface.createFromAsset(r0, r1);	 Catch:{ IllegalStateException -> 0x0034 }
        n = r0;	 Catch:{ IllegalStateException -> 0x0034 }
    L_0x002d:
        r0 = n;
        return r0;
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a4d.e():android.graphics.Typeface");
    }

    public void a(EditText editText) {
        boolean z = DialogToastActivity.f;
        try {
            if (this.g >= 1.5f) {
                editText.setMaxLines(6);
                if (!z) {
                    return;
                }
            }
            try {
                if (this.g >= 1.0f) {
                    try {
                        editText.setMaxLines(5);
                        if (!z) {
                            return;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                editText.setMaxLines(4);
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    private a4d(Context context) {
        float f;
        float f2 = 42.0f;
        this.g = context.getResources().getDisplayMetrics().density;
        if (((float) context.getResources().getDisplayMetrics().widthPixels) / this.g >= 360.0f) {
            f = 8.0f;
        } else {
            f = 2.0f;
        }
        try {
            this.t = Math.round(f * this.g);
            this.o = (int) (this.g * 42.0f);
            this.z = (int) (this.g * 22.0f);
            this.j = (int) (this.g * 3.0f);
            this.m = (int) (this.g * 2.0f);
            this.q = (int) (this.g * 10.0f);
            this.u = (int) ((this.g * 4.0f) / 3.0f);
            this.b = (int) ((this.g * 3.0f) / 2.0f);
            this.s = Math.max(1, (int) (this.g / 2.0f));
            if (this.g >= 1.5f) {
                f2 = 52.0f;
            }
            this.w = f2;
            this.p = (float) ((int) (this.g * 4.0f));
            this.v = this.g * 2.0f;
            this.k = (int) (83.333336f * this.g);
            this.r = (int) (this.g * 1.3333334f);
            this.x = 3.3333333f * this.g;
            this.d = (int) (66.666664f * this.g);
            this.l = (int) (2.6666667f * this.g);
            this.c = (int) (this.g * 1.3333334f);
            this.f = (int) (this.g * 4.0f);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public float b(@NonNull Context context) {
        return context.getResources().getDisplayMetrics().scaledDensity * 22.0f;
    }

    public int c() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            ((WindowManager) App.z().getSystemService(A[6])).getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.densityDpi >= 320) {
                return (int) (displayMetrics.density * 25.0f);
            }
            try {
                if (displayMetrics.densityDpi >= 240) {
                    return 38;
                }
                try {
                    if (displayMetrics.densityDpi >= 160) {
                        return 25;
                    }
                    return 19;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static {
        String[] strArr = new String[7];
        String str = ".{NWtgFOAh<{\ron/|T\rs<r";
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
                        i3 = 72;
                        break;
                    case at.g /*1*/:
                        i3 = 20;
                        break;
                    case at.i /*2*/:
                        i3 = 32;
                        break;
                    case at.o /*3*/:
                        i3 = 35;
                        break;
                    default:
                        i3 = 7;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\tVcBe+%\u0012\u0010";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ";wAOb:4SKh=xD\u0003h&xY\u0003e-4IMn<}AOn2qD\u0003h&wE";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = ";uNP*;qRJaeyEGn=y";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ".{NWtgFOAh<{\rnb,}UN)<`F";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "?}NGh?";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    A = strArr3;
                    y = null;
                    e = null;
                    i = null;
                    n = null;
                    a = null;
                    h = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = ";uNP*;qRJaexIDo<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(Context context) {
        try {
            if (y != null) {
                throw new IllegalStateException(A[3]);
            }
            y = new a4d(context);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean d() {
        /*
        r1 = 0;
        r0 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r2 = new android.text.TextPaint;
        r2.<init>();
        r4 = 1101004800; // 0x41a00000 float:20.0 double:5.439686476E-315;
        r2.setTextSize(r4);
        r4 = android.graphics.Typeface.DEFAULT;
        r2.setTypeface(r4);
        r4 = A;
        r5 = 2;
        r4 = r4[r5];
        r4 = r2.measureText(r4);
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0053 }
        r5 = 21;
        if (r2 < r5) goto L_0x002b;
    L_0x0022:
        r2 = 1;
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ IllegalStateException -> 0x0055 }
        e = r2;	 Catch:{ IllegalStateException -> 0x0055 }
        if (r3 == 0) goto L_0x004c;
    L_0x002b:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0057 }
        r5 = 14;
        if (r2 < r5) goto L_0x0040;
    L_0x0031:
        r2 = 1121058816; // 0x42d20000 float:105.0 double:5.53876648E-315;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x005b;
    L_0x0037:
        r2 = r0;
    L_0x0038:
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ IllegalStateException -> 0x005d }
        e = r2;	 Catch:{ IllegalStateException -> 0x005d }
        if (r3 == 0) goto L_0x004c;
    L_0x0040:
        r2 = 1120534528; // 0x42ca0000 float:101.0 double:5.536176153E-315;
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0061;
    L_0x0046:
        r0 = java.lang.Boolean.valueOf(r0);
        e = r0;
    L_0x004c:
        r0 = e;
        r0 = r0.booleanValue();
        return r0;
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r2 = r1;
        goto L_0x0038;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r0 = r1;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a4d.d():boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface b() {
        /*
        r0 = i;	 Catch:{ IllegalStateException -> 0x0030 }
        if (r0 != 0) goto L_0x002d;
    L_0x0004:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0032 }
        r1 = 21;
        if (r0 < r1) goto L_0x001a;
    L_0x000a:
        r0 = A;	 Catch:{ IllegalStateException -> 0x0034 }
        r1 = 1;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0034 }
        r1 = 0;
        r0 = android.graphics.Typeface.create(r0, r1);	 Catch:{ IllegalStateException -> 0x0034 }
        i = r0;	 Catch:{ IllegalStateException -> 0x0034 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalStateException -> 0x0034 }
        if (r0 == 0) goto L_0x002d;
    L_0x001a:
        r0 = com.whatsapp.App.z();	 Catch:{ IllegalStateException -> 0x0034 }
        r0 = r0.getAssets();	 Catch:{ IllegalStateException -> 0x0034 }
        r1 = A;	 Catch:{ IllegalStateException -> 0x0034 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0034 }
        r0 = android.graphics.Typeface.createFromAsset(r0, r1);	 Catch:{ IllegalStateException -> 0x0034 }
        i = r0;	 Catch:{ IllegalStateException -> 0x0034 }
    L_0x002d:
        r0 = i;
        return r0;
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a4d.b():android.graphics.Typeface");
    }

    public static void a(@NonNull TextView textView) {
        boolean z = true;
        try {
            if (e == null) {
                d();
            }
            try {
                if (e.booleanValue()) {
                    textView.setTypeface(e());
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                try {
                    if (h == null) {
                        h = Typeface.create(Typeface.DEFAULT, 1);
                    }
                    try {
                        textView.setTypeface(h);
                        TextPaint paint = textView.getPaint();
                        if ((h.getStyle() & 1) != 0) {
                            z = false;
                        }
                        paint.setFakeBoldText(z);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public static void b(@NonNull TextView textView) {
        try {
            if (e == null) {
                d();
            }
            try {
                if (e.booleanValue()) {
                    textView.setTypeface(b());
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                try {
                    if (a == null) {
                        a = Typeface.defaultFromStyle(0);
                    }
                    textView.setTypeface(a);
                    textView.getPaint().setFakeBoldText(false);
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public static a4d a() {
        return y;
    }
}
