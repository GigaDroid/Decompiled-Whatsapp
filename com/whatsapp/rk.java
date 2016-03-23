package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class rk implements Runnable {
    private static final String[] z;
    final String a;
    final boolean b;
    final ael c;

    static {
        String[] strArr = new String[4];
        String str = "b\"4\u007f|m#&\u007f";
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
                        i3 = 1;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = 85;
                        break;
                    case at.o /*3*/:
                        i3 = 11;
                        break;
                    default:
                        i3 = 35;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "`86cJw/1";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "l92xWn80$Bs)=bUde1bG!$:\u007f\u0003t:1jWdj";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "j/,TQd':\u007fF^ <o\u001e>";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    rk(ael com_whatsapp_ael, boolean z, String str) {
        this.c = com_whatsapp_ael;
        this.b = z;
        this.a = str;
    }

    public void run() {
        Throwable e;
        synchronized (ael.b(this.c)) {
            try {
                SQLiteDatabase writableDatabase = ael.b(this.c).getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(z[2], Boolean.valueOf(this.b));
                if (writableDatabase.update(z[0], contentValues, z[1], new String[]{this.a}) == 0) {
                    Log.e(z[3] + this.a);
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
}
