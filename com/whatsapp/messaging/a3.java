package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import org.v;
import org.whispersystems.at;

abstract class a3 extends SSLSocketFactory {
    private static final String[] z;
    private SSLSocketFactory a;
    private final SSLContext b;

    static {
        String[] strArr = new String[5];
        String str = "j$on08,wa2j+l}\u007f+3b`3+'ol\u007f,*q)\f\u0019\t@f1> {}ej";
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
                        i3 = 74;
                        break;
                    case at.g /*1*/:
                        i3 = 69;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 95;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001e\tP";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0019\u0016O\u007fl";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u0019\u0016O";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0004*#b1%2m)>&\"l{6>-n)><$je>()f)+%es{0<,gl\u007f\u0019\u0016O),%&hl+9";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected abstract SSLSocketFactory a(SSLContext sSLContext);

    public Socket createSocket(String str, int i) {
        return a().createSocket(str, i);
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a().createSocket(inetAddress, i, inetAddress2, i2);
    }

    public String[] getSupportedCipherSuites() {
        return a().getSupportedCipherSuites();
    }

    protected a3() {
        SSLContext a = a(a(a(null, z[2]), z[3]), z[4]);
        if (a == null) {
            Throwable noSuchAlgorithmException = new NoSuchAlgorithmException(z[1]);
            Log.a(noSuchAlgorithmException);
            throw new RuntimeException(noSuchAlgorithmException);
        }
        this.b = a;
    }

    public Socket createSocket() {
        return a().createSocket();
    }

    public Socket createSocket(InetAddress inetAddress, int i) {
        return a().createSocket(inetAddress, i);
    }

    private synchronized SSLSocketFactory a() {
        try {
            if (this.a == null) {
                this.a = a(this.b);
            }
        } catch (RuntimeException e) {
            throw e;
        }
        return this.a;
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a().createSocket(socket, str, i, z);
    }

    private static SSLContext a(SSLContext sSLContext, String str) {
        if (sSLContext == null) {
            try {
                sSLContext = SSLContext.getInstance(str);
            } catch (NoSuchAlgorithmException e) {
                Log.w(str + z[0] + e);
            }
        }
        return sSLContext;
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a().createSocket(str, i, inetAddress, i2);
    }

    public String[] getDefaultCipherSuites() {
        return a().getDefaultCipherSuites();
    }
}
