package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class MessageAudioPlayer$2 extends BroadcastReceiver {
    private static final String[] z;
    final i8 a;

    static {
        String[] strArr = new String[2];
        String str = "RxQ`6XxCf3VrR\u007f6FxP<5MrCw4^nVa2\\xKe2M=jv6[nGg\u0007ShEt2[TL@#^iG)w";
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
                        i3 = 63;
                        break;
                    case at.g /*1*/:
                        i3 = 29;
                        break;
                    case at.i /*2*/:
                        i3 = 34;
                        break;
                    case at.o /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 87;
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
                    str = "LiCg2";
                    obj = null;
            }
        }
    }

    MessageAudioPlayer$2(i8 i8Var) {
        this.a = i8Var;
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = true;
        i8 i8Var = this.a;
        if (intent.getIntExtra(z[1], 0) <= 0) {
            z = false;
        }
        i8.a(i8Var, z);
        Log.i(z[0] + i8.c(this.a));
        if (i8.c(this.a)) {
            i8.h(this.a);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        i8.a(this.a);
    }
}
