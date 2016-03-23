package com.whatsapp;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class lu extends l5 {
    private static final String[] z;

    static {
        String[] strArr = new String[10];
        String str = "\u0016\u001cizW\u001c";
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
                        i3 = 123;
                        break;
                    case at.g /*1*/:
                        i3 = 121;
                        break;
                    case at.i /*2*/:
                        i3 = 71;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0018\u0016)dF\u0018\r*qI\u001a\u001e\"b\b\b\u001c3`U\u0014\u001f.|B\u000b\u0011(dH\u0012\u001dhvF\u0012\u0015\"t";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0018\u0016*>P\u0013\u00183cF\u000b\t\u0018`U\u001e\u001f\"bB\u0015\u001a\"c";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u000b\u000b(vN\u0017\u001c\u0018`O\u0014\r(OS\u0013\f*rx\u0012\u001d";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u000b\u000b(vN\u0017\u001c\u0018`O\u0014\r(OA\u000e\u0015+ON\u001f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u000b\u000b(vN\u0017\u001c\u0018`O\u0014\r(OS\u0013\f*rx\u0012\u001d";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0018\u0016*>P\u0013\u00183cF\u000b\t\u0018`U\u001e\u001f\"bB\u0015\u001a\"c";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ";\nigO\u001a\r4qW\u000bW)uS";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u000b\u000b(vN\u0017\u001c\u0018`O\u0014\r(OA\u000e\u0015+ON\u001f";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean c(boolean z) {
        return false;
    }

    public File x() {
        return new File(App.z().getFilesDir(), z[0]);
    }

    public File r() {
        return l5.d(z[1]);
    }

    public void c(int i, int i2) {
        this.c = i;
        this.o = i2;
        Editor edit = App.z().getSharedPreferences(z[3], 0).edit();
        edit.putInt(z[4], i2);
        edit.putInt(z[5], i);
        if (!edit.commit()) {
            Log.e(z[2]);
        }
    }

    protected InputStream a(boolean z) {
        return null;
    }

    public lu() {
        super(App.ad() + z[8]);
        SharedPreferences sharedPreferences = App.z().getSharedPreferences(z[7], 0);
        this.o = sharedPreferences.getInt(z[6], 0);
        this.c = sharedPreferences.getInt(z[9], 0);
    }
}
