package com.whatsapp;

public class mi extends lp {
    public int c(int i) {
        int i2 = i % 100;
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 < 3 || i2 > 4) {
            return 0;
        }
        return 8;
    }
}
