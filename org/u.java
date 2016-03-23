package org;

import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.protocol.b6;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import org.whispersystems.at;
import org.whispersystems.aw;

public class u extends FilterOutputStream {
    private static final String z;

    static {
        char[] toCharArray = "\u007f\u0015\u0014wko\u001b\u000f6'z\u0006\u0007sko\u001b@a9r\u0000\u0005-kw\u0011\u000eq?sI".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 27;
                    break;
                case at.g /*1*/:
                    i2 = 116;
                    break;
                case at.i /*2*/:
                    i2 = 96;
                    break;
                case at.o /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public u(OutputStream outputStream) {
        super(outputStream);
    }

    public void write(byte[] bArr, int i, int i2) {
        int i3 = ak.a;
        if (i2 >= 16777216) {
            throw new b6(z + i2);
        }
        this.out.write(aw.b(i2));
        this.out.write(bArr, i, i2);
        if (i3 != 0) {
            WAAppCompatActivity.c++;
        }
    }

    public void write(int i) {
        int i2 = ak.a;
        write(new byte[]{(byte) i});
        if (WAAppCompatActivity.c != 0) {
            ak.a = i2 + 1;
        }
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
