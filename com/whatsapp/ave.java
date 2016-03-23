package com.whatsapp;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import org.v;
import org.whispersystems.at;

final class ave extends Handler {
    private static final String[] z;
    private final WeakReference a;

    static {
        String[] strArr = new String[3];
        String str = "L\u001dD]YM\u0019K[YK\u0017F^DZ\u0015\u0007\\DI\u0014G_\u0000L\u001dD]YMUNYDD\u001dL";
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
                        i3 = 40;
                        break;
                    case at.g /*1*/:
                        i3 = 120;
                        break;
                    case at.i /*2*/:
                        i3 = 40;
                        break;
                    case at.o /*3*/:
                        i3 = 56;
                        break;
                    default:
                        i3 = 45;
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
                    str = "L\u001dD]YM\u0019K[YK\u0017F^DZ\u0015\u0007LDE\u001dGMY\u0007\u001dPHDZ\u001dL";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "L\u001dD]YMXI[NG\rFL\rK\u0017F^DZ\u0015ILDG\u0016\bOL[XOY_J\u0019O]\rK\u0017DTHK\fM\\\r_\u0011\\P\rE\u001d[KLO\u001d[\u0018^\\\u0011DT\rM\u0016YMH]\u001dL";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public ave(DeleteAccountConfirmation deleteAccountConfirmation) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(deleteAccountConfirmation);
    }

    public void handleMessage(Message message) {
        Context context = (DeleteAccountConfirmation) this.a.get();
        if (context == null) {
            Log.w(z[1]);
        }
        switch (message.what) {
            case v.m /*0*/:
                Log.i(z[2]);
                if (DeleteAccountConfirmation.a() == context && context != null) {
                    context.removeDialog(1);
                    if (App.t(context) != 0) {
                        Log.w(z[0]);
                        context.showDialog(3);
                    }
                }
            default:
        }
    }
}
