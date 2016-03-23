package com.whatsapp;

import android.text.TextWatcher;
import org.v;
import org.whispersystems.at;

class arx implements TextWatcher {
    private static final String[] z;
    final DeleteAccount a;

    static {
        String[] strArr = new String[2];
        String str = "WW-\u0018kV\u001f \u001e|\\G/\t0DS5\u001ewV@n\u001cyGW3\tzKF\"\u0015~]U$\u0019?US(\u0011zW\u0012-\u0012pXG1>pF\\5\u000ffp]%\u0018?U@.\u0010?p]4\u0013kAK\u0011\u0015p]W\b\u0013y\\";
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
                        i3 = 51;
                        break;
                    case at.g /*1*/:
                        i3 = 50;
                        break;
                    case at.i /*2*/:
                        i3 = 65;
                        break;
                    case at.o /*3*/:
                        i3 = 125;
                        break;
                    default:
                        i3 = 31;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "ov";
                    obj = null;
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    arx(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r6) {
        /*
        r5 = this;
        r1 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r5.a;	 Catch:{ IOException -> 0x00a7 }
        r0 = com.whatsapp.DeleteAccount.c(r0);	 Catch:{ IOException -> 0x00a7 }
        if (r0 == 0) goto L_0x00b5;
    L_0x000b:
        r0 = r5.a;	 Catch:{ IOException -> 0x00a7 }
        r0 = com.whatsapp.DeleteAccount.c(r0);	 Catch:{ IOException -> 0x00a7 }
        r0 = com.whatsapp.u0.f(r0);	 Catch:{ IOException -> 0x00a7 }
    L_0x0015:
        r3 = r5.a;	 Catch:{ IOException -> 0x00b8 }
        r3 = com.whatsapp.DeleteAccount.c(r3);	 Catch:{ IOException -> 0x00b8 }
        if (r3 == 0) goto L_0x00bc;
    L_0x001d:
        if (r0 == 0) goto L_0x00bc;
    L_0x001f:
        r3 = r6.toString();	 Catch:{ IOException -> 0x00ba }
        r0 = r0.equalsIgnoreCase(r3);	 Catch:{ IOException -> 0x00ba }
        if (r0 == 0) goto L_0x00bc;
    L_0x0029:
        r0 = r5.a;	 Catch:{ IOException -> 0x00a9 }
        r0 = com.whatsapp.DeleteAccount.c(r0);	 Catch:{ IOException -> 0x00a9 }
    L_0x002f:
        r1 = r5.a;	 Catch:{ IOException -> 0x00e2 }
        r1 = r1.p;	 Catch:{ IOException -> 0x00e2 }
        r1 = r1.getText();	 Catch:{ IOException -> 0x00e2 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x00e2 }
        r3 = "";
        r1 = r1.equals(r3);	 Catch:{ IOException -> 0x00e2 }
        if (r1 == 0) goto L_0x0056;
    L_0x0044:
        r1 = r5.a;	 Catch:{ IOException -> 0x00e4 }
        r1 = r1.v;	 Catch:{ IOException -> 0x00e4 }
        r3 = r5.a;	 Catch:{ IOException -> 0x00e4 }
        r4 = 2131231747; // 0x7f080403 float:1.8079584E38 double:1.0529683895E-314;
        r3 = r3.getString(r4);	 Catch:{ IOException -> 0x00e4 }
        r1.setText(r3);	 Catch:{ IOException -> 0x00e4 }
        if (r2 == 0) goto L_0x00a6;
    L_0x0056:
        if (r0 != 0) goto L_0x006a;
    L_0x0058:
        r1 = r5.a;	 Catch:{ IOException -> 0x00e6 }
        r1 = r1.v;	 Catch:{ IOException -> 0x00e6 }
        r3 = r5.a;	 Catch:{ IOException -> 0x00e6 }
        r4 = 2131231755; // 0x7f08040b float:1.80796E38 double:1.0529683935E-314;
        r3 = r3.getString(r4);	 Catch:{ IOException -> 0x00e6 }
        r1.setText(r3);	 Catch:{ IOException -> 0x00e6 }
        if (r2 == 0) goto L_0x00a6;
    L_0x006a:
        r1 = r5.a;
        r1 = r1.v;
        r1.setText(r0);
        r1 = r5.a;
        com.whatsapp.DeleteAccount.a(r1, r0);
        r0 = r5.a;
        r0 = r0.u;
        r0 = r0.getText();
        r0 = r0.toString();
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r2 = "";
        r0 = r0.replaceAll(r1, r2);
        r1 = r5.a;	 Catch:{ IOException -> 0x00e8 }
        r1 = r1.u;	 Catch:{ IOException -> 0x00e8 }
        r1.setText(r0);	 Catch:{ IOException -> 0x00e8 }
        r0 = r5.a;	 Catch:{ IOException -> 0x00e8 }
        r0 = r0.p;	 Catch:{ IOException -> 0x00e8 }
        r0 = r0.hasFocus();	 Catch:{ IOException -> 0x00e8 }
        if (r0 == 0) goto L_0x00a6;
    L_0x009f:
        r0 = r5.a;	 Catch:{ IOException -> 0x00e8 }
        r0 = r0.u;	 Catch:{ IOException -> 0x00e8 }
        r0.requestFocus();	 Catch:{ IOException -> 0x00e8 }
    L_0x00a6:
        return;
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        r3 = z;
        r4 = 0;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r0);
        r0 = r1;
        goto L_0x002f;
    L_0x00b5:
        r0 = r1;
        goto L_0x0015;
    L_0x00b8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ba }
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a9 }
    L_0x00bc:
        r0 = r5.a;	 Catch:{ IOException -> 0x00d6 }
        r0 = com.whatsapp.DeleteAccount.c(r0);	 Catch:{ IOException -> 0x00d6 }
        if (r0 == 0) goto L_0x00cc;
    L_0x00c4:
        if (r6 == 0) goto L_0x00da;
    L_0x00c6:
        r0 = r6.length();	 Catch:{ IOException -> 0x00d8 }
        if (r0 <= 0) goto L_0x00da;
    L_0x00cc:
        r0 = r6.toString();	 Catch:{ IOException -> 0x00a9 }
        r0 = com.whatsapp.u0.c(r0);	 Catch:{ IOException -> 0x00a9 }
        goto L_0x002f;
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a9 }
    L_0x00da:
        r0 = r5.a;	 Catch:{ IOException -> 0x00a9 }
        r0 = com.whatsapp.DeleteAccount.c(r0);	 Catch:{ IOException -> 0x00a9 }
        goto L_0x002f;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;
    L_0x00e8:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.arx.afterTextChanged(android.text.Editable):void");
    }
}
