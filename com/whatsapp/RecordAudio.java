package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog.Builder;
import android.text.format.DateUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.util.at;
import java.io.File;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;

public class RecordAudio extends DialogToastActivity {
    private static final String[] D;
    private long A;
    private TextView B;
    private File C;
    private View n;
    private TextView o;
    private SeekBar p;
    private Button q;
    private ProgressBar r;
    private int s;
    private String t;
    private boolean u;
    private at v;
    private ImageButton w;
    private Button x;
    private oh y;
    private Handler z;

    static {
        String[] strArr = new String[21];
        String str = " WV\u001f]+NN%I,CG%_$[J";
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
                        i3 = 69;
                        break;
                    case org.whispersystems.at.g /*1*/:
                        i3 = 47;
                        break;
                    case org.whispersystems.at.i /*2*/:
                        i3 = 34;
                        break;
                    case org.whispersystems.at.o /*3*/:
                        i3 = 122;
                        break;
                    default:
                        i3 = 47;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "$MM\b[,AEZK0J\u0002\u000e@eAC\u000eF3J\u0002\u0016F']C\bF \\\u0002\u0017F6\\K\u0014H";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case org.whispersystems.at.g /*1*/:
                    strArr2[i] = str;
                    str = " WV\u001f]+NN%I,CG%_$[J";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case org.whispersystems.at.i /*2*/:
                    strArr2[i] = str;
                    str = "$AF\b@,K\f\nJ7BK\t\\,@LT}\u0000lm(k\u001anw>f\n";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case org.whispersystems.at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "(JQ\tN\"J}\u0013K";
                    obj = 4;
                    break;
                case org.whispersystems.at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "$AF\b@,K\f\nJ7BK\t\\,@LT}\u0000lm(k\u001anw>f\n";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "7JA\u0015]!NW\u001eF*\u0000A\bJ$[G";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "7JA\u0015]!NW\u001eF*\u0000R\u0016N<MC\u0019D\u001aIK\u0016J\u007f";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "!]C\rN'CG%F!";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "5CC\u0003M$LI%@+C[";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "5JP\u0017p!JL\u0013N)pO\u001f\\6NE\u001fp,K";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "5JP\u0017F6\\K\u0015A6";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "7JA\u0015]!NW\u001eF*\u0000A\bJ$[GUA*\u0002Q\nN&J";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "/FF";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "7JA\u0015]!NW\u001eF*\u0000R\bJ5NP\u001f\u000f$ZF\u0013@eKW\bN1FM\u0014\u0015";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "$ZF\u0013@j@E\u001d\u0014eLM\u001eJ&\\\u001f\u0015_0\\";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "7JA\u0015]!NW\u001eF*\u0000A\u0016@6FL\u001d\u000f!ZGZ[*\u000fN\u001bL.\u000fM\u001c\u000f5JP\u0017F6\\K\u0015A6";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "7JA\u0015]!NW\u001eF*\u0000F\u001f\\1]M\u0003\u00006[M\n_)N[\u001f]";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "7JA\u0015]!NW\u001eF*\u0000F\u001f\\1]M\u0003\u00006[M\n] LM\bK ]";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "7JA\u0015]!NW\u001eF*\u0000F\u001f\\1]M\u0003";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    D = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "#FN\u001f_$[J";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        r8 = 2131755875; // 0x7f100363 float:1.9142642E38 double:1.053227343E-314;
        r7 = 3;
        r6 = 4;
        r5 = 0;
        r4 = 1;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = 1;
        r9.supportRequestWindowFeature(r0);	 Catch:{ IllegalStateException -> 0x0031 }
        super.onCreate(r10);	 Catch:{ IllegalStateException -> 0x0031 }
        r0 = 2130903257; // 0x7f0300d9 float:1.7413327E38 double:1.052806094E-314;
        r9.setContentView(r0);	 Catch:{ IllegalStateException -> 0x0031 }
        r0 = D;	 Catch:{ IllegalStateException -> 0x0031 }
        r2 = 7;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x0031 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0031 }
        r0 = 0;
        r0 = com.whatsapp.util.WhatsAppLibLoader.a(r0);	 Catch:{ IllegalStateException -> 0x0031 }
        if (r0 != 0) goto L_0x0033;
    L_0x0025:
        r0 = D;	 Catch:{ IllegalStateException -> 0x0031 }
        r1 = 2;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0031 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0031 }
        r9.finish();	 Catch:{ IllegalStateException -> 0x0031 }
    L_0x0030:
        return;
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        r0 = com.whatsapp.App.ay;	 Catch:{ IllegalStateException -> 0x0043 }
        if (r0 == 0) goto L_0x003d;
    L_0x0037:
        r0 = com.whatsapp.App.t(r9);	 Catch:{ IllegalStateException -> 0x0041 }
        if (r0 == r7) goto L_0x0045;
    L_0x003d:
        r9.finish();	 Catch:{ IllegalStateException -> 0x0041 }
        goto L_0x0030;
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0041 }
    L_0x0045:
        r0 = new com.whatsapp.amc;	 Catch:{ IllegalStateException -> 0x01f1 }
        r0.<init>(r9);	 Catch:{ IllegalStateException -> 0x01f1 }
        r0 = com.whatsapp.App.a(r0);	 Catch:{ IllegalStateException -> 0x01f1 }
        if (r0 == 0) goto L_0x0030;
    L_0x0050:
        r0 = r9.getIntent();
        r2 = D;
        r3 = 10;
        r2 = r2[r3];
        r0 = r0.getBooleanExtra(r2, r5);
        r9.u = r0;
        r0 = r9.getIntent();
        r2 = D;
        r3 = 14;
        r2 = r2[r3];
        r0 = r0.getStringExtra(r2);
        r9.t = r0;
        r0 = 2131755879; // 0x7f100367 float:1.914265E38 double:1.053227345E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.B = r0;
        r0 = 2131755877; // 0x7f100365 float:1.9142646E38 double:1.053227344E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r9.o = r0;
        r0 = 2131755882; // 0x7f10036a float:1.9142656E38 double:1.0532273466E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r9.x = r0;
        r0 = 2131755881; // 0x7f100369 float:1.9142654E38 double:1.053227346E-314;
        r0 = r9.findViewById(r0);
        r9.n = r0;
        r0 = 2131755876; // 0x7f100364 float:1.9142644E38 double:1.0532273437E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r9.w = r0;
        r0 = 2131755880; // 0x7f100368 float:1.9142652E38 double:1.0532273456E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r9.q = r0;
        r0 = 2131755878; // 0x7f100366 float:1.9142648E38 double:1.0532273446E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r9.r = r0;
        r0 = 2131755527; // 0x7f100207 float:1.9141936E38 double:1.053227171E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.SeekBar) r0;
        r9.p = r0;
        r0 = r9.p;
        r2 = new com.whatsapp.a_n;
        r2.<init>(r9);
        r0.setOnSeekBarChangeListener(r2);
        r0 = r9.u;
        if (r0 == 0) goto L_0x0146;
    L_0x00d4:
        r0 = r9.getIntent();
        r2 = D;
        r2 = r2[r4];
        r2 = r0.getStringExtra(r2);
        r0 = new java.io.File;
        r0.<init>(r2);
        r9.C = r0;
        r0 = com.whatsapp.Conversation.F();
        r3 = r0.a();	 Catch:{ IllegalStateException -> 0x01f3 }
        if (r3 == 0) goto L_0x00f8;
    L_0x00f1:
        r0 = r0.b();	 Catch:{ IllegalStateException -> 0x01f3 }
        r3 = 1;
        r0.aw = r3;	 Catch:{ IllegalStateException -> 0x01f3 }
    L_0x00f8:
        r0 = r9.q;
        r3 = 2131231861; // 0x7f080475 float:1.8079815E38 double:1.052968446E-314;
        r0.setText(r3);
        r0 = r9.findViewById(r8);
        r0.setVisibility(r5);
        r0 = 2131755442; // 0x7f1001b2 float:1.9141763E38 double:1.053227129E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3 = 2131231704; // 0x7f0803d8 float:1.8079497E38 double:1.0529683683E-314;
        r0.setText(r3);
        r0 = r9.findViewById(r8);
        r0 = (android.widget.TextView) r0;
        r3 = r9.C;
        r3 = r3.getName();
        r0.setText(r3);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r3 = D;
        r4 = 8;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r9.c();
        r9.s = r6;
        if (r1 == 0) goto L_0x01fd;
    L_0x0146:
        r0 = 0;
        if (r10 == 0) goto L_0x0151;
    L_0x0149:
        r0 = D;
        r0 = r0[r7];
        r0 = r10.getCharSequence(r0);
    L_0x0151:
        if (r0 == 0) goto L_0x0175;
    L_0x0153:
        r2 = new java.io.File;	 Catch:{ IllegalStateException -> 0x01f5 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x01f5 }
        r2.<init>(r0);	 Catch:{ IllegalStateException -> 0x01f5 }
        r9.C = r2;	 Catch:{ IllegalStateException -> 0x01f5 }
        r0 = r9.r;	 Catch:{ IllegalStateException -> 0x01f5 }
        r2 = r9.r;	 Catch:{ IllegalStateException -> 0x01f5 }
        r2 = r2.getMax();	 Catch:{ IllegalStateException -> 0x01f5 }
        r0.setProgress(r2);	 Catch:{ IllegalStateException -> 0x01f5 }
        r9.c();	 Catch:{ IllegalStateException -> 0x01f5 }
        r2 = 0;
        r9.A = r2;	 Catch:{ IllegalStateException -> 0x01f5 }
        r0 = 4;
        r9.s = r0;	 Catch:{ IllegalStateException -> 0x01f5 }
        if (r1 == 0) goto L_0x01cf;
    L_0x0175:
        r0 = r9.u;	 Catch:{ IllegalStateException -> 0x01f7 }
        if (r0 != 0) goto L_0x01cc;
    L_0x0179:
        r0 = D;	 Catch:{ IllegalStateException -> 0x01f9 }
        r2 = 4;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x01f9 }
        r0 = com.whatsapp.App.h(r9, r0);	 Catch:{ IllegalStateException -> 0x01f9 }
        if (r0 == 0) goto L_0x01cc;
    L_0x0184:
        r0 = new android.content.Intent;	 Catch:{ IllegalStateException -> 0x01fb }
        r2 = com.whatsapp.RequestPermissionActivity.class;
        r0.<init>(r9, r2);	 Catch:{ IllegalStateException -> 0x01fb }
        r2 = D;	 Catch:{ IllegalStateException -> 0x01fb }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x01fb }
        r3 = 2130839701; // 0x7f020895 float:1.728442E38 double:1.052774693E-314;
        r0 = r0.putExtra(r2, r3);	 Catch:{ IllegalStateException -> 0x01fb }
        r2 = D;	 Catch:{ IllegalStateException -> 0x01fb }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x01fb }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ IllegalStateException -> 0x01fb }
        r4 = 0;
        r5 = D;	 Catch:{ IllegalStateException -> 0x01fb }
        r6 = 6;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x01fb }
        r3[r4] = r5;	 Catch:{ IllegalStateException -> 0x01fb }
        r0 = r0.putExtra(r2, r3);	 Catch:{ IllegalStateException -> 0x01fb }
        r2 = D;	 Catch:{ IllegalStateException -> 0x01fb }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x01fb }
        r3 = 2131231626; // 0x7f08038a float:1.8079338E38 double:1.0529683297E-314;
        r0 = r0.putExtra(r2, r3);	 Catch:{ IllegalStateException -> 0x01fb }
        r2 = D;	 Catch:{ IllegalStateException -> 0x01fb }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x01fb }
        r3 = 2131231625; // 0x7f080389 float:1.8079336E38 double:1.052968329E-314;
        r0 = r0.putExtra(r2, r3);	 Catch:{ IllegalStateException -> 0x01fb }
        r2 = 1;
        r9.startActivityForResult(r0, r2);	 Catch:{ IllegalStateException -> 0x01fb }
        if (r1 == 0) goto L_0x01cf;
    L_0x01cc:
        r9.a();	 Catch:{ IllegalStateException -> 0x01fb }
    L_0x01cf:
        r0 = com.whatsapp.App.T();	 Catch:{ IllegalStateException -> 0x01ef }
        r2 = com.whatsapp.a59.e;	 Catch:{ IllegalStateException -> 0x01ef }
        r2 = r2 * 1024;
        r2 = r2 * 1024;
        r2 = (long) r2;	 Catch:{ IllegalStateException -> 0x01ef }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 >= 0) goto L_0x01fd;
    L_0x01de:
        r0 = D;	 Catch:{ IllegalStateException -> 0x01ef }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x01ef }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalStateException -> 0x01ef }
        r0 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r9.a(r0);	 Catch:{ IllegalStateException -> 0x01ef }
        goto L_0x0030;
    L_0x01ef:
        r0 = move-exception;
        throw r0;
    L_0x01f1:
        r0 = move-exception;
        throw r0;
    L_0x01f3:
        r0 = move-exception;
        throw r0;
    L_0x01f5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01f7 }
    L_0x01f7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01f9 }
    L_0x01f9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01fb }
    L_0x01fb:
        r0 = move-exception;
        throw r0;
    L_0x01fd:
        r0 = r9.s;
        r9.b(r0);
        r0 = r9.x;
        r1 = new com.whatsapp.uw;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = r9.q;
        r1 = new com.whatsapp.axr;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = r9.w;
        r1 = new com.whatsapp.p1;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = new com.whatsapp.aib;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r9, r1);
        r9.z = r0;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RecordAudio.onCreate(android.os.Bundle):void");
    }

    public RecordAudio() {
        this.s = 0;
    }

    static oh h(RecordAudio recordAudio) {
        return recordAudio.y;
    }

    static Handler c(RecordAudio recordAudio) {
        return recordAudio.z;
    }

    static ImageButton m(RecordAudio recordAudio) {
        return recordAudio.w;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        if (i == 1) {
            if (i2 == -1) {
                try {
                    a();
                    if (!z) {
                        return;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            finish();
            Log.i(D[17]);
            if (!z) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    static at f(RecordAudio recordAudio) {
        return recordAudio.v;
    }

    public void onDestroy() {
        try {
            Log.i(D[20]);
            super.onDestroy();
            if (this.s == 1) {
                Log.i(D[19]);
            }
            try {
                if (this.y != null) {
                    this.y.e();
                }
            } catch (Throwable e) {
                Log.a(e);
            }
            try {
                if (this.y != null) {
                    this.y.b();
                }
            } catch (Throwable e2) {
                Log.a(e2);
            }
            try {
                if (this.v != null) {
                    if (this.v.f()) {
                        Log.i(D[18]);
                        this.v.e();
                    }
                    this.v.b();
                    this.v.h();
                }
            } catch (Exception e3) {
                throw e3;
            } catch (Exception e32) {
                throw e32;
            }
        } catch (Exception e322) {
            throw e322;
        }
    }

    private void a() {
        this.y = oh.a(ag.a((Context) this, "", (byte) 2, 0, false).getAbsolutePath(), D[16]);
        this.B.setText(DateUtils.formatElapsedTime(120));
        this.o.setText(DateUtils.formatElapsedTime(0));
    }

    static long a(RecordAudio recordAudio, long j) {
        recordAudio.A = j;
        return j;
    }

    static int c(RecordAudio recordAudio, int i) {
        recordAudio.s = i;
        return i;
    }

    public Dialog onCreateDialog(int i) {
        switch (i) {
            case v.m /*0*/:
                try {
                    try {
                        int i2;
                        Builder title = new Builder(this).setTitle(App.V() ? 2131231734 : 2131231735);
                        if (App.V()) {
                            i2 = 2131231732;
                        } else {
                            i2 = 2131231733;
                        }
                        return title.setMessage(i2).setPositiveButton(2131231580, new fd(this)).create();
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            default:
                return super.onCreateDialog(i);
        }
    }

    static SeekBar j(RecordAudio recordAudio) {
        return recordAudio.p;
    }

    static ProgressBar d(RecordAudio recordAudio) {
        return recordAudio.r;
    }

    private void c(int i) {
        c();
        if (this.v != null) {
            App.y((Context) this);
            try {
                this.v.c();
                if (i > 0) {
                    this.v.a(i);
                    this.p.setProgress(this.v.a());
                }
                this.s = 3;
                this.z.sendEmptyMessage(0);
                this.w.setImageResource(2130839675);
            } catch (IllegalStateException e) {
                a(2131231156);
            } catch (IOException e2) {
                a(2131231156);
            }
        }
    }

    static void b(RecordAudio recordAudio, int i) {
        recordAudio.b(i);
    }

    static File n(RecordAudio recordAudio) {
        return recordAudio.C;
    }

    private void b() {
        if (this.y != null) {
            try {
                this.y.e();
            } catch (Throwable e) {
                Log.a(e);
            }
            try {
                this.y.b();
            } catch (Throwable e2) {
                Log.a(e2);
            }
            this.y = null;
        }
        this.r.setProgress(this.r.getMax());
        c();
    }

    static File a(RecordAudio recordAudio, File file) {
        recordAudio.C = file;
        return file;
    }

    static void a(RecordAudio recordAudio, int i) {
        recordAudio.c(i);
    }

    public void g(int i) {
        if (i == 2131231123 || i == 2131231112 || i == 2131231156) {
            try {
                finish();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    static long i(RecordAudio recordAudio) {
        return recordAudio.A;
    }

    private void c() {
        try {
            if (this.v != null) {
                this.v.b();
                this.v.h();
                this.v = null;
            }
            this.v = at.a(this.C.getAbsolutePath(), 3);
            this.v.a(new and(this));
            this.v.a(new a_1(this));
            this.v.g();
            Log.i(D[15] + this.v.d());
            this.s = 5;
            this.p.setMax(this.v.d());
            this.B.setText(DateUtils.formatElapsedTime((long) (this.v.d() / 1000)));
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            Log.a(e2);
            a(2131231156);
        }
        this.p.setProgress(0);
        this.w.setImageResource(2130839676);
    }

    static TextView l(RecordAudio recordAudio) {
        return recordAudio.B;
    }

    static void e(RecordAudio recordAudio) {
        recordAudio.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r5) {
        /*
        r4 = this;
        r0 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        switch(r5) {
            case 0: goto L_0x0007;
            case 1: goto L_0x003c;
            case 2: goto L_0x0006;
            case 3: goto L_0x006d;
            case 4: goto L_0x00b3;
            case 5: goto L_0x00f9;
            default: goto L_0x0006;
        };
    L_0x0006:
        return;
    L_0x0007:
        r1 = r4.q;	 Catch:{ IllegalStateException -> 0x0105 }
        r3 = 2131231729; // 0x7f0803f1 float:1.8079547E38 double:1.0529683806E-314;
        r1.setText(r3);	 Catch:{ IllegalStateException -> 0x0105 }
        r1 = r4.x;	 Catch:{ IllegalStateException -> 0x0105 }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0105 }
        r1 = r4.n;	 Catch:{ IllegalStateException -> 0x0105 }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0105 }
        r1 = r4.w;	 Catch:{ IllegalStateException -> 0x0105 }
        r3 = 8;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0105 }
        r1 = r4.o;	 Catch:{ IllegalStateException -> 0x0105 }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0105 }
        r1 = r4.r;	 Catch:{ IllegalStateException -> 0x0105 }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0105 }
        r1 = r4.p;	 Catch:{ IllegalStateException -> 0x0105 }
        r3 = 4;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0105 }
        r1 = r4.r;	 Catch:{ IllegalStateException -> 0x0105 }
        r3 = 0;
        r1.setProgress(r3);	 Catch:{ IllegalStateException -> 0x0105 }
        if (r2 == 0) goto L_0x0006;
    L_0x003c:
        r1 = r4.q;	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = 2131231731; // 0x7f0803f3 float:1.8079551E38 double:1.0529683816E-314;
        r1.setText(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r4.x;	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = 8;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r4.n;	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = 8;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r4.w;	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = 8;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r4.o;	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r4.r;	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        r1 = r4.p;	 Catch:{ IllegalStateException -> 0x0107 }
        r3 = 4;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0107 }
        if (r2 == 0) goto L_0x0006;
    L_0x006d:
        r1 = r4.q;	 Catch:{ IllegalStateException -> 0x0109 }
        r3 = 2131231730; // 0x7f0803f2 float:1.807955E38 double:1.052968381E-314;
        r1.setText(r3);	 Catch:{ IllegalStateException -> 0x0109 }
        r1 = r4.x;	 Catch:{ IllegalStateException -> 0x0109 }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0109 }
        r1 = r4.n;	 Catch:{ IllegalStateException -> 0x0109 }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0109 }
        r1 = r4.w;	 Catch:{ IllegalStateException -> 0x0109 }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0109 }
        r1 = r4.w;	 Catch:{ IllegalStateException -> 0x0109 }
        r3 = 2130839675; // 0x7f02087b float:1.7284367E38 double:1.05277468E-314;
        r1.setImageResource(r3);	 Catch:{ IllegalStateException -> 0x0109 }
        r1 = r4.o;	 Catch:{ IllegalStateException -> 0x0109 }
        r3 = 8;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0109 }
        r1 = r4.r;	 Catch:{ IllegalStateException -> 0x0109 }
        r3 = 4;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0109 }
        r1 = r4.p;	 Catch:{ IllegalStateException -> 0x0109 }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x0109 }
        r3 = r4.p;	 Catch:{ IllegalStateException -> 0x0109 }
        r1 = r4.v;	 Catch:{ IllegalStateException -> 0x0109 }
        if (r1 == 0) goto L_0x010b;
    L_0x00a8:
        r1 = r4.v;	 Catch:{ IllegalStateException -> 0x0109 }
        r1 = r1.d();	 Catch:{ IllegalStateException -> 0x0109 }
    L_0x00ae:
        r3.setMax(r1);	 Catch:{ IllegalStateException -> 0x010d }
        if (r2 == 0) goto L_0x0006;
    L_0x00b3:
        r1 = r4.q;	 Catch:{ IllegalStateException -> 0x010f }
        r3 = 2131231730; // 0x7f0803f2 float:1.807955E38 double:1.052968381E-314;
        r1.setText(r3);	 Catch:{ IllegalStateException -> 0x010f }
        r1 = r4.x;	 Catch:{ IllegalStateException -> 0x010f }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x010f }
        r1 = r4.n;	 Catch:{ IllegalStateException -> 0x010f }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x010f }
        r1 = r4.w;	 Catch:{ IllegalStateException -> 0x010f }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x010f }
        r1 = r4.w;	 Catch:{ IllegalStateException -> 0x010f }
        r3 = 2130839676; // 0x7f02087c float:1.728437E38 double:1.0527746807E-314;
        r1.setImageResource(r3);	 Catch:{ IllegalStateException -> 0x010f }
        r1 = r4.o;	 Catch:{ IllegalStateException -> 0x010f }
        r3 = 8;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x010f }
        r1 = r4.r;	 Catch:{ IllegalStateException -> 0x010f }
        r3 = 4;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x010f }
        r1 = r4.p;	 Catch:{ IllegalStateException -> 0x010f }
        r3 = 0;
        r1.setVisibility(r3);	 Catch:{ IllegalStateException -> 0x010f }
        r1 = r4.p;	 Catch:{ IllegalStateException -> 0x010f }
        r3 = r4.v;	 Catch:{ IllegalStateException -> 0x010f }
        if (r3 == 0) goto L_0x00f4;
    L_0x00ee:
        r0 = r4.v;	 Catch:{ IllegalStateException -> 0x010f }
        r0 = r0.d();	 Catch:{ IllegalStateException -> 0x010f }
    L_0x00f4:
        r1.setMax(r0);	 Catch:{ IllegalStateException -> 0x0103 }
        if (r2 == 0) goto L_0x0006;
    L_0x00f9:
        r0 = r4.w;	 Catch:{ IllegalStateException -> 0x0103 }
        r1 = 2130839676; // 0x7f02087c float:1.728437E38 double:1.0527746807E-314;
        r0.setImageResource(r1);	 Catch:{ IllegalStateException -> 0x0103 }
        goto L_0x0006;
    L_0x0103:
        r0 = move-exception;
        throw r0;
    L_0x0105:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0107 }
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0109 }
    L_0x0109:
        r0 = move-exception;
        throw r0;
    L_0x010b:
        r1 = r0;
        goto L_0x00ae;
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x010f }
    L_0x010f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RecordAudio.b(int):void");
    }

    static String k(RecordAudio recordAudio) {
        return recordAudio.t;
    }

    static int a(RecordAudio recordAudio) {
        return recordAudio.s;
    }

    static TextView b(RecordAudio recordAudio) {
        return recordAudio.o;
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            if (this.s == 0) {
                return;
            }
            if (this.C != null) {
                try {
                    if (!this.u) {
                        bundle.putCharSequence(D[0], this.C.getAbsolutePath());
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static boolean g(RecordAudio recordAudio) {
        return recordAudio.u;
    }
}
