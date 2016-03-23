package com.whatsapp;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class z6 implements ActivityLifecycleCallbacks {
    private static final String[] z;
    final App a;

    static {
        String[] strArr = new String[7];
        String str = "k\u001dO553\u0017h\b'1\u0013O\u00051\u0016\u0006@\u00121";
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
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = 114;
                        break;
                    case at.i /*2*/:
                        i3 = 33;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    default:
                        i3 = 84;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "k\u001dO416\u0007L\u0003";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "k\u001dO650\u0001D";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "k\u001dO5 *\u0002";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "k\u001dO%& \u0013U\u0003";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "k\u001dO5 $\u0000U";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "k\u001dO\"16\u0006S\t-";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onActivityDestroyed(Activity activity) {
        a(activity, z[1]);
    }

    private void a(Activity activity, String str) {
        if (!(activity instanceof DialogToastActivity) && !(activity instanceof DialogToastPreferenceActivity)) {
            Log.i(activity.getClass().getName() + str);
        }
    }

    public void onActivityPaused(Activity activity) {
        a(activity, z[3]);
    }

    public void onActivityStopped(Activity activity) {
        a(activity, z[4]);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(activity, z[0]);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        a(activity, z[5]);
    }

    public void onActivityResumed(Activity activity) {
        a(activity, z[2]);
    }

    z6(App app) {
        this.a = app;
    }

    public void onActivityStarted(Activity activity) {
        a(activity, z[6]);
    }
}
