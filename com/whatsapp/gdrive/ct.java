package com.whatsapp.gdrive;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import org.v;
import org.whispersystems.at;

class ct implements OnClickListener {
    private static final String z;
    final int a;
    final SingleChoiceListDialogFragment b;
    final Bundle c;

    static {
        char[] toCharArray = "r(Dg,".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 27;
                    break;
                case at.g /*1*/:
                    i2 = 92;
                    break;
                case at.i /*2*/:
                    i2 = 33;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 95;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ct(SingleChoiceListDialogFragment singleChoiceListDialogFragment, int i, Bundle bundle) {
        this.b = singleChoiceListDialogFragment;
        this.a = i;
        this.c = bundle;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SingleChoiceListDialogFragment.a(this.b).b(this.a, i, this.c.getStringArray(z));
        dialogInterface.dismiss();
    }
}
