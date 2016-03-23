package android.support.v4.os;

import org.v;
import org.whispersystems.at;

public class AsyncTaskCompat {
    private static final String z;

    static {
        char[] toCharArray = "\u0005=rD\u0005\u0012=o\u000fK\u001e(!M@Q2tCI".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 113;
                    break;
                case at.g /*1*/:
                    i2 = 92;
                    break;
                case at.i /*2*/:
                    i2 = 1;
                    break;
                case at.o /*3*/:
                    i2 = 47;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.AsyncTask executeParallel(android.os.AsyncTask r2, java.lang.Object[] r3) {
        /*
        if (r2 != 0) goto L_0x000c;
    L_0x0002:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x000a }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x000a }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x000a }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x000a }
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalArgumentException -> 0x001d }
        r1 = 11;
        if (r0 < r1) goto L_0x0019;
    L_0x0012:
        android.support.v4.os.AsyncTaskCompatHoneycomb.executeParallel(r2, r3);	 Catch:{ IllegalArgumentException -> 0x001f }
        r0 = android.support.v4.os.CancellationSignal.a;	 Catch:{ IllegalArgumentException -> 0x001f }
        if (r0 == 0) goto L_0x001c;
    L_0x0019:
        r2.execute(r3);	 Catch:{ IllegalArgumentException -> 0x001f }
    L_0x001c:
        return r2;
    L_0x001d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.os.AsyncTaskCompat.executeParallel(android.os.AsyncTask, java.lang.Object[]):android.os.AsyncTask");
    }
}
