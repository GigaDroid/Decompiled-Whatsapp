package com.whatsapp.gdrive;

import android.support.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.v;
import org.whispersystems.at;

final class a1 implements ThreadFactory {
    private static final String z;
    private final AtomicInteger a;

    static {
        char[] toCharArray = "yi3\u0016\u0011[&\u0018\u0003\u0014Hc|&\u0012Lm9\u0003]\u001d".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 62;
                    break;
                case at.g /*1*/:
                    i2 = 6;
                    break;
                case at.i /*2*/:
                    i2 = 92;
                    break;
                case at.o /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Thread newThread(@NonNull Runnable runnable) {
        return new Thread(new d4(this, runnable), z + this.a.getAndIncrement());
    }

    a1() {
        this.a = new AtomicInteger(1);
    }
}
