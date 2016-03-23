package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.whatsapp.util.bq;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.at;

public final class ConnectivityReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "+ct9I+xs!E<u";
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
                        i3 = 72;
                        break;
                    case at.g /*1*/:
                        i3 = 12;
                        break;
                    case at.i /*2*/:
                        i3 = 26;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 44;
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
                    str = "+ct9I+xs!E<u";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ")b~%C!h49I<\"y8B&\"Y\u0018b\u0006IY\u0003e\u001eEN\u000es\u000bD[\u0019k\r";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(z[2])).getActiveNetworkInfo();
        h.b().d(a_3.a(activeNetworkInfo));
        a(context, activeNetworkInfo);
    }

    public void a(Context context) {
        context.registerReceiver(this, new IntentFilter(z[1]));
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService(z[0])).getActiveNetworkInfo();
        h.b().d(a_3.a(activeNetworkInfo));
        a(context, activeNetworkInfo);
    }

    private void a(Context context, NetworkInfo networkInfo) {
        bq.a(new nk(this, networkInfo, context));
    }
}
