package com.whatsapp.gdrive;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.v;
import org.whispersystems.at;

class df implements HostnameVerifier {
    private static final String z;
    private final BrowserCompatHostnameVerifier a;

    static {
        char[] toCharArray = "=7Mu0%/]72+0S(y)/W".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 74;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 58;
                    break;
                case at.o /*3*/:
                    i2 = 91;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean verify(String str, SSLSession sSLSession) {
        return this.a.verify(z, sSLSession);
    }

    df() {
        this.a = new BrowserCompatHostnameVerifier();
    }
}
