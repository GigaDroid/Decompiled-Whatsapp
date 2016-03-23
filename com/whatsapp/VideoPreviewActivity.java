package com.whatsapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.util.Log;
import com.whatsapp.util.a4;
import com.whatsapp.util.ag;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class VideoPreviewActivity extends DialogToastActivity {
    private static final String[] O;
    private ImageView A;
    private pz B;
    private VideoTimelineView C;
    private boolean D;
    private TextView E;
    private a4 F;
    private FrameLayout G;
    private TextView H;
    private int I;
    private boolean J;
    private FrameLayout K;
    private long L;
    private RangeSeekBar M;
    private File N;
    private VideoView n;
    private float o;
    private SeekBar p;
    private long q;
    private TextView r;
    private ImageView s;
    private ImageButton t;
    private View u;
    private long v;
    private OnGlobalLayoutListener w;
    private ConversationTextEntry x;
    private boolean y;
    private x3 z;

    static {
        String[] strArr = new String[11];
        String str = "9\u0006F3d/\u000e^>";
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
                        i3 = 95;
                        break;
                    case at.g /*1*/:
                        i3 = 111;
                        break;
                    case at.i /*2*/:
                        i3 = 42;
                        break;
                    case at.o /*3*/:
                        i3 = 86;
                        break;
                    default:
                        i3 = 59;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "5\u0006N";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ")\u0006N3T/\u001dO R:\u0018\u00054Z;O\\?_:\u0000";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "9\u0006F3d/\u000e^>";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ")\u0006N3T/\u001dO R:\u0018\u00055I:\u000e^3";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "5\u0006N";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "9\u0006F3d/\u000e^>";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "5\u0006N";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ")\u0006N3T/\u001dO R:\u0018\u00051^+\u0019C2^0\u001bB#V=";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ")\u0006N3T/\u001dO R:\u0018\u00051^+\u0019C2^0\u001bB#V=";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    O = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ")\u0006N3T/\u001dO R:\u0018\u00052^,\u001bX9B";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(VideoPreviewActivity videoPreviewActivity, boolean z) {
        videoPreviewActivity.c(z);
    }

    static long n(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.q;
    }

    static boolean h(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.y;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long a(long r12, long r14) {
        /*
        r11 = this;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r14 - r12;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 >= 0) goto L_0x000c;
    L_0x000a:
        r0 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
    L_0x000c:
        r2 = r11.J;
        if (r2 != 0) goto L_0x0039;
    L_0x0010:
        r2 = 0;
        r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0039;
    L_0x0016:
        r2 = r11.F;
        r2 = r2.c();
        r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0039;
    L_0x0020:
        r2 = r11.N;
        r2 = r2.length();
        r5 = com.whatsapp.a59.e;
        r6 = (long) r5;
        r8 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r6 = r6 * r8;
        r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r2 > 0) goto L_0x0039;
    L_0x0031:
        r2 = r11.N;
        r2 = r2.length();
        if (r4 == 0) goto L_0x00ad;
    L_0x0039:
        r2 = r11.N;
        r2 = com.whatsapp.akr.d(r2);
        if (r2 == 0) goto L_0x009f;
    L_0x0041:
        r2 = r11.F;
        r2 = r2.b();
        if (r2 != 0) goto L_0x0061;
    L_0x0049:
        r2 = r11.N;
        r2 = com.whatsapp.akr.a(r2);
        if (r2 == 0) goto L_0x0061;
    L_0x0051:
        r2 = r11.N;
        r2 = r2.length();
        r2 = r2 * r0;
        r5 = r11.F;
        r6 = r5.c();
        r2 = r2 / r6;
        if (r4 == 0) goto L_0x00ad;
    L_0x0061:
        r2 = r11.F;
        r5 = r2.a();
        r2 = r11.F;
        r6 = r2.d();
        if (r5 < r6) goto L_0x0076;
    L_0x006f:
        r3 = r11.I;
        r2 = r6 * r3;
        r2 = r2 / r5;
        if (r4 == 0) goto L_0x007b;
    L_0x0076:
        r2 = r11.I;
        r3 = r5 * r2;
        r3 = r3 / r6;
    L_0x007b:
        r5 = com.whatsapp.util.ag.a(r3, r2, r0);
        r11.o = r5;
        r2 = r2 * r3;
        r2 = (float) r2;
        r3 = r11.o;
        r2 = r2 * r3;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r0 / r6;
        r3 = (float) r6;
        r2 = r2 * r3;
        r3 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r2 = r2 / r3;
        r6 = 96000; // 0x17700 float:1.34525E-40 double:4.74303E-319;
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r0 / r8;
        r6 = r6 * r8;
        r8 = 8;
        r6 = r6 / r8;
        r3 = (float) r6;
        r2 = r2 + r3;
        r2 = (long) r2;
        if (r4 == 0) goto L_0x00ad;
    L_0x009f:
        r2 = r11.N;
        r2 = r2.length();
        r2 = r2 * r0;
        r4 = r11.F;
        r4 = r4.c();
        r2 = r2 / r4;
    L_0x00ad:
        r4 = r11.r;
        r5 = android.text.format.Formatter.formatShortFileSize(r11, r2);
        r4.setText(r5);
        r4 = r11.E;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 / r6;
        r0 = android.text.format.DateUtils.formatElapsedTime(r0);
        r4.setText(r0);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoPreviewActivity.a(long, long):long");
    }

    static File a(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.N;
    }

    private void c(boolean z) {
        if (z && this.A.getVisibility() != 0) {
            this.A.setVisibility(0);
            this.r.setVisibility(0);
            this.E.setVisibility(0);
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            this.A.startAnimation(alphaAnimation);
            this.r.startAnimation(alphaAnimation);
            this.E.startAnimation(alphaAnimation);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        if (!z && this.A.getVisibility() != 8) {
            this.A.setVisibility(8);
            this.r.setVisibility(8);
            this.E.setVisibility(8);
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            this.A.startAnimation(alphaAnimation);
            this.r.startAnimation(alphaAnimation);
            this.E.startAnimation(alphaAnimation);
        }
    }

    static pz f(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.B;
    }

    static RangeSeekBar p(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.M;
    }

    static long b(VideoPreviewActivity videoPreviewActivity, long j) {
        videoPreviewActivity.v = j;
        return j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
        r13 = this;
        r12 = 4;
        r7 = 3;
        r2 = 0;
        r11 = 0;
        r10 = 1;
        r0 = O;
        r1 = 5;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r14);
        r0 = r13.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r10);
        r0 = r13.getLayoutInflater();
        r1 = 2130903286; // 0x7f0300f6 float:1.7413386E38 double:1.052806108E-314;
        r4 = 0;
        r0 = com.whatsapp.aam.a(r0, r1, r4, r11);
        r13.u = r0;
        r0 = r13.u;
        r13.setContentView(r0);
        r0 = new java.io.File;
        r1 = r13.getIntent();
        r4 = O;
        r4 = r4[r12];
        r1 = r1.getStringExtra(r4);
        r0.<init>(r1);
        r13.N = r0;
        r0 = r13.getIntent();
        r1 = O;
        r4 = 2;
        r1 = r1[r4];
        r1 = r0.getStringExtra(r1);
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x008f;
    L_0x0051:
        r0 = com.whatsapp.App.as;
        r4 = r13.getIntent();
        r5 = O;
        r6 = 6;
        r5 = r5[r6];
        r4 = r4.getStringExtra(r5);
        r4 = r0.b(r4);
        r0 = r4.c();
        if (r0 == 0) goto L_0x007d;
    L_0x006a:
        r0 = 2131231874; // 0x7f080482 float:1.8079841E38 double:1.0529684523E-314;
        r5 = new java.lang.Object[r10];
        r6 = r4.a(r13);
        r5[r11] = r6;
        r0 = r13.getString(r0, r5);
        r5 = com.whatsapp.DialogToastActivity.f;
        if (r5 == 0) goto L_0x008c;
    L_0x007d:
        r0 = 2131231875; // 0x7f080483 float:1.8079843E38 double:1.052968453E-314;
        r5 = new java.lang.Object[r10];
        r4 = r4.a(r13);
        r5[r11] = r4;
        r0 = r13.getString(r0, r5);
    L_0x008c:
        r13.i(r0);
    L_0x008f:
        r0 = r13.N;
        r0 = com.whatsapp.util.ag.a(r1, r7, r0);
        r13.J = r0;
        r0 = new com.whatsapp.util.a4;	 Catch:{ cq -> 0x02f3 }
        r1 = r13.N;	 Catch:{ cq -> 0x02f3 }
        r0.<init>(r1);	 Catch:{ cq -> 0x02f3 }
        r13.F = r0;	 Catch:{ cq -> 0x02f3 }
        r0 = 2131755454; // 0x7f1001be float:1.9141788E38 double:1.053227135E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r13.s = r0;
        r0 = 2131755945; // 0x7f1003a9 float:1.9142784E38 double:1.0532273777E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r13.H = r0;
        r0 = 2131755620; // 0x7f100264 float:1.9142124E38 double:1.053227217E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r13.r = r0;
        r0 = 2131755535; // 0x7f10020f float:1.9141952E38 double:1.053227175E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r13.E = r0;
        r13.v = r2;
        r0 = r13.F;
        r0 = r0.c();
        r13.q = r0;
        r0 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r1 = r13.F;
        r1 = r1.a();
        r4 = r13.F;
        r4 = r4.d();
        r1 = java.lang.Math.max(r1, r4);
        r0 = java.lang.Math.min(r0, r1);
        r13.I = r0;
        r0 = r13.F;
        r0 = r0.c();
        r13.L = r0;
        r0 = r13.v;
        r4 = r13.q;
        r0 = r13.a(r0, r4);
        r4 = com.whatsapp.a59.e;	 Catch:{ cq -> 0x02ff }
        r4 = (long) r4;	 Catch:{ cq -> 0x02ff }
        r6 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r4 = r4 * r6;
        r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x011b;
    L_0x0109:
        r4 = r13.F;	 Catch:{ cq -> 0x02ff }
        r4 = r4.c();	 Catch:{ cq -> 0x02ff }
        r6 = com.whatsapp.a59.e;	 Catch:{ cq -> 0x02ff }
        r6 = (long) r6;	 Catch:{ cq -> 0x02ff }
        r4 = r4 * r6;
        r6 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r4 = r4 * r6;
        r0 = r4 / r0;
        r13.L = r0;	 Catch:{ cq -> 0x02ff }
    L_0x011b:
        r0 = 2131755948; // 0x7f1003ac float:1.914279E38 double:1.053227379E-314;
        r0 = r13.findViewById(r0);	 Catch:{ cq -> 0x0301 }
        r0 = (android.widget.FrameLayout) r0;	 Catch:{ cq -> 0x0301 }
        r13.G = r0;	 Catch:{ cq -> 0x0301 }
        r4 = new com.whatsapp.RangeSeekBar;	 Catch:{ cq -> 0x0301 }
        r0 = 0;
        r5 = java.lang.Long.valueOf(r0);	 Catch:{ cq -> 0x0301 }
        r0 = r13.F;	 Catch:{ cq -> 0x0301 }
        r0 = r0.c();	 Catch:{ cq -> 0x0301 }
        r6 = java.lang.Long.valueOf(r0);	 Catch:{ cq -> 0x0301 }
        r0 = r13.L;	 Catch:{ cq -> 0x0301 }
        r7 = r13.F;	 Catch:{ cq -> 0x0301 }
        r8 = r7.c();	 Catch:{ cq -> 0x0301 }
        r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r0 >= 0) goto L_0x0303;
    L_0x0144:
        r0 = r13.L;	 Catch:{ cq -> 0x0301 }
    L_0x0146:
        r0 = java.lang.Long.valueOf(r0);
        r4.<init>(r5, r6, r0, r13);
        r13.M = r4;
        r0 = r13.L;
        r4 = r13.F;
        r4 = r4.c();
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x0171;
    L_0x015b:
        r0 = r13.L;
        r13.q = r0;
        r0 = r13.M;
        r4 = r13.q;
        r1 = java.lang.Long.valueOf(r4);
        r0.setSelectedMaxValue(r1);
        r0 = r13.v;
        r4 = r13.q;
        r13.a(r0, r4);
    L_0x0171:
        r0 = r13.M;
        r1 = r13.getResources();
        r1 = r1.getDisplayMetrics();
        r1 = r1.density;
        r4 = 1116733440; // 0x42900000 float:72.0 double:5.517396283E-315;
        r1 = r1 * r4;
        r0.setSlowScrubStep(r1);
        r0 = r13.M;
        r1 = r13.getResources();
        r1 = r1.getDisplayMetrics();
        r1 = r1.density;
        r4 = 1108869120; // 0x42180000 float:38.0 double:5.47854138E-315;
        r1 = r1 * r4;
        r1 = (int) r1;
        r0.setTopExtension(r1);
        r0 = r13.M;
        r1 = new com.whatsapp.wl;
        r1.<init>(r13);
        r0.setOnRangeSeekBarChangeListener(r1);
        r0 = r13.M;
        r0.setNotifyWhileDragging(r10);
        r0 = r13.G;
        r1 = r13.M;
        r0.addView(r1);
        r0 = 2131755947; // 0x7f1003ab float:1.9142788E38 double:1.0532273787E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.FrameLayout) r0;
        r13.K = r0;
        r0 = new com.whatsapp.VideoTimelineView;
        r0.<init>(r13);
        r13.C = r0;
        r0 = r13.C;
        r1 = r13.N;
        r0.setVideoFile(r1);
        r0 = r13.K;
        r1 = r13.C;
        r0.addView(r1);
        r0 = 2131755628; // 0x7f10026c float:1.914214E38 double:1.053227221E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = 2131231862; // 0x7f080476 float:1.8079817E38 double:1.0529684463E-314;
        r0.setText(r1);
        r1 = new com.whatsapp.a_j;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        r0 = 2131755629; // 0x7f10026d float:1.9142143E38 double:1.0532272216E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.avy;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        r0 = 2131755396; // 0x7f100184 float:1.914167E38 double:1.0532271065E-314;
        r0 = r13.findViewById(r0);
        r0 = (com.whatsapp.VideoView) r0;
        r13.n = r0;
        r0 = 2131755950; // 0x7f1003ae float:1.9142794E38 double:1.05322738E-314;
        r0 = r13.findViewById(r0);
        r0.setVisibility(r11);
        r0 = r13.n;
        r1 = new com.whatsapp.avr;
        r1.<init>(r13);
        r0.setOnPreparedListener(r1);
        r0 = r13.n;
        r1 = r13.N;
        r1 = r1.getAbsolutePath();
        r0.setVideoPath(r1);
        r0 = r13.n;
        r0.requestFocus();
        r0 = r13.n;
        r0.seekTo(r10);
        r0 = new com.whatsapp.x3;
        r0.<init>(r13);
        r13.z = r0;
        r0 = r13.z;
        r0.setPriority(r12);
        r0 = r13.z;
        r0.start();
        r0 = r13.z;
        r0.a(r2);
        r0 = 2131755400; // 0x7f100188 float:1.9141678E38 double:1.0532271085E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.SeekBar) r0;
        r13.p = r0;
        r0 = r13.p;
        r1 = r13.F;
        r2 = r1.c();
        r1 = (int) r2;
        r0.setMax(r1);
        r0 = r13.p;
        r1 = new com.whatsapp.xu;
        r1.<init>(r13);
        r0.setOnSeekBarChangeListener(r1);
        r0 = 2131755397; // 0x7f100185 float:1.9141672E38 double:1.053227107E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r13.A = r0;
        r0 = new com.whatsapp.aep;
        r0.<init>(r13);
        r1 = 2131755395; // 0x7f100183 float:1.9141668E38 double:1.053227106E-314;
        r1 = r13.findViewById(r1);
        r1.setOnClickListener(r0);
        r1 = r13.A;
        r1.setOnClickListener(r0);
        r0 = 2131755508; // 0x7f1001f4 float:1.9141897E38 double:1.053227162E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r13.t = r0;
        r0 = r13.t;
        r1 = new com.whatsapp.b6;
        r1.<init>(r13);
        r0.setOnClickListener(r1);
        r0 = 2131755554; // 0x7f100222 float:1.914199E38 double:1.0532271846E-314;
        r0 = r13.findViewById(r0);
        r0 = (com.whatsapp.ConversationTextEntry) r0;
        r13.x = r0;
        r0 = r13.x;
        r0.setInputEnterDone(r10);
        r0 = r13.x;
        r1 = new android.text.InputFilter[r10];
        r2 = new com.whatsapp.aes;
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r2.<init>(r3);
        r1[r11] = r2;
        r0.setFilters(r1);
        r0 = r13.x;
        r1 = new com.whatsapp.alt;
        r1.<init>(r13);
        r0.setOnEditorActionListener(r1);
        r1 = r13.x;
        r2 = new com.whatsapp.hu;
        r3 = r13.x;
        r0 = 2131755755; // 0x7f1002eb float:1.9142398E38 double:1.053227284E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r4 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r5 = 30;
        r2.<init>(r3, r0, r4, r5);
        r1.addTextChangedListener(r2);
        r0 = new com.whatsapp.pa;
        r0.<init>(r13, r13);
        r13.B = r0;
        r0 = r13.B;
        r1 = new com.whatsapp.fh;
        r1.<init>(r13);
        r0.a(r1);
        r0 = r13.u;
        r0 = r0.getViewTreeObserver();
        r1 = r13.w;
        r0.addOnGlobalLayoutListener(r1);
    L_0x02f2:
        return;
    L_0x02f3:
        r0 = move-exception;
        r0 = O;
        r0 = r0[r7];
        com.whatsapp.util.Log.e(r0);
        r13.a();
        goto L_0x02f2;
    L_0x02ff:
        r0 = move-exception;
        throw r0;
    L_0x0301:
        r0 = move-exception;
        throw r0;
    L_0x0303:
        r0 = r2;
        goto L_0x0146;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoPreviewActivity.onCreate(android.os.Bundle):void");
    }

    static long d(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.v;
    }

    public VideoPreviewActivity() {
        this.I = 640;
        this.o = 3.0f;
        this.w = new aeu(this);
    }

    static boolean b(VideoPreviewActivity videoPreviewActivity, boolean z) {
        videoPreviewActivity.D = z;
        return z;
    }

    static VideoView i(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.n;
    }

    public Bitmap a(long j) {
        Bitmap frameAtTime;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(this.N.getAbsolutePath());
            frameAtTime = mediaMetadataRetriever.getFrameAtTime(j);
        } catch (Exception e) {
            Log.e(O[10] + e.toString());
            frameAtTime = ag.e(this.N.getAbsolutePath());
        } catch (NoSuchMethodError e2) {
            Log.e(O[9] + e2.toString());
            frameAtTime = ag.e(this.N.getAbsolutePath());
        }
        mediaMetadataRetriever.release();
        return frameAtTime;
    }

    static ConversationTextEntry m(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.x;
    }

    public void onDestroy() {
        Log.i(O[1]);
        super.onDestroy();
        if (this.z != null) {
            this.z.interrupt();
            this.z = null;
        }
        if (this.u != null) {
            this.u.getViewTreeObserver().removeGlobalOnLayoutListener(this.w);
        }
    }

    static long a(VideoPreviewActivity videoPreviewActivity, long j, long j2) {
        return videoPreviewActivity.a(j, j2);
    }

    static TextView o(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.H;
    }

    static long a(VideoPreviewActivity videoPreviewActivity, long j) {
        videoPreviewActivity.q = j;
        return j;
    }

    static SeekBar e(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.p;
    }

    static x3 c(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.z;
    }

    static View j(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.u;
    }

    public static void a(Activity activity, l5 l5Var, File file) {
        Intent intent = new Intent(activity, VideoPreviewActivity.class);
        intent.putExtra(O[7], file.getAbsolutePath());
        intent.putExtra(O[8], l5Var.p);
        activity.startActivityForResult(intent, 24);
    }

    static ImageView k(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.A;
    }

    static ImageButton b(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.t;
    }

    private void a() {
        Intent intent = new Intent();
        intent.putExtra(O[0], this.N.getAbsolutePath());
        setResult(1, intent);
        finish();
    }

    static a4 g(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.F;
    }

    static boolean c(VideoPreviewActivity videoPreviewActivity, boolean z) {
        videoPreviewActivity.y = z;
        return z;
    }

    static boolean l(VideoPreviewActivity videoPreviewActivity) {
        return videoPreviewActivity.D;
    }
}
