package com.whatsapp.util;

import android.os.Build.VERSION;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class c2 {
    private static final String[] z;
    private final File a;

    static {
        String[] strArr = new String[11];
        String str = "\r\\&9\u001fNL\n+\rCJ0x";
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
                        i3 = 34;
                        break;
                    case at.g /*1*/:
                        i3 = 41;
                        break;
                    case at.i /*2*/:
                        i3 = 85;
                        break;
                    case at.o /*3*/:
                        i3 = 88;
                        break;
                    default:
                        i3 = 125;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\rO'=\u0018}Z%9\u001eG\t";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "PF:,]O\\&,]LF!x\u001fG\t;-\u0011N";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "PF:,]O\\&,]@Lu9]F@'=\u001eVF'!";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\rE&x\u0019";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\rE&xP";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "GD%,\u0004\u0002O<4\u0018\u0002E<+\t\u0002O'7\u0010\u0002M<*\u0018A]:*\u0004\u0002";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0002]:,\u001cN\t";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\rE&x\u0019";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\rL-;\u0018R]<7\u0013\u0002";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\r]:,\u001cNv&(\u001cALu";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public c2(File file) {
        if (file == null) {
            throw new NullPointerException(z[3]);
        }
        try {
            if (file.isDirectory()) {
                this.a = file;
                return;
            }
            throw new IllegalArgumentException(z[4]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static void a(int i, String str, File file) {
        try {
            new c2(file).a(i, str);
        } catch (Exception e) {
            Log.w(str + z[10] + e);
        }
    }

    private static long b(int i, String str, File file) {
        int i2 = Log.h;
        String a = a(file);
        if (file.isDirectory()) {
            Log.b(i, str + z[9] + a + ' ' + file.getAbsolutePath());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                try {
                    throw new IllegalStateException(z[7] + file);
                } catch (NullPointerException e) {
                    throw e;
                }
            }
            int length = listFiles.length;
            long j = 0;
            int i3 = 0;
            while (i3 < length) {
                j += b(i, str, listFiles[i3]);
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            Log.b(i, str + z[5] + a + ' ' + file.getAbsolutePath() + z[8] + j);
            return j;
        }
        Log.b(i, str + z[6] + a + ' ' + file.getAbsolutePath() + ' ' + file.length());
        return file.length();
    }

    private static String a(File file) {
        char[] cArr = new char[]{'-', '-'};
        try {
            if (file.canRead()) {
                cArr[0] = 'r';
            }
            try {
                if (file.canWrite()) {
                    cArr[1] = 'w';
                }
                return new String(cArr);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public void a(int i, String str) {
        try {
            if (VERSION.SDK_INT >= 9) {
                Log.b(i, str + z[1] + this.a.getTotalSpace());
                Log.b(i, str + z[0] + this.a.getUsableSpace());
                Log.b(i, str + z[2] + this.a.getFreeSpace());
            }
            b(i, str, this.a);
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
