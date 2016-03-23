package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class an7 implements OnClickListener {
    private static final String[] z;
    final RegisterPhone a;

    static {
        String[] strArr = new String[10];
        String str = ":2";
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
                        i3 = 89;
                        break;
                    case at.g /*1*/:
                        i3 = 81;
                        break;
                    case at.i /*2*/:
                        i3 = 97;
                        break;
                    case at.o /*3*/:
                        i3 = 29;
                        break;
                    default:
                        i3 = 42;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "44\u0012nK>4>tN";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "?>\u0013~O\u0006$\b";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ")9";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "+4\u0006tY-4\u0013mB6?\u00042Y<%\u0002~Z1>\u000fxD,<N{K0=\u0004y";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "8?\u0005oE05OmO+<\bnY0>\u000f3x\u001c\u0012$T|\u001c\u000e2Py";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "8?\u0005oE05OmO+<\bnY0>\u000f3x\u001c\u0012$T|\u001c\u000e2Py";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ")4\u0013pC*\"\brD*";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "=#\u0000jK;=\u0004BC=";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ":>\f3]10\u0015nK)!>mX<7\u0004oO72\u0004n";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(21);
        Editor edit = this.a.getSharedPreferences(z[1], 0).edit();
        edit.putString(z[0], EnterPhoneNumber.w);
        edit.putString(z[4], EnterPhoneNumber.A);
        if (!edit.commit()) {
            Log.e(z[5]);
        }
        if (App.h(this.a, z[7]) == 0) {
            RegisterPhone.b(this.a);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.startActivityForResult(new Intent(this.a, RequestPermissionActivity.class).putExtra(z[9], 2130839703).putExtra(z[8], new String[]{z[6]}).putExtra(z[2], 2131231635).putExtra(z[3], true), 1);
    }

    an7(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }
}
