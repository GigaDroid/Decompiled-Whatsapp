package com.whatsapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.widget.Button;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class RequestPermissionActivity extends WAAppCompatActivity {
    private static final Map d;
    private static final String[] z;
    private boolean e;

    public static void a(@NonNull Activity activity, int i, int i2, boolean z) {
        if (!activity.isFinishing()) {
            activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra(z[9], 2130839699).putExtra(z[10], new String[]{z[11], z[7]}).putExtra(z[12], i).putExtra(z[8], i2).putExtra(z[13], z), 150);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    private boolean a(@NonNull String[] strArr) {
        boolean z = DialogToastActivity.f;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            if (App.h(this, str) == 0) {
                App.g(this, str);
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static void a(@NonNull Activity activity, @NonNull String[] strArr) {
        boolean z = DialogToastActivity.f;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            App.a((Context) activity, strArr[i]);
            i++;
            if (z) {
                break;
            }
        }
        ActivityCompat.requestPermissions(activity, strArr, 0);
    }

    public static void b(@NonNull Activity activity, int i, int i2) {
        a(activity, i, i2, false);
    }

    public static boolean c(@NonNull Activity activity, @NonNull String[] strArr) {
        boolean z = DialogToastActivity.f;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            if (!App.i(activity, strArr[i])) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean b(@NonNull Activity activity, @NonNull String[] strArr) {
        boolean z = DialogToastActivity.f;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(activity, strArr[i])) {
                i++;
                if (z) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    static {
        String[] strArr = new String[46];
        String str = ")q-\u001f\u0004=q1\u001b:5K2\u0017(*u8\u0017\u00040p";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 89;
                        break;
                    case at.g /*1*/:
                        i4 = 20;
                        break;
                    case at.i /*2*/:
                        i4 = 95;
                        break;
                    case at.o /*3*/:
                        i4 = 114;
                        break;
                    default:
                        i4 = 91;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    str = "+q.\u0007>*`p\u0002>+y6\u0001(0{1]::`6\u00042-mp\u00063<f:R2*41\u001d{4q,\u0001:>q\u007f\u001b?yr0\u0000{";
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "4q,\u0001:>q\u0000\u001b?";
                    i = 2;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "3};";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "+q.\u0007>*`p\u0002>+y6\u0001(0{1]::`6\u00042-mp\u0002>+y6\u0001(0{1\u0001{1u,R9<q1R<+u1\u0006>=4(\u001a25q\u007f\u0005>yc:\u0000>yd>\u0007(<p";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    str = ")q-\u001f2*g6\u001d5*";
                    i = 5;
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    strArr2 = strArr3;
                    str = "8z;\u000040pq\u0002>+y6\u0001(0{1\\\f\u000b]\u000b7\u0004\u001a[\u0011&\u001a\u001a@\f";
                    i = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = ")q-\u001f\u0004=q1\u001b:5K2\u0017(*u8\u0017\u00040p";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "=f>\u0005:;x:-2=";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = ")q-\u001f2*g6\u001d5*";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "8z;\u000040pq\u0002>+y6\u0001(0{1\\\t\u001cU\u001b-\u0018\u0016Z\u000b3\u0018\rG";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "4q,\u0001:>q\u0000\u001b?";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "?{-\u0011>\u0006a6";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "=f>\u0005:;x:-2=g";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "=f>\u0005:;x:-2=";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = ")q-\u001f\u0004=q1\u001b:5K2\u0017(*u8\u0017\u00040p";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "+q.\u0007>*`p\u0002>+y6\u0001(0{1]::`6\u00042-mp\u001c4td:\u000060g,\u001b47gr\u0002:*g:\u0016";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = ")q-\u001f2*g6\u001d5*K-\u0017*,q,\u0006>=";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "?{-\u0011>\u0006a6";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    str = "+q.\u0007>*`p\u0002>+y6\u0001(0{1]::`6\u00042-mp\u0011)<u+\u0017";
                    i = 19;
                    i2 = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    strArr2 = strArr3;
                    str = ")q-\u001f2*g6\u001d5*";
                    i = 20;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = ")q-\u001f2*g6\u001d5*K-\u0017*,q,\u0006>=";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "+q.\u0007>*`p\u0002>+y6\u0001(0{1]::`6\u00042-mp";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "yp:\u001c2<p";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = ")q-\u001f\u0004=q1\u001b:5K2\u0017(*u8\u0017\u00040p";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = ")q-\u001f2*g6\u001d5*";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "4q,\u0001:>q\u0000\u001b?";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "?{-\u0011>\u0006a6";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "8z;\u000040pq\u0002>+y6\u0001(0{1\\\f\u000b]\u000b7\u0004\u001cL\u000b7\t\u0017U\u0013-\b\r[\r3\u001c\u001c";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    str = "=f>\u0005:;x:-2=";
                    i = 29;
                    i2 = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    strArr2 = strArr3;
                    str = "8z;\u000040pq\u0002>+y6\u0001(0{1\\\t\u001cU\u001b-\u001e\u0001@\u001a \u0015\u0018X\u0000!\u000f\u0016F\u001e5\u001e";
                    i = 30;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = ")q-\u001f\u0004=q1\u001b:5K2\u0017(*u8\u0017\u00040p";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "=f>\u0005:;x:-2=g";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "=f>\u0005:;x:-2=";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = ")q-\u001f\u0004=q1\u001b:5K2\u0017(*u8\u0017\u00040p";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = ":{1\u0004>+g>\u000626zp\u00113<w4]88y:\u0000:vg+\u001d)8s:]+<f2\u001b(*}0\u001c(va1\u0017#)q<\u0006>=4-\u0017*,q,\u0006{:{;\u0017{";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "8z;\u000040pq\u0002>+y6\u0001(0{1\\\u0018\u0018Y\u001a \u001a";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = ")q-\u001f2*g6\u001d5*";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "8z;\u000040pq\u0002>+y6\u0001(0{1\\\f\u000b]\u000b7\u0004\u001cL\u000b7\t\u0017U\u0013-\b\r[\r3\u001c\u001c";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = ")q-\u001f2*g6\u001d5*";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "4q,\u0001:>q\u0000\u001b?";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "8z;\u000040pq\u0002>+y6\u0001(0{1\\\t\u001cU\u001b-\u001e\u0001@\u001a \u0015\u0018X\u0000!\u000f\u0016F\u001e5\u001e";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "8z;\u000040pq\u0002>+y6\u0001(0{1\\\u0018\u0018Y\u001a \u001a";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "4q,\u0001:>q\u0000\u001b?";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "8z;\u000040pq\u0002>+y6\u0001(0{1\\\u0018\u0018Y\u001a \u001a";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    Map hashMap = new HashMap(3);
                    hashMap.put(Integer.valueOf(30), new int[]{2131231641, 2131231640, 2131231656, 2131231655, 2131231606, 2131231597});
                    hashMap.put(Integer.valueOf(31), new int[]{2131231637, 2131231636, 2131231650, 2131231649, 2131231599, 2131231598});
                    hashMap.put(Integer.valueOf(32), new int[]{2131231639, 2131231638, 2131231652, 2131231651, 2131231601, 2131231600});
                    d = Collections.unmodifiableMap(hashMap);
                    return;
                default:
                    strArr2[i2] = str;
                    i2 = 1;
                    strArr2 = strArr3;
                    str = ")q-\u001f2*g6\u001d5*";
                    i = 0;
                    break;
            }
        }
    }

    public static void a(@NonNull Activity activity, int i, int i2) {
        b(activity, i, i2, false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        r7 = 8;
        r9 = 2131755834; // 0x7f10033a float:1.9142558E38 double:1.053227323E-314;
        r8 = 2131755743; // 0x7f1002df float:1.9142374E38 double:1.053227278E-314;
        r2 = 1;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r4 = 20;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r11);
        r0 = r10.getWindow();
        r4 = new android.graphics.drawable.ColorDrawable;
        r5 = r10.getResources();
        r6 = 2131624052; // 0x7f0e0074 float:1.8875273E38 double:1.053162214E-314;
        r5 = r5.getColor(r6);
        r4.<init>(r5);
        r0.setBackgroundDrawable(r4);
        r0 = r10.getLayoutInflater();
        r4 = 2130903249; // 0x7f0300d1 float:1.741331E38 double:1.05280609E-314;
        r5 = 0;
        r0 = com.whatsapp.aam.a(r0, r4, r5, r1);
        r10.setContentView(r0);
        r0 = 2131755369; // 0x7f100169 float:1.9141615E38 double:1.053227093E-314;
        r0 = r10.findViewById(r0);
        r4 = new com.whatsapp.zw;
        r4.<init>(r10);
        r0.setOnClickListener(r4);
        r0 = r10.getIntent();
        r4 = r0.getExtras();
        r0 = z;
        r5 = 21;
        r0 = r0[r5];
        r5 = r4.getStringArray(r0);
        if (r5 != 0) goto L_0x006e;
    L_0x0061:
        r0 = z;
        r1 = 17;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r10.finish();
    L_0x006d:
        return;
    L_0x006e:
        r0 = z;
        r6 = 15;
        r0 = r0[r6];
        r6 = r4.getInt(r0);
        if (r6 == 0) goto L_0x0096;
    L_0x007a:
        r0 = 2131755833; // 0x7f100339 float:1.9142556E38 double:1.0532273224E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r0.setImageResource(r6);
        r0 = r10.findViewById(r8);
        r0.setVisibility(r7);
        r0 = r10.findViewById(r9);
        r0.setVisibility(r7);
        if (r3 == 0) goto L_0x00d9;
    L_0x0096:
        r0 = z;
        r6 = 14;
        r0 = r0[r6];
        r6 = r4.getIntArray(r0);
        if (r6 == 0) goto L_0x00d9;
    L_0x00a2:
        r0 = r6.length;
        r7 = 3;
        if (r0 != r7) goto L_0x00d9;
    L_0x00a6:
        r0 = r10.findViewById(r8);
        r0 = (android.widget.ImageView) r0;
        r7 = r6[r1];
        r0.setImageResource(r7);
        r0 = r10.findViewById(r8);
        r0.setVisibility(r1);
        r0 = 2131755833; // 0x7f100339 float:1.9142556E38 double:1.0532273224E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r7 = r6[r2];
        r0.setImageResource(r7);
        r0 = r10.findViewById(r9);
        r0 = (android.widget.ImageView) r0;
        r7 = 2;
        r6 = r6[r7];
        r0.setImageResource(r6);
        r0 = r10.findViewById(r9);
        r0.setVisibility(r1);
    L_0x00d9:
        if (r11 == 0) goto L_0x00e7;
    L_0x00db:
        r0 = z;
        r6 = 18;
        r0 = r0[r6];
        r0 = r11.getBoolean(r0, r1);
        r10.e = r0;
    L_0x00e7:
        r0 = z;
        r6 = 19;
        r0 = r0[r6];
        r0 = r4.getBoolean(r0, r1);
        if (r0 != 0) goto L_0x0105;
    L_0x00f3:
        r0 = z;
        r6 = 16;
        r0 = r0[r6];
        r0 = r4.getInt(r0);
        if (r0 == 0) goto L_0x0105;
    L_0x00ff:
        r0 = b(r10, r5);
        if (r0 == 0) goto L_0x012e;
    L_0x0105:
        r0 = r2;
    L_0x0106:
        r6 = r10.e;
        if (r6 != 0) goto L_0x0112;
    L_0x010a:
        if (r0 != 0) goto L_0x0117;
    L_0x010c:
        r6 = c(r10, r5);
        if (r6 == 0) goto L_0x0117;
    L_0x0112:
        r10.b(r5);
        if (r3 == 0) goto L_0x006d;
    L_0x0117:
        if (r0 != 0) goto L_0x0130;
    L_0x0119:
        r3 = r2;
    L_0x011a:
        r10.a(r4, r3);
        if (r0 != 0) goto L_0x0132;
    L_0x011f:
        r10.a(r5, r2);
        r0 = 2131755832; // 0x7f100338 float:1.9142554E38 double:1.053227322E-314;
        r0 = r10.findViewById(r0);
        r0.setVisibility(r1);
        goto L_0x006d;
    L_0x012e:
        r0 = r1;
        goto L_0x0106;
    L_0x0130:
        r3 = r1;
        goto L_0x011a;
    L_0x0132:
        r2 = r1;
        goto L_0x011f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.onCreate(android.os.Bundle):void");
    }

    public static void a(@NonNull Activity activity, int i, int i2, int i3) {
        a(activity, i, i2, false, i3);
    }

    protected void onResume() {
        super.onResume();
        String[] stringArray = getIntent().getExtras().getStringArray(z[6]);
        if (stringArray == null || a(stringArray)) {
            Log.i(z[5]);
            setResult(-1);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(z[22], this.e);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r7, @android.support.annotation.NonNull java.lang.String[] r8, @android.support.annotation.NonNull int[] r9) {
        /*
        r6 = this;
        r1 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        super.onRequestPermissionsResult(r7, r8, r9);
        if (r7 == 0) goto L_0x0009;
    L_0x0008:
        return;
    L_0x0009:
        r0 = -1;
        r6.setResult(r0);
        r0 = r1;
    L_0x000e:
        r3 = r8.length;
        if (r0 >= r3) goto L_0x0049;
    L_0x0011:
        r3 = r9[r0];
        if (r3 != 0) goto L_0x001c;
    L_0x0015:
        r3 = r8[r0];
        com.whatsapp.App.g(r6, r3);
        if (r2 == 0) goto L_0x0045;
    L_0x001c:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 23;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = r8[r0];
        r3 = r3.append(r4);
        r4 = z;
        r5 = 24;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r6.setResult(r1);
    L_0x0045:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x000e;
    L_0x0049:
        r6.finish();
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }

    public void b(@NonNull String[] strArr) {
        this.e = true;
        a((Activity) this, strArr);
        findViewById(2131755832).setVisibility(8);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(@android.support.annotation.NonNull android.app.Activity r13, int r14) {
        /*
        r12 = 2;
        r11 = 3;
        r2 = 1;
        r3 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.aO();
        if (r0 != 0) goto L_0x0047;
    L_0x000c:
        r1 = r2;
    L_0x000d:
        r0 = z;
        r4 = 43;
        r0 = r0[r4];
        r0 = com.whatsapp.App.h(r13, r0);
        if (r0 == 0) goto L_0x0049;
    L_0x0019:
        r4 = r2;
    L_0x001a:
        r0 = d;
        r6 = java.lang.Integer.valueOf(r14);
        r0 = r0.get(r6);
        r0 = (int[]) r0;
        if (r0 != 0) goto L_0x004d;
    L_0x0028:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r5 = z;
        r6 = 36;
        r5 = r5[r6];
        r0 = r0.append(r5);
        r0 = r0.append(r14);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        if (r4 != 0) goto L_0x004b;
    L_0x0044:
        if (r1 != 0) goto L_0x004b;
    L_0x0046:
        return r2;
    L_0x0047:
        r1 = r3;
        goto L_0x000d;
    L_0x0049:
        r4 = r3;
        goto L_0x001a;
    L_0x004b:
        r2 = r3;
        goto L_0x0046;
    L_0x004d:
        if (r4 == 0) goto L_0x00a8;
    L_0x004f:
        if (r1 == 0) goto L_0x00a8;
    L_0x0051:
        r6 = new android.content.Intent;
        r7 = com.whatsapp.RequestPermissionActivity.class;
        r6.<init>(r13, r7);
        r7 = z;
        r8 = 33;
        r7 = r7[r8];
        r8 = new int[r11];
        r8 = {2130839704, 2130839702, 2130839697};
        r6 = r6.putExtra(r7, r8);
        r7 = z;
        r8 = 38;
        r7 = r7[r8];
        r8 = new java.lang.String[r11];
        r9 = z;
        r10 = 45;
        r9 = r9[r10];
        r8[r3] = r9;
        r9 = z;
        r10 = 39;
        r9 = r9[r10];
        r8[r2] = r9;
        r9 = z;
        r10 = 42;
        r9 = r9[r10];
        r8[r12] = r9;
        r6 = r6.putExtra(r7, r8);
        r7 = z;
        r8 = 44;
        r7 = r7[r8];
        r8 = r0[r3];
        r6 = r6.putExtra(r7, r8);
        r7 = z;
        r8 = 32;
        r7 = r7[r8];
        r8 = r0[r2];
        r6 = r6.putExtra(r7, r8);
        r13.startActivityForResult(r6, r14);
        if (r5 == 0) goto L_0x00fa;
    L_0x00a8:
        if (r1 == 0) goto L_0x00b3;
    L_0x00aa:
        r6 = r0[r12];
        r7 = r0[r11];
        a(r13, r6, r7, r14);
        if (r5 == 0) goto L_0x00fa;
    L_0x00b3:
        if (r4 == 0) goto L_0x00fa;
    L_0x00b5:
        r5 = new android.content.Intent;
        r6 = com.whatsapp.RequestPermissionActivity.class;
        r5.<init>(r13, r6);
        r6 = z;
        r7 = 34;
        r6 = r6[r7];
        r7 = 2130839697; // 0x7f020891 float:1.7284412E38 double:1.052774691E-314;
        r5 = r5.putExtra(r6, r7);
        r6 = z;
        r7 = 41;
        r6 = r6[r7];
        r7 = 4;
        r7 = r0[r7];
        r5 = r5.putExtra(r6, r7);
        r6 = z;
        r7 = 35;
        r6 = r6[r7];
        r7 = 5;
        r0 = r0[r7];
        r0 = r5.putExtra(r6, r0);
        r5 = z;
        r6 = 40;
        r5 = r5[r6];
        r6 = new java.lang.String[r2];
        r7 = z;
        r8 = 37;
        r7 = r7[r8];
        r6[r3] = r7;
        r0 = r0.putExtra(r5, r6);
        r13.startActivityForResult(r0, r14);
    L_0x00fa:
        if (r4 != 0) goto L_0x00fe;
    L_0x00fc:
        if (r1 == 0) goto L_0x0046;
    L_0x00fe:
        r2 = r3;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.a(android.app.Activity, int):boolean");
    }

    private void a(@NonNull String[] strArr, boolean z) {
        Button button = (Button) findViewById(2131755370);
        if (z) {
            button.setText(2131231634);
            button.setOnClickListener(new ze(this));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        button.setOnClickListener(new z9(this, strArr));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(@android.support.annotation.NonNull android.os.Bundle r9, boolean r10) {
        /*
        r8 = this;
        r7 = 1;
        r6 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r10 == 0) goto L_0x006d;
    L_0x0006:
        r0 = z;
        r0 = r0[r6];
    L_0x000a:
        r2 = r9.getInt(r0);
        if (r2 == 0) goto L_0x0044;
    L_0x0010:
        r0 = 2131755835; // 0x7f10033b float:1.914256E38 double:1.0532273234E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r3 = r9.getString(r3);
        if (r3 != 0) goto L_0x0029;
    L_0x0024:
        r0.setText(r2);
        if (r1 == 0) goto L_0x0042;
    L_0x0029:
        r4 = com.whatsapp.App.as;
        r3 = r4.b(r3);
        r4 = r8.getResources();
        r5 = new java.lang.Object[r7];
        r3 = r3.a(r8);
        r5[r6] = r3;
        r2 = r4.getString(r2, r5);
        r0.setText(r2);
    L_0x0042:
        if (r1 == 0) goto L_0x006c;
    L_0x0044:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r7];
        r1 = r9.getStringArray(r1);
        r1 = java.util.Arrays.toString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r8.finish();
    L_0x006c:
        return;
    L_0x006d:
        r0 = z;
        r2 = 3;
        r0 = r0[r2];
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RequestPermissionActivity.a(android.os.Bundle, boolean):void");
    }

    @TargetApi(16)
    public static void a(@NonNull Activity activity, int i, int i2, boolean z, int i3) {
        if (!activity.isFinishing()) {
            activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra(z[30], 2130839704).putExtra(z[26], new String[]{z[29], z[31]}).putExtra(z[27], i).putExtra(z[25], i2).putExtra(z[28], z), i3);
        }
    }

    public static void b(@NonNull Activity activity, int i, int i2, boolean z) {
        a(activity, i, i2, z, 151);
    }
}
