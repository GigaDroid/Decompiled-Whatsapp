package com.whatsapp.accountsync;

import android.accounts.AccountAuthenticatorActivity;
import org.v;
import org.whispersystems.at;

public class LoginActivity extends AccountAuthenticatorActivity {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u000bn\u000e,Q\nc\u00062}\ft\u0000/g\u0017h>=g\nu\u0015\u0004j\u0014a";
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
                        i3 = 120;
                        break;
                    case at.g /*1*/:
                        i3 = 6;
                        break;
                    case at.i /*2*/:
                        i3 = 97;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 14;
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
                    str = "\u0014i\u00062`\u0019e\u00152x\u0011r\u0018tm\nc\u0000/k";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001bi\fuy\u0010g\u0015(o\bv";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        r1 = 1;
        r3 = 0;
        r4 = com.whatsapp.accountsync.PerformSyncManager.c;
        super.onCreate(r10);
        com.whatsapp.aqu.b();
        r0 = 2130903215; // 0x7f0300af float:1.7413242E38 double:1.052806073E-314;
        r9.setContentView(r0);
        r0 = z;
        r2 = 2;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = android.accounts.AccountManager.get(r9);
        r5 = r0.getAccounts();
        r6 = r5.length;
        r2 = r3;
        r0 = r3;
    L_0x0023:
        if (r2 >= r6) goto L_0x0038;
    L_0x0025:
        r7 = r5[r2];
        r8 = z;
        r8 = r8[r1];
        r7 = r7.type;
        r7 = r8.contains(r7);
        if (r7 == 0) goto L_0x0034;
    L_0x0033:
        r0 = r1;
    L_0x0034:
        r2 = r2 + 1;
        if (r4 == 0) goto L_0x0023;
    L_0x0038:
        if (r0 == 0) goto L_0x0051;
    L_0x003a:
        r0 = r9.getApplicationContext();
        r2 = 2131230772; // 0x7f080034 float:1.8077606E38 double:1.052967908E-314;
        r2 = r9.getString(r2);
        r0 = android.widget.Toast.makeText(r0, r2, r1);
        r0.show();
        r9.finish();
        if (r4 == 0) goto L_0x006b;
    L_0x0051:
        r0 = com.whatsapp.App.ad();
        if (r0 != 0) goto L_0x0074;
    L_0x0057:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.Main.class;
        r0.<init>(r9, r2);
        r2 = z;
        r2 = r2[r3];
        r0.putExtra(r2, r1);
        r9.startActivity(r0);
        r9.finish();
    L_0x006b:
        r0 = com.whatsapp.WAAppCompatActivity.c;
        if (r0 == 0) goto L_0x0073;
    L_0x006f:
        r0 = r4 + 1;
        com.whatsapp.accountsync.PerformSyncManager.c = r0;
    L_0x0073:
        return;
    L_0x0074:
        r0 = new com.whatsapp.accountsync.a;
        r1 = 0;
        r0.<init>(r9, r9, r1);
        r1 = new java.lang.Void[r3];
        com.whatsapp.util.bq.a(r0, r1);
        goto L_0x006b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountsync.LoginActivity.onCreate(android.os.Bundle):void");
    }
}
