package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class al1 extends Handler {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "\\lrK>DraK)Xpc\u001d";
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
                        i3 = 61;
                        break;
                    case at.g /*1*/:
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = 2;
                        break;
                    case at.o /*3*/:
                        i3 = 100;
                        break;
                    default:
                        i3 = 77;
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
                    str = "\\lrK>DraK?Hr";
                    obj = null;
            }
        }
    }

    public void handleMessage(Message message) {
        switch (message.what) {
            case v.m /*0*/:
                if (App.S()) {
                    Log.i(z[0]);
                    removeMessages(0);
                    sendEmptyMessageDelayed(0, 15000);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                Log.i(z[1]);
                removeMessages(0);
                PerformSyncManager.c(App.z());
            default:
        }
    }

    al1(Looper looper) {
        super(looper);
    }
}
