package com.whatsapp;

import android.preference.Preference.OnPreferenceClickListener;
import org.v;
import org.whispersystems.at;

class ao0 implements OnPreferenceClickListener {
    private static final String z;
    final SettingsChatHistory a;

    static {
        char[] toCharArray = "H\bi0&r\ra*>B\u0017q".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 45;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.i /*2*/:
                    i2 = 8;
                    break;
                case at.o /*3*/:
                    i2 = 89;
                    break;
                default:
                    i2 = 74;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ao0(SettingsChatHistory settingsChatHistory) {
        this.a = settingsChatHistory;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceClick(android.preference.Preference r5) {
        /*
        r4 = this;
        r3 = 1;
        r0 = com.whatsapp.App.aX;
        if (r0 != 0) goto L_0x0009;
    L_0x0005:
        r0 = com.whatsapp.App.E;
        if (r0 == 0) goto L_0x001b;
    L_0x0009:
        r1 = r4.a;
        r0 = com.whatsapp.App.V();
        if (r0 == 0) goto L_0x0031;
    L_0x0011:
        r0 = 2131231516; // 0x7f08031c float:1.8079115E38 double:1.0529682754E-314;
    L_0x0014:
        r1.a(r0);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0030;
    L_0x001b:
        r0 = new android.content.Intent;
        r1 = r4.a;
        r2 = com.whatsapp.ContactPicker.class;
        r0.<init>(r1, r2);
        r1 = z;
        r0.putExtra(r1, r3);
        r1 = r4.a;
        r2 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r1.startActivityForResult(r0, r2);
    L_0x0030:
        return r3;
    L_0x0031:
        r0 = 2131231517; // 0x7f08031d float:1.8079117E38 double:1.052968276E-314;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ao0.onPreferenceClick(android.preference.Preference):boolean");
    }
}
