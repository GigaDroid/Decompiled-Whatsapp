package com.whatsapp;

import android.telephony.CellLocation;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class bw extends PhoneStateListener {
    private static final String[] z;
    final VerifyNumber a;

    static {
        String[] strArr = new String[5];
        String str = "\u007f!o10p*h54l62+3{2t;3$7i9\"lkr(3{%i7$$%q(>hiq78nd";
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
                        i3 = 9;
                        break;
                    case at.g /*1*/:
                        i3 = 68;
                        break;
                    case at.i /*2*/:
                        i3 = 29;
                        break;
                    case at.o /*3*/:
                        i3 = 88;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u007f!o10p*h54l62+3{2t;3$7i9\"lkr(3{%i7$$*h53{-~x";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u007f!o10p*h54l62+3{2t;3$7i9\"lko77d-s?v";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u007f!o10p*h54l62+3{2t;3$7i9\"lkn,7}!=";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007f!o10p*h54l62+3{2t;3$7i9\"lkr(3{%i7$$%q(>hin09{0=";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDataActivity(int i) {
    }

    public void onDataConnectionStateChanged(int i) {
    }

    public void onMessageWaitingIndicatorChanged(boolean z) {
    }

    public void onCellLocationChanged(CellLocation cellLocation) {
        if (cellLocation != null) {
        }
    }

    public void onDataConnectionStateChanged(int i, int i2) {
    }

    public void onServiceStateChanged(ServiceState serviceState) {
        if (serviceState != null) {
            this.a.u = serviceState.getRoaming();
            Log.i(z[0] + serviceState.getOperatorAlphaLong());
            Log.i(z[1] + serviceState.getOperatorAlphaShort());
            Log.i(z[2] + serviceState.getOperatorNumeric());
            Log.i(z[3] + this.a.u);
            Log.i(z[4] + serviceState.getState());
            this.a.a(serviceState);
        }
    }

    bw(VerifyNumber verifyNumber) {
        this.a = verifyNumber;
    }

    public void onSignalStrengthsChanged(SignalStrength signalStrength) {
        if (signalStrength != null) {
        }
    }

    public void onSignalStrengthChanged(int i) {
    }

    public void onCallForwardingIndicatorChanged(boolean z) {
    }

    public void onCallStateChanged(int i, String str) {
    }
}
