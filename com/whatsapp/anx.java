package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import org.v;
import org.whispersystems.at;

class anx implements OnClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "\b2\u001d-h\u00008W,b\u001d(\u00101`\u001ar5\u0010D(\b0\u0010I6\u000f6\nU*\u0019&\fB=\b0\u0011@:".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.g /*1*/:
                    i2 = 92;
                    break;
                case at.i /*2*/:
                    i2 = 121;
                    break;
                case at.o /*3*/:
                    i2 = 95;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.startActivity(new Intent(z));
        Conversation.bh = false;
        this.a.removeDialog(2);
    }

    anx(Conversation conversation) {
        this.a = conversation;
    }
}
