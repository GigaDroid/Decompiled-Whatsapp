package com.whatsapp.util;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

final class af implements OnClickListener {
    private static final String[] z;
    final CheckBox a;
    final EditText b;
    final Activity c;
    final CheckBox d;

    static {
        String[] strArr = new String[2];
        String str = "\u001b\u000bcX\u0014*\re";
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
                        i3 = 75;
                        break;
                    case at.g /*1*/:
                        i3 = 100;
                        break;
                    case at.i /*2*/:
                        i3 = 17;
                        break;
                    case at.o /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = arj.Theme_checkboxStyle;
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
                    str = "\u0007\u0005\u007fH\u0015(\u0005aI";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r4, int r5) {
        /*
        r3 = this;
        r0 = r3.b;
        r0 = r0.getText();
        r1 = r3.d;
        r1 = r1.isChecked();
        if (r1 == 0) goto L_0x001a;
    L_0x000e:
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        com.whatsapp.util.u.a(r1);
        r1 = com.whatsapp.util.Log.h;
        if (r1 == 0) goto L_0x0022;
    L_0x001a:
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        com.whatsapp.util.u.a(r1);
    L_0x0022:
        r1 = r3.a;
        r1 = r1.isChecked();
        com.whatsapp.util.u.a(r1);
        r1 = r3.c;
        com.whatsapp.util.u.a(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.af.onClick(android.content.DialogInterface, int):void");
    }

    af(EditText editText, CheckBox checkBox, CheckBox checkBox2, Activity activity) {
        this.b = editText;
        this.d = checkBox;
        this.a = checkBox2;
        this.c = activity;
    }
}
