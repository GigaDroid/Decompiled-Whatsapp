package com.whatsapp.gdrive;

import android.support.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.v;
import org.whispersystems.at;

final class d1 implements ThreadFactory {
    private static final String z;
    private final AtomicInteger a;

    static {
        char[] toCharArray = "{f&\teY)\r\u001c`Jli-aYj\"\u001d|Q)\n\u000fe_|%\u000f}Uf'N^S{\"\u000b{\u001c*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 60;
                    break;
                case at.g /*1*/:
                    i2 = 9;
                    break;
                case at.i /*2*/:
                    i2 = 73;
                    break;
                case at.o /*3*/:
                    i2 = 110;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    d1() {
        this.a = new AtomicInteger(1);
    }

    public Thread newThread(@NonNull Runnable runnable) {
        return new Thread(new b3(this, runnable), z + this.a.getAndIncrement());
    }
}
