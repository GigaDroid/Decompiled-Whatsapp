package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class gn implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "\u0019\u0014f\u0011\u0014!\u000fg\u0002\u000bQ\tg\u0007\b\u0017\u0005b;\u0001\u0010\u0002N\u0016\u000b\u000b\u0016".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 126;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkboxStyle;
                    break;
                case at.i /*2*/:
                    i2 = 9;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 100;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    gn(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        GroupChatInfo.g(this.a);
    }
}
