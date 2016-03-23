package com.whatsapp.gcm.experiment;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.v;
import org.whispersystems.at;

public class c extends SQLiteOpenHelper {
    public static final String a;
    private static final String[] z;

    public static String a(int i) {
        return z[1] + i;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean z = d.d;
        sQLiteDatabase.execSQL(z[0]);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(z[2]);
        onCreate(sQLiteDatabase);
    }

    public c(Context context) {
        super(context, a, null, 1);
    }

    static {
        String[] strArr = new String[3];
        String str = "j\u0011N\u0017-lc_\u0017;e\u0006+8\u001c]4d$\u0012v7b;\u001cE*e3Y\u0001\u001cb2Y`\r_\u0013>l\u0011+\u0006+`\u000eJ\u0004 \t\bN\u000fYh\u0016_\u00190g\u0000Y\u00134l\r_v7f\u0017+\u0018,e\u000f'\"\u0010D&x\"\u0018D3+\u001a6g\u0004'v\u000bL\"x9\u0017\t\nE\u0002<n\u0006Y\u007f";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 41;
                        break;
                    case at.g /*1*/:
                        i4 = 67;
                        break;
                    case at.i /*2*/:
                        i4 = 11;
                        break;
                    case at.o /*3*/:
                        i4 = 86;
                        break;
                    default:
                        i4 = 121;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "m\u0011D\u0006Y}\u0002I\u001a<\t\nMv<q\nX\u0002*\t-n\"\u000eF1`\t\r@.n:\u0010G&";
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    a = a(1);
                    return;
                default:
                    strArr2[i2] = str;
                    str = "g&\u007f!\u0016[(_?\u0014L/b8\u001c\u0007'ix";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
