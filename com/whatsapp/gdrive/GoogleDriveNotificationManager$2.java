package com.whatsapp.gdrive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class GoogleDriveNotificationManager$2 extends BroadcastReceiver {
    private static final String[] z;
    final cy a;

    static {
        String[] strArr = new String[2];
        String str = "G(\u0003M\fH\u0014\u0007A\u0011@$\u0005I<D*\u0014O\u0016V\u0014\u0018R\u0006T\u0014\u0014A\u000fJ>\u001bE\u0011";
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
                        i3 = 38;
                        break;
                    case at.g /*1*/:
                        i3 = 75;
                        break;
                    case at.i /*2*/:
                        i3 = 119;
                        break;
                    case at.o /*3*/:
                        i3 = 36;
                        break;
                    default:
                        i3 = 99;
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
                    str = "A/\u0005M\u0015Cf\u0019K\u0017O-\u001eG\u0002R\"\u0018JNK*\u0019E\u0004C9XQ\u0010C9Z@\u0006E\"\u0013A\u0007\u000b?\u0018\t\u0001G(\u001cQ\u0013\u000b$\u0001A\u0011\u000b/\u0016P\u0002\u000b(\u0018J\rC(\u0003M\fH";
                    obj = null;
            }
        }
    }

    GoogleDriveNotificationManager$2(cy cyVar) {
        this.a = cyVar;
    }

    public void onReceive(Context context, Intent intent) {
        Log.i(z[1]);
        Intent intent2 = new Intent(cy.a(this.a), SettingsGoogleDrive.class);
        intent2.setAction(z[0]);
        intent2.setFlags(335544320);
        cy.a(this.a).startActivity(intent2);
        cy.a(this.a).unregisterReceiver(this);
        cy.b(this.a).cancel(8);
    }
}
