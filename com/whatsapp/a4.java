package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.ConversationRowDocument.DocumentWarningDialogFragment;
import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.at;

class a4 implements OnClickListener {
    private static final String[] z;
    final DocumentWarningDialogFragment a;

    static {
        String[] strArr = new String[2];
        String str = "\f<~7\u007f\u0006<R-z";
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
                        i3 = 97;
                        break;
                    case at.g /*1*/:
                        i3 = 89;
                        break;
                    case at.i /*2*/:
                        i3 = 13;
                        break;
                    case at.o /*3*/:
                        i3 = 68;
                        break;
                    default:
                        i3 = 30;
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
                    str = "\u00007i6q\b=#-p\u0015<c00\u0000:y-q\u000fw[\r[6";
                    obj = null;
            }
        }
    }

    a4(DocumentWarningDialogFragment documentWarningDialogFragment) {
        this.a = documentWarningDialogFragment;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(z[1]);
        co a = App.aK.a(this.a.getArguments().getLong(z[0]));
        if (a != null) {
            MediaData mediaData = (MediaData) a.Q;
            intent.setDataAndType(Uri.fromFile(mediaData.file), a.n);
            App.a(this.a.getContext(), intent);
            mediaData.suspiciousContent = MediaData.SUSPICIOUS_CONTENT_YES_IGNORE;
            App.aK.c(a);
        }
    }
}
