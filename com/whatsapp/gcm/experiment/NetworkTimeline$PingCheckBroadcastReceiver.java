package com.whatsapp.gcm.experiment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.at;

public class NetworkTimeline$PingCheckBroadcastReceiver extends BroadcastReceiver {
    private static final String z;

    static {
        char[] toCharArray = "\u001d\b`c3%\u0004mo2?\u000eo`\u0013,\u0012zV\u0015.\u0004gr\u0015?Baj\"(\u0002km\u0006(".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 77;
                    break;
                case at.g /*1*/:
                    i2 = 97;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 112;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z);
        bq.a(new g(this));
    }
}
