package com.google;

import java.lang.reflect.Field;

enum fF extends eg {
    fF(String str, int i) {
        super(str, i, null);
    }

    public String translateName(Field field) {
        return eg.a(eg.a(field.getName(), " "));
    }
}
