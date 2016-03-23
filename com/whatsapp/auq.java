package com.whatsapp;

import java.util.Date;

public class auq {
    private static int a;

    static {
        a = -1;
    }

    public static int a() {
        if (a < 0) {
            a = b();
        }
        return a;
    }

    private static int b() {
        if (App.p.F()) {
            return 120;
        }
        return (int) ((new Date(System.currentTimeMillis()).getTime() - new Date(as7.a.getTime() - 10368000000L).getTime()) / 86400000);
    }
}
