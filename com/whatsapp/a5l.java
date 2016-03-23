package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a5l implements Runnable {
    private static final String[] z;
    final int a;
    final ael b;
    final String c;

    static {
        String[] strArr = new String[7];
        String str = "mx\u0011\u001d\",l\u0019\u0019/bh\u0010\u00002,x\u001c\u000b'np\u0010\u001cfay\u0006\u000b'kyNX,exH";
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
                        i3 = 12;
                        break;
                    case at.g /*1*/:
                        i3 = 28;
                        break;
                    case at.i /*2*/:
                        i3 = 117;
                        break;
                    case at.o /*3*/:
                        i3 = 120;
                        break;
                    default:
                        i3 = 70;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "|p\u0014\u0011(xy\r\f\u0019hu\u0006\u0019$`y\u0011";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "hu\u0006\u0019$`y\u0011X6`}\u001c\u00162id\u0001X%d}\u0001Cffu\u0011E";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "gy\f'4iq\u001a\f#Sv\u001c\u001c{3";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "7<\u001b\r+^s\u0002\u000b{";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "ot\u0014\f\u0019`u\u0006\f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "7<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a5l(ael com_whatsapp_ael, int i, String str) {
        this.b = com_whatsapp_ael;
        this.a = i;
        this.c = str;
    }

    public void run() {
        synchronized (ael.b(this.b)) {
            SQLiteDatabase writableDatabase = ael.b(this.b).getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues();
                contentValues.put(z[2], Integer.valueOf(this.a));
                int update = writableDatabase.update(z[6], contentValues, z[4], new String[]{this.c});
                Log.i(z[3] + this.c + z[5] + update + z[1] + this.a);
                if (update > 0) {
                    if (App.aZ() && ((!qm.i(this.c) || qm.h(this.c)) && this.b.m(this.c) != null)) {
                        co a = qm.a(this.c);
                        ael.b(this.b, a);
                        ael.a(this.b, -1, a);
                        Log.i(z[0] + this.c);
                    }
                    App.c(this.c);
                }
                writableDatabase.setTransactionSuccessful();
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
            } catch (Throwable th) {
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
            }
        }
    }
}
