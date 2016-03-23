package com.whatsapp;

import android.os.Handler.Callback;
import org.v;
import org.whispersystems.at;

class pn implements Callback {
    private static final String[] z;
    final GroupChatInfo a;

    static {
        String[] strArr = new String[4];
        String str = "\u000ed*\u0011s6u-\u0005w6\u007f+\u0002lFq \u0010\\\u001ab$\u0010v\u001aI#\u0005j\u0005s!Di\u0000rx";
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
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 22;
                        break;
                    case at.i /*2*/:
                        i3 = 69;
                        break;
                    case at.o /*3*/:
                        i3 = 100;
                        break;
                    default:
                        i3 = 3;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0003\u007f!";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Iu*\u0000fT";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001ab$\u0010v\u001a";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r6) {
        /*
        r5 = this;
        r4 = 1;
        r0 = r6.obj;
        r0 = (android.os.Bundle) r0;
        r1 = r6.what;
        if (r1 != 0) goto L_0x003e;
    L_0x0009:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r2 = r0.getString(r2);
        r1 = r1.append(r2);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r6.arg1;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.w(r1);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0049;
    L_0x003e:
        r1 = z;
        r1 = r1[r4];
        r0 = r0.getString(r1);
        com.whatsapp.App.t(r0);
    L_0x0049:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.pn.handleMessage(android.os.Message):boolean");
    }

    pn(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
