package com.whatsapp;

import com.facebook.buck.android.support.exopackage.ExopackageApplication;
import org.v;
import org.whispersystems.at;

public class AppShell extends ExopackageApplication {
    private static final String z;

    static {
        char[] toCharArray = "Bj?8KId&e]Qu|WLQ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 33;
                    break;
                case at.g /*1*/:
                    i2 = 5;
                    break;
                case at.i /*2*/:
                    i2 = 82;
                    break;
                case at.o /*3*/:
                    i2 = 22;
                    break;
                default:
                    i2 = 60;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public AppShell() {
        super(z, 0);
    }
}
