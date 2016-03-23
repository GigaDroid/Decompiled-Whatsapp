package com.whatsapp;

import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.os.Build.VERSION;
import com.whatsapp.Voip.CallState;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class rq implements ServiceListener {
    private static final String[] z;
    final VoiceService a;

    static {
        String[] strArr = new String[2];
        String str = "250?\u007f%/=&?\u001b(6:$!u\u001b#%!.6 $,z\u0011*1 )<;p4(6)9(?y+9796!>!9-*4~z";
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
                        i3 = 68;
                        break;
                    case at.g /*1*/:
                        i3 = 90;
                        break;
                    case at.i /*2*/:
                        i3 = 89;
                        break;
                    case at.o /*3*/:
                        i3 = 79;
                        break;
                    default:
                        i3 = 80;
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
                    str = "250?\u007f%/=&?\u001b(6:$!u\u001b#%!.6 $,z\u0011*1 )<;p4(6)9(?y,?*4<,$!>co";
                    obj = null;
            }
        }
    }

    public void onServiceDisconnected(int i) {
        if (i == 1) {
            Log.i(z[0] + VoiceService.k(this.a));
            VoiceService.a(this.a, null);
        }
    }

    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        if (i == 1) {
            if (VERSION.SDK_INT >= 11) {
                VoiceService.a(this.a, (BluetoothHeadset) bluetoothProfile);
            }
            Log.i(z[1] + VoiceService.k(this.a));
            CallState currentCallState = Voip.getCurrentCallState();
            if ((currentCallState == CallState.CALLING || currentCallState == CallState.RECEIVED_CALL) && this.a.i()) {
                VoiceService.c(this.a, true);
            }
        }
    }

    rq(VoiceService voiceService) {
        this.a = voiceService;
    }
}
