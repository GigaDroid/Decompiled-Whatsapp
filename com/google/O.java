package com.google;

public final class O {
    static String b(hh hhVar, fn fnVar, String str) {
        return a(hhVar, fnVar, str);
    }

    private static String a(hh hhVar, fn fnVar, String str) {
        if (fnVar != null) {
            return fnVar.a() + '.' + str;
        }
        return hhVar.c().length() > 0 ? hhVar.c() + '.' + str : str;
    }
}
