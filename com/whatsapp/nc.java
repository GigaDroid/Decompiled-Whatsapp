package com.whatsapp;

import android.os.Handler.Callback;
import android.os.Message;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class nc implements Callback {
    private static final String z;

    static {
        char[] toCharArray = "\u000f{\u0003\rVJz\u0010\u0014M\u0004nQ\u0011P\u000b}\u0018\u0011P\u0003j\u0002BB\u0003e\u0014".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.g /*1*/:
                    i2 = 9;
                    break;
                case at.i /*2*/:
                    i2 = 113;
                    break;
                case at.o /*3*/:
                    i2 = 98;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    nc() {
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case v.m /*0*/:
                try {
                    amd.b();
                } catch (Throwable e) {
                    Log.b(z, e);
                }
                return true;
            default:
                return false;
        }
    }
}
