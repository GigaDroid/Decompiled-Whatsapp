package com.whatsapp;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class aq3 implements Runnable {
    private static final String[] z;
    final ConditionVariable a;
    final ServiceConnection b;
    final q6 c;

    static {
        String[] strArr = new String[6];
        String str = "07PG]61DDX6-\u001eZO0<TZI|<PGY63\u001cY_=;XG]~8U[S%:\u001cK[04DY\u001721U\u0004H6,EFH6rXO\u001721H";
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
                        i3 = 83;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 49;
                        break;
                    case at.o /*3*/:
                        i3 = 41;
                        break;
                    default:
                        i3 = 58;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "2<E@U=\u0000RA[=8TvT&2SLH";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "07PG]61DDX6-\u001eZO0<TZI|8U[S%:\u001cZN2-E\u0004Y;>_N_~1DDX6-";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "<3UvJ;0_Le=*\\K_!";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "07PG]61DDX6-\u001eZO0<TZI|(P@N:1V\u0004\\<-\u001cN^!6GL\u0017 :C_S0:\u001cFX9:R]";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "=:FvJ;0_Le=*\\K_!";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    aq3(q6 q6Var, ConditionVariable conditionVariable, ServiceConnection serviceConnection) {
        this.c = q6Var;
        this.a = conditionVariable;
        this.b = serviceConnection;
    }

    public void run() {
        Log.i(z[5]);
        this.a.block();
        Log.i(z[0]);
        ChangeNumber.a().u();
        Log.i(z[3]);
        Intent intent = new Intent(App.z(), GoogleDriveService.class);
        intent.setAction(z[2]);
        intent.putExtra(z[4], ChangeNumber.l());
        intent.putExtra(z[1], App.ay.jabber_id);
        App.z().startService(intent);
        App.z().unbindService(this.b);
        App.G();
    }
}
