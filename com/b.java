package com;

import android.os.Build;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;
import org.v;
import org.whispersystems.at;

public final class b extends SecureRandomSpi {
    private static OutputStream a;
    private static final File c;
    private static DataInputStream d;
    private static final Object e;
    private static final String[] z;
    private boolean b;

    private OutputStream b() {
        OutputStream outputStream;
        synchronized (e) {
            if (a == null) {
                a = new FileOutputStream(c);
            }
            outputStream = a;
        }
        return outputStream;
    }

    static {
        String[] strArr = new String[7];
        String str = "B\u0007H$H`FU'\rk\u0016D&\r";
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
                        i3 = 4;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 33;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 45;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "B\u0007H$H`FU'\rv\u0003@,\rb\u0014N%\r";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "q\b@*AaFU'\rw\u0003D,\rT4o\u000f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "w\u0007L;Xj\u0001";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "`\u0003W!NaFH;\ri\u0007O=Ke\u0005U=_a\u0002\u0001*T$5@%^q\bFs\rq\b@*AaFU'\rw\u0003D,\rT4o\u000f\rb\u000fM-\r";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "+\u0002D>\u0002q\u0014@&Ik\u000b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new File(z[6]);
                    e = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    str = "$\u0000N:\rv\u0003@,Dj\u0001";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }

    private DataInputStream a() {
        DataInputStream dataInputStream;
        synchronized (e) {
            if (d == null) {
                try {
                    d = new DataInputStream(new FileInputStream(c));
                } catch (Throwable e) {
                    throw new SecurityException(z[0] + c + z[1], e);
                }
            }
            dataInputStream = d;
        }
        return dataInputStream;
    }

    protected void engineSetSeed(byte[] bArr) {
        try {
            if (z[4].equalsIgnoreCase(Build.MANUFACTURER)) {
                Log.w(z[5] + c);
                this.b = true;
                return;
            }
            try {
                OutputStream b;
                synchronized (e) {
                    b = b();
                }
                b.write(bArr);
                b.flush();
                this.b = true;
            } catch (Throwable e) {
                Log.c(z[3], e);
            }
        } catch (IOException e2) {
            throw e2;
        }
    }

    protected void engineNextBytes(byte[] bArr) {
        boolean z = a.b;
        try {
            if (!this.b) {
                engineSetSeed(a.b());
            }
            try {
                DataInputStream a;
                synchronized (e) {
                    a = a();
                }
                synchronized (a) {
                    a.readFully(bArr);
                }
                if (z) {
                    WAAppCompatActivity.c++;
                }
            } catch (Throwable e) {
                throw new SecurityException(z[2] + c, e);
            }
        } catch (IOException e2) {
            throw e2;
        }
    }
}
