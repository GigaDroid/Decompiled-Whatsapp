package com.whatsapp;

import android.preference.Preference.OnPreferenceClickListener;
import org.v;
import org.whispersystems.at;

class aut implements OnPreferenceClickListener {
    private static final String[] z;
    final SettingsHelp a;

    static {
        String[] strArr = new String[3];
        String str = "?`<)Q\"b;rY.j=)\u0017/m&(Ul";
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
                        i3 = 76;
                        break;
                    case at.g /*1*/:
                        i3 = 5;
                        break;
                    case at.i /*2*/:
                        i3 = 72;
                        break;
                    case at.o /*3*/:
                        i3 = 93;
                        break;
                    default:
                        i3 = 56;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "?`<)Q\"b;rY.j=)";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "-g'(Lck'p[#k&8[8l>4L5";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceClick(android.preference.Preference r7) {
        /*
        r6 = this;
        r4 = 1;
        r3 = 0;
        r0 = com.whatsapp.fieldstats.k.CONTACT_US;
        com.whatsapp.nf.a(r0);
        r0 = com.whatsapp.App.Q();
        if (r0 != 0) goto L_0x0027;
    L_0x000d:
        r0 = z;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        r0 = r6.a;
        r0 = r0.isFinishing();
        if (r0 != 0) goto L_0x0042;
    L_0x001c:
        r0 = r6.a;
        r1 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0.showDialog(r1);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0042;
    L_0x0027:
        r0 = r6.a;
        r0 = com.whatsapp.ChangeNumber.a(r0);
        if (r0 != 0) goto L_0x0043;
    L_0x002f:
        r0 = z;
        r1 = 2;
        r5 = r0[r1];
    L_0x0034:
        r0 = new com.whatsapp.m5;
        r1 = r6.a;
        r2 = r6.a;
        r0.<init>(r1, r2, r3, r4, r5);
        r1 = new java.lang.String[r3];
        com.whatsapp.util.bq.a(r0, r1);
    L_0x0042:
        return r4;
    L_0x0043:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r5 = r0.toString();
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aut.onPreferenceClick(android.preference.Preference):boolean");
    }

    aut(SettingsHelp settingsHelp) {
        this.a = settingsHelp;
    }
}
