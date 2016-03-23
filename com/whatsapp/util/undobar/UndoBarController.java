package com.whatsapp.util.undobar;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.lang.reflect.Method;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class UndoBarController extends LinearLayout {
    private static Animation b;
    static final boolean c;
    public static boolean h;
    public static final f k;
    private static Animation l;
    public static final f n;
    public static final f o;
    private static final String[] z;
    private boolean a;
    private float d;
    private boolean e;
    private String f;
    private CharSequence g;
    private f i;
    private c j;
    private final Handler m;
    private Parcelable p;
    private final Runnable q;
    private final TextView r;
    private final TextView s;
    private int t;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(14)
    private int a(android.content.Context r5) {
        /*
        r4 = this;
        r1 = 0;
        r2 = r5.getResources();
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x0027 }
        r3 = 14;
        if (r0 < r3) goto L_0x003a;
    L_0x000b:
        r0 = r4.b(r5);	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 == 0) goto L_0x003a;
    L_0x0011:
        r0 = r4.a;	 Catch:{ IllegalArgumentException -> 0x0029 }
        if (r0 == 0) goto L_0x001f;
    L_0x0015:
        r0 = z;
        r3 = 19;
        r0 = r0[r3];
        r3 = h;	 Catch:{ IllegalArgumentException -> 0x002b }
        if (r3 == 0) goto L_0x0035;
    L_0x001f:
        r0 = r4.a();	 Catch:{ IllegalArgumentException -> 0x002d }
        if (r0 != 0) goto L_0x002f;
    L_0x0025:
        r0 = r1;
    L_0x0026:
        return r0;
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = z;
        r1 = 18;
        r0 = r0[r1];
    L_0x0035:
        r0 = r4.a(r2, r0);
        goto L_0x0026;
    L_0x003a:
        r0 = r1;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.undobar.UndoBarController.a(android.content.Context):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r5) {
        /*
        r4 = this;
        r3 = 8;
        r0 = h;
        r1 = r4.m;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2 = r4.q;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1.removeCallbacks(r2);	 Catch:{ IllegalArgumentException -> 0x0032 }
        r1 = 0;
        r4.p = r1;	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r5 == 0) goto L_0x0017;
    L_0x0010:
        r1 = 8;
        r4.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r0 == 0) goto L_0x0031;
    L_0x0017:
        r4.clearAnimation();	 Catch:{ IllegalArgumentException -> 0x0036 }
        r1 = r4.i;	 Catch:{ IllegalArgumentException -> 0x0036 }
        r1 = r1.c;	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r1 == 0) goto L_0x0029;
    L_0x0020:
        r1 = r4.i;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r1 = r1.c;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r4.startAnimation(r1);	 Catch:{ IllegalArgumentException -> 0x0038 }
        if (r0 == 0) goto L_0x002e;
    L_0x0029:
        r0 = b;	 Catch:{ IllegalArgumentException -> 0x0038 }
        r4.startAnimation(r0);	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x002e:
        r4.setVisibility(r3);
    L_0x0031:
        return;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0034 }
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.undobar.UndoBarController.a(boolean):void");
    }

    private UndoBarController(Context context, AttributeSet attributeSet) {
        boolean z = true;
        super(context, attributeSet);
        this.i = k;
        this.m = new Handler(Looper.getMainLooper());
        this.q = new b(this);
        this.t = -1;
        LayoutInflater.from(context).inflate(2130903284, this, true);
        this.s = (TextView) findViewById(2131755928);
        this.r = (TextView) findViewById(2131755930);
        this.r.setOnClickListener(new e(this));
        a(true);
        if (VERSION.SDK_INT >= 19) {
            WindowManager windowManager = (WindowManager) context.getSystemService(z[0]);
            if (getResources().getConfiguration().orientation != 1) {
                z = false;
            }
            this.a = z;
            try {
                Method declaredMethod = Class.forName(z[3]).getDeclaredMethod(z[1], new Class[]{String.class});
                declaredMethod.setAccessible(true);
                this.f = (String) declaredMethod.invoke(null, new Object[]{z[2]});
            } catch (Throwable th) {
                this.f = null;
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.e = obtainStyledAttributes.getBoolean(1, false);
                if (!c) {
                    if (getContext() == null) {
                        throw new AssertionError();
                    }
                }
                if ((((Activity) getContext()).getWindow().getAttributes().flags & 134217728) != 0) {
                    this.e = true;
                }
                this.d = a(windowManager);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private int a(Resources resources, String str) {
        int identifier = resources.getIdentifier(str, z[4], z[5]);
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @TargetApi(14)
    private boolean b(Context context) {
        boolean z = true;
        boolean z2 = false;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(z[11], z[10], z[12]);
        if (identifier != 0) {
            boolean z3 = resources.getBoolean(identifier);
            if ("1".equals(this.f)) {
                try {
                    if (!h) {
                        return false;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            z2 = z3;
            return "0".equals(this.f) ? true : z2;
        } else {
            try {
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    z = false;
                }
                return z;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    private static Animation a(AnimationListener animationListener) {
        Animation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 1.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setAnimationListener(animationListener);
        return translateAnimation;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            try {
                this.g = bundle.getCharSequence(z[6]);
                this.p = bundle.getParcelable(z[8]);
                this.i = (f) bundle.getParcelable(z[9]);
                if (bundle.getInt(z[7]) == 0) {
                    a(true, this.g, this.p);
                    return;
                }
                return;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    private static Animation b(AnimationListener animationListener) {
        Animation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setAnimationListener(animationListener);
        return translateAnimation;
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putCharSequence(z[13], this.g);
        bundle.putParcelable(z[15], this.p);
        bundle.putParcelable(z[14], this.i);
        bundle.putInt(z[16], getVisibility());
        return bundle;
    }

    static c a(UndoBarController undoBarController) {
        return undoBarController.j;
    }

    private static UndoBarController b(Activity activity) {
        UndoBarController a = a(activity);
        if (a != null) {
            return a;
        }
        View undoBarController = new UndoBarController(activity, null);
        ((ViewGroup) activity.findViewById(16908290)).addView(undoBarController);
        return undoBarController;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r7, java.lang.CharSequence r8, android.os.Parcelable r9) {
        /*
        r6 = this;
        r0 = h;
        r6.p = r9;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r6.g = r8;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r1 = r6.s;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r2 = r6.g;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x00cb }
        r1 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00cb }
        r1 = r1.d;	 Catch:{ IllegalArgumentException -> 0x00cb }
        if (r1 <= 0) goto L_0x0049;
    L_0x0013:
        r1 = r6.r;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1 = 2131755929; // 0x7f100399 float:1.9142751E38 double:1.05322737E-314;
        r1 = r6.findViewById(r1);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1 = r6.r;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r2 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r2 = r2.d;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r1 = r1.a;	 Catch:{ IllegalArgumentException -> 0x00cd }
        if (r1 <= 0) goto L_0x005c;
    L_0x0033:
        r1 = r6.r;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r2 = r6.getResources();	 Catch:{ IllegalArgumentException -> 0x00cf }
        r3 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r3 = r3.a;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r2 = r2.getDrawable(r3);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x00cf }
        if (r0 == 0) goto L_0x005c;
    L_0x0049:
        r1 = r6.r;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r1 = 2131755929; // 0x7f100399 float:1.9142751E38 double:1.05322737E-314;
        r1 = r6.findViewById(r1);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x00cf }
    L_0x005c:
        r1 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r1 = r1.e;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        if (r1 <= 0) goto L_0x0070;
    L_0x0062:
        r1 = 2131755927; // 0x7f100397 float:1.9142747E38 double:1.053227369E-314;
        r1 = r6.findViewById(r1);	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r2 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r2 = r2.e;	 Catch:{ IllegalArgumentException -> 0x00d1 }
        r1.setBackgroundResource(r2);	 Catch:{ IllegalArgumentException -> 0x00d1 }
    L_0x0070:
        r1 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r2 = r6.q;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r1.removeCallbacks(r2);	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r1 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r2 = r1.b;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x008c;
    L_0x0081:
        r1 = r6.m;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r2 = r6.q;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r3 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r4 = r3.b;	 Catch:{ IllegalArgumentException -> 0x00d3 }
        r1.postDelayed(r2, r4);	 Catch:{ IllegalArgumentException -> 0x00d3 }
    L_0x008c:
        if (r7 != 0) goto L_0x00a5;
    L_0x008e:
        r6.clearAnimation();	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        r1 = r1.f;	 Catch:{ IllegalArgumentException -> 0x00d5 }
        if (r1 == 0) goto L_0x00a0;
    L_0x0097:
        r1 = r6.i;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r1 = r1.f;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r6.startAnimation(r1);	 Catch:{ IllegalArgumentException -> 0x00d7 }
        if (r0 == 0) goto L_0x00a5;
    L_0x00a0:
        r0 = l;	 Catch:{ IllegalArgumentException -> 0x00d7 }
        r6.startAnimation(r0);	 Catch:{ IllegalArgumentException -> 0x00d7 }
    L_0x00a5:
        r0 = 0;
        r6.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x00d9 }
        r1 = 19;
        if (r0 < r1) goto L_0x00ca;
    L_0x00af:
        r0 = r6.t;	 Catch:{ IllegalArgumentException -> 0x00db }
        if (r0 == 0) goto L_0x00ca;
    L_0x00b3:
        r0 = r6.t;	 Catch:{ IllegalArgumentException -> 0x00dd }
        r1 = 1;
        if (r0 == r1) goto L_0x00bc;
    L_0x00b8:
        r0 = r6.e;	 Catch:{ IllegalArgumentException -> 0x00df }
        if (r0 == 0) goto L_0x00ca;
    L_0x00bc:
        r0 = 0;
        r1 = 0;
        r2 = 0;
        r3 = r6.getContext();	 Catch:{ IllegalArgumentException -> 0x00df }
        r3 = r6.a(r3);	 Catch:{ IllegalArgumentException -> 0x00df }
        r6.setPadding(r0, r1, r2, r3);	 Catch:{ IllegalArgumentException -> 0x00df }
    L_0x00ca:
        return;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00cf }
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = move-exception;
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        throw r0;
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00d7 }
    L_0x00d7:
        r0 = move-exception;
        throw r0;
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00db }
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00dd }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00df }
    L_0x00df:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.undobar.UndoBarController.a(boolean, java.lang.CharSequence, android.os.Parcelable):void");
    }

    static void a(UndoBarController undoBarController, boolean z) {
        undoBarController.a(z);
    }

    private boolean a() {
        try {
            if (this.d < 600.0f) {
                if (!this.a) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static Parcelable b(UndoBarController undoBarController) {
        return undoBarController.p;
    }

    public static UndoBarController a(Activity activity, CharSequence charSequence, c cVar, Parcelable parcelable, boolean z, f fVar, int i) {
        UndoBarController b = b(activity);
        if (fVar == null) {
            try {
                throw new IllegalArgumentException(z[17]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        b.i = fVar;
        b.a(cVar);
        b.a(z, charSequence, parcelable);
        b.t = i;
        return b;
    }

    static {
        boolean z = true;
        String[] strArr = new String[20];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "oe\u000fM&o";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 24;
                        break;
                    case at.g /*1*/:
                        i4 = 12;
                        break;
                    case at.i /*2*/:
                        i4 = 97;
                        break;
                    case at.o /*3*/:
                        i4 = 41;
                        break;
                    default:
                        i4 = 73;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "ii\f\\gp{OD(qb\nL0k";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "yb\u0005[&qhOF:6_\u0018Z=}a1[&hi\u0013] }\u007f";
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "|e\fL'";
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "yb\u0005[&qh";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "mb\u0005F\u0016ui\u0012Z(\u007fi";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "ne\u0012@+ti";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "mb\u0005F\u0016lc\nL'";
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "mb\u0005F\u0016kx\u0018E,";
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "zc\u000eE";
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "{c\u000fO \u007fS\u0012A&oB\u0000_ \u007fm\u0015@&vN\u0000[";
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "yb\u0005[&qh";
                    i2 = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "mb\u0005F\u0016ui\u0012Z(\u007fi";
                    i2 = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "mb\u0005F\u0016kx\u0018E,";
                    i2 = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "mb\u0005F\u0016lc\nL'";
                    i2 = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "ne\u0012@+ti";
                    i2 = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "kx\u0018E,8a\u0014Z=8b\u000e]iziAL$hx\u0018\u0007";
                    i2 = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "vm\u0017@.yx\bF'Gn\u0000[\u0016pi\bN!lS\rH'|\u007f\u0002H9}";
                    i2 = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "vm\u0017@.yx\bF'Gn\u0000[\u0016pi\bN!l";
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        if (UndoBarController.class.desiredAssertionStatus()) {
                            z = false;
                        }
                        c = z;
                        k = new f(-1, 2131232180);
                        o = new f(2130839547, 2131231838, -1);
                        n = new f(-1, -1, 5000);
                        l = b(null);
                        b = a(null);
                        return;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "\u007fi\u0015";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    private static UndoBarController a(Activity activity) {
        if (activity == null) {
            return null;
        }
        View findViewById = activity.findViewById(2131755927);
        if (findViewById != null) {
            return (UndoBarController) findViewById.getParent();
        }
        return null;
    }

    private void a(c cVar) {
        this.j = cVar;
    }

    public static void c(Activity activity) {
        UndoBarController a = a(activity);
        if (a != null) {
            try {
                a.setVisibility(8);
                a.m.removeCallbacks(a.q);
                if (a.j instanceof a) {
                    ((a) a.j).a();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"NewApi"})
    private float a(android.view.WindowManager r4) {
        /*
        r3 = this;
        r0 = new android.util.DisplayMetrics;
        r0.<init>();
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x002f }
        r2 = 16;
        if (r1 < r2) goto L_0x0016;
    L_0x000b:
        r1 = r4.getDefaultDisplay();	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1.getRealMetrics(r0);	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1 = h;	 Catch:{ IllegalArgumentException -> 0x0031 }
        if (r1 == 0) goto L_0x001d;
    L_0x0016:
        r1 = r4.getDefaultDisplay();	 Catch:{ IllegalArgumentException -> 0x0031 }
        r1.getMetrics(r0);	 Catch:{ IllegalArgumentException -> 0x0031 }
    L_0x001d:
        r1 = r0.widthPixels;
        r1 = (float) r1;
        r2 = r0.density;
        r1 = r1 / r2;
        r2 = r0.heightPixels;
        r2 = (float) r2;
        r0 = r0.density;
        r0 = r2 / r0;
        r0 = java.lang.Math.min(r1, r0);
        return r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.undobar.UndoBarController.a(android.view.WindowManager):float");
    }
}
