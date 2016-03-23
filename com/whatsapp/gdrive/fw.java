package com.whatsapp.gdrive;

import java.io.ByteArrayInputStream;
import org.apache.http.impl.io.AbstractSessionInputBuffer;
import org.apache.http.params.HttpParams;
import org.v;
import org.whispersystems.at;

class fw extends AbstractSessionInputBuffer {
    private static final String z;
    final ByteArrayInputStream a;
    final HttpParams b;
    final bc c;

    static {
        char[] toCharArray = "\tt#\u0018^*k;]Z\"u#]S".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 71;
                    break;
                case at.g /*1*/:
                    i2 = 27;
                    break;
                case at.i /*2*/:
                    i2 = 87;
                    break;
                case at.o /*3*/:
                    i2 = 56;
                    break;
                default:
                    i2 = 55;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    fw(bc bcVar, ByteArrayInputStream byteArrayInputStream, HttpParams httpParams) {
        this.c = bcVar;
        this.a = byteArrayInputStream;
        this.b = httpParams;
        init(this.a, 100, this.b);
    }

    public boolean isDataAvailable(int i) {
        throw new UnsupportedOperationException(z);
    }
}
