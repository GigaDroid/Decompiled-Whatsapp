package com.whatsapp.gdrive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class GoogleDriveNotificationManager$5 extends BroadcastReceiver {
    private static final String z;
    final cy a;

    static {
        char[] toCharArray = "\u001atYk \u0018=Em\"\u0014vBa7\tyDl{\u0010qEc1\u0018b\u0004w%\u0018b\u0006f3\u001eyOg2PdD/$\u0018c_m$\u0018=Dt3\u000f=Gm!PrJv\"\u0018bR".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 125;
                    break;
                case at.g /*1*/:
                    i2 = 16;
                    break;
                case at.i /*2*/:
                    i2 = 43;
                    break;
                case at.o /*3*/:
                    i2 = 2;
                    break;
                default:
                    i2 = 86;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z);
        GoogleDriveService.I();
        cy.a(this.a).unregisterReceiver(this);
        cy.b(this.a).cancel(8);
    }

    GoogleDriveNotificationManager$5(cy cyVar) {
        this.a = cyVar;
    }
}
