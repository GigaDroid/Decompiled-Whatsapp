package com.whatsapp.notification;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v7.app.AlertDialog.Builder;
import android.text.TextUtils;
import android.text.method.TextKeyListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.GalleryView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.ThumbnailButton;
import com.whatsapp.ThumbnailTextButton;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.WAFragmentActivity;
import com.whatsapp.a23;
import com.whatsapp.a28;
import com.whatsapp.a4d;
import com.whatsapp.a9z;
import com.whatsapp.aam;
import com.whatsapp.arj;
import com.whatsapp.aup;
import com.whatsapp.i8;
import com.whatsapp.k3;
import com.whatsapp.l5;
import com.whatsapp.pg;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.qm;
import com.whatsapp.tm;
import com.whatsapp.util.Log;
import com.whatsapp.util.bz;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class PopupNotification extends WAFragmentActivity implements tm {
    private static final String[] N;
    public static PopupNotification f;
    private static String l;
    public static int p;
    private static int u;
    private Button A;
    private a9z B;
    private ImageButton C;
    private OnClickListener D;
    private boolean E;
    private View F;
    private WakeLock G;
    private Handler H;
    private View I;
    private GalleryView J;
    private TextView K;
    private Handler L;
    private ImageButton M;
    private a4d b;
    private View c;
    private l5 d;
    private TextView e;
    private float g;
    private k3 h;
    private ConversationTextEntry i;
    private List j;
    private Runnable k;
    private Sensor m;
    private HashSet n;
    private HashSet o;
    private String q;
    private a23 r;
    private SensorManager s;
    private co t;
    private SensorEventListener v;
    private Runnable w;
    private HashSet x;
    private View y;
    private TextEmojiLabel z;

    public void d(String str) {
        try {
            if (this.d == null) {
                return;
            }
            if (str.equals(this.d.p)) {
                d();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static GalleryView f(PopupNotification popupNotification) {
        return popupNotification.J;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (i8.q()) {
                return false;
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private int b(int i) {
        try {
            return this.j.size() > 1 ? i - 1 : i;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void b() {
        try {
            Log.i(N[6]);
            this.g = 5.0f;
            this.H.removeCallbacks(this.k);
            this.H.postDelayed(this.k, 600);
            if (this.v != null) {
                return;
            }
            if (this.m != null) {
                this.v = new e(this);
                this.s.registerListener(this.v, this.m, 0);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void d() {
        if (this.d != null) {
            Bitmap w;
            Bitmap a = this.d.a(getResources().getDimensionPixelSize(2131427544), getResources().getDimension(2131427359), true);
            if (a == null) {
                w = this.d.w();
            } else {
                w = a;
            }
            ((ImageView) findViewById(2131755819)).setImageBitmap(w);
        }
    }

    static float a(PopupNotification popupNotification, float f) {
        popupNotification.g = f;
        return f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View h(com.whatsapp.protocol.co r8) {
        /*
        r7 = this;
        r6 = 17;
        r1 = 0;
        r2 = new android.widget.TextView;
        r2.<init>(r7);
        r0 = r8.A;
        r2.setText(r0);
        r0 = r7.getResources();
        r0 = com.whatsapp.ConversationRow.a(r0);
        r2.setTextSize(r0);
        r2.setGravity(r6);
        r0 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r2.setTextColor(r0);
        r0 = r8.c();	 Catch:{ UnsupportedEncodingException -> 0x00bd, d -> 0x009d, IOException -> 0x00a3 }
        r0 = q.k(r0);	 Catch:{ UnsupportedEncodingException -> 0x00bd, d -> 0x009d, IOException -> 0x00a3 }
    L_0x0028:
        if (r0 == 0) goto L_0x0040;
    L_0x002a:
        r3 = r0.e;	 Catch:{ UnsupportedEncodingException -> 0x00a9 }
        if (r3 == 0) goto L_0x0040;
    L_0x002e:
        r3 = r0.e;	 Catch:{ UnsupportedEncodingException -> 0x00ab }
        r3 = r3.length;	 Catch:{ UnsupportedEncodingException -> 0x00ab }
        if (r3 <= 0) goto L_0x0040;
    L_0x0033:
        r0 = r0.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ad, StringIndexOutOfBoundsException -> 0x00bb, IllegalArgumentException -> 0x00b9 }
        r3 = 0;
        r0 = android.backport.util.Base64.decode(r0, r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ad, StringIndexOutOfBoundsException -> 0x00bb, IllegalArgumentException -> 0x00b9 }
        r3 = 0;
        r4 = r0.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ad, StringIndexOutOfBoundsException -> 0x00bb, IllegalArgumentException -> 0x00b9 }
        r1 = android.graphics.BitmapFactory.decodeByteArray(r0, r3, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ad, StringIndexOutOfBoundsException -> 0x00bb, IllegalArgumentException -> 0x00b9 }
    L_0x0040:
        r0 = r7.getResources();
        r3 = 2130839775; // 0x7f0208df float:1.728457E38 double:1.0527747296E-314;
        r0 = r0.getDrawable(r3);
        if (r1 == 0) goto L_0x006c;
    L_0x004d:
        r3 = r0.getIntrinsicWidth();
        r4 = r7.b;
        r4 = r4.v;
        r1 = com.whatsapp.util.ag.a(r1, r3, r4);
        r3 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
        r4 = r7.getResources();	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
        r3.<init>(r4, r1);	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
        r1 = 0;
        r4 = 0;
        r5 = 0;
        r2.setCompoundDrawablesWithIntrinsicBounds(r3, r1, r4, r5);	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
        r1 = p;	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
        if (r1 == 0) goto L_0x0072;
    L_0x006c:
        r1 = 0;
        r3 = 0;
        r4 = 0;
        r2.setCompoundDrawablesWithIntrinsicBounds(r0, r1, r3, r4);	 Catch:{ UnsupportedEncodingException -> 0x00b7 }
    L_0x0072:
        r0 = r7.b;
        r0 = r0.p;
        r0 = (int) r0;
        r2.setCompoundDrawablePadding(r0);
        r0 = r7.b;
        r0 = r0.p;
        r0 = (int) r0;
        r1 = r7.b;
        r1 = r1.p;
        r1 = (int) r1;
        r3 = r7.b;
        r3 = r3.p;
        r3 = (int) r3;
        r4 = r7.b;
        r4 = r4.p;
        r4 = (int) r4;
        r2.setPadding(r0, r1, r3, r4);
        r0 = new android.widget.RelativeLayout;
        r0.<init>(r7);
        r0.setGravity(r6);
        r0.addView(r2);
        return r0;
    L_0x009d:
        r0 = move-exception;
    L_0x009e:
        com.whatsapp.util.Log.c(r0);
        r0 = r1;
        goto L_0x0028;
    L_0x00a3:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = r1;
        goto L_0x0028;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedEncodingException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = move-exception;
    L_0x00ae:
        r3 = N;
        r4 = 1;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r0);
        goto L_0x0040;
    L_0x00b7:
        r0 = move-exception;
        throw r0;
    L_0x00b9:
        r0 = move-exception;
        goto L_0x00ae;
    L_0x00bb:
        r0 = move-exception;
        goto L_0x00ae;
    L_0x00bd:
        r0 = move-exception;
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.h(com.whatsapp.protocol.co):android.view.View");
    }

    static {
        String[] strArr = new String[28];
        String str = "K=d!\u0011U=`=\u0007R1u \bT<;#\u0000P7a$";
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
                        i3 = 59;
                        break;
                    case at.g /*1*/:
                        i3 = 82;
                        break;
                    case at.i /*2*/:
                        i3 = 20;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 97;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;&\u0004H'y1";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;9\u0012\\h";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;7\r^3f:\u000eO;r=\u0002Z&};\u000fHh";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;'\u0015T\"";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;#\u0000P7a$\b]<q1\u0005^6";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "H7z'\u000eI";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;7\u0013^3`1";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "K=c1\u0013";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "R<d!\u0015d?q \tT6";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;'\u0004U6q:\u0015I+;t\u0012X q1\u000fd\"{'[";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001b?q'\u0012Z5q\u000b\u0011T!.";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;'\u0004U6q:\u0015I+;1\fK&mt\u0015^*`t";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u001b?q'\u0012Z5q'OH;n1[";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;0\bZ>{3LH=r \u0016Z qy\u0000Y=a LO=91\u0019K;f1";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;7\u000eN<`n";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;=\u000fR&d;\u0011N\"";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "S&`$\u0012\u0001};9\u0000K!:3\u000eT5x1OX=y{\fZ\"gk\u0010\u0006";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    str = "\u0007}uj";
                    obj = 19;
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    strArr2 = strArr3;
                    str = "g!?";
                    obj = 20;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001d!x8\\";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u000734<\u0013^4)v";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0019l";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;$\u0000N!q";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;'\u0015Z `";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;0\u0004H&f;\u0018";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    N = strArr3;
                    u = 200;
                    char[] toCharArray2 = "K7f9\bH!};\u000fd4f5\u0006V7z ".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case v.m /*0*/:
                                i5 = 59;
                                break;
                            case at.g /*1*/:
                                i5 = 82;
                                break;
                            case at.i /*2*/:
                                i5 = 20;
                                break;
                            case at.o /*3*/:
                                i5 = 84;
                                break;
                            default:
                                i5 = 97;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    l = new String(cArr2).intern();
                    f = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = "K=d!\u0011U=`=\u0007R1u \bT<;7\u000eU&u7\u0015\u0016&|!\fY}v5\u0012^d y\u0005^1{0\u0004\u00147f&\u000eI";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static l5 a(PopupNotification popupNotification) {
        return popupNotification.d;
    }

    private void f() {
        try {
            App.a_();
            if (this.t != null) {
                this.n.add(this.t.k);
            }
            try {
                if (this.j.size() > 1) {
                    int a = (this.J.a() - 1) - 1;
                    if (a < 0) {
                        a = this.j.size() - 1;
                    }
                    this.J.setCurrentScreen(a + 1);
                    View childAt = this.J.getChildAt(a + 1);
                    try {
                        if (App.a1()) {
                            a = 1;
                        } else {
                            a = -1;
                        }
                        Animation translateAnimation = new TranslateAnimation((float) ((a * (-childAt.getWidth())) / 2), 0.0f, 0.0f, 0.0f);
                        translateAnimation.setDuration((long) u);
                        translateAnimation.setFillAfter(true);
                        childAt.startAnimation(translateAnimation);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static ConversationTextEntry c(PopupNotification popupNotification) {
        return popupNotification.i;
    }

    static float i(PopupNotification popupNotification) {
        return popupNotification.g;
    }

    public void m771a() {
        try {
            if (!this.j.isEmpty()) {
                c(b(this.J.a()));
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void onBackPressed() {
        i();
        super.onBackPressed();
    }

    private View f(co coVar) {
        try {
            switch (coVar.c) {
                case v.m /*0*/:
                    return a(coVar);
                case at.g /*1*/:
                    return c(coVar);
                case at.i /*2*/:
                    return e(coVar);
                case at.o /*3*/:
                    return b(coVar);
                case at.p /*4*/:
                    return h(coVar);
                case at.m /*5*/:
                    return d(coVar);
                case Y.l /*9*/:
                    return g(coVar);
                default:
                    return new TextView(this);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    static k3 o(PopupNotification popupNotification) {
        return popupNotification.h;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View d(com.whatsapp.protocol.co r12) {
        /*
        r11 = this;
        r10 = 1;
        r4 = p;
        r5 = new android.widget.RelativeLayout;
        r5.<init>(r11);
        r0 = 17;
        r5.setGravity(r0);
        r0 = r11.getLayoutInflater();
        r1 = 2130903132; // 0x7f03005c float:1.7413073E38 double:1.052806032E-314;
        r6 = r0.inflate(r1, r5, r10);
        r0 = 2131755555; // 0x7f100223 float:1.9141993E38 double:1.053227185E-314;
        r0 = r6.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = 2131755556; // 0x7f100224 float:1.9141995E38 double:1.0532271856E-314;
        r1 = r6.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 0;
        r3 = r12.A;
        r3 = android.text.TextUtils.isEmpty(r3);
        if (r3 != 0) goto L_0x015b;
    L_0x0033:
        r2 = r12.A;
        r3 = "\n";
        r2 = r2.split(r3);
        r3 = r2;
    L_0x003d:
        if (r3 == 0) goto L_0x0042;
    L_0x003f:
        r2 = r3.length;	 Catch:{ IllegalArgumentException -> 0x014d }
        if (r2 != 0) goto L_0x004e;
    L_0x0042:
        r2 = 8;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x014f }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x014f }
        if (r4 == 0) goto L_0x0114;
    L_0x004e:
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x0151 }
        r2 = r12.q;	 Catch:{ IllegalArgumentException -> 0x0151 }
        if (r2 == 0) goto L_0x0061;
    L_0x0056:
        r2 = "";
        r7 = r12.q;	 Catch:{ IllegalArgumentException -> 0x0151 }
        r2 = r2.equals(r7);	 Catch:{ IllegalArgumentException -> 0x0151 }
        if (r2 == 0) goto L_0x00aa;
    L_0x0061:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = N;
        r8 = 19;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r7 = r12.A;
        r8 = N;
        r9 = 21;
        r8 = r8[r9];
        r9 = "+";
        r7 = r7.replaceAll(r8, r9);
        r7 = android.net.Uri.encode(r7);
        r2 = r2.append(r7);
        r7 = N;
        r8 = 22;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r8 = r12.m;
        r2 = r2.append(r8);
        r7 = ",";
        r2 = r2.append(r7);
        r8 = r12.l;
        r2 = r2.append(r8);
        r2 = r2.toString();
        if (r4 == 0) goto L_0x00ac;
    L_0x00aa:
        r2 = r12.q;
    L_0x00ac:
        r7 = 0;
        r0.setAutoLinkMask(r7);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0153 }
        r7.<init>();	 Catch:{ IllegalArgumentException -> 0x0153 }
        r8 = N;	 Catch:{ IllegalArgumentException -> 0x0153 }
        r9 = 23;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0153 }
        r7 = r7.append(r8);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r7 = r7.append(r2);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r8 = N;	 Catch:{ IllegalArgumentException -> 0x0153 }
        r9 = 24;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0153 }
        r7 = r7.append(r8);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r8 = 0;
        r8 = r3[r8];	 Catch:{ IllegalArgumentException -> 0x0153 }
        r7 = r7.append(r8);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r8 = N;	 Catch:{ IllegalArgumentException -> 0x0153 }
        r9 = 20;
        r8 = r8[r9];	 Catch:{ IllegalArgumentException -> 0x0153 }
        r7 = r7.append(r8);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r7 = r7.toString();	 Catch:{ IllegalArgumentException -> 0x0153 }
        r7 = android.text.Html.fromHtml(r7);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r0.setText(r7);	 Catch:{ IllegalArgumentException -> 0x0153 }
        r7 = r3.length;	 Catch:{ IllegalArgumentException -> 0x0153 }
        if (r7 <= r10) goto L_0x0104;
    L_0x00ec:
        r7 = "";
        r8 = 1;
        r8 = r3[r8];	 Catch:{ IllegalArgumentException -> 0x0155 }
        r7 = r7.equals(r8);	 Catch:{ IllegalArgumentException -> 0x0155 }
        if (r7 != 0) goto L_0x0104;
    L_0x00f8:
        r7 = 0;
        r1.setVisibility(r7);	 Catch:{ IllegalArgumentException -> 0x0157 }
        r7 = 1;
        r3 = r3[r7];	 Catch:{ IllegalArgumentException -> 0x0157 }
        r1.setText(r3);	 Catch:{ IllegalArgumentException -> 0x0157 }
        if (r4 == 0) goto L_0x0109;
    L_0x0104:
        r3 = 8;
        r1.setVisibility(r3);	 Catch:{ IllegalArgumentException -> 0x0157 }
    L_0x0109:
        r3 = new com.whatsapp.notification.t;
        r3.<init>(r11, r2);
        r0.setOnClickListener(r3);
        r1.setOnClickListener(r3);
    L_0x0114:
        r0 = 2131755454; // 0x7f1001be float:1.9141788E38 double:1.053227135E-314;
        r0 = r6.findViewById(r0);
        r0 = (com.whatsapp.ThumbnailButton) r0;
        r1 = r11.b;
        r1 = r1.p;
        r1 = (int) r1;
        r0.setPadding(r1, r1, r1, r1);
        r1 = r11.b;
        r1 = r1.v;
        r0.setRadius(r1);
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.setBorderSize(r1);
        r1 = 1711276032; // 0x66000000 float:1.5111573E23 double:8.45482698E-315;
        r0.setBorderColor(r1);
        r1 = com.whatsapp.util.bd.a(r12);
        if (r1 == 0) goto L_0x0141;
    L_0x013c:
        r0.setImageBitmap(r1);	 Catch:{ IllegalArgumentException -> 0x0159 }
        if (r4 == 0) goto L_0x0147;
    L_0x0141:
        r1 = 2130839630; // 0x7f02084e float:1.7284276E38 double:1.052774658E-314;
        r0.setImageResource(r1);	 Catch:{ IllegalArgumentException -> 0x0159 }
    L_0x0147:
        r1 = r11.D;
        r0.setOnClickListener(r1);
        return r5;
    L_0x014d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x014f }
    L_0x014f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0151 }
    L_0x0151:
        r0 = move-exception;
        throw r0;
    L_0x0153:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0155 }
    L_0x0155:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0157 }
    L_0x0157:
        r0 = move-exception;
        throw r0;
    L_0x0159:
        r0 = move-exception;
        throw r0;
    L_0x015b:
        r3 = r2;
        goto L_0x003d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.d(com.whatsapp.protocol.co):android.view.View");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View a(com.whatsapp.protocol.co r7) {
        /*
        r6 = this;
        r5 = 2131427422; // 0x7f0b005e float:1.847646E38 double:1.053065066E-314;
        r4 = 0;
        r1 = new com.whatsapp.TextEmojiLabel;
        r1.<init>(r6);
        r0 = r7.d;
        r2 = 6;
        if (r0 != r2) goto L_0x0016;
    L_0x000e:
        r0 = com.whatsapp.ConversationRowDivider.b(r7);
        r2 = p;
        if (r2 == 0) goto L_0x001a;
    L_0x0016:
        r0 = r7.c();
    L_0x001a:
        r2 = r6.getResources();
        r2 = com.whatsapp.ConversationRow.a(r2);
        r1.setTextSize(r2);
        r2 = 17;
        r1.setGravity(r2);
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.setTextColor(r2);
        r2 = r6.getResources();
        r2 = r2.getDimensionPixelSize(r5);
        r3 = r6.getResources();
        r3 = r3.getDimensionPixelSize(r5);
        r1.setPadding(r2, r4, r3, r4);
        r1.a(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.a(com.whatsapp.protocol.co):android.view.View");
    }

    static void p(PopupNotification popupNotification) {
        popupNotification.f();
    }

    public static void e(String str) {
        try {
            if (f == null) {
                return;
            }
            if (f.g()) {
                try {
                    if (f.d != null) {
                        try {
                            if (str.equals(f.d.p)) {
                                f.finish();
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    protected void onStart() {
        Log.i(N[26]);
        super.onStart();
        this.E = true;
    }

    static HashSet s(PopupNotification popupNotification) {
        return popupNotification.n;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
        r12 = this;
        r11 = -1;
        r10 = -2;
        r2 = 1;
        r3 = 0;
        r5 = p;
        r0 = N;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r1 = 18;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00c4 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r0 = r12.J;	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r0 = r0.a();	 Catch:{ IllegalArgumentException -> 0x00c4 }
        r0 = r12.b(r0);	 Catch:{ IllegalArgumentException -> 0x00c4 }
        if (r0 != 0) goto L_0x00c8;
    L_0x001b:
        r0 = r12.i;	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r0 = r0.getText();	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00c6 }
        r0 = r0.length();	 Catch:{ IllegalArgumentException -> 0x00c6 }
        if (r0 != 0) goto L_0x00c8;
    L_0x002b:
        r1 = r2;
    L_0x002c:
        r0 = new java.util.ArrayList;
        r0.<init>();
        r12.j = r0;
        r0 = com.whatsapp.qa.g();
        r4 = r0.iterator();
    L_0x003b:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0098;
    L_0x0041:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r0 = com.whatsapp.qa.d(r0);
        r6 = r0.d;
        if (r6 <= 0) goto L_0x0096;
    L_0x004f:
        r6 = com.whatsapp.a3b.a(r12);
        r7 = r0.p;
        r6 = r6.b(r7);
        r7 = r6.a();
        if (r7 == 0) goto L_0x003b;
    L_0x005f:
        r6 = r6.b();	 Catch:{ IllegalArgumentException -> 0x00cb }
        r6 = java.lang.Integer.parseInt(r6);	 Catch:{ IllegalArgumentException -> 0x00cb }
        if (r6 != 0) goto L_0x006b;
    L_0x0069:
        if (r5 == 0) goto L_0x003b;
    L_0x006b:
        r6 = com.whatsapp.App.aK;
        r7 = r0.p;
        r0 = r0.d;
        r0 = r6.b(r7, r0);
        r6 = r0.iterator();
    L_0x0079:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0096;
    L_0x007f:
        r0 = r6.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r7 = r12.o;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r8 = r0.k;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r7 = r7.contains(r8);	 Catch:{ IllegalArgumentException -> 0x00cd }
        if (r7 != 0) goto L_0x0094;
    L_0x008f:
        r7 = r12.j;	 Catch:{ IllegalArgumentException -> 0x00cd }
        r7.add(r0);	 Catch:{ IllegalArgumentException -> 0x00cd }
    L_0x0094:
        if (r5 == 0) goto L_0x0079;
    L_0x0096:
        if (r5 == 0) goto L_0x003b;
    L_0x0098:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00cf }
        r4 = N;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r6 = 17;
        r4 = r4[r6];	 Catch:{ IllegalArgumentException -> 0x00cf }
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r4 = r12.j;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r4 = r4.size();	 Catch:{ IllegalArgumentException -> 0x00cf }
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00cf }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x00cf }
        r0 = r12.j;	 Catch:{ IllegalArgumentException -> 0x00cf }
        r0 = r0.isEmpty();	 Catch:{ IllegalArgumentException -> 0x00cf }
        if (r0 == 0) goto L_0x00d1;
    L_0x00c0:
        r12.finish();	 Catch:{ IllegalArgumentException -> 0x00cf }
    L_0x00c3:
        return;
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r1 = r3;
        goto L_0x002c;
    L_0x00cb:
        r0 = move-exception;
        throw r0;
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r0 = move-exception;
        throw r0;
    L_0x00d1:
        r0 = r12.j;	 Catch:{ IllegalArgumentException -> 0x0272 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0272 }
        if (r0 != r2) goto L_0x0101;
    L_0x00d9:
        r0 = 2131755841; // 0x7f100341 float:1.9142573E38 double:1.0532273264E-314;
        r0 = r12.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0274 }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0274 }
        r0 = 2131755840; // 0x7f100340 float:1.914257E38 double:1.053227326E-314;
        r0 = r12.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0274 }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0274 }
        r0 = r12.F;	 Catch:{ IllegalArgumentException -> 0x0274 }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0274 }
        r0 = r12.I;	 Catch:{ IllegalArgumentException -> 0x0274 }
        r4 = 8;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0274 }
        if (r5 == 0) goto L_0x0123;
    L_0x0101:
        r0 = 2131755841; // 0x7f100341 float:1.9142573E38 double:1.0532273264E-314;
        r0 = r12.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0274 }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0274 }
        r0 = 2131755840; // 0x7f100340 float:1.914257E38 double:1.053227326E-314;
        r0 = r12.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0274 }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0274 }
        r0 = r12.F;	 Catch:{ IllegalArgumentException -> 0x0274 }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0274 }
        r0 = r12.I;	 Catch:{ IllegalArgumentException -> 0x0274 }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0274 }
    L_0x0123:
        r0 = r12.j;	 Catch:{ IllegalArgumentException -> 0x0276 }
        r4 = new com.whatsapp.notification.a3;	 Catch:{ IllegalArgumentException -> 0x0276 }
        r4.<init>(r12);	 Catch:{ IllegalArgumentException -> 0x0276 }
        java.util.Collections.sort(r0, r4);	 Catch:{ IllegalArgumentException -> 0x0276 }
        r0 = r12.j;	 Catch:{ IllegalArgumentException -> 0x0276 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0276 }
        r4 = 100;
        if (r0 <= r4) goto L_0x0142;
    L_0x0137:
        r0 = r12.j;	 Catch:{ IllegalArgumentException -> 0x0276 }
        r4 = 0;
        r6 = 99;
        r0 = r0.subList(r4, r6);	 Catch:{ IllegalArgumentException -> 0x0276 }
        r12.j = r0;	 Catch:{ IllegalArgumentException -> 0x0276 }
    L_0x0142:
        r0 = r12.J;
        r0.removeAllViews();
        r0 = r12.j;
        r0 = r0.size();
        if (r0 <= r2) goto L_0x0170;
    L_0x014f:
        r0 = new android.widget.TextView;
        r0.<init>(r12);
        r4 = 17;
        r0.setGravity(r4);
        r4 = new android.widget.RelativeLayout;
        r4.<init>(r12);
        r6 = new android.widget.RelativeLayout$LayoutParams;
        r6.<init>(r11, r10);
        r7 = 13;
        r6.addRule(r7);
        r4.addView(r0, r6);
        r0 = r12.J;
        r0.addView(r4);
    L_0x0170:
        r0 = r12.j;
        r4 = r0.iterator();
    L_0x0176:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x01a7;
    L_0x017c:
        r0 = r4.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r0 = r12.f(r0);
        r6 = new android.widget.RelativeLayout;
        r6.<init>(r12);
        r7 = new android.widget.ScrollView;
        r7.<init>(r12);
        r8 = new android.widget.RelativeLayout$LayoutParams;
        r8.<init>(r11, r10);
        r9 = 13;
        r8.addRule(r9);
        r7.addView(r0);
        r6.addView(r7, r8);
        r0 = r12.J;
        r0.addView(r6);
        if (r5 == 0) goto L_0x0176;
    L_0x01a7:
        r0 = r12.j;
        r0 = r0.size();
        if (r0 <= r2) goto L_0x01d0;
    L_0x01af:
        r0 = new android.widget.TextView;
        r0.<init>(r12);
        r4 = 17;
        r0.setGravity(r4);
        r4 = new android.widget.RelativeLayout;
        r4.<init>(r12);
        r6 = new android.widget.RelativeLayout$LayoutParams;
        r6.<init>(r11, r10);
        r7 = 13;
        r6.addRule(r7);
        r4.addView(r0, r6);
        r0 = r12.J;
        r0.addView(r4);
    L_0x01d0:
        r0 = r12.t;	 Catch:{ IllegalArgumentException -> 0x0278 }
        if (r0 == 0) goto L_0x0283;
    L_0x01d4:
        if (r1 == 0) goto L_0x01e9;
    L_0x01d6:
        r0 = new android.os.Handler;
        r4 = android.os.Looper.getMainLooper();
        r0.<init>(r4);
        r4 = new com.whatsapp.notification.i;
        r4.<init>(r12);
        r0.post(r4);
        if (r5 == 0) goto L_0x0283;
    L_0x01e9:
        r0 = r12.j;
        r6 = r0.iterator();
        r4 = r3;
    L_0x01f0:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x020f;
    L_0x01f6:
        r0 = r6.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r0 = r0.k;	 Catch:{ IllegalArgumentException -> 0x027a }
        r7 = r12.t;	 Catch:{ IllegalArgumentException -> 0x027a }
        r7 = r7.k;	 Catch:{ IllegalArgumentException -> 0x027a }
        r0 = r0.equals(r7);	 Catch:{ IllegalArgumentException -> 0x027a }
        if (r0 == 0) goto L_0x020a;
    L_0x0208:
        if (r5 == 0) goto L_0x020f;
    L_0x020a:
        r0 = r4 + 1;
        if (r5 == 0) goto L_0x0280;
    L_0x020e:
        r4 = r0;
    L_0x020f:
        r0 = r12.j;
        r0 = r0.size();
        if (r4 != r0) goto L_0x0218;
    L_0x0217:
        r4 = r3;
    L_0x0218:
        r0 = r12.J;
        r4 = r12.a(r4);
        r0.setCurrentScreen(r4);
        r0 = 2130968591; // 0x7f04000f float:1.754584E38 double:1.052838373E-314;
        r4 = android.view.animation.AnimationUtils.loadAnimation(r12, r0);
        if (r1 == 0) goto L_0x027e;
    L_0x022a:
        r0 = r2;
    L_0x022b:
        r1 = u;
        r0 = r0 * r1;
        r0 = (long) r0;
        r4.setDuration(r0);
        r4.setFillAfter(r2);
        r0 = r12.e;
        r0.startAnimation(r4);
        r0 = r12.j;
        r0 = r0.get(r3);
        r0 = (com.whatsapp.protocol.co) r0;
        r0 = r0.k;
        r0 = r0.c;
        r0 = com.whatsapp.qa.d(r0);
        r1 = com.whatsapp.a3b.a(r12);
        r0 = r0.p;
        r0 = r1.b(r0);
        r0 = r0.b();
        r0 = java.lang.Integer.parseInt(r0);
        r1 = 2;
        if (r0 == r1) goto L_0x0262;
    L_0x025f:
        r1 = 3;
        if (r0 != r1) goto L_0x00c3;
    L_0x0262:
        r0 = r12.getWindow();	 Catch:{ IllegalArgumentException -> 0x0270 }
        r1 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r0.addFlags(r1);	 Catch:{ IllegalArgumentException -> 0x0270 }
        r12.b();	 Catch:{ IllegalArgumentException -> 0x0270 }
        goto L_0x00c3;
    L_0x0270:
        r0 = move-exception;
        throw r0;
    L_0x0272:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0274 }
    L_0x0274:
        r0 = move-exception;
        throw r0;
    L_0x0276:
        r0 = move-exception;
        throw r0;
    L_0x0278:
        r0 = move-exception;
        throw r0;
    L_0x027a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x027c }
    L_0x027c:
        r0 = move-exception;
        throw r0;
    L_0x027e:
        r0 = 2;
        goto L_0x022b;
    L_0x0280:
        r4 = r0;
        goto L_0x01f0;
    L_0x0283:
        r4 = r3;
        goto L_0x0218;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.j():void");
    }

    static co h(PopupNotification popupNotification) {
        return popupNotification.t;
    }

    static void b(PopupNotification popupNotification) {
        popupNotification.c();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View g(com.whatsapp.protocol.co r11) {
        /*
        r10 = this;
        r5 = p;
        r6 = new android.widget.RelativeLayout;
        r6.<init>(r10);
        r0 = 17;
        r6.setGravity(r0);
        r0 = r10.getLayoutInflater();
        r1 = 2130903126; // 0x7f030056 float:1.7413061E38 double:1.052806029E-314;
        r2 = 1;
        r4 = r0.inflate(r1, r6, r2);
        r0 = 2131755126; // 0x7f100076 float:1.9141122E38 double:1.053226973E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = 2131755127; // 0x7f100077 float:1.9141124E38 double:1.0532269736E-314;
        r1 = r4.findViewById(r1);
        r1 = (com.whatsapp.TextEmojiLabel) r1;
        r2 = 2131755455; // 0x7f1001bf float:1.914179E38 double:1.0532271357E-314;
        r2 = r4.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = 2131755548; // 0x7f10021c float:1.9141978E38 double:1.0532271816E-314;
        r7 = r4.findViewById(r3);
        r3 = 2131755549; // 0x7f10021d float:1.914198E38 double:1.053227182E-314;
        r3 = r4.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r8 = 2131755550; // 0x7f10021e float:1.9141982E38 double:1.0532271826E-314;
        r8 = r4.findViewById(r8);
        r9 = 2131755551; // 0x7f10021f float:1.9141984E38 double:1.053227183E-314;
        r4 = r4.findViewById(r9);
        r4 = (android.widget.TextView) r4;
        r9 = com.whatsapp.util.cb.a(r10, r11);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r0.setImageDrawable(r9);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r0 = r11.a;	 Catch:{ IllegalArgumentException -> 0x00b6 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x00b6 }
        if (r0 == 0) goto L_0x006a;
    L_0x0062:
        r0 = 2131232185; // 0x7f0805b9 float:1.8080472E38 double:1.052968606E-314;
        r1.setText(r0);	 Catch:{ IllegalArgumentException -> 0x00b8 }
        if (r5 == 0) goto L_0x006f;
    L_0x006a:
        r0 = r11.a;	 Catch:{ IllegalArgumentException -> 0x00b8 }
        r1.setText(r0);	 Catch:{ IllegalArgumentException -> 0x00b8 }
    L_0x006f:
        r0 = 0;
        r3.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00ba }
        r0 = 0;
        r8.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00ba }
        r0 = com.whatsapp.App.z();	 Catch:{ IllegalArgumentException -> 0x00ba }
        r8 = r11.z;	 Catch:{ IllegalArgumentException -> 0x00ba }
        r0 = android.text.format.Formatter.formatShortFileSize(r0, r8);	 Catch:{ IllegalArgumentException -> 0x00ba }
        r3.setText(r0);	 Catch:{ IllegalArgumentException -> 0x00ba }
        r0 = r11.R;	 Catch:{ IllegalArgumentException -> 0x00ba }
        if (r0 == 0) goto L_0x0099;
    L_0x0088:
        r0 = 0;
        r2.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00bc }
        r0 = 0;
        r7.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00bc }
        r0 = com.whatsapp.util.cb.a(r11);	 Catch:{ IllegalArgumentException -> 0x00bc }
        r2.setText(r0);	 Catch:{ IllegalArgumentException -> 0x00bc }
        if (r5 == 0) goto L_0x00a3;
    L_0x0099:
        r0 = 8;
        r2.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00bc }
        r0 = 8;
        r7.setVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x00bc }
    L_0x00a3:
        r0 = r11.n;
        r0 = com.whatsapp.util.ag.c(r0);
        r0 = r0.toUpperCase();
        r4.setText(r0);
        r0 = r10.D;
        r6.setOnClickListener(r0);
        return r6;
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00bc }
    L_0x00bc:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.g(com.whatsapp.protocol.co):android.view.View");
    }

    public PopupNotification() {
        this.E = false;
        this.j = new ArrayList();
        this.n = new HashSet();
        this.o = new HashSet();
        this.x = new HashSet();
        this.G = null;
        this.r = new q(this);
        this.g = 5.0f;
        this.L = new Handler(Looper.getMainLooper());
        this.w = new ae(this);
        this.H = new Handler(Looper.getMainLooper());
        this.k = new n(this);
        this.q = null;
    }

    static List q(PopupNotification popupNotification) {
        return popupNotification.j;
    }

    static int a(PopupNotification popupNotification, int i) {
        return popupNotification.a(i);
    }

    public boolean g() {
        return this.E;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r8) {
        /*
        r7 = this;
        r5 = 2;
        r1 = 1;
        r2 = 0;
        r3 = p;
        r0 = r7.j;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r0.get(r8);	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ IllegalArgumentException -> 0x002b }
        r7.t = r0;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r7.B;	 Catch:{ IllegalArgumentException -> 0x002b }
        r4 = r7.t;	 Catch:{ IllegalArgumentException -> 0x002b }
        r4 = r4.k;	 Catch:{ IllegalArgumentException -> 0x002b }
        r4 = r4.c;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0.a(r4);	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r7.t;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r0.k;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r0.c;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = com.whatsapp.qa.d(r0);	 Catch:{ IllegalArgumentException -> 0x002b }
        r7.d = r0;	 Catch:{ IllegalArgumentException -> 0x002b }
        r0 = r7.d;	 Catch:{ IllegalArgumentException -> 0x002b }
        if (r0 != 0) goto L_0x002d;
    L_0x002a:
        return;
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r0 = com.whatsapp.App.q();	 Catch:{ IllegalArgumentException -> 0x012f }
        if (r0 == 0) goto L_0x0040;
    L_0x0033:
        r0 = r7.d;	 Catch:{ IllegalArgumentException -> 0x0131 }
        r0 = r0.c();	 Catch:{ IllegalArgumentException -> 0x0131 }
        if (r0 != 0) goto L_0x0040;
    L_0x003b:
        r0 = r7.d;	 Catch:{ IllegalArgumentException -> 0x0131 }
        com.whatsapp.App.a(r0);	 Catch:{ IllegalArgumentException -> 0x0131 }
    L_0x0040:
        r0 = r7.j;	 Catch:{ IllegalArgumentException -> 0x0133 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0133 }
        if (r0 == r1) goto L_0x004e;
    L_0x0048:
        r0 = com.whatsapp.App.q();	 Catch:{ IllegalArgumentException -> 0x0135 }
        if (r0 == 0) goto L_0x0060;
    L_0x004e:
        r0 = r7.n;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r4 = r7.t;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r4 = r4.k;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r0.add(r4);	 Catch:{ IllegalArgumentException -> 0x0135 }
        r0 = r7.x;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r4 = r7.d;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r4 = r4.p;	 Catch:{ IllegalArgumentException -> 0x0135 }
        r0.add(r4);	 Catch:{ IllegalArgumentException -> 0x0135 }
    L_0x0060:
        r7.d();
        r0 = 2131232225; // 0x7f0805e1 float:1.8080553E38 double:1.0529686257E-314;
        r4 = r7.t;
        r4 = r4.c;
        if (r4 != r5) goto L_0x0071;
    L_0x006c:
        r0 = 2131231398; // 0x7f0802a6 float:1.8078876E38 double:1.052968217E-314;
        if (r3 == 0) goto L_0x007b;
    L_0x0071:
        r4 = r7.t;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r4 = r4.c;	 Catch:{ IllegalArgumentException -> 0x0137 }
        r5 = 3;
        if (r4 != r5) goto L_0x007b;
    L_0x0078:
        r0 = 2131232279; // 0x7f080617 float:1.8080663E38 double:1.0529686524E-314;
    L_0x007b:
        r4 = r7.A;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r4.setText(r0);	 Catch:{ IllegalArgumentException -> 0x0139 }
        r0 = r7.z;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r4 = r7.d;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r0.setContact(r4);	 Catch:{ IllegalArgumentException -> 0x0139 }
        r0 = r7.d;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r0 = r0.c();	 Catch:{ IllegalArgumentException -> 0x0139 }
        if (r0 == 0) goto L_0x00be;
    L_0x008f:
        r0 = r7.K;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x0139 }
        r5 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r6 = r7.t;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r6 = r6.t;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r5 = r5.b(r6);	 Catch:{ IllegalArgumentException -> 0x0139 }
        r5 = r5.a(r7);	 Catch:{ IllegalArgumentException -> 0x0139 }
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x0139 }
        r5 = " ";
        r4 = r4.append(r5);	 Catch:{ IllegalArgumentException -> 0x0139 }
        r4 = r4.toString();	 Catch:{ IllegalArgumentException -> 0x0139 }
        r0.setText(r4);	 Catch:{ IllegalArgumentException -> 0x0139 }
        r0 = r7.K;	 Catch:{ IllegalArgumentException -> 0x0139 }
        r4 = 0;
        r0.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x0139 }
        if (r3 == 0) goto L_0x00f2;
    L_0x00be:
        r0 = r7.d;
        r0 = r0.d();
        r4 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x013b }
        if (r4 == 0) goto L_0x00d3;
    L_0x00ca:
        r4 = r7.K;	 Catch:{ IllegalArgumentException -> 0x013d }
        r5 = 8;
        r4.setVisibility(r5);	 Catch:{ IllegalArgumentException -> 0x013d }
        if (r3 == 0) goto L_0x00f2;
    L_0x00d3:
        r3 = r7.K;	 Catch:{ IllegalArgumentException -> 0x013d }
        r4 = 0;
        r3.setVisibility(r4);	 Catch:{ IllegalArgumentException -> 0x013d }
        r3 = r7.K;	 Catch:{ IllegalArgumentException -> 0x013d }
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x013d }
        r4.<init>();	 Catch:{ IllegalArgumentException -> 0x013d }
        r0 = r4.append(r0);	 Catch:{ IllegalArgumentException -> 0x013d }
        r4 = " ";
        r0 = r0.append(r4);	 Catch:{ IllegalArgumentException -> 0x013d }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x013d }
        r3.setText(r0);	 Catch:{ IllegalArgumentException -> 0x013d }
    L_0x00f2:
        r0 = r7.e;	 Catch:{ IllegalArgumentException -> 0x013f }
        r3 = 2131231425; // 0x7f0802c1 float:1.807893E38 double:1.0529682304E-314;
        r4 = 2;
        r4 = new java.lang.Object[r4];	 Catch:{ IllegalArgumentException -> 0x013f }
        r5 = 0;
        r6 = r8 + 1;
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalArgumentException -> 0x013f }
        r4[r5] = r6;	 Catch:{ IllegalArgumentException -> 0x013f }
        r5 = 1;
        r6 = r7.j;	 Catch:{ IllegalArgumentException -> 0x013f }
        r6 = r6.size();	 Catch:{ IllegalArgumentException -> 0x013f }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalArgumentException -> 0x013f }
        r4[r5] = r6;	 Catch:{ IllegalArgumentException -> 0x013f }
        r3 = r7.getString(r3, r4);	 Catch:{ IllegalArgumentException -> 0x013f }
        r0.setText(r3);	 Catch:{ IllegalArgumentException -> 0x013f }
        r3 = r7.M;	 Catch:{ IllegalArgumentException -> 0x013f }
        r0 = r7.i;	 Catch:{ IllegalArgumentException -> 0x013f }
        r0 = r0.getText();	 Catch:{ IllegalArgumentException -> 0x013f }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x013f }
        r0 = r0.length();	 Catch:{ IllegalArgumentException -> 0x013f }
        if (r0 == 0) goto L_0x0141;
    L_0x0129:
        r0 = r1;
    L_0x012a:
        r3.setEnabled(r0);
        goto L_0x002a;
    L_0x012f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0131 }
    L_0x0131:
        r0 = move-exception;
        throw r0;
    L_0x0133:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0135 }
    L_0x0135:
        r0 = move-exception;
        throw r0;
    L_0x0137:
        r0 = move-exception;
        throw r0;
    L_0x0139:
        r0 = move-exception;
        throw r0;
    L_0x013b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x013d }
    L_0x013d:
        r0 = move-exception;
        throw r0;
    L_0x013f:
        r0 = move-exception;
        throw r0;
    L_0x0141:
        r0 = r2;
        goto L_0x012a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.c(int):void");
    }

    static a9z k(PopupNotification popupNotification) {
        return popupNotification.B;
    }

    private void c() {
        try {
            Log.i(N[0]);
            if (this.G != null) {
                if (!this.G.isHeld()) {
                    this.G.acquire();
                }
            }
            this.L.removeCallbacks(this.w);
            this.L.postDelayed(this.w, 5000);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static SensorManager u(PopupNotification popupNotification) {
        return popupNotification.s;
    }

    public void onStop() {
        Log.i(N[5]);
        super.onStop();
        this.E = false;
        this.B.b(false);
    }

    static SensorEventListener a(PopupNotification popupNotification, SensorEventListener sensorEventListener) {
        popupNotification.v = sensorEventListener;
        return sensorEventListener;
    }

    private void a(ThumbnailButton thumbnailButton) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131427531);
        thumbnailButton.setMinimumHeight(dimensionPixelSize);
        thumbnailButton.setMaxHeight(dimensionPixelSize);
        thumbnailButton.setAdjustViewBounds(true);
        thumbnailButton.setScaleType(ScaleType.FIT_CENTER);
        int i = (int) this.b.p;
        try {
            thumbnailButton.setPadding(i, i, i, i);
            thumbnailButton.setRadius(this.b.v);
            if (thumbnailButton instanceof ThumbnailTextButton) {
                ((ThumbnailTextButton) thumbnailButton).setTextSize(((float) dimensionPixelSize) / 7.0f);
                ((ThumbnailTextButton) thumbnailButton).setTextGravity(5);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void b(String str) {
        try {
            if (this.d == null) {
                return;
            }
            if (str.equals(this.d.p) && !qm.i(str)) {
                Object d = this.d.d();
                try {
                    if (TextUtils.isEmpty(d)) {
                        this.K.setVisibility(8);
                        if (p == 0) {
                            return;
                        }
                    }
                    this.K.setVisibility(0);
                    this.K.setText(d + " ");
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    static SensorEventListener t(PopupNotification popupNotification) {
        return popupNotification.v;
    }

    static WakeLock r(PopupNotification popupNotification) {
        return popupNotification.G;
    }

    static void g(PopupNotification popupNotification) {
        popupNotification.i();
    }

    static void j(PopupNotification popupNotification) {
        popupNotification.k();
    }

    static HashSet l(PopupNotification popupNotification) {
        return popupNotification.x;
    }

    protected void onPause() {
        Log.i(N[25]);
        super.onPause();
        this.B.b(false);
        App.H();
    }

    static int h() {
        return u;
    }

    protected void onCreate(Bundle bundle) {
        int i = p;
        try {
            requestWindowFeature(1);
            if (VERSION.SDK_INT >= 17) {
                getWindow().getDecorView().setLayoutDirection(3);
            }
            super.onCreate(bundle);
            getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131624052)));
            this.s = (SensorManager) getSystemService(N[7]);
            this.m = this.s.getDefaultSensor(8);
            Log.i(N[8]);
            PowerManager powerManager = (PowerManager) App.z().getSystemService(N[9]);
            if (powerManager != null) {
                try {
                    this.G = powerManager.newWakeLock(268435466, N[10]);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            setContentView(aam.a(getLayoutInflater(), 2130903250, null, false));
            f = this;
            this.b = a4d.a();
            this.J = (GalleryView) findViewById(2131755844);
            this.i = (ConversationTextEntry) findViewById(2131755509);
            this.A = (Button) findViewById(2131755846);
            this.z = (TextEmojiLabel) findViewById(2131755839);
            this.K = (TextView) findViewById(2131755429);
            this.e = (TextView) findViewById(2131755842);
            this.c = findViewById(2131755696);
            ((ImageView) this.c).setImageDrawable(new bz(getResources().getDrawable(2130839765)));
            this.F = findViewById(2131755837);
            this.y = findViewById(2131755695);
            ((ImageView) this.y).setImageDrawable(new bz(getResources().getDrawable(2130839766)));
            this.I = findViewById(2131755836);
            this.M = (ImageButton) findViewById(2131755512);
            this.C = (ImageButton) findViewById(2131755513);
            this.J.setEventCallback(new ai(this));
            findViewById(2131755845).setOnClickListener(new p(this));
            this.D = new a(this);
            this.A.setOnClickListener(this.D);
            OnClickListener akVar = new ak(this);
            this.c.setOnClickListener(akVar);
            this.F.setOnClickListener(akVar);
            akVar = new aq(this);
            this.y.setOnClickListener(akVar);
            this.I.setOnClickListener(akVar);
            this.M.setImageDrawable(new bz(getResources().getDrawable(2130839610)));
            findViewById(2131755505).setBackgroundDrawable(new bz(getResources().getDrawable(2130839596)));
            this.i.setOnClickListener(new aa(this));
            ((ViewStub) findViewById(2131755511)).inflate();
            this.B = new y(this, this, new x(this));
            this.C.setOnTouchListener(new a9(this));
            this.C.setVisibility(0);
            this.M.setVisibility(8);
            this.i.addTextChangedListener(new l(this));
            this.i.setOnEditorActionListener(new ar(this));
            this.M.setOnClickListener(new g(this));
            this.h = new k3(this);
            this.h.a(this.r);
            this.h.a(null);
            try {
                ((ImageButton) findViewById(2131755508)).setOnClickListener(new v(this));
                j();
                App.b((tm) this);
                if (App.aC()) {
                    showDialog(115);
                }
                if (i != 0) {
                    WAAppCompatActivity.c++;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static void m(PopupNotification popupNotification) {
        popupNotification.e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r10 = this;
        r9 = 0;
        r8 = 1;
        r1 = p;
        r0 = f;
        if (r0 != r10) goto L_0x00a8;
    L_0x0008:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = N;
        r3 = 4;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r10.x;
        r2 = r2.size();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.App.a_();
        r0 = r10.x;
        r2 = r0.iterator();
    L_0x0030:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00a8;
    L_0x0036:
        r0 = r2.next();
        r0 = (java.lang.String) r0;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = com.whatsapp.qa.d(r0);
        r0 = r10.n;
        r5 = r0.iterator();
    L_0x004b:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x006a;
    L_0x0051:
        r0 = r5.next();
        r0 = (com.whatsapp.protocol.c3) r0;
        r6 = r0.c;	 Catch:{ IllegalArgumentException -> 0x00ac }
        if (r6 == 0) goto L_0x0068;
    L_0x005b:
        r6 = r0.c;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r7 = r4.p;	 Catch:{ IllegalArgumentException -> 0x00ae }
        r6 = r6.equals(r7);	 Catch:{ IllegalArgumentException -> 0x00ae }
        if (r6 == 0) goto L_0x0068;
    L_0x0065:
        r3.add(r0);	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x0068:
        if (r1 == 0) goto L_0x004b;
    L_0x006a:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r5 = N;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r6 = 3;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r0 = r0.append(r5);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r5 = r3.size();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r0 = r0.append(r5);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r5 = "/";
        r0 = r0.append(r5);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r5 = r4.d;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r0 = r0.append(r5);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r0 = r0.toString();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r0 = r3.size();	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r5 = r4.d;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        if (r0 != r5) goto L_0x00a6;
    L_0x009c:
        r0 = 0;
        r5 = 1;
        com.whatsapp.App.a(r4, r0, r5);	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r0 = r10.n;	 Catch:{ IllegalArgumentException -> 0x00b0 }
        r0.removeAll(r3);	 Catch:{ IllegalArgumentException -> 0x00b0 }
    L_0x00a6:
        if (r1 == 0) goto L_0x0030;
    L_0x00a8:
        com.whatsapp.App.b(r8, r8, r8, r9);
        return;
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.i():void");
    }

    static ImageButton n(PopupNotification popupNotification) {
        return popupNotification.C;
    }

    public void onDestroy() {
        try {
            Log.i(N[27]);
            super.onDestroy();
            this.L.removeCallbacks(this.w);
            this.H.removeCallbacks(this.k);
            if (this.G != null) {
                if (this.G.isHeld()) {
                    this.G.release();
                }
            }
            try {
                if (this.v != null) {
                    this.s.unregisterListener(this.v);
                }
                try {
                    if (f == this) {
                        f = null;
                    }
                    i8.f();
                    App.a((tm) this);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    static ImageButton e(PopupNotification popupNotification) {
        return popupNotification.M;
    }

    public void a(Collection collection) {
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case arj.Theme_ratingBarStyle /*106*/:
                return new Builder(this).setMessage(getString(2131230891, new Object[]{this.d.a((Context) this)})).setPositiveButton(2131232177, new s(this)).setNegativeButton(2131230884, new o(this)).create();
            case 115:
                try {
                    Log.i(N[16]);
                    return pg.a((Activity) this);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            default:
                return super.onCreateDialog(i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View e(com.whatsapp.protocol.co r11) {
        /*
        r10 = this;
        r0 = r11.r;
        r1 = 1;
        if (r0 != r1) goto L_0x006b;
    L_0x0005:
        r0 = r10.getLayoutInflater();
        r1 = 2130903140; // 0x7f030064 float:1.741309E38 double:1.052806036E-314;
        r2 = 0;
        r3 = 0;
        r6 = r0.inflate(r1, r2, r3);
        r0 = 2131755525; // 0x7f100205 float:1.9141932E38 double:1.05322717E-314;
        r2 = r6.findViewById(r0);
        r2 = (android.widget.ImageButton) r2;
        r0 = 2131755535; // 0x7f10020f float:1.9141952E38 double:1.053227175E-314;
        r5 = r6.findViewById(r0);
        r5 = (android.widget.TextView) r5;
        r0 = 2131755177; // 0x7f1000a9 float:1.9141226E38 double:1.0532269983E-314;
        r3 = r6.findViewById(r0);
        r3 = (android.widget.ProgressBar) r3;
        r4 = new com.whatsapp.i8;
        r4.<init>(r10);
        r4.c(r11);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r0 = new com.whatsapp.notification.r;	 Catch:{ IllegalArgumentException -> 0x0067 }
        r1 = r10;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r4.a(r0);	 Catch:{ IllegalArgumentException -> 0x0067 }
        r0 = r11.H;	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r0 == 0) goto L_0x0050;
    L_0x0042:
        r0 = r11.H;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r0 = (long) r0;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r0 = android.text.format.DateUtils.formatElapsedTime(r0);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r5.setText(r0);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r0 = p;	 Catch:{ IllegalArgumentException -> 0x0069 }
        if (r0 == 0) goto L_0x005d;
    L_0x0050:
        r0 = com.whatsapp.App.z();	 Catch:{ IllegalArgumentException -> 0x0069 }
        r8 = r11.z;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r0 = android.text.format.Formatter.formatShortFileSize(r0, r8);	 Catch:{ IllegalArgumentException -> 0x0069 }
        r5.setText(r0);	 Catch:{ IllegalArgumentException -> 0x0069 }
    L_0x005d:
        r0 = new com.whatsapp.notification.av;
        r0.<init>(r10, r4);
        r2.setOnClickListener(r0);
        r0 = r6;
    L_0x0066:
        return r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = new com.whatsapp.ThumbnailButton;
        r0.<init>(r10);
        r10.a(r0);
        r1 = 2130839628; // 0x7f02084c float:1.7284272E38 double:1.052774657E-314;
        r0.setImageResource(r1);
        r1 = r10.D;
        r0.setOnClickListener(r1);
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.e(com.whatsapp.protocol.co):android.view.View");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View c(com.whatsapp.protocol.co r3) {
        /*
        r2 = this;
        r0 = new com.whatsapp.ThumbnailButton;
        r0.<init>(r2);
        r2.a(r0);
        r1 = com.whatsapp.util.bd.a(r3);
        if (r1 == 0) goto L_0x0015;
    L_0x000e:
        r0.setImageBitmap(r1);	 Catch:{ IllegalArgumentException -> 0x0021 }
        r1 = p;	 Catch:{ IllegalArgumentException -> 0x0021 }
        if (r1 == 0) goto L_0x001b;
    L_0x0015:
        r1 = 2130839629; // 0x7f02084d float:1.7284274E38 double:1.0527746575E-314;
        r0.setImageResource(r1);	 Catch:{ IllegalArgumentException -> 0x0021 }
    L_0x001b:
        r1 = r2.D;
        r0.setOnClickListener(r1);
        return r0;
    L_0x0021:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.c(com.whatsapp.protocol.co):android.view.View");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View b(com.whatsapp.protocol.co r7) {
        /*
        r6 = this;
        r1 = new com.whatsapp.ThumbnailTextButton;
        r1.<init>(r6);
        r6.a(r1);
        r0 = r6.getResources();
        r2 = 2130839627; // 0x7f02084b float:1.728427E38 double:1.0527746565E-314;
        r0 = r0.getDrawable(r2);
        r1.setIcon(r0);
        r0 = com.whatsapp.util.bd.a(r7);
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r1.setImageBitmap(r0);	 Catch:{ IllegalArgumentException -> 0x003e }
        r0 = p;	 Catch:{ IllegalArgumentException -> 0x003e }
        if (r0 == 0) goto L_0x0029;
    L_0x0023:
        r0 = 2130839634; // 0x7f020852 float:1.7284284E38 double:1.05277466E-314;
        r1.setImageResource(r0);	 Catch:{ IllegalArgumentException -> 0x0040 }
    L_0x0029:
        r0 = 0;
        r2 = r7.H;	 Catch:{ IllegalArgumentException -> 0x0055 }
        if (r2 == 0) goto L_0x0042;
    L_0x002e:
        r0 = r7.H;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r2 = (long) r0;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r0 = android.text.format.DateUtils.formatElapsedTime(r2);	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x0035:
        r1.setText(r0);	 Catch:{ IllegalArgumentException -> 0x0055 }
    L_0x0038:
        r0 = r6.D;
        r1.setOnClickListener(r0);
        return r1;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r2 = r7.z;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0035;
    L_0x004a:
        r0 = com.whatsapp.App.z();	 Catch:{ IllegalArgumentException -> 0x0055 }
        r2 = r7.z;	 Catch:{ IllegalArgumentException -> 0x0055 }
        r0 = android.text.format.Formatter.formatShortFileSize(r0, r2);	 Catch:{ IllegalArgumentException -> 0x0055 }
        goto L_0x0035;
    L_0x0055:
        r0 = move-exception;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.PopupNotification.b(com.whatsapp.protocol.co):android.view.View");
    }

    private void e() {
        try {
            App.a_();
            if (this.t != null) {
                this.n.add(this.t.k);
            }
            try {
                if (this.j.size() > 1) {
                    int a = (this.J.a() - 1) + 1;
                    if (a >= this.j.size()) {
                        a = 0;
                    }
                    this.J.setCurrentScreen(a + 1);
                    View childAt = this.J.getChildAt(a + 1);
                    try {
                        if (App.a1()) {
                            a = 1;
                        } else {
                            a = -1;
                        }
                        Animation translateAnimation = new TranslateAnimation((float) ((a * childAt.getWidth()) / 2), 0.0f, 0.0f, 0.0f);
                        translateAnimation.setDuration((long) u);
                        translateAnimation.setFillAfter(true);
                        childAt.startAnimation(translateAnimation);
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public void c(String str) {
    }

    protected void onResume() {
        Log.i(N[2]);
        super.onResume();
    }

    private int a(int i) {
        try {
            return this.j.size() > 1 ? i + 1 : i;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void a(String str) {
    }

    static Sensor d(PopupNotification popupNotification) {
        return popupNotification.m;
    }

    static String a() {
        return l;
    }

    private void k() {
        int i = 0;
        try {
            if (this.d != null) {
                try {
                    if (aup.a(this.d.p)) {
                        showDialog(arj.Theme_ratingBarStyle);
                        return;
                    }
                    String trim = this.i.getText().toString().trim();
                    try {
                        if (trim.length() > 0) {
                            App.a(this.d, a28.a(trim));
                            TextKeyListener.clear(this.i.getText());
                            if (p == 0) {
                                App.a(this.d, false, true);
                                InputMethodManager inputMethodManager = (InputMethodManager) App.z().getSystemService(N[11]);
                                try {
                                    if (inputMethodManager.isFullscreenMode()) {
                                        inputMethodManager.hideSoftInputFromWindow(this.i.getWindowToken(), 0);
                                    }
                                    int a = this.J.a();
                                    int b = b(this.J.a());
                                    try {
                                        Log.i(N[12] + a + N[13] + b + N[15] + this.j.size());
                                        this.o.add(((co) this.j.get(b)).k);
                                        this.j.remove(b);
                                        if (this.j.isEmpty()) {
                                            i();
                                            finish();
                                            return;
                                        }
                                        boolean z;
                                        this.J.removeViewAt(a);
                                        if (b >= this.j.size()) {
                                            b--;
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (this.j.size() == 1) {
                                            this.J.removeViewAt(this.J.getChildCount() - 1);
                                            this.J.removeViewAt(0);
                                            findViewById(2131755841).setVisibility(8);
                                            findViewById(2131755840).setVisibility(8);
                                            this.F.setVisibility(8);
                                            this.I.setVisibility(8);
                                        } else {
                                            i = b;
                                        }
                                        i = a(i);
                                        try {
                                            this.J.setCurrentScreen(i);
                                            if (this.t != null) {
                                                this.n.add(this.t.k);
                                            }
                                            try {
                                                if (this.d != null) {
                                                    this.x.add(this.d.p);
                                                }
                                                View childAt = this.J.getChildAt(i);
                                                try {
                                                    int i2;
                                                    if (App.a1()) {
                                                        i = 1;
                                                    } else {
                                                        i = -1;
                                                    }
                                                    if (z) {
                                                        i2 = -1;
                                                    } else {
                                                        i2 = 1;
                                                    }
                                                    Animation translateAnimation = new TranslateAnimation((float) (((i2 * i) * childAt.getWidth()) / 2), 0.0f, 0.0f, 0.0f);
                                                    translateAnimation.setDuration((long) u);
                                                    translateAnimation.setFillAfter(true);
                                                    childAt.startAnimation(translateAnimation);
                                                    return;
                                                } catch (IllegalArgumentException e) {
                                                    throw e;
                                                }
                                            } catch (IllegalArgumentException e2) {
                                                throw e2;
                                            }
                                        } catch (IllegalArgumentException e22) {
                                            throw e22;
                                        }
                                    } catch (IllegalArgumentException e222) {
                                        throw e222;
                                    }
                                } catch (IllegalArgumentException e2222) {
                                    throw e2222;
                                }
                            }
                        }
                        Log.i(N[14] + this.j.size());
                    } catch (IllegalArgumentException e22222) {
                        throw e22222;
                    } catch (IllegalArgumentException e222222) {
                        throw e222222;
                    }
                } catch (IllegalArgumentException e2222222) {
                    throw e2222222;
                }
            }
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        }
    }
}
