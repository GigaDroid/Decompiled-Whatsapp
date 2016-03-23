package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import org.v;
import org.whispersystems.at;

class zl implements Runnable {
    private static final String[] z;
    final adl a;
    final String b;
    final ael c;

    static {
        String[] strArr = new String[7];
        String str = "bLhq";
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
                        i3 = 5;
                        break;
                    case at.g /*1*/:
                        i3 = 38;
                        break;
                    case at.i /*2*/:
                        i3 = 1;
                        break;
                    case at.o /*3*/:
                        i3 = 21;
                        break;
                    default:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "bLhqZ:\u0006`{\u0003%LhqZ:";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "uCoq\u000ekA";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "bTn`\u0017ZV`g\u0013lEhe\u0006kRr";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    str = "dBl|\t";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "bTn`\u0017ZV`g\u0013lEhe\u0006kRr";
                    obj = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "oOe";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    zl(ael com_whatsapp_ael, String str, adl com_whatsapp_adl) {
        this.c = com_whatsapp_ael;
        this.b = str;
        this.a = com_whatsapp_adl;
    }

    public void run() {
        int i = 1;
        synchronized (ael.b(this.c)) {
            int i2;
            SQLiteDatabase writableDatabase = ael.b(this.c).getWritableDatabase();
            ContentValues contentValues = new ContentValues(4);
            contentValues.put(z[0], this.b);
            contentValues.put(z[1], this.a.a() ? "" : this.a.e);
            String str = z[5];
            if (this.a.d) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            contentValues.put(str, Integer.valueOf(i2));
            String str2 = z[3];
            if (!this.a.b) {
                i = 0;
            }
            contentValues.put(str2, Integer.valueOf(i));
            if (writableDatabase.update(z[4], contentValues, z[2], new String[]{this.b, this.a.e}) == 0) {
                writableDatabase.insert(z[6], null, contentValues);
            }
        }
    }
}
