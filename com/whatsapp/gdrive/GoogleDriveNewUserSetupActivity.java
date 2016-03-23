package com.whatsapp.gdrive;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.whatsapp.App;
import com.whatsapp.aam;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class GoogleDriveNewUserSetupActivity extends SettingsGoogleDrive {
    private static SharedPreferences W;
    private static final String[] Z;
    private AppCompatSpinner P;
    private int Q;
    private List R;
    private final bd S;
    private Button T;
    private RadioButton[] U;
    private View V;
    private final OnGlobalLayoutListener X;
    private RadioGroup Y;

    static {
        String[] strArr = new String[30];
        String str = "xm)m,zV(a.jy\u0004q)z{\u0004t(pd+p?{V8k/q}";
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
                        i3 = 31;
                        break;
                    case at.g /*1*/:
                        i3 = 9;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = 4;
                        break;
                    default:
                        i3 = 90;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "xm)m,z$5a-2|(a(2z>p/o&2j9ml6a4k$+v5ry/))wf,jw|f.j.0o:m6zm";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "xm)m,zV(a.jy\u0004q)z{\u0004t(pd+p?{V8k/q}";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "|f6*-wh/w;oy\u0004t(zo>v?qj>w";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "xm)m,z$5a-2|(a(2z>p/o&8k4y`<)9wh5c?";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "xm)m,zV(a.jy\u0004q)z{\u0004t(pd+p?{V8k/q}";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "xm)m,z$5a-2|(a(2z>p/o&)a)z}vt(pd+pwla4s42j4q4k";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "xm)m,z$5a-2|(a(2z>p/o&)a)z}vt(pd+pwla4s42j4q4k&=e3sl?";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = "xm)m,z$5a-2|(a(2z>p/o&8v?~}>$4p)5a?{)/kz{`(t6~p{C5pn7a\u001em`-a\u0014z~\u000ew?mZ>p/oH8p3i`/}v?l#m.vg<*";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "sh\"k/kV2j<sh/a(";
                    obj = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "xm)m,z$5a-2|(a(2z>p/o&8v?~}>";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "xm)m,z$5a-2|(a(2z>p/o&5a\"k$(a.jyvt(pd+pwk`6a)kh6t";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "xm)m,z$5a-2|(a(2z>p/o&?a)k{4}";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "xm)m,z$5a-2|(a(2z>p/o&8v?~}>+/ql#t?|}>`w}h8o/o$=v?n|>j9f&";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "xm)m,z$5a-2|(a(2z>p/o&(l5je?))kh)pujg>|*zj/a>2k:g1jyvb(zxt";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "xm)m,z$5a-2|(a(2z>p/o&(l5je?))kh)puml<)4p}vr?m`=m?{";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "xm)m,z$5a-2|(a(2z>p/o&(l5je?))kh)puxm)m,z$:g9zz()4p}ve6sf,a>";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "xm)m,zV5a\"kV+v5ry/[<p{\u0004w?k|+[.vd>w.~d+";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "xm)m,zV.w?mV+v5ry/a>@o4v\u0005ll/q*@}2i?l}:i*";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "fp\"}wRDv`>";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "xm)m,z$5a-2|(a(2z>p/o&(e,z$.w?m$+v5ry/);xh2jwk`6a)kh6tu";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "xm)m,z$5a-2|(a(2z>p/o&(e,z$.w?m$+v5ry/);xh2jwk`6a)kh6tujg:f6z)/kz|f6i3k";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "xm)m,z$5a-2|(a(2z>p/o&(q<y`8m?q}vp3rlvt;lz>`wl`5g?2e:w.2|(a(2y)k7o}tp(jl";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "xm)m,zV5a\"kV+v5ry/[<p{\u0004w?k|+[.vd>w.~d+";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "xm)m,z$5a-2|(a(2z>p/o&(q<y`8m?q}vp3rlvt;lz>`wl`5g?2e:w.2|(a(2y)k7o}t";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "xm)m,z$5a-2|(a(2z>p/o&.t>~}>))z}.tw}}5+)z}.tw}}5)3l$5q6s";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "~g?v5vmum4kl5pt~j/m5q'\u0016E\u0013Q";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "~g?v5vmum4kl5pt|h/a=p{\"*\u0012PD\u001e";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "xm)m,z$5a-2|(a(2z>p/o&9e9t$+v?lz>`";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    Z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "xm)m,z$5a-2|(a(2z>p/o&2j9ml6a4k$+v5ry/))wf,jw|f.j.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static AppCompatSpinner c(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        return googleDriveNewUserSetupActivity.P;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(@android.support.annotation.NonNull java.lang.String r5, @android.support.annotation.Nullable android.widget.RadioButton r6) {
        /*
        r4 = this;
        r0 = 1;
        r1 = -1;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        r3 = 2131231929; // 0x7f0804b9 float:1.8079953E38 double:1.0529684794E-314;
        r3 = r4.getString(r3);
        r3 = r3.equals(r5);
        if (r3 == 0) goto L_0x0013;
    L_0x0011:
        if (r2 == 0) goto L_0x005e;
    L_0x0013:
        r0 = 2131231932; // 0x7f0804bc float:1.8079959E38 double:1.052968481E-314;
        r0 = r4.getString(r0);	 Catch:{ NumberFormatException -> 0x0082 }
        r0 = r0.equals(r5);	 Catch:{ NumberFormatException -> 0x0082 }
        if (r0 == 0) goto L_0x0023;
    L_0x0020:
        r0 = 2;
        if (r2 == 0) goto L_0x005e;
    L_0x0023:
        r0 = 2131231931; // 0x7f0804bb float:1.8079957E38 double:1.0529684804E-314;
        r0 = r4.getString(r0);	 Catch:{ NumberFormatException -> 0x0084 }
        r0 = r0.equals(r5);	 Catch:{ NumberFormatException -> 0x0084 }
        if (r0 == 0) goto L_0x0033;
    L_0x0030:
        r0 = 3;
        if (r2 == 0) goto L_0x005e;
    L_0x0033:
        r0 = 2131232332; // 0x7f08064c float:1.808077E38 double:1.0529686785E-314;
        r0 = r4.getString(r0);	 Catch:{ NumberFormatException -> 0x0086 }
        r0 = r0.equals(r5);	 Catch:{ NumberFormatException -> 0x0086 }
        if (r0 == 0) goto L_0x0043;
    L_0x0040:
        r0 = 0;
        if (r2 == 0) goto L_0x005e;
    L_0x0043:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = Z;
        r3 = 14;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r5);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r1;
    L_0x005e:
        r2 = r4.Q;
        r4.Q = r0;	 Catch:{ NumberFormatException -> 0x0088 }
        if (r6 == 0) goto L_0x006a;
    L_0x0064:
        r4.a();	 Catch:{ NumberFormatException -> 0x0088 }
        r4.a(r6);	 Catch:{ NumberFormatException -> 0x0088 }
    L_0x006a:
        r3 = 1;
        r4.d(r3);	 Catch:{ NumberFormatException -> 0x008a }
        if (r2 == r1) goto L_0x0078;
    L_0x0070:
        if (r2 == 0) goto L_0x0078;
    L_0x0072:
        r2 = com.whatsapp.gdrive.GoogleDriveService.g();	 Catch:{ NumberFormatException -> 0x008e }
        if (r2 != 0) goto L_0x0081;
    L_0x0078:
        if (r0 == 0) goto L_0x0081;
    L_0x007a:
        if (r0 == r1) goto L_0x0081;
    L_0x007c:
        r0 = r4.V;	 Catch:{ NumberFormatException -> 0x0092 }
        r0.performClick();	 Catch:{ NumberFormatException -> 0x0092 }
    L_0x0081:
        return;
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;
    L_0x0086:
        r0 = move-exception;
        throw r0;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x008e }
    L_0x008e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0090 }
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0092 }
    L_0x0092:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.a(java.lang.String, android.widget.RadioButton):void");
    }

    private static int q() {
        return o().getInt(Z[3], 0);
    }

    public void onBackPressed() {
        try {
            Intent intent = new Intent(Z[27]);
            intent.addCategory(Z[28]);
            intent.setFlags(268435456);
            startActivity(intent);
        } catch (Throwable e) {
            Log.b(Z[29], e);
            Toast.makeText(this, 2131231233, 1).show();
        }
    }

    private static SharedPreferences o() {
        try {
            if (W == null) {
                W = App.z().getSharedPreferences(Z[4], 0);
            }
            return W;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(int r4) {
        /*
        r0 = Z;	 Catch:{ NumberFormatException -> 0x0038 }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0038 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0038 }
        if (r4 == 0) goto L_0x0012;
    L_0x000b:
        l();	 Catch:{ NumberFormatException -> 0x003a }
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;	 Catch:{ NumberFormatException -> 0x003a }
        if (r0 == 0) goto L_0x0015;
    L_0x0012:
        n();	 Catch:{ NumberFormatException -> 0x003a }
    L_0x0015:
        r0 = java.util.Calendar.getInstance();
        r2 = java.lang.System.currentTimeMillis();
        r0.setTimeInMillis(r2);
        r1 = 2;
        r2 = 4;
        r3 = q();
        r3 = r3 + 1;
        r2 = java.lang.Math.min(r2, r3);
        r0.add(r1, r2);
        r0 = r0.getTimeInMillis();
        r0 = a(r0);
        return r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.b(int):boolean");
    }

    private void a() {
        this.Y.clearCheck();
        this.P.setSelection(this.R.size() - 1, true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(boolean r7) {
        /*
        r6 = this;
        r0 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = r6.T;	 Catch:{ NumberFormatException -> 0x0010 }
        if (r1 != 0) goto L_0x0012;
    L_0x0006:
        r0 = Z;	 Catch:{ NumberFormatException -> 0x0010 }
        r1 = 26;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0010 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0010 }
    L_0x000f:
        return;
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        r1 = new com.whatsapp.util.bz;
        r2 = r6.getResources();
        r3 = 2130837713; // 0x7f0200d1 float:1.7280388E38 double:1.052773711E-314;
        r2 = r2.getDrawable(r3);
        r1.<init>(r2);
        if (r7 == 0) goto L_0x004b;
    L_0x0024:
        r2 = r6.T;	 Catch:{ NumberFormatException -> 0x0080 }
        r3 = r6.getResources();	 Catch:{ NumberFormatException -> 0x0080 }
        r4 = 2131623943; // 0x7f0e0007 float:1.8875052E38 double:1.05316216E-314;
        r3 = r3.getColor(r4);	 Catch:{ NumberFormatException -> 0x0080 }
        r2.setTextColor(r3);	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = r6.getResources();	 Catch:{ NumberFormatException -> 0x0080 }
        r3 = 2131623943; // 0x7f0e0007 float:1.8875052E38 double:1.05316216E-314;
        r2 = r2.getColor(r3);	 Catch:{ NumberFormatException -> 0x0080 }
        r3 = android.graphics.PorterDuff.Mode.SRC_ATOP;	 Catch:{ NumberFormatException -> 0x0080 }
        r1.setColorFilter(r2, r3);	 Catch:{ NumberFormatException -> 0x0080 }
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r1.setAlpha(r2);	 Catch:{ NumberFormatException -> 0x0080 }
        if (r0 == 0) goto L_0x0065;
    L_0x004b:
        r2 = r6.getResources();
        r3 = 2131624021; // 0x7f0e0055 float:1.887521E38 double:1.0531621986E-314;
        r2 = r2.getColor(r3);
        r3 = r6.T;
        r3.setTextColor(r2);
        r3 = android.graphics.PorterDuff.Mode.SRC_ATOP;
        r1.setColorFilter(r2, r3);
        r2 = r2 >>> 24;
        r1.setAlpha(r2);
    L_0x0065:
        r2 = com.whatsapp.App.a1();	 Catch:{ NumberFormatException -> 0x0082 }
        if (r2 == 0) goto L_0x0075;
    L_0x006b:
        r2 = r6.T;	 Catch:{ NumberFormatException -> 0x007e }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r2.setCompoundDrawablesWithIntrinsicBounds(r3, r4, r1, r5);	 Catch:{ NumberFormatException -> 0x007e }
        if (r0 == 0) goto L_0x000f;
    L_0x0075:
        r0 = r6.T;	 Catch:{ NumberFormatException -> 0x007e }
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);	 Catch:{ NumberFormatException -> 0x007e }
        goto L_0x000f;
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x007e }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.d(boolean):void");
    }

    public void d(int i) {
        if (i == 14) {
            try {
                this.Q = 0;
                this.T.performClick();
                if (!GoogleDriveService.c) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        super.d(i);
    }

    private static boolean l() {
        Log.i(Z[7]);
        Editor edit = o().edit();
        try {
            edit.remove(Z[6]);
            if (edit.commit()) {
                return true;
            }
            Log.w(Z[8]);
            return false;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r4) {
        /*
        r3 = this;
        r1 = com.whatsapp.gdrive.GoogleDriveService.c;
        super.onConfigurationChanged(r4);
        r0 = Z;
        r2 = 5;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r3.j();
        r0 = -1;
        r2 = r3.Q;
        switch(r2) {
            case 0: goto L_0x0062;
            case 1: goto L_0x0035;
            case 2: goto L_0x0044;
            case 3: goto L_0x0053;
            default: goto L_0x0016;
        };
    L_0x0016:
        if (r0 < 0) goto L_0x0026;
    L_0x0018:
        r2 = r3.U;	 Catch:{ NumberFormatException -> 0x0070 }
        r2 = r2[r0];	 Catch:{ NumberFormatException -> 0x0070 }
        r3.a(r2);	 Catch:{ NumberFormatException -> 0x0070 }
        r2 = r3.P;	 Catch:{ NumberFormatException -> 0x0070 }
        r2.setSelection(r0);	 Catch:{ NumberFormatException -> 0x0070 }
        if (r1 == 0) goto L_0x0029;
    L_0x0026:
        r3.a();	 Catch:{ NumberFormatException -> 0x0070 }
    L_0x0029:
        r0 = r3.Y;
        r0 = r0.getViewTreeObserver();
        r1 = r3.X;
        r0.addOnGlobalLayoutListener(r1);
        return;
    L_0x0035:
        r0 = r3.R;
        r2 = 2131231929; // 0x7f0804b9 float:1.8079953E38 double:1.0529684794E-314;
        r2 = r3.getString(r2);
        r0 = r0.indexOf(r2);
        if (r1 == 0) goto L_0x0016;
    L_0x0044:
        r0 = r3.R;
        r2 = 2131231932; // 0x7f0804bc float:1.8079959E38 double:1.052968481E-314;
        r2 = r3.getString(r2);
        r0 = r0.indexOf(r2);
        if (r1 == 0) goto L_0x0016;
    L_0x0053:
        r0 = r3.R;
        r2 = 2131231931; // 0x7f0804bb float:1.8079957E38 double:1.0529684804E-314;
        r2 = r3.getString(r2);
        r0 = r0.indexOf(r2);
        if (r1 == 0) goto L_0x0016;
    L_0x0062:
        r0 = r3.R;
        r2 = 2131232332; // 0x7f08064c float:1.808077E38 double:1.0529686785E-314;
        r2 = r3.getString(r2);
        r0 = r0.indexOf(r2);
        goto L_0x0016;
    L_0x0070:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.onConfigurationChanged(android.content.res.Configuration):void");
    }

    static boolean a(int i) {
        return b(i);
    }

    static void a(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity, String str, RadioButton radioButton) {
        googleDriveNewUserSetupActivity.a(str, radioButton);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m() {
        /*
        r0 = 1;
        r1 = 0;
        r3 = com.whatsapp.gdrive.GoogleDriveService.c;
        r2 = com.whatsapp.gdrive.GoogleDriveService.z();	 Catch:{ NumberFormatException -> 0x0014 }
        if (r2 != 0) goto L_0x0016;
    L_0x000a:
        r0 = Z;	 Catch:{ NumberFormatException -> 0x0014 }
        r2 = 17;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x0014 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0014 }
    L_0x0013:
        return r1;
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r2 = com.whatsapp.App.z();	 Catch:{ NumberFormatException -> 0x002b }
        r2 = com.whatsapp.App.t(r2);	 Catch:{ NumberFormatException -> 0x002b }
        r4 = 3;
        if (r2 == r4) goto L_0x002d;
    L_0x0021:
        r0 = Z;	 Catch:{ NumberFormatException -> 0x002b }
        r2 = 16;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x002b }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x002b }
        goto L_0x0013;
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r4 = com.whatsapp.gdrive.GoogleDriveService.Y();
        switch(r4) {
            case 0: goto L_0x0059;
            case 1: goto L_0x005b;
            case 2: goto L_0x005b;
            case 3: goto L_0x005b;
            case 4: goto L_0x005b;
            default: goto L_0x0034;
        };
    L_0x0034:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = Z;
        r5 = 15;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r2 = r0;
    L_0x004f:
        if (r2 == 0) goto L_0x006b;
    L_0x0051:
        r2 = r();	 Catch:{ NumberFormatException -> 0x0069 }
        if (r2 == 0) goto L_0x006b;
    L_0x0057:
        r1 = r0;
        goto L_0x0013;
    L_0x0059:
        if (r3 == 0) goto L_0x006d;
    L_0x005b:
        r2 = com.whatsapp.gdrive.GoogleDriveService.g();	 Catch:{ NumberFormatException -> 0x0065 }
        if (r2 != 0) goto L_0x0067;
    L_0x0061:
        r2 = r0;
    L_0x0062:
        if (r3 == 0) goto L_0x004f;
    L_0x0064:
        goto L_0x0034;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r2 = r1;
        goto L_0x0062;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = r1;
        goto L_0x0057;
    L_0x006d:
        r2 = r0;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.GoogleDriveNewUserSetupActivity.m():boolean");
    }

    public static boolean a(long j) {
        Editor edit = o().edit();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(Z[20], Locale.US);
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTimeInMillis(j);
            Log.i(Z[21] + j + " " + simpleDateFormat.format(instance.getTime()));
            edit.putLong(Z[18], j);
            edit.remove(Z[19]);
            if (edit.commit()) {
                return true;
            }
            Log.w(Z[22]);
            return false;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    protected void onDestroy() {
        Log.i(Z[13]);
        super.onDestroy();
    }

    protected void m466l() {
        try {
            GoogleDriveService.c(0);
            if (this.Q != 0) {
                d(false);
                a();
                this.Q = -1;
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static boolean r() {
        try {
            long j = o().getLong(Z[24], -1);
            long currentTimeMillis = System.currentTimeMillis();
            if (j < 0) {
                return true;
            }
            if (currentTimeMillis - j <= 0) {
                return false;
            }
            try {
                Log.i(Z[23]);
                return true;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (Throwable e2) {
            Log.b(Z[25], e2);
            return true;
        }
    }

    private static boolean n() {
        Log.i(Z[1]);
        int q = q();
        if (q < 0) {
            q = 0;
        }
        Editor edit = o().edit();
        try {
            edit.putInt(Z[0], q + 1);
            if (edit.commit()) {
                return true;
            }
            Log.w(Z[2]);
            return false;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static RadioGroup b(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        return googleDriveNewUserSetupActivity.Y;
    }

    private void j() {
        boolean z = GoogleDriveService.c;
        int width = getWindowManager().getDefaultDisplay().getWidth() - getResources().getDimensionPixelSize(2131427493);
        RadioButton[] radioButtonArr = this.U;
        int length = radioButtonArr.length;
        int i = 0;
        while (i < length) {
            radioButtonArr[i].setWidth(width);
            i++;
            if (z) {
                return;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z = GoogleDriveService.c;
        try {
            super.onCreate(bundle);
            Log.i(Z[11]);
            if (m()) {
                setTitle(2131231238);
                getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                findViewById(2131755239).setVisibility(8);
                findViewById(2131755249).setVisibility(8);
                findViewById(2131755251).setVisibility(8);
                findViewById(2131755258).setVisibility(8);
                findViewById(2131755262).setVisibility(8);
                findViewById(2131755235).setVisibility(0);
                findViewById(2131755236).setVisibility(0);
                TextView textView = (TextView) findViewById(2131755264);
                textView.setText(getString(2131231235, new Object[]{getString(2131231968), getString(2131231906), getString(2131231894)}));
                textView.setVisibility(0);
                findViewById(2131755257).setVisibility(0);
                textView = (TextView) findViewById(2131755234);
                textView.setVisibility(0);
                textView.setText(2131231234);
                textView = (TextView) findViewById(2131755255);
                textView.setText(2131231232);
                textView.setTextColor(getResources().getColorStateList(2131624104));
                ((TextView) findViewById(2131755256)).setTextColor(getResources().getColorStateList(2131624103));
                this.V = findViewById(2131755254);
                this.Y = (RadioGroup) findViewById(2131755237);
                this.R = new ArrayList();
                String[] stringArray = getResources().getStringArray(2131689483);
                int length = stringArray.length;
                int i = 0;
                while (i < length) {
                    String str = stringArray[i];
                    try {
                        if (!str.equals(getString(2131231930))) {
                            if (!str.equals(getString(2131232332))) {
                                this.R.add(str);
                            }
                        }
                        i++;
                        if (z) {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                this.R.add(getString(2131232332));
                this.R.add(getString(2131231237));
                this.Y.setVisibility(0);
                SpinnerAdapter arrayAdapter = new ArrayAdapter(this, 17367048, this.R);
                arrayAdapter.setDropDownViewResource(17367049);
                this.P = (AppCompatSpinner) findViewById(2131755238);
                this.P.setAdapter(arrayAdapter);
                this.P.setSelection(this.R.size() - 1);
                this.P.setOnItemSelectedListener(new ca(this));
                LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Z[10]);
                this.U = new RadioButton[(this.R.size() - 1)];
                this.Y.addView(aam.a(layoutInflater, 2130903189, null));
                int i2 = 0;
                while (i2 < this.U.length) {
                    String str2 = (String) this.R.get(i2);
                    RadioButton radioButton = (RadioButton) aam.a(layoutInflater, 2130903190, null);
                    radioButton.setText(str2);
                    this.Y.addView(radioButton);
                    this.Y.addView(aam.a(layoutInflater, 2130903189, null));
                    this.U[i2] = radioButton;
                    radioButton.setOnClickListener(new b2(this, str2, radioButton));
                    int i3 = i2 + 1;
                    if (z) {
                        break;
                    }
                    i2 = i3;
                }
                j();
                this.T = (Button) findViewById(2131755265);
                this.T.setVisibility(0);
                d(false);
                this.T.setOnClickListener(new dt(this));
                this.Y.getViewTreeObserver().addOnGlobalLayoutListener(this.X);
                return;
            }
            Log.i(Z[9]);
            setResult(-1);
            finish();
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    private void a(RadioButton radioButton) {
        radioButton.toggle();
        this.P.setSelection(this.R.indexOf(radioButton.getText().toString()));
    }

    protected void m467n() {
    }

    public GoogleDriveNewUserSetupActivity() {
        this.Q = -1;
        this.X = new c8(this);
        this.S = new bd();
    }

    static int a(GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity) {
        return googleDriveNewUserSetupActivity.Q;
    }
}
