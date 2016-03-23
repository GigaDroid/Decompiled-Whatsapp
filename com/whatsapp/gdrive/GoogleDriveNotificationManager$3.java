package com.whatsapp.gdrive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class GoogleDriveNotificationManager$3 extends BroadcastReceiver {
    private static final String z;
    final cy a;

    static {
        char[] toCharArray = "y\u000e\u001d\rp{G\u0001\u000brw\f\u0006\u0007gj\u0003\u0000\n+s\u000b\u0001\u0005a{\u0018@\u0011u{\u0018B\u0000c}\u0003\u000b\u0001b3\u001e\u0000It{\u0019\u001b\u000bt{G\u0000\u0012clG\u0003\u000bq3\b\u000e\u0010r{\u0018\u0016".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 30;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 111;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 6;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    GoogleDriveNotificationManager$3(cy cyVar) {
        this.a = cyVar;
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z);
        GoogleDriveService.k();
        cy.a(this.a).unregisterReceiver(this);
        cy.b(this.a).cancel(8);
    }
}
