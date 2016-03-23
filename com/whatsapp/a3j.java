package com.whatsapp;

import android.preference.Preference.OnPreferenceChangeListener;
import org.v;
import org.whispersystems.at;

class a3j implements OnPreferenceChangeListener {
    private static final String[] z;
    final SettingsNotifications a;

    static {
        String[] strArr = new String[6];
        String str = "}sI\u0013Uh{G\rkjwz\u0013opuQ\u0017";
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
                        i3 = 30;
                        break;
                    case at.g /*1*/:
                        i3 = 18;
                        break;
                    case at.i /*2*/:
                        i3 = 37;
                        break;
                    case at.o /*3*/:
                        i3 = 127;
                        break;
                    default:
                        i3 = 10;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "y`J\nzA|J\u000bcxkz\tc|`D\u000boA~@\u0011mjz";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "p}Q\u0016lgMS\u0016hlsQ\u001aUrwK\u0018~v";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "y`J\nzAqM\u001e~Av@\u0019kk~Q\f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "w|A\u0016|wvP\u001efAqM\u001e~Av@\u0019kk~Q\f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "w|A\u0016|wvP\u001efAqM\u001e~Av@\u0019kk~Q\f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a3j(SettingsNotifications settingsNotifications) {
        this.a = settingsNotifications;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceChange(android.preference.Preference r9, java.lang.Object r10) {
        /*
        r8 = this;
        r4 = 2;
        r2 = 0;
        r3 = 1;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = r9;
        r0 = (android.preference.ListPreference) r0;
        r1 = r10;
        r1 = (java.lang.String) r1;
        r1 = r0.findIndexOfValue(r1);
        r0 = r0.getEntries();
        r0 = r0[r1];
        r0 = r0.toString();
        r9.setSummary(r0);
        r1 = r9.getKey();
        r0 = -1;
        r6 = r1.hashCode();
        switch(r6) {
            case -816279124: goto L_0x003a;
            case -674839625: goto L_0x0047;
            case 234410860: goto L_0x002c;
            default: goto L_0x0028;
        };
    L_0x0028:
        switch(r0) {
            case 0: goto L_0x0053;
            case 1: goto L_0x0068;
            case 2: goto L_0x007d;
            default: goto L_0x002b;
        };
    L_0x002b:
        return r3;
    L_0x002c:
        r6 = z;
        r7 = 3;
        r6 = r6[r7];
        r6 = r1.equals(r6);
        if (r6 == 0) goto L_0x0028;
    L_0x0037:
        if (r5 == 0) goto L_0x0091;
    L_0x0039:
        r0 = r2;
    L_0x003a:
        r6 = z;
        r6 = r6[r4];
        r6 = r1.equals(r6);
        if (r6 == 0) goto L_0x0028;
    L_0x0044:
        if (r5 == 0) goto L_0x008f;
    L_0x0046:
        r0 = r3;
    L_0x0047:
        r6 = z;
        r2 = r6[r2];
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0028;
    L_0x0051:
        r0 = r4;
        goto L_0x0028;
    L_0x0053:
        r0 = r9.getContext();
        r1 = com.whatsapp.a3b.a(r0);
        r0 = z;
        r2 = 5;
        r2 = r0[r2];
        r0 = r10;
        r0 = (java.lang.String) r0;
        r1.d(r2, r0);
        if (r5 == 0) goto L_0x002b;
    L_0x0068:
        r0 = r9.getContext();
        r1 = com.whatsapp.a3b.a(r0);
        r0 = z;
        r2 = 4;
        r2 = r0[r2];
        r0 = r10;
        r0 = (java.lang.String) r0;
        r1.d(r2, r0);
        if (r5 == 0) goto L_0x002b;
    L_0x007d:
        r0 = r9.getContext();
        r0 = com.whatsapp.a3b.a(r0);
        r1 = z;
        r1 = r1[r3];
        r10 = (java.lang.String) r10;
        r0.c(r1, r10);
        goto L_0x002b;
    L_0x008f:
        r0 = r3;
        goto L_0x0028;
    L_0x0091:
        r0 = r2;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3j.onPreferenceChange(android.preference.Preference, java.lang.Object):boolean");
    }
}
