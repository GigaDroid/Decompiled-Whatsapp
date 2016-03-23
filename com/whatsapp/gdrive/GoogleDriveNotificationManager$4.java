package com.whatsapp.gdrive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class GoogleDriveNotificationManager$4 extends BroadcastReceiver {
    private static final String[] z;
    final cy a;

    static {
        String[] strArr = new String[2];
        String str = ".C\u0001S\\!\u007f\u0005_A)O\u0007Wl\"E\u0011SR\u0010R\u0010IG R\u0010e\\9E\u0007eP*L\u0019O_.R";
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
                        i3 = 79;
                        break;
                    case at.g /*1*/:
                        i3 = 32;
                        break;
                    case at.i /*2*/:
                        i3 = 117;
                        break;
                    case at.o /*3*/:
                        i3 = 58;
                        break;
                    default:
                        i3 = 51;
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
                    str = "(D\u0007SE*\r\u001bUG&F\u001cYR;I\u001aT\u001e\"A\u001b[T*RZO@*RX^V,I\u0011_WbT\u001a\u0017A*S\u0001UA*\r\u001aLV=\r\u0011[G.\r\u0016U]!E\u0016NZ N";
                    obj = null;
            }
        }
    }

    GoogleDriveNotificationManager$4(cy cyVar) {
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
