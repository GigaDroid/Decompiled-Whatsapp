package com.whatsapp.accountsync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import org.v;
import org.whispersystems.at;

public class AccountAuthenticatorService extends Service {
    private static b a;
    private static final String z;

    private b a() {
        if (a == null) {
            a = new b(this);
        }
        return a;
    }

    static {
        char[] toCharArray = "!{\u0016\u0013T)q\\\u0000X#z\u0007\u000fO3;3\u0002X/`\u001c\u0015z5a\u001a\u0004U4|\u0011\u0000O/g".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 64;
                    break;
                case at.g /*1*/:
                    i2 = 21;
                    break;
                case at.i /*2*/:
                    i2 = 114;
                    break;
                case at.o /*3*/:
                    i2 = 97;
                    break;
                default:
                    i2 = 59;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        a = null;
    }

    public IBinder onBind(Intent intent) {
        if (intent.getAction().equals(z)) {
            return a().getIBinder();
        }
        return null;
    }
}
