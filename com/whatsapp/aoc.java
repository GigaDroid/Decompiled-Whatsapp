package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

class aoc implements OnClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "\u0017.L\u0004{\u00062C\u0006w\u001b/\r\u0001n\u0015,\r\u0000{\u0004.P\u00061\u001a.\u000f\u001c{\u00006M\u0000uY\"C\u001cp\u001b5\u000f\u0010r\u001b\"I_l\u00111M\u0000j".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 34;
                    break;
                case at.o /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aoc(Conversation conversation) {
        this.a = conversation;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!App.Q()) {
            Log.w(z);
            App.a(this.a.getBaseContext(), Conversation.g(this.a) ? 2131231518 : 2131231560, 0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.a(null, 0, 2131231813);
        Conversation.b(this.a, 0);
        bq.a(new e(this));
    }
}
