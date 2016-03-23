package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.ConversationRowDivider.IdentityChangeDialogFragment;
import org.v;
import org.whispersystems.at;

class a_x implements OnClickListener {
    private static final String[] z;
    final IdentityChangeDialogFragment a;

    static {
        String[] strArr = new String[3];
        String str = "^!?\\eV+uGdK*5Z$^,/GeQa\rgOh";
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
                        i3 = 63;
                        break;
                    case at.g /*1*/:
                        i3 = 79;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = 46;
                        break;
                    default:
                        i3 = 10;
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
                    str = "\u0010(>@oM.7\u00018\u0007\u007fh\u001e:\u000e{";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "W;/^y\u0005`tY}Ha,FkK<:^z\u0011,4C%Y.*\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a_x(IdentityChangeDialogFragment identityChangeDialogFragment) {
        this.a = identityChangeDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        App.a(this.a.getContext(), new Intent(z[0], Uri.parse(z[1] + aqu.g() + "_" + aqu.c() + z[2])));
    }
}
