package com.whatsapp.fieldstats;

import android.content.Context;
import android.os.Handler.Callback;
import android.os.Message;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class as implements Callback {
    private static final String z;

    static {
        char[] toCharArray = "\u0013I\b\u00138@R\u001c\u0013k\u0006Q\u001c\u0014#@X\u001b\u0015$\u0012".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 96;
                    break;
                case at.g /*1*/:
                    i2 = 61;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private void a(Context context) {
        if (i.b() != null) {
            try {
                i.b().flush();
            } catch (Throwable e) {
                Log.b(z, e);
            }
            i.n(context);
        }
    }

    as() {
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case v.m /*0*/:
                a((Context) message.obj);
                i.a((Context) message.obj);
                return true;
            case at.g /*1*/:
                a((Context) message.obj);
                return true;
            default:
                return false;
        }
    }
}
