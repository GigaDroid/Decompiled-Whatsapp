package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;
import org.v;
import org.whispersystems.at;

class ar implements HttpResponseInterceptor {
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[5];
        String str = "iOBY\u007fs^G\\4rO";
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
                        i3 = 1;
                        break;
                    case at.g /*1*/:
                        i3 = 59;
                        break;
                    case at.i /*2*/:
                        i3 = 54;
                        break;
                    case at.o /*3*/:
                        i3 = 41;
                        break;
                    default:
                        i3 = 81;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "iOBY\u007fs^G\\4rO";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "f_D@'d\u0016DL\"qTXZ4,RX]4sXSY%nI\u0019Y#nXSZ\".WSG6uS\u0019";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "f_D@'d\u0016DL\"qTXZ4,RX]4sXSY%nI\u0019Y#nXSZ\".ISZ!nUEL|vRBA>tO\u001bL?uRBP|`UR\u0004#dJCL\"u\u0016_Z|oNZE";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ".ISX$dHB\u00048r\u0016X\\=m";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static int a(ar arVar) {
        return arVar.a;
    }

    public ar(int i) {
        this.a = i;
    }

    public void process(HttpResponse httpResponse, HttpContext httpContext) {
        if (httpResponse.getEntity() != null) {
            long contentLength = httpResponse.getEntity().getContentLength();
            if (contentLength > 0) {
                httpResponse.setEntity(new cj(this, httpResponse.getEntity()));
            } else if (((RequestWrapper) httpContext.getAttribute(z[0])) == null) {
                Log.e(z[3] + contentLength + z[1]);
            }
        } else if (((RequestWrapper) httpContext.getAttribute(z[2])) == null) {
            Log.e(z[4]);
        }
    }
}
