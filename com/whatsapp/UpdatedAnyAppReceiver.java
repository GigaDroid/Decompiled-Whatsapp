package com.whatsapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.gcm.RegistrationIntentService;
import com.whatsapp.gcm.b;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class UpdatedAnyAppReceiver extends BroadcastReceiver {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\u001e\u0018K\u0002x\u001a\u0018LGs\u001e\u0012I\u0003r\r\u000e\\Ge\u0004\u001c\\Gr\u0003\u0010\u0006\u0010y\r\t[\u0006a\u001c]_\u0006bL\bX\u0003p\u0018\u0018L";
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
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 125;
                        break;
                    case at.i /*2*/:
                        i3 = 40;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    default:
                        i3 = 17;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0019\rL\u0006e\t\u0019I\u0017a\u001e\u0018K\u0002x\u001a\u0018ZHc\t\f]\u0002b\u0018PZ\u0002w\u001e\u0018[\u000f";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0019\rL\u0006e\t\u001cX\u0017c\t\u001eM\u000eg\t\u000f\u0007\u0014z\u0005\r\u0005\u0015t\n\u000fM\u0014y";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void a() {
        Log.i(z[0]);
        b bVar = new b(App.z());
        bVar.e();
        bVar.c();
        if (App.ay != null) {
            Log.i(z[2]);
            RegistrationIntentService.b(App.z());
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Log.i(z[1]);
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getData().getSchemeSpecificPart().equals(context.getPackageName())) {
            a();
        }
    }
}
