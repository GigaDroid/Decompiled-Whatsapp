package com.whatsapp;

import android.text.TextWatcher;
import org.v;
import org.whispersystems.at;

class f7 implements TextWatcher {
    private static final String[] z;
    final RegisterPhone a;

    static {
        String[] strArr = new String[2];
        String str = "Gc";
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
                        i3 = 27;
                        break;
                    case at.g /*1*/:
                        i3 = 39;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 84;
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
                    str = "iBcy'oBv?$sHju{xHq~ i^sq xOab{zApu&oB|d7sFjw1\u007f\u0007h\u007f;pRtS;nIpb-XH`ut}Uk}tXHq~ i^Tx;uBM~2t\u0007bq=wB`";
                    obj = null;
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    f7(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void afterTextChanged(android.text.Editable r6) {
        /*
        r5 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r1 = 0;
        r0 = r5.a;	 Catch:{ IOException -> 0x00af }
        r0 = com.whatsapp.RegisterPhone.h(r0);	 Catch:{ IOException -> 0x00af }
        if (r0 == 0) goto L_0x00bd;
    L_0x000b:
        r0 = r5.a;	 Catch:{ IOException -> 0x00af }
        r0 = com.whatsapp.RegisterPhone.h(r0);	 Catch:{ IOException -> 0x00af }
        r0 = com.whatsapp.u0.f(r0);	 Catch:{ IOException -> 0x00af }
        r3 = r6.toString();	 Catch:{ IOException -> 0x00af }
        r0 = r0.equalsIgnoreCase(r3);	 Catch:{ IOException -> 0x00af }
        if (r0 == 0) goto L_0x00bd;
    L_0x001f:
        r0 = r5.a;	 Catch:{ IOException -> 0x00b1 }
        r0 = com.whatsapp.RegisterPhone.h(r0);	 Catch:{ IOException -> 0x00b1 }
    L_0x0025:
        r1 = r5.a;	 Catch:{ IOException -> 0x00e3 }
        r1 = r1.v;	 Catch:{ IOException -> 0x00e3 }
        r1 = r1.e;	 Catch:{ IOException -> 0x00e3 }
        r1 = r1.getText();	 Catch:{ IOException -> 0x00e3 }
        r1 = r1.toString();	 Catch:{ IOException -> 0x00e3 }
        r3 = "";
        r1 = r1.equals(r3);	 Catch:{ IOException -> 0x00e3 }
        if (r1 == 0) goto L_0x0050;
    L_0x003c:
        r1 = r5.a;	 Catch:{ IOException -> 0x00e5 }
        r1 = r1.v;	 Catch:{ IOException -> 0x00e5 }
        r1 = r1.g;	 Catch:{ IOException -> 0x00e5 }
        r3 = r5.a;	 Catch:{ IOException -> 0x00e5 }
        r4 = 2131231747; // 0x7f080403 float:1.8079584E38 double:1.0529683895E-314;
        r3 = r3.getString(r4);	 Catch:{ IOException -> 0x00e5 }
        r1.setText(r3);	 Catch:{ IOException -> 0x00e5 }
        if (r2 == 0) goto L_0x00ae;
    L_0x0050:
        if (r0 != 0) goto L_0x006b;
    L_0x0052:
        r1 = r5.a;	 Catch:{ IOException -> 0x00e7 }
        r1 = r1.v;	 Catch:{ IOException -> 0x00e7 }
        r1 = r1.g;	 Catch:{ IOException -> 0x00e7 }
        r3 = r5.a;	 Catch:{ IOException -> 0x00e7 }
        r4 = 2131231755; // 0x7f08040b float:1.80796E38 double:1.0529683935E-314;
        r3 = r3.getString(r4);	 Catch:{ IOException -> 0x00e7 }
        r1.setText(r3);	 Catch:{ IOException -> 0x00e7 }
        r1 = r5.a;	 Catch:{ IOException -> 0x00e7 }
        r1.k();	 Catch:{ IOException -> 0x00e7 }
        if (r2 == 0) goto L_0x00ae;
    L_0x006b:
        r1 = r5.a;
        r1 = r1.v;
        r1 = r1.g;
        r1.setText(r0);
        r1 = r5.a;
        com.whatsapp.RegisterPhone.a(r1, r0);
        r0 = r5.a;
        r0 = r0.m();
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r2 = "";
        r0 = r0.replaceAll(r1, r2);
        r1 = r5.a;	 Catch:{ IOException -> 0x00e9 }
        r1 = r1.v;	 Catch:{ IOException -> 0x00e9 }
        r1 = r1.c;	 Catch:{ IOException -> 0x00e9 }
        r1.setText(r0);	 Catch:{ IOException -> 0x00e9 }
        r0 = r5.a;	 Catch:{ IOException -> 0x00e9 }
        r0 = r0.v;	 Catch:{ IOException -> 0x00e9 }
        r0 = r0.e;	 Catch:{ IOException -> 0x00e9 }
        r0 = r0.hasFocus();	 Catch:{ IOException -> 0x00e9 }
        if (r0 == 0) goto L_0x00a9;
    L_0x00a0:
        r0 = r5.a;	 Catch:{ IOException -> 0x00e9 }
        r0 = r0.v;	 Catch:{ IOException -> 0x00e9 }
        r0 = r0.c;	 Catch:{ IOException -> 0x00e9 }
        r0.requestFocus();	 Catch:{ IOException -> 0x00e9 }
    L_0x00a9:
        r0 = r5.a;
        r0.r();
    L_0x00ae:
        return;
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r0);
        r0 = r1;
        goto L_0x0025;
    L_0x00bd:
        r0 = r5.a;	 Catch:{ IOException -> 0x00d7 }
        r0 = com.whatsapp.RegisterPhone.h(r0);	 Catch:{ IOException -> 0x00d7 }
        if (r0 == 0) goto L_0x00cd;
    L_0x00c5:
        if (r6 == 0) goto L_0x00db;
    L_0x00c7:
        r0 = r6.length();	 Catch:{ IOException -> 0x00d9 }
        if (r0 <= 0) goto L_0x00db;
    L_0x00cd:
        r0 = r6.toString();	 Catch:{ IOException -> 0x00b1 }
        r0 = com.whatsapp.u0.c(r0);	 Catch:{ IOException -> 0x00b1 }
        goto L_0x0025;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d9 }
    L_0x00d9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00b1 }
    L_0x00db:
        r0 = r5.a;	 Catch:{ IOException -> 0x00b1 }
        r0 = com.whatsapp.RegisterPhone.h(r0);	 Catch:{ IOException -> 0x00b1 }
        goto L_0x0025;
    L_0x00e3:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e5 }
    L_0x00e5:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e7 }
    L_0x00e7:
        r0 = move-exception;
        throw r0;
    L_0x00e9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.f7.afterTextChanged(android.text.Editable):void");
    }
}
