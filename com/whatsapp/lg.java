package com.whatsapp;

public class lg extends lp {
    public int c(int i) {
        boolean z = lp.a;
        int i2 = i % 100;
        int i3 = i % 10;
        if (i3 == 1 && (i2 < 11 || i2 > 19)) {
            return 2;
        }
        if (i3 >= 2 && i3 <= 9 && (i2 < 11 || i2 > 19)) {
            return 8;
        }
        if (!z) {
            return 0;
        }
        WAAppCompatActivity.c++;
        return 0;
    }
}
