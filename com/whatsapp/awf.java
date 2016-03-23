package com.whatsapp;

import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class awf implements OnClickListener {
    private static final String[] z;
    final DeleteAccountFeedback a;

    static {
        String[] strArr = new String[2];
        String str = "H>\n\u0003}I\t\u0003\u0007zC5";
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
                        i3 = 44;
                        break;
                    case at.g /*1*/:
                        i3 = 91;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    default:
                        i3 = 9;
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
                    str = "M?\u0002\u000f}E4\b\u0007eo4\u000b\u000blB/\u0015";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r7) {
        /*
        r6 = this;
        r5 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r6.a;
        r0 = com.whatsapp.DeleteAccountFeedback.a(r0);
        r0 = r0.getText();
        r0 = r0.length();
        if (r0 <= 0) goto L_0x0037;
    L_0x0013:
        r0 = r6.a;
        r0 = com.whatsapp.DeleteAccountFeedback.a(r0);
        r0 = r0.getText();
        r0 = r0.length();
        r2 = 5;
        if (r0 >= r2) goto L_0x0037;
    L_0x0024:
        r0 = r6.a;
        r0 = r0.getBaseContext();
        r1 = r6.a;
        r2 = 2131231065; // 0x7f080159 float:1.80782E38 double:1.0529680526E-314;
        r1 = r1.getString(r2);
        com.whatsapp.App.b(r0, r1, r5);
    L_0x0036:
        return;
    L_0x0037:
        r0 = r6.a;
        r0 = com.whatsapp.DeleteAccountFeedback.c(r0);
        if (r0 <= 0) goto L_0x0057;
    L_0x003f:
        r0 = r6.a;
        r0 = com.whatsapp.DeleteAccountFeedback.c(r0);
        r2 = r6.a;
        r2 = r2.getResources();
        r3 = 2131689480; // 0x7f0f0008 float:1.9007977E38 double:1.0531945397E-314;
        r2 = r2.getStringArray(r3);
        r2 = r2.length;
        r2 = r2 + -1;
        if (r0 < r2) goto L_0x005a;
    L_0x0057:
        r0 = -1;
        if (r1 == 0) goto L_0x0062;
    L_0x005a:
        r0 = r6.a;
        r0 = com.whatsapp.DeleteAccountFeedback.c(r0);
        r0 = r0 + -1;
    L_0x0062:
        r2 = r6.a;
        r2 = com.whatsapp.DeleteAccountFeedback.c(r2);
        r3 = 2;
        if (r2 != r3) goto L_0x0094;
    L_0x006b:
        r2 = r6.a;
        r3 = r6.a;
        r3 = com.whatsapp.DeleteAccountFeedback.a(r3);
        r3 = r3.getText();
        r3 = r3.toString();
        r3 = com.whatsapp.DeleteAccountFeedback.ChangeNumberMessageDialogFragment.b(r0, r3);
        com.whatsapp.DeleteAccountFeedback.a(r2, r3);
        r2 = r6.a;
        r2 = com.whatsapp.DeleteAccountFeedback.b(r2);
        r3 = r6.a;
        r3 = r3.getSupportFragmentManager();
        r4 = 0;
        r2.show(r3, r4);
        if (r1 == 0) goto L_0x0036;
    L_0x0094:
        r1 = new android.content.Intent;
        r2 = r6.a;
        r3 = com.whatsapp.DeleteAccountConfirmation.class;
        r1.<init>(r2, r3);
        r2 = z;
        r2 = r2[r5];
        r1.putExtra(r2, r0);
        r0 = z;
        r2 = 1;
        r0 = r0[r2];
        r2 = r6.a;
        r2 = com.whatsapp.DeleteAccountFeedback.a(r2);
        r2 = r2.getText();
        r2 = r2.toString();
        r1.putExtra(r0, r2);
        r0 = r6.a;
        r0.startActivity(r1);
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.awf.onClick(android.view.View):void");
    }

    awf(DeleteAccountFeedback deleteAccountFeedback) {
        this.a = deleteAccountFeedback;
    }
}
