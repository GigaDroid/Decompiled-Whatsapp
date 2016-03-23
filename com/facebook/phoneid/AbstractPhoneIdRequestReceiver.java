package com.facebook.phoneid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public abstract class AbstractPhoneIdRequestReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "Y\u000b\u0004\u0017#[\u0007\f[*U\u000fG~\u0000n;9q\nt!6p\u0001";
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
                        i3 = 58;
                        break;
                    case at.g /*1*/:
                        i3 = 100;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 57;
                        break;
                    default:
                        i3 = 69;
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
                    str = "N\r\u0004\\6N\u0005\u0004I";
                    obj = null;
            }
        }
    }

    @Nullable
    protected abstract e a(Context context);

    protected boolean b(Context context) {
        return true;
    }

    public void onReceive(Context context, Intent intent) {
        e a = a(context);
        if (z[0].equals(intent.getAction()) && b(context) && a != null && f.a(context, getResultExtras(true))) {
            Bundle bundle = new Bundle();
            bundle.putLong(z[1], a.b);
            setResult(-1, a.c, bundle);
        }
    }
}
