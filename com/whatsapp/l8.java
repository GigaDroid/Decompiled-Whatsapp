package com.whatsapp;

public class l8 extends lp {
    public int c(int i) {
        int i2 = i % 100;
        if (i == 1) {
            return 2;
        }
        if (i == 0 || (i2 >= 2 && i2 <= 10)) {
            return 8;
        }
        if (i2 < 11 || i2 > 19) {
            return 0;
        }
        return 16;
    }
}
