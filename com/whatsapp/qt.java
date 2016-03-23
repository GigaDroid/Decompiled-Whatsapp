package com.whatsapp;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import org.v;
import org.whispersystems.at;

public class qt {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "\nS#b/\u0010Z#c\u0003,U#s\u0018\u0016R\u001df\u0011\u001fC'O\u0000\u0001S$";
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
                        i3 = 115;
                        break;
                    case at.g /*1*/:
                        i3 = 54;
                        break;
                    case at.i /*2*/:
                        i3 = 66;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 112;
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
                    str = "\u0010Y/>\u0007\u001bW6c\u0011\u0003F\u001d`\u0002\u0016P'b\u0015\u001dU'c";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\nS#b/\u0010Z#c\u0003,U#s\u0018\u0016R\u001df\u0011\u001fC'O\u0000\u0001S$";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static int b() {
        long b = (long) awm.b();
        if (b == -1) {
            return -1;
        }
        if (b <= 528000) {
            return 2008;
        }
        if (b <= 620000) {
            return 2009;
        }
        if (b <= 1020000) {
            return 2010;
        }
        if (b <= 1220000) {
            return 2011;
        }
        if (b <= 1520000) {
            return 2012;
        }
        return b <= 2020000 ? 2013 : 2014;
    }

    private static int a() {
        int a = awm.a();
        if (a < 1) {
            return -1;
        }
        if (a == 1) {
            return 2008;
        }
        return a <= 3 ? 2011 : 2012;
    }

    public static int a(Context context) {
        boolean z = awm.b;
        SharedPreferences sharedPreferences = context.getSharedPreferences(z[2], 0);
        int i = sharedPreferences.getInt(z[0], -1);
        if (i == -1) {
            i = c(context);
            sharedPreferences.edit().putInt(z[1], i).commit();
            return i;
        } else if (!z) {
            return i;
        } else {
            WAAppCompatActivity.c++;
            return i;
        }
    }

    private static int c(Context context) {
        ArrayList arrayList = new ArrayList();
        a(arrayList, a());
        a(arrayList, b());
        a(arrayList, b(context));
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        if ((arrayList.size() & 1) == 1) {
            return ((Integer) arrayList.get(arrayList.size() / 2)).intValue();
        }
        int size = (arrayList.size() / 2) - 1;
        return ((((Integer) arrayList.get(size + 1)).intValue() - ((Integer) arrayList.get(size)).intValue()) / 2) + ((Integer) arrayList.get(size)).intValue();
    }

    private static void a(ArrayList arrayList, int i) {
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    private static int b(Context context) {
        long a = awm.a(context);
        if (a <= 0) {
            return -1;
        }
        if (a <= 201326592) {
            return 2008;
        }
        if (a <= 304087040) {
            return 2009;
        }
        if (a <= 536870912) {
            return 2010;
        }
        if (a <= 1073741824) {
            return 2011;
        }
        if (a <= 1610612736) {
            return 2012;
        }
        return a <= 2147483648L ? 2013 : 2014;
    }
}
