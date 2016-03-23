package com.whatsapp;

public class lb extends lp {
    public int c(int i) {
        int i2 = i % 100;
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        if (i2 >= 3 && i2 <= 10) {
            return 8;
        }
        if (i2 < 11 || i2 > 99) {
            return 0;
        }
        return 16;
    }
}
