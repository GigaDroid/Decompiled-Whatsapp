package org;

import java.io.IOException;
import java.io.InputStream;
import org.whispersystems.at;
import org.whispersystems.aw;

public class ak {
    public static int a;
    private static final String z;
    private final InputStream b;

    static {
        char[] toCharArray = "\u0001{\u0013b`&7\u001etc-e\u00191w'v\u00181f-z\f}`6r\u00180".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 66;
                    break;
                case at.g /*1*/:
                    i2 = 23;
                    break;
                case at.i /*2*/:
                    i2 = 124;
                    break;
                case at.o /*3*/:
                    i2 = 17;
                    break;
                default:
                    i2 = 5;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public ak(InputStream inputStream) {
        this.b = inputStream;
    }

    private int b() {
        byte[] bArr = new byte[3];
        a(bArr);
        return aw.a(bArr, 0);
    }

    private byte[] a(int i) {
        byte[] bArr = new byte[i];
        a(bArr);
        return bArr;
    }

    private void a(byte[] bArr) {
        int i = a;
        int i2 = 0;
        int length = bArr.length;
        while (length > 0) {
            int read = this.b.read(bArr, i2, length);
            if (read == -1) {
                throw new IOException(z);
            }
            i2 += read;
            length -= read;
            if (i != 0) {
                return;
            }
        }
    }

    public byte[] a() {
        return a(b());
    }
}
