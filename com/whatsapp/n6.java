package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.ConversationRowDivider.EncryptionChangeDialogFragment;
import org.v;
import org.whispersystems.at;

class n6 implements OnClickListener {
    private static final String[] z;
    final EncryptionChangeDialogFragment a;

    static {
        String[] strArr = new String[3];
        String str = ":^-g]h\u0005v`Y%\u0004.\u007fO&Y8g^|I6z\u0001!O:b\\;^ (B5\u0017";
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
                        i3 = 82;
                        break;
                    case at.g /*1*/:
                        i3 = 42;
                        break;
                    case at.i /*2*/:
                        i3 = 89;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 46;
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
                    str = "3D=eA;Nw~@&O7c\u00003I-~A<\u0004\u000f^k\u0005";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "tF:*";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        App.a(this.a.getContext(), new Intent(z[2], Uri.parse(z[0] + aqu.g() + z[1] + aqu.c())));
        this.a.dismiss();
    }

    n6(EncryptionChangeDialogFragment encryptionChangeDialogFragment) {
        this.a = encryptionChangeDialogFragment;
    }
}
