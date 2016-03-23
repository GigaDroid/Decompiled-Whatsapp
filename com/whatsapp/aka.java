package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import com.whatsapp.util.bq;
import java.io.File;
import org.v;
import org.whispersystems.at;

class aka extends Handler {
    private static final String[] z;
    final oy a;

    static {
        String[] strArr = new String[2];
        String str = "+\"\u0006+";
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
                        i3 = 5;
                        break;
                    case at.g /*1*/:
                        i3 = 67;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 58;
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
                    str = "+r";
                    obj = null;
            }
        }
    }

    public aka(@NonNull oy oyVar, Looper looper) {
        this.a = oyVar;
        super((Looper) auv.a((Object) looper));
    }

    public void handleMessage(Message message) {
        if (oy.b(this.a) != null) {
            File file = new File(oy.a(this.a) + z[1] + z[0]);
            if (file.length() > 0) {
                bq.a(new azl(this, file));
                if (!oh.b) {
                    return;
                }
            }
            sendEmptyMessageDelayed(0, 50);
        }
    }
}
