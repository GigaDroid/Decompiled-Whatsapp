package com.whatsapp;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.os.IBinder;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class ExternalMediaManager extends Service {
    private static final String[] z;

    public class ExternalMediaStateReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            context.startService(intent.setClass(context, ExternalMediaManager.class));
        }
    }

    static {
        String[] strArr = new String[5];
        String str = "r+n\u0002\u000ey2v8\u0011r7s\u0006Sb={\u0011\u001d~?{\u0005\u0010rs";
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
                        i3 = 23;
                        break;
                    case at.g /*1*/:
                        i3 = 83;
                        break;
                    case at.i /*2*/:
                        i3 = 26;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    default:
                        i3 = 124;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "z<o\t\br7";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "r+n\u0002\u000ey2v8\u0011r7s\u0006Sv%{\u000e\u0010v1v\u0002";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "r+n\u0002\u000ey2v8\u0011r7s\u0006Se6{\u0003Qx=v\u001e";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "z<o\t\br7E\u0015\u0013";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private synchronized void c() {
        if (!App.E) {
            App.E = true;
            App.aX = true;
            Log.i(z[0] + Environment.getExternalStorageState());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r4) {
        /*
        r3 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r1 = r4.equals(r1);
        if (r1 == 0) goto L_0x0015;
    L_0x000d:
        r3.b();
        com.whatsapp.util.ag.a();
        if (r0 == 0) goto L_0x002b;
    L_0x0015:
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r1 = r4.equals(r1);
        if (r1 == 0) goto L_0x0028;
    L_0x0020:
        r3.a();
        com.whatsapp.util.ag.a();
        if (r0 == 0) goto L_0x002b;
    L_0x0028:
        r3.c();
    L_0x002b:
        r0 = new com.whatsapp.t_;
        r0.<init>(r3, r4);
        com.whatsapp.util.bq.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ExternalMediaManager.a(java.lang.String):void");
    }

    private synchronized void a() {
        if (App.E || !App.aX) {
            App.E = false;
            App.aX = true;
            Log.i(z[4]);
            App.B((Context) this);
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    private synchronized void b() {
        if (App.E || App.aX) {
            App.E = false;
            App.aX = false;
            Log.i(z[3]);
            App.B((Context) this);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        a(Environment.getExternalStorageState());
        return 2;
    }
}
