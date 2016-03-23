package com.whatsapp;

import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class a2l implements OnClickListener {
    private static final String[] z;
    final SpamWarningActivity a;
    final int b;

    static {
        String[] strArr = new String[3];
        String str = "\u0019m^C2K6\u0005D6\u00067][ \u0005jKC1_zE^n\u0017x[\u001c";
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
                        i3 = 113;
                        break;
                    case at.g /*1*/:
                        i3 = 25;
                        break;
                    case at.i /*2*/:
                        i3 = 42;
                        break;
                    case at.o /*3*/:
                        i3 = 51;
                        break;
                    default:
                        i3 = 65;
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
                    str = "^~O]$\u0003xF\u001c";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0010wNA.\u0018}\u0004Z/\u0005|DGo\u0010z^Z.\u001f7|z\u0004&";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a2l(SpamWarningActivity spamWarningActivity, int i) {
        this.a = spamWarningActivity;
        this.b = i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
        r7 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.aqu.f();
        r1 = r0.getLanguage();
        r3 = r0.getCountry();
        r0 = "";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x001c;
    L_0x0017:
        r0 = "";
        if (r2 == 0) goto L_0x003f;
    L_0x001c:
        r0 = "";
        r0 = r3.equals(r0);
        if (r0 == 0) goto L_0x0027;
    L_0x0025:
        if (r2 == 0) goto L_0x0078;
    L_0x0027:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0 = r0.append(r1);
        r1 = "_";
        r0 = r0.append(r1);
        r0 = r0.append(r3);
        r0 = r0.toString();
    L_0x003f:
        r1 = r7.a;
        r2 = new android.content.Intent;
        r3 = z;
        r4 = 1;
        r3 = r3[r4];
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 0;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r4.append(r0);
        r4 = z;
        r5 = 2;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r7.b;
        r0 = r0.append(r4);
        r0 = r0.toString();
        r0 = android.net.Uri.parse(r0);
        r2.<init>(r3, r0);
        r1.startActivity(r2);
        return;
    L_0x0078:
        r0 = r1;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a2l.onClick(android.view.View):void");
    }
}
