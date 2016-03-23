package com.whatsapp.util;

import java.io.Writer;
import org.v;
import org.whispersystems.at;

public class bp extends Writer {
    private static final String z;
    StringBuilder a;

    static {
        char[] toCharArray = "xC$\u001d\u0006".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 52;
                    break;
                case at.g /*1*/:
                    i2 = 15;
                    break;
                case at.i /*2*/:
                    i2 = 123;
                    break;
                case at.o /*3*/:
                    i2 = 89;
                    break;
                default:
                    i2 = 38;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void write(String str, int i, int i2) {
        if (Log.h() >= 4) {
            this.a.append(str, i, i2);
        }
    }

    public void flush() {
        if (Log.h() >= 4) {
            Log.c(4, Log.b(z, this.a.toString()));
            this.a = new StringBuilder();
        }
    }

    public void write(int i) {
        if (Log.h() >= 4) {
            this.a.append((char) i);
        }
    }

    public void close() {
        this.a = null;
    }

    public void write(char[] cArr, int i, int i2) {
        if (Log.h() >= 4) {
            this.a.append(cArr, i, i2);
        }
    }

    public bp() {
        this.a = new StringBuilder();
    }
}
