package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.ChatInfoActivity.EncryptionExplanationDialogFragment;
import org.v;
import org.whispersystems.at;

class asb implements OnClickListener {
    private static final String[] z;
    final EncryptionExplanationDialogFragment a;

    static {
        String[] strArr = new String[3];
        String str = "\u001f@7:\u0016\u0017J}!\u0017\nK=<W\u001fM'!\u0016\u0010\u0000\u0005\u0001<)";
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
                        i3 = 126;
                        break;
                    case at.g /*1*/:
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = 83;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 121;
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
                    str = "\u0016Z'8\nD\u0001|?\u000e\t\u0000$ \u0018\n]28\tPM<%V\u0018O\"g\u001e\u001b@6:\u0018\u0012\u0001apIM\u001ecyLQ\u0011?/D";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "XB0u";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    asb(EncryptionExplanationDialogFragment encryptionExplanationDialogFragment) {
        this.a = encryptionExplanationDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        App.a(this.a.getContext(), new Intent(z[0], Uri.parse(z[2] + aqu.g() + z[1] + aqu.c())));
        this.a.dismiss();
    }
}
