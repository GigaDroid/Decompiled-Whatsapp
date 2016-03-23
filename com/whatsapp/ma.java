package com.whatsapp;

public class ma extends lp {
    public int c(int i) {
        int i2 = i % 100;
        if (i == 1) {
            return 2;
        }
        if (i == 0 || (i2 >= 1 && i2 <= 19)) {
            return 8;
        }
        return 0;
    }
}
