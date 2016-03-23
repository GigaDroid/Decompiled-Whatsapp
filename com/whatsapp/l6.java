package com.whatsapp;

public class l6 extends lp {
    public int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i % 10 != 1 || i % 100 == 11) {
            return 0;
        }
        return 2;
    }
}
