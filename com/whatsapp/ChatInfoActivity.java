package com.whatsapp;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.graphics.Palette;
import android.transition.Fade;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.ao;
import com.whatsapp.util.bq;
import java.text.NumberFormat;
import java.util.HashSet;
import org.v;
import org.whispersystems.at;

public abstract class ChatInfoActivity extends DialogToastListActivity {
    private static final String z;
    private final HashSet t;
    a2g u;

    public class EncryptionExplanationDialogFragment extends DialogFragment {
        private static final String[] z;

        static {
            String[] strArr = new String[4];
            String str = "\u0018\f";
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
                            i3 = 56;
                            break;
                        case at.g /*1*/:
                            i3 = 36;
                            break;
                        case at.i /*2*/:
                            i3 = 22;
                            break;
                        case at.o /*3*/:
                            i3 = 38;
                            break;
                        default:
                            i3 = 76;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "RMr";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "RMr";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "QIfI?KMtJ)\u0018JwK)\u0018GyS\"L\u0004";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        @android.support.annotation.NonNull
        public android.app.Dialog onCreateDialog(android.os.Bundle r10) {
            /*
            r9 = this;
            r8 = 0;
            r7 = 1;
            r1 = com.whatsapp.DialogToastActivity.f;
            r0 = com.whatsapp.App.as;
            r2 = r9.getArguments();
            r3 = z;
            r4 = 2;
            r3 = r3[r4];
            r2 = r2.getString(r3);
            r2 = r0.b(r2);
            r0 = com.whatsapp.App.as;
            r3 = r2.p;
            r4 = com.whatsapp.it.ALLOW;
            r3 = r0.a(r3, r4);
            if (r3 == 0) goto L_0x0056;
        L_0x0023:
            r0 = r2.c();
            if (r0 == 0) goto L_0x0036;
        L_0x0029:
            r0 = r9.getContext();
            r4 = 2131231320; // 0x7f080258 float:1.8078718E38 double:1.0529681786E-314;
            r0 = r0.getString(r4);
            if (r1 == 0) goto L_0x00a3;
        L_0x0036:
            r0 = r2.m();
            if (r0 == 0) goto L_0x0049;
        L_0x003c:
            r0 = r9.getContext();
            r4 = 2131230849; // 0x7f080081 float:1.8077762E38 double:1.052967946E-314;
            r0 = r0.getString(r4);
            if (r1 == 0) goto L_0x00a3;
        L_0x0049:
            r0 = r9.getContext();
            r4 = 2131230950; // 0x7f0800e6 float:1.8077967E38 double:1.0529679957E-314;
            r0 = r0.getString(r4);
            if (r1 == 0) goto L_0x00a3;
        L_0x0056:
            r0 = r2.c();
            if (r0 == 0) goto L_0x0073;
        L_0x005c:
            r0 = r9.getContext();
            r4 = 2131231322; // 0x7f08025a float:1.8078722E38 double:1.0529681795E-314;
            r5 = new java.lang.Object[r7];
            r6 = r2.p;
            r6 = r9.b(r6);
            r5[r8] = r6;
            r0 = r0.getString(r4, r5);
            if (r1 == 0) goto L_0x00a3;
        L_0x0073:
            r0 = r2.m();
            if (r0 == 0) goto L_0x0090;
        L_0x0079:
            r0 = r9.getContext();
            r4 = 2131230851; // 0x7f080083 float:1.8077766E38 double:1.052967947E-314;
            r5 = new java.lang.Object[r7];
            r6 = r2.p;
            r6 = r9.b(r6);
            r5[r8] = r6;
            r0 = r0.getString(r4, r5);
            if (r1 == 0) goto L_0x00a3;
        L_0x0090:
            r0 = r9.getContext();
            r1 = 2131230952; // 0x7f0800e8 float:1.8077971E38 double:1.0529679967E-314;
            r4 = new java.lang.Object[r7];
            r5 = r2.i();
            r4[r8] = r5;
            r0 = r0.getString(r1, r4);
        L_0x00a3:
            r1 = new android.support.v7.app.AlertDialog$Builder;
            r4 = r9.getActivity();
            r1.<init>(r4);
            r4 = r9.getActivity();
            r4 = r4.getBaseContext();
            r0 = com.whatsapp.a28.b(r0, r4);
            r0 = r1.setMessage(r0);
            r0 = r0.setCancelable(r7);
            r1 = 2131231355; // 0x7f08027b float:1.8078789E38 double:1.052968196E-314;
            r4 = new com.whatsapp.asb;
            r4.<init>(r9);
            r0 = r0.setNeutralButton(r1, r4);
            r1 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
            r4 = new com.whatsapp.a4e;
            r4.<init>(r9);
            r0 = r0.setNegativeButton(r1, r4);
            if (r3 == 0) goto L_0x00f1;
        L_0x00da:
            r1 = r2.c();
            if (r1 != 0) goto L_0x00f1;
        L_0x00e0:
            r1 = r2.m();
            if (r1 != 0) goto L_0x00f1;
        L_0x00e6:
            r1 = 2131231356; // 0x7f08027c float:1.807879E38 double:1.0529681963E-314;
            r3 = new com.whatsapp.a2z;
            r3.<init>(r9, r2);
            r0.setPositiveButton(r1, r3);
        L_0x00f1:
            r0 = r0.create();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ChatInfoActivity.EncryptionExplanationDialogFragment.onCreateDialog(android.os.Bundle):android.app.Dialog");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String b(java.lang.String r14) {
            /*
            r13 = this;
            r12 = 4;
            r11 = 3;
            r10 = 2;
            r9 = 0;
            r8 = 1;
            r1 = com.whatsapp.DialogToastActivity.f;
            r0 = com.whatsapp.App.as;
            r2 = com.whatsapp.it.ALLOW;
            r2 = r0.b(r14, r2);
            r3 = new java.util.ArrayList;
            r0 = r2.size();
            r3.<init>(r0);
            r4 = new java.util.ArrayList;
            r0 = r2.size();
            r4.<init>(r0);
            r5 = r2.iterator();
        L_0x0025:
            r0 = r5.hasNext();
            if (r0 == 0) goto L_0x00b9;
        L_0x002b:
            r0 = r5.next();
            r0 = (java.lang.String) r0;
            r6 = com.whatsapp.App.as;
            r0 = r6.b(r0);
            r6 = r0.q;
            r6 = android.text.TextUtils.isEmpty(r6);
            if (r6 == 0) goto L_0x0048;
        L_0x003f:
            r6 = r0.i();
            r4.add(r6);
            if (r1 == 0) goto L_0x00a9;
        L_0x0048:
            r6 = com.whatsapp.App.as;
            r7 = r0.i();
            r6 = r6.b(r14, r7);
            if (r6 > r8) goto L_0x005d;
        L_0x0054:
            r6 = r0.i();
            r3.add(r6);
            if (r1 == 0) goto L_0x00a9;
        L_0x005d:
            r6 = com.whatsapp.App.as;
            r7 = r13.getContext();
            r7 = r0.a(r7);
            r6 = r6.c(r14, r7);
            if (r6 > r8) goto L_0x007a;
        L_0x006d:
            r6 = r13.getContext();
            r6 = r0.a(r6);
            r3.add(r6);
            if (r1 == 0) goto L_0x00a9;
        L_0x007a:
            r6 = new java.lang.StringBuilder;
            r6.<init>();
            r7 = r13.getContext();
            r7 = r0.a(r7);
            r6 = r6.append(r7);
            r7 = z;
            r7 = r7[r9];
            r6 = r6.append(r7);
            r0 = r0.s();
            r0 = r6.append(r0);
            r6 = ")";
            r0 = r0.append(r6);
            r0 = r0.toString();
            r3.add(r0);
        L_0x00a9:
            r0 = r3.size();
            if (r0 < r10) goto L_0x00b7;
        L_0x00af:
            r0 = r2.size();
            if (r0 < r12) goto L_0x00b7;
        L_0x00b5:
            if (r1 == 0) goto L_0x00b9;
        L_0x00b7:
            if (r1 == 0) goto L_0x0025;
        L_0x00b9:
            r4 = r4.iterator();
        L_0x00bd:
            r0 = r4.hasNext();
            if (r0 == 0) goto L_0x00e8;
        L_0x00c3:
            r0 = r4.next();
            r0 = (java.lang.String) r0;
            r5 = r3.size();
            r6 = r2.size();
            if (r5 != r6) goto L_0x00d5;
        L_0x00d3:
            if (r1 == 0) goto L_0x00e8;
        L_0x00d5:
            r5 = r3.size();
            if (r5 < r10) goto L_0x00e3;
        L_0x00db:
            r5 = r2.size();
            if (r5 < r12) goto L_0x00e3;
        L_0x00e1:
            if (r1 == 0) goto L_0x00e8;
        L_0x00e3:
            r3.add(r0);
            if (r1 == 0) goto L_0x00bd;
        L_0x00e8:
            r0 = r2.size();
            r1 = r3.size();
            r0 = r0 - r1;
            r1 = r13.getContext();
            if (r0 != 0) goto L_0x0163;
        L_0x00f7:
            r0 = r3.size();
            if (r0 != r8) goto L_0x0104;
        L_0x00fd:
            r0 = r3.get(r9);
            r0 = (java.lang.String) r0;
        L_0x0103:
            return r0;
        L_0x0104:
            r0 = r3.size();
            if (r0 != r10) goto L_0x0120;
        L_0x010a:
            r0 = 2131231514; // 0x7f08031a float:1.8079111E38 double:1.0529682744E-314;
            r2 = new java.lang.Object[r10];
            r4 = r3.get(r9);
            r2[r9] = r4;
            r3 = r3.get(r8);
            r2[r8] = r3;
            r0 = r1.getString(r0, r2);
            goto L_0x0103;
        L_0x0120:
            r0 = r3.size();
            if (r0 != r11) goto L_0x0142;
        L_0x0126:
            r0 = 2131231515; // 0x7f08031b float:1.8079113E38 double:1.052968275E-314;
            r2 = new java.lang.Object[r11];
            r4 = r3.get(r9);
            r2[r9] = r4;
            r4 = r3.get(r8);
            r2[r8] = r4;
            r3 = r3.get(r10);
            r2[r10] = r3;
            r0 = r1.getString(r0, r2);
            goto L_0x0103;
        L_0x0142:
            r0 = new java.lang.StringBuilder;
            r0.<init>();
            r1 = z;
            r1 = r1[r8];
            r0 = r0.append(r1);
            r1 = r3.size();
            r0 = r0.append(r1);
            r0 = r0.toString();
            com.whatsapp.auv.a(r9, r0);
            r0 = com.whatsapp.qm.a(r3);
            goto L_0x0103;
        L_0x0163:
            r1 = com.whatsapp.App.az;
            r2 = 2131296296; // 0x7f090028 float:1.8210505E38 double:1.053000281E-314;
            r4 = new java.lang.Object[r10];
            r3 = com.whatsapp.qm.a(r3);
            r4[r9] = r3;
            r3 = java.lang.Integer.valueOf(r0);
            r4[r8] = r3;
            r0 = r1.a(r2, r0, r4);
            goto L_0x0103;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ChatInfoActivity.EncryptionExplanationDialogFragment.b(java.lang.String):java.lang.String");
        }

        @NonNull
        public static EncryptionExplanationDialogFragment a(@NonNull String str) {
            EncryptionExplanationDialogFragment encryptionExplanationDialogFragment = new EncryptionExplanationDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(z[3], str);
            encryptionExplanationDialogFragment.setArguments(bundle);
            return encryptionExplanationDialogFragment;
        }
    }

    static {
        char[] toCharArray = "h\u001e\"u1g\u0016\"I0y\u0016>e-\u007f\u001e?x".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 11;
                    break;
                case at.g /*1*/:
                    i2 = 119;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public abstract String a();

    public ChatInfoActivity() {
        this.t = new HashSet();
    }

    void f() {
        if (this.u != null) {
            this.u.cancel(true);
        }
    }

    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        window.requestFeature(13);
        if (VERSION.SDK_INT >= 21) {
            Transition com_whatsapp_alj;
            if (getIntent().getBooleanExtra(z, false)) {
                window.requestFeature(12);
                com_whatsapp_alj = new alj();
                com_whatsapp_alj.addTarget(getString(2131232335));
                window.setSharedElementEnterTransition(com_whatsapp_alj);
            }
            com_whatsapp_alj = new Fade();
            com_whatsapp_alj.excludeTarget(16908335, true);
            com_whatsapp_alj.excludeTarget(16908336, true);
            window.setExitTransition(com_whatsapp_alj);
            window.setEnterTransition(com_whatsapp_alj);
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
        }
        supportRequestWindowFeature(5);
        super.onCreate(bundle);
    }

    void a(Bitmap bitmap, int i, int i2) {
        ChatInfoLayout chatInfoLayout = (ChatInfoLayout) findViewById(2131755310);
        chatInfoLayout.findViewById(2131755425).setVisibility(8);
        ImageView imageView = (ImageView) chatInfoLayout.findViewById(2131755434);
        if (bitmap != null) {
            Palette.generateAsync(bitmap, new hj(this, chatInfoLayout));
            imageView.setImageBitmap(bitmap);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        imageView.setImageResource(i);
        int color = ContextCompat.getColor(this, i2);
        chatInfoLayout.setColor(color);
        findViewById(2131755435).setBackgroundColor(0);
        findViewById(2131755436).setBackgroundColor(0);
        if (VERSION.SDK_INT >= 21) {
            float[] fArr = new float[3];
            ao.a(color, fArr);
            fArr[2] = (fArr[2] * 8.0f) / 10.0f;
            getWindow().setStatusBarColor(ao.a(fArr));
        }
    }

    void d() {
        f();
        this.u = new a2g(this, a());
        bq.a(this.u, new Void[0]);
    }

    protected void a(long j) {
        View findViewById = findViewById(2131755189);
        View findViewById2 = findViewById(2131755188);
        if (j == 0) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        findViewById.setVisibility(0);
        findViewById2.setVisibility(0);
        ((TextView) findViewById(2131755191)).setText(NumberFormat.getInstance().format(j));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.util.ArrayList r14) {
        /*
        r13 = this;
        r12 = 3;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = 2131755756; // 0x7f1002ec float:1.91424E38 double:1.0532272844E-314;
        r0 = r13.findViewById(r0);
        if (r14 == 0) goto L_0x0012;
    L_0x000c:
        r1 = r14.isEmpty();
        if (r1 == 0) goto L_0x0019;
    L_0x0012:
        r1 = 8;
        r0.setVisibility(r1);
        if (r3 == 0) goto L_0x012a;
    L_0x0019:
        r1 = 0;
        r0.setVisibility(r1);
        r0 = 2131755760; // 0x7f1002f0 float:1.9142408E38 double:1.0532272863E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r0.removeAllViews();
        r1 = r13.getResources();
        r2 = 2131427522; // 0x7f0b00c2 float:1.8476663E38 double:1.053065115E-314;
        r4 = r1.getDimensionPixelSize(r2);
        r1 = r13.getResources();
        r2 = 2131427521; // 0x7f0b00c1 float:1.847666E38 double:1.0530651147E-314;
        r5 = r1.getDimensionPixelSize(r2);
        r6 = new android.widget.ImageView;
        r6.<init>(r13);
        r1 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r6.setBackgroundResource(r1);
        r1 = new android.view.ViewGroup$LayoutParams;
        r2 = r4 + r5;
        r7 = r4 + r5;
        r1.<init>(r2, r7);
        r6.setLayoutParams(r1);
        r6.setPadding(r5, r5, r5, r5);
        r1 = new com.whatsapp.as6;
        r1.<init>(r13);
        r6.setOnClickListener(r1);
        r1 = new com.whatsapp.util.bz;
        r2 = 2130839418; // 0x7f02077a float:1.7283846E38 double:1.052774553E-314;
        r2 = android.support.v4.content.ContextCompat.getDrawable(r13, r2);
        r1.<init>(r2);
        r6.setImageDrawable(r1);
        r1 = android.widget.ImageView.ScaleType.CENTER;
        r6.setScaleType(r1);
        r7 = r14.iterator();
    L_0x0079:
        r1 = r7.hasNext();
        if (r1 == 0) goto L_0x0101;
    L_0x007f:
        r1 = r7.next();
        r1 = (com.whatsapp.protocol.co) r1;
        r8 = new com.whatsapp.ThumbnailTextButton;
        r8.<init>(r13);
        r2 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r8.setScaleType(r2);
        r2 = new android.view.ViewGroup$LayoutParams;
        r9 = r4 + r5;
        r10 = r4 + r5;
        r2.<init>(r9, r10);
        r8.setLayoutParams(r2);
        r8.setPadding(r5, r5, r5, r5);
        r2 = r4 / 6;
        r2 = (float) r2;
        r8.setTextSize(r2);
        r2 = 5;
        r8.setTextGravity(r2);
        r2 = r1.c;
        if (r2 == r12) goto L_0x00b1;
    L_0x00ac:
        r2 = r1.c;
        r9 = 2;
        if (r2 != r9) goto L_0x00db;
    L_0x00b1:
        r2 = r1.H;
        if (r2 == 0) goto L_0x00be;
    L_0x00b5:
        r2 = r1.H;
        r10 = (long) r2;
        r2 = android.text.format.DateUtils.formatElapsedTime(r10);
        if (r3 == 0) goto L_0x00c8;
    L_0x00be:
        r2 = com.whatsapp.App.z();
        r10 = r1.z;
        r2 = android.text.format.Formatter.formatShortFileSize(r2, r10);
    L_0x00c8:
        r8.setText(r2);
        r2 = r1.c;
        if (r2 != r12) goto L_0x00d9;
    L_0x00cf:
        r2 = 2130839627; // 0x7f02084b float:1.728427E38 double:1.0527746565E-314;
        r2 = android.support.v4.content.ContextCompat.getDrawable(r13, r2);
        r8.setIcon(r2);
    L_0x00d9:
        if (r3 == 0) goto L_0x00ec;
    L_0x00db:
        r2 = r1.c;
        r9 = 9;
        if (r2 != r9) goto L_0x00ec;
    L_0x00e1:
        r2 = r1.R;
        if (r2 == 0) goto L_0x00ec;
    L_0x00e5:
        r2 = com.whatsapp.util.cb.a(r1);
        r8.setText(r2);
    L_0x00ec:
        r2 = new com.whatsapp.h5;
        r2.<init>(r13, r1);
        r8.setOnClickListener(r2);
        r2 = new com.whatsapp.aw4;
        r2.<init>(r13, r4);
        com.whatsapp.util.bd.b(r1, r8, r2);
        r0.addView(r8);
        if (r3 == 0) goto L_0x0079;
    L_0x0101:
        r1 = r14.size();
        r2 = 12;
        if (r1 < r2) goto L_0x010c;
    L_0x0109:
        r0.addView(r6);
    L_0x010c:
        com.whatsapp.aam.a(r0);
        r0 = com.whatsapp.App.a1();
        if (r0 != 0) goto L_0x012a;
    L_0x0115:
        r0 = 2131755759; // 0x7f1002ef float:1.9142406E38 double:1.053227286E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.HorizontalScrollView) r0;
        r1 = r0.getViewTreeObserver();
        r2 = new com.whatsapp.alr;
        r2.<init>(r13, r0);
        r1.addOnGlobalLayoutListener(r2);
    L_0x012a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ChatInfoActivity.a(java.util.ArrayList):void");
    }

    static HashSet a(ChatInfoActivity chatInfoActivity) {
        return chatInfoActivity.t;
    }

    public void onDestroy() {
        super.onDestroy();
        f();
    }
}
