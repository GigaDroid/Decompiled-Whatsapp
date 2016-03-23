package com.whatsapp;

import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.ExitGroupDialogFragment;
import org.v;
import org.whispersystems.at;

class ng implements OnClickListener {
    private static final String[] z;
    final l5 a;
    final ExitGroupDialogFragment b;

    static {
        String[] strArr = new String[2];
        String str = "GEP$NVY_&BKDM}N\\CJ}LVEK\"\u0011";
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
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = 42;
                        break;
                    case at.i /*2*/:
                        i3 = 62;
                        break;
                    case at.o /*3*/:
                        i3 = 82;
                        break;
                    default:
                        i3 = 43;
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
                    str = "GEP$NVY_&BKDM}^WOL\u007f_VS\u0013>NE\\[\u0015YK_N";
                    obj = null;
            }
        }
    }

    ng(ExitGroupDialogFragment exitGroupDialogFragment, l5 l5Var) {
        this.b = exitGroupDialogFragment;
        this.a = l5Var;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r5, int r6) {
        /*
        r4 = this;
        r3 = 1;
        r2 = 0;
        r0 = z;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.Q();
        if (r0 == 0) goto L_0x003c;
    L_0x000f:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r4.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r4.a;
        r0 = r0.p;
        com.whatsapp.App.c(r0, r3);
        r0 = new com.whatsapp.alq;
        r0.<init>(r4);
        com.whatsapp.util.bq.a(r0);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x004c;
    L_0x003c:
        r0 = r4.b;
        r0 = r0.getActivity();
        r0 = r0.getBaseContext();
        r1 = 2131231140; // 0x7f0801a4 float:1.8078353E38 double:1.0529680896E-314;
        com.whatsapp.App.a(r0, r1, r2);
    L_0x004c:
        r0 = com.whatsapp.ConversationsFragment.h();
        r0 = r0 + 1;
        com.whatsapp.ConversationsFragment.d(r0);
        r0 = r4.b;
        r0.dismiss();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ng.onClick(android.content.DialogInterface, int):void");
    }
}
