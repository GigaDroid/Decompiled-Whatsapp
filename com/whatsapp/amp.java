package com.whatsapp;

import android.os.Process;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.v;
import org.whispersystems.at;

public class amp {
    private static volatile Method a;
    private static final int[] b;
    private static volatile boolean c;
    private static final String d;
    private static final String z;

    private static Method b() {
        if (!c) {
            a = a();
            c = true;
        }
        return a;
    }

    private static Method a() {
        try {
            return Process.class.getMethod(z, new Class[]{String.class, int[].class, String[].class, long[].class, float[].class});
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    private amp() {
    }

    public static boolean a(String str, int[] iArr, String[] strArr, long[] jArr, float[] fArr) {
        Method b = b();
        if (b == null) {
            return false;
        }
        try {
            Object invoke = b.invoke(null, new Object[]{str, iArr, strArr, jArr, fArr});
            if (invoke == null) {
                return false;
            }
            return ((Boolean) invoke).booleanValue();
        } catch (IllegalAccessException e) {
            return false;
        } catch (InvocationTargetException e2) {
            return false;
        }
    }

    public static String a(String str) {
        boolean z = false;
        boolean z2 = tp.d;
        String[] strArr = new String[]{null};
        a(str, b, strArr, null, null);
        String str2 = strArr[0];
        if (WAAppCompatActivity.c != 0) {
            if (!z2) {
                z = true;
            }
            tp.d = z;
        }
        return str2;
    }

    static {
        char[] toCharArray = "<nKth<dIVQ\"n".toCharArray();
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
                    i2 = 11;
                    break;
                case at.i /*2*/:
                    i2 = 42;
                    break;
                case at.o /*3*/:
                    i2 = 16;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        d = amp.class.getSimpleName();
        b = new int[]{4096};
        a = null;
        c = false;
    }
}
