package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import org.v;
import org.whispersystems.at;

class l1 implements Runnable {
    private static final String[] z;
    final ael a;
    final boolean b;

    static {
        String[] strArr = new String[2];
        String str = ">g;\u001c^)p<";
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
                        i3 = 95;
                        break;
                    case at.g /*1*/:
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = 88;
                        break;
                    case at.o /*3*/:
                        i3 = 116;
                        break;
                    default:
                        i3 = 55;
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
                    str = "<}9\u0000h3|+\u0000";
                    obj = null;
            }
        }
    }

    l1(ael com_whatsapp_ael, boolean z) {
        this.a = com_whatsapp_ael;
        this.b = z;
    }

    public void run() {
        synchronized (ael.b(this.a)) {
            SQLiteDatabase writableDatabase = ael.b(this.a).getWritableDatabase();
            ContentValues contentValues = new ContentValues(1);
            contentValues.put(z[0], Boolean.valueOf(this.b));
            writableDatabase.update(z[1], contentValues, null, null);
        }
    }
}
