package com.whatsapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.SoundPool;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager.WakeLock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.facebook.rebound.m;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.ClippingLayout;
import com.whatsapp.util.bz;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class a9z {
    private static final String[] F;
    private static int e;
    private static int f;
    private static SoundPool h;
    private static int u;
    private final as8 A;
    private String B;
    private int C;
    private TextView D;
    private View E;
    private int a;
    private float b;
    private Runnable c;
    private TextView d;
    private float g;
    private TextView i;
    private TextView j;
    private ss k;
    private WakeLock l;
    private final Handler m;
    private ClippingLayout n;
    private Activity o;
    private long p;
    private OnAudioFocusChangeListener q;
    private by r;
    private final Runnable s;
    private float t;
    private oh v;
    private final Rect w;
    private m x;
    private View y;
    private int z;

    static {
        String[] strArr = new String[18];
        String str = "36\n2m";
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
                        i3 = 82;
                        break;
                    case at.g /*1*/:
                        i3 = 67;
                        break;
                    case at.i /*2*/:
                        i3 = 110;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 2;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ":\"\u001e/k1\u001c\b>g6!\u000f8i\r&\u0000:`>&\n";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "$,\u00078g<,\u001a>-!7\u000f)v$,\u00078g<,\u001a>";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "$*\f)c&,\u001c";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "$,\u00078g<,\u001a>-!7\u000f)v$,\u00078g<,\u001a>-;-\u001e)m51\u000b(q";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "$,\u00078g<,\u001a>-!7\u000f)v$,\u00078g<,\u001a>";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "$,\u00078g<,\u001a>-!7\u0001+t=*\r>l=7\u000b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "$,\u00078g<,\u001a>-!7\u0001+t=*\r>l=7\u000btq&,\u001e{";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "$,\u00078g<,\u001a>-!7\u0001+t=*\r>l=7\u000btp7/\u000b:q7";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "$,\u00078g<,\u001a>-!7\u0001+t=*\r>l=7\u000b{f'1\u000f/k=-T";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "$,\u00078g<,\u001a>-!7\u0001+t=*\r>l=7\u000b{";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "$,\u00078g<,\u001a>-!7\u0001+t=*\r>l=7\u000btq&,\u001e{";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "$*\f)c&,\u001c";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ":\"\u001e/k1\u001c\b>g6!\u000f8i\r&\u0000:`>&\n";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "36\n2m";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\",\u0019>p";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "$,\u00078g<,\u001a>";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    F = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "36\n2m},\t<9r \u0001?g10S4r'0";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static Handler j(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.m;
    }

    static long a(a9z com_whatsapp_a9z, long j) {
        com_whatsapp_a9z.p = j;
        return j;
    }

    public static Animation a(boolean z) {
        Animation alphaAnimation;
        Animation animationSet = new AnimationSet(true);
        if (z) {
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else {
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setDuration(160);
        animationSet.addAnimation(alphaAnimation);
        if (z) {
            alphaAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        } else {
            alphaAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        }
        alphaAnimation.setDuration(160);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(160);
        return animationSet;
    }

    private void c() {
        this.o.findViewById(2131755957).setVisibility(4);
        View findViewById = this.o.findViewById(2131755517);
        findViewById.setVisibility(0);
        Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(213);
        translateAnimation.setStartOffset(640);
        translateAnimation.setFillBefore(true);
        findViewById.startAnimation(translateAnimation);
        View findViewById2 = this.o.findViewById(2131755514);
        findViewById2.setVisibility(0);
        Animation animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new DecelerateInterpolator(1.1f));
        translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -3.0f);
        translateAnimation.setDuration(640);
        translateAnimation.setRepeatMode(2);
        translateAnimation.setRepeatCount(1);
        Animation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(640);
        Animation scaleAnimation = new ScaleAnimation(1.0f, 0.61f, 1.0f, 0.61f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(320);
        scaleAnimation.setStartOffset(960);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation);
        View findViewById3 = this.o.findViewById(2131755518);
        Animation animationSet2 = new AnimationSet(true);
        translateAnimation = new TranslateAnimation(1, 0.0f, 1, -0.3f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(160);
        translateAnimation.setStartOffset(746);
        translateAnimation.setFillAfter(true);
        rotateAnimation = new RotateAnimation(0.0f, -60.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(160);
        rotateAnimation.setStartOffset(746);
        rotateAnimation.setFillAfter(true);
        animationSet2.addAnimation(rotateAnimation);
        animationSet2.addAnimation(translateAnimation);
        animationSet2.setFillAfter(true);
        findViewById3.setVisibility(0);
        findViewById3.startAnimation(animationSet2);
        View findViewById4 = this.o.findViewById(2131755508);
        findViewById4.setVisibility(4);
        findViewById2.startAnimation(animationSet);
        animationSet.setAnimationListener(new j5(this, findViewById2, findViewById, findViewById3, findViewById4));
    }

    static oh i(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.v;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(boolean r13) {
        /*
        r12 = this;
        r10 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.v;	 Catch:{ Exception -> 0x000b }
        if (r0 == 0) goto L_0x000a;
    L_0x0006:
        r0 = r12.B;	 Catch:{ Exception -> 0x000b }
        if (r0 != 0) goto L_0x000f;
    L_0x000a:
        return;
    L_0x000b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x000d }
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = F;
        r2 = 11;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r13);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r12.d();
        r0 = r12.B;
        com.whatsapp.App.I(r0);
        r0 = r12.o;
        r1 = 2131755483; // 0x7f1001db float:1.9141847E38 double:1.0532271495E-314;
        r0 = r0.findViewById(r1);
        r1 = 8;
        r0.setVisibility(r1);
        r0 = 0;
        r1 = r12.g;
        r1 = (int) r1;
        r1 = r1 * 960;
        r2 = r12.o;
        r3 = 2131755481; // 0x7f1001d9 float:1.9141842E38 double:1.0532271485E-314;
        r2 = r2.findViewById(r3);
        r2 = r2.getWidth();
        r1 = r1 / r2;
        r1 = 160 - r1;
        r11 = java.lang.Math.max(r0, r1);
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 >= r1) goto L_0x00d4;
    L_0x005f:
        r0 = new android.view.animation.ScaleAnimation;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r5 = 1;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = 1;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r0.setDuration(r2);
        r1 = r12.y;
        r1 = r1.getWidth();
        r1 = r1 / 4;
        r2 = com.whatsapp.App.av;
        if (r2 == 0) goto L_0x0347;
    L_0x0083:
        r1 = -r1;
        r5 = r1;
    L_0x0085:
        r1 = new android.view.animation.TranslateAnimation;
        r2 = 0;
        r3 = r12.g;
        r4 = (float) r5;
        r3 = r3 + r4;
        r4 = 0;
        r5 = (float) r5;
        r6 = 1;
        r7 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r8 = 1;
        r9 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r2 = new android.view.animation.AnimationSet;
        r3 = 1;
        r2.<init>(r3);
        r2.addAnimation(r0);	 Catch:{ Exception -> 0x02cc }
        r2.addAnimation(r1);	 Catch:{ Exception -> 0x02cc }
        r0 = (long) r11;	 Catch:{ Exception -> 0x02cc }
        r2.setDuration(r0);	 Catch:{ Exception -> 0x02cc }
        r0 = 1;
        r2.setFillBefore(r0);	 Catch:{ Exception -> 0x02cc }
        r0 = 0;
        r2.setFillAfter(r0);	 Catch:{ Exception -> 0x02cc }
        r0 = new android.view.animation.AnticipateOvershootInterpolator;	 Catch:{ Exception -> 0x02cc }
        r1 = 1069547520; // 0x3fc00000 float:1.5 double:5.28426686E-315;
        r0.<init>(r1);	 Catch:{ Exception -> 0x02cc }
        r2.setInterpolator(r0);	 Catch:{ Exception -> 0x02cc }
        r0 = r12.y;	 Catch:{ Exception -> 0x02cc }
        r0.clearAnimation();	 Catch:{ Exception -> 0x02cc }
        r0 = r12.y;	 Catch:{ Exception -> 0x02cc }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ Exception -> 0x02cc }
        r0 = new com.whatsapp.pq;	 Catch:{ Exception -> 0x02cc }
        r0.<init>(r12);	 Catch:{ Exception -> 0x02cc }
        r2.setAnimationListener(r0);	 Catch:{ Exception -> 0x02cc }
        r0 = r12.y;	 Catch:{ Exception -> 0x02cc }
        r0.startAnimation(r2);	 Catch:{ Exception -> 0x02cc }
        if (r10 == 0) goto L_0x010e;
    L_0x00d4:
        r0 = r12.x;	 Catch:{ Exception -> 0x02cc }
        r0.h();	 Catch:{ Exception -> 0x02cc }
        r0 = r12.x;	 Catch:{ Exception -> 0x02cc }
        r0 = r0.f();	 Catch:{ Exception -> 0x02cc }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x00fb;
    L_0x00e5:
        r0 = r12.x;	 Catch:{ Exception -> 0x02ce }
        r1 = new com.whatsapp.m0;	 Catch:{ Exception -> 0x02ce }
        r2 = r12.g;	 Catch:{ Exception -> 0x02ce }
        r2 = (int) r2;	 Catch:{ Exception -> 0x02ce }
        r1.<init>(r12, r2);	 Catch:{ Exception -> 0x02ce }
        r0.a(r1);	 Catch:{ Exception -> 0x02ce }
        r0 = r12.x;	 Catch:{ Exception -> 0x02ce }
        r2 = 0;
        r0.a(r2);	 Catch:{ Exception -> 0x02ce }
        if (r10 == 0) goto L_0x010e;
    L_0x00fb:
        r0 = r12.y;
        r1 = 4;
        r0.setVisibility(r1);
        r0 = r12.o;
        r1 = 2131755504; // 0x7f1001f0 float:1.914189E38 double:1.05322716E-314;
        r0 = r0.findViewById(r1);
        r1 = 0;
        r0.setVisibility(r1);
    L_0x010e:
        r0 = r12.o;
        r1 = 2131755955; // 0x7f1003b3 float:1.9142804E38 double:1.0532273827E-314;
        r0 = r0.findViewById(r1);
        r1 = 8;
        r0.setVisibility(r1);
        r1 = new android.view.animation.AlphaAnimation;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r1.<init>(r2, r3);
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r1.setDuration(r2);
        r0.startAnimation(r1);
        r0 = r12.o;
        r1 = 2131755507; // 0x7f1001f3 float:1.9141895E38 double:1.0532271613E-314;
        r0 = r0.findViewById(r1);
        r0.clearAnimation();
        r1 = new android.view.animation.AlphaAnimation;
        r2 = 0;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.<init>(r2, r3);
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r1.setDuration(r2);
        r2 = 1;
        r1.setFillBefore(r2);
        r2 = 1;
        r1.setFillAfter(r2);
        r0.startAnimation(r1);
        r0 = r12.o;
        r1 = 2131755481; // 0x7f1001d9 float:1.9141842E38 double:1.0532271485E-314;
        r0 = r0.findViewById(r1);
        r0 = (com.whatsapp.util.ClippingLayout) r0;
        r1 = 0;
        r0.setClipBounds(r1);
        r0 = r12.o;
        r1 = 2131755957; // 0x7f1003b5 float:1.9142808E38 double:1.0532273837E-314;
        r0 = r0.findViewById(r1);
        r0.clearAnimation();
        r0 = (android.widget.ImageView) r0;
        r0 = r0.getDrawable();
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0.setAlpha(r1);
        r0 = r12.o;
        r1 = 2131755961; // 0x7f1003b9 float:1.9142816E38 double:1.0532273856E-314;
        r0 = r0.findViewById(r1);
        r0.clearAnimation();
        r0 = android.os.SystemClock.elapsedRealtime();
        r2 = r12.p;
        r8 = r0 - r2;
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x02d0 }
        r0.<init>();	 Catch:{ Exception -> 0x02d0 }
        r1 = F;	 Catch:{ Exception -> 0x02d0 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ Exception -> 0x02d0 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x02d0 }
        r0 = r0.append(r8);	 Catch:{ Exception -> 0x02d0 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x02d0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x02d0 }
        if (r13 != 0) goto L_0x01af;
    L_0x01a6:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x01af;
    L_0x01ac:
        r12.c();	 Catch:{ Exception -> 0x02d2 }
    L_0x01af:
        r0 = r12.v;
        r7 = r0.a();
        r0 = r12.v;	 Catch:{ Exception -> 0x02d4 }
        r0.e();	 Catch:{ Exception -> 0x02d4 }
    L_0x01ba:
        r0 = r12.v;	 Catch:{ Exception -> 0x030c }
        r0.b();	 Catch:{ Exception -> 0x030c }
    L_0x01bf:
        r0 = 0;
        r12.v = r0;	 Catch:{ Exception -> 0x0318 }
        r0 = r12.o;	 Catch:{ Exception -> 0x0318 }
        r1 = -1;
        r0.setRequestedOrientation(r1);	 Catch:{ Exception -> 0x0318 }
        r12.f();	 Catch:{ Exception -> 0x0318 }
        r0 = r12.l;	 Catch:{ Exception -> 0x0318 }
        r0 = r0.isHeld();	 Catch:{ Exception -> 0x0318 }
        if (r0 == 0) goto L_0x01d8;
    L_0x01d3:
        r0 = r12.l;	 Catch:{ Exception -> 0x0318 }
        r0.release();	 Catch:{ Exception -> 0x0318 }
    L_0x01d8:
        r0 = r12.o;	 Catch:{ SettingNotFoundException -> 0x031a }
        r0 = r0.getContentResolver();	 Catch:{ SettingNotFoundException -> 0x031a }
        r1 = F;	 Catch:{ SettingNotFoundException -> 0x031a }
        r2 = 14;
        r1 = r1[r2];	 Catch:{ SettingNotFoundException -> 0x031a }
        r0 = android.provider.Settings.System.getInt(r0, r1);	 Catch:{ SettingNotFoundException -> 0x031a }
        if (r0 == 0) goto L_0x01fd;
    L_0x01ea:
        r0 = r12.o;	 Catch:{ SettingNotFoundException -> 0x031a }
        r1 = F;	 Catch:{ SettingNotFoundException -> 0x031a }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ SettingNotFoundException -> 0x031a }
        r0 = r0.getSystemService(r1);	 Catch:{ SettingNotFoundException -> 0x031a }
        r0 = (android.os.Vibrator) r0;	 Catch:{ SettingNotFoundException -> 0x031a }
        r2 = 75;
        r0.vibrate(r2);	 Catch:{ SettingNotFoundException -> 0x031a }
    L_0x01fd:
        if (r13 == 0) goto L_0x028e;
    L_0x01ff:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x0256;
    L_0x0205:
        r0 = 50;
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0327, SettingNotFoundException -> 0x0325 }
    L_0x020a:
        r0 = h;	 Catch:{ Exception -> 0x032d }
        r1 = u;	 Catch:{ Exception -> 0x032d }
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        r5 = 0;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.play(r1, r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x032d }
        r0 = r12.o;	 Catch:{ Exception -> 0x032d }
        r1 = com.whatsapp.fieldstats.a_.SENT;	 Catch:{ Exception -> 0x032d }
        r2 = r7.length();	 Catch:{ Exception -> 0x032d }
        com.whatsapp.nf.a(r0, r1, r2);	 Catch:{ Exception -> 0x032d }
        r0 = 0;
        r12.a = r0;	 Catch:{ Exception -> 0x032d }
        r0 = r12.k;	 Catch:{ Exception -> 0x032d }
        if (r0 == 0) goto L_0x0243;
    L_0x022b:
        r0 = r12.k;	 Catch:{ SettingNotFoundException -> 0x032f }
        r0 = r0.m();	 Catch:{ SettingNotFoundException -> 0x032f }
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r8 / r2;
        r1 = (int) r2;	 Catch:{ SettingNotFoundException -> 0x032f }
        r0.H = r1;	 Catch:{ SettingNotFoundException -> 0x032f }
        r0 = r12.k;	 Catch:{ SettingNotFoundException -> 0x032f }
        r1 = 1;
        r0.b(r1);	 Catch:{ SettingNotFoundException -> 0x032f }
        r0 = 0;
        r12.k = r0;	 Catch:{ SettingNotFoundException -> 0x032f }
        if (r10 == 0) goto L_0x02b5;
    L_0x0243:
        r0 = com.whatsapp.App.z();	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0337 }
        r1 = r12.B;	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0337 }
        r3 = 2;
        r4 = 1;
        r5 = 1;
        r6 = 0;
        r2 = r7;
        com.whatsapp.util.ag.a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ FileNotFoundException -> 0x0331, IOException -> 0x0337 }
    L_0x0251:
        r7.delete();	 Catch:{ Exception -> 0x033d }
        if (r10 == 0) goto L_0x02b5;
    L_0x0256:
        r0 = r12.k;	 Catch:{ Exception -> 0x033f }
        if (r0 == 0) goto L_0x0263;
    L_0x025a:
        r0 = r12.k;	 Catch:{ Exception -> 0x033f }
        r1 = 0;
        r0.b(r1);	 Catch:{ Exception -> 0x033f }
        r0 = 0;
        r12.k = r0;	 Catch:{ Exception -> 0x033f }
    L_0x0263:
        r0 = h;	 Catch:{ Exception -> 0x0341 }
        r1 = f;	 Catch:{ Exception -> 0x0341 }
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        r5 = 0;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.play(r1, r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x0341 }
        r0 = r12.o;	 Catch:{ Exception -> 0x0341 }
        r1 = com.whatsapp.fieldstats.a_.TOO_SHORT;	 Catch:{ Exception -> 0x0341 }
        r2 = r7.length();	 Catch:{ Exception -> 0x0341 }
        com.whatsapp.nf.a(r0, r1, r2);	 Catch:{ Exception -> 0x0341 }
        r7.delete();	 Catch:{ Exception -> 0x0341 }
        r0 = r12.a;	 Catch:{ Exception -> 0x0341 }
        r0 = r0 + 1;
        r12.a = r0;	 Catch:{ Exception -> 0x0341 }
        r0 = 2131230833; // 0x7f080071 float:1.807773E38 double:1.052967938E-314;
        r12.b(r0);	 Catch:{ Exception -> 0x0341 }
        if (r10 == 0) goto L_0x02b5;
    L_0x028e:
        r0 = r12.k;	 Catch:{ Exception -> 0x0343 }
        if (r0 == 0) goto L_0x029b;
    L_0x0292:
        r0 = r12.k;	 Catch:{ Exception -> 0x0343 }
        r1 = 0;
        r0.b(r1);	 Catch:{ Exception -> 0x0343 }
        r0 = 0;
        r12.k = r0;	 Catch:{ Exception -> 0x0343 }
    L_0x029b:
        if (r7 == 0) goto L_0x02b5;
    L_0x029d:
        r0 = r7.length();	 Catch:{ Exception -> 0x0345 }
        r2 = 0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x02b2;
    L_0x02a7:
        r0 = r12.o;	 Catch:{ Exception -> 0x0345 }
        r1 = com.whatsapp.fieldstats.a_.CANCELLED;	 Catch:{ Exception -> 0x0345 }
        r2 = r7.length();	 Catch:{ Exception -> 0x0345 }
        com.whatsapp.nf.a(r0, r1, r2);	 Catch:{ Exception -> 0x0345 }
    L_0x02b2:
        r7.delete();
    L_0x02b5:
        r0 = r12.z;
        if (r0 == 0) goto L_0x000a;
    L_0x02b9:
        r0 = r12.z;
        r1 = r12.D;
        r2 = new com.whatsapp.a9y;
        r2.<init>(r12, r0);
        r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r1.postDelayed(r2, r4);
        r0 = 0;
        r12.z = r0;
        goto L_0x000a;
    L_0x02cc:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x02ce }
    L_0x02ce:
        r0 = move-exception;
        throw r0;
    L_0x02d0:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x02d2 }
    L_0x02d2:
        r0 = move-exception;
        throw r0;
    L_0x02d4:
        r0 = move-exception;
        if (r13 == 0) goto L_0x02e8;
    L_0x02d7:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r1 < 0) goto L_0x02e8;
    L_0x02dd:
        r1 = F;	 Catch:{ Exception -> 0x030a }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ Exception -> 0x030a }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ Exception -> 0x030a }
        if (r10 == 0) goto L_0x01ba;
    L_0x02e8:
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0308 }
        r1.<init>();	 Catch:{ Exception -> 0x0308 }
        r2 = F;	 Catch:{ Exception -> 0x0308 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0308 }
        r1 = r1.append(r2);	 Catch:{ Exception -> 0x0308 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0308 }
        r0 = r1.append(r0);	 Catch:{ Exception -> 0x0308 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0308 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0308 }
        goto L_0x01ba;
    L_0x0308:
        r0 = move-exception;
        throw r0;
    L_0x030a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0308 }
    L_0x030c:
        r0 = move-exception;
        r1 = F;
        r2 = 9;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x01bf;
    L_0x0318:
        r0 = move-exception;
        throw r0;
    L_0x031a:
        r0 = move-exception;
        r1 = F;
        r2 = 7;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x01fd;
    L_0x0325:
        r0 = move-exception;
        throw r0;
    L_0x0327:
        r0 = move-exception;
        r0.printStackTrace();
        goto L_0x020a;
    L_0x032d:
        r0 = move-exception;
        throw r0;	 Catch:{  }
    L_0x032f:
        r0 = move-exception;
        throw r0;
    L_0x0331:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x0251;
    L_0x0337:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x0251;
    L_0x033d:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x033f }
    L_0x033f:
        r0 = move-exception;
        throw r0;
    L_0x0341:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0343 }
    L_0x0343:
        r0 = move-exception;
        throw r0;
    L_0x0345:
        r0 = move-exception;
        throw r0;
    L_0x0347:
        r5 = r1;
        goto L_0x0085;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a9z.b(boolean):void");
    }

    @TargetApi(8)
    private OnAudioFocusChangeListener e() {
        if (this.q == null) {
            this.q = new a_f(this);
        }
        return this.q;
    }

    static Activity h(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.o;
    }

    private void a() {
        if (VERSION.SDK_INT > 7) {
            ((AudioManager) this.o.getSystemService(F[0])).requestAudioFocus(e(), 3, 2);
        }
    }

    static TextView d(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.j;
    }

    private void f() {
        if (VERSION.SDK_INT > 7) {
            ((AudioManager) this.o.getSystemService(F[15])).abandonAudioFocus(e());
        }
    }

    static float l(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.b;
    }

    static by c(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.r;
    }

    static long k(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.p;
    }

    protected boolean b() {
        return true;
    }

    static ss a(a9z com_whatsapp_a9z, ss ssVar) {
        com_whatsapp_a9z.k = ssVar;
        return ssVar;
    }

    static int a(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.C;
    }

    public void a(String str) {
        this.B = str;
    }

    static String f(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.B;
    }

    public void a(int i) {
        this.z = i;
    }

    private final void b(int i) {
        this.i.setText(i);
        this.i.setBackgroundDrawable(new bz(this.o.getResources().getDrawable(2130839714)));
        this.i.setVisibility(0);
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(320);
        this.i.startAnimation(alphaAnimation);
        App.p.M().removeCallbacks(this.s);
        App.p.M().postDelayed(this.s, 3500);
    }

    static ss b(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.k;
    }

    public void j() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a9z(android.app.Activity r10, com.whatsapp.by r11) {
        /*
        r9 = this;
        r8 = 2130839797; // 0x7f0208f5 float:1.7284615E38 double:1.0527747405E-314;
        r7 = 1;
        r6 = -1;
        r5 = 0;
        r4 = 0;
        r9.<init>();
        r0 = 0;
        r9.t = r0;
        r0 = new android.graphics.Rect;
        r0.<init>();
        r9.w = r0;
        r0 = new com.whatsapp.dw;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r9, r1);
        r9.m = r0;
        r0 = new com.whatsapp.r4;
        r0.<init>(r9);
        r9.s = r0;
        r0 = new com.whatsapp.at3;
        r0.<init>(r9);
        r9.A = r0;
        r0 = new com.whatsapp.q8;
        r0.<init>(r9);
        r9.c = r0;
        r9.o = r10;
        r9.r = r11;
        r0 = r9.o;
        r1 = 2131755958; // 0x7f1003b6 float:1.914281E38 double:1.053227384E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r9.D = r0;
        r0 = r9.o;
        r1 = 2131755515; // 0x7f1001fb float:1.9141911E38 double:1.0532271653E-314;
        r0 = r0.findViewById(r1);
        r9.y = r0;
        r0 = r9.o;
        r1 = 2131755516; // 0x7f1001fc float:1.9141913E38 double:1.053227166E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r9.i = r0;
        r0 = F;
        r1 = 16;
        r0 = r0[r1];
        r0 = r10.getSystemService(r0);
        r0 = (android.os.PowerManager) r0;
        r1 = 6;
        r2 = F;
        r3 = 17;
        r2 = r2[r3];
        r0 = r0.newWakeLock(r1, r2);
        r9.l = r0;
        r0 = h;
        if (r0 != 0) goto L_0x00ae;
    L_0x007a:
        r0 = new android.media.SoundPool;
        r0.<init>(r7, r7, r4);
        h = r0;
        r0 = h;
        r1 = com.whatsapp.App.z();
        r2 = 2131165190; // 0x7f070006 float:1.794459E38 double:1.052935506E-314;
        r0 = r0.load(r1, r2, r4);
        e = r0;
        r0 = h;
        r1 = com.whatsapp.App.z();
        r2 = 2131165191; // 0x7f070007 float:1.7944592E38 double:1.0529355065E-314;
        r0 = r0.load(r1, r2, r4);
        u = r0;
        r0 = h;
        r1 = com.whatsapp.App.z();
        r2 = 2131165189; // 0x7f070005 float:1.7944588E38 double:1.0529355055E-314;
        r0 = r0.load(r1, r2, r4);
        f = r0;
    L_0x00ae:
        r0 = r9.o;
        r1 = 2131755509; // 0x7f1001f5 float:1.91419E38 double:1.0532271623E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r9.d = r0;
        r0 = r9.o;
        r1 = 2131755960; // 0x7f1003b8 float:1.9142814E38 double:1.053227385E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.widget.TextView) r0;
        r9.j = r0;
        r0 = r9.o;
        r1 = 2131755505; // 0x7f1001f1 float:1.9141891E38 double:1.0532271604E-314;
        r0 = r0.findViewById(r1);
        r9.E = r0;
        r0 = r9.o;
        r1 = 2131755481; // 0x7f1001d9 float:1.9141842E38 double:1.0532271485E-314;
        r0 = r0.findViewById(r1);
        r0 = (com.whatsapp.util.ClippingLayout) r0;
        r9.n = r0;
        r0 = com.whatsapp.App.a1();
        if (r0 == 0) goto L_0x00ef;
    L_0x00e6:
        r0 = r9.j;
        r0.setCompoundDrawablesWithIntrinsicBounds(r8, r4, r4, r4);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0103;
    L_0x00ef:
        r0 = r9.j;
        r1 = new com.whatsapp.util.bz;
        r2 = r9.o;
        r2 = r2.getResources();
        r2 = r2.getDrawable(r8);
        r1.<init>(r2);
        r0.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r1, r5);
    L_0x0103:
        r0 = r9.o;
        r1 = 2131755959; // 0x7f1003b7 float:1.9142812E38 double:1.0532273847E-314;
        r0 = r0.findViewById(r1);
        r1 = r0.getViewTreeObserver();
        r2 = new com.whatsapp.bj;
        r2.<init>(r9, r0);
        r1.addOnPreDrawListener(r2);
        r0 = r9.o;
        r1 = 2131755483; // 0x7f1001db float:1.9141847E38 double:1.0532271495E-314;
        r0 = r0.findViewById(r1);
        r0 = (android.view.ViewGroup) r0;
        r1 = new com.whatsapp.VoiceNoteRecordingUi$5;
        r2 = r9.o;
        r1.<init>(r9, r2);
        r0.addView(r1, r6, r6);
        r0 = com.facebook.rebound.d.a();
        r0 = r0.a();
        r9.x = r0;
        r0 = new com.facebook.rebound.o;
        r2 = 4646448178051153920; // 0x407b800000000000 float:0.0 double:440.0;
        r4 = 4626604192193052672; // 0x4035000000000000 float:0.0 double:21.0;
        r0.<init>(r2, r4);
        r1 = r9.x;
        r1.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a9z.<init>(android.app.Activity, com.whatsapp.by):void");
    }

    static SoundPool i() {
        return h;
    }

    static View m(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.y;
    }

    static TextView e(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.D;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.View r12, android.view.MotionEvent r13) {
        /*
        r11 = this;
        r10 = com.whatsapp.DialogToastActivity.f;
        r0 = r13.getAction();
        switch(r0) {
            case 0: goto L_0x000b;
            case 1: goto L_0x0056;
            case 2: goto L_0x007d;
            case 3: goto L_0x0056;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = 0;
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = r11.d;
        r0 = r0.getText();
        r0 = r0.toString();
        r0 = r0.trim();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0021;
    L_0x001f:
        r0 = 0;
        goto L_0x000a;
    L_0x0021:
        r0 = r11.b();
        if (r0 != 0) goto L_0x0029;
    L_0x0027:
        r0 = 0;
        goto L_0x000a;
    L_0x0029:
        r11.h();
        r0 = r13.getX();
        r11.t = r0;
        r0 = new android.view.animation.TranslateAnimation;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 0;
        r0.setDuration(r2);
        r1 = 1;
        r0.setFillBefore(r1);
        r1 = 1;
        r0.setFillAfter(r1);
        r1 = r11.j;
        r1.startAnimation(r0);
        r0 = 0;
        r11.g = r0;
        r0 = 0;
        goto L_0x000a;
    L_0x0056:
        r0 = r11.d;
        r0 = r0.getText();
        r0 = r0.toString();
        r0 = r0.trim();
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0077;
    L_0x006a:
        r0 = 0;
        r11.b(r0);
        r0 = 0;
        r12.playSoundEffect(r0);
        r11.j();
        if (r10 == 0) goto L_0x007b;
    L_0x0077:
        r0 = 1;
        r11.b(r0);
    L_0x007b:
        r0 = 0;
        goto L_0x000a;
    L_0x007d:
        r0 = r13.getX();
        r1 = r11.d;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r0 = r0 / r1;
        r0 = java.lang.Math.abs(r0);
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0099;
    L_0x0093:
        r1 = 0;
        r11.b(r1);
        if (r10 == 0) goto L_0x00b5;
    L_0x0099:
        r1 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x00b1;
    L_0x00a0:
        r1 = 0;
        r2 = 1066192077; // 0x3f8ccccd float:1.1 double:5.26768877E-315;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r0 * r3;
        r0 = r2 - r0;
        r0 = java.lang.Math.max(r1, r0);
        r11.b = r0;
        if (r10 == 0) goto L_0x00b5;
    L_0x00b1:
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r11.b = r0;
    L_0x00b5:
        r0 = r11.g();
        if (r0 == 0) goto L_0x0199;
    L_0x00bb:
        r0 = r11.p;
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r0 = r0 + r2;
        r2 = android.os.SystemClock.elapsedRealtime();
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0199;
    L_0x00c8:
        r0 = com.whatsapp.App.a1();
        if (r0 == 0) goto L_0x00fd;
    L_0x00ce:
        r0 = 0;
        r1 = r11.t;
        r2 = r13.getX();
        r1 = r1 - r2;
        r0 = java.lang.Math.max(r0, r1);
        r0 = -r0;
        r11.g = r0;
        r0 = r11.w;
        r1 = 0;
        r2 = 0;
        r3 = r11.E;
        r3 = r3.getWidth();
        r4 = r11.g;
        r4 = (int) r4;
        r3 = r3 + r4;
        r4 = r11.n;
        r4 = r4.getHeight();
        r0.set(r1, r2, r3, r4);
        r0 = r11.n;
        r1 = r11.w;
        r0.setClipBounds(r1);
        if (r10 == 0) goto L_0x0128;
    L_0x00fd:
        r0 = 0;
        r1 = r11.t;
        r2 = r13.getX();
        r1 = r1 - r2;
        r0 = java.lang.Math.min(r0, r1);
        r0 = -r0;
        r11.g = r0;
        r0 = r11.w;
        r1 = r11.g;
        r1 = (int) r1;
        r2 = 0;
        r3 = r11.n;
        r3 = r3.getWidth();
        r4 = r11.n;
        r4 = r4.getHeight();
        r0.set(r1, r2, r3, r4);
        r0 = r11.n;
        r1 = r11.w;
        r0.setClipBounds(r1);
    L_0x0128:
        r0 = r11.y;
        r0 = r0.getWidth();
        r0 = r0 / 4;
        r1 = com.whatsapp.App.av;
        if (r1 == 0) goto L_0x019c;
    L_0x0134:
        r0 = -r0;
        r9 = r0;
    L_0x0136:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 >= r1) goto L_0x016a;
    L_0x013c:
        r0 = new android.view.animation.TranslateAnimation;
        r1 = 0;
        r2 = r11.g;
        r3 = (float) r9;
        r2 = r2 + r3;
        r3 = 0;
        r4 = r11.g;
        r5 = (float) r9;
        r4 = r4 + r5;
        r5 = 1;
        r6 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r7 = 1;
        r8 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 0;
        r0.setDuration(r2);
        r1 = 1;
        r0.setFillBefore(r1);
        r1 = 1;
        r0.setFillAfter(r1);
        r1 = r11.y;
        r1.clearAnimation();
        r1 = r11.y;
        r1.startAnimation(r0);
        if (r10 == 0) goto L_0x0173;
    L_0x016a:
        r0 = r11.y;
        r1 = r11.g;
        r2 = (float) r9;
        r1 = r1 + r2;
        r0.setTranslationX(r1);
    L_0x0173:
        r0 = new android.view.animation.TranslateAnimation;
        r1 = 0;
        r2 = r11.g;
        r3 = 0;
        r4 = r11.g;
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 0;
        r0.setDuration(r2);
        r1 = 1;
        r0.setFillBefore(r1);
        r1 = 1;
        r0.setFillAfter(r1);
        r1 = r11.j;
        r1.clearAnimation();
        r1 = r11.j;
        r1.startAnimation(r0);
    L_0x0199:
        r0 = 0;
        goto L_0x000a;
    L_0x019c:
        r9 = r0;
        goto L_0x0136;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a9z.a(android.view.View, android.view.MotionEvent):boolean");
    }

    static TextView g(a9z com_whatsapp_a9z) {
        return com_whatsapp_a9z.i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
        r11 = this;
        r10 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.Voip.d();	 Catch:{ SettingNotFoundException -> 0x0012 }
        if (r0 == 0) goto L_0x0014;
    L_0x0008:
        r0 = r11.o;	 Catch:{ SettingNotFoundException -> 0x0012 }
        r1 = 2131231128; // 0x7f080198 float:1.8078328E38 double:1.0529680837E-314;
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ SettingNotFoundException -> 0x0012 }
    L_0x0011:
        return;
    L_0x0012:
        r0 = move-exception;
        throw r0;
    L_0x0014:
        r0 = F;	 Catch:{ SettingNotFoundException -> 0x003e }
        r1 = 6;
        r0 = r0[r1];	 Catch:{ SettingNotFoundException -> 0x003e }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SettingNotFoundException -> 0x003e }
        r0 = r11.A;	 Catch:{ SettingNotFoundException -> 0x003e }
        r0 = com.whatsapp.App.a(r0);	 Catch:{ SettingNotFoundException -> 0x003e }
        if (r0 == 0) goto L_0x0011;
    L_0x0024:
        r0 = com.whatsapp.App.T();	 Catch:{ SettingNotFoundException -> 0x003c }
        r2 = com.whatsapp.a59.e;	 Catch:{ SettingNotFoundException -> 0x003c }
        r2 = r2 * 1024;
        r2 = r2 * 1024;
        r2 = (long) r2;	 Catch:{ SettingNotFoundException -> 0x003c }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x0040;
    L_0x0033:
        r0 = r11.r;	 Catch:{ SettingNotFoundException -> 0x003c }
        r1 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r0.a(r1);	 Catch:{ SettingNotFoundException -> 0x003c }
        goto L_0x0011;
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = r11.B;	 Catch:{ SettingNotFoundException -> 0x0050 }
        r0 = com.whatsapp.aup.a(r0);	 Catch:{ SettingNotFoundException -> 0x0050 }
        if (r0 == 0) goto L_0x0052;
    L_0x0048:
        r0 = r11.o;	 Catch:{ SettingNotFoundException -> 0x0050 }
        r1 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r0.showDialog(r1);	 Catch:{ SettingNotFoundException -> 0x0050 }
        goto L_0x0011;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = r11.v;	 Catch:{ SettingNotFoundException -> 0x005f }
        if (r0 == 0) goto L_0x0061;
    L_0x0056:
        r0 = F;	 Catch:{ SettingNotFoundException -> 0x005f }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ SettingNotFoundException -> 0x005f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SettingNotFoundException -> 0x005f }
        goto L_0x0011;
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        com.whatsapp.i8.f();
        r0 = r11.o;
        r0 = r0.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getOrientation();
        r1 = r11.o;	 Catch:{ SettingNotFoundException -> 0x0321 }
        r1 = r1.getResources();	 Catch:{ SettingNotFoundException -> 0x0321 }
        r1 = r1.getConfiguration();	 Catch:{ SettingNotFoundException -> 0x0321 }
        r1 = r1.orientation;	 Catch:{ SettingNotFoundException -> 0x0321 }
        switch(r1) {
            case 1: goto L_0x02f3;
            case 2: goto L_0x0309;
            default: goto L_0x0081;
        };
    L_0x0081:
        r0 = r11.l;
        r0.acquire();
        r11.a();
        r11.d();
        r0 = r11.o;	 Catch:{ SettingNotFoundException -> 0x032f }
        r0 = r0.getContentResolver();	 Catch:{ SettingNotFoundException -> 0x032f }
        r1 = F;	 Catch:{ SettingNotFoundException -> 0x032f }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ SettingNotFoundException -> 0x032f }
        r0 = android.provider.Settings.System.getInt(r0, r1);	 Catch:{ SettingNotFoundException -> 0x032f }
        if (r0 == 0) goto L_0x00af;
    L_0x009d:
        r0 = r11.o;	 Catch:{ SettingNotFoundException -> 0x032f }
        r1 = F;	 Catch:{ SettingNotFoundException -> 0x032f }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ SettingNotFoundException -> 0x032f }
        r0 = r0.getSystemService(r1);	 Catch:{ SettingNotFoundException -> 0x032f }
        r0 = (android.os.Vibrator) r0;	 Catch:{ SettingNotFoundException -> 0x032f }
        r2 = 75;
        r0.vibrate(r2);	 Catch:{ SettingNotFoundException -> 0x032f }
    L_0x00af:
        r0 = h;
        r1 = e;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 0;
        r5 = 0;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r0.play(r1, r2, r3, r4, r5, r6);
        r11.C = r0;
        r0 = r11.D;
        r2 = 0;
        r1 = android.text.format.DateUtils.formatElapsedTime(r2);
        r0.setText(r1);
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r11.b = r0;
        r0 = r11.o;
        r1 = 2131755957; // 0x7f1003b5 float:1.9142808E38 double:1.0532273837E-314;
        r0 = r0.findViewById(r1);
        r1 = 0;
        r0.setVisibility(r1);
        r1 = new android.view.animation.AlphaAnimation;
        r2 = 0;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.<init>(r2, r3);
        r2 = new com.whatsapp.iy;
        r2.<init>(r11);
        r1.setInterpolator(r2);
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r1.setDuration(r2);
        r2 = 2;
        r1.setRepeatMode(r2);
        r2 = -1;
        r1.setRepeatCount(r2);
        r0.startAnimation(r1);
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 >= r1) goto L_0x0161;
    L_0x0103:
        r0 = new android.view.animation.ScaleAnimation;
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 1;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = 1;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = new android.view.animation.TranslateAnimation;	 Catch:{ SettingNotFoundException -> 0x033a }
        r2 = 1;
        r3 = com.whatsapp.App.a1();	 Catch:{ SettingNotFoundException -> 0x033a }
        if (r3 == 0) goto L_0x033c;
    L_0x011f:
        r3 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
    L_0x0121:
        r4 = 1;
        r5 = com.whatsapp.App.a1();
        if (r5 == 0) goto L_0x0340;
    L_0x0128:
        r5 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
    L_0x012a:
        r6 = 1;
        r7 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r8 = 1;
        r9 = 1048576000; // 0x3e800000 float:0.25 double:5.180653787E-315;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9);
        r2 = new android.view.animation.AnimationSet;
        r3 = 1;
        r2.<init>(r3);
        r2.addAnimation(r0);
        r2.addAnimation(r1);
        r0 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r2.setDuration(r0);
        r0 = 1;
        r2.setFillBefore(r0);
        r0 = 1;
        r2.setFillAfter(r0);
        r0 = new android.view.animation.OvershootInterpolator;
        r0.<init>();
        r2.setInterpolator(r0);
        r0 = r11.y;
        r1 = 0;
        r0.setVisibility(r1);
        r0 = r11.y;
        r0.startAnimation(r2);
        if (r10 == 0) goto L_0x01ad;
    L_0x0161:
        r0 = r11.y;
        r1 = 0;
        r0.setVisibility(r1);
        r0 = r11.y;
        r0 = r0.getWidth();
        r0 = r0 / 4;
        r1 = com.whatsapp.App.av;
        if (r1 == 0) goto L_0x0174;
    L_0x0173:
        r0 = -r0;
    L_0x0174:
        r1 = r11.y;
        r0 = (float) r0;
        r1.setTranslationX(r0);
        r0 = r11.y;
        r1 = r11.y;
        r1 = r1.getHeight();
        r1 = r1 / 4;
        r1 = (float) r1;
        r0.setTranslationY(r1);
        r0 = r11.y;
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0.setScaleX(r1);
        r0 = r11.y;
        r1 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r0.setScaleY(r1);
        r0 = r11.x;
        r0.h();
        r0 = r11.x;
        r1 = new com.whatsapp.mf;
        r2 = 0;
        r1.<init>(r11, r2);
        r0.a(r1);
        r0 = r11.x;
        r2 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r0.a(r2);
    L_0x01ad:
        r0 = r11.o;
        r1 = 2131755504; // 0x7f1001f0 float:1.914189E38 double:1.05322716E-314;
        r0 = r0.findViewById(r1);
        r1 = 4;
        r0.setVisibility(r1);
        r0 = r11.o;
        r1 = 2131755508; // 0x7f1001f4 float:1.9141897E38 double:1.053227162E-314;
        r0 = r0.findViewById(r1);
        r1 = 0;
        r0.setVisibility(r1);
        r0 = r11.o;
        r1 = 2131755517; // 0x7f1001fd float:1.9141916E38 double:1.0532271663E-314;
        r0 = r0.findViewById(r1);
        r0.clearAnimation();
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r11.o;
        r1 = 2131755514; // 0x7f1001fa float:1.914191E38 double:1.053227165E-314;
        r0 = r0.findViewById(r1);
        r0.clearAnimation();
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r11.o;
        r1 = 2131755518; // 0x7f1001fe float:1.9141918E38 double:1.053227167E-314;
        r0 = r0.findViewById(r1);
        r0.clearAnimation();
        r1 = 8;
        r0.setVisibility(r1);
        r9 = new android.view.animation.AnimationSet;
        r0 = 1;
        r9.<init>(r0);
        r0 = new android.view.animation.TranslateAnimation;	 Catch:{ SettingNotFoundException -> 0x0344 }
        r1 = 1;
        r2 = com.whatsapp.App.a1();	 Catch:{ SettingNotFoundException -> 0x0344 }
        if (r2 == 0) goto L_0x0346;
    L_0x0209:
        r2 = 2;
    L_0x020a:
        r2 = (float) r2;
        r3 = 1;
        r4 = com.whatsapp.App.a1();
        if (r4 == 0) goto L_0x0349;
    L_0x0212:
        r4 = -1;
    L_0x0213:
        r4 = (float) r4;
        r5 = 1;
        r6 = 0;
        r7 = 1;
        r8 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 1600; // 0x640 float:2.242E-42 double:7.905E-321;
        r0.setDuration(r2);
        r1 = -1;
        r0.setRepeatCount(r1);
        r1 = new android.view.animation.AlphaAnimation;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r1.<init>(r2, r3);
        r2 = 1600; // 0x640 float:2.242E-42 double:7.905E-321;
        r1.setDuration(r2);
        r2 = -1;
        r1.setRepeatCount(r2);
        r9.addAnimation(r0);
        r9.addAnimation(r1);
        r0 = 1600; // 0x640 float:2.242E-42 double:7.905E-321;
        r9.setDuration(r0);
        r0 = -1;
        r9.setRepeatCount(r0);
        r0 = new android.view.animation.DecelerateInterpolator;
        r0.<init>();
        r9.setInterpolator(r0);
        r0 = r11.o;
        r1 = 2131755961; // 0x7f1003b9 float:1.9142816E38 double:1.0532273856E-314;
        r0 = r0.findViewById(r1);
        r0.startAnimation(r9);
        r0 = r11.o;
        r1 = 2131755955; // 0x7f1003b3 float:1.9142804E38 double:1.0532273827E-314;
        r9 = r0.findViewById(r1);
        r0 = 0;
        r9.setVisibility(r0);	 Catch:{ SettingNotFoundException -> 0x034c }
        r0 = 1;
        r9.setClickable(r0);	 Catch:{ SettingNotFoundException -> 0x034c }
        r0 = new android.view.animation.TranslateAnimation;	 Catch:{ SettingNotFoundException -> 0x034c }
        r1 = 1;
        r2 = com.whatsapp.App.a1();	 Catch:{ SettingNotFoundException -> 0x034c }
        if (r2 == 0) goto L_0x034e;
    L_0x0272:
        r2 = 1;
    L_0x0273:
        r2 = (float) r2;
        r3 = 1;
        r4 = 0;
        r5 = 1;
        r6 = 0;
        r7 = 1;
        r8 = 0;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r0.setDuration(r2);
        r9.startAnimation(r0);
        r0 = r11.o;
        r1 = 2131755507; // 0x7f1001f3 float:1.9141895E38 double:1.0532271613E-314;
        r0 = r0.findViewById(r1);
        r0.clearAnimation();
        r1 = new android.view.animation.AlphaAnimation;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 0;
        r1.<init>(r2, r3);
        r2 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r1.setDuration(r2);
        r2 = 1;
        r1.setFillBefore(r2);
        r2 = 1;
        r1.setFillAfter(r2);
        r0.startAnimation(r1);
        r0 = r11.o;
        r1 = 2131755483; // 0x7f1001db float:1.9141847E38 double:1.0532271495E-314;
        r0 = r0.findViewById(r1);
        r1 = 0;
        r0.setVisibility(r1);
        r0 = com.whatsapp.util.ag.c();
        r1 = 2;
        r2 = 1;
        r3 = 1;
        r0 = com.whatsapp.App.a(r0, r1, r2, r3);
        r0 = r0.getAbsolutePath();
        r1 = F;
        r2 = 1;
        r1 = r1[r2];
        r0 = com.whatsapp.oh.a(r0, r1);
        r11.v = r0;
        r0 = android.os.SystemClock.elapsedRealtime();
        r11.p = r0;
        r0 = r11.v;	 Catch:{ Exception -> 0x0351 }
        r0.d();	 Catch:{ Exception -> 0x0351 }
    L_0x02db:
        r0 = r11.D;	 Catch:{ SettingNotFoundException -> 0x0360 }
        r1 = r11.c;	 Catch:{ SettingNotFoundException -> 0x0360 }
        r0.removeCallbacks(r1);	 Catch:{ SettingNotFoundException -> 0x0360 }
        r2 = r11.D;	 Catch:{ SettingNotFoundException -> 0x0360 }
        r3 = r11.c;	 Catch:{ SettingNotFoundException -> 0x0360 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ SettingNotFoundException -> 0x0360 }
        r1 = 16;
        if (r0 < r1) goto L_0x0362;
    L_0x02ec:
        r0 = 340; // 0x154 float:4.76E-43 double:1.68E-321;
    L_0x02ee:
        r2.postDelayed(r3, r0);
        goto L_0x0011;
    L_0x02f3:
        if (r0 == 0) goto L_0x02f8;
    L_0x02f5:
        r1 = 1;
        if (r0 != r1) goto L_0x0300;
    L_0x02f8:
        r1 = r11.o;	 Catch:{ SettingNotFoundException -> 0x0325 }
        r2 = 1;
        r1.setRequestedOrientation(r2);	 Catch:{ SettingNotFoundException -> 0x0325 }
        if (r10 == 0) goto L_0x0081;
    L_0x0300:
        r1 = r11.o;	 Catch:{ SettingNotFoundException -> 0x0327 }
        r2 = 9;
        r1.setRequestedOrientation(r2);	 Catch:{ SettingNotFoundException -> 0x0327 }
        if (r10 == 0) goto L_0x0081;
    L_0x0309:
        if (r0 == 0) goto L_0x030e;
    L_0x030b:
        r1 = 1;
        if (r0 != r1) goto L_0x0316;
    L_0x030e:
        r0 = r11.o;	 Catch:{ SettingNotFoundException -> 0x032d }
        r1 = 0;
        r0.setRequestedOrientation(r1);	 Catch:{ SettingNotFoundException -> 0x032d }
        if (r10 == 0) goto L_0x0081;
    L_0x0316:
        r0 = r11.o;	 Catch:{ SettingNotFoundException -> 0x031f }
        r1 = 8;
        r0.setRequestedOrientation(r1);	 Catch:{ SettingNotFoundException -> 0x031f }
        goto L_0x0081;
    L_0x031f:
        r0 = move-exception;
        throw r0;
    L_0x0321:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x0323 }
    L_0x0323:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x0325 }
    L_0x0325:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x0327 }
    L_0x0327:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x0329 }
    L_0x0329:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x032b }
    L_0x032b:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x032d }
    L_0x032d:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x031f }
    L_0x032f:
        r0 = move-exception;
        r1 = F;
        r2 = 3;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x00af;
    L_0x033a:
        r0 = move-exception;
        throw r0;
    L_0x033c:
        r3 = -1098907648; // 0xffffffffbe800000 float:-0.25 double:NaN;
        goto L_0x0121;
    L_0x0340:
        r5 = -1098907648; // 0xffffffffbe800000 float:-0.25 double:NaN;
        goto L_0x012a;
    L_0x0344:
        r0 = move-exception;
        throw r0;
    L_0x0346:
        r2 = -2;
        goto L_0x020a;
    L_0x0349:
        r4 = 1;
        goto L_0x0213;
    L_0x034c:
        r0 = move-exception;
        throw r0;
    L_0x034e:
        r2 = -1;
        goto L_0x0273;
    L_0x0351:
        r0 = move-exception;
        r0 = 0;
        r11.b(r0);
        r0 = r11.r;
        r1 = 2131231123; // 0x7f080193 float:1.8078318E38 double:1.052968081E-314;
        r0.a(r1);
        goto L_0x02db;
    L_0x0360:
        r0 = move-exception;
        throw r0;
    L_0x0362:
        r0 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        goto L_0x02ee;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a9z.h():void");
    }

    public boolean g() {
        return this.v != null;
    }

    public void d() {
        if (this.i.getVisibility() == 0) {
            App.p.M().removeCallbacks(this.s);
            this.i.clearAnimation();
            this.i.setVisibility(8);
        }
    }
}
