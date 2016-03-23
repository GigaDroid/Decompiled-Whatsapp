package org.whispersystems;

public class am {
    private static final char[] a;

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i, int i2) {
        boolean z = aw.a;
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = 0;
        while (i3 < i2) {
            a(stringBuffer, bArr[i + i3]);
            stringBuffer.append(" ");
            i3++;
            if (z) {
                break;
            }
        }
        return stringBuffer.toString();
    }

    static {
        a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    private static void a(StringBuffer stringBuffer, int i) {
        stringBuffer.append(a[(i >> 4) & 15]);
        stringBuffer.append(a[i & 15]);
    }
}
