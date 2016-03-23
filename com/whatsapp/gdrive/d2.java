package com.whatsapp.gdrive;

import com.whatsapp.util.Log;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.protocol.HttpContext;
import org.v;
import org.whispersystems.at;

class d2 implements HttpRequestInterceptor {
    private static final String[] z;
    private final int a;
    private int b;

    static {
        String[] strArr = new String[2];
        String str = "W(3. Ua 7?\u001f>$6#U?5j?^8$55U<5($\u001f<3(5U?2h:U\"&3>\u001f";
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
                        i3 = 48;
                        break;
                    case at.g /*1*/:
                        i3 = 76;
                        break;
                    case at.i /*2*/:
                        i3 = 65;
                        break;
                    case at.o /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "W(3. Ua3\"'E)23{Y\"5\"$S)139Bc159S)24yB)023C8l.%\u001d\".3{Qa657@<$5v";
                    obj = null;
            }
        }
    }

    public d2(int i) {
        this.a = i;
    }

    public void b() {
        this.b = 0;
    }

    public int a() {
        return this.b;
    }

    static int a(d2 d2Var) {
        return d2Var.a;
    }

    public void process(HttpRequest httpRequest, HttpContext httpContext) {
        this.b++;
        if (httpRequest instanceof EntityEnclosingRequestWrapper) {
            HttpEntity entity = ((EntityEnclosingRequestWrapper) httpRequest).getEntity();
            if (entity != null) {
                long contentLength = entity.getContentLength();
                if (contentLength <= 0) {
                    Log.e(z[0] + contentLength);
                    return;
                }
                ((EntityEnclosingRequestWrapper) httpRequest).setEntity(new c6(this, entity));
                if (!GoogleDriveService.c) {
                    return;
                }
            }
            return;
        }
        if (!(httpRequest instanceof RequestWrapper)) {
            Log.e(z[1] + httpRequest);
        }
    }
}
