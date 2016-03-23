package com.whatsapp;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

class yc extends ap {
    private static final String[] z;
    final String b;
    final ConversationRowText c;

    static {
        String[] strArr = new String[2];
        String str = "G1[;\u0005O;\u0011 \u0004R:Q=DG<K \u0005Hqi\u0000/q";
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
                        i3 = 38;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 63;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = arj.Theme_ratingBarStyle;
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
                    str = "E0Rg\u000bH;M&\u0003Bq];\u0005Q,Z;DG/O%\u0003E>K \u0005H\u0000V-";
                    obj = null;
            }
        }
    }

    public void a(View view) {
        Intent intent = new Intent(z[0], Uri.parse(this.b));
        intent.putExtra(z[1], this.c.getContext().getPackageName());
        App.a(this.c.getContext(), intent);
    }

    yc(ConversationRowText conversationRowText, String str) {
        this.c = conversationRowText;
        this.b = str;
    }
}
