package com.whatsapp;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class aqu {
    private static Locale a;
    private static final String[] b;
    private static boolean c;
    private static final String[] z;

    public static String c() {
        String country = f().getCountry();
        if (country != null && Pattern.matches(z[21], country)) {
            return country;
        }
        Log.i(z[22] + country);
        return z[20];
    }

    public static void a() {
        String string = App.z().getSharedPreferences(z[2], 0).getString(z[3], null);
        if (TextUtils.isEmpty(string)) {
            Log.i(z[0]);
            return;
        }
        Log.i(z[1] + string);
        a = new Locale(string, z[4]);
        c = true;
        d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    public static android.support.v4.util.Pair e() {
        /*
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = java.util.Locale.getDefault();
        r0 = com.whatsapp.App.z();
        r0 = r0.getResources();
        r1 = 2131231068; // 0x7f08015c float:1.8078207E38 double:1.052968054E-314;
        r0 = r0.getString(r1);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = z;
        r6 = 10;
        r1 = r1[r6];
        r0 = r0.append(r1);
        r1 = r5.getDisplayLanguage(r5);
        r0 = r0.append(r1);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
        r3.add(r0);
        r0 = r5.getLanguage();
        r4.add(r0);
        r6 = b;
        r7 = r6.length;
        r0 = 0;
        r1 = r0;
    L_0x0054:
        if (r1 >= r7) goto L_0x0091;
    L_0x0056:
        r8 = r6[r1];
        r0 = z;
        r9 = 9;
        r0 = r0[r9];
        r0 = r0.equals(r8);
        if (r0 == 0) goto L_0x006c;
    L_0x0064:
        r0 = z;
        r9 = 8;
        r0 = r0[r9];
        if (r2 == 0) goto L_0x0072;
    L_0x006c:
        r0 = z;
        r9 = 11;
        r0 = r0[r9];
    L_0x0072:
        r9 = new java.util.Locale;
        r9.<init>(r8, r0);
        r0 = r9.equals(r5);
        if (r0 == 0) goto L_0x007f;
    L_0x007d:
        if (r2 == 0) goto L_0x008d;
    L_0x007f:
        r0 = r9.getDisplayLanguage(r9);
        r3.add(r0);
        r0 = r9.getLanguage();
        r4.add(r0);
    L_0x008d:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x00ae;
    L_0x0091:
        r0 = r3.size();
        r0 = new java.lang.String[r0];
        r0 = r3.toArray(r0);
        r0 = (java.lang.String[]) r0;
        r1 = r4.size();
        r1 = new java.lang.String[r1];
        r1 = r4.toArray(r1);
        r1 = (java.lang.String[]) r1;
        r0 = android.support.v4.util.Pair.create(r0, r1);
        return r0;
    L_0x00ae:
        r1 = r0;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aqu.e():android.support.v4.util.Pair");
    }

    static {
        String[] strArr = new String[23];
        String str = "x%[+\rn=J3\u0011l,V:Qc\"[;\u001fa)[/\u000ec4\\0\fl(^3\u001fa*O>\u0019jbT0^c,T8\u000bn*_\u007f\n`mV0\u001fk";
        boolean z = true;
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
                        i3 = 15;
                        break;
                    case at.g /*1*/:
                        i3 = 77;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 95;
                        break;
                    default:
                        i3 = 126;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "l\"Wq\tg,N,\u001f\u007f=e/\fj+_-\u001ba._,";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "i\"H<\u001bk\u0012V>\u0010h8[8\u001b";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "F\u0003";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "y(H6\u0018v#O2\u001cj?\u0015-\u001b~8_,\nl\"^:Qf#L>\u0012f)\u00173\u001fa*O>\u0019jm";
                    z = true;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "T,\u0017%#t\u007fG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "u7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "Z\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "j#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "/e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "F\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "x%[+\rn=J3\u0011l,V:Q|,L:\u001fa)[/\u000ec4\\0\fl(^3\u001fa*O>\u0019jbI:\n{$T8^c,T8\u000bn*_\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "k(L6\u001djm^:\u0018n8V+";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "i\"H<\u001bk\u0012V>\u0010h8[8\u001b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "l\"Wq\tg,N,\u001f\u007f=e/\fj+_-\u001ba._,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "F\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "i\"H<\u001bk\u0012V>\u0010h8[8\u001b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "x%[+\rn=J3\u0011l,V:Q|,L:\u001fa)[/\u000ec4\\0\fl(^3\u001fa*O>\u0019jbV>\u0010h8[8\u001b/9U\u007f\rn;_e^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "x%[+\rn=J3\u0011l,V:Q|,L:\u001fa)[/\u000ec4\\0\fl(^3\u001fa*O>\u0019jb\\>\u0017c(^\u007f\n`mM-\u0017{(\u001a+\u0011/>R>\fj)\u001a/\fj+Iq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "U\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "T\f\u0017\u0005#t\u007fG";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "y(H6\u0018v#O2\u001cj?\u0015-\u001b~8_,\nl\"^:Qf#L>\u0012f)\u0017<\u0011z#N-\u0007/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = Locale.getDefault();
                    c = false;
                    strArr = new String[10];
                    str = "j#";
                    z = true;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    str = "g$";
                    z = true;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    str = "m#";
                    z = true;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    str = "\u007f,";
                    z = true;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    str = "{(";
                    z = true;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "b?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "{,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "z?";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "h8";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "b!";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    b = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "x%[+\rn=J3\u0011l,V:Qc\"[;\u001fa)[/\u000ec4\\0\fl(^3\u001fa*O>\u0019jbV>\u0010h8[8\u001b/9U\u007f\u0012`,^e^";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public static Locale f() {
        Locale locale = App.z().getResources().getConfiguration().locale;
        return locale == null ? Locale.getDefault() : locale;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r6) {
        /*
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.z();
        r2 = z;
        r3 = 15;
        r2 = r2[r3];
        r3 = 0;
        r0 = r0.getSharedPreferences(r2, r3);
        r2 = r0.edit();
        r3 = b(r6);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 18;
        r4 = r4[r5];
        r4 = r0.append(r4);
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 == 0) goto L_0x00a7;
    L_0x002e:
        r0 = z;
        r5 = 13;
        r0 = r0[r5];
    L_0x0034:
        r0 = r4.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r3 == 0) goto L_0x004c;
    L_0x0041:
        r0 = z;
        r4 = 17;
        r0 = r0[r4];
        r2.putString(r0, r6);
        if (r1 == 0) goto L_0x0055;
    L_0x004c:
        r0 = z;
        r4 = 14;
        r0 = r0[r4];
        r2.remove(r0);
    L_0x0055:
        r0 = r2.commit();
        if (r0 == 0) goto L_0x009d;
    L_0x005b:
        c = r3;
        r0 = c;
        if (r0 == 0) goto L_0x0070;
    L_0x0061:
        r0 = new java.util.Locale;
        r2 = z;
        r3 = 16;
        r2 = r2[r3];
        r0.<init>(r6, r2);
        a = r0;
        if (r1 == 0) goto L_0x0076;
    L_0x0070:
        r0 = java.util.Locale.getDefault();
        a = r0;
    L_0x0076:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 12;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = a;
        r3 = java.util.Locale.US;
        r2 = r2.getDisplayLanguage(r3);
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        d();
        if (r1 == 0) goto L_0x00a6;
    L_0x009d:
        r0 = z;
        r1 = 19;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
    L_0x00a6:
        return;
    L_0x00a7:
        r0 = r6;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aqu.a(java.lang.String):void");
    }

    public static String g() {
        String language = f().getLanguage();
        if (language != null && Pattern.matches(z[6], language)) {
            return language;
        }
        Log.i(z[5] + language);
        return z[7];
    }

    public static void b() {
        if (c) {
            d();
        }
    }

    private static boolean b(String str) {
        boolean z = DialogToastActivity.f;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] strArr = b;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            if (strArr[i].equals(str)) {
                return true;
            }
            i++;
            if (z) {
                return false;
            }
        }
        return false;
    }

    private static void d() {
        Resources resources = App.z().getResources();
        if (!resources.getConfiguration().locale.equals(a)) {
            Configuration configuration = resources.getConfiguration();
            configuration.locale = a;
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }
}
