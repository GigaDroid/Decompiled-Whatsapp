package com.whatsapp;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.whatsapp.Voip.CallState;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class l4 implements ServiceConnection {
    private static final String[] z;
    final VoipActivity a;

    static {
        String[] strArr = new String[2];
        String str = "\u001a3\u001fj\t:3\u001fjg\u000f(\u001flO\u0018%YuH?9\u0004lO\u000f95uH\u00029\u0015nC\b";
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
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 118;
                        break;
                    case at.o /*3*/:
                        i3 = 26;
                        break;
                    default:
                        i3 = 38;
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
                    str = "\u001a3\u001fj\t:3\u001fjg\u000f(\u001flO\u0018%YuH?9\u0004lO\u000f92sU\u000f3\u0018tC\u000f(\u0013~";
                    obj = null;
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        Log.i(z[1]);
        VoipActivity.e(this.a).a(null);
        VoipActivity.a(this.a, null);
        VoipActivity.a(this.a, false);
    }

    l4(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i(z[0]);
        dp dpVar = (dp) iBinder;
        VoipActivity.a(this.a, true);
        VoipActivity.a(this.a, dpVar.a());
        VoipActivity.e(this.a).a(this.a);
        this.a.a(CallState.NONE, Voip.getCallInfo());
        VoipActivity.f(this.a);
    }
}
