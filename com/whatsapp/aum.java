package com.whatsapp;

import android.database.sqlite.SQLiteDatabase;
import org.v;
import org.whispersystems.at;

class aum implements Runnable {
    private static final String[] z;
    final String a;
    final ael b;
    final String c;

    static {
        String[] strArr = new String[2];
        String str = "l\u0019rB;T\u001b|E?b\btG*e\u001fn";
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
                        i3 = 11;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 29;
                        break;
                    case at.o /*3*/:
                        i3 = 55;
                        break;
                    default:
                        i3 = 75;
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
                    str = "l\u0001tSv4K|Y/+\u0001tSv4";
                    obj = null;
            }
        }
    }

    public void run() {
        synchronized (ael.b(this.b)) {
            SQLiteDatabase writableDatabase = ael.b(this.b).getWritableDatabase();
            String[] strArr = new String[2];
            strArr[0] = this.a;
            strArr[1] = App.as.d(this.c) ? "" : this.c;
            writableDatabase.delete(z[0], z[1], strArr);
        }
    }

    aum(ael com_whatsapp_ael, String str, String str2) {
        this.b = com_whatsapp_ael;
        this.a = str;
        this.c = str2;
    }
}
