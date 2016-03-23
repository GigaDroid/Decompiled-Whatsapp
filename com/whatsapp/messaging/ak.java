package com.whatsapp.messaging;

import com.whatsapp.util.Log;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

final class ak extends a3 {
    private static ak c;
    private static final TrustManager[] d;

    protected SSLSocketFactory a(SSLContext sSLContext) {
        try {
            sSLContext.init(null, d, null);
            return sSLContext.getSocketFactory();
        } catch (Throwable e) {
            Log.a(e);
            throw new RuntimeException(e);
        }
    }

    static {
        d = new TrustManager[]{new b0()};
        c = new ak();
    }

    public static ak a() {
        return c;
    }

    ak() {
    }
}
