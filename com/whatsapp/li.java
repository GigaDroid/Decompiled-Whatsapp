package com.whatsapp;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class li implements OnClickListener {
    private static final String[] z;
    final EULA a;

    static {
        String[] strArr = new String[5];
        String str = "\u0010\u0019ph\u0005";
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
                        i3 = 96;
                        break;
                    case at.g /*1*/:
                        i3 = 113;
                        break;
                    case at.i /*2*/:
                        i3 = 31;
                        break;
                    case at.o /*3*/:
                        i3 = 6;
                        break;
                    default:
                        i3 = 96;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0005\u0004sgO\u0003\u0014sj\u0015\f\u0010m+\u000e\u0005\u0005hi\u0012\u000bQqi\u000e\u0005";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0005\u0004sgO\u0003\u0014sj\u0015\f\u0010m+\u000e\u0005\u0005hi\u0012\u000bQqs\f\f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0005\u0004sgO\u0003\u0014sj\u0015\f\u0010m+\u000e\u0005\u0005hi\u0012\u000bQjh\u000b\u000e\u001ehh";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0003\u001eqh\u0005\u0003\u0005vp\t\u0014\b";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    li(EULA eula) {
        this.a = eula;
    }

    public void onClick(View view) {
        NetworkInfo networkInfo;
        boolean z = DialogToastActivity.f;
        TelephonyManager telephonyManager = (TelephonyManager) this.a.getSystemService(z[0]);
        if (telephonyManager == null) {
            Log.e(z[3]);
            this.a.showDialog(2);
            if (!z) {
                return;
            }
        }
        int networkType = telephonyManager.getNetworkType();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService(z[1]);
        if (connectivityManager == null) {
            networkInfo = null;
        } else {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        }
        int i;
        if (networkInfo == null || !networkInfo.isConnected()) {
            i = 0;
        } else {
            i = 1;
        }
        if (networkType == 0 && r1 == 0) {
            Log.e(z[4]);
            this.a.showDialog(2);
            if (!z) {
                return;
            }
        }
        if (telephonyManager.getPhoneType() == 0) {
            Log.e(z[2]);
            this.a.showDialog(3);
            if (!z) {
                return;
            }
        }
        EULA.a(this.a);
    }
}
