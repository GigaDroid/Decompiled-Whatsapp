package com.whatsapp;

import android.content.Intent;
import android.content.ServiceConnection;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class q6 extends Handler {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = ">j\u000e>`8l\u001a=e8p@4n<n\u00007(.w\f3b.q";
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
                        i3 = 93;
                        break;
                    case at.g /*1*/:
                        i3 = 2;
                        break;
                    case at.i /*2*/:
                        i3 = 111;
                        break;
                    case at.o /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = 7;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ">j\u000e>`8l\u001a=e8p@4n<n\u00007(;c\u0006<";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ">j\u000e>`8l\u001a=e8p@4n<n\u00007(.c\u00025";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void handleMessage(Message message) {
        boolean z = DialogToastActivity.f;
        switch (message.what) {
            case at.m /*5*/:
                Log.w(z[1]);
                App.a(App.an(), App.z().getString(2131230902));
                if (!z) {
                    return;
                }
                break;
            case Y.f /*6*/:
                break;
            case aF.v /*7*/:
                break;
            default:
                return;
        }
        Log.e(z[2]);
        App.a(App.an(), App.z().getString(2131230897));
        if (!z) {
            return;
        }
        Log.i(z[0]);
        App.a(App.an(), App.z().getString(2131230903, new Object[]{"\u202a" + ChangeNumber.m() + "\u202c", "\u202a" + VerifyNumber.b(App.ay.cc, App.ay.number)}) + "\u202c");
        if (GoogleDriveService.X() && GoogleDriveService.g() != null) {
            ConditionVariable conditionVariable = new ConditionVariable(false);
            ServiceConnection f5Var = new f5(this, conditionVariable);
            App.z().bindService(new Intent(App.z(), GoogleDriveService.class), f5Var, 1);
            bq.a(new aq3(this, conditionVariable, f5Var));
        }
    }

    q6(Looper looper) {
        super(looper);
    }
}
