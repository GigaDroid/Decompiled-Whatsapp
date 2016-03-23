package com.whatsapp;

import android.preference.Preference.OnPreferenceChangeListener;
import org.v;
import org.whispersystems.at;

class tn implements OnPreferenceChangeListener {
    private static final String[] z;
    final SettingsNotifications a;

    static {
        String[] strArr = new String[4];
        String str = "\u0002g\u007f(e\u0002mn \u007f4js g4m~'r\u001eeo2";
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
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 9;
                        break;
                    case at.i /*2*/:
                        i3 = 27;
                        break;
                    case at.o /*3*/:
                        i3 = 65;
                        break;
                    default:
                        i3 = 19;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0005fo(u\u0012Vk.c\u001eyD,|\u000fl";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\f{t4c4js g4m~'r\u001eeo2";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\f{t4c4gt5z\rpD1|\u001b|k\u001e~\u0004m~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceChange(android.preference.Preference r8, java.lang.Object r9) {
        /*
        r7 = this;
        r2 = 0;
        r3 = 1;
        r4 = com.whatsapp.DialogToastActivity.f;
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
            case 1287754764: goto L_0x002b;
            case 1312453196: goto L_0x0039;
            default: goto L_0x0027;
        };
    L_0x0027:
        switch(r0) {
            case 0: goto L_0x0045;
            case 1: goto L_0x0059;
            default: goto L_0x002a;
        };
    L_0x002a:
        return r3;
    L_0x002b:
        r5 = z;
        r6 = 2;
        r5 = r5[r6];
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0027;
    L_0x0036:
        if (r4 == 0) goto L_0x006c;
    L_0x0038:
        r0 = r2;
    L_0x0039:
        r5 = z;
        r5 = r5[r3];
        r1 = r1.equals(r5);
        if (r1 == 0) goto L_0x0027;
    L_0x0043:
        r0 = r3;
        goto L_0x0027;
    L_0x0045:
        r0 = r8.getContext();
        r1 = com.whatsapp.a3b.a(r0);
        r0 = z;
        r2 = r0[r2];
        r0 = r9;
        r0 = (java.lang.String) r0;
        r1.f(r2, r0);
        if (r4 == 0) goto L_0x002a;
    L_0x0059:
        r0 = r8.getContext();
        r0 = com.whatsapp.a3b.a(r0);
        r1 = z;
        r2 = 3;
        r1 = r1[r2];
        r9 = (java.lang.String) r9;
        r0.f(r1, r9);
        goto L_0x002a;
    L_0x006c:
        r0 = r2;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.tn.onPreferenceChange(android.preference.Preference, java.lang.Object):boolean");
    }

    tn(SettingsNotifications settingsNotifications) {
        this.a = settingsNotifications;
    }
}
