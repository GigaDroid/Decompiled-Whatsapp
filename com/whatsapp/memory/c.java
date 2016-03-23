package com.whatsapp.memory;

import android.app.ActivityManager;
import android.content.Context;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class c {
    public static int a;
    private static long b;
    private static final String z;

    static {
        char[] toCharArray = ":*\u0018s|2=\u0015".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 91;
                    break;
                case at.g /*1*/:
                    i2 = 73;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.o /*3*/:
                    i2 = 26;
                    break;
                default:
                    i2 = 10;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        b = -1;
    }

    public static long a() {
        return b;
    }

    public static long a(Context context) {
        int i = a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(z);
        b = (long) activityManager.getMemoryClass();
        long memoryClass = (long) activityManager.getMemoryClass();
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
        return memoryClass;
    }
}
