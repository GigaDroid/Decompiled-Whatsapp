package com.whatsapp.gdrive;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.IntentSender.SendIntentException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class bm implements OnClickListener {
    private static final String[] z;
    final int a;
    final Activity b;
    final int c;

    static {
        String[] strArr = new String[2];
        String str = "I\u0017N0RK^I-MB\\[<P\u0003\u0016N+K\\^X0EB\u001c[yTK\u001dX0JISU7PK\u001dHyM]SR,HBSZ6V\u000e\u0016N+K\\S_6@KI\u001c";
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
                        i3 = 46;
                        break;
                    case at.g /*1*/:
                        i3 = 115;
                        break;
                    case at.i /*2*/:
                        i3 = 60;
                        break;
                    case at.o /*3*/:
                        i3 = 89;
                        break;
                    default:
                        i3 = 36;
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
                    str = "I\u0017N0RK^I-MB\\[<P\u0003\u0016N+K\\^X0EB\u001c[";
                    obj = null;
            }
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            PendingIntent errorPendingIntent = GooglePlayServicesUtil.getErrorPendingIntent(this.c, this.b, this.a);
            if (errorPendingIntent != null) {
                new ConnectionResult(this.c, errorPendingIntent).startResolutionForResult(this.b, this.a);
                if (!GoogleDriveService.c) {
                    return;
                }
            }
            Log.e(z[0] + fn.c(this.c));
        } catch (SendIntentException e) {
            throw e;
        } catch (Throwable e2) {
            Log.b(z[1], e2);
        }
    }

    bm(int i, Activity activity, int i2) {
        this.c = i;
        this.b = activity;
        this.a = i2;
    }
}
