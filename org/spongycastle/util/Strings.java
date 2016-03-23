package org.spongycastle.util;

import com.whatsapp.arj;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.v;
import org.whispersystems.at;

public final class Strings {
    private static String LINE_SEPARATOR;
    private static final String[] z;

    final class 1 implements PrivilegedAction {
        private static final String z;

        static {
            char[] toCharArray = ":\f9\\\u007f%\u0000'X#7\u00118K".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 86;
                        break;
                    case at.g /*1*/:
                        i2 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.i /*2*/:
                        i2 = 87;
                        break;
                    case at.o /*3*/:
                        i2 = 57;
                        break;
                    default:
                        i2 = 81;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public Object run() {
            return run();
        }

        1() {
        }

        public String m1044run() {
            return System.getProperty(z);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void toUTF8ByteArray(char[] r5, java.io.OutputStream r6) {
        /*
        r3 = org.spongycastle.util.Pack.a;
        r0 = 0;
    L_0x0003:
        r1 = r5.length;
        if (r0 >= r1) goto L_0x00a8;
    L_0x0006:
        r2 = r5[r0];
        r1 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        if (r2 >= r1) goto L_0x0011;
    L_0x000c:
        r6.write(r2);	 Catch:{ IllegalStateException -> 0x0041 }
        if (r3 == 0) goto L_0x00a4;
    L_0x0011:
        r1 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;
        if (r2 >= r1) goto L_0x0025;
    L_0x0015:
        r1 = r2 >> 6;
        r1 = r1 | 192;
        r6.write(r1);	 Catch:{ IllegalStateException -> 0x0045 }
        r1 = r2 & 63;
        r1 = r1 | 128;
        r6.write(r1);	 Catch:{ IllegalStateException -> 0x0045 }
        if (r3 == 0) goto L_0x00a4;
    L_0x0025:
        r1 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r1) goto L_0x00ab;
    L_0x002a:
        r1 = 57343; // 0xdfff float:8.0355E-41 double:2.8331E-319;
        if (r2 > r1) goto L_0x00ab;
    L_0x002f:
        r1 = r0 + 1;
        r4 = r5.length;	 Catch:{ IllegalStateException -> 0x003f }
        if (r1 < r4) goto L_0x004b;
    L_0x0034:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x003f }
        r1 = z;	 Catch:{ IllegalStateException -> 0x003f }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x003f }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x003f }
        throw r0;	 Catch:{ IllegalStateException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x003f }
    L_0x004b:
        r0 = r0 + 1;
        r1 = r5[r0];
        r4 = 56319; // 0xdbff float:7.892E-41 double:2.78253E-319;
        if (r2 <= r4) goto L_0x0061;
    L_0x0054:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x005f }
        r1 = z;	 Catch:{ IllegalStateException -> 0x005f }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x005f }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x005f }
        throw r0;	 Catch:{ IllegalStateException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r2 = r2 & 1023;
        r2 = r2 << 10;
        r4 = r1 & 1023;
        r2 = r2 | r4;
        r4 = 65536; // 0x10000 float:9.18355E-41 double:3.2379E-319;
        r2 = r2 + r4;
        r4 = r2 >> 18;
        r4 = r4 | 240;
        r6.write(r4);	 Catch:{ IllegalStateException -> 0x00a9 }
        r4 = r2 >> 12;
        r4 = r4 & 63;
        r4 = r4 | 128;
        r6.write(r4);	 Catch:{ IllegalStateException -> 0x00a9 }
        r4 = r2 >> 6;
        r4 = r4 & 63;
        r4 = r4 | 128;
        r6.write(r4);	 Catch:{ IllegalStateException -> 0x00a9 }
        r2 = r2 & 63;
        r2 = r2 | 128;
        r6.write(r2);	 Catch:{ IllegalStateException -> 0x00a9 }
        if (r3 == 0) goto L_0x00a4;
    L_0x008d:
        r2 = r1 >> 12;
        r2 = r2 | 224;
        r6.write(r2);	 Catch:{ IllegalStateException -> 0x00a9 }
        r2 = r1 >> 6;
        r2 = r2 & 63;
        r2 = r2 | 128;
        r6.write(r2);	 Catch:{ IllegalStateException -> 0x00a9 }
        r1 = r1 & 63;
        r1 = r1 | 128;
        r6.write(r1);	 Catch:{ IllegalStateException -> 0x00a9 }
    L_0x00a4:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0003;
    L_0x00a8:
        return;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r1 = r2;
        goto L_0x008d;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.util.Strings.toUTF8ByteArray(char[], java.io.OutputStream):void");
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new IllegalStateException(z[0]);
        }
    }

    public static String toUpperCase(String str) {
        int i = 0;
        int i2 = Pack.a;
        char[] toCharArray = str.toCharArray();
        int i3 = 0;
        while (i != toCharArray.length) {
            char c = toCharArray[i];
            if ('a' <= c && 'z' >= c) {
                i3 = 1;
                toCharArray[i] = (char) ((c - 97) + 65);
            }
            i++;
            if (i2 != 0) {
                break;
            }
        }
        if (i3 == 0) {
            return str;
        }
        try {
            return new String(toCharArray);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static String lineSeparator() {
        return LINE_SEPARATOR;
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[3];
        char[] toCharArray = "M*2\u000ezZk9\u000evA/9@fZ95\u000er\u000e?3@wW?9@t\\9=\u00194".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 46;
                    break;
                case at.g /*1*/:
                    i2 = 75;
                    break;
                case at.i /*2*/:
                    i2 = 92;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "G%*\u0001yG/|5AhfmV5M$8\u0005eA\"2\u0014".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 46;
                    break;
                case at.g /*1*/:
                    i2 = 75;
                    break;
                case at.i /*2*/:
                    i2 = 92;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "G%*\u0001yG/|5AhfmV5M$8\u0005eA\"2\u0014".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 46;
                    break;
                case at.g /*1*/:
                    i2 = 75;
                    break;
                case at.i /*2*/:
                    i2 = 92;
                    break;
                case at.o /*3*/:
                    i2 = 96;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        z = strArr;
        try {
            LINE_SEPARATOR = (String) AccessController.doPrivileged(new 1());
        } catch (Exception e) {
            try {
                toCharArray = "\u000b%".toCharArray();
                int length2 = toCharArray.length;
                cArr = toCharArray;
                for (length = 0; length2 > length; length++) {
                    char c3 = cArr[length];
                    switch (length % 5) {
                        case v.m /*0*/:
                            i2 = 46;
                            break;
                        case at.g /*1*/:
                            i2 = 75;
                            break;
                        case at.i /*2*/:
                            i2 = 92;
                            break;
                        case at.o /*3*/:
                            i2 = 96;
                            break;
                        default:
                            i2 = 21;
                            break;
                    }
                    cArr[length] = (char) (i2 ^ c3);
                }
                LINE_SEPARATOR = String.format(new String(cArr).intern(), new Object[0]);
            } catch (Exception e2) {
                LINE_SEPARATOR = "\n";
            }
        }
    }
}
