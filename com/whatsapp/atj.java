package com.whatsapp;

import android.preference.Preference.OnPreferenceClickListener;
import org.v;
import org.whispersystems.at;

class atj implements OnPreferenceClickListener {
    private static final String z;
    final SettingsHelp a;

    static {
        char[] toCharArray = "<\n%<c!\b\"gi'\n2#y6\u001c%-g<\u001b0<\u007f<@?'',\u0000?&o,\u001b8>c;\u0016".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 79;
                    break;
                case at.g /*1*/:
                    i2 = 111;
                    break;
                case at.i /*2*/:
                    i2 = 81;
                    break;
                case at.o /*3*/:
                    i2 = 72;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    atj(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceClick(android.preference.Preference r9) {
        /*
        r8 = this;
        r7 = 0;
        r3 = 1;
        r0 = com.whatsapp.App.Q();
        if (r0 != 0) goto L_0x002c;
    L_0x0008:
        r0 = z;
        com.whatsapp.util.Log.i(r0);
        r0 = r8.a;
        r1 = r8.a;
        r2 = 2131231746; // 0x7f080402 float:1.8079582E38 double:1.052968389E-314;
        r4 = new java.lang.Object[r3];
        r5 = r8.a;
        r6 = 2131230939; // 0x7f0800db float:1.8077945E38 double:1.0529679903E-314;
        r5 = r5.getString(r6);
        r4[r7] = r5;
        r1 = r1.getString(r2, r4);
        r0.f(r1);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x003e;
    L_0x002c:
        r0 = new com.whatsapp.m5;
        r1 = r8.a;
        r2 = r8.a;
        r5 = "";
        r4 = r3;
        r0.<init>(r1, r2, r3, r4, r5);
        r1 = new java.lang.String[r7];
        com.whatsapp.util.bq.a(r0, r1);
    L_0x003e:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.atj.onPreferenceClick(android.preference.Preference):boolean");
    }
}
