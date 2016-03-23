package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v7.app.AlertDialog.Builder;
import com.whatsapp.util.Log;
import java.util.Date;
import org.v;
import org.whispersystems.at;

public class pg {
    private static final int[] a;
    private static final String[] z;

    public static int a(Context context) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        SharedPreferences sharedPreferences = context.getSharedPreferences(z[4], 0);
        long j = sharedPreferences.getLong(z[0], 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (86400000 + j > currentTimeMillis) {
            Log.i(z[1]);
            return -1;
        }
        Date ar = App.ar();
        int a = a(currentTimeMillis, ar);
        int a2 = a(j, ar);
        int[] iArr = a;
        int length = iArr.length;
        while (i < length) {
            int i2 = iArr[i];
            if (a > i2 || a2 <= i2) {
                i++;
                if (z) {
                    return -1;
                }
            }
            Editor edit = sharedPreferences.edit();
            edit.putLong(z[3], currentTimeMillis);
            if (!edit.commit()) {
                Log.e(z[2]);
            }
            return a;
        }
        return -1;
    }

    static {
        String[] strArr = new String[5];
        String str = "^ %\u0012ZL=&9HU?*\u0014LY&,\brA.0\u0012rZ.1\bHI";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 45;
                        break;
                    case at.g /*1*/:
                        i4 = 79;
                        break;
                    case at.i /*2*/:
                        i4 = 67;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_checkboxStyle;
                        break;
                    default:
                        i4 = 45;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "^ %\u0012ZL=&IHU?*\u0014LY&,\b\u0002K.*\nHI\u00100\u0007[H\u0010/\u0007^Y\u00104\u0007_C";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "^ %\u0012ZL=&9HU?*\u0014LY&,\brA.0\u0012rZ.1\bHI";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "N .HZE.7\u0015L]?\u001c\u0016_H)&\u0014HC,&\u0015";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    switch (App.am) {
                        case v.m /*0*/:
                            a = new int[]{1, 2, 3, 5, 14, 30};
                            return;
                        case at.g /*1*/:
                            a = new int[]{1, 2, 3, 7};
                            return;
                        default:
                            a = new int[]{1, 2, 3};
                            return;
                    }
                default:
                    strArr2[i2] = str;
                    str = "^ %\u0012ZL=&IHU?*\u0014LY&,\b\u0002^:3\u0016_H<0I\u001f\u0019'";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static Dialog a(Activity activity) {
        int a = a(System.currentTimeMillis(), App.ar());
        return new Builder(activity).setTitle(2131232041).setMessage(String.format(App.az.a(2131296318, a), new Object[]{Integer.valueOf(a)})).setPositiveButton(2131232188, new aw6(activity)).setNegativeButton(2131230884, new a3z(activity)).create();
    }

    private static int a(long j, Date date) {
        return ((int) ((date.getTime() - j) / 86400000)) + 1;
    }
}
