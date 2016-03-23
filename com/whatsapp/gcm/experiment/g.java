package com.whatsapp.gcm.experiment;

import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.ce;
import com.whatsapp.tp;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class g implements Runnable {
    private static final String[] z;
    final NetworkTimeline$PingCheckBroadcastReceiver a;

    static {
        String[] strArr = new String[3];
        String str = "XT9;\u001b`X47";
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
                        i3 = 8;
                        break;
                    case at.g /*1*/:
                        i3 = 61;
                        break;
                    case at.i /*2*/:
                        i3 = 87;
                        break;
                    case at.o /*3*/:
                        i3 = 92;
                        break;
                    default:
                        i3 = 88;
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
                    str = "XT9;\u001b`X47\u001azR68;iN#\u000e=kX>*=z\u0012'56o\u0011w/-k^2/+5";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "$\u001d3)*iI>365";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    g(NetworkTimeline$PingCheckBroadcastReceiver networkTimeline$PingCheckBroadcastReceiver) {
        this.a = networkTimeline$PingCheckBroadcastReceiver;
    }

    public void run() {
        boolean z = false;
        boolean z2 = d.d;
        ce a = tp.a(z[0]);
        a.e();
        boolean a2 = j.a();
        a.d();
        d.a(d.c(), a2);
        Log.i(z[2] + a2 + z[1] + a.a());
        if (WAAppCompatActivity.c != 0) {
            if (!z2) {
                z = true;
            }
            d.d = z;
        }
    }
}
