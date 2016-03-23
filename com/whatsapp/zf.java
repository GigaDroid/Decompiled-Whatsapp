package com.whatsapp;

import android.support.annotation.NonNull;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.v;
import org.whispersystems.at;
import org.whispersystems.aw;

public class zf extends InputStream {
    private static final String[] z;
    private InputStream a;
    private final ad5 b;
    private final Cipher c;
    private final Mac d;

    static {
        String[] strArr = new String[5];
        String str = "0yo7\r\u001ewh|O\u0001qqrN";
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
                        i3 = 114;
                        break;
                    case at.g /*1*/:
                        i3 = 24;
                        break;
                    case at.i /*2*/:
                        i3 = 11;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 111;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "0yo7\"3[*";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "!lyr\u000e\u001f8~y\n\nhnt\u001b\u0017|gnO\u0011tdd\n\u00169";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "!lyr\u000e\u001f8~y\n\nhnt\u001b\u0017|gnO\u0011tdd\n\u00169";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "0yo7\u001f\u0013|o~\u0001\u00159";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void a(InputStream inputStream, byte[] bArr, int i, int i2) {
        int i3 = vq.d;
        int i4 = 0;
        while (i4 < i2) {
            int read = inputStream.read(bArr, i + i4, i2 - i4);
            if (read == -1) {
                throw new IOException(z[4]);
            }
            i4 += read;
            if (i3 != 0) {
                return;
            }
        }
    }

    public int read(@NonNull byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read;
        do {
            read = read(bArr, 0, bArr.length);
            if (read == -1) {
                return -1;
            }
        } while (read == 0);
        return bArr[0];
    }

    private int b(byte[] bArr, int i, int i2) {
        return this.a != null ? this.a.read(bArr, i, i2) : -1;
    }

    private int a() {
        try {
            byte[] bArr = new byte[10];
            a(this.b, bArr, 0, bArr.length);
            if (MessageDigest.isEqual(bArr, aw.d(this.d.doFinal(), 10))) {
                this.a = new ByteArrayInputStream(this.c.doFinal());
                return 0;
            }
            throw new IOException(z[2]);
        } catch (Throwable e) {
            Log.c(e);
            throw new IOException(z[0]);
        } catch (Throwable e2) {
            Log.c(e2);
            throw new IOException(z[1]);
        }
    }

    public int read(@NonNull byte[] bArr, int i, int i2) {
        int b = b(bArr, i, i2);
        if (b > 0) {
            return b;
        }
        if (this.b.b() == zc.DATA_REMAINING) {
            return a(bArr, i, i2);
        }
        if (this.b.b() == zc.MAC_REMAINING) {
            return a();
        }
        return -1;
    }

    private int a(byte[] bArr, int i, int i2) {
        int read = this.b.read(bArr, i, (int) Math.min(this.b.a(), (long) i2));
        if (read == -1) {
            throw new IOException(z[3]);
        }
        this.d.update(bArr, i, read);
        Object update = this.c.update(bArr, i, read);
        if (update != null && update.length > i2) {
            byte[][] c = aw.c(update, i2, update.length - i2);
            System.arraycopy(c[0], 0, bArr, i, c[0].length);
            this.a = new ByteArrayInputStream(c[1]);
            return c[0].length;
        } else if (update == null) {
            return 0;
        } else {
            System.arraycopy(update, 0, bArr, i, update.length);
            return update.length;
        }
    }

    public zf(InputStream inputStream, vq vqVar, long j) {
        int i = vq.d;
        this.a = null;
        this.b = new ad5(inputStream, new ad2(j), null);
        this.c = mt.a(vqVar.b(), vqVar.a(), 2);
        this.d = mt.a(vqVar.b(), vqVar.d());
        if (WAAppCompatActivity.c != 0) {
            vq.d = i + 1;
        }
    }

    public void close() {
        this.b.close();
    }
}
