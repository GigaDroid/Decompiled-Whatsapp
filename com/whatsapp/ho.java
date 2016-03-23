package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ho implements OnClickListener {
    private static final String z;
    final ListChatInfo a;

    static {
        char[] toCharArray = "p\u000eD~y\u007f\u000fV~yu\tQe\ts\tTfO\u007f\fhfC}\u0011RMTs\u0012G".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.i /*2*/:
                    i2 = 55;
                    break;
                case at.o /*3*/:
                    i2 = 10;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Log.i(z);
        App.k(ListChatInfo.f(this.a).p);
        App.e(ListChatInfo.f(this.a).p);
        this.a.startActivity(new Intent(App.z().getApplicationContext(), Main.e()).addFlags(603979776));
    }

    ho(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
