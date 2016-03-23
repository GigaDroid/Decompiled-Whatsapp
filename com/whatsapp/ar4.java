package com.whatsapp;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class ar4 implements Runnable {
    private static final String[] z;
    final int a;
    final ael b;
    final String c;

    static {
        String[] strArr = new String[3];
        String str = ")\u001bY/67\u0011g%67";
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
                        i3 = 68;
                        break;
                    case at.g /*1*/:
                        i3 = 98;
                        break;
                    case at.i /*2*/:
                        i3 = 6;
                        break;
                    case at.o /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 83;
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
                    str = "/\u0007\u007f\u001d!!\u000fi66\u001b\bo&n{";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "'\ng6\f(\u000bu6";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        Throwable e;
        synchronized (ael.b(this.b)) {
            try {
                SQLiteDatabase writableDatabase = ael.b(this.b).getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(z[0], Integer.valueOf(this.a));
                writableDatabase.update(z[1], contentValues, z[2], new String[]{this.c});
            } catch (Throwable e2) {
                Log.a(e2);
                this.b.r();
                throw new AssertionError(e2);
            } catch (RuntimeException e3) {
                e2 = e3;
                Log.a(e2);
                throw e2;
            } catch (Error e4) {
                e2 = e4;
                Log.a(e2);
                throw e2;
            }
        }
    }

    ar4(ael com_whatsapp_ael, int i, String str) {
        this.b = com_whatsapp_ael;
        this.a = i;
        this.c = str;
    }
}
