package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.DeleteAccountFeedback.ChangeNumberMessageDialogFragment;
import org.v;
import org.whispersystems.at;

class o0 implements OnClickListener {
    private static final String[] z;
    final int a;
    final ChangeNumberMessageDialogFragment b;
    final String c;

    static {
        String[] strArr = new String[2];
        String str = "5\b3~N4?:zI>\u0003";
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
                        i3 = 81;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 95;
                        break;
                    case at.o /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 58;
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
                    str = "0\t;rN8\u00021zV\u0012\u00022v_?\u0019,";
                    obj = null;
            }
        }
    }

    o0(ChangeNumberMessageDialogFragment changeNumberMessageDialogFragment, int i, String str) {
        this.b = changeNumberMessageDialogFragment;
        this.a = i;
        this.c = str;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.b.getActivity(), DeleteAccountConfirmation.class);
        intent.putExtra(z[0], this.a);
        intent.putExtra(z[1], this.c);
        this.b.startActivity(intent);
    }
}
