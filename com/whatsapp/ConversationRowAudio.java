package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.appcompat.R;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.protocol.co;
import com.whatsapp.util.bf;
import org.v;
import org.whispersystems.at;

public class ConversationRowAudio extends ConversationRowMedia {
    private static bf W;
    private static final String bb;
    private final VoiceNoteSeekBar U;
    private final TextView V;
    private final ImageView X;
    private final TextView Y;
    private final ImageButton Z;
    private final ImageView aa;
    private final CircularProgressBar ab;
    private WaveformVisualizerView ac;
    private final ImageView ad;

    public void i() {
        super.i();
        a(this.e);
    }

    static {
        char[] toCharArray = "\u0014]q>z\u0005A~<v\u0018\\m'h\u0001]v+z\u0019]k-0\u0001[z?r\u0012Al)x\u0012\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 119;
                    break;
                case at.g /*1*/:
                    i2 = 50;
                    break;
                case at.i /*2*/:
                    i2 = 31;
                    break;
                case at.o /*3*/:
                    i2 = 72;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        bb = new String(cArr).intern();
        W = new bf(250);
    }

    static void a(ConversationRowAudio conversationRowAudio, boolean z) {
        conversationRowAudio.c(z);
    }

    private void g() {
        if (this.ac != null) {
            this.ac.setVisibility(0);
        }
        if (this.aa != null) {
            this.aa.setVisibility(8);
        }
    }

    protected int h() {
        return 2130903119;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r13) {
        /*
        r12 = this;
        r11 = 2130839590; // 0x7f020826 float:1.7284195E38 double:1.052774638E-314;
        r10 = -1;
        r4 = 8;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r13.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r13.k;
        r1 = r1.a;
        if (r1 != 0) goto L_0x002d;
    L_0x0013:
        r1 = r12.a;
        if (r1 == 0) goto L_0x0023;
    L_0x0017:
        r1 = r12.X;
        r1.setVisibility(r2);
        r1 = r12.ad;
        r1.setVisibility(r4);
        if (r3 == 0) goto L_0x002d;
    L_0x0023:
        r1 = r12.X;
        r1.setVisibility(r4);
        r1 = r12.ad;
        r1.setVisibility(r2);
    L_0x002d:
        r1 = r12.Y;
        r1.setVisibility(r4);
        r1 = r12.U;
        r1.setProgressColor(r2);
        r1 = r12.ab;
        r1.setVisibility(r4);
        r1 = r12.a;
        if (r1 == 0) goto L_0x005a;
    L_0x0040:
        r1 = r13.k;
        r1 = r1.a;
        if (r1 != 0) goto L_0x005a;
    L_0x0046:
        r1 = 2131755524; // 0x7f100204 float:1.914193E38 double:1.0532271697E-314;
        r1 = r12.findViewById(r1);
        r4 = com.whatsapp.a4d.a();
        r4 = r4.g;
        r5 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r4 = r4 * r5;
        r4 = (int) r4;
        r1.setPadding(r2, r4, r2, r2);
    L_0x005a:
        r1 = r13.H;
        if (r1 != 0) goto L_0x0066;
    L_0x005e:
        r1 = r0.file;
        r1 = com.whatsapp.util.ag.c(r1);
        r13.H = r1;
    L_0x0066:
        r1 = r0.transferring;
        if (r1 == 0) goto L_0x00bb;
    L_0x006a:
        r1 = r12.ab;
        r1.setVisibility(r2);
        r4 = r12.ab;
        r6 = r0.progress;
        r8 = 0;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 == 0) goto L_0x0081;
    L_0x0079:
        r6 = r0.progress;
        r8 = 100;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 != 0) goto L_0x020b;
    L_0x0081:
        r1 = 1;
    L_0x0082:
        r4.setIndeterminate(r1);
        r4 = r0.progress;
        r1 = (int) r4;
        r4 = r0.transcoder;
        if (r4 == 0) goto L_0x00a0;
    L_0x008c:
        r4 = r0.transcoder;
        r4 = r4.a();
        if (r4 == 0) goto L_0x00a0;
    L_0x0094:
        r4 = r0.uploader;
        if (r4 != 0) goto L_0x009c;
    L_0x0098:
        r1 = r1 / 2;
        if (r3 == 0) goto L_0x00a0;
    L_0x009c:
        r1 = r1 / 2;
        r1 = r1 + 50;
    L_0x00a0:
        r4 = r12.ab;
        r4.setProgress(r1);
        r1 = r12.Y;
        r1.setVisibility(r2);
        r1 = r12.Z;
        r4 = 2130839581; // 0x7f02081d float:1.7284177E38 double:1.052774634E-314;
        r1.setImageResource(r4);
        r1 = r12.Z;
        r4 = r12.R;
        r1.setOnClickListener(r4);
        if (r3 == 0) goto L_0x01ee;
    L_0x00bb:
        r1 = r0.transferred;
        if (r1 != 0) goto L_0x00d3;
    L_0x00bf:
        r1 = r13.x;
        if (r1 == 0) goto L_0x01b0;
    L_0x00c3:
        r1 = r13.k;
        r1 = r1.a;
        if (r1 == 0) goto L_0x01b0;
    L_0x00c9:
        r1 = r13.k;
        r1 = r1.c;
        r1 = com.whatsapp.l5.g(r1);
        if (r1 != 0) goto L_0x01b0;
    L_0x00d3:
        r1 = r12.U;
        r4 = r12.getContext();
        r5 = 2131624049; // 0x7f0e0071 float:1.8875267E38 double:1.0531622125E-314;
        r4 = android.support.v4.content.ContextCompat.getColor(r4, r5);
        r1.setProgressColor(r4);
        r1 = com.whatsapp.i8.a(r13);
        if (r1 != 0) goto L_0x0142;
    L_0x00e9:
        r1 = r12.ac;
        if (r1 != 0) goto L_0x010d;
    L_0x00ed:
        r1 = 2131755534; // 0x7f10020e float:1.914195E38 double:1.0532271747E-314;
        r1 = r12.findViewById(r1);
        r1 = (android.view.ViewGroup) r1;
        if (r1 == 0) goto L_0x010d;
    L_0x00f8:
        r4 = new com.whatsapp.WaveformVisualizerView;
        r5 = r12.getContext();
        r4.<init>(r5);
        r12.ac = r4;
        r4 = r12.ac;
        r4.setColor(r10);
        r4 = r12.ac;
        r1.addView(r4, r10, r10);
    L_0x010d:
        r1 = r12.Z;
        r4 = new com.whatsapp.util.bz;
        r5 = r12.getContext();
        r5 = android.support.v4.content.ContextCompat.getDrawable(r5, r11);
        r4.<init>(r5);
        r1.setImageDrawable(r4);
        r1 = r12.U;
        r4 = r13.H;
        r4 = r4 * 1000;
        r1.setMax(r4);
        r1 = W;
        r4 = r13.k;
        r1 = r1.get(r4);
        r1 = (java.lang.Integer) r1;
        r4 = r12.U;
        if (r1 == 0) goto L_0x020e;
    L_0x0136:
        r1 = r1.intValue();
    L_0x013a:
        r4.setProgress(r1);
        r12.c();
        if (r3 == 0) goto L_0x01a7;
    L_0x0142:
        r4 = com.whatsapp.i8.p;
        r1 = r4.n();
        if (r1 != 0) goto L_0x0176;
    L_0x014a:
        r1 = r12.Z;
        r5 = new com.whatsapp.util.bz;
        r6 = r12.getContext();
        r6 = android.support.v4.content.ContextCompat.getDrawable(r6, r11);
        r5.<init>(r6);
        r1.setImageDrawable(r5);
        r1 = W;
        r5 = r13.k;
        r1 = r1.get(r5);
        r1 = (java.lang.Integer) r1;
        r5 = r12.U;
        if (r1 == 0) goto L_0x0211;
    L_0x016a:
        r1 = r1.intValue();
    L_0x016e:
        r5.setProgress(r1);
        r12.c();
        if (r3 == 0) goto L_0x018a;
    L_0x0176:
        r1 = r12.Z;
        r5 = 2130839587; // 0x7f020823 float:1.7284189E38 double:1.0527746367E-314;
        r1.setImageResource(r5);
        r1 = r12.U;
        r5 = r4.a();
        r1.setProgress(r5);
        r12.g();
    L_0x018a:
        r1 = r12.U;
        r5 = r4.x();
        r1.setMax(r5);
        r1 = r12.ac;
        if (r1 == 0) goto L_0x019f;
    L_0x0197:
        r1 = new com.whatsapp.akq;
        r1.<init>(r12);
        r4.a(r1);
    L_0x019f:
        r1 = new com.whatsapp.s4;
        r1.<init>(r12, r4, r13);
        r4.a(r1);
    L_0x01a7:
        r1 = r12.Z;
        r4 = r12.Q;
        r1.setOnClickListener(r4);
        if (r3 == 0) goto L_0x01ee;
    L_0x01b0:
        r1 = r12.Y;
        r1.setVisibility(r2);
        r1 = r12.Y;
        r2 = com.whatsapp.App.z();
        r4 = r13.z;
        r2 = android.text.format.Formatter.formatShortFileSize(r2, r4);
        r1.setText(r2);
        r1 = r13.k;
        r1 = r1.a;
        if (r1 == 0) goto L_0x01df;
    L_0x01ca:
        r0 = r0.file;
        if (r0 == 0) goto L_0x01df;
    L_0x01ce:
        r0 = r12.Z;
        r1 = 2130839593; // 0x7f020829 float:1.72842E38 double:1.0527746397E-314;
        r0.setImageResource(r1);
        r0 = r12.Z;
        r1 = r12.T;
        r0.setOnClickListener(r1);
        if (r3 == 0) goto L_0x01ee;
    L_0x01df:
        r0 = r12.Z;
        r1 = 2130839584; // 0x7f020820 float:1.7284183E38 double:1.0527746353E-314;
        r0.setImageResource(r1);
        r0 = r12.Z;
        r1 = r12.S;
        r0.setOnClickListener(r1);
    L_0x01ee:
        r0 = r13.H;
        if (r0 == 0) goto L_0x01fb;
    L_0x01f2:
        r0 = r13.H;
        r0 = (long) r0;
        r0 = android.text.format.DateUtils.formatElapsedTime(r0);
        if (r3 == 0) goto L_0x0205;
    L_0x01fb:
        r0 = com.whatsapp.App.z();
        r2 = r13.z;
        r0 = android.text.format.Formatter.formatShortFileSize(r0, r2);
    L_0x0205:
        r1 = r12.V;
        r1.setText(r0);
        return;
    L_0x020b:
        r1 = r2;
        goto L_0x0082;
    L_0x020e:
        r1 = r2;
        goto L_0x013a;
    L_0x0211:
        r1 = r2;
        goto L_0x016e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowAudio.a(com.whatsapp.protocol.co):void");
    }

    private void c() {
        if (this.ac != null) {
            this.ac.setVisibility(8);
        }
        if (this.aa != null) {
            this.aa.setVisibility(0);
        }
    }

    static bf b() {
        return W;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void f() {
        /*
        r3 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = bb;
        r0 = r0.append(r1);
        r1 = r3.e;
        r1 = r1.k;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r3.e;
        r0 = r0.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r0.transferring;
        if (r1 == 0) goto L_0x0025;
    L_0x0024:
        return;
    L_0x0025:
        r1 = r0.suspiciousContent;
        r2 = com.whatsapp.MediaData.SUSPICIOUS_CONTENT_YES;
        if (r1 != r2) goto L_0x0037;
    L_0x002b:
        r0 = r3.getContext();
        r1 = 2131231171; // 0x7f0801c3 float:1.8078415E38 double:1.052968105E-314;
        r2 = 1;
        com.whatsapp.App.b(r0, r1, r2);
        goto L_0x0024;
    L_0x0037:
        r1 = r0.transferred;
        if (r1 == 0) goto L_0x006c;
    L_0x003b:
        r1 = r0.file;
        if (r1 == 0) goto L_0x006c;
    L_0x003f:
        r0 = r0.file;
        r0 = android.net.Uri.fromFile(r0);
        r1 = new java.io.File;
        r0 = r0.getPath();
        r1.<init>(r0);
        r0 = r1.exists();
        if (r0 == 0) goto L_0x005a;
    L_0x0054:
        r0 = r1.canRead();
        if (r0 != 0) goto L_0x006c;
    L_0x005a:
        r0 = r3.getContext();
        r0 = r0 instanceof com.whatsapp.DialogToastActivity;
        if (r0 == 0) goto L_0x0024;
    L_0x0062:
        r0 = r3.getContext();
        r0 = (com.whatsapp.DialogToastActivity) r0;
        com.whatsapp.App.a(r0);
        goto L_0x0024;
    L_0x006c:
        r0 = r3.e;
        r0 = com.whatsapp.i8.a(r0);
        if (r0 == 0) goto L_0x007a;
    L_0x0074:
        r0 = com.whatsapp.i8.p;
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x00a0;
    L_0x007a:
        r1 = new com.whatsapp.i8;
        r0 = r3.getContext();
        r0 = (android.app.Activity) r0;
        r1.<init>(r0);
        r0 = r3.e;
        r1.c(r0);
        r0 = W;
        r2 = r3.e;
        r2 = r2.k;
        r0 = r0.get(r2);
        r0 = (java.lang.Integer) r0;
        if (r0 == 0) goto L_0x009f;
    L_0x0098:
        r0 = r0.intValue();
        r1.a(r0);
    L_0x009f:
        r0 = r1;
    L_0x00a0:
        r0.d();
        r3.i();
        goto L_0x0024;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowAudio.f():void");
    }

    protected int m468g() {
        return 2130903118;
    }

    static void d(ConversationRowAudio conversationRowAudio) {
        conversationRowAudio.c();
    }

    public static void a() {
        W.clear();
    }

    static VoiceNoteSeekBar c(ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.U;
    }

    static WaveformVisualizerView e(ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.ac;
    }

    private void c(boolean z) {
        View findViewById = ((Activity) getContext()).findViewById(2131755486);
        if (findViewById != null) {
            int i;
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            findViewById.setVisibility(i);
        }
    }

    public void a(co coVar, boolean z) {
        Object obj;
        if (coVar != this.e) {
            obj = 1;
        } else {
            obj = null;
        }
        super.a(coVar, z);
        if (obj != null || z) {
            a(coVar);
        }
    }

    ConversationRowAudio(Context context, co coVar) {
        super(context, coVar);
        this.Z = (ImageButton) findViewById(2131755525);
        this.ad = (ImageView) findViewById(2131755434);
        this.ad.setImageDrawable(ContextCompat.getDrawable(context, 2130837600));
        this.X = (ImageView) findViewById(2131755533);
        if (this.X != null) {
            this.X.setImageDrawable(ContextCompat.getDrawable(context, 2130837600));
        }
        this.aa = (ImageView) findViewById(R.id.icon);
        this.ab = (CircularProgressBar) findViewById(2131755526);
        this.U = (VoiceNoteSeekBar) findViewById(2131755527);
        this.Y = (TextView) findViewById(2131755528);
        this.V = (TextView) findViewById(2131755535);
        this.ab.setMax(100);
        this.ab.setProgressBarColor(ContextCompat.getColor(context, 2131624046));
        this.ab.setProgressBarBackgroundColor(536870912);
        this.U.setOnSeekBarChangeListener(new aew(this, coVar));
        a(coVar);
    }

    static TextView f(ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.V;
    }

    static ImageButton b(ConversationRowAudio conversationRowAudio) {
        return conversationRowAudio.Z;
    }

    static void a(ConversationRowAudio conversationRowAudio) {
        conversationRowAudio.g();
    }

    public void a(String str) {
        boolean z = DialogToastActivity.f;
        if (this.e.k.a) {
            if (str.equals(App.as.e().p)) {
                l();
                if (!z) {
                    return;
                }
            }
            return;
        }
        if (this.a) {
            if (str.equals(this.e.t)) {
                l();
                if (!z) {
                    return;
                }
            }
            return;
        }
        if (str.equals(this.e.k.c)) {
            l();
        }
    }
}
