package com.whatsapp;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.io.File;
import org.v;
import org.whispersystems.at;

final class ow implements DatabaseErrorHandler {
    private static final String z;
    final File a;

    static {
        char[] toCharArray = "#1p\u0018\t!0rD\u0014 6r\f\u000f'6n\b\u0015+!|D\u0018<0x\u0019P&#y\u000f\u0011+08\b\u0012<0b\u001b\tc&uK".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 78;
                    break;
                case at.g /*1*/:
                    i2 = 66;
                    break;
                case at.i /*2*/:
                    i2 = 23;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        Log.i(z + this.a);
    }

    ow(File file) {
        this.a = file;
    }
}
