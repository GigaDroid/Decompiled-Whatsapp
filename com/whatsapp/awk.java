package com.whatsapp;

import android.preference.Preference.OnPreferenceChangeListener;
import org.v;
import org.whispersystems.at;

class awk implements OnPreferenceChangeListener {
    private static final String[] z;
    final SettingsNotifications a;

    static {
        String[] strArr = new String[7];
        String str = "[;'\b5e .";
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
                        i3 = 12;
                        break;
                    case at.g /*1*/:
                        i3 = 82;
                        break;
                    case at.i /*2*/:
                        i3 = 75;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    default:
                        i3 = 83;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "b=?\u00055u\r'\u00054d&\u0014\u000f<`=9";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "e</\u0005%e6>\r?S1#\r'S6.\n2y>?\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "<b\r*c<";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "H78\u0005!i";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "k $\u0019#S<$\u0018:j+\u0014\u0000:k:?30c>$\u001e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "k $\u0019#S1#\r'S6.\n2y>?\u001f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    awk(SettingsNotifications settingsNotifications) {
        this.a = settingsNotifications;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceChange(android.preference.Preference r8, java.lang.Object r9) {
        /*
        r7 = this;
        r2 = 0;
        r3 = 1;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = android.os.Build.MODEL;
        r1 = z;
        r5 = 5;
        r1 = r1[r5];
        r0 = r0.contains(r1);
        if (r0 != 0) goto L_0x001d;
    L_0x0011:
        r0 = android.os.Build.MODEL;
        r1 = z;
        r1 = r1[r2];
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x0032;
    L_0x001d:
        r0 = r9.toString();
        r1 = z;
        r5 = 4;
        r1 = r1[r5];
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0032;
    L_0x002c:
        r0 = r7.a;
        r1 = 7;
        r0.showDialog(r1);
    L_0x0032:
        r0 = r8;
        r0 = (android.preference.ListPreference) r0;
        r1 = r9;
        r1 = (java.lang.String) r1;
        r1 = r0.findIndexOfValue(r1);
        r0 = r0.getEntries();
        r0 = r0[r1];
        r0 = r0.toString();
        r8.setSummary(r0);
        r1 = r8.getKey();
        r0 = -1;
        r5 = r1.hashCode();
        switch(r5) {
            case -1806012668: goto L_0x0059;
            case -1040361276: goto L_0x0067;
            default: goto L_0x0055;
        };
    L_0x0055:
        switch(r0) {
            case 0: goto L_0x0074;
            case 1: goto L_0x0089;
            default: goto L_0x0058;
        };
    L_0x0058:
        return r3;
    L_0x0059:
        r5 = z;
        r6 = 2;
        r5 = r5[r6];
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0055;
    L_0x0064:
        if (r4 == 0) goto L_0x009b;
    L_0x0066:
        r0 = r2;
    L_0x0067:
        r2 = z;
        r5 = 6;
        r2 = r2[r5];
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0055;
    L_0x0072:
        r0 = r3;
        goto L_0x0055;
    L_0x0074:
        r0 = r8.getContext();
        r1 = com.whatsapp.a3b.a(r0);
        r0 = z;
        r2 = 3;
        r2 = r0[r2];
        r0 = r9;
        r0 = (java.lang.String) r0;
        r1.e(r2, r0);
        if (r4 == 0) goto L_0x0058;
    L_0x0089:
        r0 = r8.getContext();
        r0 = com.whatsapp.a3b.a(r0);
        r1 = z;
        r1 = r1[r3];
        r9 = (java.lang.String) r9;
        r0.e(r1, r9);
        goto L_0x0058;
    L_0x009b:
        r0 = r2;
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.awk.onPreferenceChange(android.preference.Preference, java.lang.Object):boolean");
    }
}
