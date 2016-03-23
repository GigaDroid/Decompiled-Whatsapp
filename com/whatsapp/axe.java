package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class axe implements Runnable {
    private static final String[] z;
    final String a;
    final long b;
    final ael c;

    static {
        String[] strArr = new String[5];
        String str = "DnG\u0012^JfQ9IpaW)\u0011\u0010";
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
                        i3 = 47;
                        break;
                    case at.g /*1*/:
                        i3 = 11;
                        break;
                    case at.i /*2*/:
                        i3 = 62;
                        break;
                    case at.o /*3*/:
                        i3 = 77;
                        break;
                    default:
                        i3 = 44;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "CjM9s]n_)s]n](E_\u007fa>IA\u007fa I\\x_*Ip\u007f_/@JTW)";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Lc_9sCbM9";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "Lc_9sCbM9";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "DnG\u0012^JfQ9IpaW)";
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
                SQLiteDatabase writableDatabase = ael.b(this.c).getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(z[2], Long.valueOf(this.b));
                if (writableDatabase.update(z[4], contentValues, z[0], new String[]{this.a}) == 0) {
                    contentValues.put(z[1], this.a);
                    writableDatabase.insert(z[3], null, contentValues);
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
    }

    axe(ael com_whatsapp_ael, long j, String str) {
        this.c = com_whatsapp_ael;
        this.b = j;
        this.a = str;
    }
}
