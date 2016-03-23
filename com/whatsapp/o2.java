package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class o2 implements Runnable {
    private static final String[] z;
    final long a;
    final String b;
    final ael c;

    static {
        String[] strArr = new String[5];
        String str = "yltC/vmfC";
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
                        i3 = 26;
                        break;
                    case at.g /*1*/:
                        i3 = 4;
                        break;
                    case at.i /*2*/:
                        i3 = 21;
                        break;
                    case at.o /*3*/:
                        i3 = 55;
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
                    str = "vefC/hatS/wafD\u0011}aJC\u0011xhph\u0019~";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "qalh\u0002\u007fizC\u0015En|S";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "yltC/vmfC";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "qalh\u0002\u007fizC\u0015En|SM%";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        Throwable e;
        synchronized (ael.b(this.c)) {
            try {
                if (((a5w) ael.c(this.c).get(this.b)) != null) {
                    SQLiteDatabase writableDatabase = ael.b(this.c).getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(z[2], Long.valueOf(this.a));
                    if (writableDatabase.update(z[0], contentValues, z[1], new String[]{this.b}) == 0) {
                        contentValues.put(z[3], this.b);
                        writableDatabase.insert(z[4], null, contentValues);
                    }
                }
            } catch (SQLiteDatabaseCorruptException e2) {
                throw e2;
            } catch (RuntimeException e3) {
                e = e3;
                Log.a(e);
                throw e;
            } catch (Error e4) {
                e = e4;
                Log.a(e);
                throw e;
            } catch (Throwable e5) {
                Log.a(e5);
                this.c.r();
                throw new AssertionError(e5);
            }
        }
        ael.e(this.c).a(this.b, this.c.C(this.b));
    }

    o2(ael com_whatsapp_ael, String str, long j) {
        this.c = com_whatsapp_ael;
        this.b = str;
        this.a = j;
    }
}
