package com.whatsapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.Preference.OnPreferenceChangeListener;
import com.whatsapp.preference.WaPrivacyPreference;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import java.util.Collection;
import java.util.HashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SettingsPrivacy extends DialogToastPreferenceActivity implements tm {
    private static SettingsPrivacy i;
    private static HashMap j;
    private static Runnable l;
    private static Handler m;
    private static final String[] z;
    private OnPreferenceChangeListener k;

    public void onEvent(az7 com_whatsapp_az7) {
        f();
    }

    public void b(String str) {
    }

    static SettingsPrivacy c() {
        return i;
    }

    public void d(String str) {
    }

    private static int a(String str) {
        if (z[8].equals(str)) {
            return 0;
        }
        if (z[6].equals(str)) {
            return 1;
        }
        if (z[7].equals(str)) {
            return 2;
        }
        return -1;
    }

    static HashMap b() {
        return j;
    }

    private void d() {
        boolean z;
        int i;
        boolean z2 = true;
        SharedPreferences sharedPreferences = getSharedPreferences(z[16], 0);
        String[] stringArray = getResources().getStringArray(2131689496);
        WaPrivacyPreference waPrivacyPreference = (WaPrivacyPreference) findPreference(z[10]);
        b9 b9Var = (b9) j.get(z[18]);
        if (b9Var == null) {
            z = true;
        } else {
            z = false;
        }
        waPrivacyPreference.setEnabled(z);
        if (b9Var != null) {
            z = true;
        } else {
            z = false;
        }
        waPrivacyPreference.a(z);
        if (b9Var == null) {
            i = sharedPreferences.getInt(z[17], 0);
        } else {
            i = a(b9Var.b);
        }
        i = Math.max(0, i);
        waPrivacyPreference.setValueIndex(i);
        waPrivacyPreference.setSummary(stringArray[i]);
        waPrivacyPreference = (WaPrivacyPreference) findPreference(z[9]);
        b9Var = (b9) j.get(z[11]);
        if (b9Var == null) {
            z = true;
        } else {
            z = false;
        }
        waPrivacyPreference.setEnabled(z);
        if (b9Var != null) {
            z = true;
        } else {
            z = false;
        }
        waPrivacyPreference.a(z);
        if (b9Var == null) {
            i = sharedPreferences.getInt(z[14], 0);
        } else {
            i = a(b9Var.b);
        }
        i = Math.max(0, i);
        waPrivacyPreference.setValueIndex(i);
        waPrivacyPreference.setSummary(stringArray[i]);
        waPrivacyPreference = (WaPrivacyPreference) findPreference(z[13]);
        b9Var = (b9) j.get(z[12]);
        if (b9Var == null) {
            z = true;
        } else {
            z = false;
        }
        waPrivacyPreference.setEnabled(z);
        if (b9Var == null) {
            z2 = false;
        }
        waPrivacyPreference.a(z2);
        if (b9Var == null) {
            i = sharedPreferences.getInt(z[15], 0);
        } else {
            i = a(b9Var.b);
        }
        i = Math.max(0, i);
        waPrivacyPreference.setValueIndex(i);
        waPrivacyPreference.setSummary(stringArray[i]);
    }

    protected void onResume() {
        super.onResume();
    }

    public void m484a(String str) {
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[2]);
        i = this;
        addPreferencesFromResource(2131099664);
        ((WaPrivacyPreference) findPreference(z[1])).setOnPreferenceChangeListener(this.k);
        ((WaPrivacyPreference) findPreference(z[3])).setOnPreferenceChangeListener(this.k);
        ((WaPrivacyPreference) findPreference(z[0])).setOnPreferenceChangeListener(this.k);
        findPreference(z[5]).setOnPreferenceChangeListener(new azg(this));
        findPreference(z[4]).setOnPreferenceClickListener(new hn(this));
        d();
        f();
        App.P();
        h.b().e(this);
        App.b((tm) this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.Hashtable r12) {
        /*
        r5 = 1;
        r3 = 0;
        r6 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.z();
        r1 = z;
        r2 = 23;
        r1 = r1[r2];
        r7 = r0.getSharedPreferences(r1, r3);
        r8 = r7.edit();
        r9 = r12.keys();
        r2 = r3;
    L_0x001b:
        r0 = r9.hasMoreElements();
        if (r0 == 0) goto L_0x00ee;
    L_0x0021:
        r0 = r9.nextElement();
        r0 = (java.lang.String) r0;
        r1 = r12.get(r0);
        r1 = (java.lang.String) r1;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r10 = z;
        r11 = 24;
        r10 = r10[r11];
        r4 = r4.append(r10);
        r4 = r4.append(r0);
        r10 = ":";
        r4 = r4.append(r10);
        r4 = r4.append(r1);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r10 = a(r1);
        if (r10 >= 0) goto L_0x00eb;
    L_0x0058:
        if (r6 == 0) goto L_0x00e9;
    L_0x005a:
        r4 = r5;
    L_0x005b:
        r2 = j;
        r2 = r2.get(r0);
        r2 = (com.whatsapp.b9) r2;
        if (r2 == 0) goto L_0x006d;
    L_0x0065:
        r2 = r2.b;
        r1 = r2.equals(r1);
        if (r1 == 0) goto L_0x00c6;
    L_0x006d:
        r1 = j;
        r1.remove(r0);
        r1 = z;
        r2 = 28;
        r1 = r1[r2];
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x009a;
    L_0x007e:
        r1 = z;
        r2 = 30;
        r1 = r1[r2];
        r1 = r7.getInt(r1, r3);
        r2 = z;
        r11 = 31;
        r2 = r2[r11];
        r8.putInt(r2, r10);
        if (r1 == r10) goto L_0x0098;
    L_0x0093:
        r1 = com.whatsapp.App.a1;
        r1.a();
    L_0x0098:
        if (r6 == 0) goto L_0x00c6;
    L_0x009a:
        r1 = z;
        r2 = 26;
        r1 = r1[r2];
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x00b1;
    L_0x00a6:
        r1 = z;
        r2 = 27;
        r1 = r1[r2];
        r8.putInt(r1, r10);
        if (r6 == 0) goto L_0x00c6;
    L_0x00b1:
        r1 = z;
        r2 = 25;
        r1 = r1[r2];
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x00c6;
    L_0x00bd:
        r0 = z;
        r1 = 29;
        r0 = r0[r1];
        r8.putInt(r0, r10);
    L_0x00c6:
        r0 = r4;
    L_0x00c7:
        if (r6 == 0) goto L_0x00e6;
    L_0x00c9:
        r8.commit();
        if (r0 == 0) goto L_0x00dc;
    L_0x00ce:
        r0 = com.whatsapp.App.z();
        r0 = r0.getApplicationContext();
        r1 = 2131231144; // 0x7f0801a8 float:1.807836E38 double:1.0529680916E-314;
        com.whatsapp.App.a(r0, r1, r5);
    L_0x00dc:
        r0 = i;
        if (r0 == 0) goto L_0x00e5;
    L_0x00e0:
        r0 = i;
        r0.d();
    L_0x00e5:
        return;
    L_0x00e6:
        r2 = r0;
        goto L_0x001b;
    L_0x00e9:
        r0 = r5;
        goto L_0x00c7;
    L_0x00eb:
        r4 = r2;
        goto L_0x005b;
    L_0x00ee:
        r0 = r2;
        goto L_0x00c9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsPrivacy.a(java.util.Hashtable):void");
    }

    public void a(Collection collection) {
        f();
    }

    public SettingsPrivacy() {
        this.k = new aml(this);
    }

    public void m483a() {
    }

    static Handler e() {
        return m;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
        r7 = this;
        r6 = 2131231897; // 0x7f080499 float:1.8079888E38 double:1.0529684636E-314;
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r2 = 33;
        r0 = r0[r2];
        r2 = r7.findPreference(r0);
        r0 = com.whatsapp.aup.d();
        if (r0 == 0) goto L_0x003c;
    L_0x0017:
        r0 = com.whatsapp.aup.g();
        if (r0 <= 0) goto L_0x002b;
    L_0x001d:
        r3 = new java.lang.Object[r5];
        r0 = java.lang.Integer.valueOf(r0);
        r3[r4] = r0;
        r0 = r7.getString(r6, r3);
        if (r1 == 0) goto L_0x003a;
    L_0x002b:
        r0 = new java.lang.Object[r5];
        r3 = 2131232330; // 0x7f08064a float:1.8080766E38 double:1.0529686776E-314;
        r3 = r7.getString(r3);
        r0[r4] = r3;
        r0 = r7.getString(r6, r0);
    L_0x003a:
        if (r1 == 0) goto L_0x0043;
    L_0x003c:
        r0 = 2131230842; // 0x7f08007a float:1.8077748E38 double:1.0529679424E-314;
        r0 = r7.getString(r0);
    L_0x0043:
        r2.setTitle(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsPrivacy.f():void");
    }

    public void c(String str) {
    }

    static void a(SettingsPrivacy settingsPrivacy) {
        settingsPrivacy.d();
    }

    public void onDestroy() {
        Log.i(z[32]);
        super.onDestroy();
        App.a((tm) this);
        h.b().c(this);
        i = null;
    }

    static Runnable a() {
        return l;
    }

    protected static String a(int i) {
        switch (i) {
            case v.m /*0*/:
                return z[19];
            case at.g /*1*/:
                return z[20];
            case at.i /*2*/:
                return z[22];
            default:
                return z[21];
        }
    }

    static {
        String[] strArr = new String[34];
        String str = "b'|)\u0004q,J,\u0011s!`,";
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
                        i3 = 18;
                        break;
                    case at.g /*1*/:
                        i3 = 85;
                        break;
                    case at.i /*2*/:
                        i3 = 21;
                        break;
                    case at.o /*3*/:
                        i3 = 95;
                        break;
                    default:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "a0a+\f|2f/\u0017{#t<\u001c=6g:\u0004f0";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "b'|)\u0004q,J/\u0017}3|3\u0000M%}0\u0011}";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "p9z<\u000eM9|,\u0011";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "`0t;:`0v:\fb!f\u0000\u0000|4w3\u0000v";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "q:{+\u0004q!f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "|:{:";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "s9y";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "b'|)\u0004q,J/\u0017}3|3\u0000M%}0\u0011}";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "b'|)\u0004q,J3\u0004a!J,\u0000w;";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "b'z9\f~0";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "a!t+\u0010a";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "b'|)\u0004q,J,\u0011s!`,";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "b'|)\u0004q,J/\u0017}3|3\u0000M%}0\u0011}";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "b'|)\u0004q,J,\u0011s!`,";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "q:xq\u0012z4a,\u0004b%J/\u0017w3p-\u0000|6p,";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "b'|)\u0004q,J3\u0004a!J,\u0000w;";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    str = "~4f+";
                    obj = 17;
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    strArr2 = strArr3;
                    str = "s9y";
                    obj = 18;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "q:{+\u0004q!f";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    str = "s9y";
                    obj = 20;
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    strArr2 = strArr3;
                    str = "|:{:";
                    obj = 21;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "q:xq\u0012z4a,\u0004b%J/\u0017w3p-\u0000|6p,";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "a0a+\f|2f/\u0017{#t<\u001c='p<\u0000{#p;E";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "a!t+\u0010a";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "b'z9\f~0";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "b'|)\u0004q,J/\u0017}3|3\u0000M%}0\u0011}";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "~4f+";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "b'|)\u0004q,J,\u0011s!`,";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "b'|)\u0004q,J3\u0004a!J,\u0000w;";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "b'|)\u0004q,J3\u0004a!J,\u0000w;";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "a0a+\f|2f/\u0017{#t<\u001c=1p,\u0011`:l";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "p9z<\u000eM9|,\u0011";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    z = strArr3;
                    j = new HashMap();
                    m = new Handler(Looper.getMainLooper());
                    l = new as0();
                    return;
                default:
                    strArr2[i] = str;
                    str = "b'|)\u0004q,J3\u0004a!J,\u0000w;";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
