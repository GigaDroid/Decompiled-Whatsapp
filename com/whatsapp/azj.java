package com.whatsapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class azj extends Handler {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u000fczfv\u000bg';`\r||,w\u0017>~&n\u000b}%/d\u0007\u007f";
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
                        i3 = 110;
                        break;
                    case at.g /*1*/:
                        i3 = 19;
                        break;
                    case at.i /*2*/:
                        i3 = 10;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 5;
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
                    str = "\u001cp";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001cp@ a";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    azj(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        Bundle bundle = (Bundle) message.obj;
        if (!ve.a(bundle.getByteArray(z[2]), bundle.getString(z[1]))) {
            Log.e(z[0]);
        }
    }
}
