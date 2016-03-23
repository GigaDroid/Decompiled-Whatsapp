package com.whatsapp.gcm.experiment;

import android.app.AlarmManager;
import android.app.Application;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Intent;
import com.whatsapp.App;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class PingCheckSchedulerService extends IntentService {
    private static final String[] z;

    static {
        String[] strArr = new String[8];
        String str = ":C*}b1M3 t)\\i4v4\u0002\"+e<^.>p7Xi2v-E(=;\te\t\u0014J\ni\u0013\u0006E";
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
                        i3 = 89;
                        break;
                    case at.g /*1*/:
                        i3 = 44;
                        break;
                    case at.i /*2*/:
                        i3 = 71;
                        break;
                    case at.o /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 21;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\tE)4V1I$8F:D\"7`5I5\u0000p+Z.0py^\"0p0Z\"757Y+?50B36{-";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\tE)4V1I$8F:D\"7`5I5\u0000p+Z.0py^\"0p0Z\"757Y+?58O3:z7\f.=50B36{-";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\tE)4V1I$8F:D\"7`5I5\u0000p+Z.0p";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\tE)4V1I$8F:D\"7`5I5\u0000p+Z.0pz_\"'`)m+2g4";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "8@&!x";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ":C*}b1M3 t)\\i4v4\u0002\"+e<^.>p7Xi2v-E(=;\u000bi\u0004\u0006G\u000be\t\u0014J\te\t\u0014";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ":C*}b1M3 t)\\i4v4\u0002\"+e<^.>p7Xi2v-E(=;\te\t\u0014J\ni\u0013\u0006E";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a(Application application) {
        if (App.am >= 2) {
            application.startService(new Intent(z[0], null, application, PingCheckSchedulerService.class));
        }
    }

    public PingCheckSchedulerService() {
        super(z[4]);
    }

    private void a() {
        if (App.q(getApplicationContext())) {
            Log.i(z[5]);
            ((AlarmManager) getSystemService(z[6])).setInexactRepeating(3, 0, 1800000, PendingIntent.getBroadcast(this, 0, new Intent(z[7], null, this, NetworkTimeline$PingCheckBroadcastReceiver.class), 0));
        }
    }

    protected void onHandleIntent(Intent intent) {
        if (intent == null) {
            Log.w(z[2]);
        } else if (intent.getAction() == null) {
            Log.w(z[3]);
        } else {
            String action = intent.getAction();
            Object obj = -1;
            switch (action.hashCode()) {
                case 424482499:
                    if (action.equals(z[1])) {
                        obj = null;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case v.m /*0*/:
                    a();
                default:
            }
        }
    }
}
