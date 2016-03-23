package com.whatsapp;

import android.os.Looper;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class auv {
    private static final String[] z;

    static {
        String[] strArr = new String[2];
        String str = "~}\u000bnQi5\u0006~\u001d\u007f`\n;Tc5\u0011r\u001d`t\ru\u001dy}\u0016~\\i";
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
                        i3 = 13;
                        break;
                    case at.g /*1*/:
                        i3 = 21;
                        break;
                    case at.i /*2*/:
                        i3 = 100;
                        break;
                    case at.o /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 61;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "~}\u000bnQi5\ntI-w\u0001;Ox{DrS-x\u0005rS-a\fiXlq";
                    obj = null;
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    return bArr;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        throw new IllegalArgumentException();
    }

    public static void a(String str) {
        a(false, str);
    }

    public static void a() {
        try {
            boolean z;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            a(z, z[0]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static void a(boolean z, String str) {
        if (!z) {
            try {
                if (App.am >= 3) {
                    throw new AssertionError(str);
                }
                Log.e(str);
            } catch (NullPointerException e) {
                throw e;
            }
        }
    }

    public static void b() {
        try {
            boolean z;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            a(z, z[1]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static CharSequence a(CharSequence charSequence) {
        try {
            if (!TextUtils.isEmpty(charSequence)) {
                return charSequence;
            }
            throw new IllegalArgumentException();
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
