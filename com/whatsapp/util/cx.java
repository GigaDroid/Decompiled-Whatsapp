package com.whatsapp.util;

import android.support.annotation.NonNull;
import com.whatsapp.arj;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import org.v;
import org.whispersystems.at;

final class cx implements ThreadFactory {
    private static final String z;
    private final AtomicInteger a;

    static {
        char[] toCharArray = "\u0005k\r{l\u0013s\u001c/H=q\u0007jmr ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 82;
                    break;
                case at.g /*1*/:
                    i2 = 3;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.o /*3*/:
                    i2 = 15;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Thread newThread(@NonNull Runnable runnable) {
        return new Thread(new j(this, runnable), z + this.a.getAndIncrement());
    }

    cx() {
        this.a = new AtomicInteger(1);
    }
}
