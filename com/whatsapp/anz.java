package com.whatsapp;

import android.support.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import org.v;
import org.whispersystems.at;

final class anz implements ThreadFactory {
    private static final String z;

    static {
        char[] toCharArray = "\u000e\nsD\f;\u001e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 79;
                    break;
                case at.g /*1*/:
                    i2 = 114;
                    break;
                case at.i /*2*/:
                    i2 = 28;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 99;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    anz() {
    }

    public Thread newThread(@NonNull Runnable runnable) {
        return new Thread(new a4q(this, runnable), z);
    }
}
