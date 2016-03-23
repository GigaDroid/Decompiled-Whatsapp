package com.whatsapp;

import android.preference.Preference.OnPreferenceChangeListener;
import org.v;
import org.whispersystems.at;

class a4a implements OnPreferenceChangeListener {
    private static final String[] z;
    final SettingsNotifications a;

    static {
        String[] strArr = new String[6];
        String str = "\u000b\\q\u001c\r\u000bV`\u0014\u0017=Q}\u0014\u000f=Vp\u0013\u001a\u0017^a\u0006";
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
                        i3 = 98;
                        break;
                    case at.g /*1*/:
                        i3 = 50;
                        break;
                    case at.i /*2*/:
                        i3 = 21;
                        break;
                    case at.o /*3*/:
                        i3 = 117;
                        break;
                    default:
                        i3 = 123;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000b\\q\u001c\r\u000bV`\u0014\u0017=Q}\u0014\u000f=Vp\u0013\u001a\u0017^a\u0006";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\f]a\u001c\u001d\u001bmg\u001c\u0015\u0005Fz\u001b\u001e";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0005@z\u0000\u000b=Q}\u0014\u000f=Vp\u0013\u001a\u0017^a\u0006";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0005@z\u0000\u000b=\\z\u0001\u0012\u0004KJ\u0001\u0014\fW";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0001Sy\u0019$\u0010[{\u0012\u000f\r\\p";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a4a(SettingsNotifications settingsNotifications) {
        this.a = settingsNotifications;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPreferenceChange(android.preference.Preference r9, java.lang.Object r10) {
        /*
        r8 = this;
        r3 = 2;
        r1 = 0;
        r2 = 1;
        r4 = com.whatsapp.DialogToastActivity.f;
        r5 = r10.toString();
        r0 = r9.getContext();
        r0 = com.whatsapp.notification.d.a(r0, r5);
        r9.setSummary(r0);
        r0 = r9;
        r0 = (com.whatsapp.preference.WaRingtonePreference) r0;
        r0.a(r5);
        r5 = r9.getKey();
        r0 = -1;
        r6 = r5.hashCode();
        switch(r6) {
            case -1037910941: goto L_0x0046;
            case -466731288: goto L_0x0038;
            case 1278474200: goto L_0x002a;
            default: goto L_0x0026;
        };
    L_0x0026:
        switch(r0) {
            case 0: goto L_0x0052;
            case 1: goto L_0x0066;
            case 2: goto L_0x007b;
            default: goto L_0x0029;
        };
    L_0x0029:
        return r2;
    L_0x002a:
        r6 = z;
        r7 = 3;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x0026;
    L_0x0035:
        if (r4 == 0) goto L_0x008f;
    L_0x0037:
        r0 = r1;
    L_0x0038:
        r6 = z;
        r7 = 5;
        r6 = r6[r7];
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x0026;
    L_0x0043:
        if (r4 == 0) goto L_0x008d;
    L_0x0045:
        r0 = r2;
    L_0x0046:
        r6 = z;
        r6 = r6[r2];
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x0026;
    L_0x0050:
        r0 = r3;
        goto L_0x0026;
    L_0x0052:
        r0 = r9.getContext();
        r5 = com.whatsapp.a3b.a(r0);
        r0 = z;
        r3 = r0[r3];
        r0 = r10;
        r0 = (java.lang.String) r0;
        r5.a(r3, r0);
        if (r4 == 0) goto L_0x0029;
    L_0x0066:
        r0 = r9.getContext();
        r3 = com.whatsapp.a3b.a(r0);
        r0 = z;
        r5 = 4;
        r5 = r0[r5];
        r0 = r10;
        r0 = (java.lang.String) r0;
        r3.a(r5, r0);
        if (r4 == 0) goto L_0x0029;
    L_0x007b:
        r0 = r9.getContext();
        r0 = com.whatsapp.a3b.a(r0);
        r3 = z;
        r1 = r3[r1];
        r10 = (java.lang.String) r10;
        r0.b(r1, r10);
        goto L_0x0029;
    L_0x008d:
        r0 = r2;
        goto L_0x0026;
    L_0x008f:
        r0 = r1;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a4a.onPreferenceChange(android.preference.Preference, java.lang.Object):boolean");
    }
}
