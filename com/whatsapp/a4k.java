package com.whatsapp;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import java.util.Collection;
import org.v;
import org.whispersystems.at;

final class a4k implements OnClickListener {
    private static final String[] z;
    final boolean a;
    final Collection b;
    final Activity c;
    final int d;
    final be e;
    final CheckBox f;

    static {
        String[] strArr = new String[2];
        String str = "\u0010h\u0005\u0002\n\u001bf\u001c_\u001c\u0003w7\\\u000f\u0016a\r^\u0018\u001dd\r_";
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
                        i3 = 115;
                        break;
                    case at.g /*1*/:
                        i3 = 7;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 125;
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
                    str = "\u0003u\rJ\"\u0017b\u0004I\t\u0016X\u0005I\u0019\u001af";
                    obj = null;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.content.DialogInterface r7, int r8) {
        /*
        r6 = this;
        r1 = 1;
        r2 = 0;
        r0 = r6.c;
        r3 = r6.d;
        r0.removeDialog(r3);
        r0 = r6.f;
        if (r0 == 0) goto L_0x0082;
    L_0x000d:
        r0 = r6.f;
        r0 = r0.isChecked();
        if (r0 == 0) goto L_0x0082;
    L_0x0015:
        r0 = r1;
    L_0x0016:
        r3 = r6.a;
        if (r0 == r3) goto L_0x0035;
    L_0x001a:
        r3 = com.whatsapp.App.z();
        r4 = z;
        r4 = r4[r2];
        r3 = r3.getSharedPreferences(r4, r2);
        r3 = r3.edit();
        r4 = z;
        r4 = r4[r1];
        r3 = r3.putBoolean(r4, r0);
        r3.commit();
    L_0x0035:
        r3 = r6.b;
        com.whatsapp.App.a(r3, r0);
        r0 = r6.b;
        r0 = r0.size();
        if (r0 != r1) goto L_0x0052;
    L_0x0042:
        r0 = r6.c;
        r0 = r0.getBaseContext();
        r3 = 2131231447; // 0x7f0802d7 float:1.8078975E38 double:1.0529682413E-314;
        com.whatsapp.App.a(r0, r3, r2);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x007c;
    L_0x0052:
        r0 = r6.c;
        r0 = r0.getBaseContext();
        r3 = com.whatsapp.App.az;
        r4 = 2131296285; // 0x7f09001d float:1.8210482E38 double:1.0530002755E-314;
        r5 = r6.b;
        r5 = r5.size();
        r3 = r3.a(r4, r5);
        r1 = new java.lang.Object[r1];
        r4 = r6.b;
        r4 = r4.size();
        r4 = java.lang.Integer.valueOf(r4);
        r1[r2] = r4;
        r1 = java.lang.String.format(r3, r1);
        com.whatsapp.App.b(r0, r1, r2);
    L_0x007c:
        r0 = r6.e;
        r0.a();
        return;
    L_0x0082:
        r0 = r2;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a4k.onClick(android.content.DialogInterface, int):void");
    }

    a4k(Activity activity, int i, CheckBox checkBox, boolean z, Collection collection, be beVar) {
        this.c = activity;
        this.d = i;
        this.f = checkBox;
        this.a = z;
        this.b = collection;
        this.e = beVar;
    }
}
